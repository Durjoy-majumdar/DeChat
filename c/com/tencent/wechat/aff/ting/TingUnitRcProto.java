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

public final class TingUnitRcProto {

    /* renamed from: com.tencent.wechat.aff.ting.TingUnitRcProto$1 */
    public static /* synthetic */ class C243621 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69820xa1df5c61;

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
                f69820xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69820xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69820xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69820xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69820xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69820xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69820xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.ting.TingUnitRcProto.C243621.<clinit>():void");
        }
    }

    public static final class PlayTaskRet extends C23861l0<PlayTaskRet, Builder> implements PlayTaskRetOrBuilder {
        /* access modifiers changed from: private */
        public static final PlayTaskRet DEFAULT_INSTANCE;
        private static volatile C24062w1<PlayTaskRet> PARSER;

        public static final class Builder extends C23861l0.C23862a<PlayTaskRet, Builder> implements PlayTaskRetOrBuilder {
            public /* synthetic */ Builder(C243621 r1) {
                this();
            }

            private Builder() {
                super(PlayTaskRet.DEFAULT_INSTANCE);
            }
        }

        public static final class GetPlayMode extends C23861l0<GetPlayMode, Builder> implements GetPlayModeOrBuilder {
            /* access modifiers changed from: private */
            public static final GetPlayMode DEFAULT_INSTANCE;
            public static final int MODE_FIELD_NUMBER = 1;
            private static volatile C24062w1<GetPlayMode> PARSER;
            private int bitField0_;
            private long mode_;

            public static final class Builder extends C23861l0.C23862a<GetPlayMode, Builder> implements GetPlayModeOrBuilder {
                public /* synthetic */ Builder(C243621 r1) {
                    this();
                }

                public Builder clearMode() {
                    copyOnWrite();
                    ((GetPlayMode) this.instance).clearMode();
                    return this;
                }

                public long getMode() {
                    return ((GetPlayMode) this.instance).getMode();
                }

                public boolean hasMode() {
                    return ((GetPlayMode) this.instance).hasMode();
                }

                public Builder setMode(long j) {
                    copyOnWrite();
                    ((GetPlayMode) this.instance).setMode(j);
                    return this;
                }

                private Builder() {
                    super(GetPlayMode.DEFAULT_INSTANCE);
                }
            }

            static {
                GetPlayMode getPlayMode = new GetPlayMode();
                DEFAULT_INSTANCE = getPlayMode;
                C23861l0.registerDefaultInstance(GetPlayMode.class, getPlayMode);
            }

            private GetPlayMode() {
            }

            /* access modifiers changed from: private */
            public void clearMode() {
                this.bitField0_ &= -2;
                this.mode_ = 0;
            }

            public static GetPlayMode getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static GetPlayMode parseDelimitedFrom(InputStream inputStream) {
                return (GetPlayMode) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static GetPlayMode parseFrom(ByteBuffer byteBuffer) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<GetPlayMode> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setMode(long j) {
                this.bitField0_ |= 1;
                this.mode_ = j;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "mode_"});
                    case 3:
                        return new GetPlayMode();
                    case 4:
                        return new Builder((C243621) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<GetPlayMode> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (GetPlayMode.class) {
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

            public long getMode() {
                return this.mode_;
            }

            public boolean hasMode() {
                return (this.bitField0_ & 1) != 0;
            }

            public static Builder newBuilder(GetPlayMode getPlayMode) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(getPlayMode);
            }

            public static GetPlayMode parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (GetPlayMode) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static GetPlayMode parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static GetPlayMode parseFrom(C16994k kVar) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static GetPlayMode parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static GetPlayMode parseFrom(byte[] bArr) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static GetPlayMode parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static GetPlayMode parseFrom(InputStream inputStream) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static GetPlayMode parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static GetPlayMode parseFrom(C23856l lVar) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static GetPlayMode parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (GetPlayMode) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        public interface GetPlayModeOrBuilder extends C23848k1 {
            /* synthetic */ C23845j1 getDefaultInstanceForType();

            long getMode();

            boolean hasMode();

            /* synthetic */ boolean isInitialized();
        }

        static {
            PlayTaskRet playTaskRet = new PlayTaskRet();
            DEFAULT_INSTANCE = playTaskRet;
            C23861l0.registerDefaultInstance(PlayTaskRet.class, playTaskRet);
        }

        private PlayTaskRet() {
        }

        public static PlayTaskRet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PlayTaskRet parseDelimitedFrom(InputStream inputStream) {
            return (PlayTaskRet) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayTaskRet parseFrom(ByteBuffer byteBuffer) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<PlayTaskRet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
                case 3:
                    return new PlayTaskRet();
                case 4:
                    return new Builder((C243621) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<PlayTaskRet> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (PlayTaskRet.class) {
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

        public static Builder newBuilder(PlayTaskRet playTaskRet) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(playTaskRet);
        }

        public static PlayTaskRet parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (PlayTaskRet) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static PlayTaskRet parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static PlayTaskRet parseFrom(C16994k kVar) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static PlayTaskRet parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static PlayTaskRet parseFrom(byte[] bArr) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PlayTaskRet parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static PlayTaskRet parseFrom(InputStream inputStream) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PlayTaskRet parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static PlayTaskRet parseFrom(C23856l lVar) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static PlayTaskRet parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (PlayTaskRet) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface PlayTaskRetOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    private TingUnitRcProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
