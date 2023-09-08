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
import com.tencent.wechat.aff.ting.TingClientProto;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class TingAffBizProto {

    /* renamed from: com.tencent.wechat.aff.ting.TingAffBizProto$1 */
    public static /* synthetic */ class C243101 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69811xa1df5c61;

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
                f69811xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69811xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69811xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69811xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69811xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69811xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69811xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.ting.TingAffBizProto.C243101.<clinit>():void");
        }
    }

    public static final class TingAudioFocusRequestContext extends C23861l0<TingAudioFocusRequestContext, Builder> implements TingAudioFocusRequestContextOrBuilder {
        /* access modifiers changed from: private */
        public static final TingAudioFocusRequestContext DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 1;
        private static volatile C24062w1<TingAudioFocusRequestContext> PARSER = null;
        public static final int TINGITEM_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int operation_;
        private TingClientProto.TingItem tingItem_;

        public enum AudioFocusOperation implements C23908o0.C23911c {
            kPlay(0),
            kResume(1),
            kPause(2),
            kStop(3);
            
            private static final C23908o0.C23912d<AudioFocusOperation> internalValueMap = null;
            public static final int kPause_VALUE = 2;
            public static final int kPlay_VALUE = 0;
            public static final int kResume_VALUE = 1;
            public static final int kStop_VALUE = 3;
            private final int value;

            public static final class AudioFocusOperationVerifier implements C23908o0.C23913e {
                public static final C23908o0.C23913e INSTANCE = null;

                static {
                    INSTANCE = new AudioFocusOperationVerifier();
                }

                private AudioFocusOperationVerifier() {
                }

                public boolean isInRange(int i) {
                    return AudioFocusOperation.forNumber(i) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new C23908o0.C23912d<AudioFocusOperation>() {
                    public AudioFocusOperation findValueByNumber(int i) {
                        return AudioFocusOperation.forNumber(i);
                    }
                };
            }

            private AudioFocusOperation(int i) {
                this.value = i;
            }

            public static AudioFocusOperation forNumber(int i) {
                if (i == 0) {
                    return kPlay;
                }
                if (i == 1) {
                    return kResume;
                }
                if (i == 2) {
                    return kPause;
                }
                if (i != 3) {
                    return null;
                }
                return kStop;
            }

            public static C23908o0.C23912d<AudioFocusOperation> internalGetValueMap() {
                return internalValueMap;
            }

            public static C23908o0.C23913e internalGetVerifier() {
                return AudioFocusOperationVerifier.INSTANCE;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static AudioFocusOperation valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class Builder extends C23861l0.C23862a<TingAudioFocusRequestContext, Builder> implements TingAudioFocusRequestContextOrBuilder {
            public /* synthetic */ Builder(C243101 r1) {
                this();
            }

            public Builder clearOperation() {
                copyOnWrite();
                ((TingAudioFocusRequestContext) this.instance).clearOperation();
                return this;
            }

            public Builder clearTingItem() {
                copyOnWrite();
                ((TingAudioFocusRequestContext) this.instance).clearTingItem();
                return this;
            }

            public int getOperation() {
                return ((TingAudioFocusRequestContext) this.instance).getOperation();
            }

            public TingClientProto.TingItem getTingItem() {
                return ((TingAudioFocusRequestContext) this.instance).getTingItem();
            }

            public boolean hasOperation() {
                return ((TingAudioFocusRequestContext) this.instance).hasOperation();
            }

            public boolean hasTingItem() {
                return ((TingAudioFocusRequestContext) this.instance).hasTingItem();
            }

            public Builder mergeTingItem(TingClientProto.TingItem tingItem) {
                copyOnWrite();
                ((TingAudioFocusRequestContext) this.instance).mergeTingItem(tingItem);
                return this;
            }

            public Builder setOperation(int i) {
                copyOnWrite();
                ((TingAudioFocusRequestContext) this.instance).setOperation(i);
                return this;
            }

            public Builder setTingItem(TingClientProto.TingItem tingItem) {
                copyOnWrite();
                ((TingAudioFocusRequestContext) this.instance).setTingItem(tingItem);
                return this;
            }

            private Builder() {
                super(TingAudioFocusRequestContext.DEFAULT_INSTANCE);
            }

            public Builder setTingItem(TingClientProto.TingItem.Builder builder) {
                copyOnWrite();
                ((TingAudioFocusRequestContext) this.instance).setTingItem((TingClientProto.TingItem) builder.build());
                return this;
            }
        }

        static {
            TingAudioFocusRequestContext tingAudioFocusRequestContext = new TingAudioFocusRequestContext();
            DEFAULT_INSTANCE = tingAudioFocusRequestContext;
            C23861l0.registerDefaultInstance(TingAudioFocusRequestContext.class, tingAudioFocusRequestContext);
        }

        private TingAudioFocusRequestContext() {
        }

        /* access modifiers changed from: private */
        public void clearOperation() {
            this.bitField0_ &= -2;
            this.operation_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTingItem() {
            this.tingItem_ = null;
            this.bitField0_ &= -3;
        }

        public static TingAudioFocusRequestContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTingItem(TingClientProto.TingItem tingItem) {
            tingItem.getClass();
            TingClientProto.TingItem tingItem2 = this.tingItem_;
            if (tingItem2 == null || tingItem2 == TingClientProto.TingItem.getDefaultInstance()) {
                this.tingItem_ = tingItem;
            } else {
                this.tingItem_ = (TingClientProto.TingItem) ((TingClientProto.TingItem.Builder) TingClientProto.TingItem.newBuilder(this.tingItem_).mergeFrom(tingItem)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingAudioFocusRequestContext parseDelimitedFrom(InputStream inputStream) {
            return (TingAudioFocusRequestContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingAudioFocusRequestContext parseFrom(ByteBuffer byteBuffer) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingAudioFocusRequestContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setOperation(int i) {
            this.bitField0_ |= 1;
            this.operation_ = i;
        }

        /* access modifiers changed from: private */
        public void setTingItem(TingClientProto.TingItem tingItem) {
            tingItem.getClass();
            this.tingItem_ = tingItem;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "operation_", "tingItem_"});
                case 3:
                    return new TingAudioFocusRequestContext();
                case 4:
                    return new Builder((C243101) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingAudioFocusRequestContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingAudioFocusRequestContext.class) {
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

        public int getOperation() {
            return this.operation_;
        }

        public TingClientProto.TingItem getTingItem() {
            TingClientProto.TingItem tingItem = this.tingItem_;
            return tingItem == null ? TingClientProto.TingItem.getDefaultInstance() : tingItem;
        }

        public boolean hasOperation() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTingItem() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TingAudioFocusRequestContext tingAudioFocusRequestContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingAudioFocusRequestContext);
        }

        public static TingAudioFocusRequestContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingAudioFocusRequestContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingAudioFocusRequestContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingAudioFocusRequestContext parseFrom(C16994k kVar) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingAudioFocusRequestContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingAudioFocusRequestContext parseFrom(byte[] bArr) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingAudioFocusRequestContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingAudioFocusRequestContext parseFrom(InputStream inputStream) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingAudioFocusRequestContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingAudioFocusRequestContext parseFrom(C23856l lVar) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingAudioFocusRequestContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingAudioFocusRequestContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingAudioFocusRequestContextOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getOperation();

        TingClientProto.TingItem getTingItem();

        boolean hasOperation();

        boolean hasTingItem();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingImageColorAsset extends C23861l0<TingImageColorAsset, Builder> implements TingImageColorAssetOrBuilder {
        public static final int COVERCOLOR_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TingImageColorAsset DEFAULT_INSTANCE;
        public static final int LINKCOLOR_FIELD_NUMBER = 6;
        public static final int MINIBARCOLOR_FIELD_NUMBER = 5;
        public static final int OCTREECOLOR_FIELD_NUMBER = 1;
        public static final int OCTREEPATH_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingImageColorAsset> PARSER = null;
        public static final int PLAYERBACKGROUNDCOLOR_FIELD_NUMBER = 4;
        private int bitField0_;
        private TingRGBAColor coverColor_;
        private TingRGBAColor linkColor_;
        private TingRGBAColor minibarColor_;
        private TingRGBAColor octreeColor_;
        private int octreePath_;
        private TingRGBAColor playerBackgroundColor_;

        public static final class Builder extends C23861l0.C23862a<TingImageColorAsset, Builder> implements TingImageColorAssetOrBuilder {
            public /* synthetic */ Builder(C243101 r1) {
                this();
            }

            public Builder clearCoverColor() {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).clearCoverColor();
                return this;
            }

            public Builder clearLinkColor() {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).clearLinkColor();
                return this;
            }

            public Builder clearMinibarColor() {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).clearMinibarColor();
                return this;
            }

            public Builder clearOctreeColor() {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).clearOctreeColor();
                return this;
            }

            public Builder clearOctreePath() {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).clearOctreePath();
                return this;
            }

            public Builder clearPlayerBackgroundColor() {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).clearPlayerBackgroundColor();
                return this;
            }

            public TingRGBAColor getCoverColor() {
                return ((TingImageColorAsset) this.instance).getCoverColor();
            }

            public TingRGBAColor getLinkColor() {
                return ((TingImageColorAsset) this.instance).getLinkColor();
            }

            public TingRGBAColor getMinibarColor() {
                return ((TingImageColorAsset) this.instance).getMinibarColor();
            }

            public TingRGBAColor getOctreeColor() {
                return ((TingImageColorAsset) this.instance).getOctreeColor();
            }

            public int getOctreePath() {
                return ((TingImageColorAsset) this.instance).getOctreePath();
            }

            public TingRGBAColor getPlayerBackgroundColor() {
                return ((TingImageColorAsset) this.instance).getPlayerBackgroundColor();
            }

            public boolean hasCoverColor() {
                return ((TingImageColorAsset) this.instance).hasCoverColor();
            }

            public boolean hasLinkColor() {
                return ((TingImageColorAsset) this.instance).hasLinkColor();
            }

            public boolean hasMinibarColor() {
                return ((TingImageColorAsset) this.instance).hasMinibarColor();
            }

            public boolean hasOctreeColor() {
                return ((TingImageColorAsset) this.instance).hasOctreeColor();
            }

            public boolean hasOctreePath() {
                return ((TingImageColorAsset) this.instance).hasOctreePath();
            }

            public boolean hasPlayerBackgroundColor() {
                return ((TingImageColorAsset) this.instance).hasPlayerBackgroundColor();
            }

            public Builder mergeCoverColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).mergeCoverColor(tingRGBAColor);
                return this;
            }

            public Builder mergeLinkColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).mergeLinkColor(tingRGBAColor);
                return this;
            }

            public Builder mergeMinibarColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).mergeMinibarColor(tingRGBAColor);
                return this;
            }

            public Builder mergeOctreeColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).mergeOctreeColor(tingRGBAColor);
                return this;
            }

            public Builder mergePlayerBackgroundColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).mergePlayerBackgroundColor(tingRGBAColor);
                return this;
            }

            public Builder setCoverColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setCoverColor(tingRGBAColor);
                return this;
            }

            public Builder setLinkColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setLinkColor(tingRGBAColor);
                return this;
            }

            public Builder setMinibarColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setMinibarColor(tingRGBAColor);
                return this;
            }

            public Builder setOctreeColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setOctreeColor(tingRGBAColor);
                return this;
            }

            public Builder setOctreePath(int i) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setOctreePath(i);
                return this;
            }

            public Builder setPlayerBackgroundColor(TingRGBAColor tingRGBAColor) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setPlayerBackgroundColor(tingRGBAColor);
                return this;
            }

            private Builder() {
                super(TingImageColorAsset.DEFAULT_INSTANCE);
            }

            public Builder setCoverColor(TingRGBAColor.Builder builder) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setCoverColor((TingRGBAColor) builder.build());
                return this;
            }

            public Builder setLinkColor(TingRGBAColor.Builder builder) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setLinkColor((TingRGBAColor) builder.build());
                return this;
            }

            public Builder setMinibarColor(TingRGBAColor.Builder builder) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setMinibarColor((TingRGBAColor) builder.build());
                return this;
            }

            public Builder setOctreeColor(TingRGBAColor.Builder builder) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setOctreeColor((TingRGBAColor) builder.build());
                return this;
            }

            public Builder setPlayerBackgroundColor(TingRGBAColor.Builder builder) {
                copyOnWrite();
                ((TingImageColorAsset) this.instance).setPlayerBackgroundColor((TingRGBAColor) builder.build());
                return this;
            }
        }

        static {
            TingImageColorAsset tingImageColorAsset = new TingImageColorAsset();
            DEFAULT_INSTANCE = tingImageColorAsset;
            C23861l0.registerDefaultInstance(TingImageColorAsset.class, tingImageColorAsset);
        }

        private TingImageColorAsset() {
        }

        /* access modifiers changed from: private */
        public void clearCoverColor() {
            this.coverColor_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearLinkColor() {
            this.linkColor_ = null;
            this.bitField0_ &= -33;
        }

        /* access modifiers changed from: private */
        public void clearMinibarColor() {
            this.minibarColor_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearOctreeColor() {
            this.octreeColor_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearOctreePath() {
            this.bitField0_ &= -3;
            this.octreePath_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPlayerBackgroundColor() {
            this.playerBackgroundColor_ = null;
            this.bitField0_ &= -9;
        }

        public static TingImageColorAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCoverColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            TingRGBAColor tingRGBAColor2 = this.coverColor_;
            if (tingRGBAColor2 == null || tingRGBAColor2 == TingRGBAColor.getDefaultInstance()) {
                this.coverColor_ = tingRGBAColor;
            } else {
                this.coverColor_ = (TingRGBAColor) ((TingRGBAColor.Builder) TingRGBAColor.newBuilder(this.coverColor_).mergeFrom(tingRGBAColor)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeLinkColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            TingRGBAColor tingRGBAColor2 = this.linkColor_;
            if (tingRGBAColor2 == null || tingRGBAColor2 == TingRGBAColor.getDefaultInstance()) {
                this.linkColor_ = tingRGBAColor;
            } else {
                this.linkColor_ = (TingRGBAColor) ((TingRGBAColor.Builder) TingRGBAColor.newBuilder(this.linkColor_).mergeFrom(tingRGBAColor)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void mergeMinibarColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            TingRGBAColor tingRGBAColor2 = this.minibarColor_;
            if (tingRGBAColor2 == null || tingRGBAColor2 == TingRGBAColor.getDefaultInstance()) {
                this.minibarColor_ = tingRGBAColor;
            } else {
                this.minibarColor_ = (TingRGBAColor) ((TingRGBAColor.Builder) TingRGBAColor.newBuilder(this.minibarColor_).mergeFrom(tingRGBAColor)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void mergeOctreeColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            TingRGBAColor tingRGBAColor2 = this.octreeColor_;
            if (tingRGBAColor2 == null || tingRGBAColor2 == TingRGBAColor.getDefaultInstance()) {
                this.octreeColor_ = tingRGBAColor;
            } else {
                this.octreeColor_ = (TingRGBAColor) ((TingRGBAColor.Builder) TingRGBAColor.newBuilder(this.octreeColor_).mergeFrom(tingRGBAColor)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergePlayerBackgroundColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            TingRGBAColor tingRGBAColor2 = this.playerBackgroundColor_;
            if (tingRGBAColor2 == null || tingRGBAColor2 == TingRGBAColor.getDefaultInstance()) {
                this.playerBackgroundColor_ = tingRGBAColor;
            } else {
                this.playerBackgroundColor_ = (TingRGBAColor) ((TingRGBAColor.Builder) TingRGBAColor.newBuilder(this.playerBackgroundColor_).mergeFrom(tingRGBAColor)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingImageColorAsset parseDelimitedFrom(InputStream inputStream) {
            return (TingImageColorAsset) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingImageColorAsset parseFrom(ByteBuffer byteBuffer) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingImageColorAsset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCoverColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            this.coverColor_ = tingRGBAColor;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setLinkColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            this.linkColor_ = tingRGBAColor;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setMinibarColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            this.minibarColor_ = tingRGBAColor;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setOctreeColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            this.octreeColor_ = tingRGBAColor;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setOctreePath(int i) {
            this.bitField0_ |= 2;
            this.octreePath_ = i;
        }

        /* access modifiers changed from: private */
        public void setPlayerBackgroundColor(TingRGBAColor tingRGBAColor) {
            tingRGBAColor.getClass();
            this.playerBackgroundColor_ = tingRGBAColor;
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "octreeColor_", "octreePath_", "coverColor_", "playerBackgroundColor_", "minibarColor_", "linkColor_"});
                case 3:
                    return new TingImageColorAsset();
                case 4:
                    return new Builder((C243101) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingImageColorAsset> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingImageColorAsset.class) {
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

        public TingRGBAColor getCoverColor() {
            TingRGBAColor tingRGBAColor = this.coverColor_;
            return tingRGBAColor == null ? TingRGBAColor.getDefaultInstance() : tingRGBAColor;
        }

        public TingRGBAColor getLinkColor() {
            TingRGBAColor tingRGBAColor = this.linkColor_;
            return tingRGBAColor == null ? TingRGBAColor.getDefaultInstance() : tingRGBAColor;
        }

        public TingRGBAColor getMinibarColor() {
            TingRGBAColor tingRGBAColor = this.minibarColor_;
            return tingRGBAColor == null ? TingRGBAColor.getDefaultInstance() : tingRGBAColor;
        }

        public TingRGBAColor getOctreeColor() {
            TingRGBAColor tingRGBAColor = this.octreeColor_;
            return tingRGBAColor == null ? TingRGBAColor.getDefaultInstance() : tingRGBAColor;
        }

        public int getOctreePath() {
            return this.octreePath_;
        }

        public TingRGBAColor getPlayerBackgroundColor() {
            TingRGBAColor tingRGBAColor = this.playerBackgroundColor_;
            return tingRGBAColor == null ? TingRGBAColor.getDefaultInstance() : tingRGBAColor;
        }

        public boolean hasCoverColor() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLinkColor() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasMinibarColor() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasOctreeColor() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOctreePath() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPlayerBackgroundColor() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(TingImageColorAsset tingImageColorAsset) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingImageColorAsset);
        }

        public static TingImageColorAsset parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingImageColorAsset) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingImageColorAsset parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingImageColorAsset parseFrom(C16994k kVar) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingImageColorAsset parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingImageColorAsset parseFrom(byte[] bArr) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingImageColorAsset parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingImageColorAsset parseFrom(InputStream inputStream) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingImageColorAsset parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingImageColorAsset parseFrom(C23856l lVar) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingImageColorAsset parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingImageColorAsset) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingImageColorAssetOrBuilder extends C23848k1 {
        TingRGBAColor getCoverColor();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingRGBAColor getLinkColor();

        TingRGBAColor getMinibarColor();

        TingRGBAColor getOctreeColor();

        int getOctreePath();

        TingRGBAColor getPlayerBackgroundColor();

        boolean hasCoverColor();

        boolean hasLinkColor();

        boolean hasMinibarColor();

        boolean hasOctreeColor();

        boolean hasOctreePath();

        boolean hasPlayerBackgroundColor();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingPlayListInfo extends C23861l0<TingPlayListInfo, Builder> implements TingPlayListInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final TingPlayListInfo DEFAULT_INSTANCE;
        public static final int IDS_FIELD_NUMBER = 2;
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static volatile C24062w1<TingPlayListInfo> PARSER = null;
        public static final int PLAYINGINDEX_FIELD_NUMBER = 3;
        public static final int SOURCECOUNT_FIELD_NUMBER = 4;
        public static final int TAPEINFO_FIELD_NUMBER = 5;
        private int bitField0_;
        private C23908o0.C23919j<String> ids_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<TingPlayListItem> items_ = C23861l0.emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private int playingIndex_;
        private int sourceCount_;
        private TingClientProto.TingTapeInfo tapeInfo_;

        public static final class Builder extends C23861l0.C23862a<TingPlayListInfo, Builder> implements TingPlayListInfoOrBuilder {
            public /* synthetic */ Builder(C243101 r1) {
                this();
            }

            public Builder addAllIds(Iterable<String> iterable) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).addAllIds(iterable);
                return this;
            }

            public Builder addAllItems(Iterable<? extends TingPlayListItem> iterable) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).addAllItems(iterable);
                return this;
            }

            public Builder addIds(String str) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).addIds(str);
                return this;
            }

            public Builder addIdsBytes(C16994k kVar) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).addIdsBytes(kVar);
                return this;
            }

            public Builder addItems(TingPlayListItem tingPlayListItem) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).addItems(tingPlayListItem);
                return this;
            }

            public Builder clearIds() {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).clearIds();
                return this;
            }

            public Builder clearItems() {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).clearItems();
                return this;
            }

            public Builder clearPlayingIndex() {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).clearPlayingIndex();
                return this;
            }

            public Builder clearSourceCount() {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).clearSourceCount();
                return this;
            }

            public Builder clearTapeInfo() {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).clearTapeInfo();
                return this;
            }

            public String getIds(int i) {
                return ((TingPlayListInfo) this.instance).getIds(i);
            }

            public C16994k getIdsBytes(int i) {
                return ((TingPlayListInfo) this.instance).getIdsBytes(i);
            }

            public int getIdsCount() {
                return ((TingPlayListInfo) this.instance).getIdsCount();
            }

            public List<String> getIdsList() {
                return Collections.unmodifiableList(((TingPlayListInfo) this.instance).getIdsList());
            }

            public TingPlayListItem getItems(int i) {
                return ((TingPlayListInfo) this.instance).getItems(i);
            }

            public int getItemsCount() {
                return ((TingPlayListInfo) this.instance).getItemsCount();
            }

            public List<TingPlayListItem> getItemsList() {
                return Collections.unmodifiableList(((TingPlayListInfo) this.instance).getItemsList());
            }

            public int getPlayingIndex() {
                return ((TingPlayListInfo) this.instance).getPlayingIndex();
            }

            public int getSourceCount() {
                return ((TingPlayListInfo) this.instance).getSourceCount();
            }

            public TingClientProto.TingTapeInfo getTapeInfo() {
                return ((TingPlayListInfo) this.instance).getTapeInfo();
            }

            public boolean hasPlayingIndex() {
                return ((TingPlayListInfo) this.instance).hasPlayingIndex();
            }

            public boolean hasSourceCount() {
                return ((TingPlayListInfo) this.instance).hasSourceCount();
            }

            public boolean hasTapeInfo() {
                return ((TingPlayListInfo) this.instance).hasTapeInfo();
            }

            public Builder mergeTapeInfo(TingClientProto.TingTapeInfo tingTapeInfo) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).mergeTapeInfo(tingTapeInfo);
                return this;
            }

            public Builder removeItems(int i) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).removeItems(i);
                return this;
            }

            public Builder setIds(int i, String str) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).setIds(i, str);
                return this;
            }

            public Builder setItems(int i, TingPlayListItem tingPlayListItem) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).setItems(i, tingPlayListItem);
                return this;
            }

            public Builder setPlayingIndex(int i) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).setPlayingIndex(i);
                return this;
            }

            public Builder setSourceCount(int i) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).setSourceCount(i);
                return this;
            }

            public Builder setTapeInfo(TingClientProto.TingTapeInfo tingTapeInfo) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).setTapeInfo(tingTapeInfo);
                return this;
            }

            private Builder() {
                super(TingPlayListInfo.DEFAULT_INSTANCE);
            }

            public Builder addItems(int i, TingPlayListItem tingPlayListItem) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).addItems(i, tingPlayListItem);
                return this;
            }

            public Builder setItems(int i, TingPlayListItem.Builder builder) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).setItems(i, (TingPlayListItem) builder.build());
                return this;
            }

            public Builder setTapeInfo(TingClientProto.TingTapeInfo.Builder builder) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).setTapeInfo((TingClientProto.TingTapeInfo) builder.build());
                return this;
            }

            public Builder addItems(TingPlayListItem.Builder builder) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).addItems((TingPlayListItem) builder.build());
                return this;
            }

            public Builder addItems(int i, TingPlayListItem.Builder builder) {
                copyOnWrite();
                ((TingPlayListInfo) this.instance).addItems(i, (TingPlayListItem) builder.build());
                return this;
            }
        }

        static {
            TingPlayListInfo tingPlayListInfo = new TingPlayListInfo();
            DEFAULT_INSTANCE = tingPlayListInfo;
            C23861l0.registerDefaultInstance(TingPlayListInfo.class, tingPlayListInfo);
        }

        private TingPlayListInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllIds(Iterable<String> iterable) {
            ensureIdsIsMutable();
            C23810b.addAll(iterable, this.ids_);
        }

        /* access modifiers changed from: private */
        public void addAllItems(Iterable<? extends TingPlayListItem> iterable) {
            ensureItemsIsMutable();
            C23810b.addAll(iterable, this.items_);
        }

        /* access modifiers changed from: private */
        public void addIds(String str) {
            str.getClass();
            ensureIdsIsMutable();
            this.ids_.add(str);
        }

        /* access modifiers changed from: private */
        public void addIdsBytes(C16994k kVar) {
            ensureIdsIsMutable();
            this.ids_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void addItems(TingPlayListItem tingPlayListItem) {
            tingPlayListItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(tingPlayListItem);
        }

        /* access modifiers changed from: private */
        public void clearIds() {
            this.ids_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearItems() {
            this.items_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearPlayingIndex() {
            this.bitField0_ &= -2;
            this.playingIndex_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSourceCount() {
            this.bitField0_ &= -3;
            this.sourceCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTapeInfo() {
            this.tapeInfo_ = null;
            this.bitField0_ &= -5;
        }

        private void ensureIdsIsMutable() {
            C23908o0.C23919j<String> jVar = this.ids_;
            if (!jVar.mo37523Q()) {
                this.ids_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureItemsIsMutable() {
            C23908o0.C23919j<TingPlayListItem> jVar = this.items_;
            if (!jVar.mo37523Q()) {
                this.items_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static TingPlayListInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeTapeInfo(TingClientProto.TingTapeInfo tingTapeInfo) {
            tingTapeInfo.getClass();
            TingClientProto.TingTapeInfo tingTapeInfo2 = this.tapeInfo_;
            if (tingTapeInfo2 == null || tingTapeInfo2 == TingClientProto.TingTapeInfo.getDefaultInstance()) {
                this.tapeInfo_ = tingTapeInfo;
            } else {
                this.tapeInfo_ = (TingClientProto.TingTapeInfo) ((TingClientProto.TingTapeInfo.Builder) TingClientProto.TingTapeInfo.newBuilder(this.tapeInfo_).mergeFrom(tingTapeInfo)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingPlayListInfo parseDelimitedFrom(InputStream inputStream) {
            return (TingPlayListInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayListInfo parseFrom(ByteBuffer byteBuffer) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingPlayListInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setIds(int i, String str) {
            str.getClass();
            ensureIdsIsMutable();
            this.ids_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setItems(int i, TingPlayListItem tingPlayListItem) {
            tingPlayListItem.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, tingPlayListItem);
        }

        /* access modifiers changed from: private */
        public void setPlayingIndex(int i) {
            this.bitField0_ |= 1;
            this.playingIndex_ = i;
        }

        /* access modifiers changed from: private */
        public void setSourceCount(int i) {
            this.bitField0_ |= 2;
            this.sourceCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setTapeInfo(TingClientProto.TingTapeInfo tingTapeInfo) {
            tingTapeInfo.getClass();
            this.tapeInfo_ = tingTapeInfo;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001Л\u0002\u001a\u0003င\u0000\u0004င\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "items_", TingPlayListItem.class, "ids_", "playingIndex_", "sourceCount_", "tapeInfo_"});
                case 3:
                    return new TingPlayListInfo();
                case 4:
                    return new Builder((C243101) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingPlayListInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingPlayListInfo.class) {
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

        public String getIds(int i) {
            return this.ids_.get(i);
        }

        public C16994k getIdsBytes(int i) {
            return C16994k.m16791k(this.ids_.get(i));
        }

        public int getIdsCount() {
            return this.ids_.size();
        }

        public List<String> getIdsList() {
            return this.ids_;
        }

        public TingPlayListItem getItems(int i) {
            return this.items_.get(i);
        }

        public int getItemsCount() {
            return this.items_.size();
        }

        public List<TingPlayListItem> getItemsList() {
            return this.items_;
        }

        public TingPlayListItemOrBuilder getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        public List<? extends TingPlayListItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        public int getPlayingIndex() {
            return this.playingIndex_;
        }

        public int getSourceCount() {
            return this.sourceCount_;
        }

        public TingClientProto.TingTapeInfo getTapeInfo() {
            TingClientProto.TingTapeInfo tingTapeInfo = this.tapeInfo_;
            return tingTapeInfo == null ? TingClientProto.TingTapeInfo.getDefaultInstance() : tingTapeInfo;
        }

        public boolean hasPlayingIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSourceCount() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTapeInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(TingPlayListInfo tingPlayListInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingPlayListInfo);
        }

        public static TingPlayListInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayListInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayListInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingPlayListInfo parseFrom(C16994k kVar) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addItems(int i, TingPlayListItem tingPlayListItem) {
            tingPlayListItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, tingPlayListItem);
        }

        public static TingPlayListInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingPlayListInfo parseFrom(byte[] bArr) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingPlayListInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingPlayListInfo parseFrom(InputStream inputStream) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayListInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayListInfo parseFrom(C23856l lVar) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingPlayListInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingPlayListInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingPlayListInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getIds(int i);

        C16994k getIdsBytes(int i);

        int getIdsCount();

        List<String> getIdsList();

        TingPlayListItem getItems(int i);

        int getItemsCount();

        List<TingPlayListItem> getItemsList();

        int getPlayingIndex();

        int getSourceCount();

        TingClientProto.TingTapeInfo getTapeInfo();

        boolean hasPlayingIndex();

        boolean hasSourceCount();

        boolean hasTapeInfo();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingPlayListItem extends C23861l0<TingPlayListItem, Builder> implements TingPlayListItemOrBuilder {
        /* access modifiers changed from: private */
        public static final TingPlayListItem DEFAULT_INSTANCE;
        public static final int ITEM_FIELD_NUMBER = 1;
        public static final int ORIGININDEX_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingPlayListItem> PARSER;
        private int bitField0_;
        private TingClientProto.TingItem item_;
        private byte memoizedIsInitialized = 2;
        private int originIndex_;

        public static final class Builder extends C23861l0.C23862a<TingPlayListItem, Builder> implements TingPlayListItemOrBuilder {
            public /* synthetic */ Builder(C243101 r1) {
                this();
            }

            public Builder clearItem() {
                copyOnWrite();
                ((TingPlayListItem) this.instance).clearItem();
                return this;
            }

            public Builder clearOriginIndex() {
                copyOnWrite();
                ((TingPlayListItem) this.instance).clearOriginIndex();
                return this;
            }

            public TingClientProto.TingItem getItem() {
                return ((TingPlayListItem) this.instance).getItem();
            }

            public int getOriginIndex() {
                return ((TingPlayListItem) this.instance).getOriginIndex();
            }

            public boolean hasItem() {
                return ((TingPlayListItem) this.instance).hasItem();
            }

            public boolean hasOriginIndex() {
                return ((TingPlayListItem) this.instance).hasOriginIndex();
            }

            public Builder mergeItem(TingClientProto.TingItem tingItem) {
                copyOnWrite();
                ((TingPlayListItem) this.instance).mergeItem(tingItem);
                return this;
            }

            public Builder setItem(TingClientProto.TingItem tingItem) {
                copyOnWrite();
                ((TingPlayListItem) this.instance).setItem(tingItem);
                return this;
            }

            public Builder setOriginIndex(int i) {
                copyOnWrite();
                ((TingPlayListItem) this.instance).setOriginIndex(i);
                return this;
            }

            private Builder() {
                super(TingPlayListItem.DEFAULT_INSTANCE);
            }

            public Builder setItem(TingClientProto.TingItem.Builder builder) {
                copyOnWrite();
                ((TingPlayListItem) this.instance).setItem((TingClientProto.TingItem) builder.build());
                return this;
            }
        }

        static {
            TingPlayListItem tingPlayListItem = new TingPlayListItem();
            DEFAULT_INSTANCE = tingPlayListItem;
            C23861l0.registerDefaultInstance(TingPlayListItem.class, tingPlayListItem);
        }

        private TingPlayListItem() {
        }

        /* access modifiers changed from: private */
        public void clearItem() {
            this.item_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearOriginIndex() {
            this.bitField0_ &= -3;
            this.originIndex_ = 0;
        }

        public static TingPlayListItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeItem(TingClientProto.TingItem tingItem) {
            tingItem.getClass();
            TingClientProto.TingItem tingItem2 = this.item_;
            if (tingItem2 == null || tingItem2 == TingClientProto.TingItem.getDefaultInstance()) {
                this.item_ = tingItem;
            } else {
                this.item_ = (TingClientProto.TingItem) ((TingClientProto.TingItem.Builder) TingClientProto.TingItem.newBuilder(this.item_).mergeFrom(tingItem)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingPlayListItem parseDelimitedFrom(InputStream inputStream) {
            return (TingPlayListItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayListItem parseFrom(ByteBuffer byteBuffer) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingPlayListItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setItem(TingClientProto.TingItem tingItem) {
            tingItem.getClass();
            this.item_ = tingItem;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setOriginIndex(int i) {
            this.bitField0_ |= 2;
            this.originIndex_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"bitField0_", "item_", "originIndex_"});
                case 3:
                    return new TingPlayListItem();
                case 4:
                    return new Builder((C243101) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingPlayListItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingPlayListItem.class) {
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

        public TingClientProto.TingItem getItem() {
            TingClientProto.TingItem tingItem = this.item_;
            return tingItem == null ? TingClientProto.TingItem.getDefaultInstance() : tingItem;
        }

        public int getOriginIndex() {
            return this.originIndex_;
        }

        public boolean hasItem() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOriginIndex() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TingPlayListItem tingPlayListItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingPlayListItem);
        }

        public static TingPlayListItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayListItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayListItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingPlayListItem parseFrom(C16994k kVar) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingPlayListItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingPlayListItem parseFrom(byte[] bArr) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingPlayListItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingPlayListItem parseFrom(InputStream inputStream) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingPlayListItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingPlayListItem parseFrom(C23856l lVar) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingPlayListItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingPlayListItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingPlayListItemOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingClientProto.TingItem getItem();

        int getOriginIndex();

        boolean hasItem();

        boolean hasOriginIndex();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingRGBAColor extends C23861l0<TingRGBAColor, Builder> implements TingRGBAColorOrBuilder {
        public static final int A_FIELD_NUMBER = 4;
        public static final int B_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TingRGBAColor DEFAULT_INSTANCE;
        public static final int G_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingRGBAColor> PARSER = null;
        public static final int R_FIELD_NUMBER = 1;

        /* renamed from: a_ */
        private float f69812a_;

        /* renamed from: b_ */
        private float f69813b_;
        private int bitField0_;

        /* renamed from: g_ */
        private float f69814g_;

        /* renamed from: r_ */
        private float f69815r_;

        public static final class Builder extends C23861l0.C23862a<TingRGBAColor, Builder> implements TingRGBAColorOrBuilder {
            public /* synthetic */ Builder(C243101 r1) {
                this();
            }

            public Builder clearA() {
                copyOnWrite();
                ((TingRGBAColor) this.instance).clearA();
                return this;
            }

            public Builder clearB() {
                copyOnWrite();
                ((TingRGBAColor) this.instance).clearB();
                return this;
            }

            public Builder clearG() {
                copyOnWrite();
                ((TingRGBAColor) this.instance).clearG();
                return this;
            }

            public Builder clearR() {
                copyOnWrite();
                ((TingRGBAColor) this.instance).clearR();
                return this;
            }

            public float getA() {
                return ((TingRGBAColor) this.instance).getA();
            }

            public float getB() {
                return ((TingRGBAColor) this.instance).getB();
            }

            public float getG() {
                return ((TingRGBAColor) this.instance).getG();
            }

            public float getR() {
                return ((TingRGBAColor) this.instance).getR();
            }

            public boolean hasA() {
                return ((TingRGBAColor) this.instance).hasA();
            }

            public boolean hasB() {
                return ((TingRGBAColor) this.instance).hasB();
            }

            public boolean hasG() {
                return ((TingRGBAColor) this.instance).hasG();
            }

            public boolean hasR() {
                return ((TingRGBAColor) this.instance).hasR();
            }

            public Builder setA(float f) {
                copyOnWrite();
                ((TingRGBAColor) this.instance).setA(f);
                return this;
            }

            public Builder setB(float f) {
                copyOnWrite();
                ((TingRGBAColor) this.instance).setB(f);
                return this;
            }

            public Builder setG(float f) {
                copyOnWrite();
                ((TingRGBAColor) this.instance).setG(f);
                return this;
            }

            public Builder setR(float f) {
                copyOnWrite();
                ((TingRGBAColor) this.instance).setR(f);
                return this;
            }

            private Builder() {
                super(TingRGBAColor.DEFAULT_INSTANCE);
            }
        }

        static {
            TingRGBAColor tingRGBAColor = new TingRGBAColor();
            DEFAULT_INSTANCE = tingRGBAColor;
            C23861l0.registerDefaultInstance(TingRGBAColor.class, tingRGBAColor);
        }

        private TingRGBAColor() {
        }

        /* access modifiers changed from: private */
        public void clearA() {
            this.bitField0_ &= -9;
            this.f69812a_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearB() {
            this.bitField0_ &= -5;
            this.f69813b_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearG() {
            this.bitField0_ &= -3;
            this.f69814g_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearR() {
            this.bitField0_ &= -2;
            this.f69815r_ = 0.0f;
        }

        public static TingRGBAColor getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingRGBAColor parseDelimitedFrom(InputStream inputStream) {
            return (TingRGBAColor) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingRGBAColor parseFrom(ByteBuffer byteBuffer) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingRGBAColor> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setA(float f) {
            this.bitField0_ |= 8;
            this.f69812a_ = f;
        }

        /* access modifiers changed from: private */
        public void setB(float f) {
            this.bitField0_ |= 4;
            this.f69813b_ = f;
        }

        /* access modifiers changed from: private */
        public void setG(float f) {
            this.bitField0_ |= 2;
            this.f69814g_ = f;
        }

        /* access modifiers changed from: private */
        public void setR(float f) {
            this.bitField0_ |= 1;
            this.f69815r_ = f;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"bitField0_", "r_", "g_", "b_", "a_"});
                case 3:
                    return new TingRGBAColor();
                case 4:
                    return new Builder((C243101) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingRGBAColor> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingRGBAColor.class) {
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

        public float getA() {
            return this.f69812a_;
        }

        public float getB() {
            return this.f69813b_;
        }

        public float getG() {
            return this.f69814g_;
        }

        public float getR() {
            return this.f69815r_;
        }

        public boolean hasA() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasB() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasG() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasR() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingRGBAColor tingRGBAColor) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingRGBAColor);
        }

        public static TingRGBAColor parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingRGBAColor) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingRGBAColor parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingRGBAColor parseFrom(C16994k kVar) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingRGBAColor parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingRGBAColor parseFrom(byte[] bArr) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingRGBAColor parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingRGBAColor parseFrom(InputStream inputStream) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingRGBAColor parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingRGBAColor parseFrom(C23856l lVar) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingRGBAColor parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingRGBAColor) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingRGBAColorOrBuilder extends C23848k1 {
        float getA();

        float getB();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        float getG();

        float getR();

        boolean hasA();

        boolean hasB();

        boolean hasG();

        boolean hasR();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingRGBAImageInfo extends C23861l0<TingRGBAImageInfo, Builder> implements TingRGBAImageInfoOrBuilder {
        public static final int BYTESPERPIXEL_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TingRGBAImageInfo DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingRGBAImageInfo> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int bitField0_;
        private int bytesPerPixel_;
        private int height_;
        private int width_;

        public static final class Builder extends C23861l0.C23862a<TingRGBAImageInfo, Builder> implements TingRGBAImageInfoOrBuilder {
            public /* synthetic */ Builder(C243101 r1) {
                this();
            }

            public Builder clearBytesPerPixel() {
                copyOnWrite();
                ((TingRGBAImageInfo) this.instance).clearBytesPerPixel();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((TingRGBAImageInfo) this.instance).clearHeight();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((TingRGBAImageInfo) this.instance).clearWidth();
                return this;
            }

            public int getBytesPerPixel() {
                return ((TingRGBAImageInfo) this.instance).getBytesPerPixel();
            }

            public int getHeight() {
                return ((TingRGBAImageInfo) this.instance).getHeight();
            }

            public int getWidth() {
                return ((TingRGBAImageInfo) this.instance).getWidth();
            }

            public boolean hasBytesPerPixel() {
                return ((TingRGBAImageInfo) this.instance).hasBytesPerPixel();
            }

            public boolean hasHeight() {
                return ((TingRGBAImageInfo) this.instance).hasHeight();
            }

            public boolean hasWidth() {
                return ((TingRGBAImageInfo) this.instance).hasWidth();
            }

            public Builder setBytesPerPixel(int i) {
                copyOnWrite();
                ((TingRGBAImageInfo) this.instance).setBytesPerPixel(i);
                return this;
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                ((TingRGBAImageInfo) this.instance).setHeight(i);
                return this;
            }

            public Builder setWidth(int i) {
                copyOnWrite();
                ((TingRGBAImageInfo) this.instance).setWidth(i);
                return this;
            }

            private Builder() {
                super(TingRGBAImageInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            TingRGBAImageInfo tingRGBAImageInfo = new TingRGBAImageInfo();
            DEFAULT_INSTANCE = tingRGBAImageInfo;
            C23861l0.registerDefaultInstance(TingRGBAImageInfo.class, tingRGBAImageInfo);
        }

        private TingRGBAImageInfo() {
        }

        /* access modifiers changed from: private */
        public void clearBytesPerPixel() {
            this.bitField0_ &= -5;
            this.bytesPerPixel_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -3;
            this.height_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWidth() {
            this.bitField0_ &= -2;
            this.width_ = 0;
        }

        public static TingRGBAImageInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingRGBAImageInfo parseDelimitedFrom(InputStream inputStream) {
            return (TingRGBAImageInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingRGBAImageInfo parseFrom(ByteBuffer byteBuffer) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingRGBAImageInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBytesPerPixel(int i) {
            this.bitField0_ |= 4;
            this.bytesPerPixel_ = i;
        }

        /* access modifiers changed from: private */
        public void setHeight(int i) {
            this.bitField0_ |= 2;
            this.height_ = i;
        }

        /* access modifiers changed from: private */
        public void setWidth(int i) {
            this.bitField0_ |= 1;
            this.width_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "width_", "height_", "bytesPerPixel_"});
                case 3:
                    return new TingRGBAImageInfo();
                case 4:
                    return new Builder((C243101) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingRGBAImageInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingRGBAImageInfo.class) {
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

        public int getBytesPerPixel() {
            return this.bytesPerPixel_;
        }

        public int getHeight() {
            return this.height_;
        }

        public int getWidth() {
            return this.width_;
        }

        public boolean hasBytesPerPixel() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasHeight() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasWidth() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingRGBAImageInfo tingRGBAImageInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingRGBAImageInfo);
        }

        public static TingRGBAImageInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingRGBAImageInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingRGBAImageInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingRGBAImageInfo parseFrom(C16994k kVar) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingRGBAImageInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingRGBAImageInfo parseFrom(byte[] bArr) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingRGBAImageInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingRGBAImageInfo parseFrom(InputStream inputStream) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingRGBAImageInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingRGBAImageInfo parseFrom(C23856l lVar) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingRGBAImageInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingRGBAImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingRGBAImageInfoOrBuilder extends C23848k1 {
        int getBytesPerPixel();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getHeight();

        int getWidth();

        boolean hasBytesPerPixel();

        boolean hasHeight();

        boolean hasWidth();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingRecentRecordGetPlayListInfoResult extends C23861l0<TingRecentRecordGetPlayListInfoResult, Builder> implements TingRecentRecordGetPlayListInfoResultOrBuilder {
        /* access modifiers changed from: private */
        public static final TingRecentRecordGetPlayListInfoResult DEFAULT_INSTANCE;
        public static final int INFO_FIELD_NUMBER = 3;
        public static final int MSG_FIELD_NUMBER = 2;
        private static volatile C24062w1<TingRecentRecordGetPlayListInfoResult> PARSER = null;
        public static final int RET_FIELD_NUMBER = 1;
        private int bitField0_;
        private TingPlayListInfo info_;
        private byte memoizedIsInitialized = 2;
        private String msg_ = "";
        private int ret_;

        public static final class Builder extends C23861l0.C23862a<TingRecentRecordGetPlayListInfoResult, Builder> implements TingRecentRecordGetPlayListInfoResultOrBuilder {
            public /* synthetic */ Builder(C243101 r1) {
                this();
            }

            public Builder clearInfo() {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).clearInfo();
                return this;
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).clearMsg();
                return this;
            }

            public Builder clearRet() {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).clearRet();
                return this;
            }

            public TingPlayListInfo getInfo() {
                return ((TingRecentRecordGetPlayListInfoResult) this.instance).getInfo();
            }

            public String getMsg() {
                return ((TingRecentRecordGetPlayListInfoResult) this.instance).getMsg();
            }

            public C16994k getMsgBytes() {
                return ((TingRecentRecordGetPlayListInfoResult) this.instance).getMsgBytes();
            }

            public int getRet() {
                return ((TingRecentRecordGetPlayListInfoResult) this.instance).getRet();
            }

            public boolean hasInfo() {
                return ((TingRecentRecordGetPlayListInfoResult) this.instance).hasInfo();
            }

            public boolean hasMsg() {
                return ((TingRecentRecordGetPlayListInfoResult) this.instance).hasMsg();
            }

            public boolean hasRet() {
                return ((TingRecentRecordGetPlayListInfoResult) this.instance).hasRet();
            }

            public Builder mergeInfo(TingPlayListInfo tingPlayListInfo) {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).mergeInfo(tingPlayListInfo);
                return this;
            }

            public Builder setInfo(TingPlayListInfo tingPlayListInfo) {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).setInfo(tingPlayListInfo);
                return this;
            }

            public Builder setMsg(String str) {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).setMsg(str);
                return this;
            }

            public Builder setMsgBytes(C16994k kVar) {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).setMsgBytes(kVar);
                return this;
            }

            public Builder setRet(int i) {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).setRet(i);
                return this;
            }

            private Builder() {
                super(TingRecentRecordGetPlayListInfoResult.DEFAULT_INSTANCE);
            }

            public Builder setInfo(TingPlayListInfo.Builder builder) {
                copyOnWrite();
                ((TingRecentRecordGetPlayListInfoResult) this.instance).setInfo((TingPlayListInfo) builder.build());
                return this;
            }
        }

        static {
            TingRecentRecordGetPlayListInfoResult tingRecentRecordGetPlayListInfoResult = new TingRecentRecordGetPlayListInfoResult();
            DEFAULT_INSTANCE = tingRecentRecordGetPlayListInfoResult;
            C23861l0.registerDefaultInstance(TingRecentRecordGetPlayListInfoResult.class, tingRecentRecordGetPlayListInfoResult);
        }

        private TingRecentRecordGetPlayListInfoResult() {
        }

        /* access modifiers changed from: private */
        public void clearInfo() {
            this.info_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearMsg() {
            this.bitField0_ &= -3;
            this.msg_ = getDefaultInstance().getMsg();
        }

        /* access modifiers changed from: private */
        public void clearRet() {
            this.bitField0_ &= -2;
            this.ret_ = 0;
        }

        public static TingRecentRecordGetPlayListInfoResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeInfo(TingPlayListInfo tingPlayListInfo) {
            tingPlayListInfo.getClass();
            TingPlayListInfo tingPlayListInfo2 = this.info_;
            if (tingPlayListInfo2 == null || tingPlayListInfo2 == TingPlayListInfo.getDefaultInstance()) {
                this.info_ = tingPlayListInfo;
            } else {
                this.info_ = (TingPlayListInfo) ((TingPlayListInfo.Builder) TingPlayListInfo.newBuilder(this.info_).mergeFrom(tingPlayListInfo)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingRecentRecordGetPlayListInfoResult parseDelimitedFrom(InputStream inputStream) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(ByteBuffer byteBuffer) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingRecentRecordGetPlayListInfoResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setInfo(TingPlayListInfo tingPlayListInfo) {
            tingPlayListInfo.getClass();
            this.info_ = tingPlayListInfo;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setMsg(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.msg_ = str;
        }

        /* access modifiers changed from: private */
        public void setMsgBytes(C16994k kVar) {
            this.msg_ = kVar.mo18752u();
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "ret_", "msg_", "info_"});
                case 3:
                    return new TingRecentRecordGetPlayListInfoResult();
                case 4:
                    return new Builder((C243101) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingRecentRecordGetPlayListInfoResult> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingRecentRecordGetPlayListInfoResult.class) {
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

        public TingPlayListInfo getInfo() {
            TingPlayListInfo tingPlayListInfo = this.info_;
            return tingPlayListInfo == null ? TingPlayListInfo.getDefaultInstance() : tingPlayListInfo;
        }

        public String getMsg() {
            return this.msg_;
        }

        public C16994k getMsgBytes() {
            return C16994k.m16791k(this.msg_);
        }

        public int getRet() {
            return this.ret_;
        }

        public boolean hasInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMsg() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRet() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingRecentRecordGetPlayListInfoResult tingRecentRecordGetPlayListInfoResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingRecentRecordGetPlayListInfoResult);
        }

        public static TingRecentRecordGetPlayListInfoResult parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(C16994k kVar) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(byte[] bArr) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(InputStream inputStream) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(C23856l lVar) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingRecentRecordGetPlayListInfoResult parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingRecentRecordGetPlayListInfoResult) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingRecentRecordGetPlayListInfoResultOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingPlayListInfo getInfo();

        String getMsg();

        C16994k getMsgBytes();

        int getRet();

        boolean hasInfo();

        boolean hasMsg();

        boolean hasRet();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TingToPlayInfo extends C23861l0<TingToPlayInfo, Builder> implements TingToPlayInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final TingToPlayInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<TingToPlayInfo> PARSER = null;
        public static final int PLAYITEM_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private TingPlayListItem playItem_;

        public static final class Builder extends C23861l0.C23862a<TingToPlayInfo, Builder> implements TingToPlayInfoOrBuilder {
            public /* synthetic */ Builder(C243101 r1) {
                this();
            }

            public Builder clearPlayItem() {
                copyOnWrite();
                ((TingToPlayInfo) this.instance).clearPlayItem();
                return this;
            }

            public TingPlayListItem getPlayItem() {
                return ((TingToPlayInfo) this.instance).getPlayItem();
            }

            public boolean hasPlayItem() {
                return ((TingToPlayInfo) this.instance).hasPlayItem();
            }

            public Builder mergePlayItem(TingPlayListItem tingPlayListItem) {
                copyOnWrite();
                ((TingToPlayInfo) this.instance).mergePlayItem(tingPlayListItem);
                return this;
            }

            public Builder setPlayItem(TingPlayListItem tingPlayListItem) {
                copyOnWrite();
                ((TingToPlayInfo) this.instance).setPlayItem(tingPlayListItem);
                return this;
            }

            private Builder() {
                super(TingToPlayInfo.DEFAULT_INSTANCE);
            }

            public Builder setPlayItem(TingPlayListItem.Builder builder) {
                copyOnWrite();
                ((TingToPlayInfo) this.instance).setPlayItem((TingPlayListItem) builder.build());
                return this;
            }
        }

        static {
            TingToPlayInfo tingToPlayInfo = new TingToPlayInfo();
            DEFAULT_INSTANCE = tingToPlayInfo;
            C23861l0.registerDefaultInstance(TingToPlayInfo.class, tingToPlayInfo);
        }

        private TingToPlayInfo() {
        }

        /* access modifiers changed from: private */
        public void clearPlayItem() {
            this.playItem_ = null;
            this.bitField0_ &= -2;
        }

        public static TingToPlayInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergePlayItem(TingPlayListItem tingPlayListItem) {
            tingPlayListItem.getClass();
            TingPlayListItem tingPlayListItem2 = this.playItem_;
            if (tingPlayListItem2 == null || tingPlayListItem2 == TingPlayListItem.getDefaultInstance()) {
                this.playItem_ = tingPlayListItem;
            } else {
                this.playItem_ = (TingPlayListItem) ((TingPlayListItem.Builder) TingPlayListItem.newBuilder(this.playItem_).mergeFrom(tingPlayListItem)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TingToPlayInfo parseDelimitedFrom(InputStream inputStream) {
            return (TingToPlayInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingToPlayInfo parseFrom(ByteBuffer byteBuffer) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TingToPlayInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPlayItem(TingPlayListItem tingPlayListItem) {
            tingPlayListItem.getClass();
            this.playItem_ = tingPlayListItem;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"bitField0_", "playItem_"});
                case 3:
                    return new TingToPlayInfo();
                case 4:
                    return new Builder((C243101) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TingToPlayInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TingToPlayInfo.class) {
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

        public TingPlayListItem getPlayItem() {
            TingPlayListItem tingPlayListItem = this.playItem_;
            return tingPlayListItem == null ? TingPlayListItem.getDefaultInstance() : tingPlayListItem;
        }

        public boolean hasPlayItem() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TingToPlayInfo tingToPlayInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tingToPlayInfo);
        }

        public static TingToPlayInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingToPlayInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingToPlayInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TingToPlayInfo parseFrom(C16994k kVar) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TingToPlayInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TingToPlayInfo parseFrom(byte[] bArr) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TingToPlayInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TingToPlayInfo parseFrom(InputStream inputStream) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TingToPlayInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TingToPlayInfo parseFrom(C23856l lVar) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TingToPlayInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TingToPlayInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TingToPlayInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        TingPlayListItem getPlayItem();

        boolean hasPlayItem();

        /* synthetic */ boolean isInitialized();
    }

    private TingAffBizProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
