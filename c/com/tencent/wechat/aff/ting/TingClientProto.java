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
import com.tencent.wechat.aff.ting.TingProto;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class TingClientProto {

    /* renamed from: com.tencent.wechat.aff.ting.TingClientProto$1 */
    public static /* synthetic */ class C243121 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69816xa1df5c61;

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
                f69816xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69816xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69816xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69816xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69816xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69816xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69816xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.ting.TingClientProto.C243121.<clinit>():void");
        }
    }

    public static final class DiscoverCacheInfo extends C23861l0<DiscoverCacheInfo, Builder> implements DiscoverCacheInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final DiscoverCacheInfo DEFAULT_INSTANCE;
        public static final int DISCOVERINFO_FIELD_NUMBER = 1;
        private static volatile C24062w1<DiscoverCacheInfo> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 2;
        private int bitField0_;
        private TingProto.MMListenDiscoverResponse discoverInfo_;
        private byte memoizedIsInitialized = 2;
        private long time_;

        public static final class Builder extends C23861l0.C23862a<DiscoverCacheInfo, Builder> implements DiscoverCacheInfoOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearDiscoverInfo() {
                copyOnWrite();
                ((DiscoverCacheInfo) this.instance).clearDiscoverInfo();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((DiscoverCacheInfo) this.instance).clearTime();
                return this;
            }

            public TingProto.MMListenDiscoverResponse getDiscoverInfo() {
                return ((DiscoverCacheInfo) this.instance).getDiscoverInfo();
            }

            public long getTime() {
                return ((DiscoverCacheInfo) this.instance).getTime();
            }

            public boolean hasDiscoverInfo() {
                return ((DiscoverCacheInfo) this.instance).hasDiscoverInfo();
            }

            public boolean hasTime() {
                return ((DiscoverCacheInfo) this.instance).hasTime();
            }

            public Builder mergeDiscoverInfo(TingProto.MMListenDiscoverResponse mMListenDiscoverResponse) {
                copyOnWrite();
                ((DiscoverCacheInfo) this.instance).mergeDiscoverInfo(mMListenDiscoverResponse);
                return this;
            }

            public Builder setDiscoverInfo(TingProto.MMListenDiscoverResponse mMListenDiscoverResponse) {
                copyOnWrite();
                ((DiscoverCacheInfo) this.instance).setDiscoverInfo(mMListenDiscoverResponse);
                return this;
            }

            public Builder setTime(long j) {
                copyOnWrite();
                ((DiscoverCacheInfo) this.instance).setTime(j);
                return this;
            }

            private Builder() {
                super(DiscoverCacheInfo.DEFAULT_INSTANCE);
            }

            public Builder setDiscoverInfo(TingProto.MMListenDiscoverResponse.Builder builder) {
                copyOnWrite();
                ((DiscoverCacheInfo) this.instance).setDiscoverInfo((TingProto.MMListenDiscoverResponse) builder.build());
                return this;
            }
        }

        static {
            DiscoverCacheInfo discoverCacheInfo = new DiscoverCacheInfo();
            DEFAULT_INSTANCE = discoverCacheInfo;
            C23861l0.registerDefaultInstance(DiscoverCacheInfo.class, discoverCacheInfo);
        }

        private DiscoverCacheInfo() {
        }

        /* access modifiers changed from: private */
        public void clearDiscoverInfo() {
            this.discoverInfo_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearTime() {
            this.bitField0_ &= -3;
            this.time_ = 0;
        }

        public static DiscoverCacheInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDiscoverInfo(TingProto.MMListenDiscoverResponse mMListenDiscoverResponse) {
            mMListenDiscoverResponse.getClass();
            TingProto.MMListenDiscoverResponse mMListenDiscoverResponse2 = this.discoverInfo_;
            if (mMListenDiscoverResponse2 == null || mMListenDiscoverResponse2 == TingProto.MMListenDiscoverResponse.getDefaultInstance()) {
                this.discoverInfo_ = mMListenDiscoverResponse;
            } else {
                this.discoverInfo_ = (TingProto.MMListenDiscoverResponse) ((TingProto.MMListenDiscoverResponse.Builder) TingProto.MMListenDiscoverResponse.newBuilder(this.discoverInfo_).mergeFrom(mMListenDiscoverResponse)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiscoverCacheInfo parseDelimitedFrom(InputStream inputStream) {
            return (DiscoverCacheInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoverCacheInfo parseFrom(ByteBuffer byteBuffer) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<DiscoverCacheInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDiscoverInfo(TingProto.MMListenDiscoverResponse mMListenDiscoverResponse) {
            mMListenDiscoverResponse.getClass();
            this.discoverInfo_ = mMListenDiscoverResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setTime(long j) {
            this.bitField0_ |= 2;
            this.time_ = j;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဃ\u0001", new Object[]{"bitField0_", "discoverInfo_", "time_"});
                case 3:
                    return new DiscoverCacheInfo();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<DiscoverCacheInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (DiscoverCacheInfo.class) {
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

        public TingProto.MMListenDiscoverResponse getDiscoverInfo() {
            TingProto.MMListenDiscoverResponse mMListenDiscoverResponse = this.discoverInfo_;
            return mMListenDiscoverResponse == null ? TingProto.MMListenDiscoverResponse.getDefaultInstance() : mMListenDiscoverResponse;
        }

        public long getTime() {
            return this.time_;
        }

        public boolean hasDiscoverInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DiscoverCacheInfo discoverCacheInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(discoverCacheInfo);
        }

        public static DiscoverCacheInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DiscoverCacheInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DiscoverCacheInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static DiscoverCacheInfo parseFrom(C16994k kVar) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static DiscoverCacheInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static DiscoverCacheInfo parseFrom(byte[] bArr) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiscoverCacheInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static DiscoverCacheInfo parseFrom(InputStream inputStream) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiscoverCacheInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DiscoverCacheInfo parseFrom(C23856l lVar) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static DiscoverCacheInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (DiscoverCacheInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface DiscoverCacheInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingProto.MMListenDiscoverResponse getDiscoverInfo();

        long getTime();

        boolean hasDiscoverInfo();

        boolean hasTime();

        /* synthetic */ boolean isInitialized();
    }

    public enum PlayerEvent implements C23908o0.C23911c {
        unknown(0),
        Prepare(1),
        Ready(2),
        PlayStart(3),
        PlayEnd(4),
        Pause(5),
        Resume(6),
        BufferStart(7),
        BufferEnd(8),
        SeekStart(9),
        SeekEnd(10),
        Stop(11),
        Error(12),
        Preempted(13);
        
        public static final int BufferEnd_VALUE = 8;
        public static final int BufferStart_VALUE = 7;
        public static final int Error_VALUE = 12;
        public static final int Pause_VALUE = 5;
        public static final int PlayEnd_VALUE = 4;
        public static final int PlayStart_VALUE = 3;
        public static final int Preempted_VALUE = 13;
        public static final int Prepare_VALUE = 1;
        public static final int Ready_VALUE = 2;
        public static final int Resume_VALUE = 6;
        public static final int SeekEnd_VALUE = 10;
        public static final int SeekStart_VALUE = 9;
        public static final int Stop_VALUE = 11;
        private static final C23908o0.C23912d<PlayerEvent> internalValueMap = null;
        public static final int unknown_VALUE = 0;
        private final int value;

        public static final class PlayerEventVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new PlayerEventVerifier();
            }

            private PlayerEventVerifier() {
            }

            public boolean isInRange(int i) {
                return PlayerEvent.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<PlayerEvent>() {
                public PlayerEvent findValueByNumber(int i) {
                    return PlayerEvent.forNumber(i);
                }
            };
        }

        private PlayerEvent(int i) {
            this.value = i;
        }

        public static PlayerEvent forNumber(int i) {
            switch (i) {
                case 0:
                    return unknown;
                case 1:
                    return Prepare;
                case 2:
                    return Ready;
                case 3:
                    return PlayStart;
                case 4:
                    return PlayEnd;
                case 5:
                    return Pause;
                case 6:
                    return Resume;
                case 7:
                    return BufferStart;
                case 8:
                    return BufferEnd;
                case 9:
                    return SeekStart;
                case 10:
                    return SeekEnd;
                case 11:
                    return Stop;
                case 12:
                    return Error;
                case 13:
                    return Preempted;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<PlayerEvent> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return PlayerEventVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PlayerEvent valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum PlayerInfoEvent implements C23908o0.C23911c {
        OnlineInfoUpdate(1),
        PlayRateChanged(2),
        PlayingItemReplaced(3),
        StartPlayingItemReplace(4),
        AudioReady(5),
        EndPlayingItemReplace(6);
        
        public static final int AudioReady_VALUE = 5;
        public static final int EndPlayingItemReplace_VALUE = 6;
        public static final int OnlineInfoUpdate_VALUE = 1;
        public static final int PlayRateChanged_VALUE = 2;
        public static final int PlayingItemReplaced_VALUE = 3;
        public static final int StartPlayingItemReplace_VALUE = 4;
        private static final C23908o0.C23912d<PlayerInfoEvent> internalValueMap = null;
        private final int value;

        public static final class PlayerInfoEventVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new PlayerInfoEventVerifier();
            }

            private PlayerInfoEventVerifier() {
            }

            public boolean isInRange(int i) {
                return PlayerInfoEvent.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<PlayerInfoEvent>() {
                public PlayerInfoEvent findValueByNumber(int i) {
                    return PlayerInfoEvent.forNumber(i);
                }
            };
        }

        private PlayerInfoEvent(int i) {
            this.value = i;
        }

        public static PlayerInfoEvent forNumber(int i) {
            switch (i) {
                case 1:
                    return OnlineInfoUpdate;
                case 2:
                    return PlayRateChanged;
                case 3:
                    return PlayingItemReplaced;
                case 4:
                    return StartPlayingItemReplace;
                case 5:
                    return AudioReady;
                case 6:
                    return EndPlayingItemReplace;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<PlayerInfoEvent> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return PlayerInfoEventVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PlayerInfoEvent valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum PlayerState implements C23908o0.C23911c {
        Idle(0),
        Playing(1),
        Loading(2),
        Paused(3);
        
        public static final int Idle_VALUE = 0;
        public static final int Loading_VALUE = 2;
        public static final int Paused_VALUE = 3;
        public static final int Playing_VALUE = 1;
        private static final C23908o0.C23912d<PlayerState> internalValueMap = null;
        private final int value;

        public static final class PlayerStateVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new PlayerStateVerifier();
            }

            private PlayerStateVerifier() {
            }

            public boolean isInRange(int i) {
                return PlayerState.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<PlayerState>() {
                public PlayerState findValueByNumber(int i) {
                    return PlayerState.forNumber(i);
                }
            };
        }

        private PlayerState(int i) {
            this.value = i;
        }

        public static PlayerState forNumber(int i) {
            if (i == 0) {
                return Idle;
            }
            if (i == 1) {
                return Playing;
            }
            if (i == 2) {
                return Loading;
            }
            if (i != 3) {
                return null;
            }
            return Paused;
        }

        public static C23908o0.C23912d<PlayerState> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return PlayerStateVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PlayerState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class TingAlbumShareObject extends C23861l0<TingAlbumShareObject, Builder> implements TingAlbumShareObjectOrBuilder {
        public static final int CATEGORYITEM_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TingAlbumShareObject DEFAULT_INSTANCE;
        private static volatile C24062w1<TingAlbumShareObject> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String categoryItem_ = "";
        private int type_;

        public static final class Builder extends C23861l0.C23862a<TingAlbumShareObject, Builder> implements TingAlbumShareObjectOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearCategoryItem() {
                copyOnWrite();
                ((TingAlbumShareObject) this.instance).clearCategoryItem();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TingAlbumShareObject) this.instance).clearType();
                return this;
            }

            public String getCategoryItem() {
                return ((TingAlbumShareObject) this.instance).getCategoryItem();
            }

            public C16994k getCategoryItemBytes() {
                return ((TingAlbumShareObject) this.instance).getCategoryItemBytes();
            }

            public int getType() {
                return ((TingAlbumShareObject) this.instance).getType();
            }

            public boolean hasCategoryItem() {
                return ((TingAlbumShareObject) this.instance).hasCategoryItem();
            }

            public boolean hasType() {
                return ((TingAlbumShareObject) this.instance).hasType();
            }

            public Builder setCategoryItem(String str) {
                copyOnWrite();
                ((TingAlbumShareObject) this.instance).setCategoryItem(str);
                return this;
            }

            public Builder setCategoryItemBytes(C16994k kVar) {
                copyOnWrite();
                ((TingAlbumShareObject) this.instance).setCategoryItemBytes(kVar);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((TingAlbumShareObject) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(TingAlbumShareObject.DEFAULT_INSTANCE);
            }
        }

        static {
            TingAlbumShareObject tingAlbumShareObject = new TingAlbumShareObject();
            DEFAULT_INSTANCE = tingAlbumShareObject;
            C23861l0.registerDefaultInstance(TingAlbumShareObject.class, tingAlbumShareObject);
        }

        private TingAlbumShareObject() {
        }

        /* access modifiers changed from: private */
        public void clearCategoryItem() {
            this.bitField0_ &= -3;
            this.categoryItem_ = getDefaultInstance().getCategoryItem();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static TingAlbumShareObject getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingAlbumShareObject parseDelimitedFrom(InputStream inputStream) {
            return (TingAlbumShareObject) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingAlbumShareObject parseFrom(ByteBuffer byteBuffer) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingAlbumShareObject> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCategoryItem(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.categoryItem_ = str;
        }

        /* access modifiers changed from: private */
        public void setCategoryItemBytes(C16994k kVar) {
            this.categoryItem_ = kVar.mo18752u();
            this.bitField0_ |= 2;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "type_", "categoryItem_"});
                case 3:
                    return new TingAlbumShareObject();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingAlbumShareObject> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingAlbumShareObject.class) {
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

        public String getCategoryItem() {
            return this.categoryItem_;
        }

        public C16994k getCategoryItemBytes() {
            return C16994k.m16791k(this.categoryItem_);
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasCategoryItem() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingAlbumShareObject tingAlbumShareObject) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingAlbumShareObject);
        }

        public static TingAlbumShareObject parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingAlbumShareObject) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingAlbumShareObject parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingAlbumShareObject parseFrom(C16994k kVar) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingAlbumShareObject parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingAlbumShareObject parseFrom(byte[] bArr) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingAlbumShareObject parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingAlbumShareObject parseFrom(InputStream inputStream) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingAlbumShareObject parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingAlbumShareObject parseFrom(C23856l lVar) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingAlbumShareObject parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingAlbumShareObject) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingAlbumShareObjectOrBuilder extends C23848k1 {
        String getCategoryItem();

        C16994k getCategoryItemBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getType();

        boolean hasCategoryItem();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingAudioPlayRecord extends C23861l0<TingAudioPlayRecord, Builder> implements TingAudioPlayRecordOrBuilder {
        /* access modifiers changed from: private */
        public static final TingAudioPlayRecord DEFAULT_INSTANCE;
        public static final int FINISHPLAYCOUNT_FIELD_NUMBER = 3;
        public static final int LASTPLAYTIME_FIELD_NUMBER = 2;
        public static final int LISTENID_FIELD_NUMBER = 1;
        private static volatile C24062w1<TingAudioPlayRecord> PARSER;
        private int bitField0_;
        private int finishPlayCount_;
        private double lastPlayTime_;
        private String listenId_ = "";

        public static final class Builder extends C23861l0.C23862a<TingAudioPlayRecord, Builder> implements TingAudioPlayRecordOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearFinishPlayCount() {
                copyOnWrite();
                ((TingAudioPlayRecord) this.instance).clearFinishPlayCount();
                return this;
            }

            public Builder clearLastPlayTime() {
                copyOnWrite();
                ((TingAudioPlayRecord) this.instance).clearLastPlayTime();
                return this;
            }

            public Builder clearListenId() {
                copyOnWrite();
                ((TingAudioPlayRecord) this.instance).clearListenId();
                return this;
            }

            public int getFinishPlayCount() {
                return ((TingAudioPlayRecord) this.instance).getFinishPlayCount();
            }

            public double getLastPlayTime() {
                return ((TingAudioPlayRecord) this.instance).getLastPlayTime();
            }

            public String getListenId() {
                return ((TingAudioPlayRecord) this.instance).getListenId();
            }

            public C16994k getListenIdBytes() {
                return ((TingAudioPlayRecord) this.instance).getListenIdBytes();
            }

            public boolean hasFinishPlayCount() {
                return ((TingAudioPlayRecord) this.instance).hasFinishPlayCount();
            }

            public boolean hasLastPlayTime() {
                return ((TingAudioPlayRecord) this.instance).hasLastPlayTime();
            }

            public boolean hasListenId() {
                return ((TingAudioPlayRecord) this.instance).hasListenId();
            }

            public Builder setFinishPlayCount(int i) {
                copyOnWrite();
                ((TingAudioPlayRecord) this.instance).setFinishPlayCount(i);
                return this;
            }

            public Builder setLastPlayTime(double d) {
                copyOnWrite();
                ((TingAudioPlayRecord) this.instance).setLastPlayTime(d);
                return this;
            }

            public Builder setListenId(String str) {
                copyOnWrite();
                ((TingAudioPlayRecord) this.instance).setListenId(str);
                return this;
            }

            public Builder setListenIdBytes(C16994k kVar) {
                copyOnWrite();
                ((TingAudioPlayRecord) this.instance).setListenIdBytes(kVar);
                return this;
            }

            private Builder() {
                super(TingAudioPlayRecord.DEFAULT_INSTANCE);
            }
        }

        static {
            TingAudioPlayRecord tingAudioPlayRecord = new TingAudioPlayRecord();
            DEFAULT_INSTANCE = tingAudioPlayRecord;
            C23861l0.registerDefaultInstance(TingAudioPlayRecord.class, tingAudioPlayRecord);
        }

        private TingAudioPlayRecord() {
        }

        /* access modifiers changed from: private */
        public void clearFinishPlayCount() {
            this.bitField0_ &= -5;
            this.finishPlayCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLastPlayTime() {
            this.bitField0_ &= -3;
            this.lastPlayTime_ = 0.0d;
        }

        /* access modifiers changed from: private */
        public void clearListenId() {
            this.bitField0_ &= -2;
            this.listenId_ = getDefaultInstance().getListenId();
        }

        public static TingAudioPlayRecord getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingAudioPlayRecord parseDelimitedFrom(InputStream inputStream) {
            return (TingAudioPlayRecord) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingAudioPlayRecord parseFrom(ByteBuffer byteBuffer) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingAudioPlayRecord> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFinishPlayCount(int i) {
            this.bitField0_ |= 4;
            this.finishPlayCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setLastPlayTime(double d) {
            this.bitField0_ |= 2;
            this.lastPlayTime_ = d;
        }

        /* access modifiers changed from: private */
        public void setListenId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.listenId_ = str;
        }

        /* access modifiers changed from: private */
        public void setListenIdBytes(C16994k kVar) {
            this.listenId_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003င\u0002", new Object[]{"bitField0_", "listenId_", "lastPlayTime_", "finishPlayCount_"});
                case 3:
                    return new TingAudioPlayRecord();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingAudioPlayRecord> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingAudioPlayRecord.class) {
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

        public int getFinishPlayCount() {
            return this.finishPlayCount_;
        }

        public double getLastPlayTime() {
            return this.lastPlayTime_;
        }

        public String getListenId() {
            return this.listenId_;
        }

        public C16994k getListenIdBytes() {
            return C16994k.m16791k(this.listenId_);
        }

        public boolean hasFinishPlayCount() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLastPlayTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasListenId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingAudioPlayRecord tingAudioPlayRecord) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingAudioPlayRecord);
        }

        public static TingAudioPlayRecord parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingAudioPlayRecord) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingAudioPlayRecord parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingAudioPlayRecord parseFrom(C16994k kVar) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingAudioPlayRecord parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingAudioPlayRecord parseFrom(byte[] bArr) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingAudioPlayRecord parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingAudioPlayRecord parseFrom(InputStream inputStream) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingAudioPlayRecord parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingAudioPlayRecord parseFrom(C23856l lVar) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingAudioPlayRecord parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingAudioPlayRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingAudioPlayRecordOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getFinishPlayCount();

        double getLastPlayTime();

        String getListenId();

        C16994k getListenIdBytes();

        boolean hasFinishPlayCount();

        boolean hasLastPlayTime();

        boolean hasListenId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingCategoryItem extends C23861l0<TingCategoryItem, Builder> implements TingCategoryItemOrBuilder {
        public static final int CATEGORYITEM_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final TingCategoryItem DEFAULT_INSTANCE;
        private static volatile C24062w1<TingCategoryItem> PARSER;
        private int bitField0_;
        private TingProto.MMListenCategoryItem categoryItem_;

        public static final class Builder extends C23861l0.C23862a<TingCategoryItem, Builder> implements TingCategoryItemOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearCategoryItem() {
                copyOnWrite();
                ((TingCategoryItem) this.instance).clearCategoryItem();
                return this;
            }

            public TingProto.MMListenCategoryItem getCategoryItem() {
                return ((TingCategoryItem) this.instance).getCategoryItem();
            }

            public boolean hasCategoryItem() {
                return ((TingCategoryItem) this.instance).hasCategoryItem();
            }

            public Builder mergeCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
                copyOnWrite();
                ((TingCategoryItem) this.instance).mergeCategoryItem(mMListenCategoryItem);
                return this;
            }

            public Builder setCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
                copyOnWrite();
                ((TingCategoryItem) this.instance).setCategoryItem(mMListenCategoryItem);
                return this;
            }

            private Builder() {
                super(TingCategoryItem.DEFAULT_INSTANCE);
            }

            public Builder setCategoryItem(TingProto.MMListenCategoryItem.Builder builder) {
                copyOnWrite();
                ((TingCategoryItem) this.instance).setCategoryItem((TingProto.MMListenCategoryItem) builder.build());
                return this;
            }
        }

        static {
            TingCategoryItem tingCategoryItem = new TingCategoryItem();
            DEFAULT_INSTANCE = tingCategoryItem;
            C23861l0.registerDefaultInstance(TingCategoryItem.class, tingCategoryItem);
        }

        private TingCategoryItem() {
        }

        /* access modifiers changed from: private */
        public void clearCategoryItem() {
            this.categoryItem_ = null;
            this.bitField0_ &= -2;
        }

        public static TingCategoryItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
            mMListenCategoryItem.getClass();
            TingProto.MMListenCategoryItem mMListenCategoryItem2 = this.categoryItem_;
            if (mMListenCategoryItem2 == null || mMListenCategoryItem2 == TingProto.MMListenCategoryItem.getDefaultInstance()) {
                this.categoryItem_ = mMListenCategoryItem;
            } else {
                this.categoryItem_ = (TingProto.MMListenCategoryItem) ((TingProto.MMListenCategoryItem.Builder) TingProto.MMListenCategoryItem.newBuilder(this.categoryItem_).mergeFrom(mMListenCategoryItem)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingCategoryItem parseDelimitedFrom(InputStream inputStream) {
            return (TingCategoryItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingCategoryItem parseFrom(ByteBuffer byteBuffer) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingCategoryItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
            mMListenCategoryItem.getClass();
            this.categoryItem_ = mMListenCategoryItem;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "categoryItem_"});
                case 3:
                    return new TingCategoryItem();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingCategoryItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingCategoryItem.class) {
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

        public TingProto.MMListenCategoryItem getCategoryItem() {
            TingProto.MMListenCategoryItem mMListenCategoryItem = this.categoryItem_;
            return mMListenCategoryItem == null ? TingProto.MMListenCategoryItem.getDefaultInstance() : mMListenCategoryItem;
        }

        public boolean hasCategoryItem() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingCategoryItem tingCategoryItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingCategoryItem);
        }

        public static TingCategoryItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingCategoryItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingCategoryItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingCategoryItem parseFrom(C16994k kVar) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingCategoryItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingCategoryItem parseFrom(byte[] bArr) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingCategoryItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingCategoryItem parseFrom(InputStream inputStream) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingCategoryItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingCategoryItem parseFrom(C23856l lVar) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingCategoryItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingCategoryItemOrBuilder extends C23848k1 {
        TingProto.MMListenCategoryItem getCategoryItem();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasCategoryItem();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingDownloadInfo extends C23861l0<TingDownloadInfo, Builder> implements TingDownloadInfoOrBuilder {
        public static final int AUDIOPATH_FIELD_NUMBER = 1;
        public static final int COVERPATH_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TingDownloadInfo DEFAULT_INSTANCE;
        public static final int LYRICSTEXT_FIELD_NUMBER = 3;
        private static volatile C24062w1<TingDownloadInfo> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 4;
        private String audioPath_ = "";
        private int bitField0_;
        private String coverPath_ = "";
        private String lyricsText_ = "";
        private byte memoizedIsInitialized = 2;
        private int type_;

        public static final class Builder extends C23861l0.C23862a<TingDownloadInfo, Builder> implements TingDownloadInfoOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearAudioPath() {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).clearAudioPath();
                return this;
            }

            public Builder clearCoverPath() {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).clearCoverPath();
                return this;
            }

            public Builder clearLyricsText() {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).clearLyricsText();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).clearType();
                return this;
            }

            public String getAudioPath() {
                return ((TingDownloadInfo) this.instance).getAudioPath();
            }

            public C16994k getAudioPathBytes() {
                return ((TingDownloadInfo) this.instance).getAudioPathBytes();
            }

            public String getCoverPath() {
                return ((TingDownloadInfo) this.instance).getCoverPath();
            }

            public C16994k getCoverPathBytes() {
                return ((TingDownloadInfo) this.instance).getCoverPathBytes();
            }

            public String getLyricsText() {
                return ((TingDownloadInfo) this.instance).getLyricsText();
            }

            public C16994k getLyricsTextBytes() {
                return ((TingDownloadInfo) this.instance).getLyricsTextBytes();
            }

            public int getType() {
                return ((TingDownloadInfo) this.instance).getType();
            }

            public boolean hasAudioPath() {
                return ((TingDownloadInfo) this.instance).hasAudioPath();
            }

            public boolean hasCoverPath() {
                return ((TingDownloadInfo) this.instance).hasCoverPath();
            }

            public boolean hasLyricsText() {
                return ((TingDownloadInfo) this.instance).hasLyricsText();
            }

            public boolean hasType() {
                return ((TingDownloadInfo) this.instance).hasType();
            }

            public Builder setAudioPath(String str) {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).setAudioPath(str);
                return this;
            }

            public Builder setAudioPathBytes(C16994k kVar) {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).setAudioPathBytes(kVar);
                return this;
            }

            public Builder setCoverPath(String str) {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).setCoverPath(str);
                return this;
            }

            public Builder setCoverPathBytes(C16994k kVar) {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).setCoverPathBytes(kVar);
                return this;
            }

            public Builder setLyricsText(String str) {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).setLyricsText(str);
                return this;
            }

            public Builder setLyricsTextBytes(C16994k kVar) {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).setLyricsTextBytes(kVar);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((TingDownloadInfo) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(TingDownloadInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            TingDownloadInfo tingDownloadInfo = new TingDownloadInfo();
            DEFAULT_INSTANCE = tingDownloadInfo;
            C23861l0.registerDefaultInstance(TingDownloadInfo.class, tingDownloadInfo);
        }

        private TingDownloadInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAudioPath() {
            this.bitField0_ &= -2;
            this.audioPath_ = getDefaultInstance().getAudioPath();
        }

        /* access modifiers changed from: private */
        public void clearCoverPath() {
            this.bitField0_ &= -3;
            this.coverPath_ = getDefaultInstance().getCoverPath();
        }

        /* access modifiers changed from: private */
        public void clearLyricsText() {
            this.bitField0_ &= -5;
            this.lyricsText_ = getDefaultInstance().getLyricsText();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -9;
            this.type_ = 0;
        }

        public static TingDownloadInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingDownloadInfo parseDelimitedFrom(InputStream inputStream) {
            return (TingDownloadInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingDownloadInfo parseFrom(ByteBuffer byteBuffer) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingDownloadInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAudioPath(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.audioPath_ = str;
        }

        /* access modifiers changed from: private */
        public void setAudioPathBytes(C16994k kVar) {
            this.audioPath_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setCoverPath(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.coverPath_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverPathBytes(C16994k kVar) {
            this.coverPath_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setLyricsText(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.lyricsText_ = str;
        }

        /* access modifiers changed from: private */
        public void setLyricsTextBytes(C16994k kVar) {
            this.lyricsText_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 8;
            this.type_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "audioPath_", "coverPath_", "lyricsText_", "type_"});
                case 3:
                    return new TingDownloadInfo();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingDownloadInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingDownloadInfo.class) {
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

        public String getAudioPath() {
            return this.audioPath_;
        }

        public C16994k getAudioPathBytes() {
            return C16994k.m16791k(this.audioPath_);
        }

        public String getCoverPath() {
            return this.coverPath_;
        }

        public C16994k getCoverPathBytes() {
            return C16994k.m16791k(this.coverPath_);
        }

        public String getLyricsText() {
            return this.lyricsText_;
        }

        public C16994k getLyricsTextBytes() {
            return C16994k.m16791k(this.lyricsText_);
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasAudioPath() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCoverPath() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLyricsText() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(TingDownloadInfo tingDownloadInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingDownloadInfo);
        }

        public static TingDownloadInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingDownloadInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingDownloadInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingDownloadInfo parseFrom(C16994k kVar) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingDownloadInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingDownloadInfo parseFrom(byte[] bArr) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingDownloadInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingDownloadInfo parseFrom(InputStream inputStream) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingDownloadInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingDownloadInfo parseFrom(C23856l lVar) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingDownloadInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingDownloadInfoOrBuilder extends C23848k1 {
        String getAudioPath();

        C16994k getAudioPathBytes();

        String getCoverPath();

        C16994k getCoverPathBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getLyricsText();

        C16994k getLyricsTextBytes();

        int getType();

        boolean hasAudioPath();

        boolean hasCoverPath();

        boolean hasLyricsText();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingGetLinkInfo extends C23861l0<TingGetLinkInfo, Builder> implements TingGetLinkInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final TingGetLinkInfo DEFAULT_INSTANCE;
        public static final int FINDERINFO_FIELD_NUMBER = 3;
        public static final int LISTENITEMTYPE_FIELD_NUMBER = 1;
        public static final int LISTENPLAYINFO_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingGetLinkInfo> PARSER;
        private int bitField0_;
        private C16994k finderInfo_ = C16994k.f46000e;
        private int listenItemType_;
        private TingProto.MMListenPlayResponse listenPlayInfo_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<TingGetLinkInfo, Builder> implements TingGetLinkInfoOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearFinderInfo() {
                copyOnWrite();
                ((TingGetLinkInfo) this.instance).clearFinderInfo();
                return this;
            }

            public Builder clearListenItemType() {
                copyOnWrite();
                ((TingGetLinkInfo) this.instance).clearListenItemType();
                return this;
            }

            public Builder clearListenPlayInfo() {
                copyOnWrite();
                ((TingGetLinkInfo) this.instance).clearListenPlayInfo();
                return this;
            }

            public C16994k getFinderInfo() {
                return ((TingGetLinkInfo) this.instance).getFinderInfo();
            }

            public int getListenItemType() {
                return ((TingGetLinkInfo) this.instance).getListenItemType();
            }

            public TingProto.MMListenPlayResponse getListenPlayInfo() {
                return ((TingGetLinkInfo) this.instance).getListenPlayInfo();
            }

            public boolean hasFinderInfo() {
                return ((TingGetLinkInfo) this.instance).hasFinderInfo();
            }

            public boolean hasListenItemType() {
                return ((TingGetLinkInfo) this.instance).hasListenItemType();
            }

            public boolean hasListenPlayInfo() {
                return ((TingGetLinkInfo) this.instance).hasListenPlayInfo();
            }

            public Builder mergeListenPlayInfo(TingProto.MMListenPlayResponse mMListenPlayResponse) {
                copyOnWrite();
                ((TingGetLinkInfo) this.instance).mergeListenPlayInfo(mMListenPlayResponse);
                return this;
            }

            public Builder setFinderInfo(C16994k kVar) {
                copyOnWrite();
                ((TingGetLinkInfo) this.instance).setFinderInfo(kVar);
                return this;
            }

            public Builder setListenItemType(int i) {
                copyOnWrite();
                ((TingGetLinkInfo) this.instance).setListenItemType(i);
                return this;
            }

            public Builder setListenPlayInfo(TingProto.MMListenPlayResponse mMListenPlayResponse) {
                copyOnWrite();
                ((TingGetLinkInfo) this.instance).setListenPlayInfo(mMListenPlayResponse);
                return this;
            }

            private Builder() {
                super(TingGetLinkInfo.DEFAULT_INSTANCE);
            }

            public Builder setListenPlayInfo(TingProto.MMListenPlayResponse.Builder builder) {
                copyOnWrite();
                ((TingGetLinkInfo) this.instance).setListenPlayInfo((TingProto.MMListenPlayResponse) builder.build());
                return this;
            }
        }

        static {
            TingGetLinkInfo tingGetLinkInfo = new TingGetLinkInfo();
            DEFAULT_INSTANCE = tingGetLinkInfo;
            C23861l0.registerDefaultInstance(TingGetLinkInfo.class, tingGetLinkInfo);
        }

        private TingGetLinkInfo() {
        }

        /* access modifiers changed from: private */
        public void clearFinderInfo() {
            this.bitField0_ &= -5;
            this.finderInfo_ = getDefaultInstance().getFinderInfo();
        }

        /* access modifiers changed from: private */
        public void clearListenItemType() {
            this.bitField0_ &= -2;
            this.listenItemType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearListenPlayInfo() {
            this.listenPlayInfo_ = null;
            this.bitField0_ &= -3;
        }

        public static TingGetLinkInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeListenPlayInfo(TingProto.MMListenPlayResponse mMListenPlayResponse) {
            mMListenPlayResponse.getClass();
            TingProto.MMListenPlayResponse mMListenPlayResponse2 = this.listenPlayInfo_;
            if (mMListenPlayResponse2 == null || mMListenPlayResponse2 == TingProto.MMListenPlayResponse.getDefaultInstance()) {
                this.listenPlayInfo_ = mMListenPlayResponse;
            } else {
                this.listenPlayInfo_ = (TingProto.MMListenPlayResponse) ((TingProto.MMListenPlayResponse.Builder) TingProto.MMListenPlayResponse.newBuilder(this.listenPlayInfo_).mergeFrom(mMListenPlayResponse)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingGetLinkInfo parseDelimitedFrom(InputStream inputStream) {
            return (TingGetLinkInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingGetLinkInfo parseFrom(ByteBuffer byteBuffer) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingGetLinkInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFinderInfo(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.finderInfo_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setListenItemType(int i) {
            this.bitField0_ |= 1;
            this.listenItemType_ = i;
        }

        /* access modifiers changed from: private */
        public void setListenPlayInfo(TingProto.MMListenPlayResponse mMListenPlayResponse) {
            mMListenPlayResponse.getClass();
            this.listenPlayInfo_ = mMListenPlayResponse;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "listenItemType_", "listenPlayInfo_", "finderInfo_"});
                case 3:
                    return new TingGetLinkInfo();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingGetLinkInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingGetLinkInfo.class) {
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

        public C16994k getFinderInfo() {
            return this.finderInfo_;
        }

        public int getListenItemType() {
            return this.listenItemType_;
        }

        public TingProto.MMListenPlayResponse getListenPlayInfo() {
            TingProto.MMListenPlayResponse mMListenPlayResponse = this.listenPlayInfo_;
            return mMListenPlayResponse == null ? TingProto.MMListenPlayResponse.getDefaultInstance() : mMListenPlayResponse;
        }

        public boolean hasFinderInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasListenItemType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasListenPlayInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TingGetLinkInfo tingGetLinkInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingGetLinkInfo);
        }

        public static TingGetLinkInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingGetLinkInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingGetLinkInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingGetLinkInfo parseFrom(C16994k kVar) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingGetLinkInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingGetLinkInfo parseFrom(byte[] bArr) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingGetLinkInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingGetLinkInfo parseFrom(InputStream inputStream) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingGetLinkInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingGetLinkInfo parseFrom(C23856l lVar) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingGetLinkInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingGetLinkInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingGetLinkInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getFinderInfo();

        int getListenItemType();

        TingProto.MMListenPlayResponse getListenPlayInfo();

        boolean hasFinderInfo();

        boolean hasListenItemType();

        boolean hasListenPlayInfo();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingItem extends C23861l0<TingItem, Builder> implements TingItemOrBuilder {
        public static final int CLIENT_ID_FIELD_NUMBER = 2;
        public static final int CONTEXT_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final TingItem DEFAULT_INSTANCE;
        public static final int LISTENITEM_FIELD_NUMBER = 1;
        private static volatile C24062w1<TingItem> PARSER = null;
        public static final int PLAY_ITEM_FIELD_NUMBER = 4;
        private int bitField0_;
        private String clientId_ = "";
        private TingPlayContext context_;
        private TingProto.MMListenItem listenItem_;
        private byte memoizedIsInitialized = 2;
        private TingPlayItem playItem_;

        public static final class Builder extends C23861l0.C23862a<TingItem, Builder> implements TingItemOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((TingItem) this.instance).clearClientId();
                return this;
            }

            public Builder clearContext() {
                copyOnWrite();
                ((TingItem) this.instance).clearContext();
                return this;
            }

            public Builder clearListenItem() {
                copyOnWrite();
                ((TingItem) this.instance).clearListenItem();
                return this;
            }

            public Builder clearPlayItem() {
                copyOnWrite();
                ((TingItem) this.instance).clearPlayItem();
                return this;
            }

            public String getClientId() {
                return ((TingItem) this.instance).getClientId();
            }

            public C16994k getClientIdBytes() {
                return ((TingItem) this.instance).getClientIdBytes();
            }

            public TingPlayContext getContext() {
                return ((TingItem) this.instance).getContext();
            }

            public TingProto.MMListenItem getListenItem() {
                return ((TingItem) this.instance).getListenItem();
            }

            public TingPlayItem getPlayItem() {
                return ((TingItem) this.instance).getPlayItem();
            }

            public boolean hasClientId() {
                return ((TingItem) this.instance).hasClientId();
            }

            public boolean hasContext() {
                return ((TingItem) this.instance).hasContext();
            }

            public boolean hasListenItem() {
                return ((TingItem) this.instance).hasListenItem();
            }

            public boolean hasPlayItem() {
                return ((TingItem) this.instance).hasPlayItem();
            }

            public Builder mergeContext(TingPlayContext tingPlayContext) {
                copyOnWrite();
                ((TingItem) this.instance).mergeContext(tingPlayContext);
                return this;
            }

            public Builder mergeListenItem(TingProto.MMListenItem mMListenItem) {
                copyOnWrite();
                ((TingItem) this.instance).mergeListenItem(mMListenItem);
                return this;
            }

            public Builder mergePlayItem(TingPlayItem tingPlayItem) {
                copyOnWrite();
                ((TingItem) this.instance).mergePlayItem(tingPlayItem);
                return this;
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((TingItem) this.instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(C16994k kVar) {
                copyOnWrite();
                ((TingItem) this.instance).setClientIdBytes(kVar);
                return this;
            }

            public Builder setContext(TingPlayContext tingPlayContext) {
                copyOnWrite();
                ((TingItem) this.instance).setContext(tingPlayContext);
                return this;
            }

            public Builder setListenItem(TingProto.MMListenItem mMListenItem) {
                copyOnWrite();
                ((TingItem) this.instance).setListenItem(mMListenItem);
                return this;
            }

            public Builder setPlayItem(TingPlayItem tingPlayItem) {
                copyOnWrite();
                ((TingItem) this.instance).setPlayItem(tingPlayItem);
                return this;
            }

            private Builder() {
                super(TingItem.DEFAULT_INSTANCE);
            }

            public Builder setContext(TingPlayContext.Builder builder) {
                copyOnWrite();
                ((TingItem) this.instance).setContext((TingPlayContext) builder.build());
                return this;
            }

            public Builder setListenItem(TingProto.MMListenItem.Builder builder) {
                copyOnWrite();
                ((TingItem) this.instance).setListenItem((TingProto.MMListenItem) builder.build());
                return this;
            }

            public Builder setPlayItem(TingPlayItem.Builder builder) {
                copyOnWrite();
                ((TingItem) this.instance).setPlayItem((TingPlayItem) builder.build());
                return this;
            }
        }

        static {
            TingItem tingItem = new TingItem();
            DEFAULT_INSTANCE = tingItem;
            C23861l0.registerDefaultInstance(TingItem.class, tingItem);
        }

        private TingItem() {
        }

        /* access modifiers changed from: private */
        public void clearClientId() {
            this.bitField0_ &= -3;
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* access modifiers changed from: private */
        public void clearContext() {
            this.context_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearListenItem() {
            this.listenItem_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearPlayItem() {
            this.playItem_ = null;
            this.bitField0_ &= -5;
        }

        public static TingItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeContext(TingPlayContext tingPlayContext) {
            tingPlayContext.getClass();
            TingPlayContext tingPlayContext2 = this.context_;
            if (tingPlayContext2 == null || tingPlayContext2 == TingPlayContext.getDefaultInstance()) {
                this.context_ = tingPlayContext;
            } else {
                this.context_ = (TingPlayContext) ((TingPlayContext.Builder) TingPlayContext.newBuilder(this.context_).mergeFrom(tingPlayContext)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeListenItem(TingProto.MMListenItem mMListenItem) {
            mMListenItem.getClass();
            TingProto.MMListenItem mMListenItem2 = this.listenItem_;
            if (mMListenItem2 == null || mMListenItem2 == TingProto.MMListenItem.getDefaultInstance()) {
                this.listenItem_ = mMListenItem;
            } else {
                this.listenItem_ = (TingProto.MMListenItem) ((TingProto.MMListenItem.Builder) TingProto.MMListenItem.newBuilder(this.listenItem_).mergeFrom(mMListenItem)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergePlayItem(TingPlayItem tingPlayItem) {
            tingPlayItem.getClass();
            TingPlayItem tingPlayItem2 = this.playItem_;
            if (tingPlayItem2 == null || tingPlayItem2 == TingPlayItem.getDefaultInstance()) {
                this.playItem_ = tingPlayItem;
            } else {
                this.playItem_ = (TingPlayItem) ((TingPlayItem.Builder) TingPlayItem.newBuilder(this.playItem_).mergeFrom(tingPlayItem)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingItem parseDelimitedFrom(InputStream inputStream) {
            return (TingItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingItem parseFrom(ByteBuffer byteBuffer) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.clientId_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientIdBytes(C16994k kVar) {
            this.clientId_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setContext(TingPlayContext tingPlayContext) {
            tingPlayContext.getClass();
            this.context_ = tingPlayContext;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setListenItem(TingProto.MMListenItem mMListenItem) {
            mMListenItem.getClass();
            this.listenItem_ = mMListenItem;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setPlayItem(TingPlayItem tingPlayItem) {
            tingPlayItem.getClass();
            this.playItem_ = tingPlayItem;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ဈ\u0001\u0004ဉ\u0002\u0007ᐉ\u0003", new Object[]{"bitField0_", "listenItem_", "clientId_", "playItem_", "context_"});
                case 3:
                    return new TingItem();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingItem.class) {
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

        public String getClientId() {
            return this.clientId_;
        }

        public C16994k getClientIdBytes() {
            return C16994k.m16791k(this.clientId_);
        }

        public TingPlayContext getContext() {
            TingPlayContext tingPlayContext = this.context_;
            return tingPlayContext == null ? TingPlayContext.getDefaultInstance() : tingPlayContext;
        }

        public TingProto.MMListenItem getListenItem() {
            TingProto.MMListenItem mMListenItem = this.listenItem_;
            return mMListenItem == null ? TingProto.MMListenItem.getDefaultInstance() : mMListenItem;
        }

        public TingPlayItem getPlayItem() {
            TingPlayItem tingPlayItem = this.playItem_;
            return tingPlayItem == null ? TingPlayItem.getDefaultInstance() : tingPlayItem;
        }

        public boolean hasClientId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasContext() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasListenItem() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPlayItem() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(TingItem tingItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingItem);
        }

        public static TingItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingItem parseFrom(C16994k kVar) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingItem parseFrom(byte[] bArr) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingItem parseFrom(InputStream inputStream) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingItem parseFrom(C23856l lVar) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingItemOrBuilder extends C23848k1 {
        String getClientId();

        C16994k getClientIdBytes();

        TingPlayContext getContext();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingProto.MMListenItem getListenItem();

        TingPlayItem getPlayItem();

        boolean hasClientId();

        boolean hasContext();

        boolean hasListenItem();

        boolean hasPlayItem();

        /* synthetic */ boolean isInitialized();
    }

    public enum TingListFetchDirection implements C23908o0.C23911c {
        TingListFetchDirectionDown(0),
        TingListFetchDirectionUp(1);
        
        public static final int TingListFetchDirectionDown_VALUE = 0;
        public static final int TingListFetchDirectionUp_VALUE = 1;
        private static final C23908o0.C23912d<TingListFetchDirection> internalValueMap = null;
        private final int value;

        public static final class TingListFetchDirectionVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new TingListFetchDirectionVerifier();
            }

            private TingListFetchDirectionVerifier() {
            }

            public boolean isInRange(int i) {
                return TingListFetchDirection.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<TingListFetchDirection>() {
                public TingListFetchDirection findValueByNumber(int i) {
                    return TingListFetchDirection.forNumber(i);
                }
            };
        }

        private TingListFetchDirection(int i) {
            this.value = i;
        }

        public static TingListFetchDirection forNumber(int i) {
            if (i == 0) {
                return TingListFetchDirectionDown;
            }
            if (i != 1) {
                return null;
            }
            return TingListFetchDirectionUp;
        }

        public static C23908o0.C23912d<TingListFetchDirection> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return TingListFetchDirectionVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TingListFetchDirection valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class TingListRepoSource extends C23861l0<TingListRepoSource, Builder> implements TingListRepoSourceOrBuilder {
        public static final int CATEGORYITEM_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TingListRepoSource DEFAULT_INSTANCE;
        public static final int LISTEN_ID_LIST_FIELD_NUMBER = 4;
        public static final int MPALBUMID_FIELD_NUMBER = 3;
        private static volatile C24062w1<TingListRepoSource> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private TingProto.MMListenCategoryItem categoryItem_;
        private C23908o0.C23919j<String> listenIdList_ = C23861l0.emptyProtobufList();
        private String mpAlbumId_ = "";
        private int type_;

        public static final class Builder extends C23861l0.C23862a<TingListRepoSource, Builder> implements TingListRepoSourceOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder addAllListenIdList(Iterable<String> iterable) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).addAllListenIdList(iterable);
                return this;
            }

            public Builder addListenIdList(String str) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).addListenIdList(str);
                return this;
            }

            public Builder addListenIdListBytes(C16994k kVar) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).addListenIdListBytes(kVar);
                return this;
            }

            public Builder clearCategoryItem() {
                copyOnWrite();
                ((TingListRepoSource) this.instance).clearCategoryItem();
                return this;
            }

            public Builder clearListenIdList() {
                copyOnWrite();
                ((TingListRepoSource) this.instance).clearListenIdList();
                return this;
            }

            public Builder clearMpAlbumId() {
                copyOnWrite();
                ((TingListRepoSource) this.instance).clearMpAlbumId();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TingListRepoSource) this.instance).clearType();
                return this;
            }

            public TingProto.MMListenCategoryItem getCategoryItem() {
                return ((TingListRepoSource) this.instance).getCategoryItem();
            }

            public String getListenIdList(int i) {
                return ((TingListRepoSource) this.instance).getListenIdList(i);
            }

            public C16994k getListenIdListBytes(int i) {
                return ((TingListRepoSource) this.instance).getListenIdListBytes(i);
            }

            public int getListenIdListCount() {
                return ((TingListRepoSource) this.instance).getListenIdListCount();
            }

            public List<String> getListenIdListList() {
                return Collections.unmodifiableList(((TingListRepoSource) this.instance).getListenIdListList());
            }

            public String getMpAlbumId() {
                return ((TingListRepoSource) this.instance).getMpAlbumId();
            }

            public C16994k getMpAlbumIdBytes() {
                return ((TingListRepoSource) this.instance).getMpAlbumIdBytes();
            }

            public int getType() {
                return ((TingListRepoSource) this.instance).getType();
            }

            public boolean hasCategoryItem() {
                return ((TingListRepoSource) this.instance).hasCategoryItem();
            }

            public boolean hasMpAlbumId() {
                return ((TingListRepoSource) this.instance).hasMpAlbumId();
            }

            public boolean hasType() {
                return ((TingListRepoSource) this.instance).hasType();
            }

            public Builder mergeCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).mergeCategoryItem(mMListenCategoryItem);
                return this;
            }

            public Builder setCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).setCategoryItem(mMListenCategoryItem);
                return this;
            }

            public Builder setListenIdList(int i, String str) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).setListenIdList(i, str);
                return this;
            }

            public Builder setMpAlbumId(String str) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).setMpAlbumId(str);
                return this;
            }

            public Builder setMpAlbumIdBytes(C16994k kVar) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).setMpAlbumIdBytes(kVar);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(TingListRepoSource.DEFAULT_INSTANCE);
            }

            public Builder setCategoryItem(TingProto.MMListenCategoryItem.Builder builder) {
                copyOnWrite();
                ((TingListRepoSource) this.instance).setCategoryItem((TingProto.MMListenCategoryItem) builder.build());
                return this;
            }
        }

        static {
            TingListRepoSource tingListRepoSource = new TingListRepoSource();
            DEFAULT_INSTANCE = tingListRepoSource;
            C23861l0.registerDefaultInstance(TingListRepoSource.class, tingListRepoSource);
        }

        private TingListRepoSource() {
        }

        /* access modifiers changed from: private */
        public void addAllListenIdList(Iterable<String> iterable) {
            ensureListenIdListIsMutable();
            C23810b.addAll(iterable, this.listenIdList_);
        }

        /* access modifiers changed from: private */
        public void addListenIdList(String str) {
            str.getClass();
            ensureListenIdListIsMutable();
            this.listenIdList_.add(str);
        }

        /* access modifiers changed from: private */
        public void addListenIdListBytes(C16994k kVar) {
            ensureListenIdListIsMutable();
            this.listenIdList_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearCategoryItem() {
            this.categoryItem_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearListenIdList() {
            this.listenIdList_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMpAlbumId() {
            this.bitField0_ &= -5;
            this.mpAlbumId_ = getDefaultInstance().getMpAlbumId();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureListenIdListIsMutable() {
            C23908o0.C23919j<String> jVar = this.listenIdList_;
            if (!jVar.mo37523Q()) {
                this.listenIdList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static TingListRepoSource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
            mMListenCategoryItem.getClass();
            TingProto.MMListenCategoryItem mMListenCategoryItem2 = this.categoryItem_;
            if (mMListenCategoryItem2 == null || mMListenCategoryItem2 == TingProto.MMListenCategoryItem.getDefaultInstance()) {
                this.categoryItem_ = mMListenCategoryItem;
            } else {
                this.categoryItem_ = (TingProto.MMListenCategoryItem) ((TingProto.MMListenCategoryItem.Builder) TingProto.MMListenCategoryItem.newBuilder(this.categoryItem_).mergeFrom(mMListenCategoryItem)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingListRepoSource parseDelimitedFrom(InputStream inputStream) {
            return (TingListRepoSource) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingListRepoSource parseFrom(ByteBuffer byteBuffer) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingListRepoSource> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
            mMListenCategoryItem.getClass();
            this.categoryItem_ = mMListenCategoryItem;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setListenIdList(int i, String str) {
            str.getClass();
            ensureListenIdListIsMutable();
            this.listenIdList_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setMpAlbumId(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.mpAlbumId_ = str;
        }

        /* access modifiers changed from: private */
        public void setMpAlbumIdBytes(C16994k kVar) {
            this.mpAlbumId_ = kVar.mo18752u();
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"bitField0_", "type_", "categoryItem_", "mpAlbumId_", "listenIdList_"});
                case 3:
                    return new TingListRepoSource();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingListRepoSource> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingListRepoSource.class) {
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

        public TingProto.MMListenCategoryItem getCategoryItem() {
            TingProto.MMListenCategoryItem mMListenCategoryItem = this.categoryItem_;
            return mMListenCategoryItem == null ? TingProto.MMListenCategoryItem.getDefaultInstance() : mMListenCategoryItem;
        }

        public String getListenIdList(int i) {
            return this.listenIdList_.get(i);
        }

        public C16994k getListenIdListBytes(int i) {
            return C16994k.m16791k(this.listenIdList_.get(i));
        }

        public int getListenIdListCount() {
            return this.listenIdList_.size();
        }

        public List<String> getListenIdListList() {
            return this.listenIdList_;
        }

        public String getMpAlbumId() {
            return this.mpAlbumId_;
        }

        public C16994k getMpAlbumIdBytes() {
            return C16994k.m16791k(this.mpAlbumId_);
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasCategoryItem() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMpAlbumId() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingListRepoSource tingListRepoSource) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingListRepoSource);
        }

        public static TingListRepoSource parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingListRepoSource) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingListRepoSource parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingListRepoSource parseFrom(C16994k kVar) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingListRepoSource parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingListRepoSource parseFrom(byte[] bArr) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingListRepoSource parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingListRepoSource parseFrom(InputStream inputStream) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingListRepoSource parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingListRepoSource parseFrom(C23856l lVar) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingListRepoSource parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingListRepoSource) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingListRepoSourceOrBuilder extends C23848k1 {
        TingProto.MMListenCategoryItem getCategoryItem();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getListenIdList(int i);

        C16994k getListenIdListBytes(int i);

        int getListenIdListCount();

        List<String> getListenIdListList();

        String getMpAlbumId();

        C16994k getMpAlbumIdBytes();

        int getType();

        boolean hasCategoryItem();

        boolean hasMpAlbumId();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public enum TingListRepoSourceType implements C23908o0.C23911c {
        TingListRepoSourceTypeCategory(0),
        TingListRepoSourceTypeMpAlbumId(1),
        TingListRepoSourceTypeListenIdList(2);
        
        public static final int TingListRepoSourceTypeCategory_VALUE = 0;
        public static final int TingListRepoSourceTypeListenIdList_VALUE = 2;
        public static final int TingListRepoSourceTypeMpAlbumId_VALUE = 1;
        private static final C23908o0.C23912d<TingListRepoSourceType> internalValueMap = null;
        private final int value;

        public static final class TingListRepoSourceTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new TingListRepoSourceTypeVerifier();
            }

            private TingListRepoSourceTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return TingListRepoSourceType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<TingListRepoSourceType>() {
                public TingListRepoSourceType findValueByNumber(int i) {
                    return TingListRepoSourceType.forNumber(i);
                }
            };
        }

        private TingListRepoSourceType(int i) {
            this.value = i;
        }

        public static TingListRepoSourceType forNumber(int i) {
            if (i == 0) {
                return TingListRepoSourceTypeCategory;
            }
            if (i == 1) {
                return TingListRepoSourceTypeMpAlbumId;
            }
            if (i != 2) {
                return null;
            }
            return TingListRepoSourceTypeListenIdList;
        }

        public static C23908o0.C23912d<TingListRepoSourceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return TingListRepoSourceTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TingListRepoSourceType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class TingOctreeResult extends C23861l0<TingOctreeResult, Builder> implements TingOctreeResultOrBuilder {
        /* access modifiers changed from: private */
        public static final TingOctreeResult DEFAULT_INSTANCE;
        private static volatile C24062w1<TingOctreeResult> PARSER = null;
        public static final int PIXELCOUNT_FIELD_NUMBER = 2;
        public static final int RECORDS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int pixelCount_;
        private C23908o0.C23919j<OctreeStatRecord> records_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<TingOctreeResult, Builder> implements TingOctreeResultOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder addAllRecords(Iterable<? extends OctreeStatRecord> iterable) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).addAllRecords(iterable);
                return this;
            }

            public Builder addRecords(OctreeStatRecord octreeStatRecord) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).addRecords(octreeStatRecord);
                return this;
            }

            public Builder clearPixelCount() {
                copyOnWrite();
                ((TingOctreeResult) this.instance).clearPixelCount();
                return this;
            }

            public Builder clearRecords() {
                copyOnWrite();
                ((TingOctreeResult) this.instance).clearRecords();
                return this;
            }

            public int getPixelCount() {
                return ((TingOctreeResult) this.instance).getPixelCount();
            }

            public OctreeStatRecord getRecords(int i) {
                return ((TingOctreeResult) this.instance).getRecords(i);
            }

            public int getRecordsCount() {
                return ((TingOctreeResult) this.instance).getRecordsCount();
            }

            public List<OctreeStatRecord> getRecordsList() {
                return Collections.unmodifiableList(((TingOctreeResult) this.instance).getRecordsList());
            }

            public boolean hasPixelCount() {
                return ((TingOctreeResult) this.instance).hasPixelCount();
            }

            public Builder removeRecords(int i) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).removeRecords(i);
                return this;
            }

            public Builder setPixelCount(int i) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).setPixelCount(i);
                return this;
            }

            public Builder setRecords(int i, OctreeStatRecord octreeStatRecord) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).setRecords(i, octreeStatRecord);
                return this;
            }

            private Builder() {
                super(TingOctreeResult.DEFAULT_INSTANCE);
            }

            public Builder addRecords(int i, OctreeStatRecord octreeStatRecord) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).addRecords(i, octreeStatRecord);
                return this;
            }

            public Builder setRecords(int i, OctreeStatRecord.Builder builder) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).setRecords(i, (OctreeStatRecord) builder.build());
                return this;
            }

            public Builder addRecords(OctreeStatRecord.Builder builder) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).addRecords((OctreeStatRecord) builder.build());
                return this;
            }

            public Builder addRecords(int i, OctreeStatRecord.Builder builder) {
                copyOnWrite();
                ((TingOctreeResult) this.instance).addRecords(i, (OctreeStatRecord) builder.build());
                return this;
            }
        }

        public static final class OctreeStatRecord extends C23861l0<OctreeStatRecord, Builder> implements OctreeStatRecordOrBuilder {
            public static final int COLOR_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final OctreeStatRecord DEFAULT_INSTANCE;
            private static volatile C24062w1<OctreeStatRecord> PARSER = null;
            public static final int RECORD_FIELD_NUMBER = 2;
            private int bitField0_;
            private String color_ = "";
            private long record_;

            public static final class Builder extends C23861l0.C23862a<OctreeStatRecord, Builder> implements OctreeStatRecordOrBuilder {
                public /* synthetic */ Builder(C243121 r1) {
                    this();
                }

                public Builder clearColor() {
                    copyOnWrite();
                    ((OctreeStatRecord) this.instance).clearColor();
                    return this;
                }

                public Builder clearRecord() {
                    copyOnWrite();
                    ((OctreeStatRecord) this.instance).clearRecord();
                    return this;
                }

                public String getColor() {
                    return ((OctreeStatRecord) this.instance).getColor();
                }

                public C16994k getColorBytes() {
                    return ((OctreeStatRecord) this.instance).getColorBytes();
                }

                public long getRecord() {
                    return ((OctreeStatRecord) this.instance).getRecord();
                }

                public boolean hasColor() {
                    return ((OctreeStatRecord) this.instance).hasColor();
                }

                public boolean hasRecord() {
                    return ((OctreeStatRecord) this.instance).hasRecord();
                }

                public Builder setColor(String str) {
                    copyOnWrite();
                    ((OctreeStatRecord) this.instance).setColor(str);
                    return this;
                }

                public Builder setColorBytes(C16994k kVar) {
                    copyOnWrite();
                    ((OctreeStatRecord) this.instance).setColorBytes(kVar);
                    return this;
                }

                public Builder setRecord(long j) {
                    copyOnWrite();
                    ((OctreeStatRecord) this.instance).setRecord(j);
                    return this;
                }

                private Builder() {
                    super(OctreeStatRecord.DEFAULT_INSTANCE);
                }
            }

            static {
                OctreeStatRecord octreeStatRecord = new OctreeStatRecord();
                DEFAULT_INSTANCE = octreeStatRecord;
                C23861l0.registerDefaultInstance(OctreeStatRecord.class, octreeStatRecord);
            }

            private OctreeStatRecord() {
            }

            /* access modifiers changed from: private */
            public void clearColor() {
                this.bitField0_ &= -2;
                this.color_ = getDefaultInstance().getColor();
            }

            /* access modifiers changed from: private */
            public void clearRecord() {
                this.bitField0_ &= -3;
                this.record_ = 0;
            }

            public static OctreeStatRecord getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static OctreeStatRecord parseDelimitedFrom(InputStream inputStream) {
                return (OctreeStatRecord) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OctreeStatRecord parseFrom(ByteBuffer byteBuffer) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<OctreeStatRecord> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setColor(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.color_ = str;
            }

            /* access modifiers changed from: private */
            public void setColorBytes(C16994k kVar) {
                this.color_ = kVar.mo18752u();
                this.bitField0_ |= 1;
            }

            /* access modifiers changed from: private */
            public void setRecord(long j) {
                this.bitField0_ |= 2;
                this.record_ = j;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001", new Object[]{"bitField0_", "color_", "record_"});
                    case 3:
                        return new OctreeStatRecord();
                    case 4:
                        return new Builder((C243121) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<OctreeStatRecord> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (OctreeStatRecord.class) {
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

            public String getColor() {
                return this.color_;
            }

            public C16994k getColorBytes() {
                return C16994k.m16791k(this.color_);
            }

            public long getRecord() {
                return this.record_;
            }

            public boolean hasColor() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasRecord() {
                return (this.bitField0_ & 2) != 0;
            }

            public static Builder newBuilder(OctreeStatRecord octreeStatRecord) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(octreeStatRecord);
            }

            public static OctreeStatRecord parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (OctreeStatRecord) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static OctreeStatRecord parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static OctreeStatRecord parseFrom(C16994k kVar) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static OctreeStatRecord parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static OctreeStatRecord parseFrom(byte[] bArr) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static OctreeStatRecord parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static OctreeStatRecord parseFrom(InputStream inputStream) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static OctreeStatRecord parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static OctreeStatRecord parseFrom(C23856l lVar) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static OctreeStatRecord parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (OctreeStatRecord) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        public interface OctreeStatRecordOrBuilder extends C23848k1 {
            String getColor();

            C16994k getColorBytes();

            /* synthetic */ C23845j1 getDefaultInstanceForType();

            long getRecord();

            boolean hasColor();

            boolean hasRecord();

            /* synthetic */ boolean isInitialized();
        }

        static {
            TingOctreeResult tingOctreeResult = new TingOctreeResult();
            DEFAULT_INSTANCE = tingOctreeResult;
            C23861l0.registerDefaultInstance(TingOctreeResult.class, tingOctreeResult);
        }

        private TingOctreeResult() {
        }

        /* access modifiers changed from: private */
        public void addAllRecords(Iterable<? extends OctreeStatRecord> iterable) {
            ensureRecordsIsMutable();
            C23810b.addAll(iterable, this.records_);
        }

        /* access modifiers changed from: private */
        public void addRecords(OctreeStatRecord octreeStatRecord) {
            octreeStatRecord.getClass();
            ensureRecordsIsMutable();
            this.records_.add(octreeStatRecord);
        }

        /* access modifiers changed from: private */
        public void clearPixelCount() {
            this.bitField0_ &= -2;
            this.pixelCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecords() {
            this.records_ = C23861l0.emptyProtobufList();
        }

        private void ensureRecordsIsMutable() {
            C23908o0.C23919j<OctreeStatRecord> jVar = this.records_;
            if (!jVar.mo37523Q()) {
                this.records_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static TingOctreeResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingOctreeResult parseDelimitedFrom(InputStream inputStream) {
            return (TingOctreeResult) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingOctreeResult parseFrom(ByteBuffer byteBuffer) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingOctreeResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeRecords(int i) {
            ensureRecordsIsMutable();
            this.records_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setPixelCount(int i) {
            this.bitField0_ |= 1;
            this.pixelCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecords(int i, OctreeStatRecord octreeStatRecord) {
            octreeStatRecord.getClass();
            ensureRecordsIsMutable();
            this.records_.set(i, octreeStatRecord);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"bitField0_", "records_", OctreeStatRecord.class, "pixelCount_"});
                case 3:
                    return new TingOctreeResult();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingOctreeResult> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingOctreeResult.class) {
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

        public int getPixelCount() {
            return this.pixelCount_;
        }

        public OctreeStatRecord getRecords(int i) {
            return this.records_.get(i);
        }

        public int getRecordsCount() {
            return this.records_.size();
        }

        public List<OctreeStatRecord> getRecordsList() {
            return this.records_;
        }

        public OctreeStatRecordOrBuilder getRecordsOrBuilder(int i) {
            return this.records_.get(i);
        }

        public List<? extends OctreeStatRecordOrBuilder> getRecordsOrBuilderList() {
            return this.records_;
        }

        public boolean hasPixelCount() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingOctreeResult tingOctreeResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingOctreeResult);
        }

        public static TingOctreeResult parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingOctreeResult) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingOctreeResult parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingOctreeResult parseFrom(C16994k kVar) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addRecords(int i, OctreeStatRecord octreeStatRecord) {
            octreeStatRecord.getClass();
            ensureRecordsIsMutable();
            this.records_.add(i, octreeStatRecord);
        }

        public static TingOctreeResult parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingOctreeResult parseFrom(byte[] bArr) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingOctreeResult parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingOctreeResult parseFrom(InputStream inputStream) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingOctreeResult parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingOctreeResult parseFrom(C23856l lVar) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingOctreeResult parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingOctreeResult) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingOctreeResultOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getPixelCount();

        TingOctreeResult.OctreeStatRecord getRecords(int i);

        int getRecordsCount();

        List<TingOctreeResult.OctreeStatRecord> getRecordsList();

        boolean hasPixelCount();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingPanelPlayInfo extends C23861l0<TingPanelPlayInfo, Builder> implements TingPanelPlayInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final TingPanelPlayInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<TingPanelPlayInfo> PARSER = null;
        public static final int TAPEITEM_FIELD_NUMBER = 1;
        public static final int TASKID_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private TingTapeItem tapeItem_;
        private String taskId_ = "";

        public static final class Builder extends C23861l0.C23862a<TingPanelPlayInfo, Builder> implements TingPanelPlayInfoOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearTapeItem() {
                copyOnWrite();
                ((TingPanelPlayInfo) this.instance).clearTapeItem();
                return this;
            }

            public Builder clearTaskId() {
                copyOnWrite();
                ((TingPanelPlayInfo) this.instance).clearTaskId();
                return this;
            }

            public TingTapeItem getTapeItem() {
                return ((TingPanelPlayInfo) this.instance).getTapeItem();
            }

            public String getTaskId() {
                return ((TingPanelPlayInfo) this.instance).getTaskId();
            }

            public C16994k getTaskIdBytes() {
                return ((TingPanelPlayInfo) this.instance).getTaskIdBytes();
            }

            public boolean hasTapeItem() {
                return ((TingPanelPlayInfo) this.instance).hasTapeItem();
            }

            public boolean hasTaskId() {
                return ((TingPanelPlayInfo) this.instance).hasTaskId();
            }

            public Builder mergeTapeItem(TingTapeItem tingTapeItem) {
                copyOnWrite();
                ((TingPanelPlayInfo) this.instance).mergeTapeItem(tingTapeItem);
                return this;
            }

            public Builder setTapeItem(TingTapeItem tingTapeItem) {
                copyOnWrite();
                ((TingPanelPlayInfo) this.instance).setTapeItem(tingTapeItem);
                return this;
            }

            public Builder setTaskId(String str) {
                copyOnWrite();
                ((TingPanelPlayInfo) this.instance).setTaskId(str);
                return this;
            }

            public Builder setTaskIdBytes(C16994k kVar) {
                copyOnWrite();
                ((TingPanelPlayInfo) this.instance).setTaskIdBytes(kVar);
                return this;
            }

            private Builder() {
                super(TingPanelPlayInfo.DEFAULT_INSTANCE);
            }

            public Builder setTapeItem(TingTapeItem.Builder builder) {
                copyOnWrite();
                ((TingPanelPlayInfo) this.instance).setTapeItem((TingTapeItem) builder.build());
                return this;
            }
        }

        static {
            TingPanelPlayInfo tingPanelPlayInfo = new TingPanelPlayInfo();
            DEFAULT_INSTANCE = tingPanelPlayInfo;
            C23861l0.registerDefaultInstance(TingPanelPlayInfo.class, tingPanelPlayInfo);
        }

        private TingPanelPlayInfo() {
        }

        /* access modifiers changed from: private */
        public void clearTapeItem() {
            this.tapeItem_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearTaskId() {
            this.bitField0_ &= -3;
            this.taskId_ = getDefaultInstance().getTaskId();
        }

        public static TingPanelPlayInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTapeItem(TingTapeItem tingTapeItem) {
            tingTapeItem.getClass();
            TingTapeItem tingTapeItem2 = this.tapeItem_;
            if (tingTapeItem2 == null || tingTapeItem2 == TingTapeItem.getDefaultInstance()) {
                this.tapeItem_ = tingTapeItem;
            } else {
                this.tapeItem_ = (TingTapeItem) ((TingTapeItem.Builder) TingTapeItem.newBuilder(this.tapeItem_).mergeFrom(tingTapeItem)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingPanelPlayInfo parseDelimitedFrom(InputStream inputStream) {
            return (TingPanelPlayInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPanelPlayInfo parseFrom(ByteBuffer byteBuffer) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingPanelPlayInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setTapeItem(TingTapeItem tingTapeItem) {
            tingTapeItem.getClass();
            this.tapeItem_ = tingTapeItem;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setTaskId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.taskId_ = str;
        }

        /* access modifiers changed from: private */
        public void setTaskIdBytes(C16994k kVar) {
            this.taskId_ = kVar.mo18752u();
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "tapeItem_", "taskId_"});
                case 3:
                    return new TingPanelPlayInfo();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingPanelPlayInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingPanelPlayInfo.class) {
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

        public TingTapeItem getTapeItem() {
            TingTapeItem tingTapeItem = this.tapeItem_;
            return tingTapeItem == null ? TingTapeItem.getDefaultInstance() : tingTapeItem;
        }

        public String getTaskId() {
            return this.taskId_;
        }

        public C16994k getTaskIdBytes() {
            return C16994k.m16791k(this.taskId_);
        }

        public boolean hasTapeItem() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTaskId() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TingPanelPlayInfo tingPanelPlayInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingPanelPlayInfo);
        }

        public static TingPanelPlayInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPanelPlayInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPanelPlayInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingPanelPlayInfo parseFrom(C16994k kVar) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingPanelPlayInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingPanelPlayInfo parseFrom(byte[] bArr) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingPanelPlayInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingPanelPlayInfo parseFrom(InputStream inputStream) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPanelPlayInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPanelPlayInfo parseFrom(C23856l lVar) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingPanelPlayInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingPanelPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingPanelPlayInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingTapeItem getTapeItem();

        String getTaskId();

        C16994k getTaskIdBytes();

        boolean hasTapeItem();

        boolean hasTaskId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingPlayContext extends C23861l0<TingPlayContext, Builder> implements TingPlayContextOrBuilder {
        /* access modifiers changed from: private */
        public static final TingPlayContext DEFAULT_INSTANCE;
        public static final int DOWNLOADINFO_FIELD_NUMBER = 4;
        public static final int END_TIME_FIELD_NUMBER = 3;
        private static volatile C24062w1<TingPlayContext> PARSER = null;
        public static final int PLAY_RATE_FIELD_NUMBER = 1;
        public static final int START_TIME_FIELD_NUMBER = 2;
        private int bitField0_;
        private TingDownloadInfo downloadInfo_;
        private int endTime_;
        private byte memoizedIsInitialized = 2;
        private float playRate_;
        private int startTime_;

        public static final class Builder extends C23861l0.C23862a<TingPlayContext, Builder> implements TingPlayContextOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearDownloadInfo() {
                copyOnWrite();
                ((TingPlayContext) this.instance).clearDownloadInfo();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((TingPlayContext) this.instance).clearEndTime();
                return this;
            }

            public Builder clearPlayRate() {
                copyOnWrite();
                ((TingPlayContext) this.instance).clearPlayRate();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((TingPlayContext) this.instance).clearStartTime();
                return this;
            }

            public TingDownloadInfo getDownloadInfo() {
                return ((TingPlayContext) this.instance).getDownloadInfo();
            }

            public int getEndTime() {
                return ((TingPlayContext) this.instance).getEndTime();
            }

            public float getPlayRate() {
                return ((TingPlayContext) this.instance).getPlayRate();
            }

            public int getStartTime() {
                return ((TingPlayContext) this.instance).getStartTime();
            }

            public boolean hasDownloadInfo() {
                return ((TingPlayContext) this.instance).hasDownloadInfo();
            }

            public boolean hasEndTime() {
                return ((TingPlayContext) this.instance).hasEndTime();
            }

            public boolean hasPlayRate() {
                return ((TingPlayContext) this.instance).hasPlayRate();
            }

            public boolean hasStartTime() {
                return ((TingPlayContext) this.instance).hasStartTime();
            }

            public Builder mergeDownloadInfo(TingDownloadInfo tingDownloadInfo) {
                copyOnWrite();
                ((TingPlayContext) this.instance).mergeDownloadInfo(tingDownloadInfo);
                return this;
            }

            public Builder setDownloadInfo(TingDownloadInfo tingDownloadInfo) {
                copyOnWrite();
                ((TingPlayContext) this.instance).setDownloadInfo(tingDownloadInfo);
                return this;
            }

            public Builder setEndTime(int i) {
                copyOnWrite();
                ((TingPlayContext) this.instance).setEndTime(i);
                return this;
            }

            public Builder setPlayRate(float f) {
                copyOnWrite();
                ((TingPlayContext) this.instance).setPlayRate(f);
                return this;
            }

            public Builder setStartTime(int i) {
                copyOnWrite();
                ((TingPlayContext) this.instance).setStartTime(i);
                return this;
            }

            private Builder() {
                super(TingPlayContext.DEFAULT_INSTANCE);
            }

            public Builder setDownloadInfo(TingDownloadInfo.Builder builder) {
                copyOnWrite();
                ((TingPlayContext) this.instance).setDownloadInfo((TingDownloadInfo) builder.build());
                return this;
            }
        }

        static {
            TingPlayContext tingPlayContext = new TingPlayContext();
            DEFAULT_INSTANCE = tingPlayContext;
            C23861l0.registerDefaultInstance(TingPlayContext.class, tingPlayContext);
        }

        private TingPlayContext() {
        }

        /* access modifiers changed from: private */
        public void clearDownloadInfo() {
            this.downloadInfo_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearEndTime() {
            this.bitField0_ &= -5;
            this.endTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPlayRate() {
            this.bitField0_ &= -2;
            this.playRate_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearStartTime() {
            this.bitField0_ &= -3;
            this.startTime_ = 0;
        }

        public static TingPlayContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDownloadInfo(TingDownloadInfo tingDownloadInfo) {
            tingDownloadInfo.getClass();
            TingDownloadInfo tingDownloadInfo2 = this.downloadInfo_;
            if (tingDownloadInfo2 == null || tingDownloadInfo2 == TingDownloadInfo.getDefaultInstance()) {
                this.downloadInfo_ = tingDownloadInfo;
            } else {
                this.downloadInfo_ = (TingDownloadInfo) ((TingDownloadInfo.Builder) TingDownloadInfo.newBuilder(this.downloadInfo_).mergeFrom(tingDownloadInfo)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingPlayContext parseDelimitedFrom(InputStream inputStream) {
            return (TingPlayContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayContext parseFrom(ByteBuffer byteBuffer) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingPlayContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDownloadInfo(TingDownloadInfo tingDownloadInfo) {
            tingDownloadInfo.getClass();
            this.downloadInfo_ = tingDownloadInfo;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setEndTime(int i) {
            this.bitField0_ |= 4;
            this.endTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setPlayRate(float f) {
            this.bitField0_ |= 1;
            this.playRate_ = f;
        }

        /* access modifiers changed from: private */
        public void setStartTime(int i) {
            this.bitField0_ |= 2;
            this.startTime_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ခ\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003", new Object[]{"bitField0_", "playRate_", "startTime_", "endTime_", "downloadInfo_"});
                case 3:
                    return new TingPlayContext();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingPlayContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingPlayContext.class) {
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

        public TingDownloadInfo getDownloadInfo() {
            TingDownloadInfo tingDownloadInfo = this.downloadInfo_;
            return tingDownloadInfo == null ? TingDownloadInfo.getDefaultInstance() : tingDownloadInfo;
        }

        public int getEndTime() {
            return this.endTime_;
        }

        public float getPlayRate() {
            return this.playRate_;
        }

        public int getStartTime() {
            return this.startTime_;
        }

        public boolean hasDownloadInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasEndTime() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPlayRate() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStartTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TingPlayContext tingPlayContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingPlayContext);
        }

        public static TingPlayContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingPlayContext parseFrom(C16994k kVar) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingPlayContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingPlayContext parseFrom(byte[] bArr) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingPlayContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingPlayContext parseFrom(InputStream inputStream) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayContext parseFrom(C23856l lVar) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingPlayContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingPlayContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingPlayContextOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingDownloadInfo getDownloadInfo();

        int getEndTime();

        float getPlayRate();

        int getStartTime();

        boolean hasDownloadInfo();

        boolean hasEndTime();

        boolean hasPlayRate();

        boolean hasStartTime();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingPlayItem extends C23861l0<TingPlayItem, Builder> implements TingPlayItemOrBuilder {
        /* access modifiers changed from: private */
        public static final TingPlayItem DEFAULT_INSTANCE;
        public static final int FINDER_INFO_FIELD_NUMBER = 3;
        public static final int IS_TRY_FIELD_NUMBER = 4;
        private static volatile C24062w1<TingPlayItem> PARSER = null;
        public static final int QUALITY_TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 2;
        private int bitField0_;
        private C16994k finderInfo_ = C16994k.f46000e;
        private boolean isTry_;
        private int qualityType_;
        private int type_;
        private String url_ = "";

        public static final class Builder extends C23861l0.C23862a<TingPlayItem, Builder> implements TingPlayItemOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearFinderInfo() {
                copyOnWrite();
                ((TingPlayItem) this.instance).clearFinderInfo();
                return this;
            }

            public Builder clearIsTry() {
                copyOnWrite();
                ((TingPlayItem) this.instance).clearIsTry();
                return this;
            }

            public Builder clearQualityType() {
                copyOnWrite();
                ((TingPlayItem) this.instance).clearQualityType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TingPlayItem) this.instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((TingPlayItem) this.instance).clearUrl();
                return this;
            }

            public C16994k getFinderInfo() {
                return ((TingPlayItem) this.instance).getFinderInfo();
            }

            public boolean getIsTry() {
                return ((TingPlayItem) this.instance).getIsTry();
            }

            public int getQualityType() {
                return ((TingPlayItem) this.instance).getQualityType();
            }

            public int getType() {
                return ((TingPlayItem) this.instance).getType();
            }

            public String getUrl() {
                return ((TingPlayItem) this.instance).getUrl();
            }

            public C16994k getUrlBytes() {
                return ((TingPlayItem) this.instance).getUrlBytes();
            }

            public boolean hasFinderInfo() {
                return ((TingPlayItem) this.instance).hasFinderInfo();
            }

            public boolean hasIsTry() {
                return ((TingPlayItem) this.instance).hasIsTry();
            }

            public boolean hasQualityType() {
                return ((TingPlayItem) this.instance).hasQualityType();
            }

            public boolean hasType() {
                return ((TingPlayItem) this.instance).hasType();
            }

            public boolean hasUrl() {
                return ((TingPlayItem) this.instance).hasUrl();
            }

            public Builder setFinderInfo(C16994k kVar) {
                copyOnWrite();
                ((TingPlayItem) this.instance).setFinderInfo(kVar);
                return this;
            }

            public Builder setIsTry(boolean z) {
                copyOnWrite();
                ((TingPlayItem) this.instance).setIsTry(z);
                return this;
            }

            public Builder setQualityType(int i) {
                copyOnWrite();
                ((TingPlayItem) this.instance).setQualityType(i);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((TingPlayItem) this.instance).setType(i);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((TingPlayItem) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((TingPlayItem) this.instance).setUrlBytes(kVar);
                return this;
            }

            private Builder() {
                super(TingPlayItem.DEFAULT_INSTANCE);
            }
        }

        static {
            TingPlayItem tingPlayItem = new TingPlayItem();
            DEFAULT_INSTANCE = tingPlayItem;
            C23861l0.registerDefaultInstance(TingPlayItem.class, tingPlayItem);
        }

        private TingPlayItem() {
        }

        /* access modifiers changed from: private */
        public void clearFinderInfo() {
            this.bitField0_ &= -5;
            this.finderInfo_ = getDefaultInstance().getFinderInfo();
        }

        /* access modifiers changed from: private */
        public void clearIsTry() {
            this.bitField0_ &= -9;
            this.isTry_ = false;
        }

        /* access modifiers changed from: private */
        public void clearQualityType() {
            this.bitField0_ &= -17;
            this.qualityType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -3;
            this.url_ = getDefaultInstance().getUrl();
        }

        public static TingPlayItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingPlayItem parseDelimitedFrom(InputStream inputStream) {
            return (TingPlayItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayItem parseFrom(ByteBuffer byteBuffer) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingPlayItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFinderInfo(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.finderInfo_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setIsTry(boolean z) {
            this.bitField0_ |= 8;
            this.isTry_ = z;
        }

        /* access modifiers changed from: private */
        public void setQualityType(int i) {
            this.bitField0_ |= 16;
            this.qualityType_ = i;
        }

        /* access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"bitField0_", "type_", "url_", "finderInfo_", "isTry_", "qualityType_"});
                case 3:
                    return new TingPlayItem();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingPlayItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingPlayItem.class) {
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

        public C16994k getFinderInfo() {
            return this.finderInfo_;
        }

        public boolean getIsTry() {
            return this.isTry_;
        }

        public int getQualityType() {
            return this.qualityType_;
        }

        public int getType() {
            return this.type_;
        }

        public String getUrl() {
            return this.url_;
        }

        public C16994k getUrlBytes() {
            return C16994k.m16791k(this.url_);
        }

        public boolean hasFinderInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasIsTry() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasQualityType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TingPlayItem tingPlayItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingPlayItem);
        }

        public static TingPlayItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingPlayItem parseFrom(C16994k kVar) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingPlayItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingPlayItem parseFrom(byte[] bArr) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingPlayItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingPlayItem parseFrom(InputStream inputStream) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayItem parseFrom(C23856l lVar) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingPlayItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingPlayItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingPlayItemOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getFinderInfo();

        boolean getIsTry();

        int getQualityType();

        int getType();

        String getUrl();

        C16994k getUrlBytes();

        boolean hasFinderInfo();

        boolean hasIsTry();

        boolean hasQualityType();

        boolean hasType();

        boolean hasUrl();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingPlayerContext extends C23861l0<TingPlayerContext, Builder> implements TingPlayerContextOrBuilder {
        /* access modifiers changed from: private */
        public static final TingPlayerContext DEFAULT_INSTANCE;
        public static final int GETLINKINFO_FIELD_NUMBER = 3;
        public static final int ORIGINALITEM_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingPlayerContext> PARSER = null;
        public static final int PLAYINGITEM_FIELD_NUMBER = 1;
        public static final int PLAYITEM_FIELD_NUMBER = 4;
        private int bitField0_;
        private TingGetLinkInfo getLinkInfo_;
        private byte memoizedIsInitialized = 2;
        private TingItem originalItem_;
        private TingPlayItem playItem_;
        private TingItem playingItem_;

        public static final class Builder extends C23861l0.C23862a<TingPlayerContext, Builder> implements TingPlayerContextOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearGetLinkInfo() {
                copyOnWrite();
                ((TingPlayerContext) this.instance).clearGetLinkInfo();
                return this;
            }

            public Builder clearOriginalItem() {
                copyOnWrite();
                ((TingPlayerContext) this.instance).clearOriginalItem();
                return this;
            }

            public Builder clearPlayItem() {
                copyOnWrite();
                ((TingPlayerContext) this.instance).clearPlayItem();
                return this;
            }

            public Builder clearPlayingItem() {
                copyOnWrite();
                ((TingPlayerContext) this.instance).clearPlayingItem();
                return this;
            }

            public TingGetLinkInfo getGetLinkInfo() {
                return ((TingPlayerContext) this.instance).getGetLinkInfo();
            }

            public TingItem getOriginalItem() {
                return ((TingPlayerContext) this.instance).getOriginalItem();
            }

            public TingPlayItem getPlayItem() {
                return ((TingPlayerContext) this.instance).getPlayItem();
            }

            public TingItem getPlayingItem() {
                return ((TingPlayerContext) this.instance).getPlayingItem();
            }

            public boolean hasGetLinkInfo() {
                return ((TingPlayerContext) this.instance).hasGetLinkInfo();
            }

            public boolean hasOriginalItem() {
                return ((TingPlayerContext) this.instance).hasOriginalItem();
            }

            public boolean hasPlayItem() {
                return ((TingPlayerContext) this.instance).hasPlayItem();
            }

            public boolean hasPlayingItem() {
                return ((TingPlayerContext) this.instance).hasPlayingItem();
            }

            public Builder mergeGetLinkInfo(TingGetLinkInfo tingGetLinkInfo) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).mergeGetLinkInfo(tingGetLinkInfo);
                return this;
            }

            public Builder mergeOriginalItem(TingItem tingItem) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).mergeOriginalItem(tingItem);
                return this;
            }

            public Builder mergePlayItem(TingPlayItem tingPlayItem) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).mergePlayItem(tingPlayItem);
                return this;
            }

            public Builder mergePlayingItem(TingItem tingItem) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).mergePlayingItem(tingItem);
                return this;
            }

            public Builder setGetLinkInfo(TingGetLinkInfo tingGetLinkInfo) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).setGetLinkInfo(tingGetLinkInfo);
                return this;
            }

            public Builder setOriginalItem(TingItem tingItem) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).setOriginalItem(tingItem);
                return this;
            }

            public Builder setPlayItem(TingPlayItem tingPlayItem) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).setPlayItem(tingPlayItem);
                return this;
            }

            public Builder setPlayingItem(TingItem tingItem) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).setPlayingItem(tingItem);
                return this;
            }

            private Builder() {
                super(TingPlayerContext.DEFAULT_INSTANCE);
            }

            public Builder setGetLinkInfo(TingGetLinkInfo.Builder builder) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).setGetLinkInfo((TingGetLinkInfo) builder.build());
                return this;
            }

            public Builder setOriginalItem(TingItem.Builder builder) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).setOriginalItem((TingItem) builder.build());
                return this;
            }

            public Builder setPlayItem(TingPlayItem.Builder builder) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).setPlayItem((TingPlayItem) builder.build());
                return this;
            }

            public Builder setPlayingItem(TingItem.Builder builder) {
                copyOnWrite();
                ((TingPlayerContext) this.instance).setPlayingItem((TingItem) builder.build());
                return this;
            }
        }

        static {
            TingPlayerContext tingPlayerContext = new TingPlayerContext();
            DEFAULT_INSTANCE = tingPlayerContext;
            C23861l0.registerDefaultInstance(TingPlayerContext.class, tingPlayerContext);
        }

        private TingPlayerContext() {
        }

        /* access modifiers changed from: private */
        public void clearGetLinkInfo() {
            this.getLinkInfo_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearOriginalItem() {
            this.originalItem_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearPlayItem() {
            this.playItem_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearPlayingItem() {
            this.playingItem_ = null;
            this.bitField0_ &= -2;
        }

        public static TingPlayerContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeGetLinkInfo(TingGetLinkInfo tingGetLinkInfo) {
            tingGetLinkInfo.getClass();
            TingGetLinkInfo tingGetLinkInfo2 = this.getLinkInfo_;
            if (tingGetLinkInfo2 == null || tingGetLinkInfo2 == TingGetLinkInfo.getDefaultInstance()) {
                this.getLinkInfo_ = tingGetLinkInfo;
            } else {
                this.getLinkInfo_ = (TingGetLinkInfo) ((TingGetLinkInfo.Builder) TingGetLinkInfo.newBuilder(this.getLinkInfo_).mergeFrom(tingGetLinkInfo)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeOriginalItem(TingItem tingItem) {
            tingItem.getClass();
            TingItem tingItem2 = this.originalItem_;
            if (tingItem2 == null || tingItem2 == TingItem.getDefaultInstance()) {
                this.originalItem_ = tingItem;
            } else {
                this.originalItem_ = (TingItem) ((TingItem.Builder) TingItem.newBuilder(this.originalItem_).mergeFrom(tingItem)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergePlayItem(TingPlayItem tingPlayItem) {
            tingPlayItem.getClass();
            TingPlayItem tingPlayItem2 = this.playItem_;
            if (tingPlayItem2 == null || tingPlayItem2 == TingPlayItem.getDefaultInstance()) {
                this.playItem_ = tingPlayItem;
            } else {
                this.playItem_ = (TingPlayItem) ((TingPlayItem.Builder) TingPlayItem.newBuilder(this.playItem_).mergeFrom(tingPlayItem)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergePlayingItem(TingItem tingItem) {
            tingItem.getClass();
            TingItem tingItem2 = this.playingItem_;
            if (tingItem2 == null || tingItem2 == TingItem.getDefaultInstance()) {
                this.playingItem_ = tingItem;
            } else {
                this.playingItem_ = (TingItem) ((TingItem.Builder) TingItem.newBuilder(this.playingItem_).mergeFrom(tingItem)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingPlayerContext parseDelimitedFrom(InputStream inputStream) {
            return (TingPlayerContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayerContext parseFrom(ByteBuffer byteBuffer) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingPlayerContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setGetLinkInfo(TingGetLinkInfo tingGetLinkInfo) {
            tingGetLinkInfo.getClass();
            this.getLinkInfo_ = tingGetLinkInfo;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setOriginalItem(TingItem tingItem) {
            tingItem.getClass();
            this.originalItem_ = tingItem;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setPlayItem(TingPlayItem tingPlayItem) {
            tingPlayItem.getClass();
            this.playItem_ = tingPlayItem;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setPlayingItem(TingItem tingItem) {
            tingItem.getClass();
            this.playingItem_ = tingItem;
            this.bitField0_ |= 1;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "playingItem_", "originalItem_", "getLinkInfo_", "playItem_"});
                case 3:
                    return new TingPlayerContext();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingPlayerContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingPlayerContext.class) {
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

        public TingGetLinkInfo getGetLinkInfo() {
            TingGetLinkInfo tingGetLinkInfo = this.getLinkInfo_;
            return tingGetLinkInfo == null ? TingGetLinkInfo.getDefaultInstance() : tingGetLinkInfo;
        }

        public TingItem getOriginalItem() {
            TingItem tingItem = this.originalItem_;
            return tingItem == null ? TingItem.getDefaultInstance() : tingItem;
        }

        public TingPlayItem getPlayItem() {
            TingPlayItem tingPlayItem = this.playItem_;
            return tingPlayItem == null ? TingPlayItem.getDefaultInstance() : tingPlayItem;
        }

        public TingItem getPlayingItem() {
            TingItem tingItem = this.playingItem_;
            return tingItem == null ? TingItem.getDefaultInstance() : tingItem;
        }

        public boolean hasGetLinkInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasOriginalItem() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPlayItem() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPlayingItem() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingPlayerContext tingPlayerContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingPlayerContext);
        }

        public static TingPlayerContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayerContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayerContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingPlayerContext parseFrom(C16994k kVar) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingPlayerContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingPlayerContext parseFrom(byte[] bArr) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingPlayerContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingPlayerContext parseFrom(InputStream inputStream) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayerContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayerContext parseFrom(C23856l lVar) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingPlayerContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingPlayerContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingPlayerContextOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingGetLinkInfo getGetLinkInfo();

        TingItem getOriginalItem();

        TingPlayItem getPlayItem();

        TingItem getPlayingItem();

        boolean hasGetLinkInfo();

        boolean hasOriginalItem();

        boolean hasPlayItem();

        boolean hasPlayingItem();

        /* synthetic */ boolean isInitialized();
    }

    public enum TingPlayerErrorCode implements C23908o0.C23911c {
        unplayable(1),
        networkError(2),
        isSpam(3);
        
        private static final C23908o0.C23912d<TingPlayerErrorCode> internalValueMap = null;
        public static final int isSpam_VALUE = 3;
        public static final int networkError_VALUE = 2;
        public static final int unplayable_VALUE = 1;
        private final int value;

        public static final class TingPlayerErrorCodeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new TingPlayerErrorCodeVerifier();
            }

            private TingPlayerErrorCodeVerifier() {
            }

            public boolean isInRange(int i) {
                return TingPlayerErrorCode.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<TingPlayerErrorCode>() {
                public TingPlayerErrorCode findValueByNumber(int i) {
                    return TingPlayerErrorCode.forNumber(i);
                }
            };
        }

        private TingPlayerErrorCode(int i) {
            this.value = i;
        }

        public static TingPlayerErrorCode forNumber(int i) {
            if (i == 1) {
                return unplayable;
            }
            if (i == 2) {
                return networkError;
            }
            if (i != 3) {
                return null;
            }
            return isSpam;
        }

        public static C23908o0.C23912d<TingPlayerErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return TingPlayerErrorCodeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TingPlayerErrorCode valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum TingScene implements C23908o0.C23911c {
        TingScene_UnDefined(0),
        TingScene_InnerStart(1),
        TingScene_MediaControlCenter(5),
        TingScene_Player(12),
        TingScene_PlayingList(13),
        TingScene_RelatedInfo(14),
        TingScene_Square(20),
        TingScene_SquareMore(21),
        TingScene_SquareSearch(22),
        TingScene_MyCategory(23),
        TingScene_LikedList(30),
        TingScene_HistoryList(31),
        TingScene_Album(32),
        TingScene_SingerWiki(33),
        TingScene_AudioWiki(34),
        TingScene_UgcPlayList(35),
        TingScene_RecommandPlayList(36),
        TingScene_Radio(37),
        TingScene_InnerEnd(1000),
        TingScene_Debug(1001),
        TingScene_Minimization(1002),
        TingScene_MpAudio(1101),
        TingScene_MpAlbum(1102),
        TingScene_MpMusic(1103),
        TingScene_BrandTimeline(1210),
        TingScene_BrandChat(1211),
        TingScene_BrandProfile(TingScene_BrandProfile_VALUE),
        TingScene_Chat(1300),
        TingScene_ChatHistory(TingScene_ChatHistory_VALUE),
        TingScene_ChatMusicSearch(TingScene_ChatMusicSearch_VALUE),
        TingScene_Moment(TingScene_Moment_VALUE),
        TingScene_Fav(1500),
        TingScene_FinderProfileMusic(1600),
        TingScene_FinderLiteAppSinger(TingScene_FinderLiteAppSinger_VALUE),
        TingScene_FinderProfileSinger(TingScene_FinderProfileSinger_VALUE),
        TingScene_FinderProfileCategory(TingScene_FinderProfileCategory_VALUE),
        TingScene_WXSearch(2000),
        TingScene_TextState(2001),
        TingScene_RecentUsed(2002),
        TingScene_Shake(2004),
        TingScene_CommonWeb(2005);
        
        public static final int TingScene_Album_VALUE = 32;
        public static final int TingScene_AudioWiki_VALUE = 34;
        public static final int TingScene_BrandChat_VALUE = 1211;
        public static final int TingScene_BrandProfile_VALUE = 1212;
        public static final int TingScene_BrandTimeline_VALUE = 1210;
        public static final int TingScene_ChatHistory_VALUE = 1301;
        public static final int TingScene_ChatMusicSearch_VALUE = 1302;
        public static final int TingScene_Chat_VALUE = 1300;
        public static final int TingScene_CommonWeb_VALUE = 2005;
        public static final int TingScene_Debug_VALUE = 1001;
        public static final int TingScene_Fav_VALUE = 1500;
        public static final int TingScene_FinderLiteAppSinger_VALUE = 1601;
        public static final int TingScene_FinderProfileCategory_VALUE = 1603;
        public static final int TingScene_FinderProfileMusic_VALUE = 1600;
        public static final int TingScene_FinderProfileSinger_VALUE = 1602;
        public static final int TingScene_HistoryList_VALUE = 31;
        public static final int TingScene_InnerEnd_VALUE = 1000;
        public static final int TingScene_InnerStart_VALUE = 1;
        public static final int TingScene_LikedList_VALUE = 30;
        public static final int TingScene_MediaControlCenter_VALUE = 5;
        public static final int TingScene_Minimization_VALUE = 1002;
        public static final int TingScene_Moment_VALUE = 1400;
        public static final int TingScene_MpAlbum_VALUE = 1102;
        public static final int TingScene_MpAudio_VALUE = 1101;
        public static final int TingScene_MpMusic_VALUE = 1103;
        public static final int TingScene_MyCategory_VALUE = 23;
        public static final int TingScene_Player_VALUE = 12;
        public static final int TingScene_PlayingList_VALUE = 13;
        public static final int TingScene_Radio_VALUE = 37;
        public static final int TingScene_RecentUsed_VALUE = 2002;
        public static final int TingScene_RecommandPlayList_VALUE = 36;
        public static final int TingScene_RelatedInfo_VALUE = 14;
        public static final int TingScene_Shake_VALUE = 2004;
        public static final int TingScene_SingerWiki_VALUE = 33;
        public static final int TingScene_SquareMore_VALUE = 21;
        public static final int TingScene_SquareSearch_VALUE = 22;
        public static final int TingScene_Square_VALUE = 20;
        public static final int TingScene_TextState_VALUE = 2001;
        public static final int TingScene_UgcPlayList_VALUE = 35;
        public static final int TingScene_UnDefined_VALUE = 0;
        public static final int TingScene_WXSearch_VALUE = 2000;
        private static final C23908o0.C23912d<TingScene> internalValueMap = null;
        private final int value;

        public static final class TingSceneVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new TingSceneVerifier();
            }

            private TingSceneVerifier() {
            }

            public boolean isInRange(int i) {
                return TingScene.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<TingScene>() {
                public TingScene findValueByNumber(int i) {
                    return TingScene.forNumber(i);
                }
            };
        }

        private TingScene(int i) {
            this.value = i;
        }

        public static TingScene forNumber(int i) {
            switch (i) {
                case 0:
                    return TingScene_UnDefined;
                case 1:
                    return TingScene_InnerStart;
                case 5:
                    return TingScene_MediaControlCenter;
                case 12:
                    return TingScene_Player;
                case 13:
                    return TingScene_PlayingList;
                case 14:
                    return TingScene_RelatedInfo;
                case 20:
                    return TingScene_Square;
                case 21:
                    return TingScene_SquareMore;
                case 22:
                    return TingScene_SquareSearch;
                case 23:
                    return TingScene_MyCategory;
                case 30:
                    return TingScene_LikedList;
                case 31:
                    return TingScene_HistoryList;
                case 32:
                    return TingScene_Album;
                case 33:
                    return TingScene_SingerWiki;
                case 34:
                    return TingScene_AudioWiki;
                case 35:
                    return TingScene_UgcPlayList;
                case 36:
                    return TingScene_RecommandPlayList;
                case 37:
                    return TingScene_Radio;
                case 1000:
                    return TingScene_InnerEnd;
                case 1001:
                    return TingScene_Debug;
                case 1002:
                    return TingScene_Minimization;
                case 1101:
                    return TingScene_MpAudio;
                case 1102:
                    return TingScene_MpAlbum;
                case 1103:
                    return TingScene_MpMusic;
                case 1210:
                    return TingScene_BrandTimeline;
                case 1211:
                    return TingScene_BrandChat;
                case TingScene_BrandProfile_VALUE:
                    return TingScene_BrandProfile;
                case 1300:
                    return TingScene_Chat;
                case TingScene_ChatHistory_VALUE:
                    return TingScene_ChatHistory;
                case TingScene_ChatMusicSearch_VALUE:
                    return TingScene_ChatMusicSearch;
                case TingScene_Moment_VALUE:
                    return TingScene_Moment;
                case 1500:
                    return TingScene_Fav;
                case 1600:
                    return TingScene_FinderProfileMusic;
                case TingScene_FinderLiteAppSinger_VALUE:
                    return TingScene_FinderLiteAppSinger;
                case TingScene_FinderProfileSinger_VALUE:
                    return TingScene_FinderProfileSinger;
                case TingScene_FinderProfileCategory_VALUE:
                    return TingScene_FinderProfileCategory;
                case 2000:
                    return TingScene_WXSearch;
                case 2001:
                    return TingScene_TextState;
                case 2002:
                    return TingScene_RecentUsed;
                case 2004:
                    return TingScene_Shake;
                case 2005:
                    return TingScene_CommonWeb;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<TingScene> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return TingSceneVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TingScene valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class TingShareCategoryItem extends C23861l0<TingShareCategoryItem, Builder> implements TingShareCategoryItemOrBuilder {
        public static final int CATEGORYITEM_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TingShareCategoryItem DEFAULT_INSTANCE;
        private static volatile C24062w1<TingShareCategoryItem> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private TingProto.MMListenCategoryItem categoryItem_;
        private int type_;

        public static final class Builder extends C23861l0.C23862a<TingShareCategoryItem, Builder> implements TingShareCategoryItemOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearCategoryItem() {
                copyOnWrite();
                ((TingShareCategoryItem) this.instance).clearCategoryItem();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TingShareCategoryItem) this.instance).clearType();
                return this;
            }

            public TingProto.MMListenCategoryItem getCategoryItem() {
                return ((TingShareCategoryItem) this.instance).getCategoryItem();
            }

            public int getType() {
                return ((TingShareCategoryItem) this.instance).getType();
            }

            public boolean hasCategoryItem() {
                return ((TingShareCategoryItem) this.instance).hasCategoryItem();
            }

            public boolean hasType() {
                return ((TingShareCategoryItem) this.instance).hasType();
            }

            public Builder mergeCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
                copyOnWrite();
                ((TingShareCategoryItem) this.instance).mergeCategoryItem(mMListenCategoryItem);
                return this;
            }

            public Builder setCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
                copyOnWrite();
                ((TingShareCategoryItem) this.instance).setCategoryItem(mMListenCategoryItem);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((TingShareCategoryItem) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(TingShareCategoryItem.DEFAULT_INSTANCE);
            }

            public Builder setCategoryItem(TingProto.MMListenCategoryItem.Builder builder) {
                copyOnWrite();
                ((TingShareCategoryItem) this.instance).setCategoryItem((TingProto.MMListenCategoryItem) builder.build());
                return this;
            }
        }

        static {
            TingShareCategoryItem tingShareCategoryItem = new TingShareCategoryItem();
            DEFAULT_INSTANCE = tingShareCategoryItem;
            C23861l0.registerDefaultInstance(TingShareCategoryItem.class, tingShareCategoryItem);
        }

        private TingShareCategoryItem() {
        }

        /* access modifiers changed from: private */
        public void clearCategoryItem() {
            this.categoryItem_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static TingShareCategoryItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
            mMListenCategoryItem.getClass();
            TingProto.MMListenCategoryItem mMListenCategoryItem2 = this.categoryItem_;
            if (mMListenCategoryItem2 == null || mMListenCategoryItem2 == TingProto.MMListenCategoryItem.getDefaultInstance()) {
                this.categoryItem_ = mMListenCategoryItem;
            } else {
                this.categoryItem_ = (TingProto.MMListenCategoryItem) ((TingProto.MMListenCategoryItem.Builder) TingProto.MMListenCategoryItem.newBuilder(this.categoryItem_).mergeFrom(mMListenCategoryItem)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingShareCategoryItem parseDelimitedFrom(InputStream inputStream) {
            return (TingShareCategoryItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingShareCategoryItem parseFrom(ByteBuffer byteBuffer) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingShareCategoryItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
            mMListenCategoryItem.getClass();
            this.categoryItem_ = mMListenCategoryItem;
            this.bitField0_ |= 2;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "type_", "categoryItem_"});
                case 3:
                    return new TingShareCategoryItem();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingShareCategoryItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingShareCategoryItem.class) {
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

        public TingProto.MMListenCategoryItem getCategoryItem() {
            TingProto.MMListenCategoryItem mMListenCategoryItem = this.categoryItem_;
            return mMListenCategoryItem == null ? TingProto.MMListenCategoryItem.getDefaultInstance() : mMListenCategoryItem;
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasCategoryItem() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingShareCategoryItem tingShareCategoryItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingShareCategoryItem);
        }

        public static TingShareCategoryItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingShareCategoryItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingShareCategoryItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingShareCategoryItem parseFrom(C16994k kVar) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingShareCategoryItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingShareCategoryItem parseFrom(byte[] bArr) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingShareCategoryItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingShareCategoryItem parseFrom(InputStream inputStream) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingShareCategoryItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingShareCategoryItem parseFrom(C23856l lVar) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingShareCategoryItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingShareCategoryItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingShareCategoryItemOrBuilder extends C23848k1 {
        TingProto.MMListenCategoryItem getCategoryItem();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getType();

        boolean hasCategoryItem();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingShareListenItem extends C23861l0<TingShareListenItem, Builder> implements TingShareListenItemOrBuilder {
        /* access modifiers changed from: private */
        public static final TingShareListenItem DEFAULT_INSTANCE;
        public static final int LISTENITEM_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingShareListenItem> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private TingProto.MMListenItem listenItem_;
        private int type_;

        public static final class Builder extends C23861l0.C23862a<TingShareListenItem, Builder> implements TingShareListenItemOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearListenItem() {
                copyOnWrite();
                ((TingShareListenItem) this.instance).clearListenItem();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TingShareListenItem) this.instance).clearType();
                return this;
            }

            public TingProto.MMListenItem getListenItem() {
                return ((TingShareListenItem) this.instance).getListenItem();
            }

            public int getType() {
                return ((TingShareListenItem) this.instance).getType();
            }

            public boolean hasListenItem() {
                return ((TingShareListenItem) this.instance).hasListenItem();
            }

            public boolean hasType() {
                return ((TingShareListenItem) this.instance).hasType();
            }

            public Builder mergeListenItem(TingProto.MMListenItem mMListenItem) {
                copyOnWrite();
                ((TingShareListenItem) this.instance).mergeListenItem(mMListenItem);
                return this;
            }

            public Builder setListenItem(TingProto.MMListenItem mMListenItem) {
                copyOnWrite();
                ((TingShareListenItem) this.instance).setListenItem(mMListenItem);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((TingShareListenItem) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(TingShareListenItem.DEFAULT_INSTANCE);
            }

            public Builder setListenItem(TingProto.MMListenItem.Builder builder) {
                copyOnWrite();
                ((TingShareListenItem) this.instance).setListenItem((TingProto.MMListenItem) builder.build());
                return this;
            }
        }

        static {
            TingShareListenItem tingShareListenItem = new TingShareListenItem();
            DEFAULT_INSTANCE = tingShareListenItem;
            C23861l0.registerDefaultInstance(TingShareListenItem.class, tingShareListenItem);
        }

        private TingShareListenItem() {
        }

        /* access modifiers changed from: private */
        public void clearListenItem() {
            this.listenItem_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static TingShareListenItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeListenItem(TingProto.MMListenItem mMListenItem) {
            mMListenItem.getClass();
            TingProto.MMListenItem mMListenItem2 = this.listenItem_;
            if (mMListenItem2 == null || mMListenItem2 == TingProto.MMListenItem.getDefaultInstance()) {
                this.listenItem_ = mMListenItem;
            } else {
                this.listenItem_ = (TingProto.MMListenItem) ((TingProto.MMListenItem.Builder) TingProto.MMListenItem.newBuilder(this.listenItem_).mergeFrom(mMListenItem)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingShareListenItem parseDelimitedFrom(InputStream inputStream) {
            return (TingShareListenItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingShareListenItem parseFrom(ByteBuffer byteBuffer) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingShareListenItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setListenItem(TingProto.MMListenItem mMListenItem) {
            mMListenItem.getClass();
            this.listenItem_ = mMListenItem;
            this.bitField0_ |= 2;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "type_", "listenItem_"});
                case 3:
                    return new TingShareListenItem();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingShareListenItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingShareListenItem.class) {
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

        public TingProto.MMListenItem getListenItem() {
            TingProto.MMListenItem mMListenItem = this.listenItem_;
            return mMListenItem == null ? TingProto.MMListenItem.getDefaultInstance() : mMListenItem;
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasListenItem() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingShareListenItem tingShareListenItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingShareListenItem);
        }

        public static TingShareListenItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingShareListenItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingShareListenItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingShareListenItem parseFrom(C16994k kVar) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingShareListenItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingShareListenItem parseFrom(byte[] bArr) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingShareListenItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingShareListenItem parseFrom(InputStream inputStream) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingShareListenItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingShareListenItem parseFrom(C23856l lVar) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingShareListenItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingShareListenItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingShareListenItemOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingProto.MMListenItem getListenItem();

        int getType();

        boolean hasListenItem();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingTapeInfo extends C23861l0<TingTapeInfo, Builder> implements TingTapeInfoOrBuilder {
        public static final int CATEGORYITEM_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final TingTapeInfo DEFAULT_INSTANCE;
        public static final int LASTMODIFIEDTIME_FIELD_NUMBER = 4;
        public static final int LISTENITEM_FIELD_NUMBER = 1;
        private static volatile C24062w1<TingTapeInfo> PARSER = null;
        public static final int PLAYINGITEMINDEX_FIELD_NUMBER = 5;
        public static final int PLAYINGITEM_FIELD_NUMBER = 3;
        private int bitField0_;
        private TingProto.MMListenCategoryItem categoryItem_;
        private int lastModifiedTime_;
        private TingProto.MMListenItem listenItem_;
        private int playingItemIndex_;
        private TingProto.MMListenItem playingItem_;

        public static final class Builder extends C23861l0.C23862a<TingTapeInfo, Builder> implements TingTapeInfoOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearCategoryItem() {
                copyOnWrite();
                ((TingTapeInfo) this.instance).clearCategoryItem();
                return this;
            }

            public Builder clearLastModifiedTime() {
                copyOnWrite();
                ((TingTapeInfo) this.instance).clearLastModifiedTime();
                return this;
            }

            public Builder clearListenItem() {
                copyOnWrite();
                ((TingTapeInfo) this.instance).clearListenItem();
                return this;
            }

            public Builder clearPlayingItem() {
                copyOnWrite();
                ((TingTapeInfo) this.instance).clearPlayingItem();
                return this;
            }

            public Builder clearPlayingItemIndex() {
                copyOnWrite();
                ((TingTapeInfo) this.instance).clearPlayingItemIndex();
                return this;
            }

            public TingProto.MMListenCategoryItem getCategoryItem() {
                return ((TingTapeInfo) this.instance).getCategoryItem();
            }

            public int getLastModifiedTime() {
                return ((TingTapeInfo) this.instance).getLastModifiedTime();
            }

            public TingProto.MMListenItem getListenItem() {
                return ((TingTapeInfo) this.instance).getListenItem();
            }

            public TingProto.MMListenItem getPlayingItem() {
                return ((TingTapeInfo) this.instance).getPlayingItem();
            }

            public int getPlayingItemIndex() {
                return ((TingTapeInfo) this.instance).getPlayingItemIndex();
            }

            public boolean hasCategoryItem() {
                return ((TingTapeInfo) this.instance).hasCategoryItem();
            }

            public boolean hasLastModifiedTime() {
                return ((TingTapeInfo) this.instance).hasLastModifiedTime();
            }

            public boolean hasListenItem() {
                return ((TingTapeInfo) this.instance).hasListenItem();
            }

            public boolean hasPlayingItem() {
                return ((TingTapeInfo) this.instance).hasPlayingItem();
            }

            public boolean hasPlayingItemIndex() {
                return ((TingTapeInfo) this.instance).hasPlayingItemIndex();
            }

            public Builder mergeCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).mergeCategoryItem(mMListenCategoryItem);
                return this;
            }

            public Builder mergeListenItem(TingProto.MMListenItem mMListenItem) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).mergeListenItem(mMListenItem);
                return this;
            }

            public Builder mergePlayingItem(TingProto.MMListenItem mMListenItem) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).mergePlayingItem(mMListenItem);
                return this;
            }

            public Builder setCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).setCategoryItem(mMListenCategoryItem);
                return this;
            }

            public Builder setLastModifiedTime(int i) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).setLastModifiedTime(i);
                return this;
            }

            public Builder setListenItem(TingProto.MMListenItem mMListenItem) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).setListenItem(mMListenItem);
                return this;
            }

            public Builder setPlayingItem(TingProto.MMListenItem mMListenItem) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).setPlayingItem(mMListenItem);
                return this;
            }

            public Builder setPlayingItemIndex(int i) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).setPlayingItemIndex(i);
                return this;
            }

            private Builder() {
                super(TingTapeInfo.DEFAULT_INSTANCE);
            }

            public Builder setCategoryItem(TingProto.MMListenCategoryItem.Builder builder) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).setCategoryItem((TingProto.MMListenCategoryItem) builder.build());
                return this;
            }

            public Builder setListenItem(TingProto.MMListenItem.Builder builder) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).setListenItem((TingProto.MMListenItem) builder.build());
                return this;
            }

            public Builder setPlayingItem(TingProto.MMListenItem.Builder builder) {
                copyOnWrite();
                ((TingTapeInfo) this.instance).setPlayingItem((TingProto.MMListenItem) builder.build());
                return this;
            }
        }

        static {
            TingTapeInfo tingTapeInfo = new TingTapeInfo();
            DEFAULT_INSTANCE = tingTapeInfo;
            C23861l0.registerDefaultInstance(TingTapeInfo.class, tingTapeInfo);
        }

        private TingTapeInfo() {
        }

        /* access modifiers changed from: private */
        public void clearCategoryItem() {
            this.categoryItem_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearLastModifiedTime() {
            this.bitField0_ &= -9;
            this.lastModifiedTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearListenItem() {
            this.listenItem_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearPlayingItem() {
            this.playingItem_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearPlayingItemIndex() {
            this.bitField0_ &= -17;
            this.playingItemIndex_ = 0;
        }

        public static TingTapeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
            mMListenCategoryItem.getClass();
            TingProto.MMListenCategoryItem mMListenCategoryItem2 = this.categoryItem_;
            if (mMListenCategoryItem2 == null || mMListenCategoryItem2 == TingProto.MMListenCategoryItem.getDefaultInstance()) {
                this.categoryItem_ = mMListenCategoryItem;
            } else {
                this.categoryItem_ = (TingProto.MMListenCategoryItem) ((TingProto.MMListenCategoryItem.Builder) TingProto.MMListenCategoryItem.newBuilder(this.categoryItem_).mergeFrom(mMListenCategoryItem)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeListenItem(TingProto.MMListenItem mMListenItem) {
            mMListenItem.getClass();
            TingProto.MMListenItem mMListenItem2 = this.listenItem_;
            if (mMListenItem2 == null || mMListenItem2 == TingProto.MMListenItem.getDefaultInstance()) {
                this.listenItem_ = mMListenItem;
            } else {
                this.listenItem_ = (TingProto.MMListenItem) ((TingProto.MMListenItem.Builder) TingProto.MMListenItem.newBuilder(this.listenItem_).mergeFrom(mMListenItem)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergePlayingItem(TingProto.MMListenItem mMListenItem) {
            mMListenItem.getClass();
            TingProto.MMListenItem mMListenItem2 = this.playingItem_;
            if (mMListenItem2 == null || mMListenItem2 == TingProto.MMListenItem.getDefaultInstance()) {
                this.playingItem_ = mMListenItem;
            } else {
                this.playingItem_ = (TingProto.MMListenItem) ((TingProto.MMListenItem.Builder) TingProto.MMListenItem.newBuilder(this.playingItem_).mergeFrom(mMListenItem)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingTapeInfo parseDelimitedFrom(InputStream inputStream) {
            return (TingTapeInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTapeInfo parseFrom(ByteBuffer byteBuffer) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingTapeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCategoryItem(TingProto.MMListenCategoryItem mMListenCategoryItem) {
            mMListenCategoryItem.getClass();
            this.categoryItem_ = mMListenCategoryItem;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setLastModifiedTime(int i) {
            this.bitField0_ |= 8;
            this.lastModifiedTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setListenItem(TingProto.MMListenItem mMListenItem) {
            mMListenItem.getClass();
            this.listenItem_ = mMListenItem;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setPlayingItem(TingProto.MMListenItem mMListenItem) {
            mMListenItem.getClass();
            this.playingItem_ = mMListenItem;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setPlayingItemIndex(int i) {
            this.bitField0_ |= 16;
            this.playingItemIndex_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"bitField0_", "listenItem_", "categoryItem_", "playingItem_", "lastModifiedTime_", "playingItemIndex_"});
                case 3:
                    return new TingTapeInfo();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingTapeInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingTapeInfo.class) {
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

        public TingProto.MMListenCategoryItem getCategoryItem() {
            TingProto.MMListenCategoryItem mMListenCategoryItem = this.categoryItem_;
            return mMListenCategoryItem == null ? TingProto.MMListenCategoryItem.getDefaultInstance() : mMListenCategoryItem;
        }

        public int getLastModifiedTime() {
            return this.lastModifiedTime_;
        }

        public TingProto.MMListenItem getListenItem() {
            TingProto.MMListenItem mMListenItem = this.listenItem_;
            return mMListenItem == null ? TingProto.MMListenItem.getDefaultInstance() : mMListenItem;
        }

        public TingProto.MMListenItem getPlayingItem() {
            TingProto.MMListenItem mMListenItem = this.playingItem_;
            return mMListenItem == null ? TingProto.MMListenItem.getDefaultInstance() : mMListenItem;
        }

        public int getPlayingItemIndex() {
            return this.playingItemIndex_;
        }

        public boolean hasCategoryItem() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLastModifiedTime() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasListenItem() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPlayingItem() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPlayingItemIndex() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(TingTapeInfo tingTapeInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingTapeInfo);
        }

        public static TingTapeInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTapeInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTapeInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingTapeInfo parseFrom(C16994k kVar) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingTapeInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingTapeInfo parseFrom(byte[] bArr) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingTapeInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingTapeInfo parseFrom(InputStream inputStream) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTapeInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTapeInfo parseFrom(C23856l lVar) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingTapeInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingTapeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class TingTapeInfoList extends C23861l0<TingTapeInfoList, Builder> implements TingTapeInfoListOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final TingTapeInfoList DEFAULT_INSTANCE;
        private static volatile C24062w1<TingTapeInfoList> PARSER;
        private C23908o0.C23919j<TingTapeInfo> data_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<TingTapeInfoList, Builder> implements TingTapeInfoListOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder addAllData(Iterable<? extends TingTapeInfo> iterable) {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).addAllData(iterable);
                return this;
            }

            public Builder addData(TingTapeInfo tingTapeInfo) {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).addData(tingTapeInfo);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).clearData();
                return this;
            }

            public TingTapeInfo getData(int i) {
                return ((TingTapeInfoList) this.instance).getData(i);
            }

            public int getDataCount() {
                return ((TingTapeInfoList) this.instance).getDataCount();
            }

            public List<TingTapeInfo> getDataList() {
                return Collections.unmodifiableList(((TingTapeInfoList) this.instance).getDataList());
            }

            public Builder removeData(int i) {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).removeData(i);
                return this;
            }

            public Builder setData(int i, TingTapeInfo tingTapeInfo) {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).setData(i, tingTapeInfo);
                return this;
            }

            private Builder() {
                super(TingTapeInfoList.DEFAULT_INSTANCE);
            }

            public Builder addData(int i, TingTapeInfo tingTapeInfo) {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).addData(i, tingTapeInfo);
                return this;
            }

            public Builder setData(int i, TingTapeInfo.Builder builder) {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).setData(i, (TingTapeInfo) builder.build());
                return this;
            }

            public Builder addData(TingTapeInfo.Builder builder) {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).addData((TingTapeInfo) builder.build());
                return this;
            }

            public Builder addData(int i, TingTapeInfo.Builder builder) {
                copyOnWrite();
                ((TingTapeInfoList) this.instance).addData(i, (TingTapeInfo) builder.build());
                return this;
            }
        }

        static {
            TingTapeInfoList tingTapeInfoList = new TingTapeInfoList();
            DEFAULT_INSTANCE = tingTapeInfoList;
            C23861l0.registerDefaultInstance(TingTapeInfoList.class, tingTapeInfoList);
        }

        private TingTapeInfoList() {
        }

        /* access modifiers changed from: private */
        public void addAllData(Iterable<? extends TingTapeInfo> iterable) {
            ensureDataIsMutable();
            C23810b.addAll(iterable, this.data_);
        }

        /* access modifiers changed from: private */
        public void addData(TingTapeInfo tingTapeInfo) {
            tingTapeInfo.getClass();
            ensureDataIsMutable();
            this.data_.add(tingTapeInfo);
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.data_ = C23861l0.emptyProtobufList();
        }

        private void ensureDataIsMutable() {
            C23908o0.C23919j<TingTapeInfo> jVar = this.data_;
            if (!jVar.mo37523Q()) {
                this.data_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static TingTapeInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingTapeInfoList parseDelimitedFrom(InputStream inputStream) {
            return (TingTapeInfoList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTapeInfoList parseFrom(ByteBuffer byteBuffer) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingTapeInfoList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeData(int i) {
            ensureDataIsMutable();
            this.data_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setData(int i, TingTapeInfo tingTapeInfo) {
            tingTapeInfo.getClass();
            ensureDataIsMutable();
            this.data_.set(i, tingTapeInfo);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"data_", TingTapeInfo.class});
                case 3:
                    return new TingTapeInfoList();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingTapeInfoList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingTapeInfoList.class) {
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

        public TingTapeInfo getData(int i) {
            return this.data_.get(i);
        }

        public int getDataCount() {
            return this.data_.size();
        }

        public List<TingTapeInfo> getDataList() {
            return this.data_;
        }

        public TingTapeInfoOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
        }

        public List<? extends TingTapeInfoOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        public static Builder newBuilder(TingTapeInfoList tingTapeInfoList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingTapeInfoList);
        }

        public static TingTapeInfoList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTapeInfoList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTapeInfoList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingTapeInfoList parseFrom(C16994k kVar) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addData(int i, TingTapeInfo tingTapeInfo) {
            tingTapeInfo.getClass();
            ensureDataIsMutable();
            this.data_.add(i, tingTapeInfo);
        }

        public static TingTapeInfoList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingTapeInfoList parseFrom(byte[] bArr) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingTapeInfoList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingTapeInfoList parseFrom(InputStream inputStream) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTapeInfoList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTapeInfoList parseFrom(C23856l lVar) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingTapeInfoList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingTapeInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingTapeInfoListOrBuilder extends C23848k1 {
        TingTapeInfo getData(int i);

        int getDataCount();

        List<TingTapeInfo> getDataList();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public interface TingTapeInfoOrBuilder extends C23848k1 {
        TingProto.MMListenCategoryItem getCategoryItem();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getLastModifiedTime();

        TingProto.MMListenItem getListenItem();

        TingProto.MMListenItem getPlayingItem();

        int getPlayingItemIndex();

        boolean hasCategoryItem();

        boolean hasLastModifiedTime();

        boolean hasListenItem();

        boolean hasPlayingItem();

        boolean hasPlayingItemIndex();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingTapeItem extends C23861l0<TingTapeItem, Builder> implements TingTapeItemOrBuilder {
        public static final int CATEGORYITEM_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TingTapeItem DEFAULT_INSTANCE;
        public static final int LOCALLIST_FIELD_NUMBER = 4;
        private static volatile C24062w1<TingTapeItem> PARSER = null;
        public static final int TINGITEM_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private TingCategoryItem categoryItem_;
        private C23908o0.C23919j<TingItem> localList_ = C23861l0.emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private TingItem tingItem_;
        private int type_;

        public static final class Builder extends C23861l0.C23862a<TingTapeItem, Builder> implements TingTapeItemOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder addAllLocalList(Iterable<? extends TingItem> iterable) {
                copyOnWrite();
                ((TingTapeItem) this.instance).addAllLocalList(iterable);
                return this;
            }

            public Builder addLocalList(TingItem tingItem) {
                copyOnWrite();
                ((TingTapeItem) this.instance).addLocalList(tingItem);
                return this;
            }

            public Builder clearCategoryItem() {
                copyOnWrite();
                ((TingTapeItem) this.instance).clearCategoryItem();
                return this;
            }

            public Builder clearLocalList() {
                copyOnWrite();
                ((TingTapeItem) this.instance).clearLocalList();
                return this;
            }

            public Builder clearTingItem() {
                copyOnWrite();
                ((TingTapeItem) this.instance).clearTingItem();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((TingTapeItem) this.instance).clearType();
                return this;
            }

            public TingCategoryItem getCategoryItem() {
                return ((TingTapeItem) this.instance).getCategoryItem();
            }

            public TingItem getLocalList(int i) {
                return ((TingTapeItem) this.instance).getLocalList(i);
            }

            public int getLocalListCount() {
                return ((TingTapeItem) this.instance).getLocalListCount();
            }

            public List<TingItem> getLocalListList() {
                return Collections.unmodifiableList(((TingTapeItem) this.instance).getLocalListList());
            }

            public TingItem getTingItem() {
                return ((TingTapeItem) this.instance).getTingItem();
            }

            public int getType() {
                return ((TingTapeItem) this.instance).getType();
            }

            public boolean hasCategoryItem() {
                return ((TingTapeItem) this.instance).hasCategoryItem();
            }

            public boolean hasTingItem() {
                return ((TingTapeItem) this.instance).hasTingItem();
            }

            public boolean hasType() {
                return ((TingTapeItem) this.instance).hasType();
            }

            public Builder mergeCategoryItem(TingCategoryItem tingCategoryItem) {
                copyOnWrite();
                ((TingTapeItem) this.instance).mergeCategoryItem(tingCategoryItem);
                return this;
            }

            public Builder mergeTingItem(TingItem tingItem) {
                copyOnWrite();
                ((TingTapeItem) this.instance).mergeTingItem(tingItem);
                return this;
            }

            public Builder removeLocalList(int i) {
                copyOnWrite();
                ((TingTapeItem) this.instance).removeLocalList(i);
                return this;
            }

            public Builder setCategoryItem(TingCategoryItem tingCategoryItem) {
                copyOnWrite();
                ((TingTapeItem) this.instance).setCategoryItem(tingCategoryItem);
                return this;
            }

            public Builder setLocalList(int i, TingItem tingItem) {
                copyOnWrite();
                ((TingTapeItem) this.instance).setLocalList(i, tingItem);
                return this;
            }

            public Builder setTingItem(TingItem tingItem) {
                copyOnWrite();
                ((TingTapeItem) this.instance).setTingItem(tingItem);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((TingTapeItem) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(TingTapeItem.DEFAULT_INSTANCE);
            }

            public Builder addLocalList(int i, TingItem tingItem) {
                copyOnWrite();
                ((TingTapeItem) this.instance).addLocalList(i, tingItem);
                return this;
            }

            public Builder setCategoryItem(TingCategoryItem.Builder builder) {
                copyOnWrite();
                ((TingTapeItem) this.instance).setCategoryItem((TingCategoryItem) builder.build());
                return this;
            }

            public Builder setLocalList(int i, TingItem.Builder builder) {
                copyOnWrite();
                ((TingTapeItem) this.instance).setLocalList(i, (TingItem) builder.build());
                return this;
            }

            public Builder setTingItem(TingItem.Builder builder) {
                copyOnWrite();
                ((TingTapeItem) this.instance).setTingItem((TingItem) builder.build());
                return this;
            }

            public Builder addLocalList(TingItem.Builder builder) {
                copyOnWrite();
                ((TingTapeItem) this.instance).addLocalList((TingItem) builder.build());
                return this;
            }

            public Builder addLocalList(int i, TingItem.Builder builder) {
                copyOnWrite();
                ((TingTapeItem) this.instance).addLocalList(i, (TingItem) builder.build());
                return this;
            }
        }

        static {
            TingTapeItem tingTapeItem = new TingTapeItem();
            DEFAULT_INSTANCE = tingTapeItem;
            C23861l0.registerDefaultInstance(TingTapeItem.class, tingTapeItem);
        }

        private TingTapeItem() {
        }

        /* access modifiers changed from: private */
        public void addAllLocalList(Iterable<? extends TingItem> iterable) {
            ensureLocalListIsMutable();
            C23810b.addAll(iterable, this.localList_);
        }

        /* access modifiers changed from: private */
        public void addLocalList(TingItem tingItem) {
            tingItem.getClass();
            ensureLocalListIsMutable();
            this.localList_.add(tingItem);
        }

        /* access modifiers changed from: private */
        public void clearCategoryItem() {
            this.categoryItem_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearLocalList() {
            this.localList_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearTingItem() {
            this.tingItem_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureLocalListIsMutable() {
            C23908o0.C23919j<TingItem> jVar = this.localList_;
            if (!jVar.mo37523Q()) {
                this.localList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static TingTapeItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCategoryItem(TingCategoryItem tingCategoryItem) {
            tingCategoryItem.getClass();
            TingCategoryItem tingCategoryItem2 = this.categoryItem_;
            if (tingCategoryItem2 == null || tingCategoryItem2 == TingCategoryItem.getDefaultInstance()) {
                this.categoryItem_ = tingCategoryItem;
            } else {
                this.categoryItem_ = (TingCategoryItem) ((TingCategoryItem.Builder) TingCategoryItem.newBuilder(this.categoryItem_).mergeFrom(tingCategoryItem)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeTingItem(TingItem tingItem) {
            tingItem.getClass();
            TingItem tingItem2 = this.tingItem_;
            if (tingItem2 == null || tingItem2 == TingItem.getDefaultInstance()) {
                this.tingItem_ = tingItem;
            } else {
                this.tingItem_ = (TingItem) ((TingItem.Builder) TingItem.newBuilder(this.tingItem_).mergeFrom(tingItem)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingTapeItem parseDelimitedFrom(InputStream inputStream) {
            return (TingTapeItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTapeItem parseFrom(ByteBuffer byteBuffer) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingTapeItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeLocalList(int i) {
            ensureLocalListIsMutable();
            this.localList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setCategoryItem(TingCategoryItem tingCategoryItem) {
            tingCategoryItem.getClass();
            this.categoryItem_ = tingCategoryItem;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setLocalList(int i, TingItem tingItem) {
            tingItem.getClass();
            ensureLocalListIsMutable();
            this.localList_.set(i, tingItem);
        }

        /* access modifiers changed from: private */
        public void setTingItem(TingItem tingItem) {
            tingItem.getClass();
            this.tingItem_ = tingItem;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001င\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004Л", new Object[]{"bitField0_", "type_", "tingItem_", "categoryItem_", "localList_", TingItem.class});
                case 3:
                    return new TingTapeItem();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingTapeItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingTapeItem.class) {
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

        public TingCategoryItem getCategoryItem() {
            TingCategoryItem tingCategoryItem = this.categoryItem_;
            return tingCategoryItem == null ? TingCategoryItem.getDefaultInstance() : tingCategoryItem;
        }

        public TingItem getLocalList(int i) {
            return this.localList_.get(i);
        }

        public int getLocalListCount() {
            return this.localList_.size();
        }

        public List<TingItem> getLocalListList() {
            return this.localList_;
        }

        public TingItemOrBuilder getLocalListOrBuilder(int i) {
            return this.localList_.get(i);
        }

        public List<? extends TingItemOrBuilder> getLocalListOrBuilderList() {
            return this.localList_;
        }

        public TingItem getTingItem() {
            TingItem tingItem = this.tingItem_;
            return tingItem == null ? TingItem.getDefaultInstance() : tingItem;
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasCategoryItem() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTingItem() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingTapeItem tingTapeItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingTapeItem);
        }

        public static TingTapeItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTapeItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTapeItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingTapeItem parseFrom(C16994k kVar) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addLocalList(int i, TingItem tingItem) {
            tingItem.getClass();
            ensureLocalListIsMutable();
            this.localList_.add(i, tingItem);
        }

        public static TingTapeItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingTapeItem parseFrom(byte[] bArr) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingTapeItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingTapeItem parseFrom(InputStream inputStream) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTapeItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTapeItem parseFrom(C23856l lVar) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingTapeItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingTapeItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingTapeItemOrBuilder extends C23848k1 {
        TingCategoryItem getCategoryItem();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingItem getLocalList(int i);

        int getLocalListCount();

        List<TingItem> getLocalListList();

        TingItem getTingItem();

        int getType();

        boolean hasCategoryItem();

        boolean hasTingItem();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public enum TingTapeItemType implements C23908o0.C23911c {
        Unknown(0),
        SingleItem(1),
        CategoryItem(2),
        TemporaryList(3);
        
        public static final int CategoryItem_VALUE = 2;
        public static final int SingleItem_VALUE = 1;
        public static final int TemporaryList_VALUE = 3;
        public static final int Unknown_VALUE = 0;
        private static final C23908o0.C23912d<TingTapeItemType> internalValueMap = null;
        private final int value;

        public static final class TingTapeItemTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new TingTapeItemTypeVerifier();
            }

            private TingTapeItemTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return TingTapeItemType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<TingTapeItemType>() {
                public TingTapeItemType findValueByNumber(int i) {
                    return TingTapeItemType.forNumber(i);
                }
            };
        }

        private TingTapeItemType(int i) {
            this.value = i;
        }

        public static TingTapeItemType forNumber(int i) {
            if (i == 0) {
                return Unknown;
            }
            if (i == 1) {
                return SingleItem;
            }
            if (i == 2) {
                return CategoryItem;
            }
            if (i != 3) {
                return null;
            }
            return TemporaryList;
        }

        public static C23908o0.C23912d<TingTapeItemType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return TingTapeItemTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TingTapeItemType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class TingTaskSnapshot extends C23861l0<TingTaskSnapshot, Builder> implements TingTaskSnapshotOrBuilder {
        /* access modifiers changed from: private */
        public static final TingTaskSnapshot DEFAULT_INSTANCE;
        public static final int LASTMODIFIEDTIME_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingTaskSnapshot> PARSER = null;
        public static final int PLAYINGITEM_FIELD_NUMBER = 3;
        public static final int TAPEITEM_FIELD_NUMBER = 1;
        private int bitField0_;
        private int lastModifiedTime_;
        private byte memoizedIsInitialized = 2;
        private TingItem playingItem_;
        private TingTapeItem tapeItem_;

        public static final class Builder extends C23861l0.C23862a<TingTaskSnapshot, Builder> implements TingTaskSnapshotOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder clearLastModifiedTime() {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).clearLastModifiedTime();
                return this;
            }

            public Builder clearPlayingItem() {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).clearPlayingItem();
                return this;
            }

            public Builder clearTapeItem() {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).clearTapeItem();
                return this;
            }

            public int getLastModifiedTime() {
                return ((TingTaskSnapshot) this.instance).getLastModifiedTime();
            }

            public TingItem getPlayingItem() {
                return ((TingTaskSnapshot) this.instance).getPlayingItem();
            }

            public TingTapeItem getTapeItem() {
                return ((TingTaskSnapshot) this.instance).getTapeItem();
            }

            public boolean hasLastModifiedTime() {
                return ((TingTaskSnapshot) this.instance).hasLastModifiedTime();
            }

            public boolean hasPlayingItem() {
                return ((TingTaskSnapshot) this.instance).hasPlayingItem();
            }

            public boolean hasTapeItem() {
                return ((TingTaskSnapshot) this.instance).hasTapeItem();
            }

            public Builder mergePlayingItem(TingItem tingItem) {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).mergePlayingItem(tingItem);
                return this;
            }

            public Builder mergeTapeItem(TingTapeItem tingTapeItem) {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).mergeTapeItem(tingTapeItem);
                return this;
            }

            public Builder setLastModifiedTime(int i) {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).setLastModifiedTime(i);
                return this;
            }

            public Builder setPlayingItem(TingItem tingItem) {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).setPlayingItem(tingItem);
                return this;
            }

            public Builder setTapeItem(TingTapeItem tingTapeItem) {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).setTapeItem(tingTapeItem);
                return this;
            }

            private Builder() {
                super(TingTaskSnapshot.DEFAULT_INSTANCE);
            }

            public Builder setPlayingItem(TingItem.Builder builder) {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).setPlayingItem((TingItem) builder.build());
                return this;
            }

            public Builder setTapeItem(TingTapeItem.Builder builder) {
                copyOnWrite();
                ((TingTaskSnapshot) this.instance).setTapeItem((TingTapeItem) builder.build());
                return this;
            }
        }

        static {
            TingTaskSnapshot tingTaskSnapshot = new TingTaskSnapshot();
            DEFAULT_INSTANCE = tingTaskSnapshot;
            C23861l0.registerDefaultInstance(TingTaskSnapshot.class, tingTaskSnapshot);
        }

        private TingTaskSnapshot() {
        }

        /* access modifiers changed from: private */
        public void clearLastModifiedTime() {
            this.bitField0_ &= -3;
            this.lastModifiedTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPlayingItem() {
            this.playingItem_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearTapeItem() {
            this.tapeItem_ = null;
            this.bitField0_ &= -2;
        }

        public static TingTaskSnapshot getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergePlayingItem(TingItem tingItem) {
            tingItem.getClass();
            TingItem tingItem2 = this.playingItem_;
            if (tingItem2 == null || tingItem2 == TingItem.getDefaultInstance()) {
                this.playingItem_ = tingItem;
            } else {
                this.playingItem_ = (TingItem) ((TingItem.Builder) TingItem.newBuilder(this.playingItem_).mergeFrom(tingItem)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeTapeItem(TingTapeItem tingTapeItem) {
            tingTapeItem.getClass();
            TingTapeItem tingTapeItem2 = this.tapeItem_;
            if (tingTapeItem2 == null || tingTapeItem2 == TingTapeItem.getDefaultInstance()) {
                this.tapeItem_ = tingTapeItem;
            } else {
                this.tapeItem_ = (TingTapeItem) ((TingTapeItem.Builder) TingTapeItem.newBuilder(this.tapeItem_).mergeFrom(tingTapeItem)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingTaskSnapshot parseDelimitedFrom(InputStream inputStream) {
            return (TingTaskSnapshot) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTaskSnapshot parseFrom(ByteBuffer byteBuffer) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingTaskSnapshot> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLastModifiedTime(int i) {
            this.bitField0_ |= 2;
            this.lastModifiedTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setPlayingItem(TingItem tingItem) {
            tingItem.getClass();
            this.playingItem_ = tingItem;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setTapeItem(TingTapeItem tingTapeItem) {
            tingTapeItem.getClass();
            this.tapeItem_ = tingTapeItem;
            this.bitField0_ |= 1;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "tapeItem_", "lastModifiedTime_", "playingItem_"});
                case 3:
                    return new TingTaskSnapshot();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingTaskSnapshot> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingTaskSnapshot.class) {
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

        public int getLastModifiedTime() {
            return this.lastModifiedTime_;
        }

        public TingItem getPlayingItem() {
            TingItem tingItem = this.playingItem_;
            return tingItem == null ? TingItem.getDefaultInstance() : tingItem;
        }

        public TingTapeItem getTapeItem() {
            TingTapeItem tingTapeItem = this.tapeItem_;
            return tingTapeItem == null ? TingTapeItem.getDefaultInstance() : tingTapeItem;
        }

        public boolean hasLastModifiedTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPlayingItem() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTapeItem() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingTaskSnapshot tingTaskSnapshot) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingTaskSnapshot);
        }

        public static TingTaskSnapshot parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTaskSnapshot) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTaskSnapshot parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingTaskSnapshot parseFrom(C16994k kVar) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingTaskSnapshot parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingTaskSnapshot parseFrom(byte[] bArr) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingTaskSnapshot parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingTaskSnapshot parseFrom(InputStream inputStream) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTaskSnapshot parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTaskSnapshot parseFrom(C23856l lVar) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingTaskSnapshot parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingTaskSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class TingTaskSnapshotList extends C23861l0<TingTaskSnapshotList, Builder> implements TingTaskSnapshotListOrBuilder {
        /* access modifiers changed from: private */
        public static final TingTaskSnapshotList DEFAULT_INSTANCE;
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static volatile C24062w1<TingTaskSnapshotList> PARSER;
        private C23908o0.C23919j<TingTaskSnapshot> items_ = C23861l0.emptyProtobufList();
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<TingTaskSnapshotList, Builder> implements TingTaskSnapshotListOrBuilder {
            public /* synthetic */ Builder(C243121 r1) {
                this();
            }

            public Builder addAllItems(Iterable<? extends TingTaskSnapshot> iterable) {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).addAllItems(iterable);
                return this;
            }

            public Builder addItems(TingTaskSnapshot tingTaskSnapshot) {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).addItems(tingTaskSnapshot);
                return this;
            }

            public Builder clearItems() {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).clearItems();
                return this;
            }

            public TingTaskSnapshot getItems(int i) {
                return ((TingTaskSnapshotList) this.instance).getItems(i);
            }

            public int getItemsCount() {
                return ((TingTaskSnapshotList) this.instance).getItemsCount();
            }

            public List<TingTaskSnapshot> getItemsList() {
                return Collections.unmodifiableList(((TingTaskSnapshotList) this.instance).getItemsList());
            }

            public Builder removeItems(int i) {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).removeItems(i);
                return this;
            }

            public Builder setItems(int i, TingTaskSnapshot tingTaskSnapshot) {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).setItems(i, tingTaskSnapshot);
                return this;
            }

            private Builder() {
                super(TingTaskSnapshotList.DEFAULT_INSTANCE);
            }

            public Builder addItems(int i, TingTaskSnapshot tingTaskSnapshot) {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).addItems(i, tingTaskSnapshot);
                return this;
            }

            public Builder setItems(int i, TingTaskSnapshot.Builder builder) {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).setItems(i, (TingTaskSnapshot) builder.build());
                return this;
            }

            public Builder addItems(TingTaskSnapshot.Builder builder) {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).addItems((TingTaskSnapshot) builder.build());
                return this;
            }

            public Builder addItems(int i, TingTaskSnapshot.Builder builder) {
                copyOnWrite();
                ((TingTaskSnapshotList) this.instance).addItems(i, (TingTaskSnapshot) builder.build());
                return this;
            }
        }

        static {
            TingTaskSnapshotList tingTaskSnapshotList = new TingTaskSnapshotList();
            DEFAULT_INSTANCE = tingTaskSnapshotList;
            C23861l0.registerDefaultInstance(TingTaskSnapshotList.class, tingTaskSnapshotList);
        }

        private TingTaskSnapshotList() {
        }

        /* access modifiers changed from: private */
        public void addAllItems(Iterable<? extends TingTaskSnapshot> iterable) {
            ensureItemsIsMutable();
            C23810b.addAll(iterable, this.items_);
        }

        /* access modifiers changed from: private */
        public void addItems(TingTaskSnapshot tingTaskSnapshot) {
            tingTaskSnapshot.getClass();
            ensureItemsIsMutable();
            this.items_.add(tingTaskSnapshot);
        }

        /* access modifiers changed from: private */
        public void clearItems() {
            this.items_ = C23861l0.emptyProtobufList();
        }

        private void ensureItemsIsMutable() {
            C23908o0.C23919j<TingTaskSnapshot> jVar = this.items_;
            if (!jVar.mo37523Q()) {
                this.items_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static TingTaskSnapshotList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingTaskSnapshotList parseDelimitedFrom(InputStream inputStream) {
            return (TingTaskSnapshotList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTaskSnapshotList parseFrom(ByteBuffer byteBuffer) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingTaskSnapshotList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setItems(int i, TingTaskSnapshot tingTaskSnapshot) {
            tingTaskSnapshot.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, tingTaskSnapshot);
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"items_", TingTaskSnapshot.class});
                case 3:
                    return new TingTaskSnapshotList();
                case 4:
                    return new Builder((C243121) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingTaskSnapshotList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingTaskSnapshotList.class) {
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

        public TingTaskSnapshot getItems(int i) {
            return this.items_.get(i);
        }

        public int getItemsCount() {
            return this.items_.size();
        }

        public List<TingTaskSnapshot> getItemsList() {
            return this.items_;
        }

        public TingTaskSnapshotOrBuilder getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        public List<? extends TingTaskSnapshotOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        public static Builder newBuilder(TingTaskSnapshotList tingTaskSnapshotList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingTaskSnapshotList);
        }

        public static TingTaskSnapshotList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTaskSnapshotList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTaskSnapshotList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingTaskSnapshotList parseFrom(C16994k kVar) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addItems(int i, TingTaskSnapshot tingTaskSnapshot) {
            tingTaskSnapshot.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, tingTaskSnapshot);
        }

        public static TingTaskSnapshotList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingTaskSnapshotList parseFrom(byte[] bArr) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingTaskSnapshotList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingTaskSnapshotList parseFrom(InputStream inputStream) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingTaskSnapshotList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingTaskSnapshotList parseFrom(C23856l lVar) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingTaskSnapshotList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingTaskSnapshotList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingTaskSnapshotListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingTaskSnapshot getItems(int i);

        int getItemsCount();

        List<TingTaskSnapshot> getItemsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface TingTaskSnapshotOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getLastModifiedTime();

        TingItem getPlayingItem();

        TingTapeItem getTapeItem();

        boolean hasLastModifiedTime();

        boolean hasPlayingItem();

        boolean hasTapeItem();

        /* synthetic */ boolean isInitialized();
    }

    private TingClientProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
