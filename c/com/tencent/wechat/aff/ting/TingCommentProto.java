package com.tencent.wechat.aff.ting;

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
import com.google.protobuf.C24062w1;
import com.tencent.wechat.aff.finder.FinderProto;
import com.tencent.wechat.aff.ting.MMBaseProto;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class TingCommentProto {

    /* renamed from: com.tencent.wechat.aff.ting.TingCommentProto$1 */
    public static /* synthetic */ class C243211 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69817xa1df5c61;

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
                f69817xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69817xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69817xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69817xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69817xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69817xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69817xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.ting.TingCommentProto.C243211.<clinit>():void");
        }
    }

    public static final class CommentContentInfo extends C23861l0<CommentContentInfo, Builder> implements CommentContentInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final CommentContentInfo DEFAULT_INSTANCE;
        public static final int EMOTICON_INFOS_FIELD_NUMBER = 1;
        public static final int IMAGE_INFOS_FIELD_NUMBER = 2;
        private static volatile C24062w1<CommentContentInfo> PARSER = null;
        public static final int VIDEO_INFOS_FIELD_NUMBER = 3;
        private C23908o0.C23919j<CommentEmoticonInfo> emoticonInfos_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<CommentImageInfo> imageInfos_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<CommentVideoInfo> videoInfos_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<CommentContentInfo, Builder> implements CommentContentInfoOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder addAllEmoticonInfos(Iterable<? extends CommentEmoticonInfo> iterable) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addAllEmoticonInfos(iterable);
                return this;
            }

            public Builder addAllImageInfos(Iterable<? extends CommentImageInfo> iterable) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addAllImageInfos(iterable);
                return this;
            }

            public Builder addAllVideoInfos(Iterable<? extends CommentVideoInfo> iterable) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addAllVideoInfos(iterable);
                return this;
            }

            public Builder addEmoticonInfos(CommentEmoticonInfo commentEmoticonInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addEmoticonInfos(commentEmoticonInfo);
                return this;
            }

            public Builder addImageInfos(CommentImageInfo commentImageInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addImageInfos(commentImageInfo);
                return this;
            }

            public Builder addVideoInfos(CommentVideoInfo commentVideoInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addVideoInfos(commentVideoInfo);
                return this;
            }

            public Builder clearEmoticonInfos() {
                copyOnWrite();
                ((CommentContentInfo) this.instance).clearEmoticonInfos();
                return this;
            }

            public Builder clearImageInfos() {
                copyOnWrite();
                ((CommentContentInfo) this.instance).clearImageInfos();
                return this;
            }

            public Builder clearVideoInfos() {
                copyOnWrite();
                ((CommentContentInfo) this.instance).clearVideoInfos();
                return this;
            }

            public CommentEmoticonInfo getEmoticonInfos(int i) {
                return ((CommentContentInfo) this.instance).getEmoticonInfos(i);
            }

            public int getEmoticonInfosCount() {
                return ((CommentContentInfo) this.instance).getEmoticonInfosCount();
            }

            public List<CommentEmoticonInfo> getEmoticonInfosList() {
                return Collections.unmodifiableList(((CommentContentInfo) this.instance).getEmoticonInfosList());
            }

            public CommentImageInfo getImageInfos(int i) {
                return ((CommentContentInfo) this.instance).getImageInfos(i);
            }

            public int getImageInfosCount() {
                return ((CommentContentInfo) this.instance).getImageInfosCount();
            }

            public List<CommentImageInfo> getImageInfosList() {
                return Collections.unmodifiableList(((CommentContentInfo) this.instance).getImageInfosList());
            }

            public CommentVideoInfo getVideoInfos(int i) {
                return ((CommentContentInfo) this.instance).getVideoInfos(i);
            }

            public int getVideoInfosCount() {
                return ((CommentContentInfo) this.instance).getVideoInfosCount();
            }

            public List<CommentVideoInfo> getVideoInfosList() {
                return Collections.unmodifiableList(((CommentContentInfo) this.instance).getVideoInfosList());
            }

            public Builder removeEmoticonInfos(int i) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).removeEmoticonInfos(i);
                return this;
            }

            public Builder removeImageInfos(int i) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).removeImageInfos(i);
                return this;
            }

            public Builder removeVideoInfos(int i) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).removeVideoInfos(i);
                return this;
            }

            public Builder setEmoticonInfos(int i, CommentEmoticonInfo commentEmoticonInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).setEmoticonInfos(i, commentEmoticonInfo);
                return this;
            }

            public Builder setImageInfos(int i, CommentImageInfo commentImageInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).setImageInfos(i, commentImageInfo);
                return this;
            }

            public Builder setVideoInfos(int i, CommentVideoInfo commentVideoInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).setVideoInfos(i, commentVideoInfo);
                return this;
            }

            private Builder() {
                super(CommentContentInfo.DEFAULT_INSTANCE);
            }

            public Builder addEmoticonInfos(int i, CommentEmoticonInfo commentEmoticonInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addEmoticonInfos(i, commentEmoticonInfo);
                return this;
            }

            public Builder addImageInfos(int i, CommentImageInfo commentImageInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addImageInfos(i, commentImageInfo);
                return this;
            }

            public Builder addVideoInfos(int i, CommentVideoInfo commentVideoInfo) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addVideoInfos(i, commentVideoInfo);
                return this;
            }

            public Builder setEmoticonInfos(int i, CommentEmoticonInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).setEmoticonInfos(i, (CommentEmoticonInfo) builder.build());
                return this;
            }

            public Builder setImageInfos(int i, CommentImageInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).setImageInfos(i, (CommentImageInfo) builder.build());
                return this;
            }

            public Builder setVideoInfos(int i, CommentVideoInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).setVideoInfos(i, (CommentVideoInfo) builder.build());
                return this;
            }

            public Builder addEmoticonInfos(CommentEmoticonInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addEmoticonInfos((CommentEmoticonInfo) builder.build());
                return this;
            }

            public Builder addImageInfos(CommentImageInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addImageInfos((CommentImageInfo) builder.build());
                return this;
            }

            public Builder addVideoInfos(CommentVideoInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addVideoInfos((CommentVideoInfo) builder.build());
                return this;
            }

            public Builder addEmoticonInfos(int i, CommentEmoticonInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addEmoticonInfos(i, (CommentEmoticonInfo) builder.build());
                return this;
            }

            public Builder addImageInfos(int i, CommentImageInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addImageInfos(i, (CommentImageInfo) builder.build());
                return this;
            }

            public Builder addVideoInfos(int i, CommentVideoInfo.Builder builder) {
                copyOnWrite();
                ((CommentContentInfo) this.instance).addVideoInfos(i, (CommentVideoInfo) builder.build());
                return this;
            }
        }

        static {
            CommentContentInfo commentContentInfo = new CommentContentInfo();
            DEFAULT_INSTANCE = commentContentInfo;
            C23861l0.registerDefaultInstance(CommentContentInfo.class, commentContentInfo);
        }

        private CommentContentInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllEmoticonInfos(Iterable<? extends CommentEmoticonInfo> iterable) {
            ensureEmoticonInfosIsMutable();
            C23810b.addAll(iterable, this.emoticonInfos_);
        }

        /* access modifiers changed from: private */
        public void addAllImageInfos(Iterable<? extends CommentImageInfo> iterable) {
            ensureImageInfosIsMutable();
            C23810b.addAll(iterable, this.imageInfos_);
        }

        /* access modifiers changed from: private */
        public void addAllVideoInfos(Iterable<? extends CommentVideoInfo> iterable) {
            ensureVideoInfosIsMutable();
            C23810b.addAll(iterable, this.videoInfos_);
        }

        /* access modifiers changed from: private */
        public void addEmoticonInfos(CommentEmoticonInfo commentEmoticonInfo) {
            commentEmoticonInfo.getClass();
            ensureEmoticonInfosIsMutable();
            this.emoticonInfos_.add(commentEmoticonInfo);
        }

        /* access modifiers changed from: private */
        public void addImageInfos(CommentImageInfo commentImageInfo) {
            commentImageInfo.getClass();
            ensureImageInfosIsMutable();
            this.imageInfos_.add(commentImageInfo);
        }

        /* access modifiers changed from: private */
        public void addVideoInfos(CommentVideoInfo commentVideoInfo) {
            commentVideoInfo.getClass();
            ensureVideoInfosIsMutable();
            this.videoInfos_.add(commentVideoInfo);
        }

        /* access modifiers changed from: private */
        public void clearEmoticonInfos() {
            this.emoticonInfos_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearImageInfos() {
            this.imageInfos_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearVideoInfos() {
            this.videoInfos_ = C23861l0.emptyProtobufList();
        }

        private void ensureEmoticonInfosIsMutable() {
            C23908o0.C23919j<CommentEmoticonInfo> jVar = this.emoticonInfos_;
            if (!jVar.mo37523Q()) {
                this.emoticonInfos_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureImageInfosIsMutable() {
            C23908o0.C23919j<CommentImageInfo> jVar = this.imageInfos_;
            if (!jVar.mo37523Q()) {
                this.imageInfos_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureVideoInfosIsMutable() {
            C23908o0.C23919j<CommentVideoInfo> jVar = this.videoInfos_;
            if (!jVar.mo37523Q()) {
                this.videoInfos_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static CommentContentInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CommentContentInfo parseDelimitedFrom(InputStream inputStream) {
            return (CommentContentInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommentContentInfo parseFrom(ByteBuffer byteBuffer) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<CommentContentInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeEmoticonInfos(int i) {
            ensureEmoticonInfosIsMutable();
            this.emoticonInfos_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeImageInfos(int i) {
            ensureImageInfosIsMutable();
            this.imageInfos_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeVideoInfos(int i) {
            ensureVideoInfosIsMutable();
            this.videoInfos_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setEmoticonInfos(int i, CommentEmoticonInfo commentEmoticonInfo) {
            commentEmoticonInfo.getClass();
            ensureEmoticonInfosIsMutable();
            this.emoticonInfos_.set(i, commentEmoticonInfo);
        }

        /* access modifiers changed from: private */
        public void setImageInfos(int i, CommentImageInfo commentImageInfo) {
            commentImageInfo.getClass();
            ensureImageInfosIsMutable();
            this.imageInfos_.set(i, commentImageInfo);
        }

        /* access modifiers changed from: private */
        public void setVideoInfos(int i, CommentVideoInfo commentVideoInfo) {
            commentVideoInfo.getClass();
            ensureVideoInfosIsMutable();
            this.videoInfos_.set(i, commentVideoInfo);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"emoticonInfos_", CommentEmoticonInfo.class, "imageInfos_", CommentImageInfo.class, "videoInfos_", CommentVideoInfo.class});
                case 3:
                    return new CommentContentInfo();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<CommentContentInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (CommentContentInfo.class) {
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

        public CommentEmoticonInfo getEmoticonInfos(int i) {
            return this.emoticonInfos_.get(i);
        }

        public int getEmoticonInfosCount() {
            return this.emoticonInfos_.size();
        }

        public List<CommentEmoticonInfo> getEmoticonInfosList() {
            return this.emoticonInfos_;
        }

        public CommentEmoticonInfoOrBuilder getEmoticonInfosOrBuilder(int i) {
            return this.emoticonInfos_.get(i);
        }

        public List<? extends CommentEmoticonInfoOrBuilder> getEmoticonInfosOrBuilderList() {
            return this.emoticonInfos_;
        }

        public CommentImageInfo getImageInfos(int i) {
            return this.imageInfos_.get(i);
        }

        public int getImageInfosCount() {
            return this.imageInfos_.size();
        }

        public List<CommentImageInfo> getImageInfosList() {
            return this.imageInfos_;
        }

        public CommentImageInfoOrBuilder getImageInfosOrBuilder(int i) {
            return this.imageInfos_.get(i);
        }

        public List<? extends CommentImageInfoOrBuilder> getImageInfosOrBuilderList() {
            return this.imageInfos_;
        }

        public CommentVideoInfo getVideoInfos(int i) {
            return this.videoInfos_.get(i);
        }

        public int getVideoInfosCount() {
            return this.videoInfos_.size();
        }

        public List<CommentVideoInfo> getVideoInfosList() {
            return this.videoInfos_;
        }

        public CommentVideoInfoOrBuilder getVideoInfosOrBuilder(int i) {
            return this.videoInfos_.get(i);
        }

        public List<? extends CommentVideoInfoOrBuilder> getVideoInfosOrBuilderList() {
            return this.videoInfos_;
        }

        public static Builder newBuilder(CommentContentInfo commentContentInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(commentContentInfo);
        }

        public static CommentContentInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommentContentInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommentContentInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static CommentContentInfo parseFrom(C16994k kVar) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addEmoticonInfos(int i, CommentEmoticonInfo commentEmoticonInfo) {
            commentEmoticonInfo.getClass();
            ensureEmoticonInfosIsMutable();
            this.emoticonInfos_.add(i, commentEmoticonInfo);
        }

        /* access modifiers changed from: private */
        public void addImageInfos(int i, CommentImageInfo commentImageInfo) {
            commentImageInfo.getClass();
            ensureImageInfosIsMutable();
            this.imageInfos_.add(i, commentImageInfo);
        }

        /* access modifiers changed from: private */
        public void addVideoInfos(int i, CommentVideoInfo commentVideoInfo) {
            commentVideoInfo.getClass();
            ensureVideoInfosIsMutable();
            this.videoInfos_.add(i, commentVideoInfo);
        }

        public static CommentContentInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static CommentContentInfo parseFrom(byte[] bArr) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommentContentInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static CommentContentInfo parseFrom(InputStream inputStream) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommentContentInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommentContentInfo parseFrom(C23856l lVar) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CommentContentInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (CommentContentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface CommentContentInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        CommentEmoticonInfo getEmoticonInfos(int i);

        int getEmoticonInfosCount();

        List<CommentEmoticonInfo> getEmoticonInfosList();

        CommentImageInfo getImageInfos(int i);

        int getImageInfosCount();

        List<CommentImageInfo> getImageInfosList();

        CommentVideoInfo getVideoInfos(int i);

        int getVideoInfosCount();

        List<CommentVideoInfo> getVideoInfosList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class CommentEmoticonInfo extends C23861l0<CommentEmoticonInfo, Builder> implements CommentEmoticonInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final CommentEmoticonInfo DEFAULT_INSTANCE;
        public static final int DESC_FIELD_NUMBER = 2;
        public static final int MD5_FIELD_NUMBER = 1;
        private static volatile C24062w1<CommentEmoticonInfo> PARSER;
        private int bitField0_;
        private String desc_ = "";
        private String md5_ = "";

        public static final class Builder extends C23861l0.C23862a<CommentEmoticonInfo, Builder> implements CommentEmoticonInfoOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearDesc() {
                copyOnWrite();
                ((CommentEmoticonInfo) this.instance).clearDesc();
                return this;
            }

            public Builder clearMd5() {
                copyOnWrite();
                ((CommentEmoticonInfo) this.instance).clearMd5();
                return this;
            }

            public String getDesc() {
                return ((CommentEmoticonInfo) this.instance).getDesc();
            }

            public C16994k getDescBytes() {
                return ((CommentEmoticonInfo) this.instance).getDescBytes();
            }

            public String getMd5() {
                return ((CommentEmoticonInfo) this.instance).getMd5();
            }

            public C16994k getMd5Bytes() {
                return ((CommentEmoticonInfo) this.instance).getMd5Bytes();
            }

            public boolean hasDesc() {
                return ((CommentEmoticonInfo) this.instance).hasDesc();
            }

            public boolean hasMd5() {
                return ((CommentEmoticonInfo) this.instance).hasMd5();
            }

            public Builder setDesc(String str) {
                copyOnWrite();
                ((CommentEmoticonInfo) this.instance).setDesc(str);
                return this;
            }

            public Builder setDescBytes(C16994k kVar) {
                copyOnWrite();
                ((CommentEmoticonInfo) this.instance).setDescBytes(kVar);
                return this;
            }

            public Builder setMd5(String str) {
                copyOnWrite();
                ((CommentEmoticonInfo) this.instance).setMd5(str);
                return this;
            }

            public Builder setMd5Bytes(C16994k kVar) {
                copyOnWrite();
                ((CommentEmoticonInfo) this.instance).setMd5Bytes(kVar);
                return this;
            }

            private Builder() {
                super(CommentEmoticonInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            CommentEmoticonInfo commentEmoticonInfo = new CommentEmoticonInfo();
            DEFAULT_INSTANCE = commentEmoticonInfo;
            C23861l0.registerDefaultInstance(CommentEmoticonInfo.class, commentEmoticonInfo);
        }

        private CommentEmoticonInfo() {
        }

        /* access modifiers changed from: private */
        public void clearDesc() {
            this.bitField0_ &= -3;
            this.desc_ = getDefaultInstance().getDesc();
        }

        /* access modifiers changed from: private */
        public void clearMd5() {
            this.bitField0_ &= -2;
            this.md5_ = getDefaultInstance().getMd5();
        }

        public static CommentEmoticonInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CommentEmoticonInfo parseDelimitedFrom(InputStream inputStream) {
            return (CommentEmoticonInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommentEmoticonInfo parseFrom(ByteBuffer byteBuffer) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<CommentEmoticonInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDesc(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.desc_ = str;
        }

        /* access modifiers changed from: private */
        public void setDescBytes(C16994k kVar) {
            this.desc_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setMd5(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.md5_ = str;
        }

        /* access modifiers changed from: private */
        public void setMd5Bytes(C16994k kVar) {
            this.md5_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "md5_", "desc_"});
                case 3:
                    return new CommentEmoticonInfo();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<CommentEmoticonInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (CommentEmoticonInfo.class) {
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

        public String getDesc() {
            return this.desc_;
        }

        public C16994k getDescBytes() {
            return C16994k.m16791k(this.desc_);
        }

        public String getMd5() {
            return this.md5_;
        }

        public C16994k getMd5Bytes() {
            return C16994k.m16791k(this.md5_);
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMd5() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(CommentEmoticonInfo commentEmoticonInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(commentEmoticonInfo);
        }

        public static CommentEmoticonInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommentEmoticonInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommentEmoticonInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static CommentEmoticonInfo parseFrom(C16994k kVar) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CommentEmoticonInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static CommentEmoticonInfo parseFrom(byte[] bArr) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommentEmoticonInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static CommentEmoticonInfo parseFrom(InputStream inputStream) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommentEmoticonInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommentEmoticonInfo parseFrom(C23856l lVar) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CommentEmoticonInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (CommentEmoticonInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface CommentEmoticonInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDesc();

        C16994k getDescBytes();

        String getMd5();

        C16994k getMd5Bytes();

        boolean hasDesc();

        boolean hasMd5();

        /* synthetic */ boolean isInitialized();
    }

    public static final class CommentImageInfo extends C23861l0<CommentImageInfo, Builder> implements CommentImageInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final CommentImageInfo DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        private static volatile C24062w1<CommentImageInfo> PARSER = null;
        public static final int TOKEN_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 1;
        public static final int WIDTH_FIELD_NUMBER = 3;
        private int bitField0_;
        private int height_;
        private String token_ = "";
        private String url_ = "";
        private int width_;

        public static final class Builder extends C23861l0.C23862a<CommentImageInfo, Builder> implements CommentImageInfoOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((CommentImageInfo) this.instance).clearHeight();
                return this;
            }

            public Builder clearToken() {
                copyOnWrite();
                ((CommentImageInfo) this.instance).clearToken();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((CommentImageInfo) this.instance).clearUrl();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((CommentImageInfo) this.instance).clearWidth();
                return this;
            }

            public int getHeight() {
                return ((CommentImageInfo) this.instance).getHeight();
            }

            public String getToken() {
                return ((CommentImageInfo) this.instance).getToken();
            }

            public C16994k getTokenBytes() {
                return ((CommentImageInfo) this.instance).getTokenBytes();
            }

            public String getUrl() {
                return ((CommentImageInfo) this.instance).getUrl();
            }

            public C16994k getUrlBytes() {
                return ((CommentImageInfo) this.instance).getUrlBytes();
            }

            public int getWidth() {
                return ((CommentImageInfo) this.instance).getWidth();
            }

            public boolean hasHeight() {
                return ((CommentImageInfo) this.instance).hasHeight();
            }

            public boolean hasToken() {
                return ((CommentImageInfo) this.instance).hasToken();
            }

            public boolean hasUrl() {
                return ((CommentImageInfo) this.instance).hasUrl();
            }

            public boolean hasWidth() {
                return ((CommentImageInfo) this.instance).hasWidth();
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                ((CommentImageInfo) this.instance).setHeight(i);
                return this;
            }

            public Builder setToken(String str) {
                copyOnWrite();
                ((CommentImageInfo) this.instance).setToken(str);
                return this;
            }

            public Builder setTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((CommentImageInfo) this.instance).setTokenBytes(kVar);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((CommentImageInfo) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((CommentImageInfo) this.instance).setUrlBytes(kVar);
                return this;
            }

            public Builder setWidth(int i) {
                copyOnWrite();
                ((CommentImageInfo) this.instance).setWidth(i);
                return this;
            }

            private Builder() {
                super(CommentImageInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            CommentImageInfo commentImageInfo = new CommentImageInfo();
            DEFAULT_INSTANCE = commentImageInfo;
            C23861l0.registerDefaultInstance(CommentImageInfo.class, commentImageInfo);
        }

        private CommentImageInfo() {
        }

        /* access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -9;
            this.height_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearToken() {
            this.bitField0_ &= -3;
            this.token_ = getDefaultInstance().getToken();
        }

        /* access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -2;
            this.url_ = getDefaultInstance().getUrl();
        }

        /* access modifiers changed from: private */
        public void clearWidth() {
            this.bitField0_ &= -5;
            this.width_ = 0;
        }

        public static CommentImageInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CommentImageInfo parseDelimitedFrom(InputStream inputStream) {
            return (CommentImageInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommentImageInfo parseFrom(ByteBuffer byteBuffer) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<CommentImageInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setHeight(int i) {
            this.bitField0_ |= 8;
            this.height_ = i;
        }

        /* access modifiers changed from: private */
        public void setToken(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.token_ = str;
        }

        /* access modifiers changed from: private */
        public void setTokenBytes(C16994k kVar) {
            this.token_ = kVar.mo18752u();
            this.bitField0_ |= 2;
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
        public void setWidth(int i) {
            this.bitField0_ |= 4;
            this.width_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "url_", "token_", "width_", "height_"});
                case 3:
                    return new CommentImageInfo();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<CommentImageInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (CommentImageInfo.class) {
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

        public int getHeight() {
            return this.height_;
        }

        public String getToken() {
            return this.token_;
        }

        public C16994k getTokenBytes() {
            return C16994k.m16791k(this.token_);
        }

        public String getUrl() {
            return this.url_;
        }

        public C16994k getUrlBytes() {
            return C16994k.m16791k(this.url_);
        }

        public int getWidth() {
            return this.width_;
        }

        public boolean hasHeight() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasToken() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasWidth() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(CommentImageInfo commentImageInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(commentImageInfo);
        }

        public static CommentImageInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommentImageInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommentImageInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static CommentImageInfo parseFrom(C16994k kVar) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CommentImageInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static CommentImageInfo parseFrom(byte[] bArr) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommentImageInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static CommentImageInfo parseFrom(InputStream inputStream) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommentImageInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommentImageInfo parseFrom(C23856l lVar) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CommentImageInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (CommentImageInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface CommentImageInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getHeight();

        String getToken();

        C16994k getTokenBytes();

        String getUrl();

        C16994k getUrlBytes();

        int getWidth();

        boolean hasHeight();

        boolean hasToken();

        boolean hasUrl();

        boolean hasWidth();

        /* synthetic */ boolean isInitialized();
    }

    public static final class CommentVideoInfo extends C23861l0<CommentVideoInfo, Builder> implements CommentVideoInfoOrBuilder {
        public static final int COVER_TOKEN_FIELD_NUMBER = 4;
        public static final int COVER_URL_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final CommentVideoInfo DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 6;
        private static volatile C24062w1<CommentVideoInfo> PARSER = null;
        public static final int VIDEO_TOKEN_FIELD_NUMBER = 2;
        public static final int VIDEO_URL_FIELD_NUMBER = 1;
        public static final int WIDTH_FIELD_NUMBER = 5;
        private int bitField0_;
        private String coverToken_ = "";
        private String coverUrl_ = "";
        private int height_;
        private String videoToken_ = "";
        private String videoUrl_ = "";
        private int width_;

        public static final class Builder extends C23861l0.C23862a<CommentVideoInfo, Builder> implements CommentVideoInfoOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearCoverToken() {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).clearCoverToken();
                return this;
            }

            public Builder clearCoverUrl() {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).clearCoverUrl();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).clearHeight();
                return this;
            }

            public Builder clearVideoToken() {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).clearVideoToken();
                return this;
            }

            public Builder clearVideoUrl() {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).clearVideoUrl();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).clearWidth();
                return this;
            }

            public String getCoverToken() {
                return ((CommentVideoInfo) this.instance).getCoverToken();
            }

            public C16994k getCoverTokenBytes() {
                return ((CommentVideoInfo) this.instance).getCoverTokenBytes();
            }

            public String getCoverUrl() {
                return ((CommentVideoInfo) this.instance).getCoverUrl();
            }

            public C16994k getCoverUrlBytes() {
                return ((CommentVideoInfo) this.instance).getCoverUrlBytes();
            }

            public int getHeight() {
                return ((CommentVideoInfo) this.instance).getHeight();
            }

            public String getVideoToken() {
                return ((CommentVideoInfo) this.instance).getVideoToken();
            }

            public C16994k getVideoTokenBytes() {
                return ((CommentVideoInfo) this.instance).getVideoTokenBytes();
            }

            public String getVideoUrl() {
                return ((CommentVideoInfo) this.instance).getVideoUrl();
            }

            public C16994k getVideoUrlBytes() {
                return ((CommentVideoInfo) this.instance).getVideoUrlBytes();
            }

            public int getWidth() {
                return ((CommentVideoInfo) this.instance).getWidth();
            }

            public boolean hasCoverToken() {
                return ((CommentVideoInfo) this.instance).hasCoverToken();
            }

            public boolean hasCoverUrl() {
                return ((CommentVideoInfo) this.instance).hasCoverUrl();
            }

            public boolean hasHeight() {
                return ((CommentVideoInfo) this.instance).hasHeight();
            }

            public boolean hasVideoToken() {
                return ((CommentVideoInfo) this.instance).hasVideoToken();
            }

            public boolean hasVideoUrl() {
                return ((CommentVideoInfo) this.instance).hasVideoUrl();
            }

            public boolean hasWidth() {
                return ((CommentVideoInfo) this.instance).hasWidth();
            }

            public Builder setCoverToken(String str) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setCoverToken(str);
                return this;
            }

            public Builder setCoverTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setCoverTokenBytes(kVar);
                return this;
            }

            public Builder setCoverUrl(String str) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setCoverUrl(str);
                return this;
            }

            public Builder setCoverUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setCoverUrlBytes(kVar);
                return this;
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setHeight(i);
                return this;
            }

            public Builder setVideoToken(String str) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setVideoToken(str);
                return this;
            }

            public Builder setVideoTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setVideoTokenBytes(kVar);
                return this;
            }

            public Builder setVideoUrl(String str) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setVideoUrl(str);
                return this;
            }

            public Builder setVideoUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setVideoUrlBytes(kVar);
                return this;
            }

            public Builder setWidth(int i) {
                copyOnWrite();
                ((CommentVideoInfo) this.instance).setWidth(i);
                return this;
            }

            private Builder() {
                super(CommentVideoInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            CommentVideoInfo commentVideoInfo = new CommentVideoInfo();
            DEFAULT_INSTANCE = commentVideoInfo;
            C23861l0.registerDefaultInstance(CommentVideoInfo.class, commentVideoInfo);
        }

        private CommentVideoInfo() {
        }

        /* access modifiers changed from: private */
        public void clearCoverToken() {
            this.bitField0_ &= -9;
            this.coverToken_ = getDefaultInstance().getCoverToken();
        }

        /* access modifiers changed from: private */
        public void clearCoverUrl() {
            this.bitField0_ &= -5;
            this.coverUrl_ = getDefaultInstance().getCoverUrl();
        }

        /* access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -33;
            this.height_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVideoToken() {
            this.bitField0_ &= -3;
            this.videoToken_ = getDefaultInstance().getVideoToken();
        }

        /* access modifiers changed from: private */
        public void clearVideoUrl() {
            this.bitField0_ &= -2;
            this.videoUrl_ = getDefaultInstance().getVideoUrl();
        }

        /* access modifiers changed from: private */
        public void clearWidth() {
            this.bitField0_ &= -17;
            this.width_ = 0;
        }

        public static CommentVideoInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CommentVideoInfo parseDelimitedFrom(InputStream inputStream) {
            return (CommentVideoInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommentVideoInfo parseFrom(ByteBuffer byteBuffer) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<CommentVideoInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCoverToken(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.coverToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverTokenBytes(C16994k kVar) {
            this.coverToken_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setCoverUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.coverUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverUrlBytes(C16994k kVar) {
            this.coverUrl_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setHeight(int i) {
            this.bitField0_ |= 32;
            this.height_ = i;
        }

        /* access modifiers changed from: private */
        public void setVideoToken(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.videoToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setVideoTokenBytes(C16994k kVar) {
            this.videoToken_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setVideoUrl(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.videoUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setVideoUrlBytes(C16994k kVar) {
            this.videoUrl_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setWidth(int i) {
            this.bitField0_ |= 16;
            this.width_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "videoUrl_", "videoToken_", "coverUrl_", "coverToken_", "width_", "height_"});
                case 3:
                    return new CommentVideoInfo();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<CommentVideoInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (CommentVideoInfo.class) {
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

        public String getCoverToken() {
            return this.coverToken_;
        }

        public C16994k getCoverTokenBytes() {
            return C16994k.m16791k(this.coverToken_);
        }

        public String getCoverUrl() {
            return this.coverUrl_;
        }

        public C16994k getCoverUrlBytes() {
            return C16994k.m16791k(this.coverUrl_);
        }

        public int getHeight() {
            return this.height_;
        }

        public String getVideoToken() {
            return this.videoToken_;
        }

        public C16994k getVideoTokenBytes() {
            return C16994k.m16791k(this.videoToken_);
        }

        public String getVideoUrl() {
            return this.videoUrl_;
        }

        public C16994k getVideoUrlBytes() {
            return C16994k.m16791k(this.videoUrl_);
        }

        public int getWidth() {
            return this.width_;
        }

        public boolean hasCoverToken() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasCoverUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasHeight() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasVideoToken() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasVideoUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasWidth() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(CommentVideoInfo commentVideoInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(commentVideoInfo);
        }

        public static CommentVideoInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommentVideoInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommentVideoInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static CommentVideoInfo parseFrom(C16994k kVar) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CommentVideoInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static CommentVideoInfo parseFrom(byte[] bArr) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommentVideoInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static CommentVideoInfo parseFrom(InputStream inputStream) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommentVideoInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommentVideoInfo parseFrom(C23856l lVar) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CommentVideoInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (CommentVideoInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface CommentVideoInfoOrBuilder extends C23848k1 {
        String getCoverToken();

        C16994k getCoverTokenBytes();

        String getCoverUrl();

        C16994k getCoverUrlBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getHeight();

        String getVideoToken();

        C16994k getVideoTokenBytes();

        String getVideoUrl();

        C16994k getVideoUrlBytes();

        int getWidth();

        boolean hasCoverToken();

        boolean hasCoverUrl();

        boolean hasHeight();

        boolean hasVideoToken();

        boolean hasVideoUrl();

        boolean hasWidth();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderCommentMentionedUser extends C23861l0<FinderCommentMentionedUser, Builder> implements FinderCommentMentionedUserOrBuilder {
        /* access modifiers changed from: private */
        public static final FinderCommentMentionedUser DEFAULT_INSTANCE;
        public static final int MENTIONEDCLIBUF_FIELD_NUMBER = 1;
        private static volatile C24062w1<FinderCommentMentionedUser> PARSER = null;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private int bitField0_;
        private C16994k mentionedCliBuf_ = C16994k.f46000e;
        private String username_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderCommentMentionedUser, Builder> implements FinderCommentMentionedUserOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearMentionedCliBuf() {
                copyOnWrite();
                ((FinderCommentMentionedUser) this.instance).clearMentionedCliBuf();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((FinderCommentMentionedUser) this.instance).clearUsername();
                return this;
            }

            public C16994k getMentionedCliBuf() {
                return ((FinderCommentMentionedUser) this.instance).getMentionedCliBuf();
            }

            public String getUsername() {
                return ((FinderCommentMentionedUser) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((FinderCommentMentionedUser) this.instance).getUsernameBytes();
            }

            public boolean hasMentionedCliBuf() {
                return ((FinderCommentMentionedUser) this.instance).hasMentionedCliBuf();
            }

            public boolean hasUsername() {
                return ((FinderCommentMentionedUser) this.instance).hasUsername();
            }

            public Builder setMentionedCliBuf(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentMentionedUser) this.instance).setMentionedCliBuf(kVar);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((FinderCommentMentionedUser) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentMentionedUser) this.instance).setUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderCommentMentionedUser.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderCommentMentionedUser finderCommentMentionedUser = new FinderCommentMentionedUser();
            DEFAULT_INSTANCE = finderCommentMentionedUser;
            C23861l0.registerDefaultInstance(FinderCommentMentionedUser.class, finderCommentMentionedUser);
        }

        private FinderCommentMentionedUser() {
        }

        /* access modifiers changed from: private */
        public void clearMentionedCliBuf() {
            this.bitField0_ &= -2;
            this.mentionedCliBuf_ = getDefaultInstance().getMentionedCliBuf();
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -3;
            this.username_ = getDefaultInstance().getUsername();
        }

        public static FinderCommentMentionedUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderCommentMentionedUser parseDelimitedFrom(InputStream inputStream) {
            return (FinderCommentMentionedUser) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderCommentMentionedUser parseFrom(ByteBuffer byteBuffer) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderCommentMentionedUser> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMentionedCliBuf(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.mentionedCliBuf_ = kVar;
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
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "mentionedCliBuf_", "username_"});
                case 3:
                    return new FinderCommentMentionedUser();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderCommentMentionedUser> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderCommentMentionedUser.class) {
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

        public C16994k getMentionedCliBuf() {
            return this.mentionedCliBuf_;
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public boolean hasMentionedCliBuf() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderCommentMentionedUser finderCommentMentionedUser) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderCommentMentionedUser);
        }

        public static FinderCommentMentionedUser parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderCommentMentionedUser) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderCommentMentionedUser parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderCommentMentionedUser parseFrom(C16994k kVar) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderCommentMentionedUser parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderCommentMentionedUser parseFrom(byte[] bArr) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderCommentMentionedUser parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderCommentMentionedUser parseFrom(InputStream inputStream) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderCommentMentionedUser parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderCommentMentionedUser parseFrom(C23856l lVar) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderCommentMentionedUser parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderCommentMentionedUser) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderCommentMentionedUserOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getMentionedCliBuf();

        String getUsername();

        C16994k getUsernameBytes();

        boolean hasMentionedCliBuf();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderLikeRequest extends C23861l0<FinderLikeRequest, Builder> implements FinderLikeRequestOrBuilder {
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        public static final int COMMENTID_FIELD_NUMBER = 3;
        public static final int CURLIKECOUNT_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final FinderLikeRequest DEFAULT_INSTANCE;
        public static final int FINDERBASEREQUEST_FIELD_NUMBER = 10;
        public static final int ISPRIVATE_FIELD_NUMBER = 13;
        public static final int LIKEID_FIELD_NUMBER = 5;
        public static final int LIKEUSERNAME_FIELD_NUMBER = 12;
        public static final int OBJECTID_FIELD_NUMBER = 2;
        public static final int OBJECTNONCEID_FIELD_NUMBER = 9;
        public static final int OPTYPE_FIELD_NUMBER = 4;
        private static volatile C24062w1<FinderLikeRequest> PARSER = null;
        public static final int SCENE_FIELD_NUMBER = 8;
        public static final int SESSIONBUFFER_FIELD_NUMBER = 11;
        public static final int SOURCETYPE_FIELD_NUMBER = 16;
        public static final int USERNAME_FIELD_NUMBER = 7;
        public static final int VISIBILITYLABELIDLIST_FIELD_NUMBER = 15;
        public static final int VISIBILITYMODE_FIELD_NUMBER = 14;
        private MMBaseProto.BaseRequest baseRequest_;
        private int bitField0_;
        private long commentId_;
        private int curLikeCount_;
        private FinderProto.FinderBaseRequest finderBaseRequest_;
        private int isPrivate_;
        private long likeId_;
        private String likeUsername_ = "";
        private byte memoizedIsInitialized = 2;
        private long objectId_;
        private String objectNonceId_ = "";
        private int opType_;
        private int scene_;
        private String sessionBuffer_ = "";
        private int sourceType_;
        private String username_ = "";
        private C23908o0.C23915g visibilityLabelIdList_ = C23861l0.emptyIntList();
        private int visibilityMode_;

        public static final class Builder extends C23861l0.C23862a<FinderLikeRequest, Builder> implements FinderLikeRequestOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder addAllVisibilityLabelIdList(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).addAllVisibilityLabelIdList(iterable);
                return this;
            }

            public Builder addVisibilityLabelIdList(int i) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).addVisibilityLabelIdList(i);
                return this;
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearCommentId() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearCommentId();
                return this;
            }

            public Builder clearCurLikeCount() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearCurLikeCount();
                return this;
            }

            public Builder clearFinderBaseRequest() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearFinderBaseRequest();
                return this;
            }

            public Builder clearIsPrivate() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearIsPrivate();
                return this;
            }

            public Builder clearLikeId() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearLikeId();
                return this;
            }

            public Builder clearLikeUsername() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearLikeUsername();
                return this;
            }

            public Builder clearObjectId() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearObjectId();
                return this;
            }

            public Builder clearObjectNonceId() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearObjectNonceId();
                return this;
            }

            public Builder clearOpType() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearOpType();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearScene();
                return this;
            }

            public Builder clearSessionBuffer() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearSessionBuffer();
                return this;
            }

            public Builder clearSourceType() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearSourceType();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearUsername();
                return this;
            }

            public Builder clearVisibilityLabelIdList() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearVisibilityLabelIdList();
                return this;
            }

            public Builder clearVisibilityMode() {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).clearVisibilityMode();
                return this;
            }

            public MMBaseProto.BaseRequest getBaseRequest() {
                return ((FinderLikeRequest) this.instance).getBaseRequest();
            }

            public long getCommentId() {
                return ((FinderLikeRequest) this.instance).getCommentId();
            }

            public int getCurLikeCount() {
                return ((FinderLikeRequest) this.instance).getCurLikeCount();
            }

            public FinderProto.FinderBaseRequest getFinderBaseRequest() {
                return ((FinderLikeRequest) this.instance).getFinderBaseRequest();
            }

            public int getIsPrivate() {
                return ((FinderLikeRequest) this.instance).getIsPrivate();
            }

            public long getLikeId() {
                return ((FinderLikeRequest) this.instance).getLikeId();
            }

            public String getLikeUsername() {
                return ((FinderLikeRequest) this.instance).getLikeUsername();
            }

            public C16994k getLikeUsernameBytes() {
                return ((FinderLikeRequest) this.instance).getLikeUsernameBytes();
            }

            public long getObjectId() {
                return ((FinderLikeRequest) this.instance).getObjectId();
            }

            public String getObjectNonceId() {
                return ((FinderLikeRequest) this.instance).getObjectNonceId();
            }

            public C16994k getObjectNonceIdBytes() {
                return ((FinderLikeRequest) this.instance).getObjectNonceIdBytes();
            }

            public int getOpType() {
                return ((FinderLikeRequest) this.instance).getOpType();
            }

            public int getScene() {
                return ((FinderLikeRequest) this.instance).getScene();
            }

            public String getSessionBuffer() {
                return ((FinderLikeRequest) this.instance).getSessionBuffer();
            }

            public C16994k getSessionBufferBytes() {
                return ((FinderLikeRequest) this.instance).getSessionBufferBytes();
            }

            public int getSourceType() {
                return ((FinderLikeRequest) this.instance).getSourceType();
            }

            public String getUsername() {
                return ((FinderLikeRequest) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((FinderLikeRequest) this.instance).getUsernameBytes();
            }

            public int getVisibilityLabelIdList(int i) {
                return ((FinderLikeRequest) this.instance).getVisibilityLabelIdList(i);
            }

            public int getVisibilityLabelIdListCount() {
                return ((FinderLikeRequest) this.instance).getVisibilityLabelIdListCount();
            }

            public List<Integer> getVisibilityLabelIdListList() {
                return Collections.unmodifiableList(((FinderLikeRequest) this.instance).getVisibilityLabelIdListList());
            }

            public int getVisibilityMode() {
                return ((FinderLikeRequest) this.instance).getVisibilityMode();
            }

            public boolean hasBaseRequest() {
                return ((FinderLikeRequest) this.instance).hasBaseRequest();
            }

            public boolean hasCommentId() {
                return ((FinderLikeRequest) this.instance).hasCommentId();
            }

            public boolean hasCurLikeCount() {
                return ((FinderLikeRequest) this.instance).hasCurLikeCount();
            }

            public boolean hasFinderBaseRequest() {
                return ((FinderLikeRequest) this.instance).hasFinderBaseRequest();
            }

            public boolean hasIsPrivate() {
                return ((FinderLikeRequest) this.instance).hasIsPrivate();
            }

            public boolean hasLikeId() {
                return ((FinderLikeRequest) this.instance).hasLikeId();
            }

            public boolean hasLikeUsername() {
                return ((FinderLikeRequest) this.instance).hasLikeUsername();
            }

            public boolean hasObjectId() {
                return ((FinderLikeRequest) this.instance).hasObjectId();
            }

            public boolean hasObjectNonceId() {
                return ((FinderLikeRequest) this.instance).hasObjectNonceId();
            }

            public boolean hasOpType() {
                return ((FinderLikeRequest) this.instance).hasOpType();
            }

            public boolean hasScene() {
                return ((FinderLikeRequest) this.instance).hasScene();
            }

            public boolean hasSessionBuffer() {
                return ((FinderLikeRequest) this.instance).hasSessionBuffer();
            }

            public boolean hasSourceType() {
                return ((FinderLikeRequest) this.instance).hasSourceType();
            }

            public boolean hasUsername() {
                return ((FinderLikeRequest) this.instance).hasUsername();
            }

            public boolean hasVisibilityMode() {
                return ((FinderLikeRequest) this.instance).hasVisibilityMode();
            }

            public Builder mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder mergeFinderBaseRequest(FinderProto.FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).mergeFinderBaseRequest(finderBaseRequest);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setCommentId(long j) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setCommentId(j);
                return this;
            }

            public Builder setCurLikeCount(int i) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setCurLikeCount(i);
                return this;
            }

            public Builder setFinderBaseRequest(FinderProto.FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setFinderBaseRequest(finderBaseRequest);
                return this;
            }

            public Builder setIsPrivate(int i) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setIsPrivate(i);
                return this;
            }

            public Builder setLikeId(long j) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setLikeId(j);
                return this;
            }

            public Builder setLikeUsername(String str) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setLikeUsername(str);
                return this;
            }

            public Builder setLikeUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setLikeUsernameBytes(kVar);
                return this;
            }

            public Builder setObjectId(long j) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setObjectId(j);
                return this;
            }

            public Builder setObjectNonceId(String str) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setObjectNonceId(str);
                return this;
            }

            public Builder setObjectNonceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setObjectNonceIdBytes(kVar);
                return this;
            }

            public Builder setOpType(int i) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setOpType(i);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setScene(i);
                return this;
            }

            public Builder setSessionBuffer(String str) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setSessionBuffer(str);
                return this;
            }

            public Builder setSessionBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setSessionBufferBytes(kVar);
                return this;
            }

            public Builder setSourceType(int i) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setSourceType(i);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setUsernameBytes(kVar);
                return this;
            }

            public Builder setVisibilityLabelIdList(int i, int i2) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setVisibilityLabelIdList(i, i2);
                return this;
            }

            public Builder setVisibilityMode(int i) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setVisibilityMode(i);
                return this;
            }

            private Builder() {
                super(FinderLikeRequest.DEFAULT_INSTANCE);
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setBaseRequest((MMBaseProto.BaseRequest) builder.build());
                return this;
            }

            public Builder setFinderBaseRequest(FinderProto.FinderBaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderLikeRequest) this.instance).setFinderBaseRequest((FinderProto.FinderBaseRequest) builder.build());
                return this;
            }
        }

        static {
            FinderLikeRequest finderLikeRequest = new FinderLikeRequest();
            DEFAULT_INSTANCE = finderLikeRequest;
            C23861l0.registerDefaultInstance(FinderLikeRequest.class, finderLikeRequest);
        }

        private FinderLikeRequest() {
        }

        /* access modifiers changed from: private */
        public void addAllVisibilityLabelIdList(Iterable<? extends Integer> iterable) {
            ensureVisibilityLabelIdListIsMutable();
            C23810b.addAll(iterable, this.visibilityLabelIdList_);
        }

        /* access modifiers changed from: private */
        public void addVisibilityLabelIdList(int i) {
            ensureVisibilityLabelIdListIsMutable();
            ((C23901n0) this.visibilityLabelIdList_).mo37933h(i);
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearCommentId() {
            this.bitField0_ &= -5;
            this.commentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCurLikeCount() {
            this.bitField0_ &= -33;
            this.curLikeCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderBaseRequest() {
            this.finderBaseRequest_ = null;
            this.bitField0_ &= -513;
        }

        /* access modifiers changed from: private */
        public void clearIsPrivate() {
            this.bitField0_ &= -4097;
            this.isPrivate_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLikeId() {
            this.bitField0_ &= -17;
            this.likeId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLikeUsername() {
            this.bitField0_ &= -2049;
            this.likeUsername_ = getDefaultInstance().getLikeUsername();
        }

        /* access modifiers changed from: private */
        public void clearObjectId() {
            this.bitField0_ &= -3;
            this.objectId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearObjectNonceId() {
            this.bitField0_ &= -257;
            this.objectNonceId_ = getDefaultInstance().getObjectNonceId();
        }

        /* access modifiers changed from: private */
        public void clearOpType() {
            this.bitField0_ &= -9;
            this.opType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -129;
            this.scene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionBuffer() {
            this.bitField0_ &= -1025;
            this.sessionBuffer_ = getDefaultInstance().getSessionBuffer();
        }

        /* access modifiers changed from: private */
        public void clearSourceType() {
            this.bitField0_ &= -16385;
            this.sourceType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -65;
            this.username_ = getDefaultInstance().getUsername();
        }

        /* access modifiers changed from: private */
        public void clearVisibilityLabelIdList() {
            this.visibilityLabelIdList_ = C23861l0.emptyIntList();
        }

        /* access modifiers changed from: private */
        public void clearVisibilityMode() {
            this.bitField0_ &= -8193;
            this.visibilityMode_ = 0;
        }

        private void ensureVisibilityLabelIdListIsMutable() {
            C23908o0.C23915g gVar = this.visibilityLabelIdList_;
            if (!((C23817d) gVar).f68221d) {
                this.visibilityLabelIdList_ = C23861l0.mutableCopy(gVar);
            }
        }

        public static FinderLikeRequest getDefaultInstance() {
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
        public void mergeFinderBaseRequest(FinderProto.FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            FinderProto.FinderBaseRequest finderBaseRequest2 = this.finderBaseRequest_;
            if (finderBaseRequest2 == null || finderBaseRequest2 == FinderProto.FinderBaseRequest.getDefaultInstance()) {
                this.finderBaseRequest_ = finderBaseRequest;
            } else {
                this.finderBaseRequest_ = (FinderProto.FinderBaseRequest) ((FinderProto.FinderBaseRequest.Builder) FinderProto.FinderBaseRequest.newBuilder(this.finderBaseRequest_).mergeFrom(finderBaseRequest)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderLikeRequest parseDelimitedFrom(InputStream inputStream) {
            return (FinderLikeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLikeRequest parseFrom(ByteBuffer byteBuffer) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderLikeRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setCommentId(long j) {
            this.bitField0_ |= 4;
            this.commentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setCurLikeCount(int i) {
            this.bitField0_ |= 32;
            this.curLikeCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderBaseRequest(FinderProto.FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            this.finderBaseRequest_ = finderBaseRequest;
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setIsPrivate(int i) {
            this.bitField0_ |= 4096;
            this.isPrivate_ = i;
        }

        /* access modifiers changed from: private */
        public void setLikeId(long j) {
            this.bitField0_ |= 16;
            this.likeId_ = j;
        }

        /* access modifiers changed from: private */
        public void setLikeUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.likeUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setLikeUsernameBytes(C16994k kVar) {
            this.likeUsername_ = kVar.mo18752u();
            this.bitField0_ |= 2048;
        }

        /* access modifiers changed from: private */
        public void setObjectId(long j) {
            this.bitField0_ |= 2;
            this.objectId_ = j;
        }

        /* access modifiers changed from: private */
        public void setObjectNonceId(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.objectNonceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setObjectNonceIdBytes(C16994k kVar) {
            this.objectNonceId_ = kVar.mo18752u();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setOpType(int i) {
            this.bitField0_ |= 8;
            this.opType_ = i;
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 128;
            this.scene_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.sessionBuffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionBufferBytes(C16994k kVar) {
            this.sessionBuffer_ = kVar.mo18752u();
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setSourceType(int i) {
            this.bitField0_ |= 16384;
            this.sourceType_ = i;
        }

        /* access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.username_ = str;
        }

        /* access modifiers changed from: private */
        public void setUsernameBytes(C16994k kVar) {
            this.username_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setVisibilityLabelIdList(int i, int i2) {
            ensureVisibilityLabelIdListIsMutable();
            ((C23901n0) this.visibilityLabelIdList_).mo37939n(i, i2);
        }

        /* access modifiers changed from: private */
        public void setVisibilityMode(int i) {
            this.bitField0_ |= 8192;
            this.visibilityMode_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဋ\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ဈ\u0006\bဋ\u0007\tဈ\b\nဉ\t\u000bဈ\n\fဈ\u000b\rဋ\f\u000eဋ\r\u000f\u001d\u0010ဋ\u000e", new Object[]{"bitField0_", "baseRequest_", "objectId_", "commentId_", "opType_", "likeId_", "curLikeCount_", "username_", "scene_", "objectNonceId_", "finderBaseRequest_", "sessionBuffer_", "likeUsername_", "isPrivate_", "visibilityMode_", "visibilityLabelIdList_", "sourceType_"});
                case 3:
                    return new FinderLikeRequest();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderLikeRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderLikeRequest.class) {
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

        public long getCommentId() {
            return this.commentId_;
        }

        public int getCurLikeCount() {
            return this.curLikeCount_;
        }

        public FinderProto.FinderBaseRequest getFinderBaseRequest() {
            FinderProto.FinderBaseRequest finderBaseRequest = this.finderBaseRequest_;
            return finderBaseRequest == null ? FinderProto.FinderBaseRequest.getDefaultInstance() : finderBaseRequest;
        }

        public int getIsPrivate() {
            return this.isPrivate_;
        }

        public long getLikeId() {
            return this.likeId_;
        }

        public String getLikeUsername() {
            return this.likeUsername_;
        }

        public C16994k getLikeUsernameBytes() {
            return C16994k.m16791k(this.likeUsername_);
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

        public int getScene() {
            return this.scene_;
        }

        public String getSessionBuffer() {
            return this.sessionBuffer_;
        }

        public C16994k getSessionBufferBytes() {
            return C16994k.m16791k(this.sessionBuffer_);
        }

        public int getSourceType() {
            return this.sourceType_;
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public int getVisibilityLabelIdList(int i) {
            return ((C23901n0) this.visibilityLabelIdList_).mo37936k(i);
        }

        public int getVisibilityLabelIdListCount() {
            return ((C23901n0) this.visibilityLabelIdList_).f68498f;
        }

        public List<Integer> getVisibilityLabelIdListList() {
            return this.visibilityLabelIdList_;
        }

        public int getVisibilityMode() {
            return this.visibilityMode_;
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCommentId() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCurLikeCount() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasFinderBaseRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasIsPrivate() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasLikeId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLikeUsername() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasObjectId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasObjectNonceId() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasOpType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSessionBuffer() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSourceType() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasVisibilityMode() {
            return (this.bitField0_ & 8192) != 0;
        }

        public static Builder newBuilder(FinderLikeRequest finderLikeRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderLikeRequest);
        }

        public static FinderLikeRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLikeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLikeRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderLikeRequest parseFrom(C16994k kVar) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderLikeRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderLikeRequest parseFrom(byte[] bArr) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderLikeRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderLikeRequest parseFrom(InputStream inputStream) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLikeRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLikeRequest parseFrom(C23856l lVar) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderLikeRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderLikeRequestOrBuilder extends C23848k1 {
        MMBaseProto.BaseRequest getBaseRequest();

        long getCommentId();

        int getCurLikeCount();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FinderProto.FinderBaseRequest getFinderBaseRequest();

        int getIsPrivate();

        long getLikeId();

        String getLikeUsername();

        C16994k getLikeUsernameBytes();

        long getObjectId();

        String getObjectNonceId();

        C16994k getObjectNonceIdBytes();

        int getOpType();

        int getScene();

        String getSessionBuffer();

        C16994k getSessionBufferBytes();

        int getSourceType();

        String getUsername();

        C16994k getUsernameBytes();

        int getVisibilityLabelIdList(int i);

        int getVisibilityLabelIdListCount();

        List<Integer> getVisibilityLabelIdListList();

        int getVisibilityMode();

        boolean hasBaseRequest();

        boolean hasCommentId();

        boolean hasCurLikeCount();

        boolean hasFinderBaseRequest();

        boolean hasIsPrivate();

        boolean hasLikeId();

        boolean hasLikeUsername();

        boolean hasObjectId();

        boolean hasObjectNonceId();

        boolean hasOpType();

        boolean hasScene();

        boolean hasSessionBuffer();

        boolean hasSourceType();

        boolean hasUsername();

        boolean hasVisibilityMode();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderLikeResponse extends C23861l0<FinderLikeResponse, Builder> implements FinderLikeResponseOrBuilder {
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final FinderLikeResponse DEFAULT_INSTANCE;
        public static final int LIKEID_FIELD_NUMBER = 2;
        private static volatile C24062w1<FinderLikeResponse> PARSER;
        private MMBaseProto.BaseResponse baseResponse_;
        private int bitField0_;
        private long likeId_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<FinderLikeResponse, Builder> implements FinderLikeResponseOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((FinderLikeResponse) this.instance).clearBaseResponse();
                return this;
            }

            public Builder clearLikeId() {
                copyOnWrite();
                ((FinderLikeResponse) this.instance).clearLikeId();
                return this;
            }

            public MMBaseProto.BaseResponse getBaseResponse() {
                return ((FinderLikeResponse) this.instance).getBaseResponse();
            }

            public long getLikeId() {
                return ((FinderLikeResponse) this.instance).getLikeId();
            }

            public boolean hasBaseResponse() {
                return ((FinderLikeResponse) this.instance).hasBaseResponse();
            }

            public boolean hasLikeId() {
                return ((FinderLikeResponse) this.instance).hasLikeId();
            }

            public Builder mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderLikeResponse) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderLikeResponse) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            public Builder setLikeId(long j) {
                copyOnWrite();
                ((FinderLikeResponse) this.instance).setLikeId(j);
                return this;
            }

            private Builder() {
                super(FinderLikeResponse.DEFAULT_INSTANCE);
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse.Builder builder) {
                copyOnWrite();
                ((FinderLikeResponse) this.instance).setBaseResponse((MMBaseProto.BaseResponse) builder.build());
                return this;
            }
        }

        static {
            FinderLikeResponse finderLikeResponse = new FinderLikeResponse();
            DEFAULT_INSTANCE = finderLikeResponse;
            C23861l0.registerDefaultInstance(FinderLikeResponse.class, finderLikeResponse);
        }

        private FinderLikeResponse() {
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearLikeId() {
            this.bitField0_ &= -3;
            this.likeId_ = 0;
        }

        public static FinderLikeResponse getDefaultInstance() {
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

        public static FinderLikeResponse parseDelimitedFrom(InputStream inputStream) {
            return (FinderLikeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLikeResponse parseFrom(ByteBuffer byteBuffer) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderLikeResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setLikeId(long j) {
            this.bitField0_ |= 2;
            this.likeId_ = j;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔉ\u0000\u0002ဃ\u0001", new Object[]{"bitField0_", "baseResponse_", "likeId_"});
                case 3:
                    return new FinderLikeResponse();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderLikeResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderLikeResponse.class) {
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

        public long getLikeId() {
            return this.likeId_;
        }

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLikeId() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderLikeResponse finderLikeResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderLikeResponse);
        }

        public static FinderLikeResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLikeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLikeResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderLikeResponse parseFrom(C16994k kVar) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderLikeResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderLikeResponse parseFrom(byte[] bArr) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderLikeResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderLikeResponse parseFrom(InputStream inputStream) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLikeResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLikeResponse parseFrom(C23856l lVar) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderLikeResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderLikeResponseOrBuilder extends C23848k1 {
        MMBaseProto.BaseResponse getBaseResponse();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getLikeId();

        boolean hasBaseResponse();

        boolean hasLikeId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderUniCommentRequest extends C23861l0<FinderUniCommentRequest, Builder> implements FinderUniCommentRequestOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 4;
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        public static final int BYPASS_BUFFER_FIELD_NUMBER = 100;
        public static final int CLIENTID_FIELD_NUMBER = 3;
        public static final int COMMENT_CONTENT_FIELD_NUMBER = 8;
        public static final int COMMENT_ID_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final FinderUniCommentRequest DEFAULT_INSTANCE;
        public static final int ENTITY_ID_FIELD_NUMBER = 5;
        public static final int FINDER_BASEREQUEST_FIELD_NUMBER = 2;
        public static final int INTERACTION_IDENTITY_FIELD_NUMBER = 12;
        public static final int MENTIONED_USER_FIELD_NUMBER = 13;
        public static final int NONCE_ID_FIELD_NUMBER = 6;
        public static final int OPERATION_TYPE_FIELD_NUMBER = 11;
        private static volatile C24062w1<FinderUniCommentRequest> PARSER = null;
        public static final int REPLY_COMMENT_ID_FIELD_NUMBER = 10;
        public static final int ROOT_COMMENT_ID_FIELD_NUMBER = 9;
        private String appName_ = "";
        private MMBaseProto.BaseRequest baseRequest_;
        private int bitField0_;
        private C16994k bypassBuffer_ = C16994k.f46000e;
        private String clientid_ = "";
        private String commentContent_ = "";
        private long commentId_;
        private String entityId_ = "";
        private FinderProto.FinderBaseRequest finderBaserequest_;
        private int interactionIdentity_;
        private byte memoizedIsInitialized = 2;
        private C23908o0.C23919j<FinderCommentMentionedUser> mentionedUser_ = C23861l0.emptyProtobufList();
        private String nonceId_ = "";
        private int operationType_;
        private long replyCommentId_;
        private long rootCommentId_;

        public static final class Builder extends C23861l0.C23862a<FinderUniCommentRequest, Builder> implements FinderUniCommentRequestOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder addAllMentionedUser(Iterable<? extends FinderCommentMentionedUser> iterable) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).addAllMentionedUser(iterable);
                return this;
            }

            public Builder addMentionedUser(FinderCommentMentionedUser finderCommentMentionedUser) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).addMentionedUser(finderCommentMentionedUser);
                return this;
            }

            public Builder clearAppName() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearAppName();
                return this;
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearBypassBuffer() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearBypassBuffer();
                return this;
            }

            public Builder clearClientid() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearClientid();
                return this;
            }

            public Builder clearCommentContent() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearCommentContent();
                return this;
            }

            public Builder clearCommentId() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearCommentId();
                return this;
            }

            public Builder clearEntityId() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearEntityId();
                return this;
            }

            public Builder clearFinderBaserequest() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearFinderBaserequest();
                return this;
            }

            public Builder clearInteractionIdentity() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearInteractionIdentity();
                return this;
            }

            public Builder clearMentionedUser() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearMentionedUser();
                return this;
            }

            public Builder clearNonceId() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearNonceId();
                return this;
            }

            public Builder clearOperationType() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearOperationType();
                return this;
            }

            public Builder clearReplyCommentId() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearReplyCommentId();
                return this;
            }

            public Builder clearRootCommentId() {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).clearRootCommentId();
                return this;
            }

            public String getAppName() {
                return ((FinderUniCommentRequest) this.instance).getAppName();
            }

            public C16994k getAppNameBytes() {
                return ((FinderUniCommentRequest) this.instance).getAppNameBytes();
            }

            public MMBaseProto.BaseRequest getBaseRequest() {
                return ((FinderUniCommentRequest) this.instance).getBaseRequest();
            }

            public C16994k getBypassBuffer() {
                return ((FinderUniCommentRequest) this.instance).getBypassBuffer();
            }

            public String getClientid() {
                return ((FinderUniCommentRequest) this.instance).getClientid();
            }

            public C16994k getClientidBytes() {
                return ((FinderUniCommentRequest) this.instance).getClientidBytes();
            }

            public String getCommentContent() {
                return ((FinderUniCommentRequest) this.instance).getCommentContent();
            }

            public C16994k getCommentContentBytes() {
                return ((FinderUniCommentRequest) this.instance).getCommentContentBytes();
            }

            public long getCommentId() {
                return ((FinderUniCommentRequest) this.instance).getCommentId();
            }

            public String getEntityId() {
                return ((FinderUniCommentRequest) this.instance).getEntityId();
            }

            public C16994k getEntityIdBytes() {
                return ((FinderUniCommentRequest) this.instance).getEntityIdBytes();
            }

            public FinderProto.FinderBaseRequest getFinderBaserequest() {
                return ((FinderUniCommentRequest) this.instance).getFinderBaserequest();
            }

            public int getInteractionIdentity() {
                return ((FinderUniCommentRequest) this.instance).getInteractionIdentity();
            }

            public FinderCommentMentionedUser getMentionedUser(int i) {
                return ((FinderUniCommentRequest) this.instance).getMentionedUser(i);
            }

            public int getMentionedUserCount() {
                return ((FinderUniCommentRequest) this.instance).getMentionedUserCount();
            }

            public List<FinderCommentMentionedUser> getMentionedUserList() {
                return Collections.unmodifiableList(((FinderUniCommentRequest) this.instance).getMentionedUserList());
            }

            public String getNonceId() {
                return ((FinderUniCommentRequest) this.instance).getNonceId();
            }

            public C16994k getNonceIdBytes() {
                return ((FinderUniCommentRequest) this.instance).getNonceIdBytes();
            }

            public int getOperationType() {
                return ((FinderUniCommentRequest) this.instance).getOperationType();
            }

            public long getReplyCommentId() {
                return ((FinderUniCommentRequest) this.instance).getReplyCommentId();
            }

            public long getRootCommentId() {
                return ((FinderUniCommentRequest) this.instance).getRootCommentId();
            }

            public boolean hasAppName() {
                return ((FinderUniCommentRequest) this.instance).hasAppName();
            }

            public boolean hasBaseRequest() {
                return ((FinderUniCommentRequest) this.instance).hasBaseRequest();
            }

            public boolean hasBypassBuffer() {
                return ((FinderUniCommentRequest) this.instance).hasBypassBuffer();
            }

            public boolean hasClientid() {
                return ((FinderUniCommentRequest) this.instance).hasClientid();
            }

            public boolean hasCommentContent() {
                return ((FinderUniCommentRequest) this.instance).hasCommentContent();
            }

            public boolean hasCommentId() {
                return ((FinderUniCommentRequest) this.instance).hasCommentId();
            }

            public boolean hasEntityId() {
                return ((FinderUniCommentRequest) this.instance).hasEntityId();
            }

            public boolean hasFinderBaserequest() {
                return ((FinderUniCommentRequest) this.instance).hasFinderBaserequest();
            }

            public boolean hasInteractionIdentity() {
                return ((FinderUniCommentRequest) this.instance).hasInteractionIdentity();
            }

            public boolean hasNonceId() {
                return ((FinderUniCommentRequest) this.instance).hasNonceId();
            }

            public boolean hasOperationType() {
                return ((FinderUniCommentRequest) this.instance).hasOperationType();
            }

            public boolean hasReplyCommentId() {
                return ((FinderUniCommentRequest) this.instance).hasReplyCommentId();
            }

            public boolean hasRootCommentId() {
                return ((FinderUniCommentRequest) this.instance).hasRootCommentId();
            }

            public Builder mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder mergeFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).mergeFinderBaserequest(finderBaseRequest);
                return this;
            }

            public Builder removeMentionedUser(int i) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).removeMentionedUser(i);
                return this;
            }

            public Builder setAppName(String str) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setAppName(str);
                return this;
            }

            public Builder setAppNameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setAppNameBytes(kVar);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setBypassBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setBypassBuffer(kVar);
                return this;
            }

            public Builder setClientid(String str) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setClientid(str);
                return this;
            }

            public Builder setClientidBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setClientidBytes(kVar);
                return this;
            }

            public Builder setCommentContent(String str) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setCommentContent(str);
                return this;
            }

            public Builder setCommentContentBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setCommentContentBytes(kVar);
                return this;
            }

            public Builder setCommentId(long j) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setCommentId(j);
                return this;
            }

            public Builder setEntityId(String str) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setEntityId(str);
                return this;
            }

            public Builder setEntityIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setEntityIdBytes(kVar);
                return this;
            }

            public Builder setFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setFinderBaserequest(finderBaseRequest);
                return this;
            }

            public Builder setInteractionIdentity(int i) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setInteractionIdentity(i);
                return this;
            }

            public Builder setMentionedUser(int i, FinderCommentMentionedUser finderCommentMentionedUser) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setMentionedUser(i, finderCommentMentionedUser);
                return this;
            }

            public Builder setNonceId(String str) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setNonceId(str);
                return this;
            }

            public Builder setNonceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setNonceIdBytes(kVar);
                return this;
            }

            public Builder setOperationType(int i) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setOperationType(i);
                return this;
            }

            public Builder setReplyCommentId(long j) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setReplyCommentId(j);
                return this;
            }

            public Builder setRootCommentId(long j) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setRootCommentId(j);
                return this;
            }

            private Builder() {
                super(FinderUniCommentRequest.DEFAULT_INSTANCE);
            }

            public Builder addMentionedUser(int i, FinderCommentMentionedUser finderCommentMentionedUser) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).addMentionedUser(i, finderCommentMentionedUser);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setBaseRequest((MMBaseProto.BaseRequest) builder.build());
                return this;
            }

            public Builder setFinderBaserequest(FinderProto.FinderBaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setFinderBaserequest((FinderProto.FinderBaseRequest) builder.build());
                return this;
            }

            public Builder setMentionedUser(int i, FinderCommentMentionedUser.Builder builder) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).setMentionedUser(i, (FinderCommentMentionedUser) builder.build());
                return this;
            }

            public Builder addMentionedUser(FinderCommentMentionedUser.Builder builder) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).addMentionedUser((FinderCommentMentionedUser) builder.build());
                return this;
            }

            public Builder addMentionedUser(int i, FinderCommentMentionedUser.Builder builder) {
                copyOnWrite();
                ((FinderUniCommentRequest) this.instance).addMentionedUser(i, (FinderCommentMentionedUser) builder.build());
                return this;
            }
        }

        static {
            FinderUniCommentRequest finderUniCommentRequest = new FinderUniCommentRequest();
            DEFAULT_INSTANCE = finderUniCommentRequest;
            C23861l0.registerDefaultInstance(FinderUniCommentRequest.class, finderUniCommentRequest);
        }

        private FinderUniCommentRequest() {
        }

        /* access modifiers changed from: private */
        public void addAllMentionedUser(Iterable<? extends FinderCommentMentionedUser> iterable) {
            ensureMentionedUserIsMutable();
            C23810b.addAll(iterable, this.mentionedUser_);
        }

        /* access modifiers changed from: private */
        public void addMentionedUser(FinderCommentMentionedUser finderCommentMentionedUser) {
            finderCommentMentionedUser.getClass();
            ensureMentionedUserIsMutable();
            this.mentionedUser_.add(finderCommentMentionedUser);
        }

        /* access modifiers changed from: private */
        public void clearAppName() {
            this.bitField0_ &= -9;
            this.appName_ = getDefaultInstance().getAppName();
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearBypassBuffer() {
            this.bitField0_ &= -4097;
            this.bypassBuffer_ = getDefaultInstance().getBypassBuffer();
        }

        /* access modifiers changed from: private */
        public void clearClientid() {
            this.bitField0_ &= -5;
            this.clientid_ = getDefaultInstance().getClientid();
        }

        /* access modifiers changed from: private */
        public void clearCommentContent() {
            this.bitField0_ &= -129;
            this.commentContent_ = getDefaultInstance().getCommentContent();
        }

        /* access modifiers changed from: private */
        public void clearCommentId() {
            this.bitField0_ &= -65;
            this.commentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEntityId() {
            this.bitField0_ &= -17;
            this.entityId_ = getDefaultInstance().getEntityId();
        }

        /* access modifiers changed from: private */
        public void clearFinderBaserequest() {
            this.finderBaserequest_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearInteractionIdentity() {
            this.bitField0_ &= -2049;
            this.interactionIdentity_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMentionedUser() {
            this.mentionedUser_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearNonceId() {
            this.bitField0_ &= -33;
            this.nonceId_ = getDefaultInstance().getNonceId();
        }

        /* access modifiers changed from: private */
        public void clearOperationType() {
            this.bitField0_ &= -1025;
            this.operationType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReplyCommentId() {
            this.bitField0_ &= -513;
            this.replyCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRootCommentId() {
            this.bitField0_ &= -257;
            this.rootCommentId_ = 0;
        }

        private void ensureMentionedUserIsMutable() {
            C23908o0.C23919j<FinderCommentMentionedUser> jVar = this.mentionedUser_;
            if (!jVar.mo37523Q()) {
                this.mentionedUser_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderUniCommentRequest getDefaultInstance() {
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
        public void mergeFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            FinderProto.FinderBaseRequest finderBaseRequest2 = this.finderBaserequest_;
            if (finderBaseRequest2 == null || finderBaseRequest2 == FinderProto.FinderBaseRequest.getDefaultInstance()) {
                this.finderBaserequest_ = finderBaseRequest;
            } else {
                this.finderBaserequest_ = (FinderProto.FinderBaseRequest) ((FinderProto.FinderBaseRequest.Builder) FinderProto.FinderBaseRequest.newBuilder(this.finderBaserequest_).mergeFrom(finderBaseRequest)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderUniCommentRequest parseDelimitedFrom(InputStream inputStream) {
            return (FinderUniCommentRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniCommentRequest parseFrom(ByteBuffer byteBuffer) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderUniCommentRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeMentionedUser(int i) {
            ensureMentionedUserIsMutable();
            this.mentionedUser_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAppName(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.appName_ = str;
        }

        /* access modifiers changed from: private */
        public void setAppNameBytes(C16994k kVar) {
            this.appName_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setBypassBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4096;
            this.bypassBuffer_ = kVar;
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
        public void setCommentContent(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.commentContent_ = str;
        }

        /* access modifiers changed from: private */
        public void setCommentContentBytes(C16994k kVar) {
            this.commentContent_ = kVar.mo18752u();
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setCommentId(long j) {
            this.bitField0_ |= 64;
            this.commentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setEntityId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.entityId_ = str;
        }

        /* access modifiers changed from: private */
        public void setEntityIdBytes(C16994k kVar) {
            this.entityId_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            this.finderBaserequest_ = finderBaseRequest;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setInteractionIdentity(int i) {
            this.bitField0_ |= 2048;
            this.interactionIdentity_ = i;
        }

        /* access modifiers changed from: private */
        public void setMentionedUser(int i, FinderCommentMentionedUser finderCommentMentionedUser) {
            finderCommentMentionedUser.getClass();
            ensureMentionedUserIsMutable();
            this.mentionedUser_.set(i, finderCommentMentionedUser);
        }

        /* access modifiers changed from: private */
        public void setNonceId(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.nonceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setNonceIdBytes(C16994k kVar) {
            this.nonceId_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setOperationType(int i) {
            this.bitField0_ |= 1024;
            this.operationType_ = i;
        }

        /* access modifiers changed from: private */
        public void setReplyCommentId(long j) {
            this.bitField0_ |= 512;
            this.replyCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setRootCommentId(long j) {
            this.bitField0_ |= 256;
            this.rootCommentId_ = j;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001d\u000e\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဃ\u0006\bဈ\u0007\tဃ\b\nဃ\t\u000bဋ\n\fဋ\u000b\r\u001bdည\f", new Object[]{"bitField0_", "baseRequest_", "finderBaserequest_", "clientid_", "appName_", "entityId_", "nonceId_", "commentId_", "commentContent_", "rootCommentId_", "replyCommentId_", "operationType_", "interactionIdentity_", "mentionedUser_", FinderCommentMentionedUser.class, "bypassBuffer_"});
                case 3:
                    return new FinderUniCommentRequest();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderUniCommentRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderUniCommentRequest.class) {
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

        public String getAppName() {
            return this.appName_;
        }

        public C16994k getAppNameBytes() {
            return C16994k.m16791k(this.appName_);
        }

        public MMBaseProto.BaseRequest getBaseRequest() {
            MMBaseProto.BaseRequest baseRequest = this.baseRequest_;
            return baseRequest == null ? MMBaseProto.BaseRequest.getDefaultInstance() : baseRequest;
        }

        public C16994k getBypassBuffer() {
            return this.bypassBuffer_;
        }

        public String getClientid() {
            return this.clientid_;
        }

        public C16994k getClientidBytes() {
            return C16994k.m16791k(this.clientid_);
        }

        public String getCommentContent() {
            return this.commentContent_;
        }

        public C16994k getCommentContentBytes() {
            return C16994k.m16791k(this.commentContent_);
        }

        public long getCommentId() {
            return this.commentId_;
        }

        public String getEntityId() {
            return this.entityId_;
        }

        public C16994k getEntityIdBytes() {
            return C16994k.m16791k(this.entityId_);
        }

        public FinderProto.FinderBaseRequest getFinderBaserequest() {
            FinderProto.FinderBaseRequest finderBaseRequest = this.finderBaserequest_;
            return finderBaseRequest == null ? FinderProto.FinderBaseRequest.getDefaultInstance() : finderBaseRequest;
        }

        public int getInteractionIdentity() {
            return this.interactionIdentity_;
        }

        public FinderCommentMentionedUser getMentionedUser(int i) {
            return this.mentionedUser_.get(i);
        }

        public int getMentionedUserCount() {
            return this.mentionedUser_.size();
        }

        public List<FinderCommentMentionedUser> getMentionedUserList() {
            return this.mentionedUser_;
        }

        public FinderCommentMentionedUserOrBuilder getMentionedUserOrBuilder(int i) {
            return this.mentionedUser_.get(i);
        }

        public List<? extends FinderCommentMentionedUserOrBuilder> getMentionedUserOrBuilderList() {
            return this.mentionedUser_;
        }

        public String getNonceId() {
            return this.nonceId_;
        }

        public C16994k getNonceIdBytes() {
            return C16994k.m16791k(this.nonceId_);
        }

        public int getOperationType() {
            return this.operationType_;
        }

        public long getReplyCommentId() {
            return this.replyCommentId_;
        }

        public long getRootCommentId() {
            return this.rootCommentId_;
        }

        public boolean hasAppName() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasBypassBuffer() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasClientid() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCommentContent() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCommentId() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasEntityId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasFinderBaserequest() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasInteractionIdentity() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasNonceId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasOperationType() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasReplyCommentId() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasRootCommentId() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(FinderUniCommentRequest finderUniCommentRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderUniCommentRequest);
        }

        public static FinderUniCommentRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniCommentRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniCommentRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderUniCommentRequest parseFrom(C16994k kVar) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addMentionedUser(int i, FinderCommentMentionedUser finderCommentMentionedUser) {
            finderCommentMentionedUser.getClass();
            ensureMentionedUserIsMutable();
            this.mentionedUser_.add(i, finderCommentMentionedUser);
        }

        public static FinderUniCommentRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderUniCommentRequest parseFrom(byte[] bArr) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderUniCommentRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderUniCommentRequest parseFrom(InputStream inputStream) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniCommentRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniCommentRequest parseFrom(C23856l lVar) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderUniCommentRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderUniCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderUniCommentRequestOrBuilder extends C23848k1 {
        String getAppName();

        C16994k getAppNameBytes();

        MMBaseProto.BaseRequest getBaseRequest();

        C16994k getBypassBuffer();

        String getClientid();

        C16994k getClientidBytes();

        String getCommentContent();

        C16994k getCommentContentBytes();

        long getCommentId();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getEntityId();

        C16994k getEntityIdBytes();

        FinderProto.FinderBaseRequest getFinderBaserequest();

        int getInteractionIdentity();

        FinderCommentMentionedUser getMentionedUser(int i);

        int getMentionedUserCount();

        List<FinderCommentMentionedUser> getMentionedUserList();

        String getNonceId();

        C16994k getNonceIdBytes();

        int getOperationType();

        long getReplyCommentId();

        long getRootCommentId();

        boolean hasAppName();

        boolean hasBaseRequest();

        boolean hasBypassBuffer();

        boolean hasClientid();

        boolean hasCommentContent();

        boolean hasCommentId();

        boolean hasEntityId();

        boolean hasFinderBaserequest();

        boolean hasInteractionIdentity();

        boolean hasNonceId();

        boolean hasOperationType();

        boolean hasReplyCommentId();

        boolean hasRootCommentId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderUniCommentResponse extends C23861l0<FinderUniCommentResponse, Builder> implements FinderUniCommentResponseOrBuilder {
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        public static final int COMMENT_ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final FinderUniCommentResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<FinderUniCommentResponse> PARSER;
        private MMBaseProto.BaseResponse baseResponse_;
        private int bitField0_;
        private long commentId_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<FinderUniCommentResponse, Builder> implements FinderUniCommentResponseOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((FinderUniCommentResponse) this.instance).clearBaseResponse();
                return this;
            }

            public Builder clearCommentId() {
                copyOnWrite();
                ((FinderUniCommentResponse) this.instance).clearCommentId();
                return this;
            }

            public MMBaseProto.BaseResponse getBaseResponse() {
                return ((FinderUniCommentResponse) this.instance).getBaseResponse();
            }

            public long getCommentId() {
                return ((FinderUniCommentResponse) this.instance).getCommentId();
            }

            public boolean hasBaseResponse() {
                return ((FinderUniCommentResponse) this.instance).hasBaseResponse();
            }

            public boolean hasCommentId() {
                return ((FinderUniCommentResponse) this.instance).hasCommentId();
            }

            public Builder mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderUniCommentResponse) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderUniCommentResponse) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            public Builder setCommentId(long j) {
                copyOnWrite();
                ((FinderUniCommentResponse) this.instance).setCommentId(j);
                return this;
            }

            private Builder() {
                super(FinderUniCommentResponse.DEFAULT_INSTANCE);
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse.Builder builder) {
                copyOnWrite();
                ((FinderUniCommentResponse) this.instance).setBaseResponse((MMBaseProto.BaseResponse) builder.build());
                return this;
            }
        }

        static {
            FinderUniCommentResponse finderUniCommentResponse = new FinderUniCommentResponse();
            DEFAULT_INSTANCE = finderUniCommentResponse;
            C23861l0.registerDefaultInstance(FinderUniCommentResponse.class, finderUniCommentResponse);
        }

        private FinderUniCommentResponse() {
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearCommentId() {
            this.bitField0_ &= -3;
            this.commentId_ = 0;
        }

        public static FinderUniCommentResponse getDefaultInstance() {
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

        public static FinderUniCommentResponse parseDelimitedFrom(InputStream inputStream) {
            return (FinderUniCommentResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniCommentResponse parseFrom(ByteBuffer byteBuffer) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderUniCommentResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setCommentId(long j) {
            this.bitField0_ |= 2;
            this.commentId_ = j;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔉ\u0000\u0002ဃ\u0001", new Object[]{"bitField0_", "baseResponse_", "commentId_"});
                case 3:
                    return new FinderUniCommentResponse();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderUniCommentResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderUniCommentResponse.class) {
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

        public long getCommentId() {
            return this.commentId_;
        }

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCommentId() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderUniCommentResponse finderUniCommentResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderUniCommentResponse);
        }

        public static FinderUniCommentResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniCommentResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniCommentResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderUniCommentResponse parseFrom(C16994k kVar) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderUniCommentResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderUniCommentResponse parseFrom(byte[] bArr) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderUniCommentResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderUniCommentResponse parseFrom(InputStream inputStream) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniCommentResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniCommentResponse parseFrom(C23856l lVar) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderUniCommentResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderUniCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderUniCommentResponseOrBuilder extends C23848k1 {
        MMBaseProto.BaseResponse getBaseResponse();

        long getCommentId();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBaseResponse();

        boolean hasCommentId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderUniGetCommentRequest extends C23861l0<FinderUniGetCommentRequest, Builder> implements FinderUniGetCommentRequestOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 3;
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        public static final int COMMENT_ID_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final FinderUniGetCommentRequest DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 9;
        public static final int ENTITY_ID_FIELD_NUMBER = 4;
        public static final int FINDER_BASEREQUEST_FIELD_NUMBER = 2;
        public static final int INTERACTION_IDENTITY_FIELD_NUMBER = 10;
        public static final int LAST_BUFFER_FIELD_NUMBER = 100;
        public static final int MAX_COMMENT_ID_FIELD_NUMBER = 8;
        private static volatile C24062w1<FinderUniGetCommentRequest> PARSER = null;
        public static final int PULL_SCENE_FIELD_NUMBER = 11;
        public static final int REF_COMMENT_ID_FIELD_NUMBER = 7;
        public static final int ROOT_COMMENT_ID_FIELD_NUMBER = 6;
        private String appName_ = "";
        private MMBaseProto.BaseRequest baseRequest_;
        private int bitField0_;
        private long commentId_;
        private int direction_;
        private String entityId_ = "";
        private FinderProto.FinderBaseRequest finderBaserequest_;
        private int interactionIdentity_;
        private C16994k lastBuffer_ = C16994k.f46000e;
        private long maxCommentId_;
        private byte memoizedIsInitialized = 2;
        private int pullScene_;
        private long refCommentId_;
        private long rootCommentId_;

        public static final class Builder extends C23861l0.C23862a<FinderUniGetCommentRequest, Builder> implements FinderUniGetCommentRequestOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearAppName() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearAppName();
                return this;
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearCommentId() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearCommentId();
                return this;
            }

            public Builder clearDirection() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearDirection();
                return this;
            }

            public Builder clearEntityId() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearEntityId();
                return this;
            }

            public Builder clearFinderBaserequest() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearFinderBaserequest();
                return this;
            }

            public Builder clearInteractionIdentity() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearInteractionIdentity();
                return this;
            }

            public Builder clearLastBuffer() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearLastBuffer();
                return this;
            }

            public Builder clearMaxCommentId() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearMaxCommentId();
                return this;
            }

            public Builder clearPullScene() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearPullScene();
                return this;
            }

            public Builder clearRefCommentId() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearRefCommentId();
                return this;
            }

            public Builder clearRootCommentId() {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).clearRootCommentId();
                return this;
            }

            public String getAppName() {
                return ((FinderUniGetCommentRequest) this.instance).getAppName();
            }

            public C16994k getAppNameBytes() {
                return ((FinderUniGetCommentRequest) this.instance).getAppNameBytes();
            }

            public MMBaseProto.BaseRequest getBaseRequest() {
                return ((FinderUniGetCommentRequest) this.instance).getBaseRequest();
            }

            public long getCommentId() {
                return ((FinderUniGetCommentRequest) this.instance).getCommentId();
            }

            public int getDirection() {
                return ((FinderUniGetCommentRequest) this.instance).getDirection();
            }

            public String getEntityId() {
                return ((FinderUniGetCommentRequest) this.instance).getEntityId();
            }

            public C16994k getEntityIdBytes() {
                return ((FinderUniGetCommentRequest) this.instance).getEntityIdBytes();
            }

            public FinderProto.FinderBaseRequest getFinderBaserequest() {
                return ((FinderUniGetCommentRequest) this.instance).getFinderBaserequest();
            }

            public int getInteractionIdentity() {
                return ((FinderUniGetCommentRequest) this.instance).getInteractionIdentity();
            }

            public C16994k getLastBuffer() {
                return ((FinderUniGetCommentRequest) this.instance).getLastBuffer();
            }

            public long getMaxCommentId() {
                return ((FinderUniGetCommentRequest) this.instance).getMaxCommentId();
            }

            public int getPullScene() {
                return ((FinderUniGetCommentRequest) this.instance).getPullScene();
            }

            public long getRefCommentId() {
                return ((FinderUniGetCommentRequest) this.instance).getRefCommentId();
            }

            public long getRootCommentId() {
                return ((FinderUniGetCommentRequest) this.instance).getRootCommentId();
            }

            public boolean hasAppName() {
                return ((FinderUniGetCommentRequest) this.instance).hasAppName();
            }

            public boolean hasBaseRequest() {
                return ((FinderUniGetCommentRequest) this.instance).hasBaseRequest();
            }

            public boolean hasCommentId() {
                return ((FinderUniGetCommentRequest) this.instance).hasCommentId();
            }

            public boolean hasDirection() {
                return ((FinderUniGetCommentRequest) this.instance).hasDirection();
            }

            public boolean hasEntityId() {
                return ((FinderUniGetCommentRequest) this.instance).hasEntityId();
            }

            public boolean hasFinderBaserequest() {
                return ((FinderUniGetCommentRequest) this.instance).hasFinderBaserequest();
            }

            public boolean hasInteractionIdentity() {
                return ((FinderUniGetCommentRequest) this.instance).hasInteractionIdentity();
            }

            public boolean hasLastBuffer() {
                return ((FinderUniGetCommentRequest) this.instance).hasLastBuffer();
            }

            public boolean hasMaxCommentId() {
                return ((FinderUniGetCommentRequest) this.instance).hasMaxCommentId();
            }

            public boolean hasPullScene() {
                return ((FinderUniGetCommentRequest) this.instance).hasPullScene();
            }

            public boolean hasRefCommentId() {
                return ((FinderUniGetCommentRequest) this.instance).hasRefCommentId();
            }

            public boolean hasRootCommentId() {
                return ((FinderUniGetCommentRequest) this.instance).hasRootCommentId();
            }

            public Builder mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder mergeFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).mergeFinderBaserequest(finderBaseRequest);
                return this;
            }

            public Builder setAppName(String str) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setAppName(str);
                return this;
            }

            public Builder setAppNameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setAppNameBytes(kVar);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setCommentId(long j) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setCommentId(j);
                return this;
            }

            public Builder setDirection(int i) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setDirection(i);
                return this;
            }

            public Builder setEntityId(String str) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setEntityId(str);
                return this;
            }

            public Builder setEntityIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setEntityIdBytes(kVar);
                return this;
            }

            public Builder setFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setFinderBaserequest(finderBaseRequest);
                return this;
            }

            public Builder setInteractionIdentity(int i) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setInteractionIdentity(i);
                return this;
            }

            public Builder setLastBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setLastBuffer(kVar);
                return this;
            }

            public Builder setMaxCommentId(long j) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setMaxCommentId(j);
                return this;
            }

            public Builder setPullScene(int i) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setPullScene(i);
                return this;
            }

            public Builder setRefCommentId(long j) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setRefCommentId(j);
                return this;
            }

            public Builder setRootCommentId(long j) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setRootCommentId(j);
                return this;
            }

            private Builder() {
                super(FinderUniGetCommentRequest.DEFAULT_INSTANCE);
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setBaseRequest((MMBaseProto.BaseRequest) builder.build());
                return this;
            }

            public Builder setFinderBaserequest(FinderProto.FinderBaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderUniGetCommentRequest) this.instance).setFinderBaserequest((FinderProto.FinderBaseRequest) builder.build());
                return this;
            }
        }

        static {
            FinderUniGetCommentRequest finderUniGetCommentRequest = new FinderUniGetCommentRequest();
            DEFAULT_INSTANCE = finderUniGetCommentRequest;
            C23861l0.registerDefaultInstance(FinderUniGetCommentRequest.class, finderUniGetCommentRequest);
        }

        private FinderUniGetCommentRequest() {
        }

        /* access modifiers changed from: private */
        public void clearAppName() {
            this.bitField0_ &= -5;
            this.appName_ = getDefaultInstance().getAppName();
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearCommentId() {
            this.bitField0_ &= -17;
            this.commentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDirection() {
            this.bitField0_ &= -257;
            this.direction_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEntityId() {
            this.bitField0_ &= -9;
            this.entityId_ = getDefaultInstance().getEntityId();
        }

        /* access modifiers changed from: private */
        public void clearFinderBaserequest() {
            this.finderBaserequest_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearInteractionIdentity() {
            this.bitField0_ &= -513;
            this.interactionIdentity_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLastBuffer() {
            this.bitField0_ &= -2049;
            this.lastBuffer_ = getDefaultInstance().getLastBuffer();
        }

        /* access modifiers changed from: private */
        public void clearMaxCommentId() {
            this.bitField0_ &= -129;
            this.maxCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPullScene() {
            this.bitField0_ &= -1025;
            this.pullScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRefCommentId() {
            this.bitField0_ &= -65;
            this.refCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRootCommentId() {
            this.bitField0_ &= -33;
            this.rootCommentId_ = 0;
        }

        public static FinderUniGetCommentRequest getDefaultInstance() {
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
        public void mergeFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            FinderProto.FinderBaseRequest finderBaseRequest2 = this.finderBaserequest_;
            if (finderBaseRequest2 == null || finderBaseRequest2 == FinderProto.FinderBaseRequest.getDefaultInstance()) {
                this.finderBaserequest_ = finderBaseRequest;
            } else {
                this.finderBaserequest_ = (FinderProto.FinderBaseRequest) ((FinderProto.FinderBaseRequest.Builder) FinderProto.FinderBaseRequest.newBuilder(this.finderBaserequest_).mergeFrom(finderBaseRequest)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderUniGetCommentRequest parseDelimitedFrom(InputStream inputStream) {
            return (FinderUniGetCommentRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniGetCommentRequest parseFrom(ByteBuffer byteBuffer) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderUniGetCommentRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.appName_ = str;
        }

        /* access modifiers changed from: private */
        public void setAppNameBytes(C16994k kVar) {
            this.appName_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setCommentId(long j) {
            this.bitField0_ |= 16;
            this.commentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setDirection(int i) {
            this.bitField0_ |= 256;
            this.direction_ = i;
        }

        /* access modifiers changed from: private */
        public void setEntityId(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.entityId_ = str;
        }

        /* access modifiers changed from: private */
        public void setEntityIdBytes(C16994k kVar) {
            this.entityId_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            this.finderBaserequest_ = finderBaseRequest;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setInteractionIdentity(int i) {
            this.bitField0_ |= 512;
            this.interactionIdentity_ = i;
        }

        /* access modifiers changed from: private */
        public void setLastBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2048;
            this.lastBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setMaxCommentId(long j) {
            this.bitField0_ |= 128;
            this.maxCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setPullScene(int i) {
            this.bitField0_ |= 1024;
            this.pullScene_ = i;
        }

        /* access modifiers changed from: private */
        public void setRefCommentId(long j) {
            this.bitField0_ |= 64;
            this.refCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setRootCommentId(long j) {
            this.bitField0_ |= 32;
            this.rootCommentId_ = j;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001d\f\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဃ\u0004\u0006ဃ\u0005\u0007ဃ\u0006\bဃ\u0007\tဋ\b\nဋ\t\u000bဋ\ndည\u000b", new Object[]{"bitField0_", "baseRequest_", "finderBaserequest_", "appName_", "entityId_", "commentId_", "rootCommentId_", "refCommentId_", "maxCommentId_", "direction_", "interactionIdentity_", "pullScene_", "lastBuffer_"});
                case 3:
                    return new FinderUniGetCommentRequest();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderUniGetCommentRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderUniGetCommentRequest.class) {
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

        public String getAppName() {
            return this.appName_;
        }

        public C16994k getAppNameBytes() {
            return C16994k.m16791k(this.appName_);
        }

        public MMBaseProto.BaseRequest getBaseRequest() {
            MMBaseProto.BaseRequest baseRequest = this.baseRequest_;
            return baseRequest == null ? MMBaseProto.BaseRequest.getDefaultInstance() : baseRequest;
        }

        public long getCommentId() {
            return this.commentId_;
        }

        public int getDirection() {
            return this.direction_;
        }

        public String getEntityId() {
            return this.entityId_;
        }

        public C16994k getEntityIdBytes() {
            return C16994k.m16791k(this.entityId_);
        }

        public FinderProto.FinderBaseRequest getFinderBaserequest() {
            FinderProto.FinderBaseRequest finderBaseRequest = this.finderBaserequest_;
            return finderBaseRequest == null ? FinderProto.FinderBaseRequest.getDefaultInstance() : finderBaseRequest;
        }

        public int getInteractionIdentity() {
            return this.interactionIdentity_;
        }

        public C16994k getLastBuffer() {
            return this.lastBuffer_;
        }

        public long getMaxCommentId() {
            return this.maxCommentId_;
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

        public boolean hasAppName() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCommentId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDirection() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasEntityId() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFinderBaserequest() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasInteractionIdentity() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasLastBuffer() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasMaxCommentId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasPullScene() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasRefCommentId() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasRootCommentId() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(FinderUniGetCommentRequest finderUniGetCommentRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderUniGetCommentRequest);
        }

        public static FinderUniGetCommentRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniGetCommentRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniGetCommentRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderUniGetCommentRequest parseFrom(C16994k kVar) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderUniGetCommentRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderUniGetCommentRequest parseFrom(byte[] bArr) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderUniGetCommentRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderUniGetCommentRequest parseFrom(InputStream inputStream) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniGetCommentRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniGetCommentRequest parseFrom(C23856l lVar) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderUniGetCommentRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderUniGetCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderUniGetCommentRequestOrBuilder extends C23848k1 {
        String getAppName();

        C16994k getAppNameBytes();

        MMBaseProto.BaseRequest getBaseRequest();

        long getCommentId();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDirection();

        String getEntityId();

        C16994k getEntityIdBytes();

        FinderProto.FinderBaseRequest getFinderBaserequest();

        int getInteractionIdentity();

        C16994k getLastBuffer();

        long getMaxCommentId();

        int getPullScene();

        long getRefCommentId();

        long getRootCommentId();

        boolean hasAppName();

        boolean hasBaseRequest();

        boolean hasCommentId();

        boolean hasDirection();

        boolean hasEntityId();

        boolean hasFinderBaserequest();

        boolean hasInteractionIdentity();

        boolean hasLastBuffer();

        boolean hasMaxCommentId();

        boolean hasPullScene();

        boolean hasRefCommentId();

        boolean hasRootCommentId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderUniGetCommentResponse extends C23861l0<FinderUniGetCommentResponse, Builder> implements FinderUniGetCommentResponseOrBuilder {
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        public static final int COMMENT_INFO_FIELD_NUMBER = 2;
        public static final int COMMENT_TOTALCOUNT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final FinderUniGetCommentResponse DEFAULT_INSTANCE;
        public static final int DOWN_CONTINUE_FLAG_FIELD_NUMBER = 5;
        public static final int LAST_BUFFER_FIELD_NUMBER = 100;
        private static volatile C24062w1<FinderUniGetCommentResponse> PARSER = null;
        public static final int UP_CONTINUE_FLAG_FIELD_NUMBER = 4;
        private MMBaseProto.BaseResponse baseResponse_;
        private int bitField0_;
        private C23908o0.C23919j<FinderProto.FinderCommentInfo> commentInfo_ = C23861l0.emptyProtobufList();
        private int commentTotalcount_;
        private int downContinueFlag_;
        private C16994k lastBuffer_ = C16994k.f46000e;
        private byte memoizedIsInitialized = 2;
        private int upContinueFlag_;

        public static final class Builder extends C23861l0.C23862a<FinderUniGetCommentResponse, Builder> implements FinderUniGetCommentResponseOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder addAllCommentInfo(Iterable<? extends FinderProto.FinderCommentInfo> iterable) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).addAllCommentInfo(iterable);
                return this;
            }

            public Builder addCommentInfo(FinderProto.FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).addCommentInfo(finderCommentInfo);
                return this;
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).clearBaseResponse();
                return this;
            }

            public Builder clearCommentInfo() {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).clearCommentInfo();
                return this;
            }

            public Builder clearCommentTotalcount() {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).clearCommentTotalcount();
                return this;
            }

            public Builder clearDownContinueFlag() {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).clearDownContinueFlag();
                return this;
            }

            public Builder clearLastBuffer() {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).clearLastBuffer();
                return this;
            }

            public Builder clearUpContinueFlag() {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).clearUpContinueFlag();
                return this;
            }

            public MMBaseProto.BaseResponse getBaseResponse() {
                return ((FinderUniGetCommentResponse) this.instance).getBaseResponse();
            }

            public FinderProto.FinderCommentInfo getCommentInfo(int i) {
                return ((FinderUniGetCommentResponse) this.instance).getCommentInfo(i);
            }

            public int getCommentInfoCount() {
                return ((FinderUniGetCommentResponse) this.instance).getCommentInfoCount();
            }

            public List<FinderProto.FinderCommentInfo> getCommentInfoList() {
                return Collections.unmodifiableList(((FinderUniGetCommentResponse) this.instance).getCommentInfoList());
            }

            public int getCommentTotalcount() {
                return ((FinderUniGetCommentResponse) this.instance).getCommentTotalcount();
            }

            public int getDownContinueFlag() {
                return ((FinderUniGetCommentResponse) this.instance).getDownContinueFlag();
            }

            public C16994k getLastBuffer() {
                return ((FinderUniGetCommentResponse) this.instance).getLastBuffer();
            }

            public int getUpContinueFlag() {
                return ((FinderUniGetCommentResponse) this.instance).getUpContinueFlag();
            }

            public boolean hasBaseResponse() {
                return ((FinderUniGetCommentResponse) this.instance).hasBaseResponse();
            }

            public boolean hasCommentTotalcount() {
                return ((FinderUniGetCommentResponse) this.instance).hasCommentTotalcount();
            }

            public boolean hasDownContinueFlag() {
                return ((FinderUniGetCommentResponse) this.instance).hasDownContinueFlag();
            }

            public boolean hasLastBuffer() {
                return ((FinderUniGetCommentResponse) this.instance).hasLastBuffer();
            }

            public boolean hasUpContinueFlag() {
                return ((FinderUniGetCommentResponse) this.instance).hasUpContinueFlag();
            }

            public Builder mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder removeCommentInfo(int i) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).removeCommentInfo(i);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            public Builder setCommentInfo(int i, FinderProto.FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).setCommentInfo(i, finderCommentInfo);
                return this;
            }

            public Builder setCommentTotalcount(int i) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).setCommentTotalcount(i);
                return this;
            }

            public Builder setDownContinueFlag(int i) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).setDownContinueFlag(i);
                return this;
            }

            public Builder setLastBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).setLastBuffer(kVar);
                return this;
            }

            public Builder setUpContinueFlag(int i) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).setUpContinueFlag(i);
                return this;
            }

            private Builder() {
                super(FinderUniGetCommentResponse.DEFAULT_INSTANCE);
            }

            public Builder addCommentInfo(int i, FinderProto.FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).addCommentInfo(i, finderCommentInfo);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse.Builder builder) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).setBaseResponse((MMBaseProto.BaseResponse) builder.build());
                return this;
            }

            public Builder setCommentInfo(int i, FinderProto.FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).setCommentInfo(i, (FinderProto.FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addCommentInfo(FinderProto.FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).addCommentInfo((FinderProto.FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addCommentInfo(int i, FinderProto.FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderUniGetCommentResponse) this.instance).addCommentInfo(i, (FinderProto.FinderCommentInfo) builder.build());
                return this;
            }
        }

        static {
            FinderUniGetCommentResponse finderUniGetCommentResponse = new FinderUniGetCommentResponse();
            DEFAULT_INSTANCE = finderUniGetCommentResponse;
            C23861l0.registerDefaultInstance(FinderUniGetCommentResponse.class, finderUniGetCommentResponse);
        }

        private FinderUniGetCommentResponse() {
        }

        /* access modifiers changed from: private */
        public void addAllCommentInfo(Iterable<? extends FinderProto.FinderCommentInfo> iterable) {
            ensureCommentInfoIsMutable();
            C23810b.addAll(iterable, this.commentInfo_);
        }

        /* access modifiers changed from: private */
        public void addCommentInfo(FinderProto.FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureCommentInfoIsMutable();
            this.commentInfo_.add(finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearCommentInfo() {
            this.commentInfo_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearCommentTotalcount() {
            this.bitField0_ &= -3;
            this.commentTotalcount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDownContinueFlag() {
            this.bitField0_ &= -9;
            this.downContinueFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLastBuffer() {
            this.bitField0_ &= -17;
            this.lastBuffer_ = getDefaultInstance().getLastBuffer();
        }

        /* access modifiers changed from: private */
        public void clearUpContinueFlag() {
            this.bitField0_ &= -5;
            this.upContinueFlag_ = 0;
        }

        private void ensureCommentInfoIsMutable() {
            C23908o0.C23919j<FinderProto.FinderCommentInfo> jVar = this.commentInfo_;
            if (!jVar.mo37523Q()) {
                this.commentInfo_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderUniGetCommentResponse getDefaultInstance() {
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

        public static FinderUniGetCommentResponse parseDelimitedFrom(InputStream inputStream) {
            return (FinderUniGetCommentResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniGetCommentResponse parseFrom(ByteBuffer byteBuffer) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderUniGetCommentResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeCommentInfo(int i) {
            ensureCommentInfoIsMutable();
            this.commentInfo_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setCommentInfo(int i, FinderProto.FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureCommentInfoIsMutable();
            this.commentInfo_.set(i, finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void setCommentTotalcount(int i) {
            this.bitField0_ |= 2;
            this.commentTotalcount_ = i;
        }

        /* access modifiers changed from: private */
        public void setDownContinueFlag(int i) {
            this.bitField0_ |= 8;
            this.downContinueFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setLastBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.lastBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setUpContinueFlag(int i) {
            this.bitField0_ |= 4;
            this.upContinueFlag_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001d\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဋ\u0001\u0004ဋ\u0002\u0005ဋ\u0003dည\u0004", new Object[]{"bitField0_", "baseResponse_", "commentInfo_", FinderProto.FinderCommentInfo.class, "commentTotalcount_", "upContinueFlag_", "downContinueFlag_", "lastBuffer_"});
                case 3:
                    return new FinderUniGetCommentResponse();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderUniGetCommentResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderUniGetCommentResponse.class) {
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

        public FinderProto.FinderCommentInfo getCommentInfo(int i) {
            return this.commentInfo_.get(i);
        }

        public int getCommentInfoCount() {
            return this.commentInfo_.size();
        }

        public List<FinderProto.FinderCommentInfo> getCommentInfoList() {
            return this.commentInfo_;
        }

        public FinderProto.FinderCommentInfoOrBuilder getCommentInfoOrBuilder(int i) {
            return this.commentInfo_.get(i);
        }

        public List<? extends FinderProto.FinderCommentInfoOrBuilder> getCommentInfoOrBuilderList() {
            return this.commentInfo_;
        }

        public int getCommentTotalcount() {
            return this.commentTotalcount_;
        }

        public int getDownContinueFlag() {
            return this.downContinueFlag_;
        }

        public C16994k getLastBuffer() {
            return this.lastBuffer_;
        }

        public int getUpContinueFlag() {
            return this.upContinueFlag_;
        }

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCommentTotalcount() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasDownContinueFlag() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasLastBuffer() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasUpContinueFlag() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(FinderUniGetCommentResponse finderUniGetCommentResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderUniGetCommentResponse);
        }

        public static FinderUniGetCommentResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniGetCommentResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniGetCommentResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderUniGetCommentResponse parseFrom(C16994k kVar) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addCommentInfo(int i, FinderProto.FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureCommentInfoIsMutable();
            this.commentInfo_.add(i, finderCommentInfo);
        }

        public static FinderUniGetCommentResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderUniGetCommentResponse parseFrom(byte[] bArr) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderUniGetCommentResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderUniGetCommentResponse parseFrom(InputStream inputStream) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniGetCommentResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniGetCommentResponse parseFrom(C23856l lVar) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderUniGetCommentResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderUniGetCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderUniGetCommentResponseOrBuilder extends C23848k1 {
        MMBaseProto.BaseResponse getBaseResponse();

        FinderProto.FinderCommentInfo getCommentInfo(int i);

        int getCommentInfoCount();

        List<FinderProto.FinderCommentInfo> getCommentInfoList();

        int getCommentTotalcount();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDownContinueFlag();

        C16994k getLastBuffer();

        int getUpContinueFlag();

        boolean hasBaseResponse();

        boolean hasCommentTotalcount();

        boolean hasDownContinueFlag();

        boolean hasLastBuffer();

        boolean hasUpContinueFlag();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderUniLikeRequest extends C23861l0<FinderUniLikeRequest, Builder> implements FinderUniLikeRequestOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 4;
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        public static final int BYPASS_BUFFER_FIELD_NUMBER = 100;
        public static final int COMMENT_ID_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final FinderUniLikeRequest DEFAULT_INSTANCE;
        public static final int ENTITY_ID_FIELD_NUMBER = 5;
        public static final int FINDER_BASEREQUEST_FIELD_NUMBER = 2;
        public static final int INTERACTION_IDENTITY_FIELD_NUMBER = 9;
        public static final int LIKE_SEQ_FIELD_NUMBER = 3;
        public static final int NONCE_ID_FIELD_NUMBER = 6;
        public static final int OPERATION_TYPE_FIELD_NUMBER = 8;
        private static volatile C24062w1<FinderUniLikeRequest> PARSER;
        private String appName_ = "";
        private MMBaseProto.BaseRequest baseRequest_;
        private int bitField0_;
        private C16994k bypassBuffer_ = C16994k.f46000e;
        private long commentId_;
        private String entityId_ = "";
        private FinderProto.FinderBaseRequest finderBaserequest_;
        private int interactionIdentity_;
        private long likeSeq_;
        private byte memoizedIsInitialized = 2;
        private String nonceId_ = "";
        private int operationType_;

        public static final class Builder extends C23861l0.C23862a<FinderUniLikeRequest, Builder> implements FinderUniLikeRequestOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearAppName() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearAppName();
                return this;
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearBypassBuffer() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearBypassBuffer();
                return this;
            }

            public Builder clearCommentId() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearCommentId();
                return this;
            }

            public Builder clearEntityId() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearEntityId();
                return this;
            }

            public Builder clearFinderBaserequest() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearFinderBaserequest();
                return this;
            }

            public Builder clearInteractionIdentity() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearInteractionIdentity();
                return this;
            }

            public Builder clearLikeSeq() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearLikeSeq();
                return this;
            }

            public Builder clearNonceId() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearNonceId();
                return this;
            }

            public Builder clearOperationType() {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).clearOperationType();
                return this;
            }

            public String getAppName() {
                return ((FinderUniLikeRequest) this.instance).getAppName();
            }

            public C16994k getAppNameBytes() {
                return ((FinderUniLikeRequest) this.instance).getAppNameBytes();
            }

            public MMBaseProto.BaseRequest getBaseRequest() {
                return ((FinderUniLikeRequest) this.instance).getBaseRequest();
            }

            public C16994k getBypassBuffer() {
                return ((FinderUniLikeRequest) this.instance).getBypassBuffer();
            }

            public long getCommentId() {
                return ((FinderUniLikeRequest) this.instance).getCommentId();
            }

            public String getEntityId() {
                return ((FinderUniLikeRequest) this.instance).getEntityId();
            }

            public C16994k getEntityIdBytes() {
                return ((FinderUniLikeRequest) this.instance).getEntityIdBytes();
            }

            public FinderProto.FinderBaseRequest getFinderBaserequest() {
                return ((FinderUniLikeRequest) this.instance).getFinderBaserequest();
            }

            public int getInteractionIdentity() {
                return ((FinderUniLikeRequest) this.instance).getInteractionIdentity();
            }

            public long getLikeSeq() {
                return ((FinderUniLikeRequest) this.instance).getLikeSeq();
            }

            public String getNonceId() {
                return ((FinderUniLikeRequest) this.instance).getNonceId();
            }

            public C16994k getNonceIdBytes() {
                return ((FinderUniLikeRequest) this.instance).getNonceIdBytes();
            }

            public int getOperationType() {
                return ((FinderUniLikeRequest) this.instance).getOperationType();
            }

            public boolean hasAppName() {
                return ((FinderUniLikeRequest) this.instance).hasAppName();
            }

            public boolean hasBaseRequest() {
                return ((FinderUniLikeRequest) this.instance).hasBaseRequest();
            }

            public boolean hasBypassBuffer() {
                return ((FinderUniLikeRequest) this.instance).hasBypassBuffer();
            }

            public boolean hasCommentId() {
                return ((FinderUniLikeRequest) this.instance).hasCommentId();
            }

            public boolean hasEntityId() {
                return ((FinderUniLikeRequest) this.instance).hasEntityId();
            }

            public boolean hasFinderBaserequest() {
                return ((FinderUniLikeRequest) this.instance).hasFinderBaserequest();
            }

            public boolean hasInteractionIdentity() {
                return ((FinderUniLikeRequest) this.instance).hasInteractionIdentity();
            }

            public boolean hasLikeSeq() {
                return ((FinderUniLikeRequest) this.instance).hasLikeSeq();
            }

            public boolean hasNonceId() {
                return ((FinderUniLikeRequest) this.instance).hasNonceId();
            }

            public boolean hasOperationType() {
                return ((FinderUniLikeRequest) this.instance).hasOperationType();
            }

            public Builder mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder mergeFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).mergeFinderBaserequest(finderBaseRequest);
                return this;
            }

            public Builder setAppName(String str) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setAppName(str);
                return this;
            }

            public Builder setAppNameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setAppNameBytes(kVar);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setBypassBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setBypassBuffer(kVar);
                return this;
            }

            public Builder setCommentId(long j) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setCommentId(j);
                return this;
            }

            public Builder setEntityId(String str) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setEntityId(str);
                return this;
            }

            public Builder setEntityIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setEntityIdBytes(kVar);
                return this;
            }

            public Builder setFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setFinderBaserequest(finderBaseRequest);
                return this;
            }

            public Builder setInteractionIdentity(int i) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setInteractionIdentity(i);
                return this;
            }

            public Builder setLikeSeq(long j) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setLikeSeq(j);
                return this;
            }

            public Builder setNonceId(String str) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setNonceId(str);
                return this;
            }

            public Builder setNonceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setNonceIdBytes(kVar);
                return this;
            }

            public Builder setOperationType(int i) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setOperationType(i);
                return this;
            }

            private Builder() {
                super(FinderUniLikeRequest.DEFAULT_INSTANCE);
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setBaseRequest((MMBaseProto.BaseRequest) builder.build());
                return this;
            }

            public Builder setFinderBaserequest(FinderProto.FinderBaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderUniLikeRequest) this.instance).setFinderBaserequest((FinderProto.FinderBaseRequest) builder.build());
                return this;
            }
        }

        static {
            FinderUniLikeRequest finderUniLikeRequest = new FinderUniLikeRequest();
            DEFAULT_INSTANCE = finderUniLikeRequest;
            C23861l0.registerDefaultInstance(FinderUniLikeRequest.class, finderUniLikeRequest);
        }

        private FinderUniLikeRequest() {
        }

        /* access modifiers changed from: private */
        public void clearAppName() {
            this.bitField0_ &= -9;
            this.appName_ = getDefaultInstance().getAppName();
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearBypassBuffer() {
            this.bitField0_ &= -513;
            this.bypassBuffer_ = getDefaultInstance().getBypassBuffer();
        }

        /* access modifiers changed from: private */
        public void clearCommentId() {
            this.bitField0_ &= -65;
            this.commentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEntityId() {
            this.bitField0_ &= -17;
            this.entityId_ = getDefaultInstance().getEntityId();
        }

        /* access modifiers changed from: private */
        public void clearFinderBaserequest() {
            this.finderBaserequest_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearInteractionIdentity() {
            this.bitField0_ &= -257;
            this.interactionIdentity_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLikeSeq() {
            this.bitField0_ &= -5;
            this.likeSeq_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNonceId() {
            this.bitField0_ &= -33;
            this.nonceId_ = getDefaultInstance().getNonceId();
        }

        /* access modifiers changed from: private */
        public void clearOperationType() {
            this.bitField0_ &= -129;
            this.operationType_ = 0;
        }

        public static FinderUniLikeRequest getDefaultInstance() {
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
        public void mergeFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            FinderProto.FinderBaseRequest finderBaseRequest2 = this.finderBaserequest_;
            if (finderBaseRequest2 == null || finderBaseRequest2 == FinderProto.FinderBaseRequest.getDefaultInstance()) {
                this.finderBaserequest_ = finderBaseRequest;
            } else {
                this.finderBaserequest_ = (FinderProto.FinderBaseRequest) ((FinderProto.FinderBaseRequest.Builder) FinderProto.FinderBaseRequest.newBuilder(this.finderBaserequest_).mergeFrom(finderBaseRequest)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderUniLikeRequest parseDelimitedFrom(InputStream inputStream) {
            return (FinderUniLikeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniLikeRequest parseFrom(ByteBuffer byteBuffer) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderUniLikeRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppName(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.appName_ = str;
        }

        /* access modifiers changed from: private */
        public void setAppNameBytes(C16994k kVar) {
            this.appName_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setBypassBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 512;
            this.bypassBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setCommentId(long j) {
            this.bitField0_ |= 64;
            this.commentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setEntityId(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.entityId_ = str;
        }

        /* access modifiers changed from: private */
        public void setEntityIdBytes(C16994k kVar) {
            this.entityId_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setFinderBaserequest(FinderProto.FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            this.finderBaserequest_ = finderBaseRequest;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setInteractionIdentity(int i) {
            this.bitField0_ |= 256;
            this.interactionIdentity_ = i;
        }

        /* access modifiers changed from: private */
        public void setLikeSeq(long j) {
            this.bitField0_ |= 4;
            this.likeSeq_ = j;
        }

        /* access modifiers changed from: private */
        public void setNonceId(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.nonceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setNonceIdBytes(C16994k kVar) {
            this.nonceId_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setOperationType(int i) {
            this.bitField0_ |= 128;
            this.operationType_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001d\n\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဃ\u0006\bဋ\u0007\tဋ\bdည\t", new Object[]{"bitField0_", "baseRequest_", "finderBaserequest_", "likeSeq_", "appName_", "entityId_", "nonceId_", "commentId_", "operationType_", "interactionIdentity_", "bypassBuffer_"});
                case 3:
                    return new FinderUniLikeRequest();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderUniLikeRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderUniLikeRequest.class) {
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

        public String getAppName() {
            return this.appName_;
        }

        public C16994k getAppNameBytes() {
            return C16994k.m16791k(this.appName_);
        }

        public MMBaseProto.BaseRequest getBaseRequest() {
            MMBaseProto.BaseRequest baseRequest = this.baseRequest_;
            return baseRequest == null ? MMBaseProto.BaseRequest.getDefaultInstance() : baseRequest;
        }

        public C16994k getBypassBuffer() {
            return this.bypassBuffer_;
        }

        public long getCommentId() {
            return this.commentId_;
        }

        public String getEntityId() {
            return this.entityId_;
        }

        public C16994k getEntityIdBytes() {
            return C16994k.m16791k(this.entityId_);
        }

        public FinderProto.FinderBaseRequest getFinderBaserequest() {
            FinderProto.FinderBaseRequest finderBaseRequest = this.finderBaserequest_;
            return finderBaseRequest == null ? FinderProto.FinderBaseRequest.getDefaultInstance() : finderBaseRequest;
        }

        public int getInteractionIdentity() {
            return this.interactionIdentity_;
        }

        public long getLikeSeq() {
            return this.likeSeq_;
        }

        public String getNonceId() {
            return this.nonceId_;
        }

        public C16994k getNonceIdBytes() {
            return C16994k.m16791k(this.nonceId_);
        }

        public int getOperationType() {
            return this.operationType_;
        }

        public boolean hasAppName() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasBypassBuffer() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasCommentId() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasEntityId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasFinderBaserequest() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasInteractionIdentity() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasLikeSeq() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasNonceId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasOperationType() {
            return (this.bitField0_ & 128) != 0;
        }

        public static Builder newBuilder(FinderUniLikeRequest finderUniLikeRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderUniLikeRequest);
        }

        public static FinderUniLikeRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniLikeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniLikeRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderUniLikeRequest parseFrom(C16994k kVar) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderUniLikeRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderUniLikeRequest parseFrom(byte[] bArr) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderUniLikeRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderUniLikeRequest parseFrom(InputStream inputStream) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniLikeRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniLikeRequest parseFrom(C23856l lVar) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderUniLikeRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderUniLikeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderUniLikeRequestOrBuilder extends C23848k1 {
        String getAppName();

        C16994k getAppNameBytes();

        MMBaseProto.BaseRequest getBaseRequest();

        C16994k getBypassBuffer();

        long getCommentId();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getEntityId();

        C16994k getEntityIdBytes();

        FinderProto.FinderBaseRequest getFinderBaserequest();

        int getInteractionIdentity();

        long getLikeSeq();

        String getNonceId();

        C16994k getNonceIdBytes();

        int getOperationType();

        boolean hasAppName();

        boolean hasBaseRequest();

        boolean hasBypassBuffer();

        boolean hasCommentId();

        boolean hasEntityId();

        boolean hasFinderBaserequest();

        boolean hasInteractionIdentity();

        boolean hasLikeSeq();

        boolean hasNonceId();

        boolean hasOperationType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderUniLikeResponse extends C23861l0<FinderUniLikeResponse, Builder> implements FinderUniLikeResponseOrBuilder {
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final FinderUniLikeResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<FinderUniLikeResponse> PARSER;
        private MMBaseProto.BaseResponse baseResponse_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<FinderUniLikeResponse, Builder> implements FinderUniLikeResponseOrBuilder {
            public /* synthetic */ Builder(C243211 r1) {
                this();
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((FinderUniLikeResponse) this.instance).clearBaseResponse();
                return this;
            }

            public MMBaseProto.BaseResponse getBaseResponse() {
                return ((FinderUniLikeResponse) this.instance).getBaseResponse();
            }

            public boolean hasBaseResponse() {
                return ((FinderUniLikeResponse) this.instance).hasBaseResponse();
            }

            public Builder mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderUniLikeResponse) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderUniLikeResponse) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            private Builder() {
                super(FinderUniLikeResponse.DEFAULT_INSTANCE);
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse.Builder builder) {
                copyOnWrite();
                ((FinderUniLikeResponse) this.instance).setBaseResponse((MMBaseProto.BaseResponse) builder.build());
                return this;
            }
        }

        static {
            FinderUniLikeResponse finderUniLikeResponse = new FinderUniLikeResponse();
            DEFAULT_INSTANCE = finderUniLikeResponse;
            C23861l0.registerDefaultInstance(FinderUniLikeResponse.class, finderUniLikeResponse);
        }

        private FinderUniLikeResponse() {
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        public static FinderUniLikeResponse getDefaultInstance() {
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

        public static FinderUniLikeResponse parseDelimitedFrom(InputStream inputStream) {
            return (FinderUniLikeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniLikeResponse parseFrom(ByteBuffer byteBuffer) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderUniLikeResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔉ\u0000", new Object[]{"bitField0_", "baseResponse_"});
                case 3:
                    return new FinderUniLikeResponse();
                case 4:
                    return new Builder((C243211) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderUniLikeResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderUniLikeResponse.class) {
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

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FinderUniLikeResponse finderUniLikeResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderUniLikeResponse);
        }

        public static FinderUniLikeResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniLikeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniLikeResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderUniLikeResponse parseFrom(C16994k kVar) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderUniLikeResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderUniLikeResponse parseFrom(byte[] bArr) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderUniLikeResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderUniLikeResponse parseFrom(InputStream inputStream) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderUniLikeResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderUniLikeResponse parseFrom(C23856l lVar) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderUniLikeResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderUniLikeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderUniLikeResponseOrBuilder extends C23848k1 {
        MMBaseProto.BaseResponse getBaseResponse();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBaseResponse();

        /* synthetic */ boolean isInitialized();
    }

    private TingCommentProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
