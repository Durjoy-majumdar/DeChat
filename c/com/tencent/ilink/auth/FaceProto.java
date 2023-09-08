package com.tencent.ilink.auth;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23817d;
import com.google.protobuf.C23843i0;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23901n0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24062w1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class FaceProto {

    /* renamed from: com.tencent.ilink.auth.FaceProto$1 */
    public static /* synthetic */ class C240991 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69249xa1df5c61;

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
                f69249xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69249xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69249xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69249xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69249xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69249xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69249xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.ilink.auth.FaceProto.C240991.<clinit>():void");
        }
    }

    public enum BusinessType implements C23908o0.C23911c {
        kBusinessTypeUnknown(-1),
        kBusinessTypeWxBase(0),
        kBusinessTypeWxPay(1);
        
        private static final C23908o0.C23912d<BusinessType> internalValueMap = null;
        public static final int kBusinessTypeUnknown_VALUE = -1;
        public static final int kBusinessTypeWxBase_VALUE = 0;
        public static final int kBusinessTypeWxPay_VALUE = 1;
        private final int value;

        public static final class BusinessTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new BusinessTypeVerifier();
            }

            private BusinessTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return BusinessType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<BusinessType>() {
                public BusinessType findValueByNumber(int i) {
                    return BusinessType.forNumber(i);
                }
            };
        }

        private BusinessType(int i) {
            this.value = i;
        }

        public static BusinessType forNumber(int i) {
            if (i == -1) {
                return kBusinessTypeUnknown;
            }
            if (i == 0) {
                return kBusinessTypeWxBase;
            }
            if (i != 1) {
                return null;
            }
            return kBusinessTypeWxPay;
        }

        public static C23908o0.C23912d<BusinessType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return BusinessTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BusinessType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class EncryptInfo extends C23861l0<EncryptInfo, Builder> implements EncryptInfoOrBuilder {
        public static final int ACTIONS_FIELD_NUMBER = 2;
        public static final int CHECKSTR_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final EncryptInfo DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 1;
        private static volatile C24062w1<EncryptInfo> PARSER = null;
        public static final int RANDSTR_FIELD_NUMBER = 4;
        public static final int TMSTAMP_FIELD_NUMBER = 3;
        private static final C23908o0.C23916h.C23917a<Integer, LiveActionType> actions_converter_ = new C23908o0.C23916h.C23917a<Integer, LiveActionType>() {
            public LiveActionType convert(Integer num) {
                LiveActionType forNumber = LiveActionType.forNumber(num.intValue());
                return forNumber == null ? LiveActionType.ENUM_EYE_BLINK : forNumber;
            }
        };
        private C23908o0.C23915g actions_ = C23861l0.emptyIntList();
        private int bitField0_;
        private String checkstr_ = "";
        private String deviceid_ = "";
        private String randstr_ = "";
        private int tmstamp_;

        public static final class Builder extends C23861l0.C23862a<EncryptInfo, Builder> implements EncryptInfoOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder addActions(LiveActionType liveActionType) {
                copyOnWrite();
                ((EncryptInfo) this.instance).addActions(liveActionType);
                return this;
            }

            public Builder addAllActions(Iterable<? extends LiveActionType> iterable) {
                copyOnWrite();
                ((EncryptInfo) this.instance).addAllActions(iterable);
                return this;
            }

            public Builder clearActions() {
                copyOnWrite();
                ((EncryptInfo) this.instance).clearActions();
                return this;
            }

            public Builder clearCheckstr() {
                copyOnWrite();
                ((EncryptInfo) this.instance).clearCheckstr();
                return this;
            }

            public Builder clearDeviceid() {
                copyOnWrite();
                ((EncryptInfo) this.instance).clearDeviceid();
                return this;
            }

            public Builder clearRandstr() {
                copyOnWrite();
                ((EncryptInfo) this.instance).clearRandstr();
                return this;
            }

            public Builder clearTmstamp() {
                copyOnWrite();
                ((EncryptInfo) this.instance).clearTmstamp();
                return this;
            }

            public LiveActionType getActions(int i) {
                return ((EncryptInfo) this.instance).getActions(i);
            }

            public int getActionsCount() {
                return ((EncryptInfo) this.instance).getActionsCount();
            }

            public List<LiveActionType> getActionsList() {
                return ((EncryptInfo) this.instance).getActionsList();
            }

            public String getCheckstr() {
                return ((EncryptInfo) this.instance).getCheckstr();
            }

            public C16994k getCheckstrBytes() {
                return ((EncryptInfo) this.instance).getCheckstrBytes();
            }

            public String getDeviceid() {
                return ((EncryptInfo) this.instance).getDeviceid();
            }

            public C16994k getDeviceidBytes() {
                return ((EncryptInfo) this.instance).getDeviceidBytes();
            }

            public String getRandstr() {
                return ((EncryptInfo) this.instance).getRandstr();
            }

            public C16994k getRandstrBytes() {
                return ((EncryptInfo) this.instance).getRandstrBytes();
            }

            public int getTmstamp() {
                return ((EncryptInfo) this.instance).getTmstamp();
            }

            public boolean hasCheckstr() {
                return ((EncryptInfo) this.instance).hasCheckstr();
            }

            public boolean hasDeviceid() {
                return ((EncryptInfo) this.instance).hasDeviceid();
            }

            public boolean hasRandstr() {
                return ((EncryptInfo) this.instance).hasRandstr();
            }

            public boolean hasTmstamp() {
                return ((EncryptInfo) this.instance).hasTmstamp();
            }

            public Builder setActions(int i, LiveActionType liveActionType) {
                copyOnWrite();
                ((EncryptInfo) this.instance).setActions(i, liveActionType);
                return this;
            }

            public Builder setCheckstr(String str) {
                copyOnWrite();
                ((EncryptInfo) this.instance).setCheckstr(str);
                return this;
            }

            public Builder setCheckstrBytes(C16994k kVar) {
                copyOnWrite();
                ((EncryptInfo) this.instance).setCheckstrBytes(kVar);
                return this;
            }

            public Builder setDeviceid(String str) {
                copyOnWrite();
                ((EncryptInfo) this.instance).setDeviceid(str);
                return this;
            }

            public Builder setDeviceidBytes(C16994k kVar) {
                copyOnWrite();
                ((EncryptInfo) this.instance).setDeviceidBytes(kVar);
                return this;
            }

            public Builder setRandstr(String str) {
                copyOnWrite();
                ((EncryptInfo) this.instance).setRandstr(str);
                return this;
            }

            public Builder setRandstrBytes(C16994k kVar) {
                copyOnWrite();
                ((EncryptInfo) this.instance).setRandstrBytes(kVar);
                return this;
            }

            public Builder setTmstamp(int i) {
                copyOnWrite();
                ((EncryptInfo) this.instance).setTmstamp(i);
                return this;
            }

            private Builder() {
                super(EncryptInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            EncryptInfo encryptInfo = new EncryptInfo();
            DEFAULT_INSTANCE = encryptInfo;
            C23861l0.registerDefaultInstance(EncryptInfo.class, encryptInfo);
        }

        private EncryptInfo() {
        }

        /* access modifiers changed from: private */
        public void addActions(LiveActionType liveActionType) {
            liveActionType.getClass();
            ensureActionsIsMutable();
            ((C23901n0) this.actions_).mo37933h(liveActionType.getNumber());
        }

        /* access modifiers changed from: private */
        public void addAllActions(Iterable<? extends LiveActionType> iterable) {
            ensureActionsIsMutable();
            for (LiveActionType number : iterable) {
                ((C23901n0) this.actions_).mo37933h(number.getNumber());
            }
        }

        /* access modifiers changed from: private */
        public void clearActions() {
            this.actions_ = C23861l0.emptyIntList();
        }

        /* access modifiers changed from: private */
        public void clearCheckstr() {
            this.bitField0_ &= -9;
            this.checkstr_ = getDefaultInstance().getCheckstr();
        }

        /* access modifiers changed from: private */
        public void clearDeviceid() {
            this.bitField0_ &= -2;
            this.deviceid_ = getDefaultInstance().getDeviceid();
        }

        /* access modifiers changed from: private */
        public void clearRandstr() {
            this.bitField0_ &= -5;
            this.randstr_ = getDefaultInstance().getRandstr();
        }

        /* access modifiers changed from: private */
        public void clearTmstamp() {
            this.bitField0_ &= -3;
            this.tmstamp_ = 0;
        }

        private void ensureActionsIsMutable() {
            C23908o0.C23915g gVar = this.actions_;
            if (!((C23817d) gVar).f68221d) {
                this.actions_ = C23861l0.mutableCopy(gVar);
            }
        }

        public static EncryptInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EncryptInfo parseDelimitedFrom(InputStream inputStream) {
            return (EncryptInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptInfo parseFrom(ByteBuffer byteBuffer) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<EncryptInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setActions(int i, LiveActionType liveActionType) {
            liveActionType.getClass();
            ensureActionsIsMutable();
            ((C23901n0) this.actions_).mo37939n(i, liveActionType.getNumber());
        }

        /* access modifiers changed from: private */
        public void setCheckstr(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.checkstr_ = str;
        }

        /* access modifiers changed from: private */
        public void setCheckstrBytes(C16994k kVar) {
            this.checkstr_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setDeviceid(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.deviceid_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceidBytes(C16994k kVar) {
            this.deviceid_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setRandstr(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.randstr_ = str;
        }

        /* access modifiers changed from: private */
        public void setRandstrBytes(C16994k kVar) {
            this.randstr_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setTmstamp(int i) {
            this.bitField0_ |= 2;
            this.tmstamp_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e\u0003ဋ\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"bitField0_", "deviceid_", "actions_", LiveActionType.internalGetVerifier(), "tmstamp_", "randstr_", "checkstr_"});
                case 3:
                    return new EncryptInfo();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<EncryptInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (EncryptInfo.class) {
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

        public LiveActionType getActions(int i) {
            return actions_converter_.convert(Integer.valueOf(((C23901n0) this.actions_).mo37936k(i)));
        }

        public int getActionsCount() {
            return ((C23901n0) this.actions_).f68498f;
        }

        public List<LiveActionType> getActionsList() {
            return new C23908o0.C23916h(this.actions_, actions_converter_);
        }

        public String getCheckstr() {
            return this.checkstr_;
        }

        public C16994k getCheckstrBytes() {
            return C16994k.m16791k(this.checkstr_);
        }

        public String getDeviceid() {
            return this.deviceid_;
        }

        public C16994k getDeviceidBytes() {
            return C16994k.m16791k(this.deviceid_);
        }

        public String getRandstr() {
            return this.randstr_;
        }

        public C16994k getRandstrBytes() {
            return C16994k.m16791k(this.randstr_);
        }

        public int getTmstamp() {
            return this.tmstamp_;
        }

        public boolean hasCheckstr() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDeviceid() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasRandstr() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTmstamp() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(EncryptInfo encryptInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(encryptInfo);
        }

        public static EncryptInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (EncryptInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static EncryptInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static EncryptInfo parseFrom(C16994k kVar) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static EncryptInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static EncryptInfo parseFrom(byte[] bArr) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EncryptInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static EncryptInfo parseFrom(InputStream inputStream) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EncryptInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static EncryptInfo parseFrom(C23856l lVar) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static EncryptInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (EncryptInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface EncryptInfoOrBuilder extends C23848k1 {
        LiveActionType getActions(int i);

        int getActionsCount();

        List<LiveActionType> getActionsList();

        String getCheckstr();

        C16994k getCheckstrBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDeviceid();

        C16994k getDeviceidBytes();

        String getRandstr();

        C16994k getRandstrBytes();

        int getTmstamp();

        boolean hasCheckstr();

        boolean hasDeviceid();

        boolean hasRandstr();

        boolean hasTmstamp();

        /* synthetic */ boolean isInitialized();
    }

    public enum FaceDataType implements C23908o0.C23911c {
        kFaceDataType_3D(1),
        kFaceDataType_2D_Video(2);
        
        private static final C23908o0.C23912d<FaceDataType> internalValueMap = null;
        public static final int kFaceDataType_2D_Video_VALUE = 2;
        public static final int kFaceDataType_3D_VALUE = 1;
        private final int value;

        public static final class FaceDataTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new FaceDataTypeVerifier();
            }

            private FaceDataTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return FaceDataType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<FaceDataType>() {
                public FaceDataType findValueByNumber(int i) {
                    return FaceDataType.forNumber(i);
                }
            };
        }

        private FaceDataType(int i) {
            this.value = i;
        }

        public static FaceDataType forNumber(int i) {
            if (i == 1) {
                return kFaceDataType_3D;
            }
            if (i != 2) {
                return null;
            }
            return kFaceDataType_2D_Video;
        }

        public static C23908o0.C23912d<FaceDataType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return FaceDataTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FaceDataType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum FaceExtVerifyType implements C23908o0.C23911c {
        kFaceExtVerifyType_WxBase_Begin(0),
        kFaceExtVerifyType_WxBase_4PhoneNum(1),
        kFaceExtVerifyType_WxBase_End(999),
        kFaceExtVerifyType_WxPay_Begin(1000),
        kFaceExtVerifyType_WxPay_4PhoneNum(1001),
        kFaceExtVerifyType_WxPay_WholePhoneNum(1002),
        kFaceExtVerifyType_WxPay_QrCode(1003),
        kFaceExtVerifyType_WxPay_FacePin(1004),
        kFaceExtVerifyType_WxPay_End(kFaceExtVerifyType_WxPay_End_VALUE);
        
        private static final C23908o0.C23912d<FaceExtVerifyType> internalValueMap = null;
        public static final int kFaceExtVerifyType_WxBase_4PhoneNum_VALUE = 1;
        public static final int kFaceExtVerifyType_WxBase_Begin_VALUE = 0;
        public static final int kFaceExtVerifyType_WxBase_End_VALUE = 999;
        public static final int kFaceExtVerifyType_WxPay_4PhoneNum_VALUE = 1001;
        public static final int kFaceExtVerifyType_WxPay_Begin_VALUE = 1000;
        public static final int kFaceExtVerifyType_WxPay_End_VALUE = 1999;
        public static final int kFaceExtVerifyType_WxPay_FacePin_VALUE = 1004;
        public static final int kFaceExtVerifyType_WxPay_QrCode_VALUE = 1003;
        public static final int kFaceExtVerifyType_WxPay_WholePhoneNum_VALUE = 1002;
        private final int value;

        public static final class FaceExtVerifyTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new FaceExtVerifyTypeVerifier();
            }

            private FaceExtVerifyTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return FaceExtVerifyType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<FaceExtVerifyType>() {
                public FaceExtVerifyType findValueByNumber(int i) {
                    return FaceExtVerifyType.forNumber(i);
                }
            };
        }

        private FaceExtVerifyType(int i) {
            this.value = i;
        }

        public static FaceExtVerifyType forNumber(int i) {
            if (i == 0) {
                return kFaceExtVerifyType_WxBase_Begin;
            }
            if (i == 1) {
                return kFaceExtVerifyType_WxBase_4PhoneNum;
            }
            if (i == 1999) {
                return kFaceExtVerifyType_WxPay_End;
            }
            switch (i) {
                case 999:
                    return kFaceExtVerifyType_WxBase_End;
                case 1000:
                    return kFaceExtVerifyType_WxPay_Begin;
                case 1001:
                    return kFaceExtVerifyType_WxPay_4PhoneNum;
                case 1002:
                    return kFaceExtVerifyType_WxPay_WholePhoneNum;
                case 1003:
                    return kFaceExtVerifyType_WxPay_QrCode;
                case 1004:
                    return kFaceExtVerifyType_WxPay_FacePin;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<FaceExtVerifyType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return FaceExtVerifyTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FaceExtVerifyType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class FaceFrame extends C23861l0<FaceFrame, Builder> implements FaceFrameOrBuilder {
        /* access modifiers changed from: private */
        public static final FaceFrame DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 3;
        private static volatile C24062w1<FaceFrame> PARSER = null;
        public static final int X_COORDINATES_FIELD_NUMBER = 1;
        public static final int Y_COORDINATES_FIELD_NUMBER = 2;
        private int bitField0_;
        private C16994k image_ = C16994k.f46000e;
        private C23908o0.C23914f xCoordinates_ = C23861l0.emptyFloatList();
        private C23908o0.C23914f yCoordinates_ = C23861l0.emptyFloatList();

        public static final class Builder extends C23861l0.C23862a<FaceFrame, Builder> implements FaceFrameOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder addAllXCoordinates(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((FaceFrame) this.instance).addAllXCoordinates(iterable);
                return this;
            }

            public Builder addAllYCoordinates(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((FaceFrame) this.instance).addAllYCoordinates(iterable);
                return this;
            }

            public Builder addXCoordinates(float f) {
                copyOnWrite();
                ((FaceFrame) this.instance).addXCoordinates(f);
                return this;
            }

            public Builder addYCoordinates(float f) {
                copyOnWrite();
                ((FaceFrame) this.instance).addYCoordinates(f);
                return this;
            }

            public Builder clearImage() {
                copyOnWrite();
                ((FaceFrame) this.instance).clearImage();
                return this;
            }

            public Builder clearXCoordinates() {
                copyOnWrite();
                ((FaceFrame) this.instance).clearXCoordinates();
                return this;
            }

            public Builder clearYCoordinates() {
                copyOnWrite();
                ((FaceFrame) this.instance).clearYCoordinates();
                return this;
            }

            public C16994k getImage() {
                return ((FaceFrame) this.instance).getImage();
            }

            public float getXCoordinates(int i) {
                return ((FaceFrame) this.instance).getXCoordinates(i);
            }

            public int getXCoordinatesCount() {
                return ((FaceFrame) this.instance).getXCoordinatesCount();
            }

            public List<Float> getXCoordinatesList() {
                return Collections.unmodifiableList(((FaceFrame) this.instance).getXCoordinatesList());
            }

            public float getYCoordinates(int i) {
                return ((FaceFrame) this.instance).getYCoordinates(i);
            }

            public int getYCoordinatesCount() {
                return ((FaceFrame) this.instance).getYCoordinatesCount();
            }

            public List<Float> getYCoordinatesList() {
                return Collections.unmodifiableList(((FaceFrame) this.instance).getYCoordinatesList());
            }

            public boolean hasImage() {
                return ((FaceFrame) this.instance).hasImage();
            }

            public Builder setImage(C16994k kVar) {
                copyOnWrite();
                ((FaceFrame) this.instance).setImage(kVar);
                return this;
            }

            public Builder setXCoordinates(int i, float f) {
                copyOnWrite();
                ((FaceFrame) this.instance).setXCoordinates(i, f);
                return this;
            }

            public Builder setYCoordinates(int i, float f) {
                copyOnWrite();
                ((FaceFrame) this.instance).setYCoordinates(i, f);
                return this;
            }

            private Builder() {
                super(FaceFrame.DEFAULT_INSTANCE);
            }
        }

        static {
            FaceFrame faceFrame = new FaceFrame();
            DEFAULT_INSTANCE = faceFrame;
            C23861l0.registerDefaultInstance(FaceFrame.class, faceFrame);
        }

        private FaceFrame() {
        }

        /* access modifiers changed from: private */
        public void addAllXCoordinates(Iterable<? extends Float> iterable) {
            ensureXCoordinatesIsMutable();
            C23810b.addAll(iterable, this.xCoordinates_);
        }

        /* access modifiers changed from: private */
        public void addAllYCoordinates(Iterable<? extends Float> iterable) {
            ensureYCoordinatesIsMutable();
            C23810b.addAll(iterable, this.yCoordinates_);
        }

        /* access modifiers changed from: private */
        public void addXCoordinates(float f) {
            ensureXCoordinatesIsMutable();
            ((C23843i0) this.xCoordinates_).mo37694h(f);
        }

        /* access modifiers changed from: private */
        public void addYCoordinates(float f) {
            ensureYCoordinatesIsMutable();
            ((C23843i0) this.yCoordinates_).mo37694h(f);
        }

        /* access modifiers changed from: private */
        public void clearImage() {
            this.bitField0_ &= -2;
            this.image_ = getDefaultInstance().getImage();
        }

        /* access modifiers changed from: private */
        public void clearXCoordinates() {
            this.xCoordinates_ = C23861l0.emptyFloatList();
        }

        /* access modifiers changed from: private */
        public void clearYCoordinates() {
            this.yCoordinates_ = C23861l0.emptyFloatList();
        }

        private void ensureXCoordinatesIsMutable() {
            C23908o0.C23914f fVar = this.xCoordinates_;
            if (!((C23817d) fVar).f68221d) {
                this.xCoordinates_ = C23861l0.mutableCopy(fVar);
            }
        }

        private void ensureYCoordinatesIsMutable() {
            C23908o0.C23914f fVar = this.yCoordinates_;
            if (!((C23817d) fVar).f68221d) {
                this.yCoordinates_ = C23861l0.mutableCopy(fVar);
            }
        }

        public static FaceFrame getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FaceFrame parseDelimitedFrom(InputStream inputStream) {
            return (FaceFrame) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceFrame parseFrom(ByteBuffer byteBuffer) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FaceFrame> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setImage(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.image_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setXCoordinates(int i, float f) {
            ensureXCoordinatesIsMutable();
            C23843i0 i0Var = (C23843i0) this.xCoordinates_;
            i0Var.mo37528f();
            i0Var.mo37695i(i);
            float[] fArr = i0Var.f68336e;
            float f2 = fArr[i];
            fArr[i] = f;
        }

        /* access modifiers changed from: private */
        public void setYCoordinates(int i, float f) {
            ensureYCoordinatesIsMutable();
            C23843i0 i0Var = (C23843i0) this.yCoordinates_;
            i0Var.mo37528f();
            i0Var.mo37695i(i);
            float[] fArr = i0Var.f68336e;
            float f2 = fArr[i];
            fArr[i] = f;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ည\u0000", new Object[]{"bitField0_", "xCoordinates_", "yCoordinates_", "image_"});
                case 3:
                    return new FaceFrame();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FaceFrame> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FaceFrame.class) {
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

        public C16994k getImage() {
            return this.image_;
        }

        public float getXCoordinates(int i) {
            C23843i0 i0Var = (C23843i0) this.xCoordinates_;
            i0Var.mo37695i(i);
            return i0Var.f68336e[i];
        }

        public int getXCoordinatesCount() {
            return ((C23843i0) this.xCoordinates_).f68337f;
        }

        public List<Float> getXCoordinatesList() {
            return this.xCoordinates_;
        }

        public float getYCoordinates(int i) {
            C23843i0 i0Var = (C23843i0) this.yCoordinates_;
            i0Var.mo37695i(i);
            return i0Var.f68336e[i];
        }

        public int getYCoordinatesCount() {
            return ((C23843i0) this.yCoordinates_).f68337f;
        }

        public List<Float> getYCoordinatesList() {
            return this.yCoordinates_;
        }

        public boolean hasImage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FaceFrame faceFrame) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(faceFrame);
        }

        public static FaceFrame parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FaceFrame) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FaceFrame parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FaceFrame parseFrom(C16994k kVar) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FaceFrame parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FaceFrame parseFrom(byte[] bArr) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FaceFrame parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FaceFrame parseFrom(InputStream inputStream) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceFrame parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FaceFrame parseFrom(C23856l lVar) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FaceFrame parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FaceFrame) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FaceFrameOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getImage();

        float getXCoordinates(int i);

        int getXCoordinatesCount();

        List<Float> getXCoordinatesList();

        float getYCoordinates(int i);

        int getYCoordinatesCount();

        List<Float> getYCoordinatesList();

        boolean hasImage();

        /* synthetic */ boolean isInitialized();
    }

    public enum FaceRecognizeResType implements C23908o0.C23911c {
        kFaceRecognizeTypeRes_Non(0),
        kFaceRecognizeTypeRes_WxPay(1),
        kFaceRecognizeTypeRes_WxBase(2),
        kFaceRecognizeTypeRes_WxPayBaseAll(3);
        
        private static final C23908o0.C23912d<FaceRecognizeResType> internalValueMap = null;
        public static final int kFaceRecognizeTypeRes_Non_VALUE = 0;
        public static final int kFaceRecognizeTypeRes_WxBase_VALUE = 2;
        public static final int kFaceRecognizeTypeRes_WxPayBaseAll_VALUE = 3;
        public static final int kFaceRecognizeTypeRes_WxPay_VALUE = 1;
        private final int value;

        public static final class FaceRecognizeResTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new FaceRecognizeResTypeVerifier();
            }

            private FaceRecognizeResTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return FaceRecognizeResType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<FaceRecognizeResType>() {
                public FaceRecognizeResType findValueByNumber(int i) {
                    return FaceRecognizeResType.forNumber(i);
                }
            };
        }

        private FaceRecognizeResType(int i) {
            this.value = i;
        }

        public static FaceRecognizeResType forNumber(int i) {
            if (i == 0) {
                return kFaceRecognizeTypeRes_Non;
            }
            if (i == 1) {
                return kFaceRecognizeTypeRes_WxPay;
            }
            if (i == 2) {
                return kFaceRecognizeTypeRes_WxBase;
            }
            if (i != 3) {
                return null;
            }
            return kFaceRecognizeTypeRes_WxPayBaseAll;
        }

        public static C23908o0.C23912d<FaceRecognizeResType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return FaceRecognizeResTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FaceRecognizeResType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum FaceRecognizeType implements C23908o0.C23911c {
        kFaceRecognizeType_WxPayOnly(1),
        kFaceRecognizeType_Both_WxPayMain(2),
        kFaceRecognizeType_WxBaseOnly(3),
        kFaceRecognizeType_Both_WxBaseMain(4);
        
        private static final C23908o0.C23912d<FaceRecognizeType> internalValueMap = null;
        public static final int kFaceRecognizeType_Both_WxBaseMain_VALUE = 4;
        public static final int kFaceRecognizeType_Both_WxPayMain_VALUE = 2;
        public static final int kFaceRecognizeType_WxBaseOnly_VALUE = 3;
        public static final int kFaceRecognizeType_WxPayOnly_VALUE = 1;
        private final int value;

        public static final class FaceRecognizeTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new FaceRecognizeTypeVerifier();
            }

            private FaceRecognizeTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return FaceRecognizeType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<FaceRecognizeType>() {
                public FaceRecognizeType findValueByNumber(int i) {
                    return FaceRecognizeType.forNumber(i);
                }
            };
        }

        private FaceRecognizeType(int i) {
            this.value = i;
        }

        public static FaceRecognizeType forNumber(int i) {
            if (i == 1) {
                return kFaceRecognizeType_WxPayOnly;
            }
            if (i == 2) {
                return kFaceRecognizeType_Both_WxPayMain;
            }
            if (i == 3) {
                return kFaceRecognizeType_WxBaseOnly;
            }
            if (i != 4) {
                return null;
            }
            return kFaceRecognizeType_Both_WxBaseMain;
        }

        public static C23908o0.C23912d<FaceRecognizeType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return FaceRecognizeTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FaceRecognizeType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class FaceRect extends C23861l0<FaceRect, Builder> implements FaceRectOrBuilder {
        /* access modifiers changed from: private */
        public static final FaceRect DEFAULT_INSTANCE;
        public static final int FACE_HEIGHT_FIELD_NUMBER = 4;
        public static final int FACE_WIDTH_FIELD_NUMBER = 3;
        public static final int FACE_X_FIELD_NUMBER = 1;
        public static final int FACE_Y_FIELD_NUMBER = 2;
        private static volatile C24062w1<FaceRect> PARSER;
        private int bitField0_;
        private int faceHeight_;
        private int faceWidth_;
        private int faceX_;
        private int faceY_;

        public static final class Builder extends C23861l0.C23862a<FaceRect, Builder> implements FaceRectOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearFaceHeight() {
                copyOnWrite();
                ((FaceRect) this.instance).clearFaceHeight();
                return this;
            }

            public Builder clearFaceWidth() {
                copyOnWrite();
                ((FaceRect) this.instance).clearFaceWidth();
                return this;
            }

            public Builder clearFaceX() {
                copyOnWrite();
                ((FaceRect) this.instance).clearFaceX();
                return this;
            }

            public Builder clearFaceY() {
                copyOnWrite();
                ((FaceRect) this.instance).clearFaceY();
                return this;
            }

            public int getFaceHeight() {
                return ((FaceRect) this.instance).getFaceHeight();
            }

            public int getFaceWidth() {
                return ((FaceRect) this.instance).getFaceWidth();
            }

            public int getFaceX() {
                return ((FaceRect) this.instance).getFaceX();
            }

            public int getFaceY() {
                return ((FaceRect) this.instance).getFaceY();
            }

            public boolean hasFaceHeight() {
                return ((FaceRect) this.instance).hasFaceHeight();
            }

            public boolean hasFaceWidth() {
                return ((FaceRect) this.instance).hasFaceWidth();
            }

            public boolean hasFaceX() {
                return ((FaceRect) this.instance).hasFaceX();
            }

            public boolean hasFaceY() {
                return ((FaceRect) this.instance).hasFaceY();
            }

            public Builder setFaceHeight(int i) {
                copyOnWrite();
                ((FaceRect) this.instance).setFaceHeight(i);
                return this;
            }

            public Builder setFaceWidth(int i) {
                copyOnWrite();
                ((FaceRect) this.instance).setFaceWidth(i);
                return this;
            }

            public Builder setFaceX(int i) {
                copyOnWrite();
                ((FaceRect) this.instance).setFaceX(i);
                return this;
            }

            public Builder setFaceY(int i) {
                copyOnWrite();
                ((FaceRect) this.instance).setFaceY(i);
                return this;
            }

            private Builder() {
                super(FaceRect.DEFAULT_INSTANCE);
            }
        }

        static {
            FaceRect faceRect = new FaceRect();
            DEFAULT_INSTANCE = faceRect;
            C23861l0.registerDefaultInstance(FaceRect.class, faceRect);
        }

        private FaceRect() {
        }

        /* access modifiers changed from: private */
        public void clearFaceHeight() {
            this.bitField0_ &= -9;
            this.faceHeight_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFaceWidth() {
            this.bitField0_ &= -5;
            this.faceWidth_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFaceX() {
            this.bitField0_ &= -2;
            this.faceX_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFaceY() {
            this.bitField0_ &= -3;
            this.faceY_ = 0;
        }

        public static FaceRect getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FaceRect parseDelimitedFrom(InputStream inputStream) {
            return (FaceRect) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceRect parseFrom(ByteBuffer byteBuffer) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FaceRect> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFaceHeight(int i) {
            this.bitField0_ |= 8;
            this.faceHeight_ = i;
        }

        /* access modifiers changed from: private */
        public void setFaceWidth(int i) {
            this.bitField0_ |= 4;
            this.faceWidth_ = i;
        }

        /* access modifiers changed from: private */
        public void setFaceX(int i) {
            this.bitField0_ |= 1;
            this.faceX_ = i;
        }

        /* access modifiers changed from: private */
        public void setFaceY(int i) {
            this.bitField0_ |= 2;
            this.faceY_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "faceX_", "faceY_", "faceWidth_", "faceHeight_"});
                case 3:
                    return new FaceRect();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FaceRect> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FaceRect.class) {
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

        public int getFaceHeight() {
            return this.faceHeight_;
        }

        public int getFaceWidth() {
            return this.faceWidth_;
        }

        public int getFaceX() {
            return this.faceX_;
        }

        public int getFaceY() {
            return this.faceY_;
        }

        public boolean hasFaceHeight() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFaceWidth() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFaceX() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFaceY() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FaceRect faceRect) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(faceRect);
        }

        public static FaceRect parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FaceRect) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FaceRect parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FaceRect parseFrom(C16994k kVar) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FaceRect parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FaceRect parseFrom(byte[] bArr) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FaceRect parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FaceRect parseFrom(InputStream inputStream) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceRect parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FaceRect parseFrom(C23856l lVar) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FaceRect parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FaceRect) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FaceRectOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getFaceHeight();

        int getFaceWidth();

        int getFaceX();

        int getFaceY();

        boolean hasFaceHeight();

        boolean hasFaceWidth();

        boolean hasFaceX();

        boolean hasFaceY();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FaceVideo extends C23861l0<FaceVideo, Builder> implements FaceVideoOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final FaceVideo DEFAULT_INSTANCE;
        public static final int FRAMES_FIELD_NUMBER = 1;
        private static volatile C24062w1<FaceVideo> PARSER;
        private int action_;
        private int bitField0_;
        private C23908o0.C23919j<FaceFrame> frames_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<FaceVideo, Builder> implements FaceVideoOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder addAllFrames(Iterable<? extends FaceFrame> iterable) {
                copyOnWrite();
                ((FaceVideo) this.instance).addAllFrames(iterable);
                return this;
            }

            public Builder addFrames(FaceFrame faceFrame) {
                copyOnWrite();
                ((FaceVideo) this.instance).addFrames(faceFrame);
                return this;
            }

            public Builder clearAction() {
                copyOnWrite();
                ((FaceVideo) this.instance).clearAction();
                return this;
            }

            public Builder clearFrames() {
                copyOnWrite();
                ((FaceVideo) this.instance).clearFrames();
                return this;
            }

            public LiveActionType getAction() {
                return ((FaceVideo) this.instance).getAction();
            }

            public FaceFrame getFrames(int i) {
                return ((FaceVideo) this.instance).getFrames(i);
            }

            public int getFramesCount() {
                return ((FaceVideo) this.instance).getFramesCount();
            }

            public List<FaceFrame> getFramesList() {
                return Collections.unmodifiableList(((FaceVideo) this.instance).getFramesList());
            }

            public boolean hasAction() {
                return ((FaceVideo) this.instance).hasAction();
            }

            public Builder removeFrames(int i) {
                copyOnWrite();
                ((FaceVideo) this.instance).removeFrames(i);
                return this;
            }

            public Builder setAction(LiveActionType liveActionType) {
                copyOnWrite();
                ((FaceVideo) this.instance).setAction(liveActionType);
                return this;
            }

            public Builder setFrames(int i, FaceFrame faceFrame) {
                copyOnWrite();
                ((FaceVideo) this.instance).setFrames(i, faceFrame);
                return this;
            }

            private Builder() {
                super(FaceVideo.DEFAULT_INSTANCE);
            }

            public Builder addFrames(int i, FaceFrame faceFrame) {
                copyOnWrite();
                ((FaceVideo) this.instance).addFrames(i, faceFrame);
                return this;
            }

            public Builder setFrames(int i, FaceFrame.Builder builder) {
                copyOnWrite();
                ((FaceVideo) this.instance).setFrames(i, (FaceFrame) builder.build());
                return this;
            }

            public Builder addFrames(FaceFrame.Builder builder) {
                copyOnWrite();
                ((FaceVideo) this.instance).addFrames((FaceFrame) builder.build());
                return this;
            }

            public Builder addFrames(int i, FaceFrame.Builder builder) {
                copyOnWrite();
                ((FaceVideo) this.instance).addFrames(i, (FaceFrame) builder.build());
                return this;
            }
        }

        static {
            FaceVideo faceVideo = new FaceVideo();
            DEFAULT_INSTANCE = faceVideo;
            C23861l0.registerDefaultInstance(FaceVideo.class, faceVideo);
        }

        private FaceVideo() {
        }

        /* access modifiers changed from: private */
        public void addAllFrames(Iterable<? extends FaceFrame> iterable) {
            ensureFramesIsMutable();
            C23810b.addAll(iterable, this.frames_);
        }

        /* access modifiers changed from: private */
        public void addFrames(FaceFrame faceFrame) {
            faceFrame.getClass();
            ensureFramesIsMutable();
            this.frames_.add(faceFrame);
        }

        /* access modifiers changed from: private */
        public void clearAction() {
            this.bitField0_ &= -2;
            this.action_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFrames() {
            this.frames_ = C23861l0.emptyProtobufList();
        }

        private void ensureFramesIsMutable() {
            C23908o0.C23919j<FaceFrame> jVar = this.frames_;
            if (!jVar.mo37523Q()) {
                this.frames_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FaceVideo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FaceVideo parseDelimitedFrom(InputStream inputStream) {
            return (FaceVideo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceVideo parseFrom(ByteBuffer byteBuffer) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FaceVideo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeFrames(int i) {
            ensureFramesIsMutable();
            this.frames_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAction(LiveActionType liveActionType) {
            this.action_ = liveActionType.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setFrames(int i, FaceFrame faceFrame) {
            faceFrame.getClass();
            ensureFramesIsMutable();
            this.frames_.set(i, faceFrame);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"bitField0_", "frames_", FaceFrame.class, "action_", LiveActionType.internalGetVerifier()});
                case 3:
                    return new FaceVideo();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FaceVideo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FaceVideo.class) {
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

        public LiveActionType getAction() {
            LiveActionType forNumber = LiveActionType.forNumber(this.action_);
            return forNumber == null ? LiveActionType.ENUM_EYE_BLINK : forNumber;
        }

        public FaceFrame getFrames(int i) {
            return this.frames_.get(i);
        }

        public int getFramesCount() {
            return this.frames_.size();
        }

        public List<FaceFrame> getFramesList() {
            return this.frames_;
        }

        public FaceFrameOrBuilder getFramesOrBuilder(int i) {
            return this.frames_.get(i);
        }

        public List<? extends FaceFrameOrBuilder> getFramesOrBuilderList() {
            return this.frames_;
        }

        public boolean hasAction() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FaceVideo faceVideo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(faceVideo);
        }

        public static FaceVideo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FaceVideo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FaceVideo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FaceVideo parseFrom(C16994k kVar) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addFrames(int i, FaceFrame faceFrame) {
            faceFrame.getClass();
            ensureFramesIsMutable();
            this.frames_.add(i, faceFrame);
        }

        public static FaceVideo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FaceVideo parseFrom(byte[] bArr) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FaceVideo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FaceVideo parseFrom(InputStream inputStream) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FaceVideo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FaceVideo parseFrom(C23856l lVar) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FaceVideo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FaceVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FaceVideoOrBuilder extends C23848k1 {
        LiveActionType getAction();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FaceFrame getFrames(int i);

        int getFramesCount();

        List<FaceFrame> getFramesList();

        boolean hasAction();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkFaceExtVerifyRequest extends C23861l0<IlinkFaceExtVerifyRequest, Builder> implements IlinkFaceExtVerifyRequestOrBuilder {
        public static final int BUSINESS_REQ_FIELD_NUMBER = 4;
        public static final int BUSINESS_TYPE_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final IlinkFaceExtVerifyRequest DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkFaceExtVerifyRequest> PARSER = null;
        public static final int RETRY_COUNT_FIELD_NUMBER = 5;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 1;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int bitField0_;
        private C16994k businessReq_ = C16994k.f46000e;
        private int businessType_ = -1;
        private int retryCount_;
        private int timeoutMs_;
        private int type_ = 1;

        public static final class Builder extends C23861l0.C23862a<IlinkFaceExtVerifyRequest, Builder> implements IlinkFaceExtVerifyRequestOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearBusinessReq() {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).clearBusinessReq();
                return this;
            }

            public Builder clearBusinessType() {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).clearBusinessType();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).clearTimeoutMs();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).clearType();
                return this;
            }

            public C16994k getBusinessReq() {
                return ((IlinkFaceExtVerifyRequest) this.instance).getBusinessReq();
            }

            public BusinessType getBusinessType() {
                return ((IlinkFaceExtVerifyRequest) this.instance).getBusinessType();
            }

            public int getRetryCount() {
                return ((IlinkFaceExtVerifyRequest) this.instance).getRetryCount();
            }

            public int getTimeoutMs() {
                return ((IlinkFaceExtVerifyRequest) this.instance).getTimeoutMs();
            }

            public FaceExtVerifyType getType() {
                return ((IlinkFaceExtVerifyRequest) this.instance).getType();
            }

            public boolean hasBusinessReq() {
                return ((IlinkFaceExtVerifyRequest) this.instance).hasBusinessReq();
            }

            public boolean hasBusinessType() {
                return ((IlinkFaceExtVerifyRequest) this.instance).hasBusinessType();
            }

            public boolean hasRetryCount() {
                return ((IlinkFaceExtVerifyRequest) this.instance).hasRetryCount();
            }

            public boolean hasTimeoutMs() {
                return ((IlinkFaceExtVerifyRequest) this.instance).hasTimeoutMs();
            }

            public boolean hasType() {
                return ((IlinkFaceExtVerifyRequest) this.instance).hasType();
            }

            public Builder setBusinessReq(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).setBusinessReq(kVar);
                return this;
            }

            public Builder setBusinessType(BusinessType businessType) {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).setBusinessType(businessType);
                return this;
            }

            public Builder setRetryCount(int i) {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).setRetryCount(i);
                return this;
            }

            public Builder setTimeoutMs(int i) {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).setTimeoutMs(i);
                return this;
            }

            public Builder setType(FaceExtVerifyType faceExtVerifyType) {
                copyOnWrite();
                ((IlinkFaceExtVerifyRequest) this.instance).setType(faceExtVerifyType);
                return this;
            }

            private Builder() {
                super(IlinkFaceExtVerifyRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkFaceExtVerifyRequest ilinkFaceExtVerifyRequest = new IlinkFaceExtVerifyRequest();
            DEFAULT_INSTANCE = ilinkFaceExtVerifyRequest;
            C23861l0.registerDefaultInstance(IlinkFaceExtVerifyRequest.class, ilinkFaceExtVerifyRequest);
        }

        private IlinkFaceExtVerifyRequest() {
        }

        /* access modifiers changed from: private */
        public void clearBusinessReq() {
            this.bitField0_ &= -9;
            this.businessReq_ = getDefaultInstance().getBusinessReq();
        }

        /* access modifiers changed from: private */
        public void clearBusinessType() {
            this.bitField0_ &= -5;
            this.businessType_ = -1;
        }

        /* access modifiers changed from: private */
        public void clearRetryCount() {
            this.bitField0_ &= -17;
            this.retryCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -2;
            this.timeoutMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -3;
            this.type_ = 1;
        }

        public static IlinkFaceExtVerifyRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkFaceExtVerifyRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkFaceExtVerifyRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBusinessReq(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.businessReq_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setBusinessType(BusinessType businessType) {
            this.businessType_ = businessType.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setRetryCount(int i) {
            this.bitField0_ |= 16;
            this.retryCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setTimeoutMs(int i) {
            this.bitField0_ |= 1;
            this.timeoutMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setType(FaceExtVerifyType faceExtVerifyType) {
            this.type_ = faceExtVerifyType.getNumber();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ည\u0003\u0005င\u0004", new Object[]{"bitField0_", "timeoutMs_", "type_", FaceExtVerifyType.internalGetVerifier(), "businessType_", BusinessType.internalGetVerifier(), "businessReq_", "retryCount_"});
                case 3:
                    return new IlinkFaceExtVerifyRequest();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkFaceExtVerifyRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkFaceExtVerifyRequest.class) {
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

        public C16994k getBusinessReq() {
            return this.businessReq_;
        }

        public BusinessType getBusinessType() {
            BusinessType forNumber = BusinessType.forNumber(this.businessType_);
            return forNumber == null ? BusinessType.kBusinessTypeUnknown : forNumber;
        }

        public int getRetryCount() {
            return this.retryCount_;
        }

        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        public FaceExtVerifyType getType() {
            FaceExtVerifyType forNumber = FaceExtVerifyType.forNumber(this.type_);
            return forNumber == null ? FaceExtVerifyType.kFaceExtVerifyType_WxBase_4PhoneNum : forNumber;
        }

        public boolean hasBusinessReq() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasBusinessType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasRetryCount() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkFaceExtVerifyRequest ilinkFaceExtVerifyRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkFaceExtVerifyRequest);
        }

        public static IlinkFaceExtVerifyRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(C16994k kVar) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(byte[] bArr) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(InputStream inputStream) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(C23856l lVar) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkFaceExtVerifyRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkFaceExtVerifyRequestOrBuilder extends C23848k1 {
        C16994k getBusinessReq();

        BusinessType getBusinessType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getRetryCount();

        int getTimeoutMs();

        FaceExtVerifyType getType();

        boolean hasBusinessReq();

        boolean hasBusinessType();

        boolean hasRetryCount();

        boolean hasTimeoutMs();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkFaceExtVerifyResponse extends C23861l0<IlinkFaceExtVerifyResponse, Builder> implements IlinkFaceExtVerifyResponseOrBuilder {
        public static final int BUSINESS_RESP_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final IlinkFaceExtVerifyResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkFaceExtVerifyResponse> PARSER = null;
        public static final int PASS_TYPE_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private C16994k businessResp_ = C16994k.f46000e;
        private int passType_;
        private int type_ = 1;

        public static final class Builder extends C23861l0.C23862a<IlinkFaceExtVerifyResponse, Builder> implements IlinkFaceExtVerifyResponseOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearBusinessResp() {
                copyOnWrite();
                ((IlinkFaceExtVerifyResponse) this.instance).clearBusinessResp();
                return this;
            }

            public Builder clearPassType() {
                copyOnWrite();
                ((IlinkFaceExtVerifyResponse) this.instance).clearPassType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((IlinkFaceExtVerifyResponse) this.instance).clearType();
                return this;
            }

            public C16994k getBusinessResp() {
                return ((IlinkFaceExtVerifyResponse) this.instance).getBusinessResp();
            }

            public FaceRecognizeResType getPassType() {
                return ((IlinkFaceExtVerifyResponse) this.instance).getPassType();
            }

            public FaceExtVerifyType getType() {
                return ((IlinkFaceExtVerifyResponse) this.instance).getType();
            }

            public boolean hasBusinessResp() {
                return ((IlinkFaceExtVerifyResponse) this.instance).hasBusinessResp();
            }

            public boolean hasPassType() {
                return ((IlinkFaceExtVerifyResponse) this.instance).hasPassType();
            }

            public boolean hasType() {
                return ((IlinkFaceExtVerifyResponse) this.instance).hasType();
            }

            public Builder setBusinessResp(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceExtVerifyResponse) this.instance).setBusinessResp(kVar);
                return this;
            }

            public Builder setPassType(FaceRecognizeResType faceRecognizeResType) {
                copyOnWrite();
                ((IlinkFaceExtVerifyResponse) this.instance).setPassType(faceRecognizeResType);
                return this;
            }

            public Builder setType(FaceExtVerifyType faceExtVerifyType) {
                copyOnWrite();
                ((IlinkFaceExtVerifyResponse) this.instance).setType(faceExtVerifyType);
                return this;
            }

            private Builder() {
                super(IlinkFaceExtVerifyResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkFaceExtVerifyResponse ilinkFaceExtVerifyResponse = new IlinkFaceExtVerifyResponse();
            DEFAULT_INSTANCE = ilinkFaceExtVerifyResponse;
            C23861l0.registerDefaultInstance(IlinkFaceExtVerifyResponse.class, ilinkFaceExtVerifyResponse);
        }

        private IlinkFaceExtVerifyResponse() {
        }

        /* access modifiers changed from: private */
        public void clearBusinessResp() {
            this.bitField0_ &= -5;
            this.businessResp_ = getDefaultInstance().getBusinessResp();
        }

        /* access modifiers changed from: private */
        public void clearPassType() {
            this.bitField0_ &= -3;
            this.passType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 1;
        }

        public static IlinkFaceExtVerifyResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkFaceExtVerifyResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkFaceExtVerifyResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBusinessResp(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.businessResp_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setPassType(FaceRecognizeResType faceRecognizeResType) {
            this.passType_ = faceRecognizeResType.getNumber();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setType(FaceExtVerifyType faceExtVerifyType) {
            this.type_ = faceExtVerifyType.getNumber();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "type_", FaceExtVerifyType.internalGetVerifier(), "passType_", FaceRecognizeResType.internalGetVerifier(), "businessResp_"});
                case 3:
                    return new IlinkFaceExtVerifyResponse();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkFaceExtVerifyResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkFaceExtVerifyResponse.class) {
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

        public C16994k getBusinessResp() {
            return this.businessResp_;
        }

        public FaceRecognizeResType getPassType() {
            FaceRecognizeResType forNumber = FaceRecognizeResType.forNumber(this.passType_);
            return forNumber == null ? FaceRecognizeResType.kFaceRecognizeTypeRes_Non : forNumber;
        }

        public FaceExtVerifyType getType() {
            FaceExtVerifyType forNumber = FaceExtVerifyType.forNumber(this.type_);
            return forNumber == null ? FaceExtVerifyType.kFaceExtVerifyType_WxBase_4PhoneNum : forNumber;
        }

        public boolean hasBusinessResp() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPassType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkFaceExtVerifyResponse ilinkFaceExtVerifyResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkFaceExtVerifyResponse);
        }

        public static IlinkFaceExtVerifyResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(C16994k kVar) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(byte[] bArr) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(InputStream inputStream) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(C23856l lVar) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkFaceExtVerifyResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkFaceExtVerifyResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkFaceExtVerifyResponseOrBuilder extends C23848k1 {
        C16994k getBusinessResp();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FaceRecognizeResType getPassType();

        FaceExtVerifyType getType();

        boolean hasBusinessResp();

        boolean hasPassType();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkFaceRecognizeConfigRequest extends C23861l0<IlinkFaceRecognizeConfigRequest, Builder> implements IlinkFaceRecognizeConfigRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkFaceRecognizeConfigRequest DEFAULT_INSTANCE;
        public static final int ENV_DATA_FIELD_NUMBER = 3;
        private static volatile C24062w1<IlinkFaceRecognizeConfigRequest> PARSER = null;
        public static final int RECO_TYPE_FIELD_NUMBER = 2;
        public static final int RETRY_COUNT_FIELD_NUMBER = 4;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 1;
        private int bitField0_;
        private C16994k envData_ = C16994k.f46000e;
        private int recoType_ = 1;
        private int retryCount_;
        private int timeoutMs_;

        public static final class Builder extends C23861l0.C23862a<IlinkFaceRecognizeConfigRequest, Builder> implements IlinkFaceRecognizeConfigRequestOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearEnvData() {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigRequest) this.instance).clearEnvData();
                return this;
            }

            public Builder clearRecoType() {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigRequest) this.instance).clearRecoType();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigRequest) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigRequest) this.instance).clearTimeoutMs();
                return this;
            }

            public C16994k getEnvData() {
                return ((IlinkFaceRecognizeConfigRequest) this.instance).getEnvData();
            }

            public FaceRecognizeType getRecoType() {
                return ((IlinkFaceRecognizeConfigRequest) this.instance).getRecoType();
            }

            public int getRetryCount() {
                return ((IlinkFaceRecognizeConfigRequest) this.instance).getRetryCount();
            }

            public int getTimeoutMs() {
                return ((IlinkFaceRecognizeConfigRequest) this.instance).getTimeoutMs();
            }

            public boolean hasEnvData() {
                return ((IlinkFaceRecognizeConfigRequest) this.instance).hasEnvData();
            }

            public boolean hasRecoType() {
                return ((IlinkFaceRecognizeConfigRequest) this.instance).hasRecoType();
            }

            public boolean hasRetryCount() {
                return ((IlinkFaceRecognizeConfigRequest) this.instance).hasRetryCount();
            }

            public boolean hasTimeoutMs() {
                return ((IlinkFaceRecognizeConfigRequest) this.instance).hasTimeoutMs();
            }

            public Builder setEnvData(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigRequest) this.instance).setEnvData(kVar);
                return this;
            }

            public Builder setRecoType(FaceRecognizeType faceRecognizeType) {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigRequest) this.instance).setRecoType(faceRecognizeType);
                return this;
            }

            public Builder setRetryCount(int i) {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigRequest) this.instance).setRetryCount(i);
                return this;
            }

            public Builder setTimeoutMs(int i) {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigRequest) this.instance).setTimeoutMs(i);
                return this;
            }

            private Builder() {
                super(IlinkFaceRecognizeConfigRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkFaceRecognizeConfigRequest ilinkFaceRecognizeConfigRequest = new IlinkFaceRecognizeConfigRequest();
            DEFAULT_INSTANCE = ilinkFaceRecognizeConfigRequest;
            C23861l0.registerDefaultInstance(IlinkFaceRecognizeConfigRequest.class, ilinkFaceRecognizeConfigRequest);
        }

        private IlinkFaceRecognizeConfigRequest() {
        }

        /* access modifiers changed from: private */
        public void clearEnvData() {
            this.bitField0_ &= -5;
            this.envData_ = getDefaultInstance().getEnvData();
        }

        /* access modifiers changed from: private */
        public void clearRecoType() {
            this.bitField0_ &= -3;
            this.recoType_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearRetryCount() {
            this.bitField0_ &= -9;
            this.retryCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -2;
            this.timeoutMs_ = 0;
        }

        public static IlinkFaceRecognizeConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkFaceRecognizeConfigRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkFaceRecognizeConfigRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEnvData(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.envData_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setRecoType(FaceRecognizeType faceRecognizeType) {
            this.recoType_ = faceRecognizeType.getNumber();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setRetryCount(int i) {
            this.bitField0_ |= 8;
            this.retryCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setTimeoutMs(int i) {
            this.bitField0_ |= 1;
            this.timeoutMs_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004င\u0003", new Object[]{"bitField0_", "timeoutMs_", "recoType_", FaceRecognizeType.internalGetVerifier(), "envData_", "retryCount_"});
                case 3:
                    return new IlinkFaceRecognizeConfigRequest();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkFaceRecognizeConfigRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkFaceRecognizeConfigRequest.class) {
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

        public C16994k getEnvData() {
            return this.envData_;
        }

        public FaceRecognizeType getRecoType() {
            FaceRecognizeType forNumber = FaceRecognizeType.forNumber(this.recoType_);
            return forNumber == null ? FaceRecognizeType.kFaceRecognizeType_WxPayOnly : forNumber;
        }

        public int getRetryCount() {
            return this.retryCount_;
        }

        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        public boolean hasEnvData() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasRecoType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRetryCount() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkFaceRecognizeConfigRequest ilinkFaceRecognizeConfigRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkFaceRecognizeConfigRequest);
        }

        public static IlinkFaceRecognizeConfigRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(C16994k kVar) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(byte[] bArr) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(InputStream inputStream) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(C23856l lVar) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkFaceRecognizeConfigRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkFaceRecognizeConfigRequestOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getEnvData();

        FaceRecognizeType getRecoType();

        int getRetryCount();

        int getTimeoutMs();

        boolean hasEnvData();

        boolean hasRecoType();

        boolean hasRetryCount();

        boolean hasTimeoutMs();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkFaceRecognizeConfigResponse extends C23861l0<IlinkFaceRecognizeConfigResponse, Builder> implements IlinkFaceRecognizeConfigResponseOrBuilder {
        public static final int CONFIG_DATA_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final IlinkFaceRecognizeConfigResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkFaceRecognizeConfigResponse> PARSER;
        private int bitField0_;
        private C16994k configData_ = C16994k.f46000e;

        public static final class Builder extends C23861l0.C23862a<IlinkFaceRecognizeConfigResponse, Builder> implements IlinkFaceRecognizeConfigResponseOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearConfigData() {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigResponse) this.instance).clearConfigData();
                return this;
            }

            public C16994k getConfigData() {
                return ((IlinkFaceRecognizeConfigResponse) this.instance).getConfigData();
            }

            public boolean hasConfigData() {
                return ((IlinkFaceRecognizeConfigResponse) this.instance).hasConfigData();
            }

            public Builder setConfigData(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceRecognizeConfigResponse) this.instance).setConfigData(kVar);
                return this;
            }

            private Builder() {
                super(IlinkFaceRecognizeConfigResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkFaceRecognizeConfigResponse ilinkFaceRecognizeConfigResponse = new IlinkFaceRecognizeConfigResponse();
            DEFAULT_INSTANCE = ilinkFaceRecognizeConfigResponse;
            C23861l0.registerDefaultInstance(IlinkFaceRecognizeConfigResponse.class, ilinkFaceRecognizeConfigResponse);
        }

        private IlinkFaceRecognizeConfigResponse() {
        }

        /* access modifiers changed from: private */
        public void clearConfigData() {
            this.bitField0_ &= -2;
            this.configData_ = getDefaultInstance().getConfigData();
        }

        public static IlinkFaceRecognizeConfigResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkFaceRecognizeConfigResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkFaceRecognizeConfigResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConfigData(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.configData_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "configData_"});
                case 3:
                    return new IlinkFaceRecognizeConfigResponse();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkFaceRecognizeConfigResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkFaceRecognizeConfigResponse.class) {
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

        public C16994k getConfigData() {
            return this.configData_;
        }

        public boolean hasConfigData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkFaceRecognizeConfigResponse ilinkFaceRecognizeConfigResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkFaceRecognizeConfigResponse);
        }

        public static IlinkFaceRecognizeConfigResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(C16994k kVar) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(byte[] bArr) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(InputStream inputStream) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(C23856l lVar) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkFaceRecognizeConfigResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkFaceRecognizeConfigResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkFaceRecognizeConfigResponseOrBuilder extends C23848k1 {
        C16994k getConfigData();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasConfigData();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkFaceRecognizeRequest extends C23861l0<IlinkFaceRecognizeRequest, Builder> implements IlinkFaceRecognizeRequestOrBuilder {
        public static final int DATA_TYPE_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final IlinkFaceRecognizeRequest DEFAULT_INSTANCE;
        public static final int FACE_DATA_FIELD_NUMBER = 4;
        private static volatile C24062w1<IlinkFaceRecognizeRequest> PARSER = null;
        public static final int RECG_TYPE_FIELD_NUMBER = 2;
        public static final int RETRY_COUNT_FIELD_NUMBER = 7;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 1;
        public static final int WXBASE_REQ_FIELD_NUMBER = 5;
        public static final int WXPAY_REQ_FIELD_NUMBER = 6;
        private int bitField0_;
        private int dataType_ = 1;
        private C16994k faceData_;
        private int recgType_ = 1;
        private int retryCount_;
        private int timeoutMs_;
        private C16994k wxbaseReq_;
        private C16994k wxpayReq_;

        public static final class Builder extends C23861l0.C23862a<IlinkFaceRecognizeRequest, Builder> implements IlinkFaceRecognizeRequestOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearDataType() {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).clearDataType();
                return this;
            }

            public Builder clearFaceData() {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).clearFaceData();
                return this;
            }

            public Builder clearRecgType() {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).clearRecgType();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).clearTimeoutMs();
                return this;
            }

            public Builder clearWxbaseReq() {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).clearWxbaseReq();
                return this;
            }

            public Builder clearWxpayReq() {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).clearWxpayReq();
                return this;
            }

            public FaceDataType getDataType() {
                return ((IlinkFaceRecognizeRequest) this.instance).getDataType();
            }

            public C16994k getFaceData() {
                return ((IlinkFaceRecognizeRequest) this.instance).getFaceData();
            }

            public FaceRecognizeType getRecgType() {
                return ((IlinkFaceRecognizeRequest) this.instance).getRecgType();
            }

            public int getRetryCount() {
                return ((IlinkFaceRecognizeRequest) this.instance).getRetryCount();
            }

            public int getTimeoutMs() {
                return ((IlinkFaceRecognizeRequest) this.instance).getTimeoutMs();
            }

            public C16994k getWxbaseReq() {
                return ((IlinkFaceRecognizeRequest) this.instance).getWxbaseReq();
            }

            public C16994k getWxpayReq() {
                return ((IlinkFaceRecognizeRequest) this.instance).getWxpayReq();
            }

            public boolean hasDataType() {
                return ((IlinkFaceRecognizeRequest) this.instance).hasDataType();
            }

            public boolean hasFaceData() {
                return ((IlinkFaceRecognizeRequest) this.instance).hasFaceData();
            }

            public boolean hasRecgType() {
                return ((IlinkFaceRecognizeRequest) this.instance).hasRecgType();
            }

            public boolean hasRetryCount() {
                return ((IlinkFaceRecognizeRequest) this.instance).hasRetryCount();
            }

            public boolean hasTimeoutMs() {
                return ((IlinkFaceRecognizeRequest) this.instance).hasTimeoutMs();
            }

            public boolean hasWxbaseReq() {
                return ((IlinkFaceRecognizeRequest) this.instance).hasWxbaseReq();
            }

            public boolean hasWxpayReq() {
                return ((IlinkFaceRecognizeRequest) this.instance).hasWxpayReq();
            }

            public Builder setDataType(FaceDataType faceDataType) {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).setDataType(faceDataType);
                return this;
            }

            public Builder setFaceData(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).setFaceData(kVar);
                return this;
            }

            public Builder setRecgType(FaceRecognizeType faceRecognizeType) {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).setRecgType(faceRecognizeType);
                return this;
            }

            public Builder setRetryCount(int i) {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).setRetryCount(i);
                return this;
            }

            public Builder setTimeoutMs(int i) {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).setTimeoutMs(i);
                return this;
            }

            public Builder setWxbaseReq(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).setWxbaseReq(kVar);
                return this;
            }

            public Builder setWxpayReq(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceRecognizeRequest) this.instance).setWxpayReq(kVar);
                return this;
            }

            private Builder() {
                super(IlinkFaceRecognizeRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkFaceRecognizeRequest ilinkFaceRecognizeRequest = new IlinkFaceRecognizeRequest();
            DEFAULT_INSTANCE = ilinkFaceRecognizeRequest;
            C23861l0.registerDefaultInstance(IlinkFaceRecognizeRequest.class, ilinkFaceRecognizeRequest);
        }

        private IlinkFaceRecognizeRequest() {
            C16994k kVar = C16994k.f46000e;
            this.faceData_ = kVar;
            this.wxbaseReq_ = kVar;
            this.wxpayReq_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearDataType() {
            this.bitField0_ &= -5;
            this.dataType_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearFaceData() {
            this.bitField0_ &= -9;
            this.faceData_ = getDefaultInstance().getFaceData();
        }

        /* access modifiers changed from: private */
        public void clearRecgType() {
            this.bitField0_ &= -3;
            this.recgType_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearRetryCount() {
            this.bitField0_ &= -65;
            this.retryCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -2;
            this.timeoutMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWxbaseReq() {
            this.bitField0_ &= -17;
            this.wxbaseReq_ = getDefaultInstance().getWxbaseReq();
        }

        /* access modifiers changed from: private */
        public void clearWxpayReq() {
            this.bitField0_ &= -33;
            this.wxpayReq_ = getDefaultInstance().getWxpayReq();
        }

        public static IlinkFaceRecognizeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkFaceRecognizeRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceRecognizeRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkFaceRecognizeRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDataType(FaceDataType faceDataType) {
            this.dataType_ = faceDataType.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setFaceData(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.faceData_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setRecgType(FaceRecognizeType faceRecognizeType) {
            this.recgType_ = faceRecognizeType.getNumber();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setRetryCount(int i) {
            this.bitField0_ |= 64;
            this.retryCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setTimeoutMs(int i) {
            this.bitField0_ |= 1;
            this.timeoutMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setWxbaseReq(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.wxbaseReq_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setWxpayReq(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32;
            this.wxpayReq_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007င\u0006", new Object[]{"bitField0_", "timeoutMs_", "recgType_", FaceRecognizeType.internalGetVerifier(), "dataType_", FaceDataType.internalGetVerifier(), "faceData_", "wxbaseReq_", "wxpayReq_", "retryCount_"});
                case 3:
                    return new IlinkFaceRecognizeRequest();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkFaceRecognizeRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkFaceRecognizeRequest.class) {
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

        public FaceDataType getDataType() {
            FaceDataType forNumber = FaceDataType.forNumber(this.dataType_);
            return forNumber == null ? FaceDataType.kFaceDataType_3D : forNumber;
        }

        public C16994k getFaceData() {
            return this.faceData_;
        }

        public FaceRecognizeType getRecgType() {
            FaceRecognizeType forNumber = FaceRecognizeType.forNumber(this.recgType_);
            return forNumber == null ? FaceRecognizeType.kFaceRecognizeType_WxPayOnly : forNumber;
        }

        public int getRetryCount() {
            return this.retryCount_;
        }

        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        public C16994k getWxbaseReq() {
            return this.wxbaseReq_;
        }

        public C16994k getWxpayReq() {
            return this.wxpayReq_;
        }

        public boolean hasDataType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFaceData() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRecgType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRetryCount() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasWxbaseReq() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasWxpayReq() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(IlinkFaceRecognizeRequest ilinkFaceRecognizeRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkFaceRecognizeRequest);
        }

        public static IlinkFaceRecognizeRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceRecognizeRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkFaceRecognizeRequest parseFrom(C16994k kVar) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkFaceRecognizeRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkFaceRecognizeRequest parseFrom(byte[] bArr) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkFaceRecognizeRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkFaceRecognizeRequest parseFrom(InputStream inputStream) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceRecognizeRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceRecognizeRequest parseFrom(C23856l lVar) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkFaceRecognizeRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkFaceRecognizeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkFaceRecognizeRequestOrBuilder extends C23848k1 {
        FaceDataType getDataType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getFaceData();

        FaceRecognizeType getRecgType();

        int getRetryCount();

        int getTimeoutMs();

        C16994k getWxbaseReq();

        C16994k getWxpayReq();

        boolean hasDataType();

        boolean hasFaceData();

        boolean hasRecgType();

        boolean hasRetryCount();

        boolean hasTimeoutMs();

        boolean hasWxbaseReq();

        boolean hasWxpayReq();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkFaceRecognizeResponse extends C23861l0<IlinkFaceRecognizeResponse, Builder> implements IlinkFaceRecognizeResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkFaceRecognizeResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkFaceRecognizeResponse> PARSER = null;
        public static final int PASS_TYPE_FIELD_NUMBER = 3;
        public static final int WXBASE_RESP_FIELD_NUMBER = 1;
        public static final int WXPAY_RESP_FIELD_NUMBER = 2;
        private int bitField0_;
        private int passType_;
        private C16994k wxbaseResp_;
        private C16994k wxpayResp_;

        public static final class Builder extends C23861l0.C23862a<IlinkFaceRecognizeResponse, Builder> implements IlinkFaceRecognizeResponseOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearPassType() {
                copyOnWrite();
                ((IlinkFaceRecognizeResponse) this.instance).clearPassType();
                return this;
            }

            public Builder clearWxbaseResp() {
                copyOnWrite();
                ((IlinkFaceRecognizeResponse) this.instance).clearWxbaseResp();
                return this;
            }

            public Builder clearWxpayResp() {
                copyOnWrite();
                ((IlinkFaceRecognizeResponse) this.instance).clearWxpayResp();
                return this;
            }

            public FaceRecognizeResType getPassType() {
                return ((IlinkFaceRecognizeResponse) this.instance).getPassType();
            }

            public C16994k getWxbaseResp() {
                return ((IlinkFaceRecognizeResponse) this.instance).getWxbaseResp();
            }

            public C16994k getWxpayResp() {
                return ((IlinkFaceRecognizeResponse) this.instance).getWxpayResp();
            }

            public boolean hasPassType() {
                return ((IlinkFaceRecognizeResponse) this.instance).hasPassType();
            }

            public boolean hasWxbaseResp() {
                return ((IlinkFaceRecognizeResponse) this.instance).hasWxbaseResp();
            }

            public boolean hasWxpayResp() {
                return ((IlinkFaceRecognizeResponse) this.instance).hasWxpayResp();
            }

            public Builder setPassType(FaceRecognizeResType faceRecognizeResType) {
                copyOnWrite();
                ((IlinkFaceRecognizeResponse) this.instance).setPassType(faceRecognizeResType);
                return this;
            }

            public Builder setWxbaseResp(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceRecognizeResponse) this.instance).setWxbaseResp(kVar);
                return this;
            }

            public Builder setWxpayResp(C16994k kVar) {
                copyOnWrite();
                ((IlinkFaceRecognizeResponse) this.instance).setWxpayResp(kVar);
                return this;
            }

            private Builder() {
                super(IlinkFaceRecognizeResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkFaceRecognizeResponse ilinkFaceRecognizeResponse = new IlinkFaceRecognizeResponse();
            DEFAULT_INSTANCE = ilinkFaceRecognizeResponse;
            C23861l0.registerDefaultInstance(IlinkFaceRecognizeResponse.class, ilinkFaceRecognizeResponse);
        }

        private IlinkFaceRecognizeResponse() {
            C16994k kVar = C16994k.f46000e;
            this.wxbaseResp_ = kVar;
            this.wxpayResp_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearPassType() {
            this.bitField0_ &= -5;
            this.passType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWxbaseResp() {
            this.bitField0_ &= -2;
            this.wxbaseResp_ = getDefaultInstance().getWxbaseResp();
        }

        /* access modifiers changed from: private */
        public void clearWxpayResp() {
            this.bitField0_ &= -3;
            this.wxpayResp_ = getDefaultInstance().getWxpayResp();
        }

        public static IlinkFaceRecognizeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkFaceRecognizeResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceRecognizeResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkFaceRecognizeResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPassType(FaceRecognizeResType faceRecognizeResType) {
            this.passType_ = faceRecognizeResType.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setWxbaseResp(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.wxbaseResp_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setWxpayResp(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.wxpayResp_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "wxbaseResp_", "wxpayResp_", "passType_", FaceRecognizeResType.internalGetVerifier()});
                case 3:
                    return new IlinkFaceRecognizeResponse();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkFaceRecognizeResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkFaceRecognizeResponse.class) {
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

        public FaceRecognizeResType getPassType() {
            FaceRecognizeResType forNumber = FaceRecognizeResType.forNumber(this.passType_);
            return forNumber == null ? FaceRecognizeResType.kFaceRecognizeTypeRes_Non : forNumber;
        }

        public C16994k getWxbaseResp() {
            return this.wxbaseResp_;
        }

        public C16994k getWxpayResp() {
            return this.wxpayResp_;
        }

        public boolean hasPassType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasWxbaseResp() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasWxpayResp() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkFaceRecognizeResponse ilinkFaceRecognizeResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkFaceRecognizeResponse);
        }

        public static IlinkFaceRecognizeResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceRecognizeResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkFaceRecognizeResponse parseFrom(C16994k kVar) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkFaceRecognizeResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkFaceRecognizeResponse parseFrom(byte[] bArr) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkFaceRecognizeResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkFaceRecognizeResponse parseFrom(InputStream inputStream) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkFaceRecognizeResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkFaceRecognizeResponse parseFrom(C23856l lVar) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkFaceRecognizeResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkFaceRecognizeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkFaceRecognizeResponseOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FaceRecognizeResType getPassType();

        C16994k getWxbaseResp();

        C16994k getWxpayResp();

        boolean hasPassType();

        boolean hasWxbaseResp();

        boolean hasWxpayResp();

        /* synthetic */ boolean isInitialized();
    }

    public static final class KeyPoints extends C23861l0<KeyPoints, Builder> implements KeyPointsOrBuilder {
        /* access modifiers changed from: private */
        public static final KeyPoints DEFAULT_INSTANCE;
        public static final int LEFT_EYE_X_FIELD_NUMBER = 1;
        public static final int LEFT_EYE_Y_FIELD_NUMBER = 2;
        public static final int LEFT_MOUTH_X_FIELD_NUMBER = 7;
        public static final int LEFT_MOUTH_Y_FIELD_NUMBER = 8;
        public static final int NOSE_X_FIELD_NUMBER = 5;
        public static final int NOSE_Y_FIELD_NUMBER = 6;
        private static volatile C24062w1<KeyPoints> PARSER = null;
        public static final int RIGHT_EYE_X_FIELD_NUMBER = 3;
        public static final int RIGHT_EYE_Y_FIELD_NUMBER = 4;
        public static final int RIGHT_MOUTH_X_FIELD_NUMBER = 9;
        public static final int RIGHT_MOUTH_Y_FIELD_NUMBER = 10;
        private int bitField0_;
        private float leftEyeX_;
        private float leftEyeY_;
        private float leftMouthX_;
        private float leftMouthY_;
        private float noseX_;
        private float noseY_;
        private float rightEyeX_;
        private float rightEyeY_;
        private float rightMouthX_;
        private float rightMouthY_;

        public static final class Builder extends C23861l0.C23862a<KeyPoints, Builder> implements KeyPointsOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearLeftEyeX() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearLeftEyeX();
                return this;
            }

            public Builder clearLeftEyeY() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearLeftEyeY();
                return this;
            }

            public Builder clearLeftMouthX() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearLeftMouthX();
                return this;
            }

            public Builder clearLeftMouthY() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearLeftMouthY();
                return this;
            }

            public Builder clearNoseX() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearNoseX();
                return this;
            }

            public Builder clearNoseY() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearNoseY();
                return this;
            }

            public Builder clearRightEyeX() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearRightEyeX();
                return this;
            }

            public Builder clearRightEyeY() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearRightEyeY();
                return this;
            }

            public Builder clearRightMouthX() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearRightMouthX();
                return this;
            }

            public Builder clearRightMouthY() {
                copyOnWrite();
                ((KeyPoints) this.instance).clearRightMouthY();
                return this;
            }

            public float getLeftEyeX() {
                return ((KeyPoints) this.instance).getLeftEyeX();
            }

            public float getLeftEyeY() {
                return ((KeyPoints) this.instance).getLeftEyeY();
            }

            public float getLeftMouthX() {
                return ((KeyPoints) this.instance).getLeftMouthX();
            }

            public float getLeftMouthY() {
                return ((KeyPoints) this.instance).getLeftMouthY();
            }

            public float getNoseX() {
                return ((KeyPoints) this.instance).getNoseX();
            }

            public float getNoseY() {
                return ((KeyPoints) this.instance).getNoseY();
            }

            public float getRightEyeX() {
                return ((KeyPoints) this.instance).getRightEyeX();
            }

            public float getRightEyeY() {
                return ((KeyPoints) this.instance).getRightEyeY();
            }

            public float getRightMouthX() {
                return ((KeyPoints) this.instance).getRightMouthX();
            }

            public float getRightMouthY() {
                return ((KeyPoints) this.instance).getRightMouthY();
            }

            public boolean hasLeftEyeX() {
                return ((KeyPoints) this.instance).hasLeftEyeX();
            }

            public boolean hasLeftEyeY() {
                return ((KeyPoints) this.instance).hasLeftEyeY();
            }

            public boolean hasLeftMouthX() {
                return ((KeyPoints) this.instance).hasLeftMouthX();
            }

            public boolean hasLeftMouthY() {
                return ((KeyPoints) this.instance).hasLeftMouthY();
            }

            public boolean hasNoseX() {
                return ((KeyPoints) this.instance).hasNoseX();
            }

            public boolean hasNoseY() {
                return ((KeyPoints) this.instance).hasNoseY();
            }

            public boolean hasRightEyeX() {
                return ((KeyPoints) this.instance).hasRightEyeX();
            }

            public boolean hasRightEyeY() {
                return ((KeyPoints) this.instance).hasRightEyeY();
            }

            public boolean hasRightMouthX() {
                return ((KeyPoints) this.instance).hasRightMouthX();
            }

            public boolean hasRightMouthY() {
                return ((KeyPoints) this.instance).hasRightMouthY();
            }

            public Builder setLeftEyeX(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setLeftEyeX(f);
                return this;
            }

            public Builder setLeftEyeY(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setLeftEyeY(f);
                return this;
            }

            public Builder setLeftMouthX(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setLeftMouthX(f);
                return this;
            }

            public Builder setLeftMouthY(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setLeftMouthY(f);
                return this;
            }

            public Builder setNoseX(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setNoseX(f);
                return this;
            }

            public Builder setNoseY(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setNoseY(f);
                return this;
            }

            public Builder setRightEyeX(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setRightEyeX(f);
                return this;
            }

            public Builder setRightEyeY(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setRightEyeY(f);
                return this;
            }

            public Builder setRightMouthX(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setRightMouthX(f);
                return this;
            }

            public Builder setRightMouthY(float f) {
                copyOnWrite();
                ((KeyPoints) this.instance).setRightMouthY(f);
                return this;
            }

            private Builder() {
                super(KeyPoints.DEFAULT_INSTANCE);
            }
        }

        static {
            KeyPoints keyPoints = new KeyPoints();
            DEFAULT_INSTANCE = keyPoints;
            C23861l0.registerDefaultInstance(KeyPoints.class, keyPoints);
        }

        private KeyPoints() {
        }

        /* access modifiers changed from: private */
        public void clearLeftEyeX() {
            this.bitField0_ &= -2;
            this.leftEyeX_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearLeftEyeY() {
            this.bitField0_ &= -3;
            this.leftEyeY_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearLeftMouthX() {
            this.bitField0_ &= -65;
            this.leftMouthX_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearLeftMouthY() {
            this.bitField0_ &= -129;
            this.leftMouthY_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearNoseX() {
            this.bitField0_ &= -17;
            this.noseX_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearNoseY() {
            this.bitField0_ &= -33;
            this.noseY_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearRightEyeX() {
            this.bitField0_ &= -5;
            this.rightEyeX_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearRightEyeY() {
            this.bitField0_ &= -9;
            this.rightEyeY_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearRightMouthX() {
            this.bitField0_ &= -257;
            this.rightMouthX_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearRightMouthY() {
            this.bitField0_ &= -513;
            this.rightMouthY_ = 0.0f;
        }

        public static KeyPoints getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static KeyPoints parseDelimitedFrom(InputStream inputStream) {
            return (KeyPoints) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeyPoints parseFrom(ByteBuffer byteBuffer) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<KeyPoints> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLeftEyeX(float f) {
            this.bitField0_ |= 1;
            this.leftEyeX_ = f;
        }

        /* access modifiers changed from: private */
        public void setLeftEyeY(float f) {
            this.bitField0_ |= 2;
            this.leftEyeY_ = f;
        }

        /* access modifiers changed from: private */
        public void setLeftMouthX(float f) {
            this.bitField0_ |= 64;
            this.leftMouthX_ = f;
        }

        /* access modifiers changed from: private */
        public void setLeftMouthY(float f) {
            this.bitField0_ |= 128;
            this.leftMouthY_ = f;
        }

        /* access modifiers changed from: private */
        public void setNoseX(float f) {
            this.bitField0_ |= 16;
            this.noseX_ = f;
        }

        /* access modifiers changed from: private */
        public void setNoseY(float f) {
            this.bitField0_ |= 32;
            this.noseY_ = f;
        }

        /* access modifiers changed from: private */
        public void setRightEyeX(float f) {
            this.bitField0_ |= 4;
            this.rightEyeX_ = f;
        }

        /* access modifiers changed from: private */
        public void setRightEyeY(float f) {
            this.bitField0_ |= 8;
            this.rightEyeY_ = f;
        }

        /* access modifiers changed from: private */
        public void setRightMouthX(float f) {
            this.bitField0_ |= 256;
            this.rightMouthX_ = f;
        }

        /* access modifiers changed from: private */
        public void setRightMouthY(float f) {
            this.bitField0_ |= 512;
            this.rightMouthY_ = f;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t", new Object[]{"bitField0_", "leftEyeX_", "leftEyeY_", "rightEyeX_", "rightEyeY_", "noseX_", "noseY_", "leftMouthX_", "leftMouthY_", "rightMouthX_", "rightMouthY_"});
                case 3:
                    return new KeyPoints();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<KeyPoints> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (KeyPoints.class) {
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

        public float getLeftEyeX() {
            return this.leftEyeX_;
        }

        public float getLeftEyeY() {
            return this.leftEyeY_;
        }

        public float getLeftMouthX() {
            return this.leftMouthX_;
        }

        public float getLeftMouthY() {
            return this.leftMouthY_;
        }

        public float getNoseX() {
            return this.noseX_;
        }

        public float getNoseY() {
            return this.noseY_;
        }

        public float getRightEyeX() {
            return this.rightEyeX_;
        }

        public float getRightEyeY() {
            return this.rightEyeY_;
        }

        public float getRightMouthX() {
            return this.rightMouthX_;
        }

        public float getRightMouthY() {
            return this.rightMouthY_;
        }

        public boolean hasLeftEyeX() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLeftEyeY() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLeftMouthX() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasLeftMouthY() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasNoseX() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasNoseY() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasRightEyeX() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasRightEyeY() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRightMouthX() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasRightMouthY() {
            return (this.bitField0_ & 512) != 0;
        }

        public static Builder newBuilder(KeyPoints keyPoints) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(keyPoints);
        }

        public static KeyPoints parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (KeyPoints) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static KeyPoints parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static KeyPoints parseFrom(C16994k kVar) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static KeyPoints parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static KeyPoints parseFrom(byte[] bArr) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static KeyPoints parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static KeyPoints parseFrom(InputStream inputStream) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static KeyPoints parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static KeyPoints parseFrom(C23856l lVar) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static KeyPoints parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (KeyPoints) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface KeyPointsOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        float getLeftEyeX();

        float getLeftEyeY();

        float getLeftMouthX();

        float getLeftMouthY();

        float getNoseX();

        float getNoseY();

        float getRightEyeX();

        float getRightEyeY();

        float getRightMouthX();

        float getRightMouthY();

        boolean hasLeftEyeX();

        boolean hasLeftEyeY();

        boolean hasLeftMouthX();

        boolean hasLeftMouthY();

        boolean hasNoseX();

        boolean hasNoseY();

        boolean hasRightEyeX();

        boolean hasRightEyeY();

        boolean hasRightMouthX();

        boolean hasRightMouthY();

        /* synthetic */ boolean isInitialized();
    }

    public enum LiveActionType implements C23908o0.C23911c {
        ENUM_EYE_BLINK(0),
        ENUM_HEAD_SHAKE(1),
        ENUM_MOUTH_OPEN(2);
        
        public static final int ENUM_EYE_BLINK_VALUE = 0;
        public static final int ENUM_HEAD_SHAKE_VALUE = 1;
        public static final int ENUM_MOUTH_OPEN_VALUE = 2;
        private static final C23908o0.C23912d<LiveActionType> internalValueMap = null;
        private final int value;

        public static final class LiveActionTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new LiveActionTypeVerifier();
            }

            private LiveActionTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return LiveActionType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<LiveActionType>() {
                public LiveActionType findValueByNumber(int i) {
                    return LiveActionType.forNumber(i);
                }
            };
        }

        private LiveActionType(int i) {
            this.value = i;
        }

        public static LiveActionType forNumber(int i) {
            if (i == 0) {
                return ENUM_EYE_BLINK;
            }
            if (i == 1) {
                return ENUM_HEAD_SHAKE;
            }
            if (i != 2) {
                return null;
            }
            return ENUM_MOUTH_OPEN;
        }

        public static C23908o0.C23912d<LiveActionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return LiveActionTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static LiveActionType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class ThreeDFaceData extends C23861l0<ThreeDFaceData, Builder> implements ThreeDFaceDataOrBuilder {
        public static final int COLOR_IMAGE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final ThreeDFaceData DEFAULT_INSTANCE;
        public static final int DEPTH_IMAGE_FIELD_NUMBER = 2;
        public static final int FACE_RECT_FIELD_NUMBER = 5;
        public static final int INFRARED_IMAGE_FIELD_NUMBER = 3;
        public static final int KEY_POINTS_FIELD_NUMBER = 4;
        private static volatile C24062w1<ThreeDFaceData> PARSER;
        private int bitField0_;
        private C16994k colorImage_;
        private C16994k depthImage_;
        private FaceRect faceRect_;
        private C16994k infraredImage_;
        private KeyPoints keyPoints_;

        public static final class Builder extends C23861l0.C23862a<ThreeDFaceData, Builder> implements ThreeDFaceDataOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearColorImage() {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).clearColorImage();
                return this;
            }

            public Builder clearDepthImage() {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).clearDepthImage();
                return this;
            }

            public Builder clearFaceRect() {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).clearFaceRect();
                return this;
            }

            public Builder clearInfraredImage() {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).clearInfraredImage();
                return this;
            }

            public Builder clearKeyPoints() {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).clearKeyPoints();
                return this;
            }

            public C16994k getColorImage() {
                return ((ThreeDFaceData) this.instance).getColorImage();
            }

            public C16994k getDepthImage() {
                return ((ThreeDFaceData) this.instance).getDepthImage();
            }

            public FaceRect getFaceRect() {
                return ((ThreeDFaceData) this.instance).getFaceRect();
            }

            public C16994k getInfraredImage() {
                return ((ThreeDFaceData) this.instance).getInfraredImage();
            }

            public KeyPoints getKeyPoints() {
                return ((ThreeDFaceData) this.instance).getKeyPoints();
            }

            public boolean hasColorImage() {
                return ((ThreeDFaceData) this.instance).hasColorImage();
            }

            public boolean hasDepthImage() {
                return ((ThreeDFaceData) this.instance).hasDepthImage();
            }

            public boolean hasFaceRect() {
                return ((ThreeDFaceData) this.instance).hasFaceRect();
            }

            public boolean hasInfraredImage() {
                return ((ThreeDFaceData) this.instance).hasInfraredImage();
            }

            public boolean hasKeyPoints() {
                return ((ThreeDFaceData) this.instance).hasKeyPoints();
            }

            public Builder mergeFaceRect(FaceRect faceRect) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).mergeFaceRect(faceRect);
                return this;
            }

            public Builder mergeKeyPoints(KeyPoints keyPoints) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).mergeKeyPoints(keyPoints);
                return this;
            }

            public Builder setColorImage(C16994k kVar) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).setColorImage(kVar);
                return this;
            }

            public Builder setDepthImage(C16994k kVar) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).setDepthImage(kVar);
                return this;
            }

            public Builder setFaceRect(FaceRect faceRect) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).setFaceRect(faceRect);
                return this;
            }

            public Builder setInfraredImage(C16994k kVar) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).setInfraredImage(kVar);
                return this;
            }

            public Builder setKeyPoints(KeyPoints keyPoints) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).setKeyPoints(keyPoints);
                return this;
            }

            private Builder() {
                super(ThreeDFaceData.DEFAULT_INSTANCE);
            }

            public Builder setFaceRect(FaceRect.Builder builder) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).setFaceRect((FaceRect) builder.build());
                return this;
            }

            public Builder setKeyPoints(KeyPoints.Builder builder) {
                copyOnWrite();
                ((ThreeDFaceData) this.instance).setKeyPoints((KeyPoints) builder.build());
                return this;
            }
        }

        static {
            ThreeDFaceData threeDFaceData = new ThreeDFaceData();
            DEFAULT_INSTANCE = threeDFaceData;
            C23861l0.registerDefaultInstance(ThreeDFaceData.class, threeDFaceData);
        }

        private ThreeDFaceData() {
            C16994k kVar = C16994k.f46000e;
            this.colorImage_ = kVar;
            this.depthImage_ = kVar;
            this.infraredImage_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearColorImage() {
            this.bitField0_ &= -2;
            this.colorImage_ = getDefaultInstance().getColorImage();
        }

        /* access modifiers changed from: private */
        public void clearDepthImage() {
            this.bitField0_ &= -3;
            this.depthImage_ = getDefaultInstance().getDepthImage();
        }

        /* access modifiers changed from: private */
        public void clearFaceRect() {
            this.faceRect_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearInfraredImage() {
            this.bitField0_ &= -5;
            this.infraredImage_ = getDefaultInstance().getInfraredImage();
        }

        /* access modifiers changed from: private */
        public void clearKeyPoints() {
            this.keyPoints_ = null;
            this.bitField0_ &= -9;
        }

        public static ThreeDFaceData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeFaceRect(FaceRect faceRect) {
            faceRect.getClass();
            FaceRect faceRect2 = this.faceRect_;
            if (faceRect2 == null || faceRect2 == FaceRect.getDefaultInstance()) {
                this.faceRect_ = faceRect;
            } else {
                this.faceRect_ = (FaceRect) ((FaceRect.Builder) FaceRect.newBuilder(this.faceRect_).mergeFrom(faceRect)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void mergeKeyPoints(KeyPoints keyPoints) {
            keyPoints.getClass();
            KeyPoints keyPoints2 = this.keyPoints_;
            if (keyPoints2 == null || keyPoints2 == KeyPoints.getDefaultInstance()) {
                this.keyPoints_ = keyPoints;
            } else {
                this.keyPoints_ = (KeyPoints) ((KeyPoints.Builder) KeyPoints.newBuilder(this.keyPoints_).mergeFrom(keyPoints)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ThreeDFaceData parseDelimitedFrom(InputStream inputStream) {
            return (ThreeDFaceData) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ThreeDFaceData parseFrom(ByteBuffer byteBuffer) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<ThreeDFaceData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setColorImage(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.colorImage_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setDepthImage(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.depthImage_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setFaceRect(FaceRect faceRect) {
            faceRect.getClass();
            this.faceRect_ = faceRect;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setInfraredImage(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.infraredImage_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setKeyPoints(KeyPoints keyPoints) {
            keyPoints.getClass();
            this.keyPoints_ = keyPoints;
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "colorImage_", "depthImage_", "infraredImage_", "keyPoints_", "faceRect_"});
                case 3:
                    return new ThreeDFaceData();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<ThreeDFaceData> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (ThreeDFaceData.class) {
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

        public C16994k getColorImage() {
            return this.colorImage_;
        }

        public C16994k getDepthImage() {
            return this.depthImage_;
        }

        public FaceRect getFaceRect() {
            FaceRect faceRect = this.faceRect_;
            return faceRect == null ? FaceRect.getDefaultInstance() : faceRect;
        }

        public C16994k getInfraredImage() {
            return this.infraredImage_;
        }

        public KeyPoints getKeyPoints() {
            KeyPoints keyPoints = this.keyPoints_;
            return keyPoints == null ? KeyPoints.getDefaultInstance() : keyPoints;
        }

        public boolean hasColorImage() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDepthImage() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFaceRect() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasInfraredImage() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasKeyPoints() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(ThreeDFaceData threeDFaceData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(threeDFaceData);
        }

        public static ThreeDFaceData parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ThreeDFaceData) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ThreeDFaceData parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static ThreeDFaceData parseFrom(C16994k kVar) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ThreeDFaceData parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static ThreeDFaceData parseFrom(byte[] bArr) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ThreeDFaceData parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static ThreeDFaceData parseFrom(InputStream inputStream) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ThreeDFaceData parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ThreeDFaceData parseFrom(C23856l lVar) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static ThreeDFaceData parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ThreeDFaceData) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface ThreeDFaceDataOrBuilder extends C23848k1 {
        C16994k getColorImage();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getDepthImage();

        FaceRect getFaceRect();

        C16994k getInfraredImage();

        KeyPoints getKeyPoints();

        boolean hasColorImage();

        boolean hasDepthImage();

        boolean hasFaceRect();

        boolean hasInfraredImage();

        boolean hasKeyPoints();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TwoDConfig extends C23861l0<TwoDConfig, Builder> implements TwoDConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final TwoDConfig DEFAULT_INSTANCE;
        public static final int ENCRYPT_FIELD_NUMBER = 1;
        private static volatile C24062w1<TwoDConfig> PARSER;
        private int bitField0_;
        private EncryptInfo encrypt_;

        public static final class Builder extends C23861l0.C23862a<TwoDConfig, Builder> implements TwoDConfigOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder clearEncrypt() {
                copyOnWrite();
                ((TwoDConfig) this.instance).clearEncrypt();
                return this;
            }

            public EncryptInfo getEncrypt() {
                return ((TwoDConfig) this.instance).getEncrypt();
            }

            public boolean hasEncrypt() {
                return ((TwoDConfig) this.instance).hasEncrypt();
            }

            public Builder mergeEncrypt(EncryptInfo encryptInfo) {
                copyOnWrite();
                ((TwoDConfig) this.instance).mergeEncrypt(encryptInfo);
                return this;
            }

            public Builder setEncrypt(EncryptInfo encryptInfo) {
                copyOnWrite();
                ((TwoDConfig) this.instance).setEncrypt(encryptInfo);
                return this;
            }

            private Builder() {
                super(TwoDConfig.DEFAULT_INSTANCE);
            }

            public Builder setEncrypt(EncryptInfo.Builder builder) {
                copyOnWrite();
                ((TwoDConfig) this.instance).setEncrypt((EncryptInfo) builder.build());
                return this;
            }
        }

        static {
            TwoDConfig twoDConfig = new TwoDConfig();
            DEFAULT_INSTANCE = twoDConfig;
            C23861l0.registerDefaultInstance(TwoDConfig.class, twoDConfig);
        }

        private TwoDConfig() {
        }

        /* access modifiers changed from: private */
        public void clearEncrypt() {
            this.encrypt_ = null;
            this.bitField0_ &= -2;
        }

        public static TwoDConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeEncrypt(EncryptInfo encryptInfo) {
            encryptInfo.getClass();
            EncryptInfo encryptInfo2 = this.encrypt_;
            if (encryptInfo2 == null || encryptInfo2 == EncryptInfo.getDefaultInstance()) {
                this.encrypt_ = encryptInfo;
            } else {
                this.encrypt_ = (EncryptInfo) ((EncryptInfo.Builder) EncryptInfo.newBuilder(this.encrypt_).mergeFrom(encryptInfo)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TwoDConfig parseDelimitedFrom(InputStream inputStream) {
            return (TwoDConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TwoDConfig parseFrom(ByteBuffer byteBuffer) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TwoDConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEncrypt(EncryptInfo encryptInfo) {
            encryptInfo.getClass();
            this.encrypt_ = encryptInfo;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "encrypt_"});
                case 3:
                    return new TwoDConfig();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TwoDConfig> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TwoDConfig.class) {
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

        public EncryptInfo getEncrypt() {
            EncryptInfo encryptInfo = this.encrypt_;
            return encryptInfo == null ? EncryptInfo.getDefaultInstance() : encryptInfo;
        }

        public boolean hasEncrypt() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TwoDConfig twoDConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(twoDConfig);
        }

        public static TwoDConfig parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TwoDConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TwoDConfig parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TwoDConfig parseFrom(C16994k kVar) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TwoDConfig parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TwoDConfig parseFrom(byte[] bArr) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TwoDConfig parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TwoDConfig parseFrom(InputStream inputStream) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TwoDConfig parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TwoDConfig parseFrom(C23856l lVar) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TwoDConfig parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TwoDConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TwoDConfigOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        EncryptInfo getEncrypt();

        boolean hasEncrypt();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TwoDVideoData extends C23861l0<TwoDVideoData, Builder> implements TwoDVideoDataOrBuilder {
        /* access modifiers changed from: private */
        public static final TwoDVideoData DEFAULT_INSTANCE;
        public static final int ENCRYPT_FIELD_NUMBER = 2;
        private static volatile C24062w1<TwoDVideoData> PARSER = null;
        public static final int VS_FIELD_NUMBER = 1;
        private int bitField0_;
        private EncryptInfo encrypt_;
        private C23908o0.C23919j<FaceVideo> vs_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<TwoDVideoData, Builder> implements TwoDVideoDataOrBuilder {
            public /* synthetic */ Builder(C240991 r1) {
                this();
            }

            public Builder addAllVs(Iterable<? extends FaceVideo> iterable) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).addAllVs(iterable);
                return this;
            }

            public Builder addVs(FaceVideo faceVideo) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).addVs(faceVideo);
                return this;
            }

            public Builder clearEncrypt() {
                copyOnWrite();
                ((TwoDVideoData) this.instance).clearEncrypt();
                return this;
            }

            public Builder clearVs() {
                copyOnWrite();
                ((TwoDVideoData) this.instance).clearVs();
                return this;
            }

            public EncryptInfo getEncrypt() {
                return ((TwoDVideoData) this.instance).getEncrypt();
            }

            public FaceVideo getVs(int i) {
                return ((TwoDVideoData) this.instance).getVs(i);
            }

            public int getVsCount() {
                return ((TwoDVideoData) this.instance).getVsCount();
            }

            public List<FaceVideo> getVsList() {
                return Collections.unmodifiableList(((TwoDVideoData) this.instance).getVsList());
            }

            public boolean hasEncrypt() {
                return ((TwoDVideoData) this.instance).hasEncrypt();
            }

            public Builder mergeEncrypt(EncryptInfo encryptInfo) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).mergeEncrypt(encryptInfo);
                return this;
            }

            public Builder removeVs(int i) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).removeVs(i);
                return this;
            }

            public Builder setEncrypt(EncryptInfo encryptInfo) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).setEncrypt(encryptInfo);
                return this;
            }

            public Builder setVs(int i, FaceVideo faceVideo) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).setVs(i, faceVideo);
                return this;
            }

            private Builder() {
                super(TwoDVideoData.DEFAULT_INSTANCE);
            }

            public Builder addVs(int i, FaceVideo faceVideo) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).addVs(i, faceVideo);
                return this;
            }

            public Builder setEncrypt(EncryptInfo.Builder builder) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).setEncrypt((EncryptInfo) builder.build());
                return this;
            }

            public Builder setVs(int i, FaceVideo.Builder builder) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).setVs(i, (FaceVideo) builder.build());
                return this;
            }

            public Builder addVs(FaceVideo.Builder builder) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).addVs((FaceVideo) builder.build());
                return this;
            }

            public Builder addVs(int i, FaceVideo.Builder builder) {
                copyOnWrite();
                ((TwoDVideoData) this.instance).addVs(i, (FaceVideo) builder.build());
                return this;
            }
        }

        static {
            TwoDVideoData twoDVideoData = new TwoDVideoData();
            DEFAULT_INSTANCE = twoDVideoData;
            C23861l0.registerDefaultInstance(TwoDVideoData.class, twoDVideoData);
        }

        private TwoDVideoData() {
        }

        /* access modifiers changed from: private */
        public void addAllVs(Iterable<? extends FaceVideo> iterable) {
            ensureVsIsMutable();
            C23810b.addAll(iterable, this.vs_);
        }

        /* access modifiers changed from: private */
        public void addVs(FaceVideo faceVideo) {
            faceVideo.getClass();
            ensureVsIsMutable();
            this.vs_.add(faceVideo);
        }

        /* access modifiers changed from: private */
        public void clearEncrypt() {
            this.encrypt_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearVs() {
            this.vs_ = C23861l0.emptyProtobufList();
        }

        private void ensureVsIsMutable() {
            C23908o0.C23919j<FaceVideo> jVar = this.vs_;
            if (!jVar.mo37523Q()) {
                this.vs_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static TwoDVideoData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeEncrypt(EncryptInfo encryptInfo) {
            encryptInfo.getClass();
            EncryptInfo encryptInfo2 = this.encrypt_;
            if (encryptInfo2 == null || encryptInfo2 == EncryptInfo.getDefaultInstance()) {
                this.encrypt_ = encryptInfo;
            } else {
                this.encrypt_ = (EncryptInfo) ((EncryptInfo.Builder) EncryptInfo.newBuilder(this.encrypt_).mergeFrom(encryptInfo)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TwoDVideoData parseDelimitedFrom(InputStream inputStream) {
            return (TwoDVideoData) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TwoDVideoData parseFrom(ByteBuffer byteBuffer) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TwoDVideoData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeVs(int i) {
            ensureVsIsMutable();
            this.vs_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setEncrypt(EncryptInfo encryptInfo) {
            encryptInfo.getClass();
            this.encrypt_ = encryptInfo;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setVs(int i, FaceVideo faceVideo) {
            faceVideo.getClass();
            ensureVsIsMutable();
            this.vs_.set(i, faceVideo);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "vs_", FaceVideo.class, "encrypt_"});
                case 3:
                    return new TwoDVideoData();
                case 4:
                    return new Builder((C240991) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TwoDVideoData> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TwoDVideoData.class) {
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

        public EncryptInfo getEncrypt() {
            EncryptInfo encryptInfo = this.encrypt_;
            return encryptInfo == null ? EncryptInfo.getDefaultInstance() : encryptInfo;
        }

        public FaceVideo getVs(int i) {
            return this.vs_.get(i);
        }

        public int getVsCount() {
            return this.vs_.size();
        }

        public List<FaceVideo> getVsList() {
            return this.vs_;
        }

        public FaceVideoOrBuilder getVsOrBuilder(int i) {
            return this.vs_.get(i);
        }

        public List<? extends FaceVideoOrBuilder> getVsOrBuilderList() {
            return this.vs_;
        }

        public boolean hasEncrypt() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TwoDVideoData twoDVideoData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(twoDVideoData);
        }

        public static TwoDVideoData parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TwoDVideoData) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TwoDVideoData parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TwoDVideoData parseFrom(C16994k kVar) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addVs(int i, FaceVideo faceVideo) {
            faceVideo.getClass();
            ensureVsIsMutable();
            this.vs_.add(i, faceVideo);
        }

        public static TwoDVideoData parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TwoDVideoData parseFrom(byte[] bArr) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TwoDVideoData parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TwoDVideoData parseFrom(InputStream inputStream) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TwoDVideoData parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TwoDVideoData parseFrom(C23856l lVar) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TwoDVideoData parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TwoDVideoData) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TwoDVideoDataOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        EncryptInfo getEncrypt();

        FaceVideo getVs(int i);

        int getVsCount();

        List<FaceVideo> getVsList();

        boolean hasEncrypt();

        /* synthetic */ boolean isInitialized();
    }

    private FaceProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
