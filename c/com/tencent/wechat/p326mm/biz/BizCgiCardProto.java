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
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto */
public final class BizCgiCardProto {

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$1 */
    public static /* synthetic */ class C243631 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69821xa1df5c61;

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
                f69821xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69821xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69821xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69821xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69821xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69821xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69821xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.p326mm.biz.BizCgiCardProto.C243631.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleBizAccount */
    public static final class BizRecommendArticleBizAccount extends C23861l0<BizRecommendArticleBizAccount, Builder> implements BizRecommendArticleBizAccountOrBuilder {
        public static final int APPMSGRECREASON_FIELD_NUMBER = 9;
        public static final int APPMSG_FIELD_NUMBER = 10;
        public static final int BIZUIN_FIELD_NUMBER = 7;
        public static final int BRANDICONURL_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final BizRecommendArticleBizAccount DEFAULT_INSTANCE;
        public static final int HEADIMGURL_FIELD_NUMBER = 3;
        public static final int NATIVEFINDERFEEDS_FIELD_NUMBER = 14;
        public static final int NEGATIVEFEEDBACKREASON_FIELD_NUMBER = 11;
        public static final int NEGATIVEFEEDBACKTITLE_FIELD_NUMBER = 13;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        private static volatile C24062w1<BizRecommendArticleBizAccount> PARSER = null;
        public static final int RECOMMENDREASON_FIELD_NUMBER = 4;
        public static final int SHOWNEGATIVEFEEDBACKREASON_FIELD_NUMBER = 12;
        public static final int SIGNATURE_FIELD_NUMBER = 6;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private String appMsgRecReason_ = "";
        private C23908o0.C23919j<BizRecommendArticleBizAppMsg> appMsg_ = C23861l0.emptyProtobufList();
        private int bitField0_;
        private int bizUin_;
        private String brandIconUrl_ = "";
        private String headImgUrl_ = "";
        private NativeFinderFeeds nativeFinderFeeds_;
        private C23908o0.C23919j<String> negativeFeedbackReason_ = C23861l0.emptyProtobufList();
        private String negativeFeedbackTitle_ = "";
        private String nickName_ = "";
        private String recommendReason_ = "";
        private int showNegativeFeedbackReason_;
        private String signature_ = "";
        private String userName_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleBizAccount$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRecommendArticleBizAccount, Builder> implements BizRecommendArticleBizAccountOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder addAllAppMsg(Iterable<? extends BizRecommendArticleBizAppMsg> iterable) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).addAllAppMsg(iterable);
                return this;
            }

            public Builder addAllNegativeFeedbackReason(Iterable<String> iterable) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).addAllNegativeFeedbackReason(iterable);
                return this;
            }

            public Builder addAppMsg(BizRecommendArticleBizAppMsg bizRecommendArticleBizAppMsg) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).addAppMsg(bizRecommendArticleBizAppMsg);
                return this;
            }

            public Builder addNegativeFeedbackReason(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).addNegativeFeedbackReason(str);
                return this;
            }

            public Builder addNegativeFeedbackReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).addNegativeFeedbackReasonBytes(kVar);
                return this;
            }

            public Builder clearAppMsg() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearAppMsg();
                return this;
            }

            public Builder clearAppMsgRecReason() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearAppMsgRecReason();
                return this;
            }

            public Builder clearBizUin() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearBizUin();
                return this;
            }

            public Builder clearBrandIconUrl() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearBrandIconUrl();
                return this;
            }

            public Builder clearHeadImgUrl() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearHeadImgUrl();
                return this;
            }

            public Builder clearNativeFinderFeeds() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearNativeFinderFeeds();
                return this;
            }

            public Builder clearNegativeFeedbackReason() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearNegativeFeedbackReason();
                return this;
            }

            public Builder clearNegativeFeedbackTitle() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearNegativeFeedbackTitle();
                return this;
            }

            public Builder clearNickName() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearNickName();
                return this;
            }

            public Builder clearRecommendReason() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearRecommendReason();
                return this;
            }

            public Builder clearShowNegativeFeedbackReason() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearShowNegativeFeedbackReason();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearSignature();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).clearUserName();
                return this;
            }

            public BizRecommendArticleBizAppMsg getAppMsg(int i) {
                return ((BizRecommendArticleBizAccount) this.instance).getAppMsg(i);
            }

            public int getAppMsgCount() {
                return ((BizRecommendArticleBizAccount) this.instance).getAppMsgCount();
            }

            public List<BizRecommendArticleBizAppMsg> getAppMsgList() {
                return Collections.unmodifiableList(((BizRecommendArticleBizAccount) this.instance).getAppMsgList());
            }

            public String getAppMsgRecReason() {
                return ((BizRecommendArticleBizAccount) this.instance).getAppMsgRecReason();
            }

            public C16994k getAppMsgRecReasonBytes() {
                return ((BizRecommendArticleBizAccount) this.instance).getAppMsgRecReasonBytes();
            }

            public int getBizUin() {
                return ((BizRecommendArticleBizAccount) this.instance).getBizUin();
            }

            public String getBrandIconUrl() {
                return ((BizRecommendArticleBizAccount) this.instance).getBrandIconUrl();
            }

            public C16994k getBrandIconUrlBytes() {
                return ((BizRecommendArticleBizAccount) this.instance).getBrandIconUrlBytes();
            }

            public String getHeadImgUrl() {
                return ((BizRecommendArticleBizAccount) this.instance).getHeadImgUrl();
            }

            public C16994k getHeadImgUrlBytes() {
                return ((BizRecommendArticleBizAccount) this.instance).getHeadImgUrlBytes();
            }

            public NativeFinderFeeds getNativeFinderFeeds() {
                return ((BizRecommendArticleBizAccount) this.instance).getNativeFinderFeeds();
            }

            public String getNegativeFeedbackReason(int i) {
                return ((BizRecommendArticleBizAccount) this.instance).getNegativeFeedbackReason(i);
            }

            public C16994k getNegativeFeedbackReasonBytes(int i) {
                return ((BizRecommendArticleBizAccount) this.instance).getNegativeFeedbackReasonBytes(i);
            }

            public int getNegativeFeedbackReasonCount() {
                return ((BizRecommendArticleBizAccount) this.instance).getNegativeFeedbackReasonCount();
            }

            public List<String> getNegativeFeedbackReasonList() {
                return Collections.unmodifiableList(((BizRecommendArticleBizAccount) this.instance).getNegativeFeedbackReasonList());
            }

            public String getNegativeFeedbackTitle() {
                return ((BizRecommendArticleBizAccount) this.instance).getNegativeFeedbackTitle();
            }

            public C16994k getNegativeFeedbackTitleBytes() {
                return ((BizRecommendArticleBizAccount) this.instance).getNegativeFeedbackTitleBytes();
            }

            public String getNickName() {
                return ((BizRecommendArticleBizAccount) this.instance).getNickName();
            }

            public C16994k getNickNameBytes() {
                return ((BizRecommendArticleBizAccount) this.instance).getNickNameBytes();
            }

            public String getRecommendReason() {
                return ((BizRecommendArticleBizAccount) this.instance).getRecommendReason();
            }

            public C16994k getRecommendReasonBytes() {
                return ((BizRecommendArticleBizAccount) this.instance).getRecommendReasonBytes();
            }

            public int getShowNegativeFeedbackReason() {
                return ((BizRecommendArticleBizAccount) this.instance).getShowNegativeFeedbackReason();
            }

            public String getSignature() {
                return ((BizRecommendArticleBizAccount) this.instance).getSignature();
            }

            public C16994k getSignatureBytes() {
                return ((BizRecommendArticleBizAccount) this.instance).getSignatureBytes();
            }

            public String getUserName() {
                return ((BizRecommendArticleBizAccount) this.instance).getUserName();
            }

            public C16994k getUserNameBytes() {
                return ((BizRecommendArticleBizAccount) this.instance).getUserNameBytes();
            }

            public boolean hasAppMsgRecReason() {
                return ((BizRecommendArticleBizAccount) this.instance).hasAppMsgRecReason();
            }

            public boolean hasBizUin() {
                return ((BizRecommendArticleBizAccount) this.instance).hasBizUin();
            }

            public boolean hasBrandIconUrl() {
                return ((BizRecommendArticleBizAccount) this.instance).hasBrandIconUrl();
            }

            public boolean hasHeadImgUrl() {
                return ((BizRecommendArticleBizAccount) this.instance).hasHeadImgUrl();
            }

            public boolean hasNativeFinderFeeds() {
                return ((BizRecommendArticleBizAccount) this.instance).hasNativeFinderFeeds();
            }

            public boolean hasNegativeFeedbackTitle() {
                return ((BizRecommendArticleBizAccount) this.instance).hasNegativeFeedbackTitle();
            }

            public boolean hasNickName() {
                return ((BizRecommendArticleBizAccount) this.instance).hasNickName();
            }

            public boolean hasRecommendReason() {
                return ((BizRecommendArticleBizAccount) this.instance).hasRecommendReason();
            }

            public boolean hasShowNegativeFeedbackReason() {
                return ((BizRecommendArticleBizAccount) this.instance).hasShowNegativeFeedbackReason();
            }

            public boolean hasSignature() {
                return ((BizRecommendArticleBizAccount) this.instance).hasSignature();
            }

            public boolean hasUserName() {
                return ((BizRecommendArticleBizAccount) this.instance).hasUserName();
            }

            public Builder mergeNativeFinderFeeds(NativeFinderFeeds nativeFinderFeeds) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).mergeNativeFinderFeeds(nativeFinderFeeds);
                return this;
            }

            public Builder removeAppMsg(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).removeAppMsg(i);
                return this;
            }

            public Builder setAppMsg(int i, BizRecommendArticleBizAppMsg bizRecommendArticleBizAppMsg) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setAppMsg(i, bizRecommendArticleBizAppMsg);
                return this;
            }

            public Builder setAppMsgRecReason(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setAppMsgRecReason(str);
                return this;
            }

            public Builder setAppMsgRecReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setAppMsgRecReasonBytes(kVar);
                return this;
            }

            public Builder setBizUin(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setBizUin(i);
                return this;
            }

            public Builder setBrandIconUrl(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setBrandIconUrl(str);
                return this;
            }

            public Builder setBrandIconUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setBrandIconUrlBytes(kVar);
                return this;
            }

            public Builder setHeadImgUrl(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setHeadImgUrl(str);
                return this;
            }

            public Builder setHeadImgUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setHeadImgUrlBytes(kVar);
                return this;
            }

            public Builder setNativeFinderFeeds(NativeFinderFeeds nativeFinderFeeds) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setNativeFinderFeeds(nativeFinderFeeds);
                return this;
            }

            public Builder setNegativeFeedbackReason(int i, String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setNegativeFeedbackReason(i, str);
                return this;
            }

            public Builder setNegativeFeedbackTitle(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setNegativeFeedbackTitle(str);
                return this;
            }

            public Builder setNegativeFeedbackTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setNegativeFeedbackTitleBytes(kVar);
                return this;
            }

            public Builder setNickName(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setNickName(str);
                return this;
            }

            public Builder setNickNameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setNickNameBytes(kVar);
                return this;
            }

            public Builder setRecommendReason(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setRecommendReason(str);
                return this;
            }

            public Builder setRecommendReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setRecommendReasonBytes(kVar);
                return this;
            }

            public Builder setShowNegativeFeedbackReason(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setShowNegativeFeedbackReason(i);
                return this;
            }

            public Builder setSignature(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setSignature(str);
                return this;
            }

            public Builder setSignatureBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setSignatureBytes(kVar);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setUserNameBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizRecommendArticleBizAccount.DEFAULT_INSTANCE);
            }

            public Builder addAppMsg(int i, BizRecommendArticleBizAppMsg bizRecommendArticleBizAppMsg) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).addAppMsg(i, bizRecommendArticleBizAppMsg);
                return this;
            }

            public Builder setAppMsg(int i, BizRecommendArticleBizAppMsg.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setAppMsg(i, (BizRecommendArticleBizAppMsg) builder.build());
                return this;
            }

            public Builder setNativeFinderFeeds(NativeFinderFeeds.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).setNativeFinderFeeds((NativeFinderFeeds) builder.build());
                return this;
            }

            public Builder addAppMsg(BizRecommendArticleBizAppMsg.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).addAppMsg((BizRecommendArticleBizAppMsg) builder.build());
                return this;
            }

            public Builder addAppMsg(int i, BizRecommendArticleBizAppMsg.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticleBizAccount) this.instance).addAppMsg(i, (BizRecommendArticleBizAppMsg) builder.build());
                return this;
            }
        }

        static {
            BizRecommendArticleBizAccount bizRecommendArticleBizAccount = new BizRecommendArticleBizAccount();
            DEFAULT_INSTANCE = bizRecommendArticleBizAccount;
            C23861l0.registerDefaultInstance(BizRecommendArticleBizAccount.class, bizRecommendArticleBizAccount);
        }

        private BizRecommendArticleBizAccount() {
        }

        /* access modifiers changed from: private */
        public void addAllAppMsg(Iterable<? extends BizRecommendArticleBizAppMsg> iterable) {
            ensureAppMsgIsMutable();
            C23810b.addAll(iterable, this.appMsg_);
        }

        /* access modifiers changed from: private */
        public void addAllNegativeFeedbackReason(Iterable<String> iterable) {
            ensureNegativeFeedbackReasonIsMutable();
            C23810b.addAll(iterable, this.negativeFeedbackReason_);
        }

        /* access modifiers changed from: private */
        public void addAppMsg(BizRecommendArticleBizAppMsg bizRecommendArticleBizAppMsg) {
            bizRecommendArticleBizAppMsg.getClass();
            ensureAppMsgIsMutable();
            this.appMsg_.add(bizRecommendArticleBizAppMsg);
        }

        /* access modifiers changed from: private */
        public void addNegativeFeedbackReason(String str) {
            str.getClass();
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.add(str);
        }

        /* access modifiers changed from: private */
        public void addNegativeFeedbackReasonBytes(C16994k kVar) {
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearAppMsg() {
            this.appMsg_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearAppMsgRecReason() {
            this.bitField0_ &= -129;
            this.appMsgRecReason_ = getDefaultInstance().getAppMsgRecReason();
        }

        /* access modifiers changed from: private */
        public void clearBizUin() {
            this.bitField0_ &= -33;
            this.bizUin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBrandIconUrl() {
            this.bitField0_ &= -65;
            this.brandIconUrl_ = getDefaultInstance().getBrandIconUrl();
        }

        /* access modifiers changed from: private */
        public void clearHeadImgUrl() {
            this.bitField0_ &= -5;
            this.headImgUrl_ = getDefaultInstance().getHeadImgUrl();
        }

        /* access modifiers changed from: private */
        public void clearNativeFinderFeeds() {
            this.nativeFinderFeeds_ = null;
            this.bitField0_ &= -1025;
        }

        /* access modifiers changed from: private */
        public void clearNegativeFeedbackReason() {
            this.negativeFeedbackReason_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearNegativeFeedbackTitle() {
            this.bitField0_ &= -513;
            this.negativeFeedbackTitle_ = getDefaultInstance().getNegativeFeedbackTitle();
        }

        /* access modifiers changed from: private */
        public void clearNickName() {
            this.bitField0_ &= -3;
            this.nickName_ = getDefaultInstance().getNickName();
        }

        /* access modifiers changed from: private */
        public void clearRecommendReason() {
            this.bitField0_ &= -9;
            this.recommendReason_ = getDefaultInstance().getRecommendReason();
        }

        /* access modifiers changed from: private */
        public void clearShowNegativeFeedbackReason() {
            this.bitField0_ &= -257;
            this.showNegativeFeedbackReason_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSignature() {
            this.bitField0_ &= -17;
            this.signature_ = getDefaultInstance().getSignature();
        }

        /* access modifiers changed from: private */
        public void clearUserName() {
            this.bitField0_ &= -2;
            this.userName_ = getDefaultInstance().getUserName();
        }

        private void ensureAppMsgIsMutable() {
            C23908o0.C23919j<BizRecommendArticleBizAppMsg> jVar = this.appMsg_;
            if (!jVar.mo37523Q()) {
                this.appMsg_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureNegativeFeedbackReasonIsMutable() {
            C23908o0.C23919j<String> jVar = this.negativeFeedbackReason_;
            if (!jVar.mo37523Q()) {
                this.negativeFeedbackReason_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizRecommendArticleBizAccount getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeNativeFinderFeeds(NativeFinderFeeds nativeFinderFeeds) {
            nativeFinderFeeds.getClass();
            NativeFinderFeeds nativeFinderFeeds2 = this.nativeFinderFeeds_;
            if (nativeFinderFeeds2 == null || nativeFinderFeeds2 == NativeFinderFeeds.getDefaultInstance()) {
                this.nativeFinderFeeds_ = nativeFinderFeeds;
            } else {
                this.nativeFinderFeeds_ = (NativeFinderFeeds) ((NativeFinderFeeds.Builder) NativeFinderFeeds.newBuilder(this.nativeFinderFeeds_).mergeFrom(nativeFinderFeeds)).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRecommendArticleBizAccount parseDelimitedFrom(InputStream inputStream) {
            return (BizRecommendArticleBizAccount) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticleBizAccount parseFrom(ByteBuffer byteBuffer) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRecommendArticleBizAccount> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeAppMsg(int i) {
            ensureAppMsgIsMutable();
            this.appMsg_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAppMsg(int i, BizRecommendArticleBizAppMsg bizRecommendArticleBizAppMsg) {
            bizRecommendArticleBizAppMsg.getClass();
            ensureAppMsgIsMutable();
            this.appMsg_.set(i, bizRecommendArticleBizAppMsg);
        }

        /* access modifiers changed from: private */
        public void setAppMsgRecReason(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.appMsgRecReason_ = str;
        }

        /* access modifiers changed from: private */
        public void setAppMsgRecReasonBytes(C16994k kVar) {
            this.appMsgRecReason_ = kVar.mo18752u();
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setBizUin(int i) {
            this.bitField0_ |= 32;
            this.bizUin_ = i;
        }

        /* access modifiers changed from: private */
        public void setBrandIconUrl(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.brandIconUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setBrandIconUrlBytes(C16994k kVar) {
            this.brandIconUrl_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setHeadImgUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.headImgUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setHeadImgUrlBytes(C16994k kVar) {
            this.headImgUrl_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setNativeFinderFeeds(NativeFinderFeeds nativeFinderFeeds) {
            nativeFinderFeeds.getClass();
            this.nativeFinderFeeds_ = nativeFinderFeeds;
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackReason(int i, String str) {
            str.getClass();
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackTitle(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.negativeFeedbackTitle_ = str;
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackTitleBytes(C16994k kVar) {
            this.negativeFeedbackTitle_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setNickName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.nickName_ = str;
        }

        /* access modifiers changed from: private */
        public void setNickNameBytes(C16994k kVar) {
            this.nickName_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setRecommendReason(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.recommendReason_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecommendReasonBytes(C16994k kVar) {
            this.recommendReason_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setShowNegativeFeedbackReason(int i) {
            this.bitField0_ |= 256;
            this.showNegativeFeedbackReason_ = i;
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
        public void setUserName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.userName_ = str;
        }

        /* access modifiers changed from: private */
        public void setUserNameBytes(C16994k kVar) {
            this.userName_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဈ\u0004\u0007ဋ\u0005\bဈ\u0006\tဈ\u0007\n\u001b\u000b\u001a\fဋ\b\rဈ\t\u000eဉ\n", new Object[]{"bitField0_", "userName_", "nickName_", "headImgUrl_", "recommendReason_", "signature_", "bizUin_", "brandIconUrl_", "appMsgRecReason_", "appMsg_", BizRecommendArticleBizAppMsg.class, "negativeFeedbackReason_", "showNegativeFeedbackReason_", "negativeFeedbackTitle_", "nativeFinderFeeds_"});
                case 3:
                    return new BizRecommendArticleBizAccount();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRecommendArticleBizAccount> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRecommendArticleBizAccount.class) {
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

        public BizRecommendArticleBizAppMsg getAppMsg(int i) {
            return this.appMsg_.get(i);
        }

        public int getAppMsgCount() {
            return this.appMsg_.size();
        }

        public List<BizRecommendArticleBizAppMsg> getAppMsgList() {
            return this.appMsg_;
        }

        public BizRecommendArticleBizAppMsgOrBuilder getAppMsgOrBuilder(int i) {
            return this.appMsg_.get(i);
        }

        public List<? extends BizRecommendArticleBizAppMsgOrBuilder> getAppMsgOrBuilderList() {
            return this.appMsg_;
        }

        public String getAppMsgRecReason() {
            return this.appMsgRecReason_;
        }

        public C16994k getAppMsgRecReasonBytes() {
            return C16994k.m16791k(this.appMsgRecReason_);
        }

        public int getBizUin() {
            return this.bizUin_;
        }

        public String getBrandIconUrl() {
            return this.brandIconUrl_;
        }

        public C16994k getBrandIconUrlBytes() {
            return C16994k.m16791k(this.brandIconUrl_);
        }

        public String getHeadImgUrl() {
            return this.headImgUrl_;
        }

        public C16994k getHeadImgUrlBytes() {
            return C16994k.m16791k(this.headImgUrl_);
        }

        public NativeFinderFeeds getNativeFinderFeeds() {
            NativeFinderFeeds nativeFinderFeeds = this.nativeFinderFeeds_;
            return nativeFinderFeeds == null ? NativeFinderFeeds.getDefaultInstance() : nativeFinderFeeds;
        }

        public String getNegativeFeedbackReason(int i) {
            return this.negativeFeedbackReason_.get(i);
        }

        public C16994k getNegativeFeedbackReasonBytes(int i) {
            return C16994k.m16791k(this.negativeFeedbackReason_.get(i));
        }

        public int getNegativeFeedbackReasonCount() {
            return this.negativeFeedbackReason_.size();
        }

        public List<String> getNegativeFeedbackReasonList() {
            return this.negativeFeedbackReason_;
        }

        public String getNegativeFeedbackTitle() {
            return this.negativeFeedbackTitle_;
        }

        public C16994k getNegativeFeedbackTitleBytes() {
            return C16994k.m16791k(this.negativeFeedbackTitle_);
        }

        public String getNickName() {
            return this.nickName_;
        }

        public C16994k getNickNameBytes() {
            return C16994k.m16791k(this.nickName_);
        }

        public String getRecommendReason() {
            return this.recommendReason_;
        }

        public C16994k getRecommendReasonBytes() {
            return C16994k.m16791k(this.recommendReason_);
        }

        public int getShowNegativeFeedbackReason() {
            return this.showNegativeFeedbackReason_;
        }

        public String getSignature() {
            return this.signature_;
        }

        public C16994k getSignatureBytes() {
            return C16994k.m16791k(this.signature_);
        }

        public String getUserName() {
            return this.userName_;
        }

        public C16994k getUserNameBytes() {
            return C16994k.m16791k(this.userName_);
        }

        public boolean hasAppMsgRecReason() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasBizUin() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasBrandIconUrl() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasHeadImgUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasNativeFinderFeeds() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasNegativeFeedbackTitle() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasNickName() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRecommendReason() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasShowNegativeFeedbackReason() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasSignature() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasUserName() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizRecommendArticleBizAccount bizRecommendArticleBizAccount) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRecommendArticleBizAccount);
        }

        public static BizRecommendArticleBizAccount parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticleBizAccount) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticleBizAccount parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRecommendArticleBizAccount parseFrom(C16994k kVar) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addAppMsg(int i, BizRecommendArticleBizAppMsg bizRecommendArticleBizAppMsg) {
            bizRecommendArticleBizAppMsg.getClass();
            ensureAppMsgIsMutable();
            this.appMsg_.add(i, bizRecommendArticleBizAppMsg);
        }

        public static BizRecommendArticleBizAccount parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRecommendArticleBizAccount parseFrom(byte[] bArr) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRecommendArticleBizAccount parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRecommendArticleBizAccount parseFrom(InputStream inputStream) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticleBizAccount parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticleBizAccount parseFrom(C23856l lVar) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRecommendArticleBizAccount parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRecommendArticleBizAccount) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleBizAccountOrBuilder */
    public interface BizRecommendArticleBizAccountOrBuilder extends C23848k1 {
        BizRecommendArticleBizAppMsg getAppMsg(int i);

        int getAppMsgCount();

        List<BizRecommendArticleBizAppMsg> getAppMsgList();

        String getAppMsgRecReason();

        C16994k getAppMsgRecReasonBytes();

        int getBizUin();

        String getBrandIconUrl();

        C16994k getBrandIconUrlBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getHeadImgUrl();

        C16994k getHeadImgUrlBytes();

        NativeFinderFeeds getNativeFinderFeeds();

        String getNegativeFeedbackReason(int i);

        C16994k getNegativeFeedbackReasonBytes(int i);

        int getNegativeFeedbackReasonCount();

        List<String> getNegativeFeedbackReasonList();

        String getNegativeFeedbackTitle();

        C16994k getNegativeFeedbackTitleBytes();

        String getNickName();

        C16994k getNickNameBytes();

        String getRecommendReason();

        C16994k getRecommendReasonBytes();

        int getShowNegativeFeedbackReason();

        String getSignature();

        C16994k getSignatureBytes();

        String getUserName();

        C16994k getUserNameBytes();

        boolean hasAppMsgRecReason();

        boolean hasBizUin();

        boolean hasBrandIconUrl();

        boolean hasHeadImgUrl();

        boolean hasNativeFinderFeeds();

        boolean hasNegativeFeedbackTitle();

        boolean hasNickName();

        boolean hasRecommendReason();

        boolean hasShowNegativeFeedbackReason();

        boolean hasSignature();

        boolean hasUserName();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleBizAppMsg */
    public static final class BizRecommendArticleBizAppMsg extends C23861l0<BizRecommendArticleBizAppMsg, Builder> implements BizRecommendArticleBizAppMsgOrBuilder {
        public static final int APPMSGID_FIELD_NUMBER = 22;
        public static final int AUTHORAPPUIN_FIELD_NUMBER = 24;
        public static final int CANPAID_FIELD_NUMBER = 26;
        public static final int CANREWARD_FIELD_NUMBER = 25;
        public static final int CATEGORY_FIELD_NUMBER = 37;
        public static final int CHILDCATEGORY_FIELD_NUMBER = 38;
        public static final int CONTENTURL_FIELD_NUMBER = 6;
        public static final int COVERIMGURL_1_1_FIELD_NUMBER = 9;
        public static final int COVERIMGURL_235_1_FIELD_NUMBER = 10;
        public static final int COVERIMGURL_FIELD_NUMBER = 8;
        public static final int CREATETIME_FIELD_NUMBER = 19;
        /* access modifiers changed from: private */
        public static final BizRecommendArticleBizAppMsg DEFAULT_INSTANCE;
        public static final int DIGEST_FIELD_NUMBER = 3;
        public static final int EXPIRETIME_FIELD_NUMBER = 36;
        public static final int FINDER_FEED_FIELD_NUMBER = 32;
        public static final int ITEMIDX_FIELD_NUMBER = 23;
        public static final int ITEMSHOWTYPE_FIELD_NUMBER = 11;
        public static final int NEGATIVEFEEDBACKREASON_FIELD_NUMBER = 20;
        public static final int NEGATIVEFEEDBACKTITLE_FIELD_NUMBER = 34;
        private static volatile C24062w1<BizRecommendArticleBizAppMsg> PARSER = null;
        public static final int PICTUREURL_FIELD_NUMBER = 39;
        public static final int PRICE_FIELD_NUMBER = 31;
        public static final int RECINFO_FIELD_NUMBER = 30;
        public static final int RECOMMENDREASON_FIELD_NUMBER = 33;
        public static final int RECRK_FIELD_NUMBER = 29;
        public static final int SHOWNEGATIVEFEEDBACKREASON_FIELD_NUMBER = 21;
        public static final int STYLEFLAG_FIELD_NUMBER = 35;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int VIDEODURATION_FIELD_NUMBER = 18;
        public static final int VIDEOHEIGHT_FIELD_NUMBER = 17;
        public static final int VIDEOID_FIELD_NUMBER = 15;
        public static final int VIDEOWIDTH_FIELD_NUMBER = 16;
        public static final int VOICEDURATION_FIELD_NUMBER = 28;
        public static final int VOICEPLAYURL_FIELD_NUMBER = 27;
        private int appMsgId_;
        private int authorAppUin_;
        private int bitField0_;
        private int canPaid_;
        private int canReward_;
        private C16994k category_;
        private C16994k childCategory_;
        private String contentUrl_ = "";
        private String coverImgUrl11_ = "";
        private String coverImgUrl2351_ = "";
        private String coverImgUrl_ = "";
        private int createTime_;
        private String digest_ = "";
        private int expireTime_;
        private FinderFeedInfo finderFeed_;
        private int itemIdx_;
        private int itemShowType_;
        private C23908o0.C23919j<String> negativeFeedbackReason_ = C23861l0.emptyProtobufList();
        private String negativeFeedbackTitle_ = "";
        private C23908o0.C23919j<String> pictureUrl_;
        private int price_;
        private String recInfo_ = "";
        private int recRk_;
        private String recommendReason_ = "";
        private int showNegativeFeedbackReason_;
        private int styleFlag_;
        private C16994k title_;
        private int videoDuration_;
        private int videoHeight_;
        private String videoId_ = "";
        private int videoWidth_;
        private int voiceDuration_;
        private String voicePlayUrl_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleBizAppMsg$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRecommendArticleBizAppMsg, Builder> implements BizRecommendArticleBizAppMsgOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder addAllNegativeFeedbackReason(Iterable<String> iterable) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).addAllNegativeFeedbackReason(iterable);
                return this;
            }

            public Builder addAllPictureUrl(Iterable<String> iterable) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).addAllPictureUrl(iterable);
                return this;
            }

            public Builder addNegativeFeedbackReason(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).addNegativeFeedbackReason(str);
                return this;
            }

            public Builder addNegativeFeedbackReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).addNegativeFeedbackReasonBytes(kVar);
                return this;
            }

            public Builder addPictureUrl(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).addPictureUrl(str);
                return this;
            }

            public Builder addPictureUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).addPictureUrlBytes(kVar);
                return this;
            }

            public Builder clearAppMsgId() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearAppMsgId();
                return this;
            }

            public Builder clearAuthorAppUin() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearAuthorAppUin();
                return this;
            }

            public Builder clearCanPaid() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearCanPaid();
                return this;
            }

            public Builder clearCanReward() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearCanReward();
                return this;
            }

            public Builder clearCategory() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearCategory();
                return this;
            }

            public Builder clearChildCategory() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearChildCategory();
                return this;
            }

            public Builder clearContentUrl() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearContentUrl();
                return this;
            }

            public Builder clearCoverImgUrl() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearCoverImgUrl();
                return this;
            }

            public Builder clearCoverImgUrl11() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearCoverImgUrl11();
                return this;
            }

            public Builder clearCoverImgUrl2351() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearCoverImgUrl2351();
                return this;
            }

            public Builder clearCreateTime() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearCreateTime();
                return this;
            }

            public Builder clearDigest() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearDigest();
                return this;
            }

            public Builder clearExpireTime() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearExpireTime();
                return this;
            }

            public Builder clearFinderFeed() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearFinderFeed();
                return this;
            }

            public Builder clearItemIdx() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearItemIdx();
                return this;
            }

            public Builder clearItemShowType() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearItemShowType();
                return this;
            }

            public Builder clearNegativeFeedbackReason() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearNegativeFeedbackReason();
                return this;
            }

            public Builder clearNegativeFeedbackTitle() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearNegativeFeedbackTitle();
                return this;
            }

            public Builder clearPictureUrl() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearPictureUrl();
                return this;
            }

            public Builder clearPrice() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearPrice();
                return this;
            }

            public Builder clearRecInfo() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearRecInfo();
                return this;
            }

            public Builder clearRecRk() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearRecRk();
                return this;
            }

            public Builder clearRecommendReason() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearRecommendReason();
                return this;
            }

            public Builder clearShowNegativeFeedbackReason() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearShowNegativeFeedbackReason();
                return this;
            }

            public Builder clearStyleFlag() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearStyleFlag();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearTitle();
                return this;
            }

            public Builder clearVideoDuration() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearVideoDuration();
                return this;
            }

            public Builder clearVideoHeight() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearVideoHeight();
                return this;
            }

            public Builder clearVideoId() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearVideoId();
                return this;
            }

            public Builder clearVideoWidth() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearVideoWidth();
                return this;
            }

            public Builder clearVoiceDuration() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearVoiceDuration();
                return this;
            }

            public Builder clearVoicePlayUrl() {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).clearVoicePlayUrl();
                return this;
            }

            public int getAppMsgId() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getAppMsgId();
            }

            public int getAuthorAppUin() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getAuthorAppUin();
            }

            public int getCanPaid() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCanPaid();
            }

            public int getCanReward() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCanReward();
            }

            public C16994k getCategory() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCategory();
            }

            public C16994k getChildCategory() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getChildCategory();
            }

            public String getContentUrl() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getContentUrl();
            }

            public C16994k getContentUrlBytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getContentUrlBytes();
            }

            public String getCoverImgUrl() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCoverImgUrl();
            }

            public String getCoverImgUrl11() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCoverImgUrl11();
            }

            public C16994k getCoverImgUrl11Bytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCoverImgUrl11Bytes();
            }

            public String getCoverImgUrl2351() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCoverImgUrl2351();
            }

            public C16994k getCoverImgUrl2351Bytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCoverImgUrl2351Bytes();
            }

            public C16994k getCoverImgUrlBytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCoverImgUrlBytes();
            }

            public int getCreateTime() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getCreateTime();
            }

            public String getDigest() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getDigest();
            }

            public C16994k getDigestBytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getDigestBytes();
            }

            public int getExpireTime() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getExpireTime();
            }

            public FinderFeedInfo getFinderFeed() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getFinderFeed();
            }

            public int getItemIdx() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getItemIdx();
            }

            public int getItemShowType() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getItemShowType();
            }

            public String getNegativeFeedbackReason(int i) {
                return ((BizRecommendArticleBizAppMsg) this.instance).getNegativeFeedbackReason(i);
            }

            public C16994k getNegativeFeedbackReasonBytes(int i) {
                return ((BizRecommendArticleBizAppMsg) this.instance).getNegativeFeedbackReasonBytes(i);
            }

            public int getNegativeFeedbackReasonCount() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getNegativeFeedbackReasonCount();
            }

            public List<String> getNegativeFeedbackReasonList() {
                return Collections.unmodifiableList(((BizRecommendArticleBizAppMsg) this.instance).getNegativeFeedbackReasonList());
            }

            public String getNegativeFeedbackTitle() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getNegativeFeedbackTitle();
            }

            public C16994k getNegativeFeedbackTitleBytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getNegativeFeedbackTitleBytes();
            }

            public String getPictureUrl(int i) {
                return ((BizRecommendArticleBizAppMsg) this.instance).getPictureUrl(i);
            }

            public C16994k getPictureUrlBytes(int i) {
                return ((BizRecommendArticleBizAppMsg) this.instance).getPictureUrlBytes(i);
            }

            public int getPictureUrlCount() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getPictureUrlCount();
            }

            public List<String> getPictureUrlList() {
                return Collections.unmodifiableList(((BizRecommendArticleBizAppMsg) this.instance).getPictureUrlList());
            }

            public int getPrice() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getPrice();
            }

            public String getRecInfo() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getRecInfo();
            }

            public C16994k getRecInfoBytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getRecInfoBytes();
            }

            public int getRecRk() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getRecRk();
            }

            public String getRecommendReason() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getRecommendReason();
            }

            public C16994k getRecommendReasonBytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getRecommendReasonBytes();
            }

            public int getShowNegativeFeedbackReason() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getShowNegativeFeedbackReason();
            }

            public int getStyleFlag() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getStyleFlag();
            }

            public C16994k getTitle() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getTitle();
            }

            public int getVideoDuration() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getVideoDuration();
            }

            public int getVideoHeight() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getVideoHeight();
            }

            public String getVideoId() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getVideoId();
            }

            public C16994k getVideoIdBytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getVideoIdBytes();
            }

            public int getVideoWidth() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getVideoWidth();
            }

            public int getVoiceDuration() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getVoiceDuration();
            }

            public String getVoicePlayUrl() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getVoicePlayUrl();
            }

            public C16994k getVoicePlayUrlBytes() {
                return ((BizRecommendArticleBizAppMsg) this.instance).getVoicePlayUrlBytes();
            }

            public boolean hasAppMsgId() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasAppMsgId();
            }

            public boolean hasAuthorAppUin() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasAuthorAppUin();
            }

            public boolean hasCanPaid() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasCanPaid();
            }

            public boolean hasCanReward() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasCanReward();
            }

            public boolean hasCategory() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasCategory();
            }

            public boolean hasChildCategory() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasChildCategory();
            }

            public boolean hasContentUrl() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasContentUrl();
            }

            public boolean hasCoverImgUrl() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasCoverImgUrl();
            }

            public boolean hasCoverImgUrl11() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasCoverImgUrl11();
            }

            public boolean hasCoverImgUrl2351() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasCoverImgUrl2351();
            }

            public boolean hasCreateTime() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasCreateTime();
            }

            public boolean hasDigest() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasDigest();
            }

            public boolean hasExpireTime() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasExpireTime();
            }

            public boolean hasFinderFeed() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasFinderFeed();
            }

            public boolean hasItemIdx() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasItemIdx();
            }

            public boolean hasItemShowType() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasItemShowType();
            }

            public boolean hasNegativeFeedbackTitle() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasNegativeFeedbackTitle();
            }

            public boolean hasPrice() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasPrice();
            }

            public boolean hasRecInfo() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasRecInfo();
            }

            public boolean hasRecRk() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasRecRk();
            }

            public boolean hasRecommendReason() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasRecommendReason();
            }

            public boolean hasShowNegativeFeedbackReason() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasShowNegativeFeedbackReason();
            }

            public boolean hasStyleFlag() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasStyleFlag();
            }

            public boolean hasTitle() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasTitle();
            }

            public boolean hasVideoDuration() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasVideoDuration();
            }

            public boolean hasVideoHeight() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasVideoHeight();
            }

            public boolean hasVideoId() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasVideoId();
            }

            public boolean hasVideoWidth() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasVideoWidth();
            }

            public boolean hasVoiceDuration() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasVoiceDuration();
            }

            public boolean hasVoicePlayUrl() {
                return ((BizRecommendArticleBizAppMsg) this.instance).hasVoicePlayUrl();
            }

            public Builder mergeFinderFeed(FinderFeedInfo finderFeedInfo) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).mergeFinderFeed(finderFeedInfo);
                return this;
            }

            public Builder setAppMsgId(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setAppMsgId(i);
                return this;
            }

            public Builder setAuthorAppUin(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setAuthorAppUin(i);
                return this;
            }

            public Builder setCanPaid(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCanPaid(i);
                return this;
            }

            public Builder setCanReward(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCanReward(i);
                return this;
            }

            public Builder setCategory(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCategory(kVar);
                return this;
            }

            public Builder setChildCategory(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setChildCategory(kVar);
                return this;
            }

            public Builder setContentUrl(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setContentUrl(str);
                return this;
            }

            public Builder setContentUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setContentUrlBytes(kVar);
                return this;
            }

            public Builder setCoverImgUrl(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCoverImgUrl(str);
                return this;
            }

            public Builder setCoverImgUrl11(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCoverImgUrl11(str);
                return this;
            }

            public Builder setCoverImgUrl11Bytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCoverImgUrl11Bytes(kVar);
                return this;
            }

            public Builder setCoverImgUrl2351(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCoverImgUrl2351(str);
                return this;
            }

            public Builder setCoverImgUrl2351Bytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCoverImgUrl2351Bytes(kVar);
                return this;
            }

            public Builder setCoverImgUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCoverImgUrlBytes(kVar);
                return this;
            }

            public Builder setCreateTime(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setCreateTime(i);
                return this;
            }

            public Builder setDigest(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setDigest(str);
                return this;
            }

            public Builder setDigestBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setDigestBytes(kVar);
                return this;
            }

            public Builder setExpireTime(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setExpireTime(i);
                return this;
            }

            public Builder setFinderFeed(FinderFeedInfo finderFeedInfo) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setFinderFeed(finderFeedInfo);
                return this;
            }

            public Builder setItemIdx(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setItemIdx(i);
                return this;
            }

            public Builder setItemShowType(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setItemShowType(i);
                return this;
            }

            public Builder setNegativeFeedbackReason(int i, String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setNegativeFeedbackReason(i, str);
                return this;
            }

            public Builder setNegativeFeedbackTitle(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setNegativeFeedbackTitle(str);
                return this;
            }

            public Builder setNegativeFeedbackTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setNegativeFeedbackTitleBytes(kVar);
                return this;
            }

            public Builder setPictureUrl(int i, String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setPictureUrl(i, str);
                return this;
            }

            public Builder setPrice(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setPrice(i);
                return this;
            }

            public Builder setRecInfo(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setRecInfo(str);
                return this;
            }

            public Builder setRecInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setRecInfoBytes(kVar);
                return this;
            }

            public Builder setRecRk(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setRecRk(i);
                return this;
            }

            public Builder setRecommendReason(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setRecommendReason(str);
                return this;
            }

            public Builder setRecommendReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setRecommendReasonBytes(kVar);
                return this;
            }

            public Builder setShowNegativeFeedbackReason(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setShowNegativeFeedbackReason(i);
                return this;
            }

            public Builder setStyleFlag(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setStyleFlag(i);
                return this;
            }

            public Builder setTitle(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setTitle(kVar);
                return this;
            }

            public Builder setVideoDuration(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setVideoDuration(i);
                return this;
            }

            public Builder setVideoHeight(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setVideoHeight(i);
                return this;
            }

            public Builder setVideoId(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setVideoId(str);
                return this;
            }

            public Builder setVideoIdBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setVideoIdBytes(kVar);
                return this;
            }

            public Builder setVideoWidth(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setVideoWidth(i);
                return this;
            }

            public Builder setVoiceDuration(int i) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setVoiceDuration(i);
                return this;
            }

            public Builder setVoicePlayUrl(String str) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setVoicePlayUrl(str);
                return this;
            }

            public Builder setVoicePlayUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setVoicePlayUrlBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizRecommendArticleBizAppMsg.DEFAULT_INSTANCE);
            }

            public Builder setFinderFeed(FinderFeedInfo.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticleBizAppMsg) this.instance).setFinderFeed((FinderFeedInfo) builder.build());
                return this;
            }
        }

        static {
            BizRecommendArticleBizAppMsg bizRecommendArticleBizAppMsg = new BizRecommendArticleBizAppMsg();
            DEFAULT_INSTANCE = bizRecommendArticleBizAppMsg;
            C23861l0.registerDefaultInstance(BizRecommendArticleBizAppMsg.class, bizRecommendArticleBizAppMsg);
        }

        private BizRecommendArticleBizAppMsg() {
            C16994k kVar = C16994k.f46000e;
            this.title_ = kVar;
            this.category_ = kVar;
            this.childCategory_ = kVar;
            this.pictureUrl_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addAllNegativeFeedbackReason(Iterable<String> iterable) {
            ensureNegativeFeedbackReasonIsMutable();
            C23810b.addAll(iterable, this.negativeFeedbackReason_);
        }

        /* access modifiers changed from: private */
        public void addAllPictureUrl(Iterable<String> iterable) {
            ensurePictureUrlIsMutable();
            C23810b.addAll(iterable, this.pictureUrl_);
        }

        /* access modifiers changed from: private */
        public void addNegativeFeedbackReason(String str) {
            str.getClass();
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.add(str);
        }

        /* access modifiers changed from: private */
        public void addNegativeFeedbackReasonBytes(C16994k kVar) {
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void addPictureUrl(String str) {
            str.getClass();
            ensurePictureUrlIsMutable();
            this.pictureUrl_.add(str);
        }

        /* access modifiers changed from: private */
        public void addPictureUrlBytes(C16994k kVar) {
            ensurePictureUrlIsMutable();
            this.pictureUrl_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearAppMsgId() {
            this.bitField0_ &= -8193;
            this.appMsgId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAuthorAppUin() {
            this.bitField0_ &= -32769;
            this.authorAppUin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCanPaid() {
            this.bitField0_ &= -131073;
            this.canPaid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCanReward() {
            this.bitField0_ &= -65537;
            this.canReward_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCategory() {
            this.bitField0_ &= -268435457;
            this.category_ = getDefaultInstance().getCategory();
        }

        /* access modifiers changed from: private */
        public void clearChildCategory() {
            this.bitField0_ &= -536870913;
            this.childCategory_ = getDefaultInstance().getChildCategory();
        }

        /* access modifiers changed from: private */
        public void clearContentUrl() {
            this.bitField0_ &= -5;
            this.contentUrl_ = getDefaultInstance().getContentUrl();
        }

        /* access modifiers changed from: private */
        public void clearCoverImgUrl() {
            this.bitField0_ &= -9;
            this.coverImgUrl_ = getDefaultInstance().getCoverImgUrl();
        }

        /* access modifiers changed from: private */
        public void clearCoverImgUrl11() {
            this.bitField0_ &= -17;
            this.coverImgUrl11_ = getDefaultInstance().getCoverImgUrl11();
        }

        /* access modifiers changed from: private */
        public void clearCoverImgUrl2351() {
            this.bitField0_ &= -33;
            this.coverImgUrl2351_ = getDefaultInstance().getCoverImgUrl2351();
        }

        /* access modifiers changed from: private */
        public void clearCreateTime() {
            this.bitField0_ &= -2049;
            this.createTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDigest() {
            this.bitField0_ &= -3;
            this.digest_ = getDefaultInstance().getDigest();
        }

        /* access modifiers changed from: private */
        public void clearExpireTime() {
            this.bitField0_ &= -134217729;
            this.expireTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderFeed() {
            this.finderFeed_ = null;
            this.bitField0_ &= -8388609;
        }

        /* access modifiers changed from: private */
        public void clearItemIdx() {
            this.bitField0_ &= -16385;
            this.itemIdx_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearItemShowType() {
            this.bitField0_ &= -65;
            this.itemShowType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNegativeFeedbackReason() {
            this.negativeFeedbackReason_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearNegativeFeedbackTitle() {
            this.bitField0_ &= -33554433;
            this.negativeFeedbackTitle_ = getDefaultInstance().getNegativeFeedbackTitle();
        }

        /* access modifiers changed from: private */
        public void clearPictureUrl() {
            this.pictureUrl_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearPrice() {
            this.bitField0_ &= -4194305;
            this.price_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecInfo() {
            this.bitField0_ &= -2097153;
            this.recInfo_ = getDefaultInstance().getRecInfo();
        }

        /* access modifiers changed from: private */
        public void clearRecRk() {
            this.bitField0_ &= -1048577;
            this.recRk_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecommendReason() {
            this.bitField0_ &= -16777217;
            this.recommendReason_ = getDefaultInstance().getRecommendReason();
        }

        /* access modifiers changed from: private */
        public void clearShowNegativeFeedbackReason() {
            this.bitField0_ &= -4097;
            this.showNegativeFeedbackReason_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStyleFlag() {
            this.bitField0_ &= -67108865;
            this.styleFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -2;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* access modifiers changed from: private */
        public void clearVideoDuration() {
            this.bitField0_ &= -1025;
            this.videoDuration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVideoHeight() {
            this.bitField0_ &= -513;
            this.videoHeight_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVideoId() {
            this.bitField0_ &= -129;
            this.videoId_ = getDefaultInstance().getVideoId();
        }

        /* access modifiers changed from: private */
        public void clearVideoWidth() {
            this.bitField0_ &= -257;
            this.videoWidth_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVoiceDuration() {
            this.bitField0_ &= -524289;
            this.voiceDuration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVoicePlayUrl() {
            this.bitField0_ &= -262145;
            this.voicePlayUrl_ = getDefaultInstance().getVoicePlayUrl();
        }

        private void ensureNegativeFeedbackReasonIsMutable() {
            C23908o0.C23919j<String> jVar = this.negativeFeedbackReason_;
            if (!jVar.mo37523Q()) {
                this.negativeFeedbackReason_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensurePictureUrlIsMutable() {
            C23908o0.C23919j<String> jVar = this.pictureUrl_;
            if (!jVar.mo37523Q()) {
                this.pictureUrl_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizRecommendArticleBizAppMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeFinderFeed(FinderFeedInfo finderFeedInfo) {
            finderFeedInfo.getClass();
            FinderFeedInfo finderFeedInfo2 = this.finderFeed_;
            if (finderFeedInfo2 == null || finderFeedInfo2 == FinderFeedInfo.getDefaultInstance()) {
                this.finderFeed_ = finderFeedInfo;
            } else {
                this.finderFeed_ = (FinderFeedInfo) ((FinderFeedInfo.Builder) FinderFeedInfo.newBuilder(this.finderFeed_).mergeFrom(finderFeedInfo)).buildPartial();
            }
            this.bitField0_ |= 8388608;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRecommendArticleBizAppMsg parseDelimitedFrom(InputStream inputStream) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(ByteBuffer byteBuffer) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRecommendArticleBizAppMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppMsgId(int i) {
            this.bitField0_ |= 8192;
            this.appMsgId_ = i;
        }

        /* access modifiers changed from: private */
        public void setAuthorAppUin(int i) {
            this.bitField0_ |= 32768;
            this.authorAppUin_ = i;
        }

        /* access modifiers changed from: private */
        public void setCanPaid(int i) {
            this.bitField0_ |= 131072;
            this.canPaid_ = i;
        }

        /* access modifiers changed from: private */
        public void setCanReward(int i) {
            this.bitField0_ |= 65536;
            this.canReward_ = i;
        }

        /* access modifiers changed from: private */
        public void setCategory(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 268435456;
            this.category_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setChildCategory(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 536870912;
            this.childCategory_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setContentUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.contentUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setContentUrlBytes(C16994k kVar) {
            this.contentUrl_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrl(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.coverImgUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrl11(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.coverImgUrl11_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrl11Bytes(C16994k kVar) {
            this.coverImgUrl11_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrl2351(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.coverImgUrl2351_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrl2351Bytes(C16994k kVar) {
            this.coverImgUrl2351_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrlBytes(C16994k kVar) {
            this.coverImgUrl_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setCreateTime(int i) {
            this.bitField0_ |= 2048;
            this.createTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setDigest(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.digest_ = str;
        }

        /* access modifiers changed from: private */
        public void setDigestBytes(C16994k kVar) {
            this.digest_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setExpireTime(int i) {
            this.bitField0_ |= 134217728;
            this.expireTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderFeed(FinderFeedInfo finderFeedInfo) {
            finderFeedInfo.getClass();
            this.finderFeed_ = finderFeedInfo;
            this.bitField0_ |= 8388608;
        }

        /* access modifiers changed from: private */
        public void setItemIdx(int i) {
            this.bitField0_ |= 16384;
            this.itemIdx_ = i;
        }

        /* access modifiers changed from: private */
        public void setItemShowType(int i) {
            this.bitField0_ |= 64;
            this.itemShowType_ = i;
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackReason(int i, String str) {
            str.getClass();
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackTitle(String str) {
            str.getClass();
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
            this.negativeFeedbackTitle_ = str;
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackTitleBytes(C16994k kVar) {
            this.negativeFeedbackTitle_ = kVar.mo18752u();
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        }

        /* access modifiers changed from: private */
        public void setPictureUrl(int i, String str) {
            str.getClass();
            ensurePictureUrlIsMutable();
            this.pictureUrl_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setPrice(int i) {
            this.bitField0_ |= 4194304;
            this.price_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecInfo(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.recInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecInfoBytes(C16994k kVar) {
            this.recInfo_ = kVar.mo18752u();
            this.bitField0_ |= 2097152;
        }

        /* access modifiers changed from: private */
        public void setRecRk(int i) {
            this.bitField0_ |= 1048576;
            this.recRk_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecommendReason(String str) {
            str.getClass();
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            this.recommendReason_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecommendReasonBytes(C16994k kVar) {
            this.recommendReason_ = kVar.mo18752u();
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        }

        /* access modifiers changed from: private */
        public void setShowNegativeFeedbackReason(int i) {
            this.bitField0_ |= 4096;
            this.showNegativeFeedbackReason_ = i;
        }

        /* access modifiers changed from: private */
        public void setStyleFlag(int i) {
            this.bitField0_ |= 67108864;
            this.styleFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setTitle(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.title_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setVideoDuration(int i) {
            this.bitField0_ |= 1024;
            this.videoDuration_ = i;
        }

        /* access modifiers changed from: private */
        public void setVideoHeight(int i) {
            this.bitField0_ |= 512;
            this.videoHeight_ = i;
        }

        /* access modifiers changed from: private */
        public void setVideoId(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.videoId_ = str;
        }

        /* access modifiers changed from: private */
        public void setVideoIdBytes(C16994k kVar) {
            this.videoId_ = kVar.mo18752u();
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setVideoWidth(int i) {
            this.bitField0_ |= 256;
            this.videoWidth_ = i;
        }

        /* access modifiers changed from: private */
        public void setVoiceDuration(int i) {
            this.bitField0_ |= 524288;
            this.voiceDuration_ = i;
        }

        /* access modifiers changed from: private */
        public void setVoicePlayUrl(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.voicePlayUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setVoicePlayUrlBytes(C16994k kVar) {
            this.voicePlayUrl_ = kVar.mo18752u();
            this.bitField0_ |= 262144;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001 \u0000\u0001\u0001' \u0000\u0002\u0000\u0001ည\u0000\u0003ဈ\u0001\u0006ဈ\u0002\bဈ\u0003\tဈ\u0004\nဈ\u0005\u000bဋ\u0006\u000fဈ\u0007\u0010ဋ\b\u0011ဋ\t\u0012ဋ\n\u0013ဋ\u000b\u0014\u001a\u0015ဋ\f\u0016ဋ\r\u0017ဋ\u000e\u0018ဋ\u000f\u0019ဋ\u0010\u001aဋ\u0011\u001bဈ\u0012\u001cဋ\u0013\u001dဋ\u0014\u001eဈ\u0015\u001fဋ\u0016 ဉ\u0017!ဈ\u0018\"ဈ\u0019#ဋ\u001a$ဋ\u001b%ည\u001c&ည\u001d'\u001a", new Object[]{"bitField0_", "title_", "digest_", "contentUrl_", "coverImgUrl_", "coverImgUrl11_", "coverImgUrl2351_", "itemShowType_", "videoId_", "videoWidth_", "videoHeight_", "videoDuration_", "createTime_", "negativeFeedbackReason_", "showNegativeFeedbackReason_", "appMsgId_", "itemIdx_", "authorAppUin_", "canReward_", "canPaid_", "voicePlayUrl_", "voiceDuration_", "recRk_", "recInfo_", "price_", "finderFeed_", "recommendReason_", "negativeFeedbackTitle_", "styleFlag_", "expireTime_", "category_", "childCategory_", "pictureUrl_"});
                case 3:
                    return new BizRecommendArticleBizAppMsg();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRecommendArticleBizAppMsg> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRecommendArticleBizAppMsg.class) {
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

        public int getAppMsgId() {
            return this.appMsgId_;
        }

        public int getAuthorAppUin() {
            return this.authorAppUin_;
        }

        public int getCanPaid() {
            return this.canPaid_;
        }

        public int getCanReward() {
            return this.canReward_;
        }

        public C16994k getCategory() {
            return this.category_;
        }

        public C16994k getChildCategory() {
            return this.childCategory_;
        }

        public String getContentUrl() {
            return this.contentUrl_;
        }

        public C16994k getContentUrlBytes() {
            return C16994k.m16791k(this.contentUrl_);
        }

        public String getCoverImgUrl() {
            return this.coverImgUrl_;
        }

        public String getCoverImgUrl11() {
            return this.coverImgUrl11_;
        }

        public C16994k getCoverImgUrl11Bytes() {
            return C16994k.m16791k(this.coverImgUrl11_);
        }

        public String getCoverImgUrl2351() {
            return this.coverImgUrl2351_;
        }

        public C16994k getCoverImgUrl2351Bytes() {
            return C16994k.m16791k(this.coverImgUrl2351_);
        }

        public C16994k getCoverImgUrlBytes() {
            return C16994k.m16791k(this.coverImgUrl_);
        }

        public int getCreateTime() {
            return this.createTime_;
        }

        public String getDigest() {
            return this.digest_;
        }

        public C16994k getDigestBytes() {
            return C16994k.m16791k(this.digest_);
        }

        public int getExpireTime() {
            return this.expireTime_;
        }

        public FinderFeedInfo getFinderFeed() {
            FinderFeedInfo finderFeedInfo = this.finderFeed_;
            return finderFeedInfo == null ? FinderFeedInfo.getDefaultInstance() : finderFeedInfo;
        }

        public int getItemIdx() {
            return this.itemIdx_;
        }

        public int getItemShowType() {
            return this.itemShowType_;
        }

        public String getNegativeFeedbackReason(int i) {
            return this.negativeFeedbackReason_.get(i);
        }

        public C16994k getNegativeFeedbackReasonBytes(int i) {
            return C16994k.m16791k(this.negativeFeedbackReason_.get(i));
        }

        public int getNegativeFeedbackReasonCount() {
            return this.negativeFeedbackReason_.size();
        }

        public List<String> getNegativeFeedbackReasonList() {
            return this.negativeFeedbackReason_;
        }

        public String getNegativeFeedbackTitle() {
            return this.negativeFeedbackTitle_;
        }

        public C16994k getNegativeFeedbackTitleBytes() {
            return C16994k.m16791k(this.negativeFeedbackTitle_);
        }

        public String getPictureUrl(int i) {
            return this.pictureUrl_.get(i);
        }

        public C16994k getPictureUrlBytes(int i) {
            return C16994k.m16791k(this.pictureUrl_.get(i));
        }

        public int getPictureUrlCount() {
            return this.pictureUrl_.size();
        }

        public List<String> getPictureUrlList() {
            return this.pictureUrl_;
        }

        public int getPrice() {
            return this.price_;
        }

        public String getRecInfo() {
            return this.recInfo_;
        }

        public C16994k getRecInfoBytes() {
            return C16994k.m16791k(this.recInfo_);
        }

        public int getRecRk() {
            return this.recRk_;
        }

        public String getRecommendReason() {
            return this.recommendReason_;
        }

        public C16994k getRecommendReasonBytes() {
            return C16994k.m16791k(this.recommendReason_);
        }

        public int getShowNegativeFeedbackReason() {
            return this.showNegativeFeedbackReason_;
        }

        public int getStyleFlag() {
            return this.styleFlag_;
        }

        public C16994k getTitle() {
            return this.title_;
        }

        public int getVideoDuration() {
            return this.videoDuration_;
        }

        public int getVideoHeight() {
            return this.videoHeight_;
        }

        public String getVideoId() {
            return this.videoId_;
        }

        public C16994k getVideoIdBytes() {
            return C16994k.m16791k(this.videoId_);
        }

        public int getVideoWidth() {
            return this.videoWidth_;
        }

        public int getVoiceDuration() {
            return this.voiceDuration_;
        }

        public String getVoicePlayUrl() {
            return this.voicePlayUrl_;
        }

        public C16994k getVoicePlayUrlBytes() {
            return C16994k.m16791k(this.voicePlayUrl_);
        }

        public boolean hasAppMsgId() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasAuthorAppUin() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasCanPaid() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasCanReward() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasCategory() {
            return (this.bitField0_ & 268435456) != 0;
        }

        public boolean hasChildCategory() {
            return (this.bitField0_ & 536870912) != 0;
        }

        public boolean hasContentUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCoverImgUrl() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasCoverImgUrl11() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasCoverImgUrl2351() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasCreateTime() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasDigest() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasExpireTime() {
            return (this.bitField0_ & 134217728) != 0;
        }

        public boolean hasFinderFeed() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasItemIdx() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasItemShowType() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasNegativeFeedbackTitle() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0;
        }

        public boolean hasPrice() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasRecInfo() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasRecRk() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasRecommendReason() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        }

        public boolean hasShowNegativeFeedbackReason() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasStyleFlag() {
            return (this.bitField0_ & 67108864) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVideoDuration() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasVideoHeight() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasVideoId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasVideoWidth() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasVoiceDuration() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasVoicePlayUrl() {
            return (this.bitField0_ & 262144) != 0;
        }

        public static Builder newBuilder(BizRecommendArticleBizAppMsg bizRecommendArticleBizAppMsg) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRecommendArticleBizAppMsg);
        }

        public static BizRecommendArticleBizAppMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(C16994k kVar) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(byte[] bArr) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(InputStream inputStream) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(C23856l lVar) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRecommendArticleBizAppMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRecommendArticleBizAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleBizAppMsgOrBuilder */
    public interface BizRecommendArticleBizAppMsgOrBuilder extends C23848k1 {
        int getAppMsgId();

        int getAuthorAppUin();

        int getCanPaid();

        int getCanReward();

        C16994k getCategory();

        C16994k getChildCategory();

        String getContentUrl();

        C16994k getContentUrlBytes();

        String getCoverImgUrl();

        String getCoverImgUrl11();

        C16994k getCoverImgUrl11Bytes();

        String getCoverImgUrl2351();

        C16994k getCoverImgUrl2351Bytes();

        C16994k getCoverImgUrlBytes();

        int getCreateTime();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDigest();

        C16994k getDigestBytes();

        int getExpireTime();

        FinderFeedInfo getFinderFeed();

        int getItemIdx();

        int getItemShowType();

        String getNegativeFeedbackReason(int i);

        C16994k getNegativeFeedbackReasonBytes(int i);

        int getNegativeFeedbackReasonCount();

        List<String> getNegativeFeedbackReasonList();

        String getNegativeFeedbackTitle();

        C16994k getNegativeFeedbackTitleBytes();

        String getPictureUrl(int i);

        C16994k getPictureUrlBytes(int i);

        int getPictureUrlCount();

        List<String> getPictureUrlList();

        int getPrice();

        String getRecInfo();

        C16994k getRecInfoBytes();

        int getRecRk();

        String getRecommendReason();

        C16994k getRecommendReasonBytes();

        int getShowNegativeFeedbackReason();

        int getStyleFlag();

        C16994k getTitle();

        int getVideoDuration();

        int getVideoHeight();

        String getVideoId();

        C16994k getVideoIdBytes();

        int getVideoWidth();

        int getVoiceDuration();

        String getVoicePlayUrl();

        C16994k getVoicePlayUrlBytes();

        boolean hasAppMsgId();

        boolean hasAuthorAppUin();

        boolean hasCanPaid();

        boolean hasCanReward();

        boolean hasCategory();

        boolean hasChildCategory();

        boolean hasContentUrl();

        boolean hasCoverImgUrl();

        boolean hasCoverImgUrl11();

        boolean hasCoverImgUrl2351();

        boolean hasCreateTime();

        boolean hasDigest();

        boolean hasExpireTime();

        boolean hasFinderFeed();

        boolean hasItemIdx();

        boolean hasItemShowType();

        boolean hasNegativeFeedbackTitle();

        boolean hasPrice();

        boolean hasRecInfo();

        boolean hasRecRk();

        boolean hasRecommendReason();

        boolean hasShowNegativeFeedbackReason();

        boolean hasStyleFlag();

        boolean hasTitle();

        boolean hasVideoDuration();

        boolean hasVideoHeight();

        boolean hasVideoId();

        boolean hasVideoWidth();

        boolean hasVoiceDuration();

        boolean hasVoicePlayUrl();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleOrBuilder */
    public interface BizRecommendArticleOrBuilder extends C23848k1 {
        String getAggregationTitle();

        C16994k getAggregationTitleBytes();

        String getAggregationUrl();

        C16994k getAggregationUrlBytes();

        int getAppmsgSendTime();

        String getArticleCate();

        C16994k getArticleCateBytes();

        int getAuditStat();

        BizRecommendArticleBizAccount getBizAccount(int i);

        int getBizAccountCount();

        List<BizRecommendArticleBizAccount> getBizAccountList();

        String getCanvasBuffer();

        C16994k getCanvasBufferBytes();

        RecommendLiveCanvasBuffer getCanvasLiveFeeds();

        String getCardId();

        C16994k getCardIdBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getEvent();

        C16994k getEventBytes();

        String getExpType();

        C16994k getExpTypeBytes();

        String getExtraData();

        C16994k getExtraDataBytes();

        int getFailureBehavior();

        NativeFinderFeeds getNativeFinderFeeds();

        String getNegativeFeedbackReason(int i);

        C16994k getNegativeFeedbackReasonBytes(int i);

        int getNegativeFeedbackReasonCount();

        List<String> getNegativeFeedbackReasonList();

        String getNegativeFeedbackTitle();

        C16994k getNegativeFeedbackTitleBytes();

        int getPackageVersion();

        int getPos();

        long getRecID();

        String getRecSummary();

        C16994k getRecSummaryBytes();

        int getRecUniqueFlag();

        BizRecommendArticleRecycleAttr getRecycleAttr();

        int getRedDotFlag();

        int getRetrieveType();

        int getShowNegativeFeedbackReason();

        int getStyle();

        int getSubscribeFilterFlag();

        String getTitle();

        C16994k getTitleBytes();

        int getToprightShowMode();

        int getUseServerTime();

        int getValidityPeriod();

        int getWeight();

        boolean hasAggregationTitle();

        boolean hasAggregationUrl();

        boolean hasAppmsgSendTime();

        boolean hasArticleCate();

        boolean hasAuditStat();

        boolean hasCanvasBuffer();

        boolean hasCanvasLiveFeeds();

        boolean hasCardId();

        boolean hasEvent();

        boolean hasExpType();

        boolean hasExtraData();

        boolean hasFailureBehavior();

        boolean hasNativeFinderFeeds();

        boolean hasNegativeFeedbackTitle();

        boolean hasPackageVersion();

        boolean hasPos();

        boolean hasRecID();

        boolean hasRecSummary();

        boolean hasRecUniqueFlag();

        boolean hasRecycleAttr();

        boolean hasRedDotFlag();

        boolean hasRetrieveType();

        boolean hasShowNegativeFeedbackReason();

        boolean hasStyle();

        boolean hasSubscribeFilterFlag();

        boolean hasTitle();

        boolean hasToprightShowMode();

        boolean hasUseServerTime();

        boolean hasValidityPeriod();

        boolean hasWeight();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleRecycleAttr */
    public static final class BizRecommendArticleRecycleAttr extends C23861l0<BizRecommendArticleRecycleAttr, Builder> implements BizRecommendArticleRecycleAttrOrBuilder {
        public static final int CARDTYPE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BizRecommendArticleRecycleAttr DEFAULT_INSTANCE;
        private static volatile C24062w1<BizRecommendArticleRecycleAttr> PARSER = null;
        public static final int STRATEGY_FIELD_NUMBER = 2;
        private int bitField0_;
        private int cardType_;
        private int strategy_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleRecycleAttr$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRecommendArticleRecycleAttr, Builder> implements BizRecommendArticleRecycleAttrOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder clearCardType() {
                copyOnWrite();
                ((BizRecommendArticleRecycleAttr) this.instance).clearCardType();
                return this;
            }

            public Builder clearStrategy() {
                copyOnWrite();
                ((BizRecommendArticleRecycleAttr) this.instance).clearStrategy();
                return this;
            }

            public int getCardType() {
                return ((BizRecommendArticleRecycleAttr) this.instance).getCardType();
            }

            public int getStrategy() {
                return ((BizRecommendArticleRecycleAttr) this.instance).getStrategy();
            }

            public boolean hasCardType() {
                return ((BizRecommendArticleRecycleAttr) this.instance).hasCardType();
            }

            public boolean hasStrategy() {
                return ((BizRecommendArticleRecycleAttr) this.instance).hasStrategy();
            }

            public Builder setCardType(int i) {
                copyOnWrite();
                ((BizRecommendArticleRecycleAttr) this.instance).setCardType(i);
                return this;
            }

            public Builder setStrategy(int i) {
                copyOnWrite();
                ((BizRecommendArticleRecycleAttr) this.instance).setStrategy(i);
                return this;
            }

            private Builder() {
                super(BizRecommendArticleRecycleAttr.DEFAULT_INSTANCE);
            }
        }

        static {
            BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr = new BizRecommendArticleRecycleAttr();
            DEFAULT_INSTANCE = bizRecommendArticleRecycleAttr;
            C23861l0.registerDefaultInstance(BizRecommendArticleRecycleAttr.class, bizRecommendArticleRecycleAttr);
        }

        private BizRecommendArticleRecycleAttr() {
        }

        /* access modifiers changed from: private */
        public void clearCardType() {
            this.bitField0_ &= -2;
            this.cardType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStrategy() {
            this.bitField0_ &= -3;
            this.strategy_ = 0;
        }

        public static BizRecommendArticleRecycleAttr getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRecommendArticleRecycleAttr parseDelimitedFrom(InputStream inputStream) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(ByteBuffer byteBuffer) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRecommendArticleRecycleAttr> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCardType(int i) {
            this.bitField0_ |= 1;
            this.cardType_ = i;
        }

        /* access modifiers changed from: private */
        public void setStrategy(int i) {
            this.bitField0_ |= 2;
            this.strategy_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "cardType_", "strategy_"});
                case 3:
                    return new BizRecommendArticleRecycleAttr();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRecommendArticleRecycleAttr> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRecommendArticleRecycleAttr.class) {
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

        public int getCardType() {
            return this.cardType_;
        }

        public int getStrategy() {
            return this.strategy_;
        }

        public boolean hasCardType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStrategy() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRecommendArticleRecycleAttr);
        }

        public static BizRecommendArticleRecycleAttr parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(C16994k kVar) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(byte[] bArr) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(InputStream inputStream) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(C23856l lVar) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRecommendArticleRecycleAttr parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRecommendArticleRecycleAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleRecycleAttrOrBuilder */
    public interface BizRecommendArticleRecycleAttrOrBuilder extends C23848k1 {
        int getCardType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getStrategy();

        boolean hasCardType();

        boolean hasStrategy();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleRecycleCardType */
    public enum BizRecommendArticleRecycleCardType implements C23908o0.C23911c {
        RECYCLE_CARD_TYPE_DEFAULT(0),
        RECYCLE_CARD_TYPE_FINDER_HORIZONTAL_SCROLL(1),
        RECYCLE_CARD_TYPE_MASONRY_FEED(2);
        
        public static final int RECYCLE_CARD_TYPE_DEFAULT_VALUE = 0;
        public static final int RECYCLE_CARD_TYPE_FINDER_HORIZONTAL_SCROLL_VALUE = 1;
        public static final int RECYCLE_CARD_TYPE_MASONRY_FEED_VALUE = 2;
        private static final C23908o0.C23912d<BizRecommendArticleRecycleCardType> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleRecycleCardType$BizRecommendArticleRecycleCardTypeVerifier */
        public static final class BizRecommendArticleRecycleCardTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new BizRecommendArticleRecycleCardTypeVerifier();
            }

            private BizRecommendArticleRecycleCardTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return BizRecommendArticleRecycleCardType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<BizRecommendArticleRecycleCardType>() {
                public BizRecommendArticleRecycleCardType findValueByNumber(int i) {
                    return BizRecommendArticleRecycleCardType.forNumber(i);
                }
            };
        }

        private BizRecommendArticleRecycleCardType(int i) {
            this.value = i;
        }

        public static BizRecommendArticleRecycleCardType forNumber(int i) {
            if (i == 0) {
                return RECYCLE_CARD_TYPE_DEFAULT;
            }
            if (i == 1) {
                return RECYCLE_CARD_TYPE_FINDER_HORIZONTAL_SCROLL;
            }
            if (i != 2) {
                return null;
            }
            return RECYCLE_CARD_TYPE_MASONRY_FEED;
        }

        public static C23908o0.C23912d<BizRecommendArticleRecycleCardType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return BizRecommendArticleRecycleCardTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BizRecommendArticleRecycleCardType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleRecycleStrategy */
    public enum BizRecommendArticleRecycleStrategy implements C23908o0.C23911c {
        RECYCLE_STRATEGY_DEFAULT(0),
        RECYCLE_STRATEGY_UNIQUE_CARD(1);
        
        public static final int RECYCLE_STRATEGY_DEFAULT_VALUE = 0;
        public static final int RECYCLE_STRATEGY_UNIQUE_CARD_VALUE = 1;
        private static final C23908o0.C23912d<BizRecommendArticleRecycleStrategy> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleRecycleStrategy$BizRecommendArticleRecycleStrategyVerifier */
        public static final class BizRecommendArticleRecycleStrategyVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new BizRecommendArticleRecycleStrategyVerifier();
            }

            private BizRecommendArticleRecycleStrategyVerifier() {
            }

            public boolean isInRange(int i) {
                return BizRecommendArticleRecycleStrategy.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<BizRecommendArticleRecycleStrategy>() {
                public BizRecommendArticleRecycleStrategy findValueByNumber(int i) {
                    return BizRecommendArticleRecycleStrategy.forNumber(i);
                }
            };
        }

        private BizRecommendArticleRecycleStrategy(int i) {
            this.value = i;
        }

        public static BizRecommendArticleRecycleStrategy forNumber(int i) {
            if (i == 0) {
                return RECYCLE_STRATEGY_DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return RECYCLE_STRATEGY_UNIQUE_CARD;
        }

        public static C23908o0.C23912d<BizRecommendArticleRecycleStrategy> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return BizRecommendArticleRecycleStrategyVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BizRecommendArticleRecycleStrategy valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleXml */
    public static final class BizRecommendArticleXml extends C23861l0<BizRecommendArticleXml, Builder> implements BizRecommendArticleXmlOrBuilder {
        public static final int BIZACCOUNTRECOMMEND_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BizRecommendArticleXml DEFAULT_INSTANCE;
        private static volatile C24062w1<BizRecommendArticleXml> PARSER;
        private int bitField0_;
        private BizRecommendArticle bizAccountRecommend_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleXml$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRecommendArticleXml, Builder> implements BizRecommendArticleXmlOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder clearBizAccountRecommend() {
                copyOnWrite();
                ((BizRecommendArticleXml) this.instance).clearBizAccountRecommend();
                return this;
            }

            public BizRecommendArticle getBizAccountRecommend() {
                return ((BizRecommendArticleXml) this.instance).getBizAccountRecommend();
            }

            public boolean hasBizAccountRecommend() {
                return ((BizRecommendArticleXml) this.instance).hasBizAccountRecommend();
            }

            public Builder mergeBizAccountRecommend(BizRecommendArticle bizRecommendArticle) {
                copyOnWrite();
                ((BizRecommendArticleXml) this.instance).mergeBizAccountRecommend(bizRecommendArticle);
                return this;
            }

            public Builder setBizAccountRecommend(BizRecommendArticle bizRecommendArticle) {
                copyOnWrite();
                ((BizRecommendArticleXml) this.instance).setBizAccountRecommend(bizRecommendArticle);
                return this;
            }

            private Builder() {
                super(BizRecommendArticleXml.DEFAULT_INSTANCE);
            }

            public Builder setBizAccountRecommend(BizRecommendArticle.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticleXml) this.instance).setBizAccountRecommend((BizRecommendArticle) builder.build());
                return this;
            }
        }

        static {
            BizRecommendArticleXml bizRecommendArticleXml = new BizRecommendArticleXml();
            DEFAULT_INSTANCE = bizRecommendArticleXml;
            C23861l0.registerDefaultInstance(BizRecommendArticleXml.class, bizRecommendArticleXml);
        }

        private BizRecommendArticleXml() {
        }

        /* access modifiers changed from: private */
        public void clearBizAccountRecommend() {
            this.bizAccountRecommend_ = null;
            this.bitField0_ &= -2;
        }

        public static BizRecommendArticleXml getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBizAccountRecommend(BizRecommendArticle bizRecommendArticle) {
            bizRecommendArticle.getClass();
            BizRecommendArticle bizRecommendArticle2 = this.bizAccountRecommend_;
            if (bizRecommendArticle2 == null || bizRecommendArticle2 == BizRecommendArticle.getDefaultInstance()) {
                this.bizAccountRecommend_ = bizRecommendArticle;
            } else {
                this.bizAccountRecommend_ = (BizRecommendArticle) ((BizRecommendArticle.Builder) BizRecommendArticle.newBuilder(this.bizAccountRecommend_).mergeFrom(bizRecommendArticle)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRecommendArticleXml parseDelimitedFrom(InputStream inputStream) {
            return (BizRecommendArticleXml) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticleXml parseFrom(ByteBuffer byteBuffer) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRecommendArticleXml> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBizAccountRecommend(BizRecommendArticle bizRecommendArticle) {
            bizRecommendArticle.getClass();
            this.bizAccountRecommend_ = bizRecommendArticle;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "bizAccountRecommend_"});
                case 3:
                    return new BizRecommendArticleXml();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRecommendArticleXml> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRecommendArticleXml.class) {
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

        public BizRecommendArticle getBizAccountRecommend() {
            BizRecommendArticle bizRecommendArticle = this.bizAccountRecommend_;
            return bizRecommendArticle == null ? BizRecommendArticle.getDefaultInstance() : bizRecommendArticle;
        }

        public boolean hasBizAccountRecommend() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizRecommendArticleXml bizRecommendArticleXml) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRecommendArticleXml);
        }

        public static BizRecommendArticleXml parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticleXml) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticleXml parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRecommendArticleXml parseFrom(C16994k kVar) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizRecommendArticleXml parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRecommendArticleXml parseFrom(byte[] bArr) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRecommendArticleXml parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRecommendArticleXml parseFrom(InputStream inputStream) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticleXml parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticleXml parseFrom(C23856l lVar) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRecommendArticleXml parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRecommendArticleXml) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticleXmlOrBuilder */
    public interface BizRecommendArticleXmlOrBuilder extends C23848k1 {
        BizRecommendArticle getBizAccountRecommend();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBizAccountRecommend();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendExptMsg */
    public static final class BizRecommendExptMsg extends C23861l0<BizRecommendExptMsg, Builder> implements BizRecommendExptMsgOrBuilder {
        public static final int APPID_FIELD_NUMBER = 11;
        public static final int BUSINESSID_FIELD_NUMBER = 6;
        public static final int CARDID_FIELD_NUMBER = 7;
        public static final int DATA_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final BizRecommendExptMsg DEFAULT_INSTANCE;
        public static final int EXTRADATA_FIELD_NUMBER = 13;
        public static final int FAILUREBEHAVIOR_FIELD_NUMBER = 16;
        public static final int PACKAGEVERSION_FIELD_NUMBER = 15;
        private static volatile C24062w1<BizRecommendExptMsg> PARSER = null;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int RECID_FIELD_NUMBER = 4;
        public static final int RECSUMMARY_FIELD_NUMBER = 9;
        public static final int RECYCLEATTR_FIELD_NUMBER = 17;
        public static final int REDDOTFLAG_FIELD_NUMBER = 5;
        public static final int TEMPLATEPATHTYPE_FIELD_NUMBER = 14;
        public static final int TEMPLATEPATH_FIELD_NUMBER = 10;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int USESERVERTIME_FIELD_NUMBER = 12;
        public static final int WEIGHT_FIELD_NUMBER = 3;
        private String appId_ = "";
        private int bitField0_;
        private int businessId_;
        private String cardID_ = "";
        private String data_ = "";
        private String extraData_ = "";
        private int failureBehavior_;
        private int packageVersion_;
        private int pos_;
        private long recID_;
        private String recSummary_ = "";
        private BizRecommendArticleRecycleAttr recycleAttr_;
        private int redDotFlag_;
        private String templatePathType_ = "";
        private String templatePath_ = "";
        private String title_ = "";
        private int useServerTime_;
        private int weight_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendExptMsg$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRecommendExptMsg, Builder> implements BizRecommendExptMsgOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder clearAppId() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearAppId();
                return this;
            }

            public Builder clearBusinessId() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearBusinessId();
                return this;
            }

            public Builder clearCardID() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearCardID();
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearData();
                return this;
            }

            public Builder clearExtraData() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearExtraData();
                return this;
            }

            public Builder clearFailureBehavior() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearFailureBehavior();
                return this;
            }

            public Builder clearPackageVersion() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearPackageVersion();
                return this;
            }

            public Builder clearPos() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearPos();
                return this;
            }

            public Builder clearRecID() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearRecID();
                return this;
            }

            public Builder clearRecSummary() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearRecSummary();
                return this;
            }

            public Builder clearRecycleAttr() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearRecycleAttr();
                return this;
            }

            public Builder clearRedDotFlag() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearRedDotFlag();
                return this;
            }

            public Builder clearTemplatePath() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearTemplatePath();
                return this;
            }

            public Builder clearTemplatePathType() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearTemplatePathType();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearTitle();
                return this;
            }

            public Builder clearUseServerTime() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearUseServerTime();
                return this;
            }

            public Builder clearWeight() {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).clearWeight();
                return this;
            }

            public String getAppId() {
                return ((BizRecommendExptMsg) this.instance).getAppId();
            }

            public C16994k getAppIdBytes() {
                return ((BizRecommendExptMsg) this.instance).getAppIdBytes();
            }

            public int getBusinessId() {
                return ((BizRecommendExptMsg) this.instance).getBusinessId();
            }

            public String getCardID() {
                return ((BizRecommendExptMsg) this.instance).getCardID();
            }

            public C16994k getCardIDBytes() {
                return ((BizRecommendExptMsg) this.instance).getCardIDBytes();
            }

            public String getData() {
                return ((BizRecommendExptMsg) this.instance).getData();
            }

            public C16994k getDataBytes() {
                return ((BizRecommendExptMsg) this.instance).getDataBytes();
            }

            public String getExtraData() {
                return ((BizRecommendExptMsg) this.instance).getExtraData();
            }

            public C16994k getExtraDataBytes() {
                return ((BizRecommendExptMsg) this.instance).getExtraDataBytes();
            }

            public int getFailureBehavior() {
                return ((BizRecommendExptMsg) this.instance).getFailureBehavior();
            }

            public int getPackageVersion() {
                return ((BizRecommendExptMsg) this.instance).getPackageVersion();
            }

            public int getPos() {
                return ((BizRecommendExptMsg) this.instance).getPos();
            }

            public long getRecID() {
                return ((BizRecommendExptMsg) this.instance).getRecID();
            }

            public String getRecSummary() {
                return ((BizRecommendExptMsg) this.instance).getRecSummary();
            }

            public C16994k getRecSummaryBytes() {
                return ((BizRecommendExptMsg) this.instance).getRecSummaryBytes();
            }

            public BizRecommendArticleRecycleAttr getRecycleAttr() {
                return ((BizRecommendExptMsg) this.instance).getRecycleAttr();
            }

            public int getRedDotFlag() {
                return ((BizRecommendExptMsg) this.instance).getRedDotFlag();
            }

            public String getTemplatePath() {
                return ((BizRecommendExptMsg) this.instance).getTemplatePath();
            }

            public C16994k getTemplatePathBytes() {
                return ((BizRecommendExptMsg) this.instance).getTemplatePathBytes();
            }

            public String getTemplatePathType() {
                return ((BizRecommendExptMsg) this.instance).getTemplatePathType();
            }

            public C16994k getTemplatePathTypeBytes() {
                return ((BizRecommendExptMsg) this.instance).getTemplatePathTypeBytes();
            }

            public String getTitle() {
                return ((BizRecommendExptMsg) this.instance).getTitle();
            }

            public C16994k getTitleBytes() {
                return ((BizRecommendExptMsg) this.instance).getTitleBytes();
            }

            public int getUseServerTime() {
                return ((BizRecommendExptMsg) this.instance).getUseServerTime();
            }

            public int getWeight() {
                return ((BizRecommendExptMsg) this.instance).getWeight();
            }

            public boolean hasAppId() {
                return ((BizRecommendExptMsg) this.instance).hasAppId();
            }

            public boolean hasBusinessId() {
                return ((BizRecommendExptMsg) this.instance).hasBusinessId();
            }

            public boolean hasCardID() {
                return ((BizRecommendExptMsg) this.instance).hasCardID();
            }

            public boolean hasData() {
                return ((BizRecommendExptMsg) this.instance).hasData();
            }

            public boolean hasExtraData() {
                return ((BizRecommendExptMsg) this.instance).hasExtraData();
            }

            public boolean hasFailureBehavior() {
                return ((BizRecommendExptMsg) this.instance).hasFailureBehavior();
            }

            public boolean hasPackageVersion() {
                return ((BizRecommendExptMsg) this.instance).hasPackageVersion();
            }

            public boolean hasPos() {
                return ((BizRecommendExptMsg) this.instance).hasPos();
            }

            public boolean hasRecID() {
                return ((BizRecommendExptMsg) this.instance).hasRecID();
            }

            public boolean hasRecSummary() {
                return ((BizRecommendExptMsg) this.instance).hasRecSummary();
            }

            public boolean hasRecycleAttr() {
                return ((BizRecommendExptMsg) this.instance).hasRecycleAttr();
            }

            public boolean hasRedDotFlag() {
                return ((BizRecommendExptMsg) this.instance).hasRedDotFlag();
            }

            public boolean hasTemplatePath() {
                return ((BizRecommendExptMsg) this.instance).hasTemplatePath();
            }

            public boolean hasTemplatePathType() {
                return ((BizRecommendExptMsg) this.instance).hasTemplatePathType();
            }

            public boolean hasTitle() {
                return ((BizRecommendExptMsg) this.instance).hasTitle();
            }

            public boolean hasUseServerTime() {
                return ((BizRecommendExptMsg) this.instance).hasUseServerTime();
            }

            public boolean hasWeight() {
                return ((BizRecommendExptMsg) this.instance).hasWeight();
            }

            public Builder mergeRecycleAttr(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).mergeRecycleAttr(bizRecommendArticleRecycleAttr);
                return this;
            }

            public Builder setAppId(String str) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setAppId(str);
                return this;
            }

            public Builder setAppIdBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setAppIdBytes(kVar);
                return this;
            }

            public Builder setBusinessId(int i) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setBusinessId(i);
                return this;
            }

            public Builder setCardID(String str) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setCardID(str);
                return this;
            }

            public Builder setCardIDBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setCardIDBytes(kVar);
                return this;
            }

            public Builder setData(String str) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setData(str);
                return this;
            }

            public Builder setDataBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setDataBytes(kVar);
                return this;
            }

            public Builder setExtraData(String str) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setExtraData(str);
                return this;
            }

            public Builder setExtraDataBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setExtraDataBytes(kVar);
                return this;
            }

            public Builder setFailureBehavior(int i) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setFailureBehavior(i);
                return this;
            }

            public Builder setPackageVersion(int i) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setPackageVersion(i);
                return this;
            }

            public Builder setPos(int i) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setPos(i);
                return this;
            }

            public Builder setRecID(long j) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setRecID(j);
                return this;
            }

            public Builder setRecSummary(String str) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setRecSummary(str);
                return this;
            }

            public Builder setRecSummaryBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setRecSummaryBytes(kVar);
                return this;
            }

            public Builder setRecycleAttr(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setRecycleAttr(bizRecommendArticleRecycleAttr);
                return this;
            }

            public Builder setRedDotFlag(int i) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setRedDotFlag(i);
                return this;
            }

            public Builder setTemplatePath(String str) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setTemplatePath(str);
                return this;
            }

            public Builder setTemplatePathBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setTemplatePathBytes(kVar);
                return this;
            }

            public Builder setTemplatePathType(String str) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setTemplatePathType(str);
                return this;
            }

            public Builder setTemplatePathTypeBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setTemplatePathTypeBytes(kVar);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setTitleBytes(kVar);
                return this;
            }

            public Builder setUseServerTime(int i) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setUseServerTime(i);
                return this;
            }

            public Builder setWeight(int i) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setWeight(i);
                return this;
            }

            private Builder() {
                super(BizRecommendExptMsg.DEFAULT_INSTANCE);
            }

            public Builder setRecycleAttr(BizRecommendArticleRecycleAttr.Builder builder) {
                copyOnWrite();
                ((BizRecommendExptMsg) this.instance).setRecycleAttr((BizRecommendArticleRecycleAttr) builder.build());
                return this;
            }
        }

        static {
            BizRecommendExptMsg bizRecommendExptMsg = new BizRecommendExptMsg();
            DEFAULT_INSTANCE = bizRecommendExptMsg;
            C23861l0.registerDefaultInstance(BizRecommendExptMsg.class, bizRecommendExptMsg);
        }

        private BizRecommendExptMsg() {
        }

        /* access modifiers changed from: private */
        public void clearAppId() {
            this.bitField0_ &= -1025;
            this.appId_ = getDefaultInstance().getAppId();
        }

        /* access modifiers changed from: private */
        public void clearBusinessId() {
            this.bitField0_ &= -33;
            this.businessId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCardID() {
            this.bitField0_ &= -65;
            this.cardID_ = getDefaultInstance().getCardID();
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -129;
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearExtraData() {
            this.bitField0_ &= -4097;
            this.extraData_ = getDefaultInstance().getExtraData();
        }

        /* access modifiers changed from: private */
        public void clearFailureBehavior() {
            this.bitField0_ &= -32769;
            this.failureBehavior_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPackageVersion() {
            this.bitField0_ &= -16385;
            this.packageVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPos() {
            this.bitField0_ &= -3;
            this.pos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecID() {
            this.bitField0_ &= -9;
            this.recID_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecSummary() {
            this.bitField0_ &= -257;
            this.recSummary_ = getDefaultInstance().getRecSummary();
        }

        /* access modifiers changed from: private */
        public void clearRecycleAttr() {
            this.recycleAttr_ = null;
            this.bitField0_ &= -65537;
        }

        /* access modifiers changed from: private */
        public void clearRedDotFlag() {
            this.bitField0_ &= -17;
            this.redDotFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTemplatePath() {
            this.bitField0_ &= -513;
            this.templatePath_ = getDefaultInstance().getTemplatePath();
        }

        /* access modifiers changed from: private */
        public void clearTemplatePathType() {
            this.bitField0_ &= -8193;
            this.templatePathType_ = getDefaultInstance().getTemplatePathType();
        }

        /* access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -2;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* access modifiers changed from: private */
        public void clearUseServerTime() {
            this.bitField0_ &= -2049;
            this.useServerTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWeight() {
            this.bitField0_ &= -5;
            this.weight_ = 0;
        }

        public static BizRecommendExptMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeRecycleAttr(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
            bizRecommendArticleRecycleAttr.getClass();
            BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr2 = this.recycleAttr_;
            if (bizRecommendArticleRecycleAttr2 == null || bizRecommendArticleRecycleAttr2 == BizRecommendArticleRecycleAttr.getDefaultInstance()) {
                this.recycleAttr_ = bizRecommendArticleRecycleAttr;
            } else {
                this.recycleAttr_ = (BizRecommendArticleRecycleAttr) ((BizRecommendArticleRecycleAttr.Builder) BizRecommendArticleRecycleAttr.newBuilder(this.recycleAttr_).mergeFrom(bizRecommendArticleRecycleAttr)).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRecommendExptMsg parseDelimitedFrom(InputStream inputStream) {
            return (BizRecommendExptMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendExptMsg parseFrom(ByteBuffer byteBuffer) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRecommendExptMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppId(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.appId_ = str;
        }

        /* access modifiers changed from: private */
        public void setAppIdBytes(C16994k kVar) {
            this.appId_ = kVar.mo18752u();
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setBusinessId(int i) {
            this.bitField0_ |= 32;
            this.businessId_ = i;
        }

        /* access modifiers changed from: private */
        public void setCardID(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.cardID_ = str;
        }

        /* access modifiers changed from: private */
        public void setCardIDBytes(C16994k kVar) {
            this.cardID_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setData(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.data_ = str;
        }

        /* access modifiers changed from: private */
        public void setDataBytes(C16994k kVar) {
            this.data_ = kVar.mo18752u();
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setExtraData(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.extraData_ = str;
        }

        /* access modifiers changed from: private */
        public void setExtraDataBytes(C16994k kVar) {
            this.extraData_ = kVar.mo18752u();
            this.bitField0_ |= 4096;
        }

        /* access modifiers changed from: private */
        public void setFailureBehavior(int i) {
            this.bitField0_ |= 32768;
            this.failureBehavior_ = i;
        }

        /* access modifiers changed from: private */
        public void setPackageVersion(int i) {
            this.bitField0_ |= 16384;
            this.packageVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setPos(int i) {
            this.bitField0_ |= 2;
            this.pos_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecID(long j) {
            this.bitField0_ |= 8;
            this.recID_ = j;
        }

        /* access modifiers changed from: private */
        public void setRecSummary(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.recSummary_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecSummaryBytes(C16994k kVar) {
            this.recSummary_ = kVar.mo18752u();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setRecycleAttr(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
            bizRecommendArticleRecycleAttr.getClass();
            this.recycleAttr_ = bizRecommendArticleRecycleAttr;
            this.bitField0_ |= 65536;
        }

        /* access modifiers changed from: private */
        public void setRedDotFlag(int i) {
            this.bitField0_ |= 16;
            this.redDotFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setTemplatePath(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.templatePath_ = str;
        }

        /* access modifiers changed from: private */
        public void setTemplatePathBytes(C16994k kVar) {
            this.templatePath_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setTemplatePathType(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.templatePathType_ = str;
        }

        /* access modifiers changed from: private */
        public void setTemplatePathTypeBytes(C16994k kVar) {
            this.templatePathType_ = kVar.mo18752u();
            this.bitField0_ |= 8192;
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
        public void setUseServerTime(int i) {
            this.bitField0_ |= 2048;
            this.useServerTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setWeight(int i) {
            this.bitField0_ |= 4;
            this.weight_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003င\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဋ\u000b\rဈ\f\u000eဈ\r\u000fဋ\u000e\u0010ဋ\u000f\u0011ဉ\u0010", new Object[]{"bitField0_", "title_", "pos_", "weight_", "recID_", "redDotFlag_", "businessId_", "cardID_", "data_", "recSummary_", "templatePath_", "appId_", "useServerTime_", "extraData_", "templatePathType_", "packageVersion_", "failureBehavior_", "recycleAttr_"});
                case 3:
                    return new BizRecommendExptMsg();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRecommendExptMsg> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRecommendExptMsg.class) {
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

        public String getAppId() {
            return this.appId_;
        }

        public C16994k getAppIdBytes() {
            return C16994k.m16791k(this.appId_);
        }

        public int getBusinessId() {
            return this.businessId_;
        }

        public String getCardID() {
            return this.cardID_;
        }

        public C16994k getCardIDBytes() {
            return C16994k.m16791k(this.cardID_);
        }

        public String getData() {
            return this.data_;
        }

        public C16994k getDataBytes() {
            return C16994k.m16791k(this.data_);
        }

        public String getExtraData() {
            return this.extraData_;
        }

        public C16994k getExtraDataBytes() {
            return C16994k.m16791k(this.extraData_);
        }

        public int getFailureBehavior() {
            return this.failureBehavior_;
        }

        public int getPackageVersion() {
            return this.packageVersion_;
        }

        public int getPos() {
            return this.pos_;
        }

        public long getRecID() {
            return this.recID_;
        }

        public String getRecSummary() {
            return this.recSummary_;
        }

        public C16994k getRecSummaryBytes() {
            return C16994k.m16791k(this.recSummary_);
        }

        public BizRecommendArticleRecycleAttr getRecycleAttr() {
            BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr = this.recycleAttr_;
            return bizRecommendArticleRecycleAttr == null ? BizRecommendArticleRecycleAttr.getDefaultInstance() : bizRecommendArticleRecycleAttr;
        }

        public int getRedDotFlag() {
            return this.redDotFlag_;
        }

        public String getTemplatePath() {
            return this.templatePath_;
        }

        public C16994k getTemplatePathBytes() {
            return C16994k.m16791k(this.templatePath_);
        }

        public String getTemplatePathType() {
            return this.templatePathType_;
        }

        public C16994k getTemplatePathTypeBytes() {
            return C16994k.m16791k(this.templatePathType_);
        }

        public String getTitle() {
            return this.title_;
        }

        public C16994k getTitleBytes() {
            return C16994k.m16791k(this.title_);
        }

        public int getUseServerTime() {
            return this.useServerTime_;
        }

        public int getWeight() {
            return this.weight_;
        }

        public boolean hasAppId() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasBusinessId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasCardID() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasData() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasExtraData() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasFailureBehavior() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasPackageVersion() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasPos() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRecID() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRecSummary() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasRecycleAttr() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasRedDotFlag() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasTemplatePath() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasTemplatePathType() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUseServerTime() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasWeight() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(BizRecommendExptMsg bizRecommendExptMsg) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRecommendExptMsg);
        }

        public static BizRecommendExptMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendExptMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendExptMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRecommendExptMsg parseFrom(C16994k kVar) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizRecommendExptMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRecommendExptMsg parseFrom(byte[] bArr) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRecommendExptMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRecommendExptMsg parseFrom(InputStream inputStream) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendExptMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendExptMsg parseFrom(C23856l lVar) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRecommendExptMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRecommendExptMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendExptMsgOrBuilder */
    public interface BizRecommendExptMsgOrBuilder extends C23848k1 {
        String getAppId();

        C16994k getAppIdBytes();

        int getBusinessId();

        String getCardID();

        C16994k getCardIDBytes();

        String getData();

        C16994k getDataBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getExtraData();

        C16994k getExtraDataBytes();

        int getFailureBehavior();

        int getPackageVersion();

        int getPos();

        long getRecID();

        String getRecSummary();

        C16994k getRecSummaryBytes();

        BizRecommendArticleRecycleAttr getRecycleAttr();

        int getRedDotFlag();

        String getTemplatePath();

        C16994k getTemplatePathBytes();

        String getTemplatePathType();

        C16994k getTemplatePathTypeBytes();

        String getTitle();

        C16994k getTitleBytes();

        int getUseServerTime();

        int getWeight();

        boolean hasAppId();

        boolean hasBusinessId();

        boolean hasCardID();

        boolean hasData();

        boolean hasExtraData();

        boolean hasFailureBehavior();

        boolean hasPackageVersion();

        boolean hasPos();

        boolean hasRecID();

        boolean hasRecSummary();

        boolean hasRecycleAttr();

        boolean hasRedDotFlag();

        boolean hasTemplatePath();

        boolean hasTemplatePathType();

        boolean hasTitle();

        boolean hasUseServerTime();

        boolean hasWeight();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendExptXml */
    public static final class BizRecommendExptXml extends C23861l0<BizRecommendExptXml, Builder> implements BizRecommendExptXmlOrBuilder {
        public static final int BIZRECOMMENDEXPT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BizRecommendExptXml DEFAULT_INSTANCE;
        private static volatile C24062w1<BizRecommendExptXml> PARSER;
        private int bitField0_;
        private BizRecommendExptMsg bizRecommendExpt_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendExptXml$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRecommendExptXml, Builder> implements BizRecommendExptXmlOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder clearBizRecommendExpt() {
                copyOnWrite();
                ((BizRecommendExptXml) this.instance).clearBizRecommendExpt();
                return this;
            }

            public BizRecommendExptMsg getBizRecommendExpt() {
                return ((BizRecommendExptXml) this.instance).getBizRecommendExpt();
            }

            public boolean hasBizRecommendExpt() {
                return ((BizRecommendExptXml) this.instance).hasBizRecommendExpt();
            }

            public Builder mergeBizRecommendExpt(BizRecommendExptMsg bizRecommendExptMsg) {
                copyOnWrite();
                ((BizRecommendExptXml) this.instance).mergeBizRecommendExpt(bizRecommendExptMsg);
                return this;
            }

            public Builder setBizRecommendExpt(BizRecommendExptMsg bizRecommendExptMsg) {
                copyOnWrite();
                ((BizRecommendExptXml) this.instance).setBizRecommendExpt(bizRecommendExptMsg);
                return this;
            }

            private Builder() {
                super(BizRecommendExptXml.DEFAULT_INSTANCE);
            }

            public Builder setBizRecommendExpt(BizRecommendExptMsg.Builder builder) {
                copyOnWrite();
                ((BizRecommendExptXml) this.instance).setBizRecommendExpt((BizRecommendExptMsg) builder.build());
                return this;
            }
        }

        static {
            BizRecommendExptXml bizRecommendExptXml = new BizRecommendExptXml();
            DEFAULT_INSTANCE = bizRecommendExptXml;
            C23861l0.registerDefaultInstance(BizRecommendExptXml.class, bizRecommendExptXml);
        }

        private BizRecommendExptXml() {
        }

        /* access modifiers changed from: private */
        public void clearBizRecommendExpt() {
            this.bizRecommendExpt_ = null;
            this.bitField0_ &= -2;
        }

        public static BizRecommendExptXml getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBizRecommendExpt(BizRecommendExptMsg bizRecommendExptMsg) {
            bizRecommendExptMsg.getClass();
            BizRecommendExptMsg bizRecommendExptMsg2 = this.bizRecommendExpt_;
            if (bizRecommendExptMsg2 == null || bizRecommendExptMsg2 == BizRecommendExptMsg.getDefaultInstance()) {
                this.bizRecommendExpt_ = bizRecommendExptMsg;
            } else {
                this.bizRecommendExpt_ = (BizRecommendExptMsg) ((BizRecommendExptMsg.Builder) BizRecommendExptMsg.newBuilder(this.bizRecommendExpt_).mergeFrom(bizRecommendExptMsg)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRecommendExptXml parseDelimitedFrom(InputStream inputStream) {
            return (BizRecommendExptXml) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendExptXml parseFrom(ByteBuffer byteBuffer) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRecommendExptXml> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBizRecommendExpt(BizRecommendExptMsg bizRecommendExptMsg) {
            bizRecommendExptMsg.getClass();
            this.bizRecommendExpt_ = bizRecommendExptMsg;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "bizRecommendExpt_"});
                case 3:
                    return new BizRecommendExptXml();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRecommendExptXml> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRecommendExptXml.class) {
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

        public BizRecommendExptMsg getBizRecommendExpt() {
            BizRecommendExptMsg bizRecommendExptMsg = this.bizRecommendExpt_;
            return bizRecommendExptMsg == null ? BizRecommendExptMsg.getDefaultInstance() : bizRecommendExptMsg;
        }

        public boolean hasBizRecommendExpt() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizRecommendExptXml bizRecommendExptXml) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRecommendExptXml);
        }

        public static BizRecommendExptXml parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendExptXml) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendExptXml parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRecommendExptXml parseFrom(C16994k kVar) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizRecommendExptXml parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRecommendExptXml parseFrom(byte[] bArr) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRecommendExptXml parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRecommendExptXml parseFrom(InputStream inputStream) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendExptXml parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendExptXml parseFrom(C23856l lVar) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRecommendExptXml parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRecommendExptXml) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendExptXmlOrBuilder */
    public interface BizRecommendExptXmlOrBuilder extends C23848k1 {
        BizRecommendExptMsg getBizRecommendExpt();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBizRecommendExpt();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo */
    public static final class FinderFeedInfo extends C23861l0<FinderFeedInfo, Builder> implements FinderFeedInfoOrBuilder {
        public static final int AVATAR_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final FinderFeedInfo DEFAULT_INSTANCE;
        public static final int DESC_FIELD_NUMBER = 7;
        public static final int EXPORT_ID_FIELD_NUMBER = 12;
        public static final int FEED_TYPE_FIELD_NUMBER = 3;
        public static final int LOCAL_ID_FIELD_NUMBER = 9;
        public static final int MEDIA_COUNT_FIELD_NUMBER = 8;
        public static final int MEDIA_LIST_FIELD_NUMBER = 10;
        public static final int MEGA_VIDEO_FIELD_NUMBER = 11;
        public static final int NICKNAME_FIELD_NUMBER = 4;
        public static final int OBJECT_ID_FIELD_NUMBER = 1;
        public static final int OBJECT_NONCE_ID_FIELD_NUMBER = 2;
        private static volatile C24062w1<FinderFeedInfo> PARSER = null;
        public static final int USERNAME_FIELD_NUMBER = 5;
        private String avatar_ = "";
        private int bitField0_;
        private String desc_ = "";
        private String exportId_ = "";
        private int feedType_;
        private int localId_;
        private int mediaCount_;
        private MediaList mediaList_;
        private MegaVideo megaVideo_;
        private String nickname_ = "";
        private String objectId_ = "";
        private String objectNonceId_ = "";
        private String username_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<FinderFeedInfo, Builder> implements FinderFeedInfoOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder clearAvatar() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearAvatar();
                return this;
            }

            public Builder clearDesc() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearDesc();
                return this;
            }

            public Builder clearExportId() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearExportId();
                return this;
            }

            public Builder clearFeedType() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearFeedType();
                return this;
            }

            public Builder clearLocalId() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearLocalId();
                return this;
            }

            public Builder clearMediaCount() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearMediaCount();
                return this;
            }

            public Builder clearMediaList() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearMediaList();
                return this;
            }

            public Builder clearMegaVideo() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearMegaVideo();
                return this;
            }

            public Builder clearNickname() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearNickname();
                return this;
            }

            public Builder clearObjectId() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearObjectId();
                return this;
            }

            public Builder clearObjectNonceId() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearObjectNonceId();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).clearUsername();
                return this;
            }

            public String getAvatar() {
                return ((FinderFeedInfo) this.instance).getAvatar();
            }

            public C16994k getAvatarBytes() {
                return ((FinderFeedInfo) this.instance).getAvatarBytes();
            }

            public String getDesc() {
                return ((FinderFeedInfo) this.instance).getDesc();
            }

            public C16994k getDescBytes() {
                return ((FinderFeedInfo) this.instance).getDescBytes();
            }

            public String getExportId() {
                return ((FinderFeedInfo) this.instance).getExportId();
            }

            public C16994k getExportIdBytes() {
                return ((FinderFeedInfo) this.instance).getExportIdBytes();
            }

            public int getFeedType() {
                return ((FinderFeedInfo) this.instance).getFeedType();
            }

            public int getLocalId() {
                return ((FinderFeedInfo) this.instance).getLocalId();
            }

            public int getMediaCount() {
                return ((FinderFeedInfo) this.instance).getMediaCount();
            }

            public MediaList getMediaList() {
                return ((FinderFeedInfo) this.instance).getMediaList();
            }

            public MegaVideo getMegaVideo() {
                return ((FinderFeedInfo) this.instance).getMegaVideo();
            }

            public String getNickname() {
                return ((FinderFeedInfo) this.instance).getNickname();
            }

            public C16994k getNicknameBytes() {
                return ((FinderFeedInfo) this.instance).getNicknameBytes();
            }

            public String getObjectId() {
                return ((FinderFeedInfo) this.instance).getObjectId();
            }

            public C16994k getObjectIdBytes() {
                return ((FinderFeedInfo) this.instance).getObjectIdBytes();
            }

            public String getObjectNonceId() {
                return ((FinderFeedInfo) this.instance).getObjectNonceId();
            }

            public C16994k getObjectNonceIdBytes() {
                return ((FinderFeedInfo) this.instance).getObjectNonceIdBytes();
            }

            public String getUsername() {
                return ((FinderFeedInfo) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((FinderFeedInfo) this.instance).getUsernameBytes();
            }

            public boolean hasAvatar() {
                return ((FinderFeedInfo) this.instance).hasAvatar();
            }

            public boolean hasDesc() {
                return ((FinderFeedInfo) this.instance).hasDesc();
            }

            public boolean hasExportId() {
                return ((FinderFeedInfo) this.instance).hasExportId();
            }

            public boolean hasFeedType() {
                return ((FinderFeedInfo) this.instance).hasFeedType();
            }

            public boolean hasLocalId() {
                return ((FinderFeedInfo) this.instance).hasLocalId();
            }

            public boolean hasMediaCount() {
                return ((FinderFeedInfo) this.instance).hasMediaCount();
            }

            public boolean hasMediaList() {
                return ((FinderFeedInfo) this.instance).hasMediaList();
            }

            public boolean hasMegaVideo() {
                return ((FinderFeedInfo) this.instance).hasMegaVideo();
            }

            public boolean hasNickname() {
                return ((FinderFeedInfo) this.instance).hasNickname();
            }

            public boolean hasObjectId() {
                return ((FinderFeedInfo) this.instance).hasObjectId();
            }

            public boolean hasObjectNonceId() {
                return ((FinderFeedInfo) this.instance).hasObjectNonceId();
            }

            public boolean hasUsername() {
                return ((FinderFeedInfo) this.instance).hasUsername();
            }

            public Builder mergeMediaList(MediaList mediaList) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).mergeMediaList(mediaList);
                return this;
            }

            public Builder mergeMegaVideo(MegaVideo megaVideo) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).mergeMegaVideo(megaVideo);
                return this;
            }

            public Builder setAvatar(String str) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setAvatar(str);
                return this;
            }

            public Builder setAvatarBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setAvatarBytes(kVar);
                return this;
            }

            public Builder setDesc(String str) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setDesc(str);
                return this;
            }

            public Builder setDescBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setDescBytes(kVar);
                return this;
            }

            public Builder setExportId(String str) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setExportId(str);
                return this;
            }

            public Builder setExportIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setExportIdBytes(kVar);
                return this;
            }

            public Builder setFeedType(int i) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setFeedType(i);
                return this;
            }

            public Builder setLocalId(int i) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setLocalId(i);
                return this;
            }

            public Builder setMediaCount(int i) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setMediaCount(i);
                return this;
            }

            public Builder setMediaList(MediaList mediaList) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setMediaList(mediaList);
                return this;
            }

            public Builder setMegaVideo(MegaVideo megaVideo) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setMegaVideo(megaVideo);
                return this;
            }

            public Builder setNickname(String str) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setNickname(str);
                return this;
            }

            public Builder setNicknameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setNicknameBytes(kVar);
                return this;
            }

            public Builder setObjectId(String str) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setObjectId(str);
                return this;
            }

            public Builder setObjectIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setObjectIdBytes(kVar);
                return this;
            }

            public Builder setObjectNonceId(String str) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setObjectNonceId(str);
                return this;
            }

            public Builder setObjectNonceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setObjectNonceIdBytes(kVar);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderFeedInfo.DEFAULT_INSTANCE);
            }

            public Builder setMediaList(MediaList.Builder builder) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setMediaList((MediaList) builder.build());
                return this;
            }

            public Builder setMegaVideo(MegaVideo.Builder builder) {
                copyOnWrite();
                ((FinderFeedInfo) this.instance).setMegaVideo((MegaVideo) builder.build());
                return this;
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MediaList */
        public static final class MediaList extends C23861l0<MediaList, Builder> implements MediaListOrBuilder {
            /* access modifiers changed from: private */
            public static final MediaList DEFAULT_INSTANCE;
            public static final int MEDIA_FIELD_NUMBER = 1;
            private static volatile C24062w1<MediaList> PARSER;
            private C23908o0.C23919j<Media> media_ = C23861l0.emptyProtobufList();

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MediaList$Builder */
            public static final class Builder extends C23861l0.C23862a<MediaList, Builder> implements MediaListOrBuilder {
                public /* synthetic */ Builder(C243631 r1) {
                    this();
                }

                public Builder addAllMedia(Iterable<? extends Media> iterable) {
                    copyOnWrite();
                    ((MediaList) this.instance).addAllMedia(iterable);
                    return this;
                }

                public Builder addMedia(Media media) {
                    copyOnWrite();
                    ((MediaList) this.instance).addMedia(media);
                    return this;
                }

                public Builder clearMedia() {
                    copyOnWrite();
                    ((MediaList) this.instance).clearMedia();
                    return this;
                }

                public Media getMedia(int i) {
                    return ((MediaList) this.instance).getMedia(i);
                }

                public int getMediaCount() {
                    return ((MediaList) this.instance).getMediaCount();
                }

                public List<Media> getMediaList() {
                    return Collections.unmodifiableList(((MediaList) this.instance).getMediaList());
                }

                public Builder removeMedia(int i) {
                    copyOnWrite();
                    ((MediaList) this.instance).removeMedia(i);
                    return this;
                }

                public Builder setMedia(int i, Media media) {
                    copyOnWrite();
                    ((MediaList) this.instance).setMedia(i, media);
                    return this;
                }

                private Builder() {
                    super(MediaList.DEFAULT_INSTANCE);
                }

                public Builder addMedia(int i, Media media) {
                    copyOnWrite();
                    ((MediaList) this.instance).addMedia(i, media);
                    return this;
                }

                public Builder setMedia(int i, Media.Builder builder) {
                    copyOnWrite();
                    ((MediaList) this.instance).setMedia(i, (Media) builder.build());
                    return this;
                }

                public Builder addMedia(Media.Builder builder) {
                    copyOnWrite();
                    ((MediaList) this.instance).addMedia((Media) builder.build());
                    return this;
                }

                public Builder addMedia(int i, Media.Builder builder) {
                    copyOnWrite();
                    ((MediaList) this.instance).addMedia(i, (Media) builder.build());
                    return this;
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MediaList$Media */
            public static final class Media extends C23861l0<Media, Builder> implements MediaOrBuilder {
                /* access modifiers changed from: private */
                public static final Media DEFAULT_INSTANCE;
                public static final int FULL_CLIP_INSET_FIELD_NUMBER = 4;
                public static final int FULL_COVER_URL_FIELD_NUMBER = 3;
                public static final int HEIGHT_FIELD_NUMBER = 6;
                public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
                private static volatile C24062w1<Media> PARSER = null;
                public static final int THUMB_URL_FIELD_NUMBER = 2;
                public static final int VIDEO_PLAY_DURATION_FIELD_NUMBER = 7;
                public static final int WIDTH_FIELD_NUMBER = 5;
                private int bitField0_;
                private String fullClipInset_ = "";
                private String fullCoverUrl_ = "";
                private int height_;
                private int mediaType_;
                private String thumbUrl_ = "";
                private int videoPlayDuration_;
                private int width_;

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MediaList$Media$Builder */
                public static final class Builder extends C23861l0.C23862a<Media, Builder> implements MediaOrBuilder {
                    public /* synthetic */ Builder(C243631 r1) {
                        this();
                    }

                    public Builder clearFullClipInset() {
                        copyOnWrite();
                        ((Media) this.instance).clearFullClipInset();
                        return this;
                    }

                    public Builder clearFullCoverUrl() {
                        copyOnWrite();
                        ((Media) this.instance).clearFullCoverUrl();
                        return this;
                    }

                    public Builder clearHeight() {
                        copyOnWrite();
                        ((Media) this.instance).clearHeight();
                        return this;
                    }

                    public Builder clearMediaType() {
                        copyOnWrite();
                        ((Media) this.instance).clearMediaType();
                        return this;
                    }

                    public Builder clearThumbUrl() {
                        copyOnWrite();
                        ((Media) this.instance).clearThumbUrl();
                        return this;
                    }

                    public Builder clearVideoPlayDuration() {
                        copyOnWrite();
                        ((Media) this.instance).clearVideoPlayDuration();
                        return this;
                    }

                    public Builder clearWidth() {
                        copyOnWrite();
                        ((Media) this.instance).clearWidth();
                        return this;
                    }

                    public String getFullClipInset() {
                        return ((Media) this.instance).getFullClipInset();
                    }

                    public C16994k getFullClipInsetBytes() {
                        return ((Media) this.instance).getFullClipInsetBytes();
                    }

                    public String getFullCoverUrl() {
                        return ((Media) this.instance).getFullCoverUrl();
                    }

                    public C16994k getFullCoverUrlBytes() {
                        return ((Media) this.instance).getFullCoverUrlBytes();
                    }

                    public int getHeight() {
                        return ((Media) this.instance).getHeight();
                    }

                    public int getMediaType() {
                        return ((Media) this.instance).getMediaType();
                    }

                    public String getThumbUrl() {
                        return ((Media) this.instance).getThumbUrl();
                    }

                    public C16994k getThumbUrlBytes() {
                        return ((Media) this.instance).getThumbUrlBytes();
                    }

                    public int getVideoPlayDuration() {
                        return ((Media) this.instance).getVideoPlayDuration();
                    }

                    public int getWidth() {
                        return ((Media) this.instance).getWidth();
                    }

                    public boolean hasFullClipInset() {
                        return ((Media) this.instance).hasFullClipInset();
                    }

                    public boolean hasFullCoverUrl() {
                        return ((Media) this.instance).hasFullCoverUrl();
                    }

                    public boolean hasHeight() {
                        return ((Media) this.instance).hasHeight();
                    }

                    public boolean hasMediaType() {
                        return ((Media) this.instance).hasMediaType();
                    }

                    public boolean hasThumbUrl() {
                        return ((Media) this.instance).hasThumbUrl();
                    }

                    public boolean hasVideoPlayDuration() {
                        return ((Media) this.instance).hasVideoPlayDuration();
                    }

                    public boolean hasWidth() {
                        return ((Media) this.instance).hasWidth();
                    }

                    public Builder setFullClipInset(String str) {
                        copyOnWrite();
                        ((Media) this.instance).setFullClipInset(str);
                        return this;
                    }

                    public Builder setFullClipInsetBytes(C16994k kVar) {
                        copyOnWrite();
                        ((Media) this.instance).setFullClipInsetBytes(kVar);
                        return this;
                    }

                    public Builder setFullCoverUrl(String str) {
                        copyOnWrite();
                        ((Media) this.instance).setFullCoverUrl(str);
                        return this;
                    }

                    public Builder setFullCoverUrlBytes(C16994k kVar) {
                        copyOnWrite();
                        ((Media) this.instance).setFullCoverUrlBytes(kVar);
                        return this;
                    }

                    public Builder setHeight(int i) {
                        copyOnWrite();
                        ((Media) this.instance).setHeight(i);
                        return this;
                    }

                    public Builder setMediaType(int i) {
                        copyOnWrite();
                        ((Media) this.instance).setMediaType(i);
                        return this;
                    }

                    public Builder setThumbUrl(String str) {
                        copyOnWrite();
                        ((Media) this.instance).setThumbUrl(str);
                        return this;
                    }

                    public Builder setThumbUrlBytes(C16994k kVar) {
                        copyOnWrite();
                        ((Media) this.instance).setThumbUrlBytes(kVar);
                        return this;
                    }

                    public Builder setVideoPlayDuration(int i) {
                        copyOnWrite();
                        ((Media) this.instance).setVideoPlayDuration(i);
                        return this;
                    }

                    public Builder setWidth(int i) {
                        copyOnWrite();
                        ((Media) this.instance).setWidth(i);
                        return this;
                    }

                    private Builder() {
                        super(Media.DEFAULT_INSTANCE);
                    }
                }

                static {
                    Media media = new Media();
                    DEFAULT_INSTANCE = media;
                    C23861l0.registerDefaultInstance(Media.class, media);
                }

                private Media() {
                }

                /* access modifiers changed from: private */
                public void clearFullClipInset() {
                    this.bitField0_ &= -9;
                    this.fullClipInset_ = getDefaultInstance().getFullClipInset();
                }

                /* access modifiers changed from: private */
                public void clearFullCoverUrl() {
                    this.bitField0_ &= -5;
                    this.fullCoverUrl_ = getDefaultInstance().getFullCoverUrl();
                }

                /* access modifiers changed from: private */
                public void clearHeight() {
                    this.bitField0_ &= -33;
                    this.height_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearMediaType() {
                    this.bitField0_ &= -2;
                    this.mediaType_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearThumbUrl() {
                    this.bitField0_ &= -3;
                    this.thumbUrl_ = getDefaultInstance().getThumbUrl();
                }

                /* access modifiers changed from: private */
                public void clearVideoPlayDuration() {
                    this.bitField0_ &= -65;
                    this.videoPlayDuration_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearWidth() {
                    this.bitField0_ &= -17;
                    this.width_ = 0;
                }

                public static Media getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Builder newBuilder() {
                    return (Builder) DEFAULT_INSTANCE.createBuilder();
                }

                public static Media parseDelimitedFrom(InputStream inputStream) {
                    return (Media) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Media parseFrom(ByteBuffer byteBuffer) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static C24062w1<Media> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* access modifiers changed from: private */
                public void setFullClipInset(String str) {
                    str.getClass();
                    this.bitField0_ |= 8;
                    this.fullClipInset_ = str;
                }

                /* access modifiers changed from: private */
                public void setFullClipInsetBytes(C16994k kVar) {
                    this.fullClipInset_ = kVar.mo18752u();
                    this.bitField0_ |= 8;
                }

                /* access modifiers changed from: private */
                public void setFullCoverUrl(String str) {
                    str.getClass();
                    this.bitField0_ |= 4;
                    this.fullCoverUrl_ = str;
                }

                /* access modifiers changed from: private */
                public void setFullCoverUrlBytes(C16994k kVar) {
                    this.fullCoverUrl_ = kVar.mo18752u();
                    this.bitField0_ |= 4;
                }

                /* access modifiers changed from: private */
                public void setHeight(int i) {
                    this.bitField0_ |= 32;
                    this.height_ = i;
                }

                /* access modifiers changed from: private */
                public void setMediaType(int i) {
                    this.bitField0_ |= 1;
                    this.mediaType_ = i;
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
                public void setVideoPlayDuration(int i) {
                    this.bitField0_ |= 64;
                    this.videoPlayDuration_ = i;
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
                            return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"bitField0_", "mediaType_", "thumbUrl_", "fullCoverUrl_", "fullClipInset_", "width_", "height_", "videoPlayDuration_"});
                        case 3:
                            return new Media();
                        case 4:
                            return new Builder((C243631) null);
                        case 5:
                            return DEFAULT_INSTANCE;
                        case 6:
                            C24062w1<Media> w1Var = PARSER;
                            if (w1Var == null) {
                                synchronized (Media.class) {
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

                public String getFullClipInset() {
                    return this.fullClipInset_;
                }

                public C16994k getFullClipInsetBytes() {
                    return C16994k.m16791k(this.fullClipInset_);
                }

                public String getFullCoverUrl() {
                    return this.fullCoverUrl_;
                }

                public C16994k getFullCoverUrlBytes() {
                    return C16994k.m16791k(this.fullCoverUrl_);
                }

                public int getHeight() {
                    return this.height_;
                }

                public int getMediaType() {
                    return this.mediaType_;
                }

                public String getThumbUrl() {
                    return this.thumbUrl_;
                }

                public C16994k getThumbUrlBytes() {
                    return C16994k.m16791k(this.thumbUrl_);
                }

                public int getVideoPlayDuration() {
                    return this.videoPlayDuration_;
                }

                public int getWidth() {
                    return this.width_;
                }

                public boolean hasFullClipInset() {
                    return (this.bitField0_ & 8) != 0;
                }

                public boolean hasFullCoverUrl() {
                    return (this.bitField0_ & 4) != 0;
                }

                public boolean hasHeight() {
                    return (this.bitField0_ & 32) != 0;
                }

                public boolean hasMediaType() {
                    return (this.bitField0_ & 1) != 0;
                }

                public boolean hasThumbUrl() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasVideoPlayDuration() {
                    return (this.bitField0_ & 64) != 0;
                }

                public boolean hasWidth() {
                    return (this.bitField0_ & 16) != 0;
                }

                public static Builder newBuilder(Media media) {
                    return (Builder) DEFAULT_INSTANCE.createBuilder(media);
                }

                public static Media parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (Media) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static Media parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                }

                public static Media parseFrom(C16994k kVar) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                }

                public static Media parseFrom(C16994k kVar, C23806a0 a0Var) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                }

                public static Media parseFrom(byte[] bArr) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static Media parseFrom(byte[] bArr, C23806a0 a0Var) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                }

                public static Media parseFrom(InputStream inputStream) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static Media parseFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static Media parseFrom(C23856l lVar) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                }

                public static Media parseFrom(C23856l lVar, C23806a0 a0Var) {
                    return (Media) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MediaList$MediaOrBuilder */
            public interface MediaOrBuilder extends C23848k1 {
                /* synthetic */ C23845j1 getDefaultInstanceForType();

                String getFullClipInset();

                C16994k getFullClipInsetBytes();

                String getFullCoverUrl();

                C16994k getFullCoverUrlBytes();

                int getHeight();

                int getMediaType();

                String getThumbUrl();

                C16994k getThumbUrlBytes();

                int getVideoPlayDuration();

                int getWidth();

                boolean hasFullClipInset();

                boolean hasFullCoverUrl();

                boolean hasHeight();

                boolean hasMediaType();

                boolean hasThumbUrl();

                boolean hasVideoPlayDuration();

                boolean hasWidth();

                /* synthetic */ boolean isInitialized();
            }

            static {
                MediaList mediaList = new MediaList();
                DEFAULT_INSTANCE = mediaList;
                C23861l0.registerDefaultInstance(MediaList.class, mediaList);
            }

            private MediaList() {
            }

            /* access modifiers changed from: private */
            public void addAllMedia(Iterable<? extends Media> iterable) {
                ensureMediaIsMutable();
                C23810b.addAll(iterable, this.media_);
            }

            /* access modifiers changed from: private */
            public void addMedia(Media media) {
                media.getClass();
                ensureMediaIsMutable();
                this.media_.add(media);
            }

            /* access modifiers changed from: private */
            public void clearMedia() {
                this.media_ = C23861l0.emptyProtobufList();
            }

            private void ensureMediaIsMutable() {
                C23908o0.C23919j<Media> jVar = this.media_;
                if (!jVar.mo37523Q()) {
                    this.media_ = C23861l0.mutableCopy(jVar);
                }
            }

            public static MediaList getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static MediaList parseDelimitedFrom(InputStream inputStream) {
                return (MediaList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MediaList parseFrom(ByteBuffer byteBuffer) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<MediaList> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeMedia(int i) {
                ensureMediaIsMutable();
                this.media_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setMedia(int i, Media media) {
                media.getClass();
                ensureMediaIsMutable();
                this.media_.set(i, media);
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"media_", Media.class});
                    case 3:
                        return new MediaList();
                    case 4:
                        return new Builder((C243631) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<MediaList> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (MediaList.class) {
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

            public Media getMedia(int i) {
                return this.media_.get(i);
            }

            public int getMediaCount() {
                return this.media_.size();
            }

            public List<Media> getMediaList() {
                return this.media_;
            }

            public MediaOrBuilder getMediaOrBuilder(int i) {
                return this.media_.get(i);
            }

            public List<? extends MediaOrBuilder> getMediaOrBuilderList() {
                return this.media_;
            }

            public static Builder newBuilder(MediaList mediaList) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(mediaList);
            }

            public static MediaList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (MediaList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static MediaList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static MediaList parseFrom(C16994k kVar) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            /* access modifiers changed from: private */
            public void addMedia(int i, Media media) {
                media.getClass();
                ensureMediaIsMutable();
                this.media_.add(i, media);
            }

            public static MediaList parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static MediaList parseFrom(byte[] bArr) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static MediaList parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static MediaList parseFrom(InputStream inputStream) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MediaList parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static MediaList parseFrom(C23856l lVar) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static MediaList parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (MediaList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MediaListOrBuilder */
        public interface MediaListOrBuilder extends C23848k1 {
            /* synthetic */ C23845j1 getDefaultInstanceForType();

            MediaList.Media getMedia(int i);

            int getMediaCount();

            List<MediaList.Media> getMediaList();

            /* synthetic */ boolean isInitialized();
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MegaVideo */
        public static final class MegaVideo extends C23861l0<MegaVideo, Builder> implements MegaVideoOrBuilder {
            /* access modifiers changed from: private */
            public static final MegaVideo DEFAULT_INSTANCE;
            public static final int OBJECT_ID_FIELD_NUMBER = 1;
            public static final int OBJECT_NONCE_ID_FIELD_NUMBER = 2;
            private static volatile C24062w1<MegaVideo> PARSER;
            private int bitField0_;
            private String objectId_ = "";
            private String objectNonceId_ = "";

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MegaVideo$Builder */
            public static final class Builder extends C23861l0.C23862a<MegaVideo, Builder> implements MegaVideoOrBuilder {
                public /* synthetic */ Builder(C243631 r1) {
                    this();
                }

                public Builder clearObjectId() {
                    copyOnWrite();
                    ((MegaVideo) this.instance).clearObjectId();
                    return this;
                }

                public Builder clearObjectNonceId() {
                    copyOnWrite();
                    ((MegaVideo) this.instance).clearObjectNonceId();
                    return this;
                }

                public String getObjectId() {
                    return ((MegaVideo) this.instance).getObjectId();
                }

                public C16994k getObjectIdBytes() {
                    return ((MegaVideo) this.instance).getObjectIdBytes();
                }

                public String getObjectNonceId() {
                    return ((MegaVideo) this.instance).getObjectNonceId();
                }

                public C16994k getObjectNonceIdBytes() {
                    return ((MegaVideo) this.instance).getObjectNonceIdBytes();
                }

                public boolean hasObjectId() {
                    return ((MegaVideo) this.instance).hasObjectId();
                }

                public boolean hasObjectNonceId() {
                    return ((MegaVideo) this.instance).hasObjectNonceId();
                }

                public Builder setObjectId(String str) {
                    copyOnWrite();
                    ((MegaVideo) this.instance).setObjectId(str);
                    return this;
                }

                public Builder setObjectIdBytes(C16994k kVar) {
                    copyOnWrite();
                    ((MegaVideo) this.instance).setObjectIdBytes(kVar);
                    return this;
                }

                public Builder setObjectNonceId(String str) {
                    copyOnWrite();
                    ((MegaVideo) this.instance).setObjectNonceId(str);
                    return this;
                }

                public Builder setObjectNonceIdBytes(C16994k kVar) {
                    copyOnWrite();
                    ((MegaVideo) this.instance).setObjectNonceIdBytes(kVar);
                    return this;
                }

                private Builder() {
                    super(MegaVideo.DEFAULT_INSTANCE);
                }
            }

            static {
                MegaVideo megaVideo = new MegaVideo();
                DEFAULT_INSTANCE = megaVideo;
                C23861l0.registerDefaultInstance(MegaVideo.class, megaVideo);
            }

            private MegaVideo() {
            }

            /* access modifiers changed from: private */
            public void clearObjectId() {
                this.bitField0_ &= -2;
                this.objectId_ = getDefaultInstance().getObjectId();
            }

            /* access modifiers changed from: private */
            public void clearObjectNonceId() {
                this.bitField0_ &= -3;
                this.objectNonceId_ = getDefaultInstance().getObjectNonceId();
            }

            public static MegaVideo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static MegaVideo parseDelimitedFrom(InputStream inputStream) {
                return (MegaVideo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MegaVideo parseFrom(ByteBuffer byteBuffer) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<MegaVideo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setObjectId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.objectId_ = str;
            }

            /* access modifiers changed from: private */
            public void setObjectIdBytes(C16994k kVar) {
                this.objectId_ = kVar.mo18752u();
                this.bitField0_ |= 1;
            }

            /* access modifiers changed from: private */
            public void setObjectNonceId(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.objectNonceId_ = str;
            }

            /* access modifiers changed from: private */
            public void setObjectNonceIdBytes(C16994k kVar) {
                this.objectNonceId_ = kVar.mo18752u();
                this.bitField0_ |= 2;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "objectId_", "objectNonceId_"});
                    case 3:
                        return new MegaVideo();
                    case 4:
                        return new Builder((C243631) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<MegaVideo> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (MegaVideo.class) {
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

            public String getObjectId() {
                return this.objectId_;
            }

            public C16994k getObjectIdBytes() {
                return C16994k.m16791k(this.objectId_);
            }

            public String getObjectNonceId() {
                return this.objectNonceId_;
            }

            public C16994k getObjectNonceIdBytes() {
                return C16994k.m16791k(this.objectNonceId_);
            }

            public boolean hasObjectId() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasObjectNonceId() {
                return (this.bitField0_ & 2) != 0;
            }

            public static Builder newBuilder(MegaVideo megaVideo) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(megaVideo);
            }

            public static MegaVideo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (MegaVideo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static MegaVideo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static MegaVideo parseFrom(C16994k kVar) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static MegaVideo parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static MegaVideo parseFrom(byte[] bArr) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static MegaVideo parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static MegaVideo parseFrom(InputStream inputStream) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static MegaVideo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static MegaVideo parseFrom(C23856l lVar) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static MegaVideo parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (MegaVideo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfo$MegaVideoOrBuilder */
        public interface MegaVideoOrBuilder extends C23848k1 {
            /* synthetic */ C23845j1 getDefaultInstanceForType();

            String getObjectId();

            C16994k getObjectIdBytes();

            String getObjectNonceId();

            C16994k getObjectNonceIdBytes();

            boolean hasObjectId();

            boolean hasObjectNonceId();

            /* synthetic */ boolean isInitialized();
        }

        static {
            FinderFeedInfo finderFeedInfo = new FinderFeedInfo();
            DEFAULT_INSTANCE = finderFeedInfo;
            C23861l0.registerDefaultInstance(FinderFeedInfo.class, finderFeedInfo);
        }

        private FinderFeedInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAvatar() {
            this.bitField0_ &= -33;
            this.avatar_ = getDefaultInstance().getAvatar();
        }

        /* access modifiers changed from: private */
        public void clearDesc() {
            this.bitField0_ &= -65;
            this.desc_ = getDefaultInstance().getDesc();
        }

        /* access modifiers changed from: private */
        public void clearExportId() {
            this.bitField0_ &= -2049;
            this.exportId_ = getDefaultInstance().getExportId();
        }

        /* access modifiers changed from: private */
        public void clearFeedType() {
            this.bitField0_ &= -5;
            this.feedType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLocalId() {
            this.bitField0_ &= -257;
            this.localId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMediaCount() {
            this.bitField0_ &= -129;
            this.mediaCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMediaList() {
            this.mediaList_ = null;
            this.bitField0_ &= -513;
        }

        /* access modifiers changed from: private */
        public void clearMegaVideo() {
            this.megaVideo_ = null;
            this.bitField0_ &= -1025;
        }

        /* access modifiers changed from: private */
        public void clearNickname() {
            this.bitField0_ &= -9;
            this.nickname_ = getDefaultInstance().getNickname();
        }

        /* access modifiers changed from: private */
        public void clearObjectId() {
            this.bitField0_ &= -2;
            this.objectId_ = getDefaultInstance().getObjectId();
        }

        /* access modifiers changed from: private */
        public void clearObjectNonceId() {
            this.bitField0_ &= -3;
            this.objectNonceId_ = getDefaultInstance().getObjectNonceId();
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -17;
            this.username_ = getDefaultInstance().getUsername();
        }

        public static FinderFeedInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeMediaList(MediaList mediaList) {
            mediaList.getClass();
            MediaList mediaList2 = this.mediaList_;
            if (mediaList2 == null || mediaList2 == MediaList.getDefaultInstance()) {
                this.mediaList_ = mediaList;
            } else {
                this.mediaList_ = (MediaList) ((MediaList.Builder) MediaList.newBuilder(this.mediaList_).mergeFrom(mediaList)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void mergeMegaVideo(MegaVideo megaVideo) {
            megaVideo.getClass();
            MegaVideo megaVideo2 = this.megaVideo_;
            if (megaVideo2 == null || megaVideo2 == MegaVideo.getDefaultInstance()) {
                this.megaVideo_ = megaVideo;
            } else {
                this.megaVideo_ = (MegaVideo) ((MegaVideo.Builder) MegaVideo.newBuilder(this.megaVideo_).mergeFrom(megaVideo)).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderFeedInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderFeedInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderFeedInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderFeedInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAvatar(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.avatar_ = str;
        }

        /* access modifiers changed from: private */
        public void setAvatarBytes(C16994k kVar) {
            this.avatar_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setDesc(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.desc_ = str;
        }

        /* access modifiers changed from: private */
        public void setDescBytes(C16994k kVar) {
            this.desc_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setExportId(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.exportId_ = str;
        }

        /* access modifiers changed from: private */
        public void setExportIdBytes(C16994k kVar) {
            this.exportId_ = kVar.mo18752u();
            this.bitField0_ |= 2048;
        }

        /* access modifiers changed from: private */
        public void setFeedType(int i) {
            this.bitField0_ |= 4;
            this.feedType_ = i;
        }

        /* access modifiers changed from: private */
        public void setLocalId(int i) {
            this.bitField0_ |= 256;
            this.localId_ = i;
        }

        /* access modifiers changed from: private */
        public void setMediaCount(int i) {
            this.bitField0_ |= 128;
            this.mediaCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setMediaList(MediaList mediaList) {
            mediaList.getClass();
            this.mediaList_ = mediaList;
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setMegaVideo(MegaVideo megaVideo) {
            megaVideo.getClass();
            this.megaVideo_ = megaVideo;
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setNickname(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.nickname_ = str;
        }

        /* access modifiers changed from: private */
        public void setNicknameBytes(C16994k kVar) {
            this.nickname_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setObjectId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.objectId_ = str;
        }

        /* access modifiers changed from: private */
        public void setObjectIdBytes(C16994k kVar) {
            this.objectId_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setObjectNonceId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.objectNonceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setObjectNonceIdBytes(C16994k kVar) {
            this.objectNonceId_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.username_ = str;
        }

        /* access modifiers changed from: private */
        public void setUsernameBytes(C16994k kVar) {
            this.username_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tင\b\nဉ\t\u000bဉ\n\fဈ\u000b", new Object[]{"bitField0_", "objectId_", "objectNonceId_", "feedType_", "nickname_", "username_", "avatar_", "desc_", "mediaCount_", "localId_", "mediaList_", "megaVideo_", "exportId_"});
                case 3:
                    return new FinderFeedInfo();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderFeedInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderFeedInfo.class) {
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

        public String getAvatar() {
            return this.avatar_;
        }

        public C16994k getAvatarBytes() {
            return C16994k.m16791k(this.avatar_);
        }

        public String getDesc() {
            return this.desc_;
        }

        public C16994k getDescBytes() {
            return C16994k.m16791k(this.desc_);
        }

        public String getExportId() {
            return this.exportId_;
        }

        public C16994k getExportIdBytes() {
            return C16994k.m16791k(this.exportId_);
        }

        public int getFeedType() {
            return this.feedType_;
        }

        public int getLocalId() {
            return this.localId_;
        }

        public int getMediaCount() {
            return this.mediaCount_;
        }

        public MediaList getMediaList() {
            MediaList mediaList = this.mediaList_;
            return mediaList == null ? MediaList.getDefaultInstance() : mediaList;
        }

        public MegaVideo getMegaVideo() {
            MegaVideo megaVideo = this.megaVideo_;
            return megaVideo == null ? MegaVideo.getDefaultInstance() : megaVideo;
        }

        public String getNickname() {
            return this.nickname_;
        }

        public C16994k getNicknameBytes() {
            return C16994k.m16791k(this.nickname_);
        }

        public String getObjectId() {
            return this.objectId_;
        }

        public C16994k getObjectIdBytes() {
            return C16994k.m16791k(this.objectId_);
        }

        public String getObjectNonceId() {
            return this.objectNonceId_;
        }

        public C16994k getObjectNonceIdBytes() {
            return C16994k.m16791k(this.objectNonceId_);
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public boolean hasAvatar() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDesc() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasExportId() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasFeedType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLocalId() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasMediaCount() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasMediaList() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasMegaVideo() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasNickname() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasObjectId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasObjectNonceId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(FinderFeedInfo finderFeedInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderFeedInfo);
        }

        public static FinderFeedInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderFeedInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderFeedInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderFeedInfo parseFrom(C16994k kVar) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderFeedInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderFeedInfo parseFrom(byte[] bArr) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderFeedInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderFeedInfo parseFrom(InputStream inputStream) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderFeedInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderFeedInfo parseFrom(C23856l lVar) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderFeedInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderFeedInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderFeedInfoOrBuilder */
    public interface FinderFeedInfoOrBuilder extends C23848k1 {
        String getAvatar();

        C16994k getAvatarBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDesc();

        C16994k getDescBytes();

        String getExportId();

        C16994k getExportIdBytes();

        int getFeedType();

        int getLocalId();

        int getMediaCount();

        FinderFeedInfo.MediaList getMediaList();

        FinderFeedInfo.MegaVideo getMegaVideo();

        String getNickname();

        C16994k getNicknameBytes();

        String getObjectId();

        C16994k getObjectIdBytes();

        String getObjectNonceId();

        C16994k getObjectNonceIdBytes();

        String getUsername();

        C16994k getUsernameBytes();

        boolean hasAvatar();

        boolean hasDesc();

        boolean hasExportId();

        boolean hasFeedType();

        boolean hasLocalId();

        boolean hasMediaCount();

        boolean hasMediaList();

        boolean hasMegaVideo();

        boolean hasNickname();

        boolean hasObjectId();

        boolean hasObjectNonceId();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderJumpTabType */
    public enum FinderJumpTabType implements C23908o0.C23911c {
        TAB_TYPE_NONE(0),
        TAB_TYPE_FOLLOW(1),
        TAB_TYPE_RECOMMEND(2),
        TAB_TYPE_MACHINE(3);
        
        public static final int TAB_TYPE_FOLLOW_VALUE = 1;
        public static final int TAB_TYPE_MACHINE_VALUE = 3;
        public static final int TAB_TYPE_NONE_VALUE = 0;
        public static final int TAB_TYPE_RECOMMEND_VALUE = 2;
        private static final C23908o0.C23912d<FinderJumpTabType> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderJumpTabType$FinderJumpTabTypeVerifier */
        public static final class FinderJumpTabTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new FinderJumpTabTypeVerifier();
            }

            private FinderJumpTabTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return FinderJumpTabType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<FinderJumpTabType>() {
                public FinderJumpTabType findValueByNumber(int i) {
                    return FinderJumpTabType.forNumber(i);
                }
            };
        }

        private FinderJumpTabType(int i) {
            this.value = i;
        }

        public static FinderJumpTabType forNumber(int i) {
            if (i == 0) {
                return TAB_TYPE_NONE;
            }
            if (i == 1) {
                return TAB_TYPE_FOLLOW;
            }
            if (i == 2) {
                return TAB_TYPE_RECOMMEND;
            }
            if (i != 3) {
                return null;
            }
            return TAB_TYPE_MACHINE;
        }

        public static C23908o0.C23912d<FinderJumpTabType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return FinderJumpTabTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FinderJumpTabType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderSubType */
    public enum FinderSubType implements C23908o0.C23911c {
        FINDER_SUB_TYPE_NONE(0),
        FINDER_SUB_TYPE_SINGLE_HORIZON(1),
        FINDER_SUB_TYPE_DOUBLE_VERTICAL(2),
        FINDER_SUB_TYPE_HORIZONTAL_SCROLL(3);
        
        public static final int FINDER_SUB_TYPE_DOUBLE_VERTICAL_VALUE = 2;
        public static final int FINDER_SUB_TYPE_HORIZONTAL_SCROLL_VALUE = 3;
        public static final int FINDER_SUB_TYPE_NONE_VALUE = 0;
        public static final int FINDER_SUB_TYPE_SINGLE_HORIZON_VALUE = 1;
        private static final C23908o0.C23912d<FinderSubType> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderSubType$FinderSubTypeVerifier */
        public static final class FinderSubTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new FinderSubTypeVerifier();
            }

            private FinderSubTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return FinderSubType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<FinderSubType>() {
                public FinderSubType findValueByNumber(int i) {
                    return FinderSubType.forNumber(i);
                }
            };
        }

        private FinderSubType(int i) {
            this.value = i;
        }

        public static FinderSubType forNumber(int i) {
            if (i == 0) {
                return FINDER_SUB_TYPE_NONE;
            }
            if (i == 1) {
                return FINDER_SUB_TYPE_SINGLE_HORIZON;
            }
            if (i == 2) {
                return FINDER_SUB_TYPE_DOUBLE_VERTICAL;
            }
            if (i != 3) {
                return null;
            }
            return FINDER_SUB_TYPE_HORIZONTAL_SCROLL;
        }

        public static C23908o0.C23912d<FinderSubType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return FinderSubTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static FinderSubType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$HorizontalScrollAttr */
    public static final class HorizontalScrollAttr extends C23861l0<HorizontalScrollAttr, Builder> implements HorizontalScrollAttrOrBuilder {
        /* access modifiers changed from: private */
        public static final HorizontalScrollAttr DEFAULT_INSTANCE;
        public static final int JUMP_TAB_TYPE_FIELD_NUMBER = 1;
        private static volatile C24062w1<HorizontalScrollAttr> PARSER;
        private int bitField0_;
        private int jumpTabType_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$HorizontalScrollAttr$Builder */
        public static final class Builder extends C23861l0.C23862a<HorizontalScrollAttr, Builder> implements HorizontalScrollAttrOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder clearJumpTabType() {
                copyOnWrite();
                ((HorizontalScrollAttr) this.instance).clearJumpTabType();
                return this;
            }

            public FinderJumpTabType getJumpTabType() {
                return ((HorizontalScrollAttr) this.instance).getJumpTabType();
            }

            public boolean hasJumpTabType() {
                return ((HorizontalScrollAttr) this.instance).hasJumpTabType();
            }

            public Builder setJumpTabType(FinderJumpTabType finderJumpTabType) {
                copyOnWrite();
                ((HorizontalScrollAttr) this.instance).setJumpTabType(finderJumpTabType);
                return this;
            }

            private Builder() {
                super(HorizontalScrollAttr.DEFAULT_INSTANCE);
            }
        }

        static {
            HorizontalScrollAttr horizontalScrollAttr = new HorizontalScrollAttr();
            DEFAULT_INSTANCE = horizontalScrollAttr;
            C23861l0.registerDefaultInstance(HorizontalScrollAttr.class, horizontalScrollAttr);
        }

        private HorizontalScrollAttr() {
        }

        /* access modifiers changed from: private */
        public void clearJumpTabType() {
            this.bitField0_ &= -2;
            this.jumpTabType_ = 0;
        }

        public static HorizontalScrollAttr getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HorizontalScrollAttr parseDelimitedFrom(InputStream inputStream) {
            return (HorizontalScrollAttr) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HorizontalScrollAttr parseFrom(ByteBuffer byteBuffer) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<HorizontalScrollAttr> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setJumpTabType(FinderJumpTabType finderJumpTabType) {
            this.jumpTabType_ = finderJumpTabType.getNumber();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "jumpTabType_", FinderJumpTabType.internalGetVerifier()});
                case 3:
                    return new HorizontalScrollAttr();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<HorizontalScrollAttr> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (HorizontalScrollAttr.class) {
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

        public FinderJumpTabType getJumpTabType() {
            FinderJumpTabType forNumber = FinderJumpTabType.forNumber(this.jumpTabType_);
            return forNumber == null ? FinderJumpTabType.TAB_TYPE_NONE : forNumber;
        }

        public boolean hasJumpTabType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(HorizontalScrollAttr horizontalScrollAttr) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(horizontalScrollAttr);
        }

        public static HorizontalScrollAttr parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (HorizontalScrollAttr) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static HorizontalScrollAttr parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static HorizontalScrollAttr parseFrom(C16994k kVar) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static HorizontalScrollAttr parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static HorizontalScrollAttr parseFrom(byte[] bArr) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HorizontalScrollAttr parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static HorizontalScrollAttr parseFrom(InputStream inputStream) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HorizontalScrollAttr parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static HorizontalScrollAttr parseFrom(C23856l lVar) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static HorizontalScrollAttr parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (HorizontalScrollAttr) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$HorizontalScrollAttrOrBuilder */
    public interface HorizontalScrollAttrOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FinderJumpTabType getJumpTabType();

        boolean hasJumpTabType();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$NativeFinderFeeds */
    public static final class NativeFinderFeeds extends C23861l0<NativeFinderFeeds, Builder> implements NativeFinderFeedsOrBuilder {
        /* access modifiers changed from: private */
        public static final NativeFinderFeeds DEFAULT_INSTANCE;
        public static final int FINDER_FEEDS_FIELD_NUMBER = 2;
        public static final int FROM_SESSION_ID_INFO_FIELD_NUMBER = 4;
        public static final int HORIZONTAL_SCROLL_ATTR_FIELD_NUMBER = 3;
        private static volatile C24062w1<NativeFinderFeeds> PARSER = null;
        public static final int SUB_TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private C23908o0.C23919j<FinderRecommendData> finderFeeds_ = C23861l0.emptyProtobufList();
        private C16994k fromSessionIdInfo_ = C16994k.f46000e;
        private HorizontalScrollAttr horizontalScrollAttr_;
        private int subType_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$NativeFinderFeeds$Builder */
        public static final class Builder extends C23861l0.C23862a<NativeFinderFeeds, Builder> implements NativeFinderFeedsOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder addAllFinderFeeds(Iterable<? extends FinderRecommendData> iterable) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).addAllFinderFeeds(iterable);
                return this;
            }

            public Builder addFinderFeeds(FinderRecommendData finderRecommendData) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).addFinderFeeds(finderRecommendData);
                return this;
            }

            public Builder clearFinderFeeds() {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).clearFinderFeeds();
                return this;
            }

            public Builder clearFromSessionIdInfo() {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).clearFromSessionIdInfo();
                return this;
            }

            public Builder clearHorizontalScrollAttr() {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).clearHorizontalScrollAttr();
                return this;
            }

            public Builder clearSubType() {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).clearSubType();
                return this;
            }

            public FinderRecommendData getFinderFeeds(int i) {
                return ((NativeFinderFeeds) this.instance).getFinderFeeds(i);
            }

            public int getFinderFeedsCount() {
                return ((NativeFinderFeeds) this.instance).getFinderFeedsCount();
            }

            public List<FinderRecommendData> getFinderFeedsList() {
                return Collections.unmodifiableList(((NativeFinderFeeds) this.instance).getFinderFeedsList());
            }

            public C16994k getFromSessionIdInfo() {
                return ((NativeFinderFeeds) this.instance).getFromSessionIdInfo();
            }

            public HorizontalScrollAttr getHorizontalScrollAttr() {
                return ((NativeFinderFeeds) this.instance).getHorizontalScrollAttr();
            }

            public int getSubType() {
                return ((NativeFinderFeeds) this.instance).getSubType();
            }

            public boolean hasFromSessionIdInfo() {
                return ((NativeFinderFeeds) this.instance).hasFromSessionIdInfo();
            }

            public boolean hasHorizontalScrollAttr() {
                return ((NativeFinderFeeds) this.instance).hasHorizontalScrollAttr();
            }

            public boolean hasSubType() {
                return ((NativeFinderFeeds) this.instance).hasSubType();
            }

            public Builder mergeHorizontalScrollAttr(HorizontalScrollAttr horizontalScrollAttr) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).mergeHorizontalScrollAttr(horizontalScrollAttr);
                return this;
            }

            public Builder removeFinderFeeds(int i) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).removeFinderFeeds(i);
                return this;
            }

            public Builder setFinderFeeds(int i, FinderRecommendData finderRecommendData) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).setFinderFeeds(i, finderRecommendData);
                return this;
            }

            public Builder setFromSessionIdInfo(C16994k kVar) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).setFromSessionIdInfo(kVar);
                return this;
            }

            public Builder setHorizontalScrollAttr(HorizontalScrollAttr horizontalScrollAttr) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).setHorizontalScrollAttr(horizontalScrollAttr);
                return this;
            }

            public Builder setSubType(int i) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).setSubType(i);
                return this;
            }

            private Builder() {
                super(NativeFinderFeeds.DEFAULT_INSTANCE);
            }

            public Builder addFinderFeeds(int i, FinderRecommendData finderRecommendData) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).addFinderFeeds(i, finderRecommendData);
                return this;
            }

            public Builder setFinderFeeds(int i, FinderRecommendData.Builder builder) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).setFinderFeeds(i, (FinderRecommendData) builder.build());
                return this;
            }

            public Builder setHorizontalScrollAttr(HorizontalScrollAttr.Builder builder) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).setHorizontalScrollAttr((HorizontalScrollAttr) builder.build());
                return this;
            }

            public Builder addFinderFeeds(FinderRecommendData.Builder builder) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).addFinderFeeds((FinderRecommendData) builder.build());
                return this;
            }

            public Builder addFinderFeeds(int i, FinderRecommendData.Builder builder) {
                copyOnWrite();
                ((NativeFinderFeeds) this.instance).addFinderFeeds(i, (FinderRecommendData) builder.build());
                return this;
            }
        }

        static {
            NativeFinderFeeds nativeFinderFeeds = new NativeFinderFeeds();
            DEFAULT_INSTANCE = nativeFinderFeeds;
            C23861l0.registerDefaultInstance(NativeFinderFeeds.class, nativeFinderFeeds);
        }

        private NativeFinderFeeds() {
        }

        /* access modifiers changed from: private */
        public void addAllFinderFeeds(Iterable<? extends FinderRecommendData> iterable) {
            ensureFinderFeedsIsMutable();
            C23810b.addAll(iterable, this.finderFeeds_);
        }

        /* access modifiers changed from: private */
        public void addFinderFeeds(FinderRecommendData finderRecommendData) {
            finderRecommendData.getClass();
            ensureFinderFeedsIsMutable();
            this.finderFeeds_.add(finderRecommendData);
        }

        /* access modifiers changed from: private */
        public void clearFinderFeeds() {
            this.finderFeeds_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearFromSessionIdInfo() {
            this.bitField0_ &= -5;
            this.fromSessionIdInfo_ = getDefaultInstance().getFromSessionIdInfo();
        }

        /* access modifiers changed from: private */
        public void clearHorizontalScrollAttr() {
            this.horizontalScrollAttr_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearSubType() {
            this.bitField0_ &= -2;
            this.subType_ = 0;
        }

        private void ensureFinderFeedsIsMutable() {
            C23908o0.C23919j<FinderRecommendData> jVar = this.finderFeeds_;
            if (!jVar.mo37523Q()) {
                this.finderFeeds_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static NativeFinderFeeds getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeHorizontalScrollAttr(HorizontalScrollAttr horizontalScrollAttr) {
            horizontalScrollAttr.getClass();
            HorizontalScrollAttr horizontalScrollAttr2 = this.horizontalScrollAttr_;
            if (horizontalScrollAttr2 == null || horizontalScrollAttr2 == HorizontalScrollAttr.getDefaultInstance()) {
                this.horizontalScrollAttr_ = horizontalScrollAttr;
            } else {
                this.horizontalScrollAttr_ = (HorizontalScrollAttr) ((HorizontalScrollAttr.Builder) HorizontalScrollAttr.newBuilder(this.horizontalScrollAttr_).mergeFrom(horizontalScrollAttr)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NativeFinderFeeds parseDelimitedFrom(InputStream inputStream) {
            return (NativeFinderFeeds) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeFinderFeeds parseFrom(ByteBuffer byteBuffer) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<NativeFinderFeeds> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeFinderFeeds(int i) {
            ensureFinderFeedsIsMutable();
            this.finderFeeds_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setFinderFeeds(int i, FinderRecommendData finderRecommendData) {
            finderRecommendData.getClass();
            ensureFinderFeedsIsMutable();
            this.finderFeeds_.set(i, finderRecommendData);
        }

        /* access modifiers changed from: private */
        public void setFromSessionIdInfo(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.fromSessionIdInfo_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setHorizontalScrollAttr(HorizontalScrollAttr horizontalScrollAttr) {
            horizontalScrollAttr.getClass();
            this.horizontalScrollAttr_ = horizontalScrollAttr;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setSubType(int i) {
            this.bitField0_ |= 1;
            this.subType_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ည\u0002", new Object[]{"bitField0_", "subType_", "finderFeeds_", FinderRecommendData.class, "horizontalScrollAttr_", "fromSessionIdInfo_"});
                case 3:
                    return new NativeFinderFeeds();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<NativeFinderFeeds> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (NativeFinderFeeds.class) {
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

        public FinderRecommendData getFinderFeeds(int i) {
            return this.finderFeeds_.get(i);
        }

        public int getFinderFeedsCount() {
            return this.finderFeeds_.size();
        }

        public List<FinderRecommendData> getFinderFeedsList() {
            return this.finderFeeds_;
        }

        public FinderRecommendDataOrBuilder getFinderFeedsOrBuilder(int i) {
            return this.finderFeeds_.get(i);
        }

        public List<? extends FinderRecommendDataOrBuilder> getFinderFeedsOrBuilderList() {
            return this.finderFeeds_;
        }

        public C16994k getFromSessionIdInfo() {
            return this.fromSessionIdInfo_;
        }

        public HorizontalScrollAttr getHorizontalScrollAttr() {
            HorizontalScrollAttr horizontalScrollAttr = this.horizontalScrollAttr_;
            return horizontalScrollAttr == null ? HorizontalScrollAttr.getDefaultInstance() : horizontalScrollAttr;
        }

        public int getSubType() {
            return this.subType_;
        }

        public boolean hasFromSessionIdInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasHorizontalScrollAttr() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSubType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NativeFinderFeeds nativeFinderFeeds) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(nativeFinderFeeds);
        }

        public static NativeFinderFeeds parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (NativeFinderFeeds) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static NativeFinderFeeds parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static NativeFinderFeeds parseFrom(C16994k kVar) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addFinderFeeds(int i, FinderRecommendData finderRecommendData) {
            finderRecommendData.getClass();
            ensureFinderFeedsIsMutable();
            this.finderFeeds_.add(i, finderRecommendData);
        }

        public static NativeFinderFeeds parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static NativeFinderFeeds parseFrom(byte[] bArr) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NativeFinderFeeds parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static NativeFinderFeeds parseFrom(InputStream inputStream) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeFinderFeeds parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static NativeFinderFeeds parseFrom(C23856l lVar) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static NativeFinderFeeds parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (NativeFinderFeeds) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$NativeFinderFeedsOrBuilder */
    public interface NativeFinderFeedsOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FinderRecommendData getFinderFeeds(int i);

        int getFinderFeedsCount();

        List<FinderRecommendData> getFinderFeedsList();

        C16994k getFromSessionIdInfo();

        HorizontalScrollAttr getHorizontalScrollAttr();

        int getSubType();

        boolean hasFromSessionIdInfo();

        boolean hasHorizontalScrollAttr();

        boolean hasSubType();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer */
    public static final class RecommendLiveCanvasBuffer extends C23861l0<RecommendLiveCanvasBuffer, Builder> implements RecommendLiveCanvasBufferOrBuilder {
        /* access modifiers changed from: private */
        public static final RecommendLiveCanvasBuffer DEFAULT_INSTANCE;
        public static final int INFO_FIELD_NUMBER = 2;
        private static volatile C24062w1<RecommendLiveCanvasBuffer> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private C23908o0.C23919j<LiveInfo> info_ = C23861l0.emptyProtobufList();
        private int type_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$Builder */
        public static final class Builder extends C23861l0.C23862a<RecommendLiveCanvasBuffer, Builder> implements RecommendLiveCanvasBufferOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder addAllInfo(Iterable<? extends LiveInfo> iterable) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).addAllInfo(iterable);
                return this;
            }

            public Builder addInfo(LiveInfo liveInfo) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).addInfo(liveInfo);
                return this;
            }

            public Builder clearInfo() {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).clearInfo();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).clearType();
                return this;
            }

            public LiveInfo getInfo(int i) {
                return ((RecommendLiveCanvasBuffer) this.instance).getInfo(i);
            }

            public int getInfoCount() {
                return ((RecommendLiveCanvasBuffer) this.instance).getInfoCount();
            }

            public List<LiveInfo> getInfoList() {
                return Collections.unmodifiableList(((RecommendLiveCanvasBuffer) this.instance).getInfoList());
            }

            public int getType() {
                return ((RecommendLiveCanvasBuffer) this.instance).getType();
            }

            public boolean hasType() {
                return ((RecommendLiveCanvasBuffer) this.instance).hasType();
            }

            public Builder removeInfo(int i) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).removeInfo(i);
                return this;
            }

            public Builder setInfo(int i, LiveInfo liveInfo) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).setInfo(i, liveInfo);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(RecommendLiveCanvasBuffer.DEFAULT_INSTANCE);
            }

            public Builder addInfo(int i, LiveInfo liveInfo) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).addInfo(i, liveInfo);
                return this;
            }

            public Builder setInfo(int i, LiveInfo.Builder builder) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).setInfo(i, (LiveInfo) builder.build());
                return this;
            }

            public Builder addInfo(LiveInfo.Builder builder) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).addInfo((LiveInfo) builder.build());
                return this;
            }

            public Builder addInfo(int i, LiveInfo.Builder builder) {
                copyOnWrite();
                ((RecommendLiveCanvasBuffer) this.instance).addInfo(i, (LiveInfo) builder.build());
                return this;
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo */
        public static final class LiveInfo extends C23861l0<LiveInfo, Builder> implements LiveInfoOrBuilder {
            public static final int BIZ_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final LiveInfo DEFAULT_INSTANCE;
            public static final int FINDER_FIELD_NUMBER = 2;
            public static final int MAP_BIZ_FIELD_NUMBER = 5;
            private static volatile C24062w1<LiveInfo> PARSER = null;
            public static final int REPORT_INFO_FIELD_NUMBER = 4;
            public static final int STATUS_FIELD_NUMBER = 3;
            private int bitField0_;
            private BizInfo biz_;
            private FinderInfo finder_;
            private MapBizInfo mapBiz_;
            private String reportInfo_ = "";
            private int status_;

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$BizInfo */
            public static final class BizInfo extends C23861l0<BizInfo, Builder> implements BizInfoOrBuilder {
                public static final int BIZUIN_FIELD_NUMBER = 5;
                public static final int BRAND_ICON_URL_FIELD_NUMBER = 3;
                /* access modifiers changed from: private */
                public static final BizInfo DEFAULT_INSTANCE;
                public static final int NICKNAME_FIELD_NUMBER = 2;
                private static volatile C24062w1<BizInfo> PARSER = null;
                public static final int SIGNATURE_FIELD_NUMBER = 4;
                public static final int USERNAME_FIELD_NUMBER = 1;
                private int bitField0_;
                private int bizuin_;
                private String brandIconUrl_ = "";
                private String nickname_ = "";
                private String signature_ = "";
                private String username_ = "";

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$BizInfo$Builder */
                public static final class Builder extends C23861l0.C23862a<BizInfo, Builder> implements BizInfoOrBuilder {
                    public /* synthetic */ Builder(C243631 r1) {
                        this();
                    }

                    public Builder clearBizuin() {
                        copyOnWrite();
                        ((BizInfo) this.instance).clearBizuin();
                        return this;
                    }

                    public Builder clearBrandIconUrl() {
                        copyOnWrite();
                        ((BizInfo) this.instance).clearBrandIconUrl();
                        return this;
                    }

                    public Builder clearNickname() {
                        copyOnWrite();
                        ((BizInfo) this.instance).clearNickname();
                        return this;
                    }

                    public Builder clearSignature() {
                        copyOnWrite();
                        ((BizInfo) this.instance).clearSignature();
                        return this;
                    }

                    public Builder clearUsername() {
                        copyOnWrite();
                        ((BizInfo) this.instance).clearUsername();
                        return this;
                    }

                    public int getBizuin() {
                        return ((BizInfo) this.instance).getBizuin();
                    }

                    public String getBrandIconUrl() {
                        return ((BizInfo) this.instance).getBrandIconUrl();
                    }

                    public C16994k getBrandIconUrlBytes() {
                        return ((BizInfo) this.instance).getBrandIconUrlBytes();
                    }

                    public String getNickname() {
                        return ((BizInfo) this.instance).getNickname();
                    }

                    public C16994k getNicknameBytes() {
                        return ((BizInfo) this.instance).getNicknameBytes();
                    }

                    public String getSignature() {
                        return ((BizInfo) this.instance).getSignature();
                    }

                    public C16994k getSignatureBytes() {
                        return ((BizInfo) this.instance).getSignatureBytes();
                    }

                    public String getUsername() {
                        return ((BizInfo) this.instance).getUsername();
                    }

                    public C16994k getUsernameBytes() {
                        return ((BizInfo) this.instance).getUsernameBytes();
                    }

                    public boolean hasBizuin() {
                        return ((BizInfo) this.instance).hasBizuin();
                    }

                    public boolean hasBrandIconUrl() {
                        return ((BizInfo) this.instance).hasBrandIconUrl();
                    }

                    public boolean hasNickname() {
                        return ((BizInfo) this.instance).hasNickname();
                    }

                    public boolean hasSignature() {
                        return ((BizInfo) this.instance).hasSignature();
                    }

                    public boolean hasUsername() {
                        return ((BizInfo) this.instance).hasUsername();
                    }

                    public Builder setBizuin(int i) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setBizuin(i);
                        return this;
                    }

                    public Builder setBrandIconUrl(String str) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setBrandIconUrl(str);
                        return this;
                    }

                    public Builder setBrandIconUrlBytes(C16994k kVar) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setBrandIconUrlBytes(kVar);
                        return this;
                    }

                    public Builder setNickname(String str) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setNickname(str);
                        return this;
                    }

                    public Builder setNicknameBytes(C16994k kVar) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setNicknameBytes(kVar);
                        return this;
                    }

                    public Builder setSignature(String str) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setSignature(str);
                        return this;
                    }

                    public Builder setSignatureBytes(C16994k kVar) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setSignatureBytes(kVar);
                        return this;
                    }

                    public Builder setUsername(String str) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setUsername(str);
                        return this;
                    }

                    public Builder setUsernameBytes(C16994k kVar) {
                        copyOnWrite();
                        ((BizInfo) this.instance).setUsernameBytes(kVar);
                        return this;
                    }

                    private Builder() {
                        super(BizInfo.DEFAULT_INSTANCE);
                    }
                }

                static {
                    BizInfo bizInfo = new BizInfo();
                    DEFAULT_INSTANCE = bizInfo;
                    C23861l0.registerDefaultInstance(BizInfo.class, bizInfo);
                }

                private BizInfo() {
                }

                /* access modifiers changed from: private */
                public void clearBizuin() {
                    this.bitField0_ &= -17;
                    this.bizuin_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearBrandIconUrl() {
                    this.bitField0_ &= -5;
                    this.brandIconUrl_ = getDefaultInstance().getBrandIconUrl();
                }

                /* access modifiers changed from: private */
                public void clearNickname() {
                    this.bitField0_ &= -3;
                    this.nickname_ = getDefaultInstance().getNickname();
                }

                /* access modifiers changed from: private */
                public void clearSignature() {
                    this.bitField0_ &= -9;
                    this.signature_ = getDefaultInstance().getSignature();
                }

                /* access modifiers changed from: private */
                public void clearUsername() {
                    this.bitField0_ &= -2;
                    this.username_ = getDefaultInstance().getUsername();
                }

                public static BizInfo getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Builder newBuilder() {
                    return (Builder) DEFAULT_INSTANCE.createBuilder();
                }

                public static BizInfo parseDelimitedFrom(InputStream inputStream) {
                    return (BizInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static BizInfo parseFrom(ByteBuffer byteBuffer) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static C24062w1<BizInfo> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* access modifiers changed from: private */
                public void setBizuin(int i) {
                    this.bitField0_ |= 16;
                    this.bizuin_ = i;
                }

                /* access modifiers changed from: private */
                public void setBrandIconUrl(String str) {
                    str.getClass();
                    this.bitField0_ |= 4;
                    this.brandIconUrl_ = str;
                }

                /* access modifiers changed from: private */
                public void setBrandIconUrlBytes(C16994k kVar) {
                    this.brandIconUrl_ = kVar.mo18752u();
                    this.bitField0_ |= 4;
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
                public void setSignature(String str) {
                    str.getClass();
                    this.bitField0_ |= 8;
                    this.signature_ = str;
                }

                /* access modifiers changed from: private */
                public void setSignatureBytes(C16994k kVar) {
                    this.signature_ = kVar.mo18752u();
                    this.bitField0_ |= 8;
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
                    switch (fVar.ordinal()) {
                        case 0:
                            return (byte) 1;
                        case 1:
                            return null;
                        case 2:
                            return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "username_", "nickname_", "brandIconUrl_", "signature_", "bizuin_"});
                        case 3:
                            return new BizInfo();
                        case 4:
                            return new Builder((C243631) null);
                        case 5:
                            return DEFAULT_INSTANCE;
                        case 6:
                            C24062w1<BizInfo> w1Var = PARSER;
                            if (w1Var == null) {
                                synchronized (BizInfo.class) {
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

                public int getBizuin() {
                    return this.bizuin_;
                }

                public String getBrandIconUrl() {
                    return this.brandIconUrl_;
                }

                public C16994k getBrandIconUrlBytes() {
                    return C16994k.m16791k(this.brandIconUrl_);
                }

                public String getNickname() {
                    return this.nickname_;
                }

                public C16994k getNicknameBytes() {
                    return C16994k.m16791k(this.nickname_);
                }

                public String getSignature() {
                    return this.signature_;
                }

                public C16994k getSignatureBytes() {
                    return C16994k.m16791k(this.signature_);
                }

                public String getUsername() {
                    return this.username_;
                }

                public C16994k getUsernameBytes() {
                    return C16994k.m16791k(this.username_);
                }

                public boolean hasBizuin() {
                    return (this.bitField0_ & 16) != 0;
                }

                public boolean hasBrandIconUrl() {
                    return (this.bitField0_ & 4) != 0;
                }

                public boolean hasNickname() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasSignature() {
                    return (this.bitField0_ & 8) != 0;
                }

                public boolean hasUsername() {
                    return (this.bitField0_ & 1) != 0;
                }

                public static Builder newBuilder(BizInfo bizInfo) {
                    return (Builder) DEFAULT_INSTANCE.createBuilder(bizInfo);
                }

                public static BizInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (BizInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static BizInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                }

                public static BizInfo parseFrom(C16994k kVar) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                }

                public static BizInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                }

                public static BizInfo parseFrom(byte[] bArr) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static BizInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                }

                public static BizInfo parseFrom(InputStream inputStream) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static BizInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static BizInfo parseFrom(C23856l lVar) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                }

                public static BizInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
                    return (BizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$BizInfoOrBuilder */
            public interface BizInfoOrBuilder extends C23848k1 {
                int getBizuin();

                String getBrandIconUrl();

                C16994k getBrandIconUrlBytes();

                /* synthetic */ C23845j1 getDefaultInstanceForType();

                String getNickname();

                C16994k getNicknameBytes();

                String getSignature();

                C16994k getSignatureBytes();

                String getUsername();

                C16994k getUsernameBytes();

                boolean hasBizuin();

                boolean hasBrandIconUrl();

                boolean hasNickname();

                boolean hasSignature();

                boolean hasUsername();

                /* synthetic */ boolean isInitialized();
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$Builder */
            public static final class Builder extends C23861l0.C23862a<LiveInfo, Builder> implements LiveInfoOrBuilder {
                public /* synthetic */ Builder(C243631 r1) {
                    this();
                }

                public Builder clearBiz() {
                    copyOnWrite();
                    ((LiveInfo) this.instance).clearBiz();
                    return this;
                }

                public Builder clearFinder() {
                    copyOnWrite();
                    ((LiveInfo) this.instance).clearFinder();
                    return this;
                }

                public Builder clearMapBiz() {
                    copyOnWrite();
                    ((LiveInfo) this.instance).clearMapBiz();
                    return this;
                }

                public Builder clearReportInfo() {
                    copyOnWrite();
                    ((LiveInfo) this.instance).clearReportInfo();
                    return this;
                }

                public Builder clearStatus() {
                    copyOnWrite();
                    ((LiveInfo) this.instance).clearStatus();
                    return this;
                }

                public BizInfo getBiz() {
                    return ((LiveInfo) this.instance).getBiz();
                }

                public FinderInfo getFinder() {
                    return ((LiveInfo) this.instance).getFinder();
                }

                public MapBizInfo getMapBiz() {
                    return ((LiveInfo) this.instance).getMapBiz();
                }

                public String getReportInfo() {
                    return ((LiveInfo) this.instance).getReportInfo();
                }

                public C16994k getReportInfoBytes() {
                    return ((LiveInfo) this.instance).getReportInfoBytes();
                }

                public int getStatus() {
                    return ((LiveInfo) this.instance).getStatus();
                }

                public boolean hasBiz() {
                    return ((LiveInfo) this.instance).hasBiz();
                }

                public boolean hasFinder() {
                    return ((LiveInfo) this.instance).hasFinder();
                }

                public boolean hasMapBiz() {
                    return ((LiveInfo) this.instance).hasMapBiz();
                }

                public boolean hasReportInfo() {
                    return ((LiveInfo) this.instance).hasReportInfo();
                }

                public boolean hasStatus() {
                    return ((LiveInfo) this.instance).hasStatus();
                }

                public Builder mergeBiz(BizInfo bizInfo) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).mergeBiz(bizInfo);
                    return this;
                }

                public Builder mergeFinder(FinderInfo finderInfo) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).mergeFinder(finderInfo);
                    return this;
                }

                public Builder mergeMapBiz(MapBizInfo mapBizInfo) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).mergeMapBiz(mapBizInfo);
                    return this;
                }

                public Builder setBiz(BizInfo bizInfo) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setBiz(bizInfo);
                    return this;
                }

                public Builder setFinder(FinderInfo finderInfo) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setFinder(finderInfo);
                    return this;
                }

                public Builder setMapBiz(MapBizInfo mapBizInfo) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setMapBiz(mapBizInfo);
                    return this;
                }

                public Builder setReportInfo(String str) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setReportInfo(str);
                    return this;
                }

                public Builder setReportInfoBytes(C16994k kVar) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setReportInfoBytes(kVar);
                    return this;
                }

                public Builder setStatus(int i) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setStatus(i);
                    return this;
                }

                private Builder() {
                    super(LiveInfo.DEFAULT_INSTANCE);
                }

                public Builder setBiz(BizInfo.Builder builder) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setBiz((BizInfo) builder.build());
                    return this;
                }

                public Builder setFinder(FinderInfo.Builder builder) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setFinder((FinderInfo) builder.build());
                    return this;
                }

                public Builder setMapBiz(MapBizInfo.Builder builder) {
                    copyOnWrite();
                    ((LiveInfo) this.instance).setMapBiz((MapBizInfo) builder.build());
                    return this;
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$FinderInfo */
            public static final class FinderInfo extends C23861l0<FinderInfo, Builder> implements FinderInfoOrBuilder {
                public static final int COVER_URL_FIELD_NUMBER = 5;
                /* access modifiers changed from: private */
                public static final FinderInfo DEFAULT_INSTANCE;
                public static final int DESCRIPTION_FIELD_NUMBER = 9;
                public static final int ENCRYPT_USERNAME_FIELD_NUMBER = 12;
                public static final int EXPORT_ID_FIELD_NUMBER = 4;
                public static final int EXPORT_USERNAME_FIELD_NUMBER = 1;
                public static final int FINDER_UIN_FIELD_NUMBER = 14;
                public static final int HEIGHT_FIELD_NUMBER = 6;
                public static final int MEDIA_TYPE_FIELD_NUMBER = 8;
                public static final int NONCE_ID_FIELD_NUMBER = 3;
                public static final int OBJECT_ID_FIELD_NUMBER = 2;
                public static final int ONLINE_USER_COUNT_FIELD_NUMBER = 11;
                private static volatile C24062w1<FinderInfo> PARSER = null;
                public static final int REC_REASON_FIELD_NUMBER = 10;
                public static final int SESSION_BUFFER_FIELD_NUMBER = 13;
                public static final int SHOW_IDENTIFY_FIELD_NUMBER = 15;
                public static final int WIDTH_FIELD_NUMBER = 7;
                private int bitField0_;
                private String coverUrl_ = "";
                private String description_ = "";
                private String encryptUsername_ = "";
                private String exportId_ = "";
                private String exportUsername_ = "";
                private long finderUin_;
                private int height_;
                private int mediaType_;
                private String nonceId_ = "";
                private String objectId_ = "";
                private int onlineUserCount_;
                private String recReason_ = "";
                private String sessionBuffer_ = "";
                private int showIdentify_;
                private int width_;

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$FinderInfo$Builder */
                public static final class Builder extends C23861l0.C23862a<FinderInfo, Builder> implements FinderInfoOrBuilder {
                    public /* synthetic */ Builder(C243631 r1) {
                        this();
                    }

                    public Builder clearCoverUrl() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearCoverUrl();
                        return this;
                    }

                    public Builder clearDescription() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearDescription();
                        return this;
                    }

                    public Builder clearEncryptUsername() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearEncryptUsername();
                        return this;
                    }

                    public Builder clearExportId() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearExportId();
                        return this;
                    }

                    public Builder clearExportUsername() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearExportUsername();
                        return this;
                    }

                    public Builder clearFinderUin() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearFinderUin();
                        return this;
                    }

                    public Builder clearHeight() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearHeight();
                        return this;
                    }

                    public Builder clearMediaType() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearMediaType();
                        return this;
                    }

                    public Builder clearNonceId() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearNonceId();
                        return this;
                    }

                    public Builder clearObjectId() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearObjectId();
                        return this;
                    }

                    public Builder clearOnlineUserCount() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearOnlineUserCount();
                        return this;
                    }

                    public Builder clearRecReason() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearRecReason();
                        return this;
                    }

                    public Builder clearSessionBuffer() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearSessionBuffer();
                        return this;
                    }

                    public Builder clearShowIdentify() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearShowIdentify();
                        return this;
                    }

                    public Builder clearWidth() {
                        copyOnWrite();
                        ((FinderInfo) this.instance).clearWidth();
                        return this;
                    }

                    public String getCoverUrl() {
                        return ((FinderInfo) this.instance).getCoverUrl();
                    }

                    public C16994k getCoverUrlBytes() {
                        return ((FinderInfo) this.instance).getCoverUrlBytes();
                    }

                    public String getDescription() {
                        return ((FinderInfo) this.instance).getDescription();
                    }

                    public C16994k getDescriptionBytes() {
                        return ((FinderInfo) this.instance).getDescriptionBytes();
                    }

                    public String getEncryptUsername() {
                        return ((FinderInfo) this.instance).getEncryptUsername();
                    }

                    public C16994k getEncryptUsernameBytes() {
                        return ((FinderInfo) this.instance).getEncryptUsernameBytes();
                    }

                    public String getExportId() {
                        return ((FinderInfo) this.instance).getExportId();
                    }

                    public C16994k getExportIdBytes() {
                        return ((FinderInfo) this.instance).getExportIdBytes();
                    }

                    public String getExportUsername() {
                        return ((FinderInfo) this.instance).getExportUsername();
                    }

                    public C16994k getExportUsernameBytes() {
                        return ((FinderInfo) this.instance).getExportUsernameBytes();
                    }

                    public long getFinderUin() {
                        return ((FinderInfo) this.instance).getFinderUin();
                    }

                    public int getHeight() {
                        return ((FinderInfo) this.instance).getHeight();
                    }

                    public int getMediaType() {
                        return ((FinderInfo) this.instance).getMediaType();
                    }

                    public String getNonceId() {
                        return ((FinderInfo) this.instance).getNonceId();
                    }

                    public C16994k getNonceIdBytes() {
                        return ((FinderInfo) this.instance).getNonceIdBytes();
                    }

                    public String getObjectId() {
                        return ((FinderInfo) this.instance).getObjectId();
                    }

                    public C16994k getObjectIdBytes() {
                        return ((FinderInfo) this.instance).getObjectIdBytes();
                    }

                    public int getOnlineUserCount() {
                        return ((FinderInfo) this.instance).getOnlineUserCount();
                    }

                    public String getRecReason() {
                        return ((FinderInfo) this.instance).getRecReason();
                    }

                    public C16994k getRecReasonBytes() {
                        return ((FinderInfo) this.instance).getRecReasonBytes();
                    }

                    public String getSessionBuffer() {
                        return ((FinderInfo) this.instance).getSessionBuffer();
                    }

                    public C16994k getSessionBufferBytes() {
                        return ((FinderInfo) this.instance).getSessionBufferBytes();
                    }

                    public int getShowIdentify() {
                        return ((FinderInfo) this.instance).getShowIdentify();
                    }

                    public int getWidth() {
                        return ((FinderInfo) this.instance).getWidth();
                    }

                    public boolean hasCoverUrl() {
                        return ((FinderInfo) this.instance).hasCoverUrl();
                    }

                    public boolean hasDescription() {
                        return ((FinderInfo) this.instance).hasDescription();
                    }

                    public boolean hasEncryptUsername() {
                        return ((FinderInfo) this.instance).hasEncryptUsername();
                    }

                    public boolean hasExportId() {
                        return ((FinderInfo) this.instance).hasExportId();
                    }

                    public boolean hasExportUsername() {
                        return ((FinderInfo) this.instance).hasExportUsername();
                    }

                    public boolean hasFinderUin() {
                        return ((FinderInfo) this.instance).hasFinderUin();
                    }

                    public boolean hasHeight() {
                        return ((FinderInfo) this.instance).hasHeight();
                    }

                    public boolean hasMediaType() {
                        return ((FinderInfo) this.instance).hasMediaType();
                    }

                    public boolean hasNonceId() {
                        return ((FinderInfo) this.instance).hasNonceId();
                    }

                    public boolean hasObjectId() {
                        return ((FinderInfo) this.instance).hasObjectId();
                    }

                    public boolean hasOnlineUserCount() {
                        return ((FinderInfo) this.instance).hasOnlineUserCount();
                    }

                    public boolean hasRecReason() {
                        return ((FinderInfo) this.instance).hasRecReason();
                    }

                    public boolean hasSessionBuffer() {
                        return ((FinderInfo) this.instance).hasSessionBuffer();
                    }

                    public boolean hasShowIdentify() {
                        return ((FinderInfo) this.instance).hasShowIdentify();
                    }

                    public boolean hasWidth() {
                        return ((FinderInfo) this.instance).hasWidth();
                    }

                    public Builder setCoverUrl(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setCoverUrl(str);
                        return this;
                    }

                    public Builder setCoverUrlBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setCoverUrlBytes(kVar);
                        return this;
                    }

                    public Builder setDescription(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setDescription(str);
                        return this;
                    }

                    public Builder setDescriptionBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setDescriptionBytes(kVar);
                        return this;
                    }

                    public Builder setEncryptUsername(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setEncryptUsername(str);
                        return this;
                    }

                    public Builder setEncryptUsernameBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setEncryptUsernameBytes(kVar);
                        return this;
                    }

                    public Builder setExportId(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setExportId(str);
                        return this;
                    }

                    public Builder setExportIdBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setExportIdBytes(kVar);
                        return this;
                    }

                    public Builder setExportUsername(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setExportUsername(str);
                        return this;
                    }

                    public Builder setExportUsernameBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setExportUsernameBytes(kVar);
                        return this;
                    }

                    public Builder setFinderUin(long j) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setFinderUin(j);
                        return this;
                    }

                    public Builder setHeight(int i) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setHeight(i);
                        return this;
                    }

                    public Builder setMediaType(int i) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setMediaType(i);
                        return this;
                    }

                    public Builder setNonceId(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setNonceId(str);
                        return this;
                    }

                    public Builder setNonceIdBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setNonceIdBytes(kVar);
                        return this;
                    }

                    public Builder setObjectId(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setObjectId(str);
                        return this;
                    }

                    public Builder setObjectIdBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setObjectIdBytes(kVar);
                        return this;
                    }

                    public Builder setOnlineUserCount(int i) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setOnlineUserCount(i);
                        return this;
                    }

                    public Builder setRecReason(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setRecReason(str);
                        return this;
                    }

                    public Builder setRecReasonBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setRecReasonBytes(kVar);
                        return this;
                    }

                    public Builder setSessionBuffer(String str) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setSessionBuffer(str);
                        return this;
                    }

                    public Builder setSessionBufferBytes(C16994k kVar) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setSessionBufferBytes(kVar);
                        return this;
                    }

                    public Builder setShowIdentify(int i) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setShowIdentify(i);
                        return this;
                    }

                    public Builder setWidth(int i) {
                        copyOnWrite();
                        ((FinderInfo) this.instance).setWidth(i);
                        return this;
                    }

                    private Builder() {
                        super(FinderInfo.DEFAULT_INSTANCE);
                    }
                }

                static {
                    FinderInfo finderInfo = new FinderInfo();
                    DEFAULT_INSTANCE = finderInfo;
                    C23861l0.registerDefaultInstance(FinderInfo.class, finderInfo);
                }

                private FinderInfo() {
                }

                /* access modifiers changed from: private */
                public void clearCoverUrl() {
                    this.bitField0_ &= -17;
                    this.coverUrl_ = getDefaultInstance().getCoverUrl();
                }

                /* access modifiers changed from: private */
                public void clearDescription() {
                    this.bitField0_ &= -257;
                    this.description_ = getDefaultInstance().getDescription();
                }

                /* access modifiers changed from: private */
                public void clearEncryptUsername() {
                    this.bitField0_ &= -2049;
                    this.encryptUsername_ = getDefaultInstance().getEncryptUsername();
                }

                /* access modifiers changed from: private */
                public void clearExportId() {
                    this.bitField0_ &= -9;
                    this.exportId_ = getDefaultInstance().getExportId();
                }

                /* access modifiers changed from: private */
                public void clearExportUsername() {
                    this.bitField0_ &= -2;
                    this.exportUsername_ = getDefaultInstance().getExportUsername();
                }

                /* access modifiers changed from: private */
                public void clearFinderUin() {
                    this.bitField0_ &= -8193;
                    this.finderUin_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearHeight() {
                    this.bitField0_ &= -33;
                    this.height_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearMediaType() {
                    this.bitField0_ &= -129;
                    this.mediaType_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearNonceId() {
                    this.bitField0_ &= -5;
                    this.nonceId_ = getDefaultInstance().getNonceId();
                }

                /* access modifiers changed from: private */
                public void clearObjectId() {
                    this.bitField0_ &= -3;
                    this.objectId_ = getDefaultInstance().getObjectId();
                }

                /* access modifiers changed from: private */
                public void clearOnlineUserCount() {
                    this.bitField0_ &= -1025;
                    this.onlineUserCount_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearRecReason() {
                    this.bitField0_ &= -513;
                    this.recReason_ = getDefaultInstance().getRecReason();
                }

                /* access modifiers changed from: private */
                public void clearSessionBuffer() {
                    this.bitField0_ &= -4097;
                    this.sessionBuffer_ = getDefaultInstance().getSessionBuffer();
                }

                /* access modifiers changed from: private */
                public void clearShowIdentify() {
                    this.bitField0_ &= -16385;
                    this.showIdentify_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearWidth() {
                    this.bitField0_ &= -65;
                    this.width_ = 0;
                }

                public static FinderInfo getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Builder newBuilder() {
                    return (Builder) DEFAULT_INSTANCE.createBuilder();
                }

                public static FinderInfo parseDelimitedFrom(InputStream inputStream) {
                    return (FinderInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static FinderInfo parseFrom(ByteBuffer byteBuffer) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static C24062w1<FinderInfo> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* access modifiers changed from: private */
                public void setCoverUrl(String str) {
                    str.getClass();
                    this.bitField0_ |= 16;
                    this.coverUrl_ = str;
                }

                /* access modifiers changed from: private */
                public void setCoverUrlBytes(C16994k kVar) {
                    this.coverUrl_ = kVar.mo18752u();
                    this.bitField0_ |= 16;
                }

                /* access modifiers changed from: private */
                public void setDescription(String str) {
                    str.getClass();
                    this.bitField0_ |= 256;
                    this.description_ = str;
                }

                /* access modifiers changed from: private */
                public void setDescriptionBytes(C16994k kVar) {
                    this.description_ = kVar.mo18752u();
                    this.bitField0_ |= 256;
                }

                /* access modifiers changed from: private */
                public void setEncryptUsername(String str) {
                    str.getClass();
                    this.bitField0_ |= 2048;
                    this.encryptUsername_ = str;
                }

                /* access modifiers changed from: private */
                public void setEncryptUsernameBytes(C16994k kVar) {
                    this.encryptUsername_ = kVar.mo18752u();
                    this.bitField0_ |= 2048;
                }

                /* access modifiers changed from: private */
                public void setExportId(String str) {
                    str.getClass();
                    this.bitField0_ |= 8;
                    this.exportId_ = str;
                }

                /* access modifiers changed from: private */
                public void setExportIdBytes(C16994k kVar) {
                    this.exportId_ = kVar.mo18752u();
                    this.bitField0_ |= 8;
                }

                /* access modifiers changed from: private */
                public void setExportUsername(String str) {
                    str.getClass();
                    this.bitField0_ |= 1;
                    this.exportUsername_ = str;
                }

                /* access modifiers changed from: private */
                public void setExportUsernameBytes(C16994k kVar) {
                    this.exportUsername_ = kVar.mo18752u();
                    this.bitField0_ |= 1;
                }

                /* access modifiers changed from: private */
                public void setFinderUin(long j) {
                    this.bitField0_ |= 8192;
                    this.finderUin_ = j;
                }

                /* access modifiers changed from: private */
                public void setHeight(int i) {
                    this.bitField0_ |= 32;
                    this.height_ = i;
                }

                /* access modifiers changed from: private */
                public void setMediaType(int i) {
                    this.bitField0_ |= 128;
                    this.mediaType_ = i;
                }

                /* access modifiers changed from: private */
                public void setNonceId(String str) {
                    str.getClass();
                    this.bitField0_ |= 4;
                    this.nonceId_ = str;
                }

                /* access modifiers changed from: private */
                public void setNonceIdBytes(C16994k kVar) {
                    this.nonceId_ = kVar.mo18752u();
                    this.bitField0_ |= 4;
                }

                /* access modifiers changed from: private */
                public void setObjectId(String str) {
                    str.getClass();
                    this.bitField0_ |= 2;
                    this.objectId_ = str;
                }

                /* access modifiers changed from: private */
                public void setObjectIdBytes(C16994k kVar) {
                    this.objectId_ = kVar.mo18752u();
                    this.bitField0_ |= 2;
                }

                /* access modifiers changed from: private */
                public void setOnlineUserCount(int i) {
                    this.bitField0_ |= 1024;
                    this.onlineUserCount_ = i;
                }

                /* access modifiers changed from: private */
                public void setRecReason(String str) {
                    str.getClass();
                    this.bitField0_ |= 512;
                    this.recReason_ = str;
                }

                /* access modifiers changed from: private */
                public void setRecReasonBytes(C16994k kVar) {
                    this.recReason_ = kVar.mo18752u();
                    this.bitField0_ |= 512;
                }

                /* access modifiers changed from: private */
                public void setSessionBuffer(String str) {
                    str.getClass();
                    this.bitField0_ |= 4096;
                    this.sessionBuffer_ = str;
                }

                /* access modifiers changed from: private */
                public void setSessionBufferBytes(C16994k kVar) {
                    this.sessionBuffer_ = kVar.mo18752u();
                    this.bitField0_ |= 4096;
                }

                /* access modifiers changed from: private */
                public void setShowIdentify(int i) {
                    this.bitField0_ |= 16384;
                    this.showIdentify_ = i;
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
                            return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဈ\b\nဈ\t\u000bဋ\n\fဈ\u000b\rဈ\f\u000eဃ\r\u000fဋ\u000e", new Object[]{"bitField0_", "exportUsername_", "objectId_", "nonceId_", "exportId_", "coverUrl_", "height_", "width_", "mediaType_", "description_", "recReason_", "onlineUserCount_", "encryptUsername_", "sessionBuffer_", "finderUin_", "showIdentify_"});
                        case 3:
                            return new FinderInfo();
                        case 4:
                            return new Builder((C243631) null);
                        case 5:
                            return DEFAULT_INSTANCE;
                        case 6:
                            C24062w1<FinderInfo> w1Var = PARSER;
                            if (w1Var == null) {
                                synchronized (FinderInfo.class) {
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

                public String getCoverUrl() {
                    return this.coverUrl_;
                }

                public C16994k getCoverUrlBytes() {
                    return C16994k.m16791k(this.coverUrl_);
                }

                public String getDescription() {
                    return this.description_;
                }

                public C16994k getDescriptionBytes() {
                    return C16994k.m16791k(this.description_);
                }

                public String getEncryptUsername() {
                    return this.encryptUsername_;
                }

                public C16994k getEncryptUsernameBytes() {
                    return C16994k.m16791k(this.encryptUsername_);
                }

                public String getExportId() {
                    return this.exportId_;
                }

                public C16994k getExportIdBytes() {
                    return C16994k.m16791k(this.exportId_);
                }

                public String getExportUsername() {
                    return this.exportUsername_;
                }

                public C16994k getExportUsernameBytes() {
                    return C16994k.m16791k(this.exportUsername_);
                }

                public long getFinderUin() {
                    return this.finderUin_;
                }

                public int getHeight() {
                    return this.height_;
                }

                public int getMediaType() {
                    return this.mediaType_;
                }

                public String getNonceId() {
                    return this.nonceId_;
                }

                public C16994k getNonceIdBytes() {
                    return C16994k.m16791k(this.nonceId_);
                }

                public String getObjectId() {
                    return this.objectId_;
                }

                public C16994k getObjectIdBytes() {
                    return C16994k.m16791k(this.objectId_);
                }

                public int getOnlineUserCount() {
                    return this.onlineUserCount_;
                }

                public String getRecReason() {
                    return this.recReason_;
                }

                public C16994k getRecReasonBytes() {
                    return C16994k.m16791k(this.recReason_);
                }

                public String getSessionBuffer() {
                    return this.sessionBuffer_;
                }

                public C16994k getSessionBufferBytes() {
                    return C16994k.m16791k(this.sessionBuffer_);
                }

                public int getShowIdentify() {
                    return this.showIdentify_;
                }

                public int getWidth() {
                    return this.width_;
                }

                public boolean hasCoverUrl() {
                    return (this.bitField0_ & 16) != 0;
                }

                public boolean hasDescription() {
                    return (this.bitField0_ & 256) != 0;
                }

                public boolean hasEncryptUsername() {
                    return (this.bitField0_ & 2048) != 0;
                }

                public boolean hasExportId() {
                    return (this.bitField0_ & 8) != 0;
                }

                public boolean hasExportUsername() {
                    return (this.bitField0_ & 1) != 0;
                }

                public boolean hasFinderUin() {
                    return (this.bitField0_ & 8192) != 0;
                }

                public boolean hasHeight() {
                    return (this.bitField0_ & 32) != 0;
                }

                public boolean hasMediaType() {
                    return (this.bitField0_ & 128) != 0;
                }

                public boolean hasNonceId() {
                    return (this.bitField0_ & 4) != 0;
                }

                public boolean hasObjectId() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasOnlineUserCount() {
                    return (this.bitField0_ & 1024) != 0;
                }

                public boolean hasRecReason() {
                    return (this.bitField0_ & 512) != 0;
                }

                public boolean hasSessionBuffer() {
                    return (this.bitField0_ & 4096) != 0;
                }

                public boolean hasShowIdentify() {
                    return (this.bitField0_ & 16384) != 0;
                }

                public boolean hasWidth() {
                    return (this.bitField0_ & 64) != 0;
                }

                public static Builder newBuilder(FinderInfo finderInfo) {
                    return (Builder) DEFAULT_INSTANCE.createBuilder(finderInfo);
                }

                public static FinderInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (FinderInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static FinderInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                }

                public static FinderInfo parseFrom(C16994k kVar) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                }

                public static FinderInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                }

                public static FinderInfo parseFrom(byte[] bArr) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static FinderInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                }

                public static FinderInfo parseFrom(InputStream inputStream) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static FinderInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static FinderInfo parseFrom(C23856l lVar) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                }

                public static FinderInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
                    return (FinderInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$FinderInfoOrBuilder */
            public interface FinderInfoOrBuilder extends C23848k1 {
                String getCoverUrl();

                C16994k getCoverUrlBytes();

                /* synthetic */ C23845j1 getDefaultInstanceForType();

                String getDescription();

                C16994k getDescriptionBytes();

                String getEncryptUsername();

                C16994k getEncryptUsernameBytes();

                String getExportId();

                C16994k getExportIdBytes();

                String getExportUsername();

                C16994k getExportUsernameBytes();

                long getFinderUin();

                int getHeight();

                int getMediaType();

                String getNonceId();

                C16994k getNonceIdBytes();

                String getObjectId();

                C16994k getObjectIdBytes();

                int getOnlineUserCount();

                String getRecReason();

                C16994k getRecReasonBytes();

                String getSessionBuffer();

                C16994k getSessionBufferBytes();

                int getShowIdentify();

                int getWidth();

                boolean hasCoverUrl();

                boolean hasDescription();

                boolean hasEncryptUsername();

                boolean hasExportId();

                boolean hasExportUsername();

                boolean hasFinderUin();

                boolean hasHeight();

                boolean hasMediaType();

                boolean hasNonceId();

                boolean hasObjectId();

                boolean hasOnlineUserCount();

                boolean hasRecReason();

                boolean hasSessionBuffer();

                boolean hasShowIdentify();

                boolean hasWidth();

                /* synthetic */ boolean isInitialized();
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$MapBizInfo */
            public static final class MapBizInfo extends C23861l0<MapBizInfo, Builder> implements MapBizInfoOrBuilder {
                /* access modifiers changed from: private */
                public static final MapBizInfo DEFAULT_INSTANCE;
                public static final int MAPPMSGID_FIELD_NUMBER = 2;
                public static final int MBIZUIN_FIELD_NUMBER = 1;
                public static final int MIDX_FIELD_NUMBER = 3;
                private static volatile C24062w1<MapBizInfo> PARSER;
                private int bitField0_;
                private int mappmsgid_;
                private int mbizuin_;
                private int midx_;

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$MapBizInfo$Builder */
                public static final class Builder extends C23861l0.C23862a<MapBizInfo, Builder> implements MapBizInfoOrBuilder {
                    public /* synthetic */ Builder(C243631 r1) {
                        this();
                    }

                    public Builder clearMappmsgid() {
                        copyOnWrite();
                        ((MapBizInfo) this.instance).clearMappmsgid();
                        return this;
                    }

                    public Builder clearMbizuin() {
                        copyOnWrite();
                        ((MapBizInfo) this.instance).clearMbizuin();
                        return this;
                    }

                    public Builder clearMidx() {
                        copyOnWrite();
                        ((MapBizInfo) this.instance).clearMidx();
                        return this;
                    }

                    public int getMappmsgid() {
                        return ((MapBizInfo) this.instance).getMappmsgid();
                    }

                    public int getMbizuin() {
                        return ((MapBizInfo) this.instance).getMbizuin();
                    }

                    public int getMidx() {
                        return ((MapBizInfo) this.instance).getMidx();
                    }

                    public boolean hasMappmsgid() {
                        return ((MapBizInfo) this.instance).hasMappmsgid();
                    }

                    public boolean hasMbizuin() {
                        return ((MapBizInfo) this.instance).hasMbizuin();
                    }

                    public boolean hasMidx() {
                        return ((MapBizInfo) this.instance).hasMidx();
                    }

                    public Builder setMappmsgid(int i) {
                        copyOnWrite();
                        ((MapBizInfo) this.instance).setMappmsgid(i);
                        return this;
                    }

                    public Builder setMbizuin(int i) {
                        copyOnWrite();
                        ((MapBizInfo) this.instance).setMbizuin(i);
                        return this;
                    }

                    public Builder setMidx(int i) {
                        copyOnWrite();
                        ((MapBizInfo) this.instance).setMidx(i);
                        return this;
                    }

                    private Builder() {
                        super(MapBizInfo.DEFAULT_INSTANCE);
                    }
                }

                static {
                    MapBizInfo mapBizInfo = new MapBizInfo();
                    DEFAULT_INSTANCE = mapBizInfo;
                    C23861l0.registerDefaultInstance(MapBizInfo.class, mapBizInfo);
                }

                private MapBizInfo() {
                }

                /* access modifiers changed from: private */
                public void clearMappmsgid() {
                    this.bitField0_ &= -3;
                    this.mappmsgid_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearMbizuin() {
                    this.bitField0_ &= -2;
                    this.mbizuin_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearMidx() {
                    this.bitField0_ &= -5;
                    this.midx_ = 0;
                }

                public static MapBizInfo getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Builder newBuilder() {
                    return (Builder) DEFAULT_INSTANCE.createBuilder();
                }

                public static MapBizInfo parseDelimitedFrom(InputStream inputStream) {
                    return (MapBizInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static MapBizInfo parseFrom(ByteBuffer byteBuffer) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static C24062w1<MapBizInfo> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* access modifiers changed from: private */
                public void setMappmsgid(int i) {
                    this.bitField0_ |= 2;
                    this.mappmsgid_ = i;
                }

                /* access modifiers changed from: private */
                public void setMbizuin(int i) {
                    this.bitField0_ |= 1;
                    this.mbizuin_ = i;
                }

                /* access modifiers changed from: private */
                public void setMidx(int i) {
                    this.bitField0_ |= 4;
                    this.midx_ = i;
                }

                public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                    switch (fVar.ordinal()) {
                        case 0:
                            return (byte) 1;
                        case 1:
                            return null;
                        case 2:
                            return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "mbizuin_", "mappmsgid_", "midx_"});
                        case 3:
                            return new MapBizInfo();
                        case 4:
                            return new Builder((C243631) null);
                        case 5:
                            return DEFAULT_INSTANCE;
                        case 6:
                            C24062w1<MapBizInfo> w1Var = PARSER;
                            if (w1Var == null) {
                                synchronized (MapBizInfo.class) {
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

                public int getMappmsgid() {
                    return this.mappmsgid_;
                }

                public int getMbizuin() {
                    return this.mbizuin_;
                }

                public int getMidx() {
                    return this.midx_;
                }

                public boolean hasMappmsgid() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasMbizuin() {
                    return (this.bitField0_ & 1) != 0;
                }

                public boolean hasMidx() {
                    return (this.bitField0_ & 4) != 0;
                }

                public static Builder newBuilder(MapBizInfo mapBizInfo) {
                    return (Builder) DEFAULT_INSTANCE.createBuilder(mapBizInfo);
                }

                public static MapBizInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (MapBizInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static MapBizInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                }

                public static MapBizInfo parseFrom(C16994k kVar) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                }

                public static MapBizInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                }

                public static MapBizInfo parseFrom(byte[] bArr) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static MapBizInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                }

                public static MapBizInfo parseFrom(InputStream inputStream) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static MapBizInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static MapBizInfo parseFrom(C23856l lVar) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                }

                public static MapBizInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
                    return (MapBizInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfo$MapBizInfoOrBuilder */
            public interface MapBizInfoOrBuilder extends C23848k1 {
                /* synthetic */ C23845j1 getDefaultInstanceForType();

                int getMappmsgid();

                int getMbizuin();

                int getMidx();

                boolean hasMappmsgid();

                boolean hasMbizuin();

                boolean hasMidx();

                /* synthetic */ boolean isInitialized();
            }

            static {
                LiveInfo liveInfo = new LiveInfo();
                DEFAULT_INSTANCE = liveInfo;
                C23861l0.registerDefaultInstance(LiveInfo.class, liveInfo);
            }

            private LiveInfo() {
            }

            /* access modifiers changed from: private */
            public void clearBiz() {
                this.biz_ = null;
                this.bitField0_ &= -2;
            }

            /* access modifiers changed from: private */
            public void clearFinder() {
                this.finder_ = null;
                this.bitField0_ &= -3;
            }

            /* access modifiers changed from: private */
            public void clearMapBiz() {
                this.mapBiz_ = null;
                this.bitField0_ &= -17;
            }

            /* access modifiers changed from: private */
            public void clearReportInfo() {
                this.bitField0_ &= -9;
                this.reportInfo_ = getDefaultInstance().getReportInfo();
            }

            /* access modifiers changed from: private */
            public void clearStatus() {
                this.bitField0_ &= -5;
                this.status_ = 0;
            }

            public static LiveInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeBiz(BizInfo bizInfo) {
                bizInfo.getClass();
                BizInfo bizInfo2 = this.biz_;
                if (bizInfo2 == null || bizInfo2 == BizInfo.getDefaultInstance()) {
                    this.biz_ = bizInfo;
                } else {
                    this.biz_ = (BizInfo) ((BizInfo.Builder) BizInfo.newBuilder(this.biz_).mergeFrom(bizInfo)).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            /* access modifiers changed from: private */
            public void mergeFinder(FinderInfo finderInfo) {
                finderInfo.getClass();
                FinderInfo finderInfo2 = this.finder_;
                if (finderInfo2 == null || finderInfo2 == FinderInfo.getDefaultInstance()) {
                    this.finder_ = finderInfo;
                } else {
                    this.finder_ = (FinderInfo) ((FinderInfo.Builder) FinderInfo.newBuilder(this.finder_).mergeFrom(finderInfo)).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void mergeMapBiz(MapBizInfo mapBizInfo) {
                mapBizInfo.getClass();
                MapBizInfo mapBizInfo2 = this.mapBiz_;
                if (mapBizInfo2 == null || mapBizInfo2 == MapBizInfo.getDefaultInstance()) {
                    this.mapBiz_ = mapBizInfo;
                } else {
                    this.mapBiz_ = (MapBizInfo) ((MapBizInfo.Builder) MapBizInfo.newBuilder(this.mapBiz_).mergeFrom(mapBizInfo)).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static LiveInfo parseDelimitedFrom(InputStream inputStream) {
                return (LiveInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LiveInfo parseFrom(ByteBuffer byteBuffer) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<LiveInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setBiz(BizInfo bizInfo) {
                bizInfo.getClass();
                this.biz_ = bizInfo;
                this.bitField0_ |= 1;
            }

            /* access modifiers changed from: private */
            public void setFinder(FinderInfo finderInfo) {
                finderInfo.getClass();
                this.finder_ = finderInfo;
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void setMapBiz(MapBizInfo mapBizInfo) {
                mapBizInfo.getClass();
                this.mapBiz_ = mapBizInfo;
                this.bitField0_ |= 16;
            }

            /* access modifiers changed from: private */
            public void setReportInfo(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.reportInfo_ = str;
            }

            /* access modifiers changed from: private */
            public void setReportInfoBytes(C16994k kVar) {
                this.reportInfo_ = kVar.mo18752u();
                this.bitField0_ |= 8;
            }

            /* access modifiers changed from: private */
            public void setStatus(int i) {
                this.bitField0_ |= 4;
                this.status_ = i;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "biz_", "finder_", "status_", "reportInfo_", "mapBiz_"});
                    case 3:
                        return new LiveInfo();
                    case 4:
                        return new Builder((C243631) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<LiveInfo> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (LiveInfo.class) {
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

            public BizInfo getBiz() {
                BizInfo bizInfo = this.biz_;
                return bizInfo == null ? BizInfo.getDefaultInstance() : bizInfo;
            }

            public FinderInfo getFinder() {
                FinderInfo finderInfo = this.finder_;
                return finderInfo == null ? FinderInfo.getDefaultInstance() : finderInfo;
            }

            public MapBizInfo getMapBiz() {
                MapBizInfo mapBizInfo = this.mapBiz_;
                return mapBizInfo == null ? MapBizInfo.getDefaultInstance() : mapBizInfo;
            }

            public String getReportInfo() {
                return this.reportInfo_;
            }

            public C16994k getReportInfoBytes() {
                return C16994k.m16791k(this.reportInfo_);
            }

            public int getStatus() {
                return this.status_;
            }

            public boolean hasBiz() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasFinder() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasMapBiz() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasReportInfo() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            public static Builder newBuilder(LiveInfo liveInfo) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(liveInfo);
            }

            public static LiveInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (LiveInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static LiveInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static LiveInfo parseFrom(C16994k kVar) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static LiveInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static LiveInfo parseFrom(byte[] bArr) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LiveInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static LiveInfo parseFrom(InputStream inputStream) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LiveInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static LiveInfo parseFrom(C23856l lVar) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static LiveInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (LiveInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBuffer$LiveInfoOrBuilder */
        public interface LiveInfoOrBuilder extends C23848k1 {
            LiveInfo.BizInfo getBiz();

            /* synthetic */ C23845j1 getDefaultInstanceForType();

            LiveInfo.FinderInfo getFinder();

            LiveInfo.MapBizInfo getMapBiz();

            String getReportInfo();

            C16994k getReportInfoBytes();

            int getStatus();

            boolean hasBiz();

            boolean hasFinder();

            boolean hasMapBiz();

            boolean hasReportInfo();

            boolean hasStatus();

            /* synthetic */ boolean isInitialized();
        }

        static {
            RecommendLiveCanvasBuffer recommendLiveCanvasBuffer = new RecommendLiveCanvasBuffer();
            DEFAULT_INSTANCE = recommendLiveCanvasBuffer;
            C23861l0.registerDefaultInstance(RecommendLiveCanvasBuffer.class, recommendLiveCanvasBuffer);
        }

        private RecommendLiveCanvasBuffer() {
        }

        /* access modifiers changed from: private */
        public void addAllInfo(Iterable<? extends LiveInfo> iterable) {
            ensureInfoIsMutable();
            C23810b.addAll(iterable, this.info_);
        }

        /* access modifiers changed from: private */
        public void addInfo(LiveInfo liveInfo) {
            liveInfo.getClass();
            ensureInfoIsMutable();
            this.info_.add(liveInfo);
        }

        /* access modifiers changed from: private */
        public void clearInfo() {
            this.info_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        private void ensureInfoIsMutable() {
            C23908o0.C23919j<LiveInfo> jVar = this.info_;
            if (!jVar.mo37523Q()) {
                this.info_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static RecommendLiveCanvasBuffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RecommendLiveCanvasBuffer parseDelimitedFrom(InputStream inputStream) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecommendLiveCanvasBuffer parseFrom(ByteBuffer byteBuffer) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RecommendLiveCanvasBuffer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeInfo(int i) {
            ensureInfoIsMutable();
            this.info_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setInfo(int i, LiveInfo liveInfo) {
            liveInfo.getClass();
            ensureInfoIsMutable();
            this.info_.set(i, liveInfo);
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b", new Object[]{"bitField0_", "type_", "info_", LiveInfo.class});
                case 3:
                    return new RecommendLiveCanvasBuffer();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RecommendLiveCanvasBuffer> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RecommendLiveCanvasBuffer.class) {
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

        public LiveInfo getInfo(int i) {
            return this.info_.get(i);
        }

        public int getInfoCount() {
            return this.info_.size();
        }

        public List<LiveInfo> getInfoList() {
            return this.info_;
        }

        public LiveInfoOrBuilder getInfoOrBuilder(int i) {
            return this.info_.get(i);
        }

        public List<? extends LiveInfoOrBuilder> getInfoOrBuilderList() {
            return this.info_;
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(RecommendLiveCanvasBuffer recommendLiveCanvasBuffer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(recommendLiveCanvasBuffer);
        }

        public static RecommendLiveCanvasBuffer parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RecommendLiveCanvasBuffer parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RecommendLiveCanvasBuffer parseFrom(C16994k kVar) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addInfo(int i, LiveInfo liveInfo) {
            liveInfo.getClass();
            ensureInfoIsMutable();
            this.info_.add(i, liveInfo);
        }

        public static RecommendLiveCanvasBuffer parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RecommendLiveCanvasBuffer parseFrom(byte[] bArr) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecommendLiveCanvasBuffer parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RecommendLiveCanvasBuffer parseFrom(InputStream inputStream) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecommendLiveCanvasBuffer parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RecommendLiveCanvasBuffer parseFrom(C23856l lVar) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RecommendLiveCanvasBuffer parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RecommendLiveCanvasBuffer) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$RecommendLiveCanvasBufferOrBuilder */
    public interface RecommendLiveCanvasBufferOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        RecommendLiveCanvasBuffer.LiveInfo getInfo(int i);

        int getInfoCount();

        List<RecommendLiveCanvasBuffer.LiveInfo> getInfoList();

        int getType();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticle */
    public static final class BizRecommendArticle extends C23861l0<BizRecommendArticle, Builder> implements BizRecommendArticleOrBuilder {
        public static final int AGGREGATIONTITLE_FIELD_NUMBER = 16;
        public static final int AGGREGATIONURL_FIELD_NUMBER = 15;
        public static final int APPMSG_SEND_TIME_FIELD_NUMBER = 37;
        public static final int ARTICLE_CATE_FIELD_NUMBER = 39;
        public static final int AUDIT_STAT_FIELD_NUMBER = 38;
        public static final int BIZACCOUNT_FIELD_NUMBER = 2;
        public static final int CANVASBUFFER_FIELD_NUMBER = 34;
        public static final int CANVASLIVEFEEDS_FIELD_NUMBER = 31;
        public static final int CARDID_FIELD_NUMBER = 10;
        /* access modifiers changed from: private */
        public static final BizRecommendArticle DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 7;
        public static final int EXPTYPE_FIELD_NUMBER = 11;
        public static final int EXTRADATA_FIELD_NUMBER = 17;
        public static final int FAILUREBEHAVIOR_FIELD_NUMBER = 32;
        public static final int NATIVEFINDERFEEDS_FIELD_NUMBER = 28;
        public static final int NEGATIVEFEEDBACKREASON_FIELD_NUMBER = 13;
        public static final int NEGATIVEFEEDBACKTITLE_FIELD_NUMBER = 33;
        public static final int PACKAGEVERSION_FIELD_NUMBER = 35;
        private static volatile C24062w1<BizRecommendArticle> PARSER = null;
        public static final int POS_FIELD_NUMBER = 3;
        public static final int RECID_FIELD_NUMBER = 5;
        public static final int RECSUMMARY_FIELD_NUMBER = 9;
        public static final int RECUNIQUEFLAG_FIELD_NUMBER = 20;
        public static final int RECYCLEATTR_FIELD_NUMBER = 36;
        public static final int REDDOTFLAG_FIELD_NUMBER = 8;
        public static final int RETRIEVETYPE_FIELD_NUMBER = 29;
        public static final int SHOWNEGATIVEFEEDBACKREASON_FIELD_NUMBER = 14;
        public static final int STYLE_FIELD_NUMBER = 6;
        public static final int SUBSCRIBEFILTERFLAG_FIELD_NUMBER = 41;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int TOPRIGHTSHOWMODE_FIELD_NUMBER = 40;
        public static final int USESERVERTIME_FIELD_NUMBER = 12;
        public static final int VALIDITYPERIOD_FIELD_NUMBER = 30;
        public static final int WEIGHT_FIELD_NUMBER = 4;
        private String aggregationTitle_ = "";
        private String aggregationUrl_ = "";
        private int appmsgSendTime_;
        private String articleCate_ = "";
        private int auditStat_;
        private int bitField0_;
        private C23908o0.C23919j<BizRecommendArticleBizAccount> bizAccount_ = C23861l0.emptyProtobufList();
        private String canvasBuffer_ = "";
        private RecommendLiveCanvasBuffer canvasLiveFeeds_;
        private String cardId_ = "";
        private String event_ = "";
        private String expType_ = "";
        private String extraData_ = "";
        private int failureBehavior_;
        private NativeFinderFeeds nativeFinderFeeds_;
        private C23908o0.C23919j<String> negativeFeedbackReason_ = C23861l0.emptyProtobufList();
        private String negativeFeedbackTitle_ = "";
        private int packageVersion_;
        private int pos_;
        private long recID_;
        private String recSummary_ = "";
        private int recUniqueFlag_;
        private BizRecommendArticleRecycleAttr recycleAttr_;
        private int redDotFlag_;
        private int retrieveType_;
        private int showNegativeFeedbackReason_;
        private int style_;
        private int subscribeFilterFlag_;
        private String title_ = "";
        private int toprightShowMode_;
        private int useServerTime_;
        private int validityPeriod_;
        private int weight_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticle$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRecommendArticle, Builder> implements BizRecommendArticleOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder addAllBizAccount(Iterable<? extends BizRecommendArticleBizAccount> iterable) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).addAllBizAccount(iterable);
                return this;
            }

            public Builder addAllNegativeFeedbackReason(Iterable<String> iterable) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).addAllNegativeFeedbackReason(iterable);
                return this;
            }

            public Builder addBizAccount(BizRecommendArticleBizAccount bizRecommendArticleBizAccount) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).addBizAccount(bizRecommendArticleBizAccount);
                return this;
            }

            public Builder addNegativeFeedbackReason(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).addNegativeFeedbackReason(str);
                return this;
            }

            public Builder addNegativeFeedbackReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).addNegativeFeedbackReasonBytes(kVar);
                return this;
            }

            public Builder clearAggregationTitle() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearAggregationTitle();
                return this;
            }

            public Builder clearAggregationUrl() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearAggregationUrl();
                return this;
            }

            public Builder clearAppmsgSendTime() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearAppmsgSendTime();
                return this;
            }

            public Builder clearArticleCate() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearArticleCate();
                return this;
            }

            public Builder clearAuditStat() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearAuditStat();
                return this;
            }

            public Builder clearBizAccount() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearBizAccount();
                return this;
            }

            public Builder clearCanvasBuffer() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearCanvasBuffer();
                return this;
            }

            public Builder clearCanvasLiveFeeds() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearCanvasLiveFeeds();
                return this;
            }

            public Builder clearCardId() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearCardId();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearEvent();
                return this;
            }

            public Builder clearExpType() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearExpType();
                return this;
            }

            public Builder clearExtraData() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearExtraData();
                return this;
            }

            public Builder clearFailureBehavior() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearFailureBehavior();
                return this;
            }

            public Builder clearNativeFinderFeeds() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearNativeFinderFeeds();
                return this;
            }

            public Builder clearNegativeFeedbackReason() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearNegativeFeedbackReason();
                return this;
            }

            public Builder clearNegativeFeedbackTitle() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearNegativeFeedbackTitle();
                return this;
            }

            public Builder clearPackageVersion() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearPackageVersion();
                return this;
            }

            public Builder clearPos() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearPos();
                return this;
            }

            public Builder clearRecID() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearRecID();
                return this;
            }

            public Builder clearRecSummary() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearRecSummary();
                return this;
            }

            public Builder clearRecUniqueFlag() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearRecUniqueFlag();
                return this;
            }

            public Builder clearRecycleAttr() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearRecycleAttr();
                return this;
            }

            public Builder clearRedDotFlag() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearRedDotFlag();
                return this;
            }

            public Builder clearRetrieveType() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearRetrieveType();
                return this;
            }

            public Builder clearShowNegativeFeedbackReason() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearShowNegativeFeedbackReason();
                return this;
            }

            public Builder clearStyle() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearStyle();
                return this;
            }

            public Builder clearSubscribeFilterFlag() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearSubscribeFilterFlag();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearTitle();
                return this;
            }

            public Builder clearToprightShowMode() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearToprightShowMode();
                return this;
            }

            public Builder clearUseServerTime() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearUseServerTime();
                return this;
            }

            public Builder clearValidityPeriod() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearValidityPeriod();
                return this;
            }

            public Builder clearWeight() {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).clearWeight();
                return this;
            }

            public String getAggregationTitle() {
                return ((BizRecommendArticle) this.instance).getAggregationTitle();
            }

            public C16994k getAggregationTitleBytes() {
                return ((BizRecommendArticle) this.instance).getAggregationTitleBytes();
            }

            public String getAggregationUrl() {
                return ((BizRecommendArticle) this.instance).getAggregationUrl();
            }

            public C16994k getAggregationUrlBytes() {
                return ((BizRecommendArticle) this.instance).getAggregationUrlBytes();
            }

            public int getAppmsgSendTime() {
                return ((BizRecommendArticle) this.instance).getAppmsgSendTime();
            }

            public String getArticleCate() {
                return ((BizRecommendArticle) this.instance).getArticleCate();
            }

            public C16994k getArticleCateBytes() {
                return ((BizRecommendArticle) this.instance).getArticleCateBytes();
            }

            public int getAuditStat() {
                return ((BizRecommendArticle) this.instance).getAuditStat();
            }

            public BizRecommendArticleBizAccount getBizAccount(int i) {
                return ((BizRecommendArticle) this.instance).getBizAccount(i);
            }

            public int getBizAccountCount() {
                return ((BizRecommendArticle) this.instance).getBizAccountCount();
            }

            public List<BizRecommendArticleBizAccount> getBizAccountList() {
                return Collections.unmodifiableList(((BizRecommendArticle) this.instance).getBizAccountList());
            }

            public String getCanvasBuffer() {
                return ((BizRecommendArticle) this.instance).getCanvasBuffer();
            }

            public C16994k getCanvasBufferBytes() {
                return ((BizRecommendArticle) this.instance).getCanvasBufferBytes();
            }

            public RecommendLiveCanvasBuffer getCanvasLiveFeeds() {
                return ((BizRecommendArticle) this.instance).getCanvasLiveFeeds();
            }

            public String getCardId() {
                return ((BizRecommendArticle) this.instance).getCardId();
            }

            public C16994k getCardIdBytes() {
                return ((BizRecommendArticle) this.instance).getCardIdBytes();
            }

            public String getEvent() {
                return ((BizRecommendArticle) this.instance).getEvent();
            }

            public C16994k getEventBytes() {
                return ((BizRecommendArticle) this.instance).getEventBytes();
            }

            public String getExpType() {
                return ((BizRecommendArticle) this.instance).getExpType();
            }

            public C16994k getExpTypeBytes() {
                return ((BizRecommendArticle) this.instance).getExpTypeBytes();
            }

            public String getExtraData() {
                return ((BizRecommendArticle) this.instance).getExtraData();
            }

            public C16994k getExtraDataBytes() {
                return ((BizRecommendArticle) this.instance).getExtraDataBytes();
            }

            public int getFailureBehavior() {
                return ((BizRecommendArticle) this.instance).getFailureBehavior();
            }

            public NativeFinderFeeds getNativeFinderFeeds() {
                return ((BizRecommendArticle) this.instance).getNativeFinderFeeds();
            }

            public String getNegativeFeedbackReason(int i) {
                return ((BizRecommendArticle) this.instance).getNegativeFeedbackReason(i);
            }

            public C16994k getNegativeFeedbackReasonBytes(int i) {
                return ((BizRecommendArticle) this.instance).getNegativeFeedbackReasonBytes(i);
            }

            public int getNegativeFeedbackReasonCount() {
                return ((BizRecommendArticle) this.instance).getNegativeFeedbackReasonCount();
            }

            public List<String> getNegativeFeedbackReasonList() {
                return Collections.unmodifiableList(((BizRecommendArticle) this.instance).getNegativeFeedbackReasonList());
            }

            public String getNegativeFeedbackTitle() {
                return ((BizRecommendArticle) this.instance).getNegativeFeedbackTitle();
            }

            public C16994k getNegativeFeedbackTitleBytes() {
                return ((BizRecommendArticle) this.instance).getNegativeFeedbackTitleBytes();
            }

            public int getPackageVersion() {
                return ((BizRecommendArticle) this.instance).getPackageVersion();
            }

            public int getPos() {
                return ((BizRecommendArticle) this.instance).getPos();
            }

            public long getRecID() {
                return ((BizRecommendArticle) this.instance).getRecID();
            }

            public String getRecSummary() {
                return ((BizRecommendArticle) this.instance).getRecSummary();
            }

            public C16994k getRecSummaryBytes() {
                return ((BizRecommendArticle) this.instance).getRecSummaryBytes();
            }

            public int getRecUniqueFlag() {
                return ((BizRecommendArticle) this.instance).getRecUniqueFlag();
            }

            public BizRecommendArticleRecycleAttr getRecycleAttr() {
                return ((BizRecommendArticle) this.instance).getRecycleAttr();
            }

            public int getRedDotFlag() {
                return ((BizRecommendArticle) this.instance).getRedDotFlag();
            }

            public int getRetrieveType() {
                return ((BizRecommendArticle) this.instance).getRetrieveType();
            }

            public int getShowNegativeFeedbackReason() {
                return ((BizRecommendArticle) this.instance).getShowNegativeFeedbackReason();
            }

            public int getStyle() {
                return ((BizRecommendArticle) this.instance).getStyle();
            }

            public int getSubscribeFilterFlag() {
                return ((BizRecommendArticle) this.instance).getSubscribeFilterFlag();
            }

            public String getTitle() {
                return ((BizRecommendArticle) this.instance).getTitle();
            }

            public C16994k getTitleBytes() {
                return ((BizRecommendArticle) this.instance).getTitleBytes();
            }

            public int getToprightShowMode() {
                return ((BizRecommendArticle) this.instance).getToprightShowMode();
            }

            public int getUseServerTime() {
                return ((BizRecommendArticle) this.instance).getUseServerTime();
            }

            public int getValidityPeriod() {
                return ((BizRecommendArticle) this.instance).getValidityPeriod();
            }

            public int getWeight() {
                return ((BizRecommendArticle) this.instance).getWeight();
            }

            public boolean hasAggregationTitle() {
                return ((BizRecommendArticle) this.instance).hasAggregationTitle();
            }

            public boolean hasAggregationUrl() {
                return ((BizRecommendArticle) this.instance).hasAggregationUrl();
            }

            public boolean hasAppmsgSendTime() {
                return ((BizRecommendArticle) this.instance).hasAppmsgSendTime();
            }

            public boolean hasArticleCate() {
                return ((BizRecommendArticle) this.instance).hasArticleCate();
            }

            public boolean hasAuditStat() {
                return ((BizRecommendArticle) this.instance).hasAuditStat();
            }

            public boolean hasCanvasBuffer() {
                return ((BizRecommendArticle) this.instance).hasCanvasBuffer();
            }

            public boolean hasCanvasLiveFeeds() {
                return ((BizRecommendArticle) this.instance).hasCanvasLiveFeeds();
            }

            public boolean hasCardId() {
                return ((BizRecommendArticle) this.instance).hasCardId();
            }

            public boolean hasEvent() {
                return ((BizRecommendArticle) this.instance).hasEvent();
            }

            public boolean hasExpType() {
                return ((BizRecommendArticle) this.instance).hasExpType();
            }

            public boolean hasExtraData() {
                return ((BizRecommendArticle) this.instance).hasExtraData();
            }

            public boolean hasFailureBehavior() {
                return ((BizRecommendArticle) this.instance).hasFailureBehavior();
            }

            public boolean hasNativeFinderFeeds() {
                return ((BizRecommendArticle) this.instance).hasNativeFinderFeeds();
            }

            public boolean hasNegativeFeedbackTitle() {
                return ((BizRecommendArticle) this.instance).hasNegativeFeedbackTitle();
            }

            public boolean hasPackageVersion() {
                return ((BizRecommendArticle) this.instance).hasPackageVersion();
            }

            public boolean hasPos() {
                return ((BizRecommendArticle) this.instance).hasPos();
            }

            public boolean hasRecID() {
                return ((BizRecommendArticle) this.instance).hasRecID();
            }

            public boolean hasRecSummary() {
                return ((BizRecommendArticle) this.instance).hasRecSummary();
            }

            public boolean hasRecUniqueFlag() {
                return ((BizRecommendArticle) this.instance).hasRecUniqueFlag();
            }

            public boolean hasRecycleAttr() {
                return ((BizRecommendArticle) this.instance).hasRecycleAttr();
            }

            public boolean hasRedDotFlag() {
                return ((BizRecommendArticle) this.instance).hasRedDotFlag();
            }

            public boolean hasRetrieveType() {
                return ((BizRecommendArticle) this.instance).hasRetrieveType();
            }

            public boolean hasShowNegativeFeedbackReason() {
                return ((BizRecommendArticle) this.instance).hasShowNegativeFeedbackReason();
            }

            public boolean hasStyle() {
                return ((BizRecommendArticle) this.instance).hasStyle();
            }

            public boolean hasSubscribeFilterFlag() {
                return ((BizRecommendArticle) this.instance).hasSubscribeFilterFlag();
            }

            public boolean hasTitle() {
                return ((BizRecommendArticle) this.instance).hasTitle();
            }

            public boolean hasToprightShowMode() {
                return ((BizRecommendArticle) this.instance).hasToprightShowMode();
            }

            public boolean hasUseServerTime() {
                return ((BizRecommendArticle) this.instance).hasUseServerTime();
            }

            public boolean hasValidityPeriod() {
                return ((BizRecommendArticle) this.instance).hasValidityPeriod();
            }

            public boolean hasWeight() {
                return ((BizRecommendArticle) this.instance).hasWeight();
            }

            public Builder mergeCanvasLiveFeeds(RecommendLiveCanvasBuffer recommendLiveCanvasBuffer) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).mergeCanvasLiveFeeds(recommendLiveCanvasBuffer);
                return this;
            }

            public Builder mergeNativeFinderFeeds(NativeFinderFeeds nativeFinderFeeds) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).mergeNativeFinderFeeds(nativeFinderFeeds);
                return this;
            }

            public Builder mergeRecycleAttr(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).mergeRecycleAttr(bizRecommendArticleRecycleAttr);
                return this;
            }

            public Builder removeBizAccount(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).removeBizAccount(i);
                return this;
            }

            public Builder setAggregationTitle(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setAggregationTitle(str);
                return this;
            }

            public Builder setAggregationTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setAggregationTitleBytes(kVar);
                return this;
            }

            public Builder setAggregationUrl(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setAggregationUrl(str);
                return this;
            }

            public Builder setAggregationUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setAggregationUrlBytes(kVar);
                return this;
            }

            public Builder setAppmsgSendTime(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setAppmsgSendTime(i);
                return this;
            }

            public Builder setArticleCate(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setArticleCate(str);
                return this;
            }

            public Builder setArticleCateBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setArticleCateBytes(kVar);
                return this;
            }

            public Builder setAuditStat(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setAuditStat(i);
                return this;
            }

            public Builder setBizAccount(int i, BizRecommendArticleBizAccount bizRecommendArticleBizAccount) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setBizAccount(i, bizRecommendArticleBizAccount);
                return this;
            }

            public Builder setCanvasBuffer(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setCanvasBuffer(str);
                return this;
            }

            public Builder setCanvasBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setCanvasBufferBytes(kVar);
                return this;
            }

            public Builder setCanvasLiveFeeds(RecommendLiveCanvasBuffer recommendLiveCanvasBuffer) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setCanvasLiveFeeds(recommendLiveCanvasBuffer);
                return this;
            }

            public Builder setCardId(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setCardId(str);
                return this;
            }

            public Builder setCardIdBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setCardIdBytes(kVar);
                return this;
            }

            public Builder setEvent(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setEvent(str);
                return this;
            }

            public Builder setEventBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setEventBytes(kVar);
                return this;
            }

            public Builder setExpType(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setExpType(str);
                return this;
            }

            public Builder setExpTypeBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setExpTypeBytes(kVar);
                return this;
            }

            public Builder setExtraData(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setExtraData(str);
                return this;
            }

            public Builder setExtraDataBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setExtraDataBytes(kVar);
                return this;
            }

            public Builder setFailureBehavior(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setFailureBehavior(i);
                return this;
            }

            public Builder setNativeFinderFeeds(NativeFinderFeeds nativeFinderFeeds) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setNativeFinderFeeds(nativeFinderFeeds);
                return this;
            }

            public Builder setNegativeFeedbackReason(int i, String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setNegativeFeedbackReason(i, str);
                return this;
            }

            public Builder setNegativeFeedbackTitle(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setNegativeFeedbackTitle(str);
                return this;
            }

            public Builder setNegativeFeedbackTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setNegativeFeedbackTitleBytes(kVar);
                return this;
            }

            public Builder setPackageVersion(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setPackageVersion(i);
                return this;
            }

            public Builder setPos(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setPos(i);
                return this;
            }

            public Builder setRecID(long j) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setRecID(j);
                return this;
            }

            public Builder setRecSummary(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setRecSummary(str);
                return this;
            }

            public Builder setRecSummaryBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setRecSummaryBytes(kVar);
                return this;
            }

            public Builder setRecUniqueFlag(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setRecUniqueFlag(i);
                return this;
            }

            public Builder setRecycleAttr(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setRecycleAttr(bizRecommendArticleRecycleAttr);
                return this;
            }

            public Builder setRedDotFlag(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setRedDotFlag(i);
                return this;
            }

            public Builder setRetrieveType(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setRetrieveType(i);
                return this;
            }

            public Builder setShowNegativeFeedbackReason(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setShowNegativeFeedbackReason(i);
                return this;
            }

            public Builder setStyle(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setStyle(i);
                return this;
            }

            public Builder setSubscribeFilterFlag(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setSubscribeFilterFlag(i);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setTitleBytes(kVar);
                return this;
            }

            public Builder setToprightShowMode(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setToprightShowMode(i);
                return this;
            }

            public Builder setUseServerTime(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setUseServerTime(i);
                return this;
            }

            public Builder setValidityPeriod(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setValidityPeriod(i);
                return this;
            }

            public Builder setWeight(int i) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setWeight(i);
                return this;
            }

            private Builder() {
                super(BizRecommendArticle.DEFAULT_INSTANCE);
            }

            public Builder addBizAccount(int i, BizRecommendArticleBizAccount bizRecommendArticleBizAccount) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).addBizAccount(i, bizRecommendArticleBizAccount);
                return this;
            }

            public Builder setBizAccount(int i, BizRecommendArticleBizAccount.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setBizAccount(i, (BizRecommendArticleBizAccount) builder.build());
                return this;
            }

            public Builder setCanvasLiveFeeds(RecommendLiveCanvasBuffer.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setCanvasLiveFeeds((RecommendLiveCanvasBuffer) builder.build());
                return this;
            }

            public Builder setNativeFinderFeeds(NativeFinderFeeds.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setNativeFinderFeeds((NativeFinderFeeds) builder.build());
                return this;
            }

            public Builder setRecycleAttr(BizRecommendArticleRecycleAttr.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).setRecycleAttr((BizRecommendArticleRecycleAttr) builder.build());
                return this;
            }

            public Builder addBizAccount(BizRecommendArticleBizAccount.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).addBizAccount((BizRecommendArticleBizAccount) builder.build());
                return this;
            }

            public Builder addBizAccount(int i, BizRecommendArticleBizAccount.Builder builder) {
                copyOnWrite();
                ((BizRecommendArticle) this.instance).addBizAccount(i, (BizRecommendArticleBizAccount) builder.build());
                return this;
            }
        }

        static {
            BizRecommendArticle bizRecommendArticle = new BizRecommendArticle();
            DEFAULT_INSTANCE = bizRecommendArticle;
            C23861l0.registerDefaultInstance(BizRecommendArticle.class, bizRecommendArticle);
        }

        private BizRecommendArticle() {
        }

        /* access modifiers changed from: private */
        public void addAllBizAccount(Iterable<? extends BizRecommendArticleBizAccount> iterable) {
            ensureBizAccountIsMutable();
            C23810b.addAll(iterable, this.bizAccount_);
        }

        /* access modifiers changed from: private */
        public void addAllNegativeFeedbackReason(Iterable<String> iterable) {
            ensureNegativeFeedbackReasonIsMutable();
            C23810b.addAll(iterable, this.negativeFeedbackReason_);
        }

        /* access modifiers changed from: private */
        public void addBizAccount(BizRecommendArticleBizAccount bizRecommendArticleBizAccount) {
            bizRecommendArticleBizAccount.getClass();
            ensureBizAccountIsMutable();
            this.bizAccount_.add(bizRecommendArticleBizAccount);
        }

        /* access modifiers changed from: private */
        public void addNegativeFeedbackReason(String str) {
            str.getClass();
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.add(str);
        }

        /* access modifiers changed from: private */
        public void addNegativeFeedbackReasonBytes(C16994k kVar) {
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearAggregationTitle() {
            this.bitField0_ &= -8193;
            this.aggregationTitle_ = getDefaultInstance().getAggregationTitle();
        }

        /* access modifiers changed from: private */
        public void clearAggregationUrl() {
            this.bitField0_ &= -4097;
            this.aggregationUrl_ = getDefaultInstance().getAggregationUrl();
        }

        /* access modifiers changed from: private */
        public void clearAppmsgSendTime() {
            this.bitField0_ &= -33554433;
            this.appmsgSendTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearArticleCate() {
            this.bitField0_ &= -134217729;
            this.articleCate_ = getDefaultInstance().getArticleCate();
        }

        /* access modifiers changed from: private */
        public void clearAuditStat() {
            this.bitField0_ &= -67108865;
            this.auditStat_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBizAccount() {
            this.bizAccount_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearCanvasBuffer() {
            this.bitField0_ &= -4194305;
            this.canvasBuffer_ = getDefaultInstance().getCanvasBuffer();
        }

        /* access modifiers changed from: private */
        public void clearCanvasLiveFeeds() {
            this.canvasLiveFeeds_ = null;
            this.bitField0_ &= -524289;
        }

        /* access modifiers changed from: private */
        public void clearCardId() {
            this.bitField0_ &= -257;
            this.cardId_ = getDefaultInstance().getCardId();
        }

        /* access modifiers changed from: private */
        public void clearEvent() {
            this.bitField0_ &= -33;
            this.event_ = getDefaultInstance().getEvent();
        }

        /* access modifiers changed from: private */
        public void clearExpType() {
            this.bitField0_ &= -513;
            this.expType_ = getDefaultInstance().getExpType();
        }

        /* access modifiers changed from: private */
        public void clearExtraData() {
            this.bitField0_ &= -16385;
            this.extraData_ = getDefaultInstance().getExtraData();
        }

        /* access modifiers changed from: private */
        public void clearFailureBehavior() {
            this.bitField0_ &= -1048577;
            this.failureBehavior_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNativeFinderFeeds() {
            this.nativeFinderFeeds_ = null;
            this.bitField0_ &= -65537;
        }

        /* access modifiers changed from: private */
        public void clearNegativeFeedbackReason() {
            this.negativeFeedbackReason_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearNegativeFeedbackTitle() {
            this.bitField0_ &= -2097153;
            this.negativeFeedbackTitle_ = getDefaultInstance().getNegativeFeedbackTitle();
        }

        /* access modifiers changed from: private */
        public void clearPackageVersion() {
            this.bitField0_ &= -8388609;
            this.packageVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPos() {
            this.bitField0_ &= -3;
            this.pos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecID() {
            this.bitField0_ &= -9;
            this.recID_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecSummary() {
            this.bitField0_ &= -129;
            this.recSummary_ = getDefaultInstance().getRecSummary();
        }

        /* access modifiers changed from: private */
        public void clearRecUniqueFlag() {
            this.bitField0_ &= -32769;
            this.recUniqueFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecycleAttr() {
            this.recycleAttr_ = null;
            this.bitField0_ &= -16777217;
        }

        /* access modifiers changed from: private */
        public void clearRedDotFlag() {
            this.bitField0_ &= -65;
            this.redDotFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRetrieveType() {
            this.bitField0_ &= -131073;
            this.retrieveType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearShowNegativeFeedbackReason() {
            this.bitField0_ &= -2049;
            this.showNegativeFeedbackReason_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStyle() {
            this.bitField0_ &= -17;
            this.style_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSubscribeFilterFlag() {
            this.bitField0_ &= -536870913;
            this.subscribeFilterFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -2;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* access modifiers changed from: private */
        public void clearToprightShowMode() {
            this.bitField0_ &= -268435457;
            this.toprightShowMode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUseServerTime() {
            this.bitField0_ &= -1025;
            this.useServerTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearValidityPeriod() {
            this.bitField0_ &= -262145;
            this.validityPeriod_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWeight() {
            this.bitField0_ &= -5;
            this.weight_ = 0;
        }

        private void ensureBizAccountIsMutable() {
            C23908o0.C23919j<BizRecommendArticleBizAccount> jVar = this.bizAccount_;
            if (!jVar.mo37523Q()) {
                this.bizAccount_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureNegativeFeedbackReasonIsMutable() {
            C23908o0.C23919j<String> jVar = this.negativeFeedbackReason_;
            if (!jVar.mo37523Q()) {
                this.negativeFeedbackReason_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizRecommendArticle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCanvasLiveFeeds(RecommendLiveCanvasBuffer recommendLiveCanvasBuffer) {
            recommendLiveCanvasBuffer.getClass();
            RecommendLiveCanvasBuffer recommendLiveCanvasBuffer2 = this.canvasLiveFeeds_;
            if (recommendLiveCanvasBuffer2 == null || recommendLiveCanvasBuffer2 == RecommendLiveCanvasBuffer.getDefaultInstance()) {
                this.canvasLiveFeeds_ = recommendLiveCanvasBuffer;
            } else {
                this.canvasLiveFeeds_ = (RecommendLiveCanvasBuffer) ((RecommendLiveCanvasBuffer.Builder) RecommendLiveCanvasBuffer.newBuilder(this.canvasLiveFeeds_).mergeFrom(recommendLiveCanvasBuffer)).buildPartial();
            }
            this.bitField0_ |= 524288;
        }

        /* access modifiers changed from: private */
        public void mergeNativeFinderFeeds(NativeFinderFeeds nativeFinderFeeds) {
            nativeFinderFeeds.getClass();
            NativeFinderFeeds nativeFinderFeeds2 = this.nativeFinderFeeds_;
            if (nativeFinderFeeds2 == null || nativeFinderFeeds2 == NativeFinderFeeds.getDefaultInstance()) {
                this.nativeFinderFeeds_ = nativeFinderFeeds;
            } else {
                this.nativeFinderFeeds_ = (NativeFinderFeeds) ((NativeFinderFeeds.Builder) NativeFinderFeeds.newBuilder(this.nativeFinderFeeds_).mergeFrom(nativeFinderFeeds)).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        /* access modifiers changed from: private */
        public void mergeRecycleAttr(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
            bizRecommendArticleRecycleAttr.getClass();
            BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr2 = this.recycleAttr_;
            if (bizRecommendArticleRecycleAttr2 == null || bizRecommendArticleRecycleAttr2 == BizRecommendArticleRecycleAttr.getDefaultInstance()) {
                this.recycleAttr_ = bizRecommendArticleRecycleAttr;
            } else {
                this.recycleAttr_ = (BizRecommendArticleRecycleAttr) ((BizRecommendArticleRecycleAttr.Builder) BizRecommendArticleRecycleAttr.newBuilder(this.recycleAttr_).mergeFrom(bizRecommendArticleRecycleAttr)).buildPartial();
            }
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRecommendArticle parseDelimitedFrom(InputStream inputStream) {
            return (BizRecommendArticle) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticle parseFrom(ByteBuffer byteBuffer) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRecommendArticle> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeBizAccount(int i) {
            ensureBizAccountIsMutable();
            this.bizAccount_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAggregationTitle(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.aggregationTitle_ = str;
        }

        /* access modifiers changed from: private */
        public void setAggregationTitleBytes(C16994k kVar) {
            this.aggregationTitle_ = kVar.mo18752u();
            this.bitField0_ |= 8192;
        }

        /* access modifiers changed from: private */
        public void setAggregationUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.aggregationUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setAggregationUrlBytes(C16994k kVar) {
            this.aggregationUrl_ = kVar.mo18752u();
            this.bitField0_ |= 4096;
        }

        /* access modifiers changed from: private */
        public void setAppmsgSendTime(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
            this.appmsgSendTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setArticleCate(String str) {
            str.getClass();
            this.bitField0_ |= 134217728;
            this.articleCate_ = str;
        }

        /* access modifiers changed from: private */
        public void setArticleCateBytes(C16994k kVar) {
            this.articleCate_ = kVar.mo18752u();
            this.bitField0_ |= 134217728;
        }

        /* access modifiers changed from: private */
        public void setAuditStat(int i) {
            this.bitField0_ |= 67108864;
            this.auditStat_ = i;
        }

        /* access modifiers changed from: private */
        public void setBizAccount(int i, BizRecommendArticleBizAccount bizRecommendArticleBizAccount) {
            bizRecommendArticleBizAccount.getClass();
            ensureBizAccountIsMutable();
            this.bizAccount_.set(i, bizRecommendArticleBizAccount);
        }

        /* access modifiers changed from: private */
        public void setCanvasBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 4194304;
            this.canvasBuffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setCanvasBufferBytes(C16994k kVar) {
            this.canvasBuffer_ = kVar.mo18752u();
            this.bitField0_ |= 4194304;
        }

        /* access modifiers changed from: private */
        public void setCanvasLiveFeeds(RecommendLiveCanvasBuffer recommendLiveCanvasBuffer) {
            recommendLiveCanvasBuffer.getClass();
            this.canvasLiveFeeds_ = recommendLiveCanvasBuffer;
            this.bitField0_ |= 524288;
        }

        /* access modifiers changed from: private */
        public void setCardId(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.cardId_ = str;
        }

        /* access modifiers changed from: private */
        public void setCardIdBytes(C16994k kVar) {
            this.cardId_ = kVar.mo18752u();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setEvent(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.event_ = str;
        }

        /* access modifiers changed from: private */
        public void setEventBytes(C16994k kVar) {
            this.event_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setExpType(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.expType_ = str;
        }

        /* access modifiers changed from: private */
        public void setExpTypeBytes(C16994k kVar) {
            this.expType_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setExtraData(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.extraData_ = str;
        }

        /* access modifiers changed from: private */
        public void setExtraDataBytes(C16994k kVar) {
            this.extraData_ = kVar.mo18752u();
            this.bitField0_ |= 16384;
        }

        /* access modifiers changed from: private */
        public void setFailureBehavior(int i) {
            this.bitField0_ |= 1048576;
            this.failureBehavior_ = i;
        }

        /* access modifiers changed from: private */
        public void setNativeFinderFeeds(NativeFinderFeeds nativeFinderFeeds) {
            nativeFinderFeeds.getClass();
            this.nativeFinderFeeds_ = nativeFinderFeeds;
            this.bitField0_ |= 65536;
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackReason(int i, String str) {
            str.getClass();
            ensureNegativeFeedbackReasonIsMutable();
            this.negativeFeedbackReason_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackTitle(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.negativeFeedbackTitle_ = str;
        }

        /* access modifiers changed from: private */
        public void setNegativeFeedbackTitleBytes(C16994k kVar) {
            this.negativeFeedbackTitle_ = kVar.mo18752u();
            this.bitField0_ |= 2097152;
        }

        /* access modifiers changed from: private */
        public void setPackageVersion(int i) {
            this.bitField0_ |= 8388608;
            this.packageVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setPos(int i) {
            this.bitField0_ |= 2;
            this.pos_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecID(long j) {
            this.bitField0_ |= 8;
            this.recID_ = j;
        }

        /* access modifiers changed from: private */
        public void setRecSummary(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.recSummary_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecSummaryBytes(C16994k kVar) {
            this.recSummary_ = kVar.mo18752u();
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setRecUniqueFlag(int i) {
            this.bitField0_ |= 32768;
            this.recUniqueFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecycleAttr(BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr) {
            bizRecommendArticleRecycleAttr.getClass();
            this.recycleAttr_ = bizRecommendArticleRecycleAttr;
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        }

        /* access modifiers changed from: private */
        public void setRedDotFlag(int i) {
            this.bitField0_ |= 64;
            this.redDotFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setRetrieveType(int i) {
            this.bitField0_ |= 131072;
            this.retrieveType_ = i;
        }

        /* access modifiers changed from: private */
        public void setShowNegativeFeedbackReason(int i) {
            this.bitField0_ |= 2048;
            this.showNegativeFeedbackReason_ = i;
        }

        /* access modifiers changed from: private */
        public void setStyle(int i) {
            this.bitField0_ |= 16;
            this.style_ = i;
        }

        /* access modifiers changed from: private */
        public void setSubscribeFilterFlag(int i) {
            this.bitField0_ |= 536870912;
            this.subscribeFilterFlag_ = i;
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
        public void setToprightShowMode(int i) {
            this.bitField0_ |= 268435456;
            this.toprightShowMode_ = i;
        }

        /* access modifiers changed from: private */
        public void setUseServerTime(int i) {
            this.bitField0_ |= 1024;
            this.useServerTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setValidityPeriod(int i) {
            this.bitField0_ |= 262144;
            this.validityPeriod_ = i;
        }

        /* access modifiers changed from: private */
        public void setWeight(int i) {
            this.bitField0_ |= 4;
            this.weight_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001 \u0000\u0001\u0001) \u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဋ\u0001\u0004င\u0002\u0005ဃ\u0003\u0006ဋ\u0004\u0007ဈ\u0005\bဋ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fဋ\n\r\u001a\u000eဋ\u000b\u000fဈ\f\u0010ဈ\r\u0011ဈ\u000e\u0014ဋ\u000f\u001cဉ\u0010\u001dဋ\u0011\u001eဋ\u0012\u001fဉ\u0013 ဋ\u0014!ဈ\u0015\"ဈ\u0016#ဋ\u0017$ဉ\u0018%ဋ\u0019&ဋ\u001a'ဈ\u001b(ဋ\u001c)ဋ\u001d", new Object[]{"bitField0_", "title_", "bizAccount_", BizRecommendArticleBizAccount.class, "pos_", "weight_", "recID_", "style_", "event_", "redDotFlag_", "recSummary_", "cardId_", "expType_", "useServerTime_", "negativeFeedbackReason_", "showNegativeFeedbackReason_", "aggregationUrl_", "aggregationTitle_", "extraData_", "recUniqueFlag_", "nativeFinderFeeds_", "retrieveType_", "validityPeriod_", "canvasLiveFeeds_", "failureBehavior_", "negativeFeedbackTitle_", "canvasBuffer_", "packageVersion_", "recycleAttr_", "appmsgSendTime_", "auditStat_", "articleCate_", "toprightShowMode_", "subscribeFilterFlag_"});
                case 3:
                    return new BizRecommendArticle();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRecommendArticle> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRecommendArticle.class) {
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

        public String getAggregationTitle() {
            return this.aggregationTitle_;
        }

        public C16994k getAggregationTitleBytes() {
            return C16994k.m16791k(this.aggregationTitle_);
        }

        public String getAggregationUrl() {
            return this.aggregationUrl_;
        }

        public C16994k getAggregationUrlBytes() {
            return C16994k.m16791k(this.aggregationUrl_);
        }

        public int getAppmsgSendTime() {
            return this.appmsgSendTime_;
        }

        public String getArticleCate() {
            return this.articleCate_;
        }

        public C16994k getArticleCateBytes() {
            return C16994k.m16791k(this.articleCate_);
        }

        public int getAuditStat() {
            return this.auditStat_;
        }

        public BizRecommendArticleBizAccount getBizAccount(int i) {
            return this.bizAccount_.get(i);
        }

        public int getBizAccountCount() {
            return this.bizAccount_.size();
        }

        public List<BizRecommendArticleBizAccount> getBizAccountList() {
            return this.bizAccount_;
        }

        public BizRecommendArticleBizAccountOrBuilder getBizAccountOrBuilder(int i) {
            return this.bizAccount_.get(i);
        }

        public List<? extends BizRecommendArticleBizAccountOrBuilder> getBizAccountOrBuilderList() {
            return this.bizAccount_;
        }

        public String getCanvasBuffer() {
            return this.canvasBuffer_;
        }

        public C16994k getCanvasBufferBytes() {
            return C16994k.m16791k(this.canvasBuffer_);
        }

        public RecommendLiveCanvasBuffer getCanvasLiveFeeds() {
            RecommendLiveCanvasBuffer recommendLiveCanvasBuffer = this.canvasLiveFeeds_;
            return recommendLiveCanvasBuffer == null ? RecommendLiveCanvasBuffer.getDefaultInstance() : recommendLiveCanvasBuffer;
        }

        public String getCardId() {
            return this.cardId_;
        }

        public C16994k getCardIdBytes() {
            return C16994k.m16791k(this.cardId_);
        }

        public String getEvent() {
            return this.event_;
        }

        public C16994k getEventBytes() {
            return C16994k.m16791k(this.event_);
        }

        public String getExpType() {
            return this.expType_;
        }

        public C16994k getExpTypeBytes() {
            return C16994k.m16791k(this.expType_);
        }

        public String getExtraData() {
            return this.extraData_;
        }

        public C16994k getExtraDataBytes() {
            return C16994k.m16791k(this.extraData_);
        }

        public int getFailureBehavior() {
            return this.failureBehavior_;
        }

        public NativeFinderFeeds getNativeFinderFeeds() {
            NativeFinderFeeds nativeFinderFeeds = this.nativeFinderFeeds_;
            return nativeFinderFeeds == null ? NativeFinderFeeds.getDefaultInstance() : nativeFinderFeeds;
        }

        public String getNegativeFeedbackReason(int i) {
            return this.negativeFeedbackReason_.get(i);
        }

        public C16994k getNegativeFeedbackReasonBytes(int i) {
            return C16994k.m16791k(this.negativeFeedbackReason_.get(i));
        }

        public int getNegativeFeedbackReasonCount() {
            return this.negativeFeedbackReason_.size();
        }

        public List<String> getNegativeFeedbackReasonList() {
            return this.negativeFeedbackReason_;
        }

        public String getNegativeFeedbackTitle() {
            return this.negativeFeedbackTitle_;
        }

        public C16994k getNegativeFeedbackTitleBytes() {
            return C16994k.m16791k(this.negativeFeedbackTitle_);
        }

        public int getPackageVersion() {
            return this.packageVersion_;
        }

        public int getPos() {
            return this.pos_;
        }

        public long getRecID() {
            return this.recID_;
        }

        public String getRecSummary() {
            return this.recSummary_;
        }

        public C16994k getRecSummaryBytes() {
            return C16994k.m16791k(this.recSummary_);
        }

        public int getRecUniqueFlag() {
            return this.recUniqueFlag_;
        }

        public BizRecommendArticleRecycleAttr getRecycleAttr() {
            BizRecommendArticleRecycleAttr bizRecommendArticleRecycleAttr = this.recycleAttr_;
            return bizRecommendArticleRecycleAttr == null ? BizRecommendArticleRecycleAttr.getDefaultInstance() : bizRecommendArticleRecycleAttr;
        }

        public int getRedDotFlag() {
            return this.redDotFlag_;
        }

        public int getRetrieveType() {
            return this.retrieveType_;
        }

        public int getShowNegativeFeedbackReason() {
            return this.showNegativeFeedbackReason_;
        }

        public int getStyle() {
            return this.style_;
        }

        public int getSubscribeFilterFlag() {
            return this.subscribeFilterFlag_;
        }

        public String getTitle() {
            return this.title_;
        }

        public C16994k getTitleBytes() {
            return C16994k.m16791k(this.title_);
        }

        public int getToprightShowMode() {
            return this.toprightShowMode_;
        }

        public int getUseServerTime() {
            return this.useServerTime_;
        }

        public int getValidityPeriod() {
            return this.validityPeriod_;
        }

        public int getWeight() {
            return this.weight_;
        }

        public boolean hasAggregationTitle() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasAggregationUrl() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasAppmsgSendTime() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0;
        }

        public boolean hasArticleCate() {
            return (this.bitField0_ & 134217728) != 0;
        }

        public boolean hasAuditStat() {
            return (this.bitField0_ & 67108864) != 0;
        }

        public boolean hasCanvasBuffer() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasCanvasLiveFeeds() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasCardId() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasEvent() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasExpType() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasExtraData() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasFailureBehavior() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasNativeFinderFeeds() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasNegativeFeedbackTitle() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasPackageVersion() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasPos() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRecID() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRecSummary() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasRecUniqueFlag() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasRecycleAttr() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        }

        public boolean hasRedDotFlag() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasRetrieveType() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasShowNegativeFeedbackReason() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasStyle() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSubscribeFilterFlag() {
            return (this.bitField0_ & 536870912) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasToprightShowMode() {
            return (this.bitField0_ & 268435456) != 0;
        }

        public boolean hasUseServerTime() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasValidityPeriod() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasWeight() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(BizRecommendArticle bizRecommendArticle) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRecommendArticle);
        }

        public static BizRecommendArticle parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticle) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticle parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRecommendArticle parseFrom(C16994k kVar) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addBizAccount(int i, BizRecommendArticleBizAccount bizRecommendArticleBizAccount) {
            bizRecommendArticleBizAccount.getClass();
            ensureBizAccountIsMutable();
            this.bizAccount_.add(i, bizRecommendArticleBizAccount);
        }

        public static BizRecommendArticle parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRecommendArticle parseFrom(byte[] bArr) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRecommendArticle parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRecommendArticle parseFrom(InputStream inputStream) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecommendArticle parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecommendArticle parseFrom(C23856l lVar) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRecommendArticle parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRecommendArticle) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderRecommendData */
    public static final class FinderRecommendData extends C23861l0<FinderRecommendData, Builder> implements FinderRecommendDataOrBuilder {
        public static final int ALIGNMENT_FIELD_NUMBER = 30;
        public static final int BIZUIN_FIELD_NUMBER = 1;
        public static final int CARD_ORIGIN_ORDER_FIELD_NUMBER = 68;
        public static final int CARD_REC_TYPE_FIELD_NUMBER = 56;
        public static final int COVER_IMG_URL_FIELD_NUMBER = 14;
        /* access modifiers changed from: private */
        public static final FinderRecommendData DEFAULT_INSTANCE;
        public static final int EXP_TYPE_FIELD_NUMBER = 53;
        public static final int FINDER_COMMENT_COUNT_FIELD_NUMBER = 27;
        public static final int FINDER_COVER_HEIGHT_FIELD_NUMBER = 24;
        public static final int FINDER_COVER_WIDTH_FIELD_NUMBER = 25;
        public static final int FINDER_CREATE_TIME_FIELD_NUMBER = 28;
        public static final int FINDER_DURATION_FIELD_NUMBER = 20;
        public static final int FINDER_ENCRYPT_USER_NAME_FIELD_NUMBER = 12;
        public static final int FINDER_EXPORT_ID_FIELD_NUMBER = 16;
        public static final int FINDER_EXPORT_USERNAME_FIELD_NUMBER = 19;
        public static final int FINDER_HEIGHT_FIELD_NUMBER = 22;
        public static final int FINDER_LIKE_COUNT_FIELD_NUMBER = 26;
        public static final int FINDER_MEDIA_TYPE_FIELD_NUMBER = 18;
        public static final int FINDER_OBJECT_ID_FIELD_NUMBER = 15;
        public static final int FINDER_OBJECT_NONCE_ID_FIELD_NUMBER = 17;
        public static final int FINDER_SESSION_BUFFER_FIELD_NUMBER = 57;
        public static final int FINDER_UIN_FIELD_NUMBER = 11;
        public static final int FINDER_WIDTH_FIELD_NUMBER = 23;
        public static final int HAS_REDPACKET_COVER_FIELD_NUMBER = 59;
        public static final int HEADIMG_URL_FIELD_NUMBER = 2;
        public static final int IS_RECOMMEND_BACKEND_FIELD_NUMBER = 67;
        public static final int IS_RECOMMEND_FIELD_NUMBER = 8;
        public static final int MAPPMSGID_FIELD_NUMBER = 6;
        public static final int MBIZUIN_FIELD_NUMBER = 5;
        public static final int MIDX_FIELD_NUMBER = 7;
        public static final int MSG_REC_TYPE_FIELD_NUMBER = 55;
        public static final int NICK_NAME_FIELD_NUMBER = 3;
        private static volatile C24062w1<FinderRecommendData> PARSER = null;
        public static final int PRIMARY_COLOR_FIELD_NUMBER = 21;
        public static final int RECOMMEND_REASON_FIELD_NUMBER = 51;
        public static final int RECOMMEND_SEND_TIME_FIELD_NUMBER = 52;
        public static final int REC_INFO_FIELD_NUMBER = 58;
        public static final int REC_SUMMARY_FIELD_NUMBER = 60;
        public static final int REPORT_INFO_FIELD_NUMBER = 54;
        public static final int REQUEST_ID_FIELD_NUMBER = 66;
        public static final int SHOW_FINDER_FIELD_NUMBER = 29;
        public static final int TITLE_FIELD_NUMBER = 13;
        public static final int USERNAME_FIELD_NUMBER = 4;
        private int alignment_;
        private int bitField0_;
        private int bitField1_;
        private int bizuin_;
        private int cardOriginOrder_;
        private int cardRecType_;
        private String coverImgUrl_ = "";
        private String expType_ = "";
        private int finderCommentCount_;
        private int finderCoverHeight_;
        private int finderCoverWidth_;
        private int finderCreateTime_;
        private int finderDuration_;
        private String finderEncryptUserName_ = "";
        private String finderExportId_ = "";
        private String finderExportUsername_ = "";
        private int finderHeight_;
        private int finderLikeCount_;
        private int finderMediaType_;
        private String finderObjectId_ = "";
        private String finderObjectNonceId_ = "";
        private String finderSessionBuffer_ = "";
        private String finderUin_ = "";
        private int finderWidth_;
        private int hasRedpacketCover_;
        private String headimgUrl_ = "";
        private int isRecommendBackend_;
        private int isRecommend_;
        private int mappmsgid_;
        private int mbizuin_;
        private int midx_;
        private int msgRecType_;
        private String nickName_ = "";
        private String primaryColor_ = "";
        private String recInfo_ = "";
        private String recSummary_ = "";
        private String recommendReason_ = "";
        private int recommendSendTime_;
        private String reportInfo_ = "";
        private long requestId_;
        private int showFinder_;
        private String title_ = "";
        private String username_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderRecommendData$Builder */
        public static final class Builder extends C23861l0.C23862a<FinderRecommendData, Builder> implements FinderRecommendDataOrBuilder {
            public /* synthetic */ Builder(C243631 r1) {
                this();
            }

            public Builder clearAlignment() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearAlignment();
                return this;
            }

            public Builder clearBizuin() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearBizuin();
                return this;
            }

            public Builder clearCardOriginOrder() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearCardOriginOrder();
                return this;
            }

            public Builder clearCardRecType() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearCardRecType();
                return this;
            }

            public Builder clearCoverImgUrl() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearCoverImgUrl();
                return this;
            }

            public Builder clearExpType() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearExpType();
                return this;
            }

            public Builder clearFinderCommentCount() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderCommentCount();
                return this;
            }

            public Builder clearFinderCoverHeight() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderCoverHeight();
                return this;
            }

            public Builder clearFinderCoverWidth() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderCoverWidth();
                return this;
            }

            public Builder clearFinderCreateTime() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderCreateTime();
                return this;
            }

            public Builder clearFinderDuration() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderDuration();
                return this;
            }

            public Builder clearFinderEncryptUserName() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderEncryptUserName();
                return this;
            }

            public Builder clearFinderExportId() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderExportId();
                return this;
            }

            public Builder clearFinderExportUsername() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderExportUsername();
                return this;
            }

            public Builder clearFinderHeight() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderHeight();
                return this;
            }

            public Builder clearFinderLikeCount() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderLikeCount();
                return this;
            }

            public Builder clearFinderMediaType() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderMediaType();
                return this;
            }

            public Builder clearFinderObjectId() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderObjectId();
                return this;
            }

            public Builder clearFinderObjectNonceId() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderObjectNonceId();
                return this;
            }

            public Builder clearFinderSessionBuffer() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderSessionBuffer();
                return this;
            }

            public Builder clearFinderUin() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderUin();
                return this;
            }

            public Builder clearFinderWidth() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearFinderWidth();
                return this;
            }

            public Builder clearHasRedpacketCover() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearHasRedpacketCover();
                return this;
            }

            public Builder clearHeadimgUrl() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearHeadimgUrl();
                return this;
            }

            public Builder clearIsRecommend() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearIsRecommend();
                return this;
            }

            public Builder clearIsRecommendBackend() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearIsRecommendBackend();
                return this;
            }

            public Builder clearMappmsgid() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearMappmsgid();
                return this;
            }

            public Builder clearMbizuin() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearMbizuin();
                return this;
            }

            public Builder clearMidx() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearMidx();
                return this;
            }

            public Builder clearMsgRecType() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearMsgRecType();
                return this;
            }

            public Builder clearNickName() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearNickName();
                return this;
            }

            public Builder clearPrimaryColor() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearPrimaryColor();
                return this;
            }

            public Builder clearRecInfo() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearRecInfo();
                return this;
            }

            public Builder clearRecSummary() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearRecSummary();
                return this;
            }

            public Builder clearRecommendReason() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearRecommendReason();
                return this;
            }

            public Builder clearRecommendSendTime() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearRecommendSendTime();
                return this;
            }

            public Builder clearReportInfo() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearReportInfo();
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearRequestId();
                return this;
            }

            public Builder clearShowFinder() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearShowFinder();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearTitle();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((FinderRecommendData) this.instance).clearUsername();
                return this;
            }

            public int getAlignment() {
                return ((FinderRecommendData) this.instance).getAlignment();
            }

            public int getBizuin() {
                return ((FinderRecommendData) this.instance).getBizuin();
            }

            public int getCardOriginOrder() {
                return ((FinderRecommendData) this.instance).getCardOriginOrder();
            }

            public int getCardRecType() {
                return ((FinderRecommendData) this.instance).getCardRecType();
            }

            public String getCoverImgUrl() {
                return ((FinderRecommendData) this.instance).getCoverImgUrl();
            }

            public C16994k getCoverImgUrlBytes() {
                return ((FinderRecommendData) this.instance).getCoverImgUrlBytes();
            }

            public String getExpType() {
                return ((FinderRecommendData) this.instance).getExpType();
            }

            public C16994k getExpTypeBytes() {
                return ((FinderRecommendData) this.instance).getExpTypeBytes();
            }

            public int getFinderCommentCount() {
                return ((FinderRecommendData) this.instance).getFinderCommentCount();
            }

            public int getFinderCoverHeight() {
                return ((FinderRecommendData) this.instance).getFinderCoverHeight();
            }

            public int getFinderCoverWidth() {
                return ((FinderRecommendData) this.instance).getFinderCoverWidth();
            }

            public int getFinderCreateTime() {
                return ((FinderRecommendData) this.instance).getFinderCreateTime();
            }

            public int getFinderDuration() {
                return ((FinderRecommendData) this.instance).getFinderDuration();
            }

            public String getFinderEncryptUserName() {
                return ((FinderRecommendData) this.instance).getFinderEncryptUserName();
            }

            public C16994k getFinderEncryptUserNameBytes() {
                return ((FinderRecommendData) this.instance).getFinderEncryptUserNameBytes();
            }

            public String getFinderExportId() {
                return ((FinderRecommendData) this.instance).getFinderExportId();
            }

            public C16994k getFinderExportIdBytes() {
                return ((FinderRecommendData) this.instance).getFinderExportIdBytes();
            }

            public String getFinderExportUsername() {
                return ((FinderRecommendData) this.instance).getFinderExportUsername();
            }

            public C16994k getFinderExportUsernameBytes() {
                return ((FinderRecommendData) this.instance).getFinderExportUsernameBytes();
            }

            public int getFinderHeight() {
                return ((FinderRecommendData) this.instance).getFinderHeight();
            }

            public int getFinderLikeCount() {
                return ((FinderRecommendData) this.instance).getFinderLikeCount();
            }

            public int getFinderMediaType() {
                return ((FinderRecommendData) this.instance).getFinderMediaType();
            }

            public String getFinderObjectId() {
                return ((FinderRecommendData) this.instance).getFinderObjectId();
            }

            public C16994k getFinderObjectIdBytes() {
                return ((FinderRecommendData) this.instance).getFinderObjectIdBytes();
            }

            public String getFinderObjectNonceId() {
                return ((FinderRecommendData) this.instance).getFinderObjectNonceId();
            }

            public C16994k getFinderObjectNonceIdBytes() {
                return ((FinderRecommendData) this.instance).getFinderObjectNonceIdBytes();
            }

            public String getFinderSessionBuffer() {
                return ((FinderRecommendData) this.instance).getFinderSessionBuffer();
            }

            public C16994k getFinderSessionBufferBytes() {
                return ((FinderRecommendData) this.instance).getFinderSessionBufferBytes();
            }

            public String getFinderUin() {
                return ((FinderRecommendData) this.instance).getFinderUin();
            }

            public C16994k getFinderUinBytes() {
                return ((FinderRecommendData) this.instance).getFinderUinBytes();
            }

            public int getFinderWidth() {
                return ((FinderRecommendData) this.instance).getFinderWidth();
            }

            public int getHasRedpacketCover() {
                return ((FinderRecommendData) this.instance).getHasRedpacketCover();
            }

            public String getHeadimgUrl() {
                return ((FinderRecommendData) this.instance).getHeadimgUrl();
            }

            public C16994k getHeadimgUrlBytes() {
                return ((FinderRecommendData) this.instance).getHeadimgUrlBytes();
            }

            public int getIsRecommend() {
                return ((FinderRecommendData) this.instance).getIsRecommend();
            }

            public int getIsRecommendBackend() {
                return ((FinderRecommendData) this.instance).getIsRecommendBackend();
            }

            public int getMappmsgid() {
                return ((FinderRecommendData) this.instance).getMappmsgid();
            }

            public int getMbizuin() {
                return ((FinderRecommendData) this.instance).getMbizuin();
            }

            public int getMidx() {
                return ((FinderRecommendData) this.instance).getMidx();
            }

            public int getMsgRecType() {
                return ((FinderRecommendData) this.instance).getMsgRecType();
            }

            public String getNickName() {
                return ((FinderRecommendData) this.instance).getNickName();
            }

            public C16994k getNickNameBytes() {
                return ((FinderRecommendData) this.instance).getNickNameBytes();
            }

            public String getPrimaryColor() {
                return ((FinderRecommendData) this.instance).getPrimaryColor();
            }

            public C16994k getPrimaryColorBytes() {
                return ((FinderRecommendData) this.instance).getPrimaryColorBytes();
            }

            public String getRecInfo() {
                return ((FinderRecommendData) this.instance).getRecInfo();
            }

            public C16994k getRecInfoBytes() {
                return ((FinderRecommendData) this.instance).getRecInfoBytes();
            }

            public String getRecSummary() {
                return ((FinderRecommendData) this.instance).getRecSummary();
            }

            public C16994k getRecSummaryBytes() {
                return ((FinderRecommendData) this.instance).getRecSummaryBytes();
            }

            public String getRecommendReason() {
                return ((FinderRecommendData) this.instance).getRecommendReason();
            }

            public C16994k getRecommendReasonBytes() {
                return ((FinderRecommendData) this.instance).getRecommendReasonBytes();
            }

            public int getRecommendSendTime() {
                return ((FinderRecommendData) this.instance).getRecommendSendTime();
            }

            public String getReportInfo() {
                return ((FinderRecommendData) this.instance).getReportInfo();
            }

            public C16994k getReportInfoBytes() {
                return ((FinderRecommendData) this.instance).getReportInfoBytes();
            }

            public long getRequestId() {
                return ((FinderRecommendData) this.instance).getRequestId();
            }

            public int getShowFinder() {
                return ((FinderRecommendData) this.instance).getShowFinder();
            }

            public String getTitle() {
                return ((FinderRecommendData) this.instance).getTitle();
            }

            public C16994k getTitleBytes() {
                return ((FinderRecommendData) this.instance).getTitleBytes();
            }

            public String getUsername() {
                return ((FinderRecommendData) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((FinderRecommendData) this.instance).getUsernameBytes();
            }

            public boolean hasAlignment() {
                return ((FinderRecommendData) this.instance).hasAlignment();
            }

            public boolean hasBizuin() {
                return ((FinderRecommendData) this.instance).hasBizuin();
            }

            public boolean hasCardOriginOrder() {
                return ((FinderRecommendData) this.instance).hasCardOriginOrder();
            }

            public boolean hasCardRecType() {
                return ((FinderRecommendData) this.instance).hasCardRecType();
            }

            public boolean hasCoverImgUrl() {
                return ((FinderRecommendData) this.instance).hasCoverImgUrl();
            }

            public boolean hasExpType() {
                return ((FinderRecommendData) this.instance).hasExpType();
            }

            public boolean hasFinderCommentCount() {
                return ((FinderRecommendData) this.instance).hasFinderCommentCount();
            }

            public boolean hasFinderCoverHeight() {
                return ((FinderRecommendData) this.instance).hasFinderCoverHeight();
            }

            public boolean hasFinderCoverWidth() {
                return ((FinderRecommendData) this.instance).hasFinderCoverWidth();
            }

            public boolean hasFinderCreateTime() {
                return ((FinderRecommendData) this.instance).hasFinderCreateTime();
            }

            public boolean hasFinderDuration() {
                return ((FinderRecommendData) this.instance).hasFinderDuration();
            }

            public boolean hasFinderEncryptUserName() {
                return ((FinderRecommendData) this.instance).hasFinderEncryptUserName();
            }

            public boolean hasFinderExportId() {
                return ((FinderRecommendData) this.instance).hasFinderExportId();
            }

            public boolean hasFinderExportUsername() {
                return ((FinderRecommendData) this.instance).hasFinderExportUsername();
            }

            public boolean hasFinderHeight() {
                return ((FinderRecommendData) this.instance).hasFinderHeight();
            }

            public boolean hasFinderLikeCount() {
                return ((FinderRecommendData) this.instance).hasFinderLikeCount();
            }

            public boolean hasFinderMediaType() {
                return ((FinderRecommendData) this.instance).hasFinderMediaType();
            }

            public boolean hasFinderObjectId() {
                return ((FinderRecommendData) this.instance).hasFinderObjectId();
            }

            public boolean hasFinderObjectNonceId() {
                return ((FinderRecommendData) this.instance).hasFinderObjectNonceId();
            }

            public boolean hasFinderSessionBuffer() {
                return ((FinderRecommendData) this.instance).hasFinderSessionBuffer();
            }

            public boolean hasFinderUin() {
                return ((FinderRecommendData) this.instance).hasFinderUin();
            }

            public boolean hasFinderWidth() {
                return ((FinderRecommendData) this.instance).hasFinderWidth();
            }

            public boolean hasHasRedpacketCover() {
                return ((FinderRecommendData) this.instance).hasHasRedpacketCover();
            }

            public boolean hasHeadimgUrl() {
                return ((FinderRecommendData) this.instance).hasHeadimgUrl();
            }

            public boolean hasIsRecommend() {
                return ((FinderRecommendData) this.instance).hasIsRecommend();
            }

            public boolean hasIsRecommendBackend() {
                return ((FinderRecommendData) this.instance).hasIsRecommendBackend();
            }

            public boolean hasMappmsgid() {
                return ((FinderRecommendData) this.instance).hasMappmsgid();
            }

            public boolean hasMbizuin() {
                return ((FinderRecommendData) this.instance).hasMbizuin();
            }

            public boolean hasMidx() {
                return ((FinderRecommendData) this.instance).hasMidx();
            }

            public boolean hasMsgRecType() {
                return ((FinderRecommendData) this.instance).hasMsgRecType();
            }

            public boolean hasNickName() {
                return ((FinderRecommendData) this.instance).hasNickName();
            }

            public boolean hasPrimaryColor() {
                return ((FinderRecommendData) this.instance).hasPrimaryColor();
            }

            public boolean hasRecInfo() {
                return ((FinderRecommendData) this.instance).hasRecInfo();
            }

            public boolean hasRecSummary() {
                return ((FinderRecommendData) this.instance).hasRecSummary();
            }

            public boolean hasRecommendReason() {
                return ((FinderRecommendData) this.instance).hasRecommendReason();
            }

            public boolean hasRecommendSendTime() {
                return ((FinderRecommendData) this.instance).hasRecommendSendTime();
            }

            public boolean hasReportInfo() {
                return ((FinderRecommendData) this.instance).hasReportInfo();
            }

            public boolean hasRequestId() {
                return ((FinderRecommendData) this.instance).hasRequestId();
            }

            public boolean hasShowFinder() {
                return ((FinderRecommendData) this.instance).hasShowFinder();
            }

            public boolean hasTitle() {
                return ((FinderRecommendData) this.instance).hasTitle();
            }

            public boolean hasUsername() {
                return ((FinderRecommendData) this.instance).hasUsername();
            }

            public Builder setAlignment(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setAlignment(i);
                return this;
            }

            public Builder setBizuin(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setBizuin(i);
                return this;
            }

            public Builder setCardOriginOrder(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setCardOriginOrder(i);
                return this;
            }

            public Builder setCardRecType(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setCardRecType(i);
                return this;
            }

            public Builder setCoverImgUrl(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setCoverImgUrl(str);
                return this;
            }

            public Builder setCoverImgUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setCoverImgUrlBytes(kVar);
                return this;
            }

            public Builder setExpType(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setExpType(str);
                return this;
            }

            public Builder setExpTypeBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setExpTypeBytes(kVar);
                return this;
            }

            public Builder setFinderCommentCount(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderCommentCount(i);
                return this;
            }

            public Builder setFinderCoverHeight(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderCoverHeight(i);
                return this;
            }

            public Builder setFinderCoverWidth(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderCoverWidth(i);
                return this;
            }

            public Builder setFinderCreateTime(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderCreateTime(i);
                return this;
            }

            public Builder setFinderDuration(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderDuration(i);
                return this;
            }

            public Builder setFinderEncryptUserName(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderEncryptUserName(str);
                return this;
            }

            public Builder setFinderEncryptUserNameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderEncryptUserNameBytes(kVar);
                return this;
            }

            public Builder setFinderExportId(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderExportId(str);
                return this;
            }

            public Builder setFinderExportIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderExportIdBytes(kVar);
                return this;
            }

            public Builder setFinderExportUsername(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderExportUsername(str);
                return this;
            }

            public Builder setFinderExportUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderExportUsernameBytes(kVar);
                return this;
            }

            public Builder setFinderHeight(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderHeight(i);
                return this;
            }

            public Builder setFinderLikeCount(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderLikeCount(i);
                return this;
            }

            public Builder setFinderMediaType(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderMediaType(i);
                return this;
            }

            public Builder setFinderObjectId(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderObjectId(str);
                return this;
            }

            public Builder setFinderObjectIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderObjectIdBytes(kVar);
                return this;
            }

            public Builder setFinderObjectNonceId(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderObjectNonceId(str);
                return this;
            }

            public Builder setFinderObjectNonceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderObjectNonceIdBytes(kVar);
                return this;
            }

            public Builder setFinderSessionBuffer(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderSessionBuffer(str);
                return this;
            }

            public Builder setFinderSessionBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderSessionBufferBytes(kVar);
                return this;
            }

            public Builder setFinderUin(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderUin(str);
                return this;
            }

            public Builder setFinderUinBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderUinBytes(kVar);
                return this;
            }

            public Builder setFinderWidth(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setFinderWidth(i);
                return this;
            }

            public Builder setHasRedpacketCover(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setHasRedpacketCover(i);
                return this;
            }

            public Builder setHeadimgUrl(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setHeadimgUrl(str);
                return this;
            }

            public Builder setHeadimgUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setHeadimgUrlBytes(kVar);
                return this;
            }

            public Builder setIsRecommend(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setIsRecommend(i);
                return this;
            }

            public Builder setIsRecommendBackend(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setIsRecommendBackend(i);
                return this;
            }

            public Builder setMappmsgid(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setMappmsgid(i);
                return this;
            }

            public Builder setMbizuin(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setMbizuin(i);
                return this;
            }

            public Builder setMidx(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setMidx(i);
                return this;
            }

            public Builder setMsgRecType(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setMsgRecType(i);
                return this;
            }

            public Builder setNickName(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setNickName(str);
                return this;
            }

            public Builder setNickNameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setNickNameBytes(kVar);
                return this;
            }

            public Builder setPrimaryColor(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setPrimaryColor(str);
                return this;
            }

            public Builder setPrimaryColorBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setPrimaryColorBytes(kVar);
                return this;
            }

            public Builder setRecInfo(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setRecInfo(str);
                return this;
            }

            public Builder setRecInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setRecInfoBytes(kVar);
                return this;
            }

            public Builder setRecSummary(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setRecSummary(str);
                return this;
            }

            public Builder setRecSummaryBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setRecSummaryBytes(kVar);
                return this;
            }

            public Builder setRecommendReason(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setRecommendReason(str);
                return this;
            }

            public Builder setRecommendReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setRecommendReasonBytes(kVar);
                return this;
            }

            public Builder setRecommendSendTime(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setRecommendSendTime(i);
                return this;
            }

            public Builder setReportInfo(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setReportInfo(str);
                return this;
            }

            public Builder setReportInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setReportInfoBytes(kVar);
                return this;
            }

            public Builder setRequestId(long j) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setRequestId(j);
                return this;
            }

            public Builder setShowFinder(int i) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setShowFinder(i);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setTitleBytes(kVar);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderRecommendData) this.instance).setUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderRecommendData.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderRecommendData finderRecommendData = new FinderRecommendData();
            DEFAULT_INSTANCE = finderRecommendData;
            C23861l0.registerDefaultInstance(FinderRecommendData.class, finderRecommendData);
        }

        private FinderRecommendData() {
        }

        /* access modifiers changed from: private */
        public void clearAlignment() {
            this.bitField0_ &= -134217729;
            this.alignment_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBizuin() {
            this.bitField0_ &= -2;
            this.bizuin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCardOriginOrder() {
            this.bitField1_ &= -257;
            this.cardOriginOrder_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCardRecType() {
            this.bitField1_ &= -3;
            this.cardRecType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCoverImgUrl() {
            this.bitField0_ &= -2049;
            this.coverImgUrl_ = getDefaultInstance().getCoverImgUrl();
        }

        /* access modifiers changed from: private */
        public void clearExpType() {
            this.bitField0_ &= -1073741825;
            this.expType_ = getDefaultInstance().getExpType();
        }

        /* access modifiers changed from: private */
        public void clearFinderCommentCount() {
            this.bitField0_ &= -16777217;
            this.finderCommentCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderCoverHeight() {
            this.bitField0_ &= -2097153;
            this.finderCoverHeight_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderCoverWidth() {
            this.bitField0_ &= -4194305;
            this.finderCoverWidth_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderCreateTime() {
            this.bitField0_ &= -33554433;
            this.finderCreateTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderDuration() {
            this.bitField0_ &= -131073;
            this.finderDuration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderEncryptUserName() {
            this.bitField0_ &= -513;
            this.finderEncryptUserName_ = getDefaultInstance().getFinderEncryptUserName();
        }

        /* access modifiers changed from: private */
        public void clearFinderExportId() {
            this.bitField0_ &= -8193;
            this.finderExportId_ = getDefaultInstance().getFinderExportId();
        }

        /* access modifiers changed from: private */
        public void clearFinderExportUsername() {
            this.bitField0_ &= -65537;
            this.finderExportUsername_ = getDefaultInstance().getFinderExportUsername();
        }

        /* access modifiers changed from: private */
        public void clearFinderHeight() {
            this.bitField0_ &= -524289;
            this.finderHeight_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderLikeCount() {
            this.bitField0_ &= -8388609;
            this.finderLikeCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderMediaType() {
            this.bitField0_ &= -32769;
            this.finderMediaType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderObjectId() {
            this.bitField0_ &= -4097;
            this.finderObjectId_ = getDefaultInstance().getFinderObjectId();
        }

        /* access modifiers changed from: private */
        public void clearFinderObjectNonceId() {
            this.bitField0_ &= -16385;
            this.finderObjectNonceId_ = getDefaultInstance().getFinderObjectNonceId();
        }

        /* access modifiers changed from: private */
        public void clearFinderSessionBuffer() {
            this.bitField1_ &= -5;
            this.finderSessionBuffer_ = getDefaultInstance().getFinderSessionBuffer();
        }

        /* access modifiers changed from: private */
        public void clearFinderUin() {
            this.bitField0_ &= -257;
            this.finderUin_ = getDefaultInstance().getFinderUin();
        }

        /* access modifiers changed from: private */
        public void clearFinderWidth() {
            this.bitField0_ &= -1048577;
            this.finderWidth_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHasRedpacketCover() {
            this.bitField1_ &= -17;
            this.hasRedpacketCover_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHeadimgUrl() {
            this.bitField0_ &= -3;
            this.headimgUrl_ = getDefaultInstance().getHeadimgUrl();
        }

        /* access modifiers changed from: private */
        public void clearIsRecommend() {
            this.bitField0_ &= -129;
            this.isRecommend_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearIsRecommendBackend() {
            this.bitField1_ &= -129;
            this.isRecommendBackend_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMappmsgid() {
            this.bitField0_ &= -33;
            this.mappmsgid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMbizuin() {
            this.bitField0_ &= -17;
            this.mbizuin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMidx() {
            this.bitField0_ &= -65;
            this.midx_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgRecType() {
            this.bitField1_ &= -2;
            this.msgRecType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNickName() {
            this.bitField0_ &= -5;
            this.nickName_ = getDefaultInstance().getNickName();
        }

        /* access modifiers changed from: private */
        public void clearPrimaryColor() {
            this.bitField0_ &= -262145;
            this.primaryColor_ = getDefaultInstance().getPrimaryColor();
        }

        /* access modifiers changed from: private */
        public void clearRecInfo() {
            this.bitField1_ &= -9;
            this.recInfo_ = getDefaultInstance().getRecInfo();
        }

        /* access modifiers changed from: private */
        public void clearRecSummary() {
            this.bitField1_ &= -33;
            this.recSummary_ = getDefaultInstance().getRecSummary();
        }

        /* access modifiers changed from: private */
        public void clearRecommendReason() {
            this.bitField0_ &= -268435457;
            this.recommendReason_ = getDefaultInstance().getRecommendReason();
        }

        /* access modifiers changed from: private */
        public void clearRecommendSendTime() {
            this.bitField0_ &= -536870913;
            this.recommendSendTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReportInfo() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.reportInfo_ = getDefaultInstance().getReportInfo();
        }

        /* access modifiers changed from: private */
        public void clearRequestId() {
            this.bitField1_ &= -65;
            this.requestId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearShowFinder() {
            this.bitField0_ &= -67108865;
            this.showFinder_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -1025;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -9;
            this.username_ = getDefaultInstance().getUsername();
        }

        public static FinderRecommendData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderRecommendData parseDelimitedFrom(InputStream inputStream) {
            return (FinderRecommendData) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderRecommendData parseFrom(ByteBuffer byteBuffer) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderRecommendData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAlignment(int i) {
            this.bitField0_ |= 134217728;
            this.alignment_ = i;
        }

        /* access modifiers changed from: private */
        public void setBizuin(int i) {
            this.bitField0_ |= 1;
            this.bizuin_ = i;
        }

        /* access modifiers changed from: private */
        public void setCardOriginOrder(int i) {
            this.bitField1_ |= 256;
            this.cardOriginOrder_ = i;
        }

        /* access modifiers changed from: private */
        public void setCardRecType(int i) {
            this.bitField1_ |= 2;
            this.cardRecType_ = i;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrl(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.coverImgUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrlBytes(C16994k kVar) {
            this.coverImgUrl_ = kVar.mo18752u();
            this.bitField0_ |= 2048;
        }

        /* access modifiers changed from: private */
        public void setExpType(String str) {
            str.getClass();
            this.bitField0_ |= 1073741824;
            this.expType_ = str;
        }

        /* access modifiers changed from: private */
        public void setExpTypeBytes(C16994k kVar) {
            this.expType_ = kVar.mo18752u();
            this.bitField0_ |= 1073741824;
        }

        /* access modifiers changed from: private */
        public void setFinderCommentCount(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            this.finderCommentCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderCoverHeight(int i) {
            this.bitField0_ |= 2097152;
            this.finderCoverHeight_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderCoverWidth(int i) {
            this.bitField0_ |= 4194304;
            this.finderCoverWidth_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderCreateTime(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
            this.finderCreateTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderDuration(int i) {
            this.bitField0_ |= 131072;
            this.finderDuration_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderEncryptUserName(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.finderEncryptUserName_ = str;
        }

        /* access modifiers changed from: private */
        public void setFinderEncryptUserNameBytes(C16994k kVar) {
            this.finderEncryptUserName_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setFinderExportId(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.finderExportId_ = str;
        }

        /* access modifiers changed from: private */
        public void setFinderExportIdBytes(C16994k kVar) {
            this.finderExportId_ = kVar.mo18752u();
            this.bitField0_ |= 8192;
        }

        /* access modifiers changed from: private */
        public void setFinderExportUsername(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.finderExportUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setFinderExportUsernameBytes(C16994k kVar) {
            this.finderExportUsername_ = kVar.mo18752u();
            this.bitField0_ |= 65536;
        }

        /* access modifiers changed from: private */
        public void setFinderHeight(int i) {
            this.bitField0_ |= 524288;
            this.finderHeight_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderLikeCount(int i) {
            this.bitField0_ |= 8388608;
            this.finderLikeCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderMediaType(int i) {
            this.bitField0_ |= 32768;
            this.finderMediaType_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderObjectId(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.finderObjectId_ = str;
        }

        /* access modifiers changed from: private */
        public void setFinderObjectIdBytes(C16994k kVar) {
            this.finderObjectId_ = kVar.mo18752u();
            this.bitField0_ |= 4096;
        }

        /* access modifiers changed from: private */
        public void setFinderObjectNonceId(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.finderObjectNonceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setFinderObjectNonceIdBytes(C16994k kVar) {
            this.finderObjectNonceId_ = kVar.mo18752u();
            this.bitField0_ |= 16384;
        }

        /* access modifiers changed from: private */
        public void setFinderSessionBuffer(String str) {
            str.getClass();
            this.bitField1_ |= 4;
            this.finderSessionBuffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setFinderSessionBufferBytes(C16994k kVar) {
            this.finderSessionBuffer_ = kVar.mo18752u();
            this.bitField1_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setFinderUin(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.finderUin_ = str;
        }

        /* access modifiers changed from: private */
        public void setFinderUinBytes(C16994k kVar) {
            this.finderUin_ = kVar.mo18752u();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setFinderWidth(int i) {
            this.bitField0_ |= 1048576;
            this.finderWidth_ = i;
        }

        /* access modifiers changed from: private */
        public void setHasRedpacketCover(int i) {
            this.bitField1_ |= 16;
            this.hasRedpacketCover_ = i;
        }

        /* access modifiers changed from: private */
        public void setHeadimgUrl(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.headimgUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setHeadimgUrlBytes(C16994k kVar) {
            this.headimgUrl_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setIsRecommend(int i) {
            this.bitField0_ |= 128;
            this.isRecommend_ = i;
        }

        /* access modifiers changed from: private */
        public void setIsRecommendBackend(int i) {
            this.bitField1_ |= 128;
            this.isRecommendBackend_ = i;
        }

        /* access modifiers changed from: private */
        public void setMappmsgid(int i) {
            this.bitField0_ |= 32;
            this.mappmsgid_ = i;
        }

        /* access modifiers changed from: private */
        public void setMbizuin(int i) {
            this.bitField0_ |= 16;
            this.mbizuin_ = i;
        }

        /* access modifiers changed from: private */
        public void setMidx(int i) {
            this.bitField0_ |= 64;
            this.midx_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgRecType(int i) {
            this.bitField1_ |= 1;
            this.msgRecType_ = i;
        }

        /* access modifiers changed from: private */
        public void setNickName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.nickName_ = str;
        }

        /* access modifiers changed from: private */
        public void setNickNameBytes(C16994k kVar) {
            this.nickName_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setPrimaryColor(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.primaryColor_ = str;
        }

        /* access modifiers changed from: private */
        public void setPrimaryColorBytes(C16994k kVar) {
            this.primaryColor_ = kVar.mo18752u();
            this.bitField0_ |= 262144;
        }

        /* access modifiers changed from: private */
        public void setRecInfo(String str) {
            str.getClass();
            this.bitField1_ |= 8;
            this.recInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecInfoBytes(C16994k kVar) {
            this.recInfo_ = kVar.mo18752u();
            this.bitField1_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setRecSummary(String str) {
            str.getClass();
            this.bitField1_ |= 32;
            this.recSummary_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecSummaryBytes(C16994k kVar) {
            this.recSummary_ = kVar.mo18752u();
            this.bitField1_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setRecommendReason(String str) {
            str.getClass();
            this.bitField0_ |= 268435456;
            this.recommendReason_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecommendReasonBytes(C16994k kVar) {
            this.recommendReason_ = kVar.mo18752u();
            this.bitField0_ |= 268435456;
        }

        /* access modifiers changed from: private */
        public void setRecommendSendTime(int i) {
            this.bitField0_ |= 536870912;
            this.recommendSendTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setReportInfo(String str) {
            str.getClass();
            this.bitField0_ |= Integer.MIN_VALUE;
            this.reportInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setReportInfoBytes(C16994k kVar) {
            this.reportInfo_ = kVar.mo18752u();
            this.bitField0_ |= Integer.MIN_VALUE;
        }

        /* access modifiers changed from: private */
        public void setRequestId(long j) {
            this.bitField1_ |= 64;
            this.requestId_ = j;
        }

        /* access modifiers changed from: private */
        public void setShowFinder(int i) {
            this.bitField0_ |= 67108864;
            this.showFinder_ = i;
        }

        /* access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.title_ = str;
        }

        /* access modifiers changed from: private */
        public void setTitleBytes(C16994k kVar) {
            this.title_ = kVar.mo18752u();
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.username_ = str;
        }

        /* access modifiers changed from: private */
        public void setUsernameBytes(C16994k kVar) {
            this.username_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001)\u0000\u0002\u0001D)\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\u000bဈ\b\fဈ\t\rဈ\n\u000eဈ\u000b\u000fဈ\f\u0010ဈ\r\u0011ဈ\u000e\u0012ဋ\u000f\u0013ဈ\u0010\u0014ဋ\u0011\u0015ဈ\u0012\u0016ဋ\u0013\u0017ဋ\u0014\u0018ဋ\u0015\u0019ဋ\u0016\u001aဋ\u0017\u001bဋ\u0018\u001cဋ\u0019\u001dဋ\u001a\u001eဋ\u001b3ဈ\u001c4ဋ\u001d5ဈ\u001e6ဈ\u001f7ဋ 8ဋ!9ဈ\":ဈ#;ဋ$<ဈ%Bဃ&Cဋ'Dဋ(", new Object[]{"bitField0_", "bitField1_", "bizuin_", "headimgUrl_", "nickName_", "username_", "mbizuin_", "mappmsgid_", "midx_", "isRecommend_", "finderUin_", "finderEncryptUserName_", "title_", "coverImgUrl_", "finderObjectId_", "finderExportId_", "finderObjectNonceId_", "finderMediaType_", "finderExportUsername_", "finderDuration_", "primaryColor_", "finderHeight_", "finderWidth_", "finderCoverHeight_", "finderCoverWidth_", "finderLikeCount_", "finderCommentCount_", "finderCreateTime_", "showFinder_", "alignment_", "recommendReason_", "recommendSendTime_", "expType_", "reportInfo_", "msgRecType_", "cardRecType_", "finderSessionBuffer_", "recInfo_", "hasRedpacketCover_", "recSummary_", "requestId_", "isRecommendBackend_", "cardOriginOrder_"});
                case 3:
                    return new FinderRecommendData();
                case 4:
                    return new Builder((C243631) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderRecommendData> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderRecommendData.class) {
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

        public int getAlignment() {
            return this.alignment_;
        }

        public int getBizuin() {
            return this.bizuin_;
        }

        public int getCardOriginOrder() {
            return this.cardOriginOrder_;
        }

        public int getCardRecType() {
            return this.cardRecType_;
        }

        public String getCoverImgUrl() {
            return this.coverImgUrl_;
        }

        public C16994k getCoverImgUrlBytes() {
            return C16994k.m16791k(this.coverImgUrl_);
        }

        public String getExpType() {
            return this.expType_;
        }

        public C16994k getExpTypeBytes() {
            return C16994k.m16791k(this.expType_);
        }

        public int getFinderCommentCount() {
            return this.finderCommentCount_;
        }

        public int getFinderCoverHeight() {
            return this.finderCoverHeight_;
        }

        public int getFinderCoverWidth() {
            return this.finderCoverWidth_;
        }

        public int getFinderCreateTime() {
            return this.finderCreateTime_;
        }

        public int getFinderDuration() {
            return this.finderDuration_;
        }

        public String getFinderEncryptUserName() {
            return this.finderEncryptUserName_;
        }

        public C16994k getFinderEncryptUserNameBytes() {
            return C16994k.m16791k(this.finderEncryptUserName_);
        }

        public String getFinderExportId() {
            return this.finderExportId_;
        }

        public C16994k getFinderExportIdBytes() {
            return C16994k.m16791k(this.finderExportId_);
        }

        public String getFinderExportUsername() {
            return this.finderExportUsername_;
        }

        public C16994k getFinderExportUsernameBytes() {
            return C16994k.m16791k(this.finderExportUsername_);
        }

        public int getFinderHeight() {
            return this.finderHeight_;
        }

        public int getFinderLikeCount() {
            return this.finderLikeCount_;
        }

        public int getFinderMediaType() {
            return this.finderMediaType_;
        }

        public String getFinderObjectId() {
            return this.finderObjectId_;
        }

        public C16994k getFinderObjectIdBytes() {
            return C16994k.m16791k(this.finderObjectId_);
        }

        public String getFinderObjectNonceId() {
            return this.finderObjectNonceId_;
        }

        public C16994k getFinderObjectNonceIdBytes() {
            return C16994k.m16791k(this.finderObjectNonceId_);
        }

        public String getFinderSessionBuffer() {
            return this.finderSessionBuffer_;
        }

        public C16994k getFinderSessionBufferBytes() {
            return C16994k.m16791k(this.finderSessionBuffer_);
        }

        public String getFinderUin() {
            return this.finderUin_;
        }

        public C16994k getFinderUinBytes() {
            return C16994k.m16791k(this.finderUin_);
        }

        public int getFinderWidth() {
            return this.finderWidth_;
        }

        public int getHasRedpacketCover() {
            return this.hasRedpacketCover_;
        }

        public String getHeadimgUrl() {
            return this.headimgUrl_;
        }

        public C16994k getHeadimgUrlBytes() {
            return C16994k.m16791k(this.headimgUrl_);
        }

        public int getIsRecommend() {
            return this.isRecommend_;
        }

        public int getIsRecommendBackend() {
            return this.isRecommendBackend_;
        }

        public int getMappmsgid() {
            return this.mappmsgid_;
        }

        public int getMbizuin() {
            return this.mbizuin_;
        }

        public int getMidx() {
            return this.midx_;
        }

        public int getMsgRecType() {
            return this.msgRecType_;
        }

        public String getNickName() {
            return this.nickName_;
        }

        public C16994k getNickNameBytes() {
            return C16994k.m16791k(this.nickName_);
        }

        public String getPrimaryColor() {
            return this.primaryColor_;
        }

        public C16994k getPrimaryColorBytes() {
            return C16994k.m16791k(this.primaryColor_);
        }

        public String getRecInfo() {
            return this.recInfo_;
        }

        public C16994k getRecInfoBytes() {
            return C16994k.m16791k(this.recInfo_);
        }

        public String getRecSummary() {
            return this.recSummary_;
        }

        public C16994k getRecSummaryBytes() {
            return C16994k.m16791k(this.recSummary_);
        }

        public String getRecommendReason() {
            return this.recommendReason_;
        }

        public C16994k getRecommendReasonBytes() {
            return C16994k.m16791k(this.recommendReason_);
        }

        public int getRecommendSendTime() {
            return this.recommendSendTime_;
        }

        public String getReportInfo() {
            return this.reportInfo_;
        }

        public C16994k getReportInfoBytes() {
            return C16994k.m16791k(this.reportInfo_);
        }

        public long getRequestId() {
            return this.requestId_;
        }

        public int getShowFinder() {
            return this.showFinder_;
        }

        public String getTitle() {
            return this.title_;
        }

        public C16994k getTitleBytes() {
            return C16994k.m16791k(this.title_);
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public boolean hasAlignment() {
            return (this.bitField0_ & 134217728) != 0;
        }

        public boolean hasBizuin() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCardOriginOrder() {
            return (this.bitField1_ & 256) != 0;
        }

        public boolean hasCardRecType() {
            return (this.bitField1_ & 2) != 0;
        }

        public boolean hasCoverImgUrl() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasExpType() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        public boolean hasFinderCommentCount() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        }

        public boolean hasFinderCoverHeight() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasFinderCoverWidth() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasFinderCreateTime() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0;
        }

        public boolean hasFinderDuration() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasFinderEncryptUserName() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasFinderExportId() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasFinderExportUsername() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasFinderHeight() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasFinderLikeCount() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasFinderMediaType() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasFinderObjectId() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasFinderObjectNonceId() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasFinderSessionBuffer() {
            return (this.bitField1_ & 4) != 0;
        }

        public boolean hasFinderUin() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasFinderWidth() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasHasRedpacketCover() {
            return (this.bitField1_ & 16) != 0;
        }

        public boolean hasHeadimgUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIsRecommend() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasIsRecommendBackend() {
            return (this.bitField1_ & 128) != 0;
        }

        public boolean hasMappmsgid() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasMbizuin() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasMidx() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasMsgRecType() {
            return (this.bitField1_ & 1) != 0;
        }

        public boolean hasNickName() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPrimaryColor() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasRecInfo() {
            return (this.bitField1_ & 8) != 0;
        }

        public boolean hasRecSummary() {
            return (this.bitField1_ & 32) != 0;
        }

        public boolean hasRecommendReason() {
            return (this.bitField0_ & 268435456) != 0;
        }

        public boolean hasRecommendSendTime() {
            return (this.bitField0_ & 536870912) != 0;
        }

        public boolean hasReportInfo() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        public boolean hasRequestId() {
            return (this.bitField1_ & 64) != 0;
        }

        public boolean hasShowFinder() {
            return (this.bitField0_ & 67108864) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(FinderRecommendData finderRecommendData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderRecommendData);
        }

        public static FinderRecommendData parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderRecommendData) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderRecommendData parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderRecommendData parseFrom(C16994k kVar) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderRecommendData parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderRecommendData parseFrom(byte[] bArr) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderRecommendData parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderRecommendData parseFrom(InputStream inputStream) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderRecommendData parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderRecommendData parseFrom(C23856l lVar) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderRecommendData parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderRecommendData) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiCardProto$FinderRecommendDataOrBuilder */
    public interface FinderRecommendDataOrBuilder extends C23848k1 {
        int getAlignment();

        int getBizuin();

        int getCardOriginOrder();

        int getCardRecType();

        String getCoverImgUrl();

        C16994k getCoverImgUrlBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getExpType();

        C16994k getExpTypeBytes();

        int getFinderCommentCount();

        int getFinderCoverHeight();

        int getFinderCoverWidth();

        int getFinderCreateTime();

        int getFinderDuration();

        String getFinderEncryptUserName();

        C16994k getFinderEncryptUserNameBytes();

        String getFinderExportId();

        C16994k getFinderExportIdBytes();

        String getFinderExportUsername();

        C16994k getFinderExportUsernameBytes();

        int getFinderHeight();

        int getFinderLikeCount();

        int getFinderMediaType();

        String getFinderObjectId();

        C16994k getFinderObjectIdBytes();

        String getFinderObjectNonceId();

        C16994k getFinderObjectNonceIdBytes();

        String getFinderSessionBuffer();

        C16994k getFinderSessionBufferBytes();

        String getFinderUin();

        C16994k getFinderUinBytes();

        int getFinderWidth();

        int getHasRedpacketCover();

        String getHeadimgUrl();

        C16994k getHeadimgUrlBytes();

        int getIsRecommend();

        int getIsRecommendBackend();

        int getMappmsgid();

        int getMbizuin();

        int getMidx();

        int getMsgRecType();

        String getNickName();

        C16994k getNickNameBytes();

        String getPrimaryColor();

        C16994k getPrimaryColorBytes();

        String getRecInfo();

        C16994k getRecInfoBytes();

        String getRecSummary();

        C16994k getRecSummaryBytes();

        String getRecommendReason();

        C16994k getRecommendReasonBytes();

        int getRecommendSendTime();

        String getReportInfo();

        C16994k getReportInfoBytes();

        long getRequestId();

        int getShowFinder();

        String getTitle();

        C16994k getTitleBytes();

        String getUsername();

        C16994k getUsernameBytes();

        boolean hasAlignment();

        boolean hasBizuin();

        boolean hasCardOriginOrder();

        boolean hasCardRecType();

        boolean hasCoverImgUrl();

        boolean hasExpType();

        boolean hasFinderCommentCount();

        boolean hasFinderCoverHeight();

        boolean hasFinderCoverWidth();

        boolean hasFinderCreateTime();

        boolean hasFinderDuration();

        boolean hasFinderEncryptUserName();

        boolean hasFinderExportId();

        boolean hasFinderExportUsername();

        boolean hasFinderHeight();

        boolean hasFinderLikeCount();

        boolean hasFinderMediaType();

        boolean hasFinderObjectId();

        boolean hasFinderObjectNonceId();

        boolean hasFinderSessionBuffer();

        boolean hasFinderUin();

        boolean hasFinderWidth();

        boolean hasHasRedpacketCover();

        boolean hasHeadimgUrl();

        boolean hasIsRecommend();

        boolean hasIsRecommendBackend();

        boolean hasMappmsgid();

        boolean hasMbizuin();

        boolean hasMidx();

        boolean hasMsgRecType();

        boolean hasNickName();

        boolean hasPrimaryColor();

        boolean hasRecInfo();

        boolean hasRecSummary();

        boolean hasRecommendReason();

        boolean hasRecommendSendTime();

        boolean hasReportInfo();

        boolean hasRequestId();

        boolean hasShowFinder();

        boolean hasTitle();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    private BizCgiCardProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
