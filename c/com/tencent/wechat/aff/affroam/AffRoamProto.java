package com.tencent.wechat.aff.affroam;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23817d;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23901n0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24061w0;
import com.google.protobuf.C24062w1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class AffRoamProto {

    /* renamed from: com.tencent.wechat.aff.affroam.AffRoamProto$1 */
    public static /* synthetic */ class C243031 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69806xa1df5c61;

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
                f69806xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69806xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69806xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69806xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69806xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69806xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69806xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.affroam.AffRoamProto.C243031.<clinit>():void");
        }
    }

    public static final class AutoBackupConversationInfo extends C23861l0<AutoBackupConversationInfo, Builder> implements AutoBackupConversationInfoOrBuilder {
        public static final int AUTOBACKUP_CONVERSATION_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final AutoBackupConversationInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<AutoBackupConversationInfo> PARSER;
        private String autobackupConversation_ = "";
        private int bitField0_;

        public static final class Builder extends C23861l0.C23862a<AutoBackupConversationInfo, Builder> implements AutoBackupConversationInfoOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder clearAutobackupConversation() {
                copyOnWrite();
                ((AutoBackupConversationInfo) this.instance).clearAutobackupConversation();
                return this;
            }

            public String getAutobackupConversation() {
                return ((AutoBackupConversationInfo) this.instance).getAutobackupConversation();
            }

            public C16994k getAutobackupConversationBytes() {
                return ((AutoBackupConversationInfo) this.instance).getAutobackupConversationBytes();
            }

            public boolean hasAutobackupConversation() {
                return ((AutoBackupConversationInfo) this.instance).hasAutobackupConversation();
            }

            public Builder setAutobackupConversation(String str) {
                copyOnWrite();
                ((AutoBackupConversationInfo) this.instance).setAutobackupConversation(str);
                return this;
            }

            public Builder setAutobackupConversationBytes(C16994k kVar) {
                copyOnWrite();
                ((AutoBackupConversationInfo) this.instance).setAutobackupConversationBytes(kVar);
                return this;
            }

            private Builder() {
                super(AutoBackupConversationInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            AutoBackupConversationInfo autoBackupConversationInfo = new AutoBackupConversationInfo();
            DEFAULT_INSTANCE = autoBackupConversationInfo;
            C23861l0.registerDefaultInstance(AutoBackupConversationInfo.class, autoBackupConversationInfo);
        }

        private AutoBackupConversationInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAutobackupConversation() {
            this.bitField0_ &= -2;
            this.autobackupConversation_ = getDefaultInstance().getAutobackupConversation();
        }

        public static AutoBackupConversationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AutoBackupConversationInfo parseDelimitedFrom(InputStream inputStream) {
            return (AutoBackupConversationInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoBackupConversationInfo parseFrom(ByteBuffer byteBuffer) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<AutoBackupConversationInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAutobackupConversation(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.autobackupConversation_ = str;
        }

        /* access modifiers changed from: private */
        public void setAutobackupConversationBytes(C16994k kVar) {
            this.autobackupConversation_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "autobackupConversation_"});
                case 3:
                    return new AutoBackupConversationInfo();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<AutoBackupConversationInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (AutoBackupConversationInfo.class) {
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

        public String getAutobackupConversation() {
            return this.autobackupConversation_;
        }

        public C16994k getAutobackupConversationBytes() {
            return C16994k.m16791k(this.autobackupConversation_);
        }

        public boolean hasAutobackupConversation() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AutoBackupConversationInfo autoBackupConversationInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(autoBackupConversationInfo);
        }

        public static AutoBackupConversationInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AutoBackupConversationInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AutoBackupConversationInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static AutoBackupConversationInfo parseFrom(C16994k kVar) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static AutoBackupConversationInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static AutoBackupConversationInfo parseFrom(byte[] bArr) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AutoBackupConversationInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static AutoBackupConversationInfo parseFrom(InputStream inputStream) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoBackupConversationInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AutoBackupConversationInfo parseFrom(C23856l lVar) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static AutoBackupConversationInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (AutoBackupConversationInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface AutoBackupConversationInfoOrBuilder extends C23848k1 {
        String getAutobackupConversation();

        C16994k getAutobackupConversationBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasAutobackupConversation();

        /* synthetic */ boolean isInitialized();
    }

    public static final class AutoBackupRangeInfo extends C23861l0<AutoBackupRangeInfo, Builder> implements AutoBackupRangeInfoOrBuilder {
        public static final int AUTOBACKUP_RANGE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final AutoBackupRangeInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<AutoBackupRangeInfo> PARSER;
        private int autobackupRange_;
        private int bitField0_;

        public static final class Builder extends C23861l0.C23862a<AutoBackupRangeInfo, Builder> implements AutoBackupRangeInfoOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder clearAutobackupRange() {
                copyOnWrite();
                ((AutoBackupRangeInfo) this.instance).clearAutobackupRange();
                return this;
            }

            public int getAutobackupRange() {
                return ((AutoBackupRangeInfo) this.instance).getAutobackupRange();
            }

            public boolean hasAutobackupRange() {
                return ((AutoBackupRangeInfo) this.instance).hasAutobackupRange();
            }

            public Builder setAutobackupRange(int i) {
                copyOnWrite();
                ((AutoBackupRangeInfo) this.instance).setAutobackupRange(i);
                return this;
            }

            private Builder() {
                super(AutoBackupRangeInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            AutoBackupRangeInfo autoBackupRangeInfo = new AutoBackupRangeInfo();
            DEFAULT_INSTANCE = autoBackupRangeInfo;
            C23861l0.registerDefaultInstance(AutoBackupRangeInfo.class, autoBackupRangeInfo);
        }

        private AutoBackupRangeInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAutobackupRange() {
            this.bitField0_ &= -2;
            this.autobackupRange_ = 0;
        }

        public static AutoBackupRangeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AutoBackupRangeInfo parseDelimitedFrom(InputStream inputStream) {
            return (AutoBackupRangeInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoBackupRangeInfo parseFrom(ByteBuffer byteBuffer) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<AutoBackupRangeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAutobackupRange(int i) {
            this.bitField0_ |= 1;
            this.autobackupRange_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "autobackupRange_"});
                case 3:
                    return new AutoBackupRangeInfo();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<AutoBackupRangeInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (AutoBackupRangeInfo.class) {
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

        public int getAutobackupRange() {
            return this.autobackupRange_;
        }

        public boolean hasAutobackupRange() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AutoBackupRangeInfo autoBackupRangeInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(autoBackupRangeInfo);
        }

        public static AutoBackupRangeInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AutoBackupRangeInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AutoBackupRangeInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static AutoBackupRangeInfo parseFrom(C16994k kVar) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static AutoBackupRangeInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static AutoBackupRangeInfo parseFrom(byte[] bArr) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AutoBackupRangeInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static AutoBackupRangeInfo parseFrom(InputStream inputStream) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoBackupRangeInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AutoBackupRangeInfo parseFrom(C23856l lVar) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static AutoBackupRangeInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (AutoBackupRangeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface AutoBackupRangeInfoOrBuilder extends C23848k1 {
        int getAutobackupRange();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasAutobackupRange();

        /* synthetic */ boolean isInitialized();
    }

    public static final class BackedUpConversationsInfo extends C23861l0<BackedUpConversationsInfo, Builder> implements BackedUpConversationsInfoOrBuilder {
        public static final int CONVERSATION_ID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BackedUpConversationsInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<BackedUpConversationsInfo> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 2;
        private C23908o0.C23919j<String> conversationId_ = C23861l0.emptyProtobufList();
        private C23908o0.C23918i size_ = C23861l0.emptyLongList();

        public static final class Builder extends C23861l0.C23862a<BackedUpConversationsInfo, Builder> implements BackedUpConversationsInfoOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder addAllConversationId(Iterable<String> iterable) {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).addAllConversationId(iterable);
                return this;
            }

            public Builder addAllSize(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).addAllSize(iterable);
                return this;
            }

            public Builder addConversationId(String str) {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).addConversationId(str);
                return this;
            }

            public Builder addConversationIdBytes(C16994k kVar) {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).addConversationIdBytes(kVar);
                return this;
            }

            public Builder addSize(long j) {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).addSize(j);
                return this;
            }

            public Builder clearConversationId() {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).clearConversationId();
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).clearSize();
                return this;
            }

            public String getConversationId(int i) {
                return ((BackedUpConversationsInfo) this.instance).getConversationId(i);
            }

            public C16994k getConversationIdBytes(int i) {
                return ((BackedUpConversationsInfo) this.instance).getConversationIdBytes(i);
            }

            public int getConversationIdCount() {
                return ((BackedUpConversationsInfo) this.instance).getConversationIdCount();
            }

            public List<String> getConversationIdList() {
                return Collections.unmodifiableList(((BackedUpConversationsInfo) this.instance).getConversationIdList());
            }

            public long getSize(int i) {
                return ((BackedUpConversationsInfo) this.instance).getSize(i);
            }

            public int getSizeCount() {
                return ((BackedUpConversationsInfo) this.instance).getSizeCount();
            }

            public List<Long> getSizeList() {
                return Collections.unmodifiableList(((BackedUpConversationsInfo) this.instance).getSizeList());
            }

            public Builder setConversationId(int i, String str) {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).setConversationId(i, str);
                return this;
            }

            public Builder setSize(int i, long j) {
                copyOnWrite();
                ((BackedUpConversationsInfo) this.instance).setSize(i, j);
                return this;
            }

            private Builder() {
                super(BackedUpConversationsInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            BackedUpConversationsInfo backedUpConversationsInfo = new BackedUpConversationsInfo();
            DEFAULT_INSTANCE = backedUpConversationsInfo;
            C23861l0.registerDefaultInstance(BackedUpConversationsInfo.class, backedUpConversationsInfo);
        }

        private BackedUpConversationsInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllConversationId(Iterable<String> iterable) {
            ensureConversationIdIsMutable();
            C23810b.addAll(iterable, this.conversationId_);
        }

        /* access modifiers changed from: private */
        public void addAllSize(Iterable<? extends Long> iterable) {
            ensureSizeIsMutable();
            C23810b.addAll(iterable, this.size_);
        }

        /* access modifiers changed from: private */
        public void addConversationId(String str) {
            str.getClass();
            ensureConversationIdIsMutable();
            this.conversationId_.add(str);
        }

        /* access modifiers changed from: private */
        public void addConversationIdBytes(C16994k kVar) {
            ensureConversationIdIsMutable();
            this.conversationId_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void addSize(long j) {
            ensureSizeIsMutable();
            ((C24061w0) this.size_).mo38392h(j);
        }

        /* access modifiers changed from: private */
        public void clearConversationId() {
            this.conversationId_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSize() {
            this.size_ = C23861l0.emptyLongList();
        }

        private void ensureConversationIdIsMutable() {
            C23908o0.C23919j<String> jVar = this.conversationId_;
            if (!jVar.mo37523Q()) {
                this.conversationId_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureSizeIsMutable() {
            C23908o0.C23918i iVar = this.size_;
            if (!((C23817d) iVar).f68221d) {
                this.size_ = C23861l0.mutableCopy(iVar);
            }
        }

        public static BackedUpConversationsInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BackedUpConversationsInfo parseDelimitedFrom(InputStream inputStream) {
            return (BackedUpConversationsInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BackedUpConversationsInfo parseFrom(ByteBuffer byteBuffer) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BackedUpConversationsInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConversationId(int i, String str) {
            str.getClass();
            ensureConversationIdIsMutable();
            this.conversationId_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setSize(int i, long j) {
            ensureSizeIsMutable();
            C24061w0 w0Var = (C24061w0) this.size_;
            w0Var.mo37528f();
            w0Var.mo38393i(i);
            long[] jArr = w0Var.f69186e;
            long j2 = jArr[i];
            jArr[i] = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u0015", new Object[]{"conversationId_", "size_"});
                case 3:
                    return new BackedUpConversationsInfo();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BackedUpConversationsInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BackedUpConversationsInfo.class) {
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

        public String getConversationId(int i) {
            return this.conversationId_.get(i);
        }

        public C16994k getConversationIdBytes(int i) {
            return C16994k.m16791k(this.conversationId_.get(i));
        }

        public int getConversationIdCount() {
            return this.conversationId_.size();
        }

        public List<String> getConversationIdList() {
            return this.conversationId_;
        }

        public long getSize(int i) {
            return ((C24061w0) this.size_).mo38395k(i);
        }

        public int getSizeCount() {
            return ((C24061w0) this.size_).f69187f;
        }

        public List<Long> getSizeList() {
            return this.size_;
        }

        public static Builder newBuilder(BackedUpConversationsInfo backedUpConversationsInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(backedUpConversationsInfo);
        }

        public static BackedUpConversationsInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BackedUpConversationsInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BackedUpConversationsInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BackedUpConversationsInfo parseFrom(C16994k kVar) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BackedUpConversationsInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BackedUpConversationsInfo parseFrom(byte[] bArr) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BackedUpConversationsInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BackedUpConversationsInfo parseFrom(InputStream inputStream) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BackedUpConversationsInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BackedUpConversationsInfo parseFrom(C23856l lVar) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BackedUpConversationsInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BackedUpConversationsInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface BackedUpConversationsInfoOrBuilder extends C23848k1 {
        String getConversationId(int i);

        C16994k getConversationIdBytes(int i);

        int getConversationIdCount();

        List<String> getConversationIdList();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getSize(int i);

        int getSizeCount();

        List<Long> getSizeList();

        /* synthetic */ boolean isInitialized();
    }

    public enum DeviceType implements C23908o0.C23911c {
        NONE(0),
        NAS(1),
        PC(2),
        MAC(3),
        CLOUD(4);
        
        public static final int CLOUD_VALUE = 4;
        public static final int MAC_VALUE = 3;
        public static final int NAS_VALUE = 1;
        public static final int NONE_VALUE = 0;
        public static final int PC_VALUE = 2;
        private static final C23908o0.C23912d<DeviceType> internalValueMap = null;
        private final int value;

        public static final class DeviceTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new DeviceTypeVerifier();
            }

            private DeviceTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return DeviceType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<DeviceType>() {
                public DeviceType findValueByNumber(int i) {
                    return DeviceType.forNumber(i);
                }
            };
        }

        private DeviceType(int i) {
            this.value = i;
        }

        public static DeviceType forNumber(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return NAS;
            }
            if (i == 2) {
                return PC;
            }
            if (i == 3) {
                return MAC;
            }
            if (i != 4) {
                return null;
            }
            return CLOUD;
        }

        public static C23908o0.C23912d<DeviceType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return DeviceTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DeviceType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IncompleteTaskInfo extends C23861l0<IncompleteTaskInfo, Builder> implements IncompleteTaskInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final IncompleteTaskInfo DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 1;
        public static final int HAS_INCOMPLETE_TASK_FIELD_NUMBER = 2;
        public static final int IS_UNINTENDED_FIELD_NUMBER = 3;
        public static final int LAST_STATE_FIELD_NUMBER = 4;
        private static volatile C24062w1<IncompleteTaskInfo> PARSER = null;
        public static final int TOTAL_SIZE_FIELD_NUMBER = 6;
        public static final int TRANSFERRED_DATA_SIZE_FIELD_NUMBER = 5;
        private int bitField0_;
        private String deviceId_ = "";
        private boolean hasIncompleteTask_;
        private boolean isUnintended_;
        private int lastState_;
        private byte memoizedIsInitialized = 2;
        private long totalSize_;
        private long transferredDataSize_;

        public static final class Builder extends C23861l0.C23862a<IncompleteTaskInfo, Builder> implements IncompleteTaskInfoOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearHasIncompleteTask() {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).clearHasIncompleteTask();
                return this;
            }

            public Builder clearIsUnintended() {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).clearIsUnintended();
                return this;
            }

            public Builder clearLastState() {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).clearLastState();
                return this;
            }

            public Builder clearTotalSize() {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).clearTotalSize();
                return this;
            }

            public Builder clearTransferredDataSize() {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).clearTransferredDataSize();
                return this;
            }

            public String getDeviceId() {
                return ((IncompleteTaskInfo) this.instance).getDeviceId();
            }

            public C16994k getDeviceIdBytes() {
                return ((IncompleteTaskInfo) this.instance).getDeviceIdBytes();
            }

            public boolean getHasIncompleteTask() {
                return ((IncompleteTaskInfo) this.instance).getHasIncompleteTask();
            }

            public boolean getIsUnintended() {
                return ((IncompleteTaskInfo) this.instance).getIsUnintended();
            }

            public RoamBackupperState getLastState() {
                return ((IncompleteTaskInfo) this.instance).getLastState();
            }

            public long getTotalSize() {
                return ((IncompleteTaskInfo) this.instance).getTotalSize();
            }

            public long getTransferredDataSize() {
                return ((IncompleteTaskInfo) this.instance).getTransferredDataSize();
            }

            public boolean hasDeviceId() {
                return ((IncompleteTaskInfo) this.instance).hasDeviceId();
            }

            public boolean hasHasIncompleteTask() {
                return ((IncompleteTaskInfo) this.instance).hasHasIncompleteTask();
            }

            public boolean hasIsUnintended() {
                return ((IncompleteTaskInfo) this.instance).hasIsUnintended();
            }

            public boolean hasLastState() {
                return ((IncompleteTaskInfo) this.instance).hasLastState();
            }

            public boolean hasTotalSize() {
                return ((IncompleteTaskInfo) this.instance).hasTotalSize();
            }

            public boolean hasTransferredDataSize() {
                return ((IncompleteTaskInfo) this.instance).hasTransferredDataSize();
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).setDeviceIdBytes(kVar);
                return this;
            }

            public Builder setHasIncompleteTask(boolean z) {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).setHasIncompleteTask(z);
                return this;
            }

            public Builder setIsUnintended(boolean z) {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).setIsUnintended(z);
                return this;
            }

            public Builder setLastState(RoamBackupperState roamBackupperState) {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).setLastState(roamBackupperState);
                return this;
            }

            public Builder setTotalSize(long j) {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).setTotalSize(j);
                return this;
            }

            public Builder setTransferredDataSize(long j) {
                copyOnWrite();
                ((IncompleteTaskInfo) this.instance).setTransferredDataSize(j);
                return this;
            }

            private Builder() {
                super(IncompleteTaskInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IncompleteTaskInfo incompleteTaskInfo = new IncompleteTaskInfo();
            DEFAULT_INSTANCE = incompleteTaskInfo;
            C23861l0.registerDefaultInstance(IncompleteTaskInfo.class, incompleteTaskInfo);
        }

        private IncompleteTaskInfo() {
        }

        /* access modifiers changed from: private */
        public void clearDeviceId() {
            this.bitField0_ &= -2;
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* access modifiers changed from: private */
        public void clearHasIncompleteTask() {
            this.bitField0_ &= -3;
            this.hasIncompleteTask_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsUnintended() {
            this.bitField0_ &= -5;
            this.isUnintended_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLastState() {
            this.bitField0_ &= -9;
            this.lastState_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTotalSize() {
            this.bitField0_ &= -33;
            this.totalSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTransferredDataSize() {
            this.bitField0_ &= -17;
            this.transferredDataSize_ = 0;
        }

        public static IncompleteTaskInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IncompleteTaskInfo parseDelimitedFrom(InputStream inputStream) {
            return (IncompleteTaskInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncompleteTaskInfo parseFrom(ByteBuffer byteBuffer) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IncompleteTaskInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.deviceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceIdBytes(C16994k kVar) {
            this.deviceId_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setHasIncompleteTask(boolean z) {
            this.bitField0_ |= 2;
            this.hasIncompleteTask_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsUnintended(boolean z) {
            this.bitField0_ |= 4;
            this.isUnintended_ = z;
        }

        /* access modifiers changed from: private */
        public void setLastState(RoamBackupperState roamBackupperState) {
            this.lastState_ = roamBackupperState.getNumber();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setTotalSize(long j) {
            this.bitField0_ |= 32;
            this.totalSize_ = j;
        }

        /* access modifiers changed from: private */
        public void setTransferredDataSize(long j) {
            this.bitField0_ |= 16;
            this.transferredDataSize_ = j;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဃ\u0004\u0006ဃ\u0005", new Object[]{"bitField0_", "deviceId_", "hasIncompleteTask_", "isUnintended_", "lastState_", RoamBackupperState.internalGetVerifier(), "transferredDataSize_", "totalSize_"});
                case 3:
                    return new IncompleteTaskInfo();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IncompleteTaskInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IncompleteTaskInfo.class) {
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

        public String getDeviceId() {
            return this.deviceId_;
        }

        public C16994k getDeviceIdBytes() {
            return C16994k.m16791k(this.deviceId_);
        }

        public boolean getHasIncompleteTask() {
            return this.hasIncompleteTask_;
        }

        public boolean getIsUnintended() {
            return this.isUnintended_;
        }

        public RoamBackupperState getLastState() {
            RoamBackupperState forNumber = RoamBackupperState.forNumber(this.lastState_);
            return forNumber == null ? RoamBackupperState.DISCONNECTED : forNumber;
        }

        public long getTotalSize() {
            return this.totalSize_;
        }

        public long getTransferredDataSize() {
            return this.transferredDataSize_;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasHasIncompleteTask() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIsUnintended() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLastState() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTotalSize() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasTransferredDataSize() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(IncompleteTaskInfo incompleteTaskInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(incompleteTaskInfo);
        }

        public static IncompleteTaskInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IncompleteTaskInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IncompleteTaskInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IncompleteTaskInfo parseFrom(C16994k kVar) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IncompleteTaskInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IncompleteTaskInfo parseFrom(byte[] bArr) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IncompleteTaskInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IncompleteTaskInfo parseFrom(InputStream inputStream) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IncompleteTaskInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IncompleteTaskInfo parseFrom(C23856l lVar) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IncompleteTaskInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IncompleteTaskInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IncompleteTaskInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDeviceId();

        C16994k getDeviceIdBytes();

        boolean getHasIncompleteTask();

        boolean getIsUnintended();

        RoamBackupperState getLastState();

        long getTotalSize();

        long getTransferredDataSize();

        boolean hasDeviceId();

        boolean hasHasIncompleteTask();

        boolean hasIsUnintended();

        boolean hasLastState();

        boolean hasTotalSize();

        boolean hasTransferredDataSize();

        /* synthetic */ boolean isInitialized();
    }

    public static final class LastBackupPhoneID extends C23861l0<LastBackupPhoneID, Builder> implements LastBackupPhoneIDOrBuilder {
        /* access modifiers changed from: private */
        public static final LastBackupPhoneID DEFAULT_INSTANCE;
        private static volatile C24062w1<LastBackupPhoneID> PARSER = null;
        public static final int PHONE_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private String phoneId_ = "";

        public static final class Builder extends C23861l0.C23862a<LastBackupPhoneID, Builder> implements LastBackupPhoneIDOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder clearPhoneId() {
                copyOnWrite();
                ((LastBackupPhoneID) this.instance).clearPhoneId();
                return this;
            }

            public String getPhoneId() {
                return ((LastBackupPhoneID) this.instance).getPhoneId();
            }

            public C16994k getPhoneIdBytes() {
                return ((LastBackupPhoneID) this.instance).getPhoneIdBytes();
            }

            public boolean hasPhoneId() {
                return ((LastBackupPhoneID) this.instance).hasPhoneId();
            }

            public Builder setPhoneId(String str) {
                copyOnWrite();
                ((LastBackupPhoneID) this.instance).setPhoneId(str);
                return this;
            }

            public Builder setPhoneIdBytes(C16994k kVar) {
                copyOnWrite();
                ((LastBackupPhoneID) this.instance).setPhoneIdBytes(kVar);
                return this;
            }

            private Builder() {
                super(LastBackupPhoneID.DEFAULT_INSTANCE);
            }
        }

        static {
            LastBackupPhoneID lastBackupPhoneID = new LastBackupPhoneID();
            DEFAULT_INSTANCE = lastBackupPhoneID;
            C23861l0.registerDefaultInstance(LastBackupPhoneID.class, lastBackupPhoneID);
        }

        private LastBackupPhoneID() {
        }

        /* access modifiers changed from: private */
        public void clearPhoneId() {
            this.bitField0_ &= -2;
            this.phoneId_ = getDefaultInstance().getPhoneId();
        }

        public static LastBackupPhoneID getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LastBackupPhoneID parseDelimitedFrom(InputStream inputStream) {
            return (LastBackupPhoneID) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastBackupPhoneID parseFrom(ByteBuffer byteBuffer) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<LastBackupPhoneID> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPhoneId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.phoneId_ = str;
        }

        /* access modifiers changed from: private */
        public void setPhoneIdBytes(C16994k kVar) {
            this.phoneId_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "phoneId_"});
                case 3:
                    return new LastBackupPhoneID();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<LastBackupPhoneID> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (LastBackupPhoneID.class) {
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

        public String getPhoneId() {
            return this.phoneId_;
        }

        public C16994k getPhoneIdBytes() {
            return C16994k.m16791k(this.phoneId_);
        }

        public boolean hasPhoneId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(LastBackupPhoneID lastBackupPhoneID) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(lastBackupPhoneID);
        }

        public static LastBackupPhoneID parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LastBackupPhoneID) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static LastBackupPhoneID parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static LastBackupPhoneID parseFrom(C16994k kVar) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static LastBackupPhoneID parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static LastBackupPhoneID parseFrom(byte[] bArr) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LastBackupPhoneID parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static LastBackupPhoneID parseFrom(InputStream inputStream) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LastBackupPhoneID parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static LastBackupPhoneID parseFrom(C23856l lVar) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static LastBackupPhoneID parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (LastBackupPhoneID) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface LastBackupPhoneIDOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getPhoneId();

        C16994k getPhoneIdBytes();

        boolean hasPhoneId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ReportData extends C23861l0<ReportData, Builder> implements ReportDataOrBuilder {
        public static final int BR_DATA_SIZE_FIELD_NUMBER = 3;
        public static final int CONVERSATION_COUNT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final ReportData DEFAULT_INSTANCE;
        public static final int ELAPSED_TIME_FIELD_NUMBER = 2;
        public static final int MSG_COUNT_FIELD_NUMBER = 5;
        private static volatile C24062w1<ReportData> PARSER = null;
        public static final int SELECTED_CONVERSATIONS_FIELD_NUMBER = 6;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private long brDataSize_;
        private long conversationCount_;
        private long elapsedTime_;
        private long msgCount_;
        private long selectedConversations_;
        private String sessionId_ = "";

        public static final class Builder extends C23861l0.C23862a<ReportData, Builder> implements ReportDataOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder clearBrDataSize() {
                copyOnWrite();
                ((ReportData) this.instance).clearBrDataSize();
                return this;
            }

            public Builder clearConversationCount() {
                copyOnWrite();
                ((ReportData) this.instance).clearConversationCount();
                return this;
            }

            public Builder clearElapsedTime() {
                copyOnWrite();
                ((ReportData) this.instance).clearElapsedTime();
                return this;
            }

            public Builder clearMsgCount() {
                copyOnWrite();
                ((ReportData) this.instance).clearMsgCount();
                return this;
            }

            public Builder clearSelectedConversations() {
                copyOnWrite();
                ((ReportData) this.instance).clearSelectedConversations();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((ReportData) this.instance).clearSessionId();
                return this;
            }

            public long getBrDataSize() {
                return ((ReportData) this.instance).getBrDataSize();
            }

            public long getConversationCount() {
                return ((ReportData) this.instance).getConversationCount();
            }

            public long getElapsedTime() {
                return ((ReportData) this.instance).getElapsedTime();
            }

            public long getMsgCount() {
                return ((ReportData) this.instance).getMsgCount();
            }

            public long getSelectedConversations() {
                return ((ReportData) this.instance).getSelectedConversations();
            }

            public String getSessionId() {
                return ((ReportData) this.instance).getSessionId();
            }

            public C16994k getSessionIdBytes() {
                return ((ReportData) this.instance).getSessionIdBytes();
            }

            public boolean hasBrDataSize() {
                return ((ReportData) this.instance).hasBrDataSize();
            }

            public boolean hasConversationCount() {
                return ((ReportData) this.instance).hasConversationCount();
            }

            public boolean hasElapsedTime() {
                return ((ReportData) this.instance).hasElapsedTime();
            }

            public boolean hasMsgCount() {
                return ((ReportData) this.instance).hasMsgCount();
            }

            public boolean hasSelectedConversations() {
                return ((ReportData) this.instance).hasSelectedConversations();
            }

            public boolean hasSessionId() {
                return ((ReportData) this.instance).hasSessionId();
            }

            public Builder setBrDataSize(long j) {
                copyOnWrite();
                ((ReportData) this.instance).setBrDataSize(j);
                return this;
            }

            public Builder setConversationCount(long j) {
                copyOnWrite();
                ((ReportData) this.instance).setConversationCount(j);
                return this;
            }

            public Builder setElapsedTime(long j) {
                copyOnWrite();
                ((ReportData) this.instance).setElapsedTime(j);
                return this;
            }

            public Builder setMsgCount(long j) {
                copyOnWrite();
                ((ReportData) this.instance).setMsgCount(j);
                return this;
            }

            public Builder setSelectedConversations(long j) {
                copyOnWrite();
                ((ReportData) this.instance).setSelectedConversations(j);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((ReportData) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(C16994k kVar) {
                copyOnWrite();
                ((ReportData) this.instance).setSessionIdBytes(kVar);
                return this;
            }

            private Builder() {
                super(ReportData.DEFAULT_INSTANCE);
            }
        }

        static {
            ReportData reportData = new ReportData();
            DEFAULT_INSTANCE = reportData;
            C23861l0.registerDefaultInstance(ReportData.class, reportData);
        }

        private ReportData() {
        }

        /* access modifiers changed from: private */
        public void clearBrDataSize() {
            this.bitField0_ &= -5;
            this.brDataSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearConversationCount() {
            this.bitField0_ &= -9;
            this.conversationCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearElapsedTime() {
            this.bitField0_ &= -3;
            this.elapsedTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgCount() {
            this.bitField0_ &= -17;
            this.msgCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSelectedConversations() {
            this.bitField0_ &= -33;
            this.selectedConversations_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionId() {
            this.bitField0_ &= -2;
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static ReportData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReportData parseDelimitedFrom(InputStream inputStream) {
            return (ReportData) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReportData parseFrom(ByteBuffer byteBuffer) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<ReportData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBrDataSize(long j) {
            this.bitField0_ |= 4;
            this.brDataSize_ = j;
        }

        /* access modifiers changed from: private */
        public void setConversationCount(long j) {
            this.bitField0_ |= 8;
            this.conversationCount_ = j;
        }

        /* access modifiers changed from: private */
        public void setElapsedTime(long j) {
            this.bitField0_ |= 2;
            this.elapsedTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setMsgCount(long j) {
            this.bitField0_ |= 16;
            this.msgCount_ = j;
        }

        /* access modifiers changed from: private */
        public void setSelectedConversations(long j) {
            this.bitField0_ |= 32;
            this.selectedConversations_ = j;
        }

        /* access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.sessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionIdBytes(C16994k kVar) {
            this.sessionId_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဃ\u0005", new Object[]{"bitField0_", "sessionId_", "elapsedTime_", "brDataSize_", "conversationCount_", "msgCount_", "selectedConversations_"});
                case 3:
                    return new ReportData();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<ReportData> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (ReportData.class) {
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

        public long getBrDataSize() {
            return this.brDataSize_;
        }

        public long getConversationCount() {
            return this.conversationCount_;
        }

        public long getElapsedTime() {
            return this.elapsedTime_;
        }

        public long getMsgCount() {
            return this.msgCount_;
        }

        public long getSelectedConversations() {
            return this.selectedConversations_;
        }

        public String getSessionId() {
            return this.sessionId_;
        }

        public C16994k getSessionIdBytes() {
            return C16994k.m16791k(this.sessionId_);
        }

        public boolean hasBrDataSize() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasConversationCount() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasElapsedTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMsgCount() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSelectedConversations() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ReportData reportData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(reportData);
        }

        public static ReportData parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ReportData) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ReportData parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static ReportData parseFrom(C16994k kVar) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ReportData parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static ReportData parseFrom(byte[] bArr) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReportData parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static ReportData parseFrom(InputStream inputStream) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReportData parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ReportData parseFrom(C23856l lVar) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static ReportData parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ReportData) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface ReportDataOrBuilder extends C23848k1 {
        long getBrDataSize();

        long getConversationCount();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getElapsedTime();

        long getMsgCount();

        long getSelectedConversations();

        String getSessionId();

        C16994k getSessionIdBytes();

        boolean hasBrDataSize();

        boolean hasConversationCount();

        boolean hasElapsedTime();

        boolean hasMsgCount();

        boolean hasSelectedConversations();

        boolean hasSessionId();

        /* synthetic */ boolean isInitialized();
    }

    public enum RoamBackupperState implements C23908o0.C23911c {
        DISCONNECTED(0),
        CONNECTED(1),
        AUTO_BACKING_UP(2),
        BACKING_UP(3),
        RESTORING(4),
        DELETING(5),
        CONNECTING(6);
        
        public static final int AUTO_BACKING_UP_VALUE = 2;
        public static final int BACKING_UP_VALUE = 3;
        public static final int CONNECTED_VALUE = 1;
        public static final int CONNECTING_VALUE = 6;
        public static final int DELETING_VALUE = 5;
        public static final int DISCONNECTED_VALUE = 0;
        public static final int RESTORING_VALUE = 4;
        private static final C23908o0.C23912d<RoamBackupperState> internalValueMap = null;
        private final int value;

        public static final class RoamBackupperStateVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new RoamBackupperStateVerifier();
            }

            private RoamBackupperStateVerifier() {
            }

            public boolean isInRange(int i) {
                return RoamBackupperState.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<RoamBackupperState>() {
                public RoamBackupperState findValueByNumber(int i) {
                    return RoamBackupperState.forNumber(i);
                }
            };
        }

        private RoamBackupperState(int i) {
            this.value = i;
        }

        public static RoamBackupperState forNumber(int i) {
            switch (i) {
                case 0:
                    return DISCONNECTED;
                case 1:
                    return CONNECTED;
                case 2:
                    return AUTO_BACKING_UP;
                case 3:
                    return BACKING_UP;
                case 4:
                    return RESTORING;
                case 5:
                    return DELETING;
                case 6:
                    return CONNECTING;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<RoamBackupperState> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return RoamBackupperStateVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static RoamBackupperState valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class RoamFileEncKeyItem extends C23861l0<RoamFileEncKeyItem, Builder> implements RoamFileEncKeyItemOrBuilder {
        /* access modifiers changed from: private */
        public static final RoamFileEncKeyItem DEFAULT_INSTANCE;
        public static final int ENC_ID_FIELD_NUMBER = 1;
        public static final int ENC_KEY_FIELD_NUMBER = 2;
        private static volatile C24062w1<RoamFileEncKeyItem> PARSER;
        private int bitField0_;
        private long encId_;
        private C16994k encKey_ = C16994k.f46000e;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<RoamFileEncKeyItem, Builder> implements RoamFileEncKeyItemOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder clearEncId() {
                copyOnWrite();
                ((RoamFileEncKeyItem) this.instance).clearEncId();
                return this;
            }

            public Builder clearEncKey() {
                copyOnWrite();
                ((RoamFileEncKeyItem) this.instance).clearEncKey();
                return this;
            }

            public long getEncId() {
                return ((RoamFileEncKeyItem) this.instance).getEncId();
            }

            public C16994k getEncKey() {
                return ((RoamFileEncKeyItem) this.instance).getEncKey();
            }

            public boolean hasEncId() {
                return ((RoamFileEncKeyItem) this.instance).hasEncId();
            }

            public boolean hasEncKey() {
                return ((RoamFileEncKeyItem) this.instance).hasEncKey();
            }

            public Builder setEncId(long j) {
                copyOnWrite();
                ((RoamFileEncKeyItem) this.instance).setEncId(j);
                return this;
            }

            public Builder setEncKey(C16994k kVar) {
                copyOnWrite();
                ((RoamFileEncKeyItem) this.instance).setEncKey(kVar);
                return this;
            }

            private Builder() {
                super(RoamFileEncKeyItem.DEFAULT_INSTANCE);
            }
        }

        static {
            RoamFileEncKeyItem roamFileEncKeyItem = new RoamFileEncKeyItem();
            DEFAULT_INSTANCE = roamFileEncKeyItem;
            C23861l0.registerDefaultInstance(RoamFileEncKeyItem.class, roamFileEncKeyItem);
        }

        private RoamFileEncKeyItem() {
        }

        /* access modifiers changed from: private */
        public void clearEncId() {
            this.bitField0_ &= -2;
            this.encId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEncKey() {
            this.bitField0_ &= -3;
            this.encKey_ = getDefaultInstance().getEncKey();
        }

        public static RoamFileEncKeyItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoamFileEncKeyItem parseDelimitedFrom(InputStream inputStream) {
            return (RoamFileEncKeyItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamFileEncKeyItem parseFrom(ByteBuffer byteBuffer) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RoamFileEncKeyItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEncId(long j) {
            this.bitField0_ |= 1;
            this.encId_ = j;
        }

        /* access modifiers changed from: private */
        public void setEncKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.encKey_ = kVar;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔃ\u0000\u0002ᔊ\u0001", new Object[]{"bitField0_", "encId_", "encKey_"});
                case 3:
                    return new RoamFileEncKeyItem();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RoamFileEncKeyItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RoamFileEncKeyItem.class) {
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

        public long getEncId() {
            return this.encId_;
        }

        public C16994k getEncKey() {
            return this.encKey_;
        }

        public boolean hasEncId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasEncKey() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(RoamFileEncKeyItem roamFileEncKeyItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roamFileEncKeyItem);
        }

        public static RoamFileEncKeyItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamFileEncKeyItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamFileEncKeyItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RoamFileEncKeyItem parseFrom(C16994k kVar) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static RoamFileEncKeyItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RoamFileEncKeyItem parseFrom(byte[] bArr) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoamFileEncKeyItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RoamFileEncKeyItem parseFrom(InputStream inputStream) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamFileEncKeyItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamFileEncKeyItem parseFrom(C23856l lVar) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RoamFileEncKeyItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RoamFileEncKeyItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface RoamFileEncKeyItemOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getEncId();

        C16994k getEncKey();

        boolean hasEncId();

        boolean hasEncKey();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RoamFileEncKeyList extends C23861l0<RoamFileEncKeyList, Builder> implements RoamFileEncKeyListOrBuilder {
        /* access modifiers changed from: private */
        public static final RoamFileEncKeyList DEFAULT_INSTANCE;
        public static final int ENC_LIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<RoamFileEncKeyList> PARSER;
        private C23908o0.C23919j<RoamFileEncKeyItem> encList_ = C23861l0.emptyProtobufList();
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<RoamFileEncKeyList, Builder> implements RoamFileEncKeyListOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder addAllEncList(Iterable<? extends RoamFileEncKeyItem> iterable) {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).addAllEncList(iterable);
                return this;
            }

            public Builder addEncList(RoamFileEncKeyItem roamFileEncKeyItem) {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).addEncList(roamFileEncKeyItem);
                return this;
            }

            public Builder clearEncList() {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).clearEncList();
                return this;
            }

            public RoamFileEncKeyItem getEncList(int i) {
                return ((RoamFileEncKeyList) this.instance).getEncList(i);
            }

            public int getEncListCount() {
                return ((RoamFileEncKeyList) this.instance).getEncListCount();
            }

            public List<RoamFileEncKeyItem> getEncListList() {
                return Collections.unmodifiableList(((RoamFileEncKeyList) this.instance).getEncListList());
            }

            public Builder removeEncList(int i) {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).removeEncList(i);
                return this;
            }

            public Builder setEncList(int i, RoamFileEncKeyItem roamFileEncKeyItem) {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).setEncList(i, roamFileEncKeyItem);
                return this;
            }

            private Builder() {
                super(RoamFileEncKeyList.DEFAULT_INSTANCE);
            }

            public Builder addEncList(int i, RoamFileEncKeyItem roamFileEncKeyItem) {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).addEncList(i, roamFileEncKeyItem);
                return this;
            }

            public Builder setEncList(int i, RoamFileEncKeyItem.Builder builder) {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).setEncList(i, (RoamFileEncKeyItem) builder.build());
                return this;
            }

            public Builder addEncList(RoamFileEncKeyItem.Builder builder) {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).addEncList((RoamFileEncKeyItem) builder.build());
                return this;
            }

            public Builder addEncList(int i, RoamFileEncKeyItem.Builder builder) {
                copyOnWrite();
                ((RoamFileEncKeyList) this.instance).addEncList(i, (RoamFileEncKeyItem) builder.build());
                return this;
            }
        }

        static {
            RoamFileEncKeyList roamFileEncKeyList = new RoamFileEncKeyList();
            DEFAULT_INSTANCE = roamFileEncKeyList;
            C23861l0.registerDefaultInstance(RoamFileEncKeyList.class, roamFileEncKeyList);
        }

        private RoamFileEncKeyList() {
        }

        /* access modifiers changed from: private */
        public void addAllEncList(Iterable<? extends RoamFileEncKeyItem> iterable) {
            ensureEncListIsMutable();
            C23810b.addAll(iterable, this.encList_);
        }

        /* access modifiers changed from: private */
        public void addEncList(RoamFileEncKeyItem roamFileEncKeyItem) {
            roamFileEncKeyItem.getClass();
            ensureEncListIsMutable();
            this.encList_.add(roamFileEncKeyItem);
        }

        /* access modifiers changed from: private */
        public void clearEncList() {
            this.encList_ = C23861l0.emptyProtobufList();
        }

        private void ensureEncListIsMutable() {
            C23908o0.C23919j<RoamFileEncKeyItem> jVar = this.encList_;
            if (!jVar.mo37523Q()) {
                this.encList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static RoamFileEncKeyList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoamFileEncKeyList parseDelimitedFrom(InputStream inputStream) {
            return (RoamFileEncKeyList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamFileEncKeyList parseFrom(ByteBuffer byteBuffer) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RoamFileEncKeyList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeEncList(int i) {
            ensureEncListIsMutable();
            this.encList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setEncList(int i, RoamFileEncKeyItem roamFileEncKeyItem) {
            roamFileEncKeyItem.getClass();
            ensureEncListIsMutable();
            this.encList_.set(i, roamFileEncKeyItem);
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"encList_", RoamFileEncKeyItem.class});
                case 3:
                    return new RoamFileEncKeyList();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RoamFileEncKeyList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RoamFileEncKeyList.class) {
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

        public RoamFileEncKeyItem getEncList(int i) {
            return this.encList_.get(i);
        }

        public int getEncListCount() {
            return this.encList_.size();
        }

        public List<RoamFileEncKeyItem> getEncListList() {
            return this.encList_;
        }

        public RoamFileEncKeyItemOrBuilder getEncListOrBuilder(int i) {
            return this.encList_.get(i);
        }

        public List<? extends RoamFileEncKeyItemOrBuilder> getEncListOrBuilderList() {
            return this.encList_;
        }

        public static Builder newBuilder(RoamFileEncKeyList roamFileEncKeyList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roamFileEncKeyList);
        }

        public static RoamFileEncKeyList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamFileEncKeyList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamFileEncKeyList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RoamFileEncKeyList parseFrom(C16994k kVar) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addEncList(int i, RoamFileEncKeyItem roamFileEncKeyItem) {
            roamFileEncKeyItem.getClass();
            ensureEncListIsMutable();
            this.encList_.add(i, roamFileEncKeyItem);
        }

        public static RoamFileEncKeyList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RoamFileEncKeyList parseFrom(byte[] bArr) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoamFileEncKeyList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RoamFileEncKeyList parseFrom(InputStream inputStream) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamFileEncKeyList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamFileEncKeyList parseFrom(C23856l lVar) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RoamFileEncKeyList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RoamFileEncKeyList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface RoamFileEncKeyListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        RoamFileEncKeyItem getEncList(int i);

        int getEncListCount();

        List<RoamFileEncKeyItem> getEncListList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RoamMediaInfo extends C23861l0<RoamMediaInfo, Builder> implements RoamMediaInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final RoamMediaInfo DEFAULT_INSTANCE;
        public static final int MEDIA_ID_FIELD_NUMBER = 2;
        public static final int MEDIA_PATH_FIELD_NUMBER = 4;
        public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
        public static final int MSG_SVR_ID_FIELD_NUMBER = 1;
        private static volatile C24062w1<RoamMediaInfo> PARSER;
        private int bitField0_;
        private C23908o0.C23919j<String> mediaId_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<String> mediaPath_ = C23861l0.emptyProtobufList();
        private C23908o0.C23915g mediaType_ = C23861l0.emptyIntList();
        private long msgSvrId_;

        public static final class Builder extends C23861l0.C23862a<RoamMediaInfo, Builder> implements RoamMediaInfoOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder addAllMediaId(Iterable<String> iterable) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).addAllMediaId(iterable);
                return this;
            }

            public Builder addAllMediaPath(Iterable<String> iterable) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).addAllMediaPath(iterable);
                return this;
            }

            public Builder addAllMediaType(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).addAllMediaType(iterable);
                return this;
            }

            public Builder addMediaId(String str) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).addMediaId(str);
                return this;
            }

            public Builder addMediaIdBytes(C16994k kVar) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).addMediaIdBytes(kVar);
                return this;
            }

            public Builder addMediaPath(String str) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).addMediaPath(str);
                return this;
            }

            public Builder addMediaPathBytes(C16994k kVar) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).addMediaPathBytes(kVar);
                return this;
            }

            public Builder addMediaType(int i) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).addMediaType(i);
                return this;
            }

            public Builder clearMediaId() {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).clearMediaId();
                return this;
            }

            public Builder clearMediaPath() {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).clearMediaPath();
                return this;
            }

            public Builder clearMediaType() {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).clearMediaType();
                return this;
            }

            public Builder clearMsgSvrId() {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).clearMsgSvrId();
                return this;
            }

            public String getMediaId(int i) {
                return ((RoamMediaInfo) this.instance).getMediaId(i);
            }

            public C16994k getMediaIdBytes(int i) {
                return ((RoamMediaInfo) this.instance).getMediaIdBytes(i);
            }

            public int getMediaIdCount() {
                return ((RoamMediaInfo) this.instance).getMediaIdCount();
            }

            public List<String> getMediaIdList() {
                return Collections.unmodifiableList(((RoamMediaInfo) this.instance).getMediaIdList());
            }

            public String getMediaPath(int i) {
                return ((RoamMediaInfo) this.instance).getMediaPath(i);
            }

            public C16994k getMediaPathBytes(int i) {
                return ((RoamMediaInfo) this.instance).getMediaPathBytes(i);
            }

            public int getMediaPathCount() {
                return ((RoamMediaInfo) this.instance).getMediaPathCount();
            }

            public List<String> getMediaPathList() {
                return Collections.unmodifiableList(((RoamMediaInfo) this.instance).getMediaPathList());
            }

            public int getMediaType(int i) {
                return ((RoamMediaInfo) this.instance).getMediaType(i);
            }

            public int getMediaTypeCount() {
                return ((RoamMediaInfo) this.instance).getMediaTypeCount();
            }

            public List<Integer> getMediaTypeList() {
                return Collections.unmodifiableList(((RoamMediaInfo) this.instance).getMediaTypeList());
            }

            public long getMsgSvrId() {
                return ((RoamMediaInfo) this.instance).getMsgSvrId();
            }

            public boolean hasMsgSvrId() {
                return ((RoamMediaInfo) this.instance).hasMsgSvrId();
            }

            public Builder setMediaId(int i, String str) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).setMediaId(i, str);
                return this;
            }

            public Builder setMediaPath(int i, String str) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).setMediaPath(i, str);
                return this;
            }

            public Builder setMediaType(int i, int i2) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).setMediaType(i, i2);
                return this;
            }

            public Builder setMsgSvrId(long j) {
                copyOnWrite();
                ((RoamMediaInfo) this.instance).setMsgSvrId(j);
                return this;
            }

            private Builder() {
                super(RoamMediaInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            RoamMediaInfo roamMediaInfo = new RoamMediaInfo();
            DEFAULT_INSTANCE = roamMediaInfo;
            C23861l0.registerDefaultInstance(RoamMediaInfo.class, roamMediaInfo);
        }

        private RoamMediaInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllMediaId(Iterable<String> iterable) {
            ensureMediaIdIsMutable();
            C23810b.addAll(iterable, this.mediaId_);
        }

        /* access modifiers changed from: private */
        public void addAllMediaPath(Iterable<String> iterable) {
            ensureMediaPathIsMutable();
            C23810b.addAll(iterable, this.mediaPath_);
        }

        /* access modifiers changed from: private */
        public void addAllMediaType(Iterable<? extends Integer> iterable) {
            ensureMediaTypeIsMutable();
            C23810b.addAll(iterable, this.mediaType_);
        }

        /* access modifiers changed from: private */
        public void addMediaId(String str) {
            str.getClass();
            ensureMediaIdIsMutable();
            this.mediaId_.add(str);
        }

        /* access modifiers changed from: private */
        public void addMediaIdBytes(C16994k kVar) {
            ensureMediaIdIsMutable();
            this.mediaId_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void addMediaPath(String str) {
            str.getClass();
            ensureMediaPathIsMutable();
            this.mediaPath_.add(str);
        }

        /* access modifiers changed from: private */
        public void addMediaPathBytes(C16994k kVar) {
            ensureMediaPathIsMutable();
            this.mediaPath_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void addMediaType(int i) {
            ensureMediaTypeIsMutable();
            ((C23901n0) this.mediaType_).mo37933h(i);
        }

        /* access modifiers changed from: private */
        public void clearMediaId() {
            this.mediaId_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMediaPath() {
            this.mediaPath_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMediaType() {
            this.mediaType_ = C23861l0.emptyIntList();
        }

        /* access modifiers changed from: private */
        public void clearMsgSvrId() {
            this.bitField0_ &= -2;
            this.msgSvrId_ = 0;
        }

        private void ensureMediaIdIsMutable() {
            C23908o0.C23919j<String> jVar = this.mediaId_;
            if (!jVar.mo37523Q()) {
                this.mediaId_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureMediaPathIsMutable() {
            C23908o0.C23919j<String> jVar = this.mediaPath_;
            if (!jVar.mo37523Q()) {
                this.mediaPath_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureMediaTypeIsMutable() {
            C23908o0.C23915g gVar = this.mediaType_;
            if (!((C23817d) gVar).f68221d) {
                this.mediaType_ = C23861l0.mutableCopy(gVar);
            }
        }

        public static RoamMediaInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoamMediaInfo parseDelimitedFrom(InputStream inputStream) {
            return (RoamMediaInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamMediaInfo parseFrom(ByteBuffer byteBuffer) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RoamMediaInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMediaId(int i, String str) {
            str.getClass();
            ensureMediaIdIsMutable();
            this.mediaId_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setMediaPath(int i, String str) {
            str.getClass();
            ensureMediaPathIsMutable();
            this.mediaPath_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setMediaType(int i, int i2) {
            ensureMediaTypeIsMutable();
            ((C23901n0) this.mediaType_).mo37939n(i, i2);
        }

        /* access modifiers changed from: private */
        public void setMsgSvrId(long j) {
            this.bitField0_ |= 1;
            this.msgSvrId_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဃ\u0000\u0002\u001a\u0003\u001d\u0004\u001a", new Object[]{"bitField0_", "msgSvrId_", "mediaId_", "mediaType_", "mediaPath_"});
                case 3:
                    return new RoamMediaInfo();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RoamMediaInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RoamMediaInfo.class) {
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

        public String getMediaId(int i) {
            return this.mediaId_.get(i);
        }

        public C16994k getMediaIdBytes(int i) {
            return C16994k.m16791k(this.mediaId_.get(i));
        }

        public int getMediaIdCount() {
            return this.mediaId_.size();
        }

        public List<String> getMediaIdList() {
            return this.mediaId_;
        }

        public String getMediaPath(int i) {
            return this.mediaPath_.get(i);
        }

        public C16994k getMediaPathBytes(int i) {
            return C16994k.m16791k(this.mediaPath_.get(i));
        }

        public int getMediaPathCount() {
            return this.mediaPath_.size();
        }

        public List<String> getMediaPathList() {
            return this.mediaPath_;
        }

        public int getMediaType(int i) {
            return ((C23901n0) this.mediaType_).mo37936k(i);
        }

        public int getMediaTypeCount() {
            return ((C23901n0) this.mediaType_).f68498f;
        }

        public List<Integer> getMediaTypeList() {
            return this.mediaType_;
        }

        public long getMsgSvrId() {
            return this.msgSvrId_;
        }

        public boolean hasMsgSvrId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(RoamMediaInfo roamMediaInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roamMediaInfo);
        }

        public static RoamMediaInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamMediaInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamMediaInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RoamMediaInfo parseFrom(C16994k kVar) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static RoamMediaInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RoamMediaInfo parseFrom(byte[] bArr) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoamMediaInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RoamMediaInfo parseFrom(InputStream inputStream) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamMediaInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamMediaInfo parseFrom(C23856l lVar) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RoamMediaInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RoamMediaInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface RoamMediaInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getMediaId(int i);

        C16994k getMediaIdBytes(int i);

        int getMediaIdCount();

        List<String> getMediaIdList();

        String getMediaPath(int i);

        C16994k getMediaPathBytes(int i);

        int getMediaPathCount();

        List<String> getMediaPathList();

        int getMediaType(int i);

        int getMediaTypeCount();

        List<Integer> getMediaTypeList();

        long getMsgSvrId();

        boolean hasMsgSvrId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RoamMsgItem extends C23861l0<RoamMsgItem, Builder> implements RoamMsgItemOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 4;
        public static final int CREATE_TIME_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final RoamMsgItem DEFAULT_INSTANCE;
        public static final int FROM_USERNAME_FIELD_NUMBER = 2;
        public static final int MEDIA_ID_FIELD_NUMBER = 9;
        public static final int MEDIA_TYPE_FIELD_NUMBER = 10;
        public static final int MSG_SOURCE_FIELD_NUMBER = 6;
        public static final int MSG_SVR_ID_FIELD_NUMBER = 7;
        private static volatile C24062w1<RoamMsgItem> PARSER = null;
        public static final int SEQUENT_ID_FIELD_NUMBER = 8;
        public static final int TO_USERNAME_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String content_ = "";
        private long createTime_;
        private String fromUsername_ = "";
        private C23908o0.C23919j<String> mediaId_ = C23861l0.emptyProtobufList();
        private C23908o0.C23915g mediaType_ = C23861l0.emptyIntList();
        private String msgSource_ = "";
        private long msgSvrId_;
        private long sequentId_;
        private String toUsername_ = "";
        private int type_;

        public static final class Builder extends C23861l0.C23862a<RoamMsgItem, Builder> implements RoamMsgItemOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder addAllMediaId(Iterable<String> iterable) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).addAllMediaId(iterable);
                return this;
            }

            public Builder addAllMediaType(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).addAllMediaType(iterable);
                return this;
            }

            public Builder addMediaId(String str) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).addMediaId(str);
                return this;
            }

            public Builder addMediaIdBytes(C16994k kVar) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).addMediaIdBytes(kVar);
                return this;
            }

            public Builder addMediaType(int i) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).addMediaType(i);
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearContent();
                return this;
            }

            public Builder clearCreateTime() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearCreateTime();
                return this;
            }

            public Builder clearFromUsername() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearFromUsername();
                return this;
            }

            public Builder clearMediaId() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearMediaId();
                return this;
            }

            public Builder clearMediaType() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearMediaType();
                return this;
            }

            public Builder clearMsgSource() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearMsgSource();
                return this;
            }

            public Builder clearMsgSvrId() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearMsgSvrId();
                return this;
            }

            public Builder clearSequentId() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearSequentId();
                return this;
            }

            public Builder clearToUsername() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearToUsername();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((RoamMsgItem) this.instance).clearType();
                return this;
            }

            public String getContent() {
                return ((RoamMsgItem) this.instance).getContent();
            }

            public C16994k getContentBytes() {
                return ((RoamMsgItem) this.instance).getContentBytes();
            }

            public long getCreateTime() {
                return ((RoamMsgItem) this.instance).getCreateTime();
            }

            public String getFromUsername() {
                return ((RoamMsgItem) this.instance).getFromUsername();
            }

            public C16994k getFromUsernameBytes() {
                return ((RoamMsgItem) this.instance).getFromUsernameBytes();
            }

            public String getMediaId(int i) {
                return ((RoamMsgItem) this.instance).getMediaId(i);
            }

            public C16994k getMediaIdBytes(int i) {
                return ((RoamMsgItem) this.instance).getMediaIdBytes(i);
            }

            public int getMediaIdCount() {
                return ((RoamMsgItem) this.instance).getMediaIdCount();
            }

            public List<String> getMediaIdList() {
                return Collections.unmodifiableList(((RoamMsgItem) this.instance).getMediaIdList());
            }

            public int getMediaType(int i) {
                return ((RoamMsgItem) this.instance).getMediaType(i);
            }

            public int getMediaTypeCount() {
                return ((RoamMsgItem) this.instance).getMediaTypeCount();
            }

            public List<Integer> getMediaTypeList() {
                return Collections.unmodifiableList(((RoamMsgItem) this.instance).getMediaTypeList());
            }

            public String getMsgSource() {
                return ((RoamMsgItem) this.instance).getMsgSource();
            }

            public C16994k getMsgSourceBytes() {
                return ((RoamMsgItem) this.instance).getMsgSourceBytes();
            }

            public long getMsgSvrId() {
                return ((RoamMsgItem) this.instance).getMsgSvrId();
            }

            public long getSequentId() {
                return ((RoamMsgItem) this.instance).getSequentId();
            }

            public String getToUsername() {
                return ((RoamMsgItem) this.instance).getToUsername();
            }

            public C16994k getToUsernameBytes() {
                return ((RoamMsgItem) this.instance).getToUsernameBytes();
            }

            public int getType() {
                return ((RoamMsgItem) this.instance).getType();
            }

            public boolean hasContent() {
                return ((RoamMsgItem) this.instance).hasContent();
            }

            public boolean hasCreateTime() {
                return ((RoamMsgItem) this.instance).hasCreateTime();
            }

            public boolean hasFromUsername() {
                return ((RoamMsgItem) this.instance).hasFromUsername();
            }

            public boolean hasMsgSource() {
                return ((RoamMsgItem) this.instance).hasMsgSource();
            }

            public boolean hasMsgSvrId() {
                return ((RoamMsgItem) this.instance).hasMsgSvrId();
            }

            public boolean hasSequentId() {
                return ((RoamMsgItem) this.instance).hasSequentId();
            }

            public boolean hasToUsername() {
                return ((RoamMsgItem) this.instance).hasToUsername();
            }

            public boolean hasType() {
                return ((RoamMsgItem) this.instance).hasType();
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(C16994k kVar) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setContentBytes(kVar);
                return this;
            }

            public Builder setCreateTime(long j) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setCreateTime(j);
                return this;
            }

            public Builder setFromUsername(String str) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setFromUsername(str);
                return this;
            }

            public Builder setFromUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setFromUsernameBytes(kVar);
                return this;
            }

            public Builder setMediaId(int i, String str) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setMediaId(i, str);
                return this;
            }

            public Builder setMediaType(int i, int i2) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setMediaType(i, i2);
                return this;
            }

            public Builder setMsgSource(String str) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setMsgSource(str);
                return this;
            }

            public Builder setMsgSourceBytes(C16994k kVar) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setMsgSourceBytes(kVar);
                return this;
            }

            public Builder setMsgSvrId(long j) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setMsgSvrId(j);
                return this;
            }

            public Builder setSequentId(long j) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setSequentId(j);
                return this;
            }

            public Builder setToUsername(String str) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setToUsername(str);
                return this;
            }

            public Builder setToUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setToUsernameBytes(kVar);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((RoamMsgItem) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(RoamMsgItem.DEFAULT_INSTANCE);
            }
        }

        static {
            RoamMsgItem roamMsgItem = new RoamMsgItem();
            DEFAULT_INSTANCE = roamMsgItem;
            C23861l0.registerDefaultInstance(RoamMsgItem.class, roamMsgItem);
        }

        private RoamMsgItem() {
        }

        /* access modifiers changed from: private */
        public void addAllMediaId(Iterable<String> iterable) {
            ensureMediaIdIsMutable();
            C23810b.addAll(iterable, this.mediaId_);
        }

        /* access modifiers changed from: private */
        public void addAllMediaType(Iterable<? extends Integer> iterable) {
            ensureMediaTypeIsMutable();
            C23810b.addAll(iterable, this.mediaType_);
        }

        /* access modifiers changed from: private */
        public void addMediaId(String str) {
            str.getClass();
            ensureMediaIdIsMutable();
            this.mediaId_.add(str);
        }

        /* access modifiers changed from: private */
        public void addMediaIdBytes(C16994k kVar) {
            ensureMediaIdIsMutable();
            this.mediaId_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void addMediaType(int i) {
            ensureMediaTypeIsMutable();
            ((C23901n0) this.mediaType_).mo37933h(i);
        }

        /* access modifiers changed from: private */
        public void clearContent() {
            this.bitField0_ &= -9;
            this.content_ = getDefaultInstance().getContent();
        }

        /* access modifiers changed from: private */
        public void clearCreateTime() {
            this.bitField0_ &= -17;
            this.createTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFromUsername() {
            this.bitField0_ &= -3;
            this.fromUsername_ = getDefaultInstance().getFromUsername();
        }

        /* access modifiers changed from: private */
        public void clearMediaId() {
            this.mediaId_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMediaType() {
            this.mediaType_ = C23861l0.emptyIntList();
        }

        /* access modifiers changed from: private */
        public void clearMsgSource() {
            this.bitField0_ &= -33;
            this.msgSource_ = getDefaultInstance().getMsgSource();
        }

        /* access modifiers changed from: private */
        public void clearMsgSvrId() {
            this.bitField0_ &= -65;
            this.msgSvrId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSequentId() {
            this.bitField0_ &= -129;
            this.sequentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearToUsername() {
            this.bitField0_ &= -5;
            this.toUsername_ = getDefaultInstance().getToUsername();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureMediaIdIsMutable() {
            C23908o0.C23919j<String> jVar = this.mediaId_;
            if (!jVar.mo37523Q()) {
                this.mediaId_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureMediaTypeIsMutable() {
            C23908o0.C23915g gVar = this.mediaType_;
            if (!((C23817d) gVar).f68221d) {
                this.mediaType_ = C23861l0.mutableCopy(gVar);
            }
        }

        public static RoamMsgItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoamMsgItem parseDelimitedFrom(InputStream inputStream) {
            return (RoamMsgItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamMsgItem parseFrom(ByteBuffer byteBuffer) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RoamMsgItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setCreateTime(long j) {
            this.bitField0_ |= 16;
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
        public void setMediaId(int i, String str) {
            str.getClass();
            ensureMediaIdIsMutable();
            this.mediaId_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setMediaType(int i, int i2) {
            ensureMediaTypeIsMutable();
            ((C23901n0) this.mediaType_).mo37939n(i, i2);
        }

        /* access modifiers changed from: private */
        public void setMsgSource(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.msgSource_ = str;
        }

        /* access modifiers changed from: private */
        public void setMsgSourceBytes(C16994k kVar) {
            this.msgSource_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setMsgSvrId(long j) {
            this.bitField0_ |= 64;
            this.msgSvrId_ = j;
        }

        /* access modifiers changed from: private */
        public void setSequentId(long j) {
            this.bitField0_ |= 128;
            this.sequentId_ = j;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဃ\u0004\u0006ဈ\u0005\u0007ဃ\u0006\bဃ\u0007\t\u001a\n\u001d", new Object[]{"bitField0_", "type_", "fromUsername_", "toUsername_", "content_", "createTime_", "msgSource_", "msgSvrId_", "sequentId_", "mediaId_", "mediaType_"});
                case 3:
                    return new RoamMsgItem();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RoamMsgItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RoamMsgItem.class) {
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

        public String getMediaId(int i) {
            return this.mediaId_.get(i);
        }

        public C16994k getMediaIdBytes(int i) {
            return C16994k.m16791k(this.mediaId_.get(i));
        }

        public int getMediaIdCount() {
            return this.mediaId_.size();
        }

        public List<String> getMediaIdList() {
            return this.mediaId_;
        }

        public int getMediaType(int i) {
            return ((C23901n0) this.mediaType_).mo37936k(i);
        }

        public int getMediaTypeCount() {
            return ((C23901n0) this.mediaType_).f68498f;
        }

        public List<Integer> getMediaTypeList() {
            return this.mediaType_;
        }

        public String getMsgSource() {
            return this.msgSource_;
        }

        public C16994k getMsgSourceBytes() {
            return C16994k.m16791k(this.msgSource_);
        }

        public long getMsgSvrId() {
            return this.msgSvrId_;
        }

        public long getSequentId() {
            return this.sequentId_;
        }

        public String getToUsername() {
            return this.toUsername_;
        }

        public C16994k getToUsernameBytes() {
            return C16994k.m16791k(this.toUsername_);
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasCreateTime() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasFromUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMsgSource() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasMsgSvrId() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasSequentId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasToUsername() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(RoamMsgItem roamMsgItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roamMsgItem);
        }

        public static RoamMsgItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamMsgItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamMsgItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RoamMsgItem parseFrom(C16994k kVar) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static RoamMsgItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RoamMsgItem parseFrom(byte[] bArr) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoamMsgItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RoamMsgItem parseFrom(InputStream inputStream) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamMsgItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamMsgItem parseFrom(C23856l lVar) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RoamMsgItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RoamMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface RoamMsgItemOrBuilder extends C23848k1 {
        String getContent();

        C16994k getContentBytes();

        long getCreateTime();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getFromUsername();

        C16994k getFromUsernameBytes();

        String getMediaId(int i);

        C16994k getMediaIdBytes(int i);

        int getMediaIdCount();

        List<String> getMediaIdList();

        int getMediaType(int i);

        int getMediaTypeCount();

        List<Integer> getMediaTypeList();

        String getMsgSource();

        C16994k getMsgSourceBytes();

        long getMsgSvrId();

        long getSequentId();

        String getToUsername();

        C16994k getToUsernameBytes();

        int getType();

        boolean hasContent();

        boolean hasCreateTime();

        boolean hasFromUsername();

        boolean hasMsgSource();

        boolean hasMsgSvrId();

        boolean hasSequentId();

        boolean hasToUsername();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RoamMsgList extends C23861l0<RoamMsgList, Builder> implements RoamMsgListOrBuilder {
        /* access modifiers changed from: private */
        public static final RoamMsgList DEFAULT_INSTANCE;
        public static final int ITEM_LIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<RoamMsgList> PARSER;
        private C23908o0.C23919j<RoamMsgItem> itemList_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<RoamMsgList, Builder> implements RoamMsgListOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder addAllItemList(Iterable<? extends RoamMsgItem> iterable) {
                copyOnWrite();
                ((RoamMsgList) this.instance).addAllItemList(iterable);
                return this;
            }

            public Builder addItemList(RoamMsgItem roamMsgItem) {
                copyOnWrite();
                ((RoamMsgList) this.instance).addItemList(roamMsgItem);
                return this;
            }

            public Builder clearItemList() {
                copyOnWrite();
                ((RoamMsgList) this.instance).clearItemList();
                return this;
            }

            public RoamMsgItem getItemList(int i) {
                return ((RoamMsgList) this.instance).getItemList(i);
            }

            public int getItemListCount() {
                return ((RoamMsgList) this.instance).getItemListCount();
            }

            public List<RoamMsgItem> getItemListList() {
                return Collections.unmodifiableList(((RoamMsgList) this.instance).getItemListList());
            }

            public Builder removeItemList(int i) {
                copyOnWrite();
                ((RoamMsgList) this.instance).removeItemList(i);
                return this;
            }

            public Builder setItemList(int i, RoamMsgItem roamMsgItem) {
                copyOnWrite();
                ((RoamMsgList) this.instance).setItemList(i, roamMsgItem);
                return this;
            }

            private Builder() {
                super(RoamMsgList.DEFAULT_INSTANCE);
            }

            public Builder addItemList(int i, RoamMsgItem roamMsgItem) {
                copyOnWrite();
                ((RoamMsgList) this.instance).addItemList(i, roamMsgItem);
                return this;
            }

            public Builder setItemList(int i, RoamMsgItem.Builder builder) {
                copyOnWrite();
                ((RoamMsgList) this.instance).setItemList(i, (RoamMsgItem) builder.build());
                return this;
            }

            public Builder addItemList(RoamMsgItem.Builder builder) {
                copyOnWrite();
                ((RoamMsgList) this.instance).addItemList((RoamMsgItem) builder.build());
                return this;
            }

            public Builder addItemList(int i, RoamMsgItem.Builder builder) {
                copyOnWrite();
                ((RoamMsgList) this.instance).addItemList(i, (RoamMsgItem) builder.build());
                return this;
            }
        }

        static {
            RoamMsgList roamMsgList = new RoamMsgList();
            DEFAULT_INSTANCE = roamMsgList;
            C23861l0.registerDefaultInstance(RoamMsgList.class, roamMsgList);
        }

        private RoamMsgList() {
        }

        /* access modifiers changed from: private */
        public void addAllItemList(Iterable<? extends RoamMsgItem> iterable) {
            ensureItemListIsMutable();
            C23810b.addAll(iterable, this.itemList_);
        }

        /* access modifiers changed from: private */
        public void addItemList(RoamMsgItem roamMsgItem) {
            roamMsgItem.getClass();
            ensureItemListIsMutable();
            this.itemList_.add(roamMsgItem);
        }

        /* access modifiers changed from: private */
        public void clearItemList() {
            this.itemList_ = C23861l0.emptyProtobufList();
        }

        private void ensureItemListIsMutable() {
            C23908o0.C23919j<RoamMsgItem> jVar = this.itemList_;
            if (!jVar.mo37523Q()) {
                this.itemList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static RoamMsgList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoamMsgList parseDelimitedFrom(InputStream inputStream) {
            return (RoamMsgList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamMsgList parseFrom(ByteBuffer byteBuffer) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RoamMsgList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeItemList(int i) {
            ensureItemListIsMutable();
            this.itemList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setItemList(int i, RoamMsgItem roamMsgItem) {
            roamMsgItem.getClass();
            ensureItemListIsMutable();
            this.itemList_.set(i, roamMsgItem);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"itemList_", RoamMsgItem.class});
                case 3:
                    return new RoamMsgList();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RoamMsgList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RoamMsgList.class) {
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

        public RoamMsgItem getItemList(int i) {
            return this.itemList_.get(i);
        }

        public int getItemListCount() {
            return this.itemList_.size();
        }

        public List<RoamMsgItem> getItemListList() {
            return this.itemList_;
        }

        public RoamMsgItemOrBuilder getItemListOrBuilder(int i) {
            return this.itemList_.get(i);
        }

        public List<? extends RoamMsgItemOrBuilder> getItemListOrBuilderList() {
            return this.itemList_;
        }

        public static Builder newBuilder(RoamMsgList roamMsgList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roamMsgList);
        }

        public static RoamMsgList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamMsgList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamMsgList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RoamMsgList parseFrom(C16994k kVar) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addItemList(int i, RoamMsgItem roamMsgItem) {
            roamMsgItem.getClass();
            ensureItemListIsMutable();
            this.itemList_.add(i, roamMsgItem);
        }

        public static RoamMsgList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RoamMsgList parseFrom(byte[] bArr) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoamMsgList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RoamMsgList parseFrom(InputStream inputStream) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamMsgList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamMsgList parseFrom(C23856l lVar) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RoamMsgList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RoamMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface RoamMsgListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        RoamMsgItem getItemList(int i);

        int getItemListCount();

        List<RoamMsgItem> getItemListList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class RoamPackage extends C23861l0<RoamPackage, Builder> implements RoamPackageOrBuilder {
        /* access modifiers changed from: private */
        public static final RoamPackage DEFAULT_INSTANCE;
        public static final int MEDIA_INFO_LIST_FIELD_NUMBER = 2;
        public static final int MSG_LIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<RoamPackage> PARSER;
        private int bitField0_;
        private C23908o0.C23919j<RoamMediaInfo> mediaInfoList_ = C23861l0.emptyProtobufList();
        private RoamMsgList msgList_;

        public static final class Builder extends C23861l0.C23862a<RoamPackage, Builder> implements RoamPackageOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder addAllMediaInfoList(Iterable<? extends RoamMediaInfo> iterable) {
                copyOnWrite();
                ((RoamPackage) this.instance).addAllMediaInfoList(iterable);
                return this;
            }

            public Builder addMediaInfoList(RoamMediaInfo roamMediaInfo) {
                copyOnWrite();
                ((RoamPackage) this.instance).addMediaInfoList(roamMediaInfo);
                return this;
            }

            public Builder clearMediaInfoList() {
                copyOnWrite();
                ((RoamPackage) this.instance).clearMediaInfoList();
                return this;
            }

            public Builder clearMsgList() {
                copyOnWrite();
                ((RoamPackage) this.instance).clearMsgList();
                return this;
            }

            public RoamMediaInfo getMediaInfoList(int i) {
                return ((RoamPackage) this.instance).getMediaInfoList(i);
            }

            public int getMediaInfoListCount() {
                return ((RoamPackage) this.instance).getMediaInfoListCount();
            }

            public List<RoamMediaInfo> getMediaInfoListList() {
                return Collections.unmodifiableList(((RoamPackage) this.instance).getMediaInfoListList());
            }

            public RoamMsgList getMsgList() {
                return ((RoamPackage) this.instance).getMsgList();
            }

            public boolean hasMsgList() {
                return ((RoamPackage) this.instance).hasMsgList();
            }

            public Builder mergeMsgList(RoamMsgList roamMsgList) {
                copyOnWrite();
                ((RoamPackage) this.instance).mergeMsgList(roamMsgList);
                return this;
            }

            public Builder removeMediaInfoList(int i) {
                copyOnWrite();
                ((RoamPackage) this.instance).removeMediaInfoList(i);
                return this;
            }

            public Builder setMediaInfoList(int i, RoamMediaInfo roamMediaInfo) {
                copyOnWrite();
                ((RoamPackage) this.instance).setMediaInfoList(i, roamMediaInfo);
                return this;
            }

            public Builder setMsgList(RoamMsgList roamMsgList) {
                copyOnWrite();
                ((RoamPackage) this.instance).setMsgList(roamMsgList);
                return this;
            }

            private Builder() {
                super(RoamPackage.DEFAULT_INSTANCE);
            }

            public Builder addMediaInfoList(int i, RoamMediaInfo roamMediaInfo) {
                copyOnWrite();
                ((RoamPackage) this.instance).addMediaInfoList(i, roamMediaInfo);
                return this;
            }

            public Builder setMediaInfoList(int i, RoamMediaInfo.Builder builder) {
                copyOnWrite();
                ((RoamPackage) this.instance).setMediaInfoList(i, (RoamMediaInfo) builder.build());
                return this;
            }

            public Builder setMsgList(RoamMsgList.Builder builder) {
                copyOnWrite();
                ((RoamPackage) this.instance).setMsgList((RoamMsgList) builder.build());
                return this;
            }

            public Builder addMediaInfoList(RoamMediaInfo.Builder builder) {
                copyOnWrite();
                ((RoamPackage) this.instance).addMediaInfoList((RoamMediaInfo) builder.build());
                return this;
            }

            public Builder addMediaInfoList(int i, RoamMediaInfo.Builder builder) {
                copyOnWrite();
                ((RoamPackage) this.instance).addMediaInfoList(i, (RoamMediaInfo) builder.build());
                return this;
            }
        }

        static {
            RoamPackage roamPackage = new RoamPackage();
            DEFAULT_INSTANCE = roamPackage;
            C23861l0.registerDefaultInstance(RoamPackage.class, roamPackage);
        }

        private RoamPackage() {
        }

        /* access modifiers changed from: private */
        public void addAllMediaInfoList(Iterable<? extends RoamMediaInfo> iterable) {
            ensureMediaInfoListIsMutable();
            C23810b.addAll(iterable, this.mediaInfoList_);
        }

        /* access modifiers changed from: private */
        public void addMediaInfoList(RoamMediaInfo roamMediaInfo) {
            roamMediaInfo.getClass();
            ensureMediaInfoListIsMutable();
            this.mediaInfoList_.add(roamMediaInfo);
        }

        /* access modifiers changed from: private */
        public void clearMediaInfoList() {
            this.mediaInfoList_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMsgList() {
            this.msgList_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureMediaInfoListIsMutable() {
            C23908o0.C23919j<RoamMediaInfo> jVar = this.mediaInfoList_;
            if (!jVar.mo37523Q()) {
                this.mediaInfoList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static RoamPackage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeMsgList(RoamMsgList roamMsgList) {
            roamMsgList.getClass();
            RoamMsgList roamMsgList2 = this.msgList_;
            if (roamMsgList2 == null || roamMsgList2 == RoamMsgList.getDefaultInstance()) {
                this.msgList_ = roamMsgList;
            } else {
                this.msgList_ = (RoamMsgList) ((RoamMsgList.Builder) RoamMsgList.newBuilder(this.msgList_).mergeFrom(roamMsgList)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RoamPackage parseDelimitedFrom(InputStream inputStream) {
            return (RoamPackage) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamPackage parseFrom(ByteBuffer byteBuffer) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RoamPackage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeMediaInfoList(int i) {
            ensureMediaInfoListIsMutable();
            this.mediaInfoList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setMediaInfoList(int i, RoamMediaInfo roamMediaInfo) {
            roamMediaInfo.getClass();
            ensureMediaInfoListIsMutable();
            this.mediaInfoList_.set(i, roamMediaInfo);
        }

        /* access modifiers changed from: private */
        public void setMsgList(RoamMsgList roamMsgList) {
            roamMsgList.getClass();
            this.msgList_ = roamMsgList;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "msgList_", "mediaInfoList_", RoamMediaInfo.class});
                case 3:
                    return new RoamPackage();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RoamPackage> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RoamPackage.class) {
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

        public RoamMediaInfo getMediaInfoList(int i) {
            return this.mediaInfoList_.get(i);
        }

        public int getMediaInfoListCount() {
            return this.mediaInfoList_.size();
        }

        public List<RoamMediaInfo> getMediaInfoListList() {
            return this.mediaInfoList_;
        }

        public RoamMediaInfoOrBuilder getMediaInfoListOrBuilder(int i) {
            return this.mediaInfoList_.get(i);
        }

        public List<? extends RoamMediaInfoOrBuilder> getMediaInfoListOrBuilderList() {
            return this.mediaInfoList_;
        }

        public RoamMsgList getMsgList() {
            RoamMsgList roamMsgList = this.msgList_;
            return roamMsgList == null ? RoamMsgList.getDefaultInstance() : roamMsgList;
        }

        public boolean hasMsgList() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(RoamPackage roamPackage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(roamPackage);
        }

        public static RoamPackage parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamPackage) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamPackage parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RoamPackage parseFrom(C16994k kVar) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addMediaInfoList(int i, RoamMediaInfo roamMediaInfo) {
            roamMediaInfo.getClass();
            ensureMediaInfoListIsMutable();
            this.mediaInfoList_.add(i, roamMediaInfo);
        }

        public static RoamPackage parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RoamPackage parseFrom(byte[] bArr) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RoamPackage parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RoamPackage parseFrom(InputStream inputStream) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RoamPackage parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RoamPackage parseFrom(C23856l lVar) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RoamPackage parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RoamPackage) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface RoamPackageOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        RoamMediaInfo getMediaInfoList(int i);

        int getMediaInfoListCount();

        List<RoamMediaInfo> getMediaInfoListList();

        RoamMsgList getMsgList();

        boolean hasMsgList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class StorageServerInfo extends C23861l0<StorageServerInfo, Builder> implements StorageServerInfoOrBuilder {
        public static final int BACKUP_USED_SIZE_FIELD_NUMBER = 3;
        public static final int CACHED_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final StorageServerInfo DEFAULT_INSTANCE;
        public static final int LAST_BACKUP_TIME_FIELD_NUMBER = 4;
        private static volatile C24062w1<StorageServerInfo> PARSER = null;
        public static final int TOTAL_SIZE_FIELD_NUMBER = 1;
        public static final int USED_SIZE_FIELD_NUMBER = 2;
        private long backupUsedSize_;
        private int bitField0_;
        private boolean cached_;
        private long lastBackupTime_;
        private long totalSize_;
        private long usedSize_;

        public static final class Builder extends C23861l0.C23862a<StorageServerInfo, Builder> implements StorageServerInfoOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder clearBackupUsedSize() {
                copyOnWrite();
                ((StorageServerInfo) this.instance).clearBackupUsedSize();
                return this;
            }

            public Builder clearCached() {
                copyOnWrite();
                ((StorageServerInfo) this.instance).clearCached();
                return this;
            }

            public Builder clearLastBackupTime() {
                copyOnWrite();
                ((StorageServerInfo) this.instance).clearLastBackupTime();
                return this;
            }

            public Builder clearTotalSize() {
                copyOnWrite();
                ((StorageServerInfo) this.instance).clearTotalSize();
                return this;
            }

            public Builder clearUsedSize() {
                copyOnWrite();
                ((StorageServerInfo) this.instance).clearUsedSize();
                return this;
            }

            public long getBackupUsedSize() {
                return ((StorageServerInfo) this.instance).getBackupUsedSize();
            }

            public boolean getCached() {
                return ((StorageServerInfo) this.instance).getCached();
            }

            public long getLastBackupTime() {
                return ((StorageServerInfo) this.instance).getLastBackupTime();
            }

            public long getTotalSize() {
                return ((StorageServerInfo) this.instance).getTotalSize();
            }

            public long getUsedSize() {
                return ((StorageServerInfo) this.instance).getUsedSize();
            }

            public boolean hasBackupUsedSize() {
                return ((StorageServerInfo) this.instance).hasBackupUsedSize();
            }

            public boolean hasCached() {
                return ((StorageServerInfo) this.instance).hasCached();
            }

            public boolean hasLastBackupTime() {
                return ((StorageServerInfo) this.instance).hasLastBackupTime();
            }

            public boolean hasTotalSize() {
                return ((StorageServerInfo) this.instance).hasTotalSize();
            }

            public boolean hasUsedSize() {
                return ((StorageServerInfo) this.instance).hasUsedSize();
            }

            public Builder setBackupUsedSize(long j) {
                copyOnWrite();
                ((StorageServerInfo) this.instance).setBackupUsedSize(j);
                return this;
            }

            public Builder setCached(boolean z) {
                copyOnWrite();
                ((StorageServerInfo) this.instance).setCached(z);
                return this;
            }

            public Builder setLastBackupTime(long j) {
                copyOnWrite();
                ((StorageServerInfo) this.instance).setLastBackupTime(j);
                return this;
            }

            public Builder setTotalSize(long j) {
                copyOnWrite();
                ((StorageServerInfo) this.instance).setTotalSize(j);
                return this;
            }

            public Builder setUsedSize(long j) {
                copyOnWrite();
                ((StorageServerInfo) this.instance).setUsedSize(j);
                return this;
            }

            private Builder() {
                super(StorageServerInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            StorageServerInfo storageServerInfo = new StorageServerInfo();
            DEFAULT_INSTANCE = storageServerInfo;
            C23861l0.registerDefaultInstance(StorageServerInfo.class, storageServerInfo);
        }

        private StorageServerInfo() {
        }

        /* access modifiers changed from: private */
        public void clearBackupUsedSize() {
            this.bitField0_ &= -5;
            this.backupUsedSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCached() {
            this.bitField0_ &= -17;
            this.cached_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLastBackupTime() {
            this.bitField0_ &= -9;
            this.lastBackupTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTotalSize() {
            this.bitField0_ &= -2;
            this.totalSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUsedSize() {
            this.bitField0_ &= -3;
            this.usedSize_ = 0;
        }

        public static StorageServerInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StorageServerInfo parseDelimitedFrom(InputStream inputStream) {
            return (StorageServerInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StorageServerInfo parseFrom(ByteBuffer byteBuffer) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<StorageServerInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBackupUsedSize(long j) {
            this.bitField0_ |= 4;
            this.backupUsedSize_ = j;
        }

        /* access modifiers changed from: private */
        public void setCached(boolean z) {
            this.bitField0_ |= 16;
            this.cached_ = z;
        }

        /* access modifiers changed from: private */
        public void setLastBackupTime(long j) {
            this.bitField0_ |= 8;
            this.lastBackupTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setTotalSize(long j) {
            this.bitField0_ |= 1;
            this.totalSize_ = j;
        }

        /* access modifiers changed from: private */
        public void setUsedSize(long j) {
            this.bitField0_ |= 2;
            this.usedSize_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "totalSize_", "usedSize_", "backupUsedSize_", "lastBackupTime_", "cached_"});
                case 3:
                    return new StorageServerInfo();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<StorageServerInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (StorageServerInfo.class) {
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

        public long getBackupUsedSize() {
            return this.backupUsedSize_;
        }

        public boolean getCached() {
            return this.cached_;
        }

        public long getLastBackupTime() {
            return this.lastBackupTime_;
        }

        public long getTotalSize() {
            return this.totalSize_;
        }

        public long getUsedSize() {
            return this.usedSize_;
        }

        public boolean hasBackupUsedSize() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCached() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLastBackupTime() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTotalSize() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUsedSize() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(StorageServerInfo storageServerInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(storageServerInfo);
        }

        public static StorageServerInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (StorageServerInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static StorageServerInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static StorageServerInfo parseFrom(C16994k kVar) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static StorageServerInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static StorageServerInfo parseFrom(byte[] bArr) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StorageServerInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static StorageServerInfo parseFrom(InputStream inputStream) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StorageServerInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static StorageServerInfo parseFrom(C23856l lVar) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static StorageServerInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (StorageServerInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface StorageServerInfoOrBuilder extends C23848k1 {
        long getBackupUsedSize();

        boolean getCached();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getLastBackupTime();

        long getTotalSize();

        long getUsedSize();

        boolean hasBackupUsedSize();

        boolean hasCached();

        boolean hasLastBackupTime();

        boolean hasTotalSize();

        boolean hasUsedSize();

        /* synthetic */ boolean isInitialized();
    }

    public static final class StringList extends C23861l0<StringList, Builder> implements StringListOrBuilder {
        /* access modifiers changed from: private */
        public static final StringList DEFAULT_INSTANCE;
        private static volatile C24062w1<StringList> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 1;
        private C23908o0.C23919j<String> string_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<StringList, Builder> implements StringListOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder addAllString(Iterable<String> iterable) {
                copyOnWrite();
                ((StringList) this.instance).addAllString(iterable);
                return this;
            }

            public Builder addString(String str) {
                copyOnWrite();
                ((StringList) this.instance).addString(str);
                return this;
            }

            public Builder addStringBytes(C16994k kVar) {
                copyOnWrite();
                ((StringList) this.instance).addStringBytes(kVar);
                return this;
            }

            public Builder clearString() {
                copyOnWrite();
                ((StringList) this.instance).clearString();
                return this;
            }

            public String getString(int i) {
                return ((StringList) this.instance).getString(i);
            }

            public C16994k getStringBytes(int i) {
                return ((StringList) this.instance).getStringBytes(i);
            }

            public int getStringCount() {
                return ((StringList) this.instance).getStringCount();
            }

            public List<String> getStringList() {
                return Collections.unmodifiableList(((StringList) this.instance).getStringList());
            }

            public Builder setString(int i, String str) {
                copyOnWrite();
                ((StringList) this.instance).setString(i, str);
                return this;
            }

            private Builder() {
                super(StringList.DEFAULT_INSTANCE);
            }
        }

        static {
            StringList stringList = new StringList();
            DEFAULT_INSTANCE = stringList;
            C23861l0.registerDefaultInstance(StringList.class, stringList);
        }

        private StringList() {
        }

        /* access modifiers changed from: private */
        public void addAllString(Iterable<String> iterable) {
            ensureStringIsMutable();
            C23810b.addAll(iterable, this.string_);
        }

        /* access modifiers changed from: private */
        public void addString(String str) {
            str.getClass();
            ensureStringIsMutable();
            this.string_.add(str);
        }

        /* access modifiers changed from: private */
        public void addStringBytes(C16994k kVar) {
            ensureStringIsMutable();
            this.string_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearString() {
            this.string_ = C23861l0.emptyProtobufList();
        }

        private void ensureStringIsMutable() {
            C23908o0.C23919j<String> jVar = this.string_;
            if (!jVar.mo37523Q()) {
                this.string_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static StringList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StringList parseDelimitedFrom(InputStream inputStream) {
            return (StringList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringList parseFrom(ByteBuffer byteBuffer) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<StringList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setString(int i, String str) {
            str.getClass();
            ensureStringIsMutable();
            this.string_.set(i, str);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"string_"});
                case 3:
                    return new StringList();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<StringList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (StringList.class) {
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

        public String getString(int i) {
            return this.string_.get(i);
        }

        public C16994k getStringBytes(int i) {
            return C16994k.m16791k(this.string_.get(i));
        }

        public int getStringCount() {
            return this.string_.size();
        }

        public List<String> getStringList() {
            return this.string_;
        }

        public static Builder newBuilder(StringList stringList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(stringList);
        }

        public static StringList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (StringList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static StringList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static StringList parseFrom(C16994k kVar) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static StringList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static StringList parseFrom(byte[] bArr) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StringList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static StringList parseFrom(InputStream inputStream) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StringList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static StringList parseFrom(C23856l lVar) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static StringList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (StringList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface StringListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getString(int i);

        C16994k getStringBytes(int i);

        int getStringCount();

        List<String> getStringList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TransferStats extends C23861l0<TransferStats, Builder> implements TransferStatsOrBuilder {
        /* access modifiers changed from: private */
        public static final TransferStats DEFAULT_INSTANCE;
        public static final int ELAPSED_TIME_FIELD_NUMBER = 3;
        private static volatile C24062w1<TransferStats> PARSER = null;
        public static final int SPEED_FIELD_NUMBER = 4;
        public static final int TOTAL_SIZE_FIELD_NUMBER = 1;
        public static final int TRANSFERRED_DATA_SIZE_FIELD_NUMBER = 2;
        private int bitField0_;
        private long elapsedTime_;
        private long speed_;
        private long totalSize_;
        private long transferredDataSize_;

        public static final class Builder extends C23861l0.C23862a<TransferStats, Builder> implements TransferStatsOrBuilder {
            public /* synthetic */ Builder(C243031 r1) {
                this();
            }

            public Builder clearElapsedTime() {
                copyOnWrite();
                ((TransferStats) this.instance).clearElapsedTime();
                return this;
            }

            public Builder clearSpeed() {
                copyOnWrite();
                ((TransferStats) this.instance).clearSpeed();
                return this;
            }

            public Builder clearTotalSize() {
                copyOnWrite();
                ((TransferStats) this.instance).clearTotalSize();
                return this;
            }

            public Builder clearTransferredDataSize() {
                copyOnWrite();
                ((TransferStats) this.instance).clearTransferredDataSize();
                return this;
            }

            public long getElapsedTime() {
                return ((TransferStats) this.instance).getElapsedTime();
            }

            public long getSpeed() {
                return ((TransferStats) this.instance).getSpeed();
            }

            public long getTotalSize() {
                return ((TransferStats) this.instance).getTotalSize();
            }

            public long getTransferredDataSize() {
                return ((TransferStats) this.instance).getTransferredDataSize();
            }

            public boolean hasElapsedTime() {
                return ((TransferStats) this.instance).hasElapsedTime();
            }

            public boolean hasSpeed() {
                return ((TransferStats) this.instance).hasSpeed();
            }

            public boolean hasTotalSize() {
                return ((TransferStats) this.instance).hasTotalSize();
            }

            public boolean hasTransferredDataSize() {
                return ((TransferStats) this.instance).hasTransferredDataSize();
            }

            public Builder setElapsedTime(long j) {
                copyOnWrite();
                ((TransferStats) this.instance).setElapsedTime(j);
                return this;
            }

            public Builder setSpeed(long j) {
                copyOnWrite();
                ((TransferStats) this.instance).setSpeed(j);
                return this;
            }

            public Builder setTotalSize(long j) {
                copyOnWrite();
                ((TransferStats) this.instance).setTotalSize(j);
                return this;
            }

            public Builder setTransferredDataSize(long j) {
                copyOnWrite();
                ((TransferStats) this.instance).setTransferredDataSize(j);
                return this;
            }

            private Builder() {
                super(TransferStats.DEFAULT_INSTANCE);
            }
        }

        static {
            TransferStats transferStats = new TransferStats();
            DEFAULT_INSTANCE = transferStats;
            C23861l0.registerDefaultInstance(TransferStats.class, transferStats);
        }

        private TransferStats() {
        }

        /* access modifiers changed from: private */
        public void clearElapsedTime() {
            this.bitField0_ &= -5;
            this.elapsedTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSpeed() {
            this.bitField0_ &= -9;
            this.speed_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTotalSize() {
            this.bitField0_ &= -2;
            this.totalSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTransferredDataSize() {
            this.bitField0_ &= -3;
            this.transferredDataSize_ = 0;
        }

        public static TransferStats getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransferStats parseDelimitedFrom(InputStream inputStream) {
            return (TransferStats) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferStats parseFrom(ByteBuffer byteBuffer) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TransferStats> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setElapsedTime(long j) {
            this.bitField0_ |= 4;
            this.elapsedTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setSpeed(long j) {
            this.bitField0_ |= 8;
            this.speed_ = j;
        }

        /* access modifiers changed from: private */
        public void setTotalSize(long j) {
            this.bitField0_ |= 1;
            this.totalSize_ = j;
        }

        /* access modifiers changed from: private */
        public void setTransferredDataSize(long j) {
            this.bitField0_ |= 2;
            this.transferredDataSize_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003", new Object[]{"bitField0_", "totalSize_", "transferredDataSize_", "elapsedTime_", "speed_"});
                case 3:
                    return new TransferStats();
                case 4:
                    return new Builder((C243031) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TransferStats> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TransferStats.class) {
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

        public long getElapsedTime() {
            return this.elapsedTime_;
        }

        public long getSpeed() {
            return this.speed_;
        }

        public long getTotalSize() {
            return this.totalSize_;
        }

        public long getTransferredDataSize() {
            return this.transferredDataSize_;
        }

        public boolean hasElapsedTime() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSpeed() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTotalSize() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTransferredDataSize() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TransferStats transferStats) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transferStats);
        }

        public static TransferStats parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TransferStats) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TransferStats parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TransferStats parseFrom(C16994k kVar) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TransferStats parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TransferStats parseFrom(byte[] bArr) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransferStats parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TransferStats parseFrom(InputStream inputStream) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransferStats parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TransferStats parseFrom(C23856l lVar) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TransferStats parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TransferStats) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TransferStatsOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getElapsedTime();

        long getSpeed();

        long getTotalSize();

        long getTransferredDataSize();

        boolean hasElapsedTime();

        boolean hasSpeed();

        boolean hasTotalSize();

        boolean hasTransferredDataSize();

        /* synthetic */ boolean isInitialized();
    }

    private AffRoamProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
