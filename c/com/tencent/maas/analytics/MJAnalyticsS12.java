package com.tencent.maas.analytics;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23803a;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23813c;
import com.google.protobuf.C23817d;
import com.google.protobuf.C23821e2;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23844i2;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23872m0;
import com.google.protobuf.C23896m1;
import com.google.protobuf.C23897n;
import com.google.protobuf.C23901n0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C23922p0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24044t0;
import com.google.protobuf.C24048u0;
import com.google.protobuf.C24062w1;
import com.google.protobuf.C24071y;
import com.google.protobuf.C55062b2;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class MJAnalyticsS12 {
    private static C24025t.C24038h descriptor = C24025t.C24038h.m29872i(new String[]{"\n\u0014MJAnalyticsS12.proto\"\u0001\n\u0010MJAnalyticsEvent\u0012\f\n\u0004name\u0018\u0001 \u0002(\t\u0012\u0012\n\nerror_code\u0018\u0002 \u0001(\t\u0012\u0015\n\rerror_message\u0018\u0003 \u0001(\t\u0012\f\n\u0004keys\u0018\u0004 \u0003(\t\u0012\u000e\n\u0006values\u0018\u0005 \u0003(\t\u0012\u000f\n\u0007expands\u0018\u0006 \u0003(\t\u0012\u0012\n\ntime_stamp\u0018\u0007 \u0002(\u0003\"É\u0002\n\u0010MJAnalyticsAsset\u0012)\n\nmedia_type\u0018\u0001 \u0002(\u000e2\u0015.MJAnalyticsMediaType\u0012\u0013\n\u000bduration_ms\u0018\u0002 \u0002(\u0004\u0012\u0014\n\faspect_ratio\u0018\u0003 \u0002(\t\u0012\u000f\n\u0007ai_tags\u0018\u0004 \u0001(\t\u0012\u0011\n\torigin_id\u0018\u0005 \u0001(\t\u0012\u0019\n\u0011is_over_threshold\u0018\u0006 \u0001(\b\u0012 \n\u0018video_class_audio_labels\u0018\u0007 \u0003(\u0005\u0012\u001a\n\u0012image_class_labels\u0018\b \u0003(\u0005\u0012\u001b\n\u0013image_class_exceeds\u0018\t \u0003(\u0005\u0012!\n\u0019video_class_visual_labels\u0018\n \u0003(\u0005\u0012\"\n\u001avideo_class_visual_exceeds\u0018\u000b \u0003(\u0005\"Õ\u0001\n\u001dMJAnalyticsPreviewMusicAction\u0012\u0018\n\u0010preview_music_id\u0018\u0001 \u0001(\t\u0012>\n\u0019preview_music_source_type\u0018\u0002 \u0001(\u000e2\u001b.MJAnalyticsMusicSourceType\u0012\u001f\n\u0017preview_music_song_name\u0018\u0003 \u0001(\t\u0012\u001b\n\u0013preview_duration_ms\u0018\u0004 \u0001(\u0004\u0012\u001c\n\u0014timeline_duration_ms\u0018\u0005 \u0001(\u0004\"Ù\u0001\n MJAnalyticsPreviewTemplateAction\u0012\u001b\n\u0013preview_template_id\u0018\u0001 \u0001(\t\u0012D\n\u001cpreview_template_source_type\u0018\u0002 \u0001(\u000e2\u001e.MJAnalyticsTemplateSourceType\u0012\u001b\n\u0013preview_duration_ms\u0018\u0003 \u0001(\u0004\u00125\n\rmusic_actions\u0018\u0004 \u0003(\u000b2\u001e.MJAnalyticsPreviewMusicAction\"\u0001\n!MJAnalyticsTemplateRecommendation\u0012\u0012\n\nrequest_id\u0018\u0001 \u0001(\u0004\u0012\u0013\n\u000bcreation_id\u0018\u0002 \u0001(\t\u0012\u0011\n\tscene_tag\u0018\u0003 \u0001(\t\u0012\u001e\n\u0016project_classification\u0018\u0004 \u0001(\t\u0012\u0018\n\u0010attachments_json\u0018\u0005 \u0001(\t\"ò\u0003\n\u0017MJAnalyticsMovieSession\u0012!\n\u0006assets\u0018\u0001 \u0003(\u000b2\u0011.MJAnalyticsAsset\u0012;\n\u0010template_actions\u0018\u0002 \u0003(\u000b2!.MJAnalyticsPreviewTemplateAction\u0012!\n\u0019total_preview_duration_ms\u0018\u0003 \u0001(\u0004\u0012\u001a\n\u0012export_duration_ms\u0018\u0004 \u0001(\u0004\u0012\u001a\n\u0012export_template_id\u0018\u0005 \u0001(\t\u0012\u0017\n\u000fexport_music_id\u0018\u0006 \u0001(\t\u0012C\n\u0017template_recommendation\u0018\u0007 \u0001(\u000b2\".MJAnalyticsTemplateRecommendation\u0012\u001e\n\u0016export_music_song_name\u0018\b \u0001(\t\u0012=\n\u0018export_music_source_type\u0018\t \u0001(\u000e2\u001b.MJAnalyticsMusicSourceType\u0012C\n\u001bexport_template_source_type\u0018\n \u0001(\u000e2\u001e.MJAnalyticsTemplateSourceType\u0012\u001a\n\u0012fixed_template_ids\u0018\u000b \u0003(\t*,\n\u0014MJAnalyticsMediaType\u0012\t\n\u0005IMAGE\u0010\u0001\u0012\t\n\u0005VIDEO\u0010\u0002*T\n\u001aMJAnalyticsMusicSourceType\u0012\r\n\tRECOMMEND\u0010\u0001\u0012\f\n\bTEMPLATE\u0010\u0002\u0012\r\n\tNOT_FOUND\u0010\u0003\u0012\n\n\u0006OTHERS\u0010d*[\n\u001dMJAnalyticsTemplateSourceType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\t\n\u0005FIXED\u0010\u0001\u0012\u0010\n\fRECOMMEND_V2\u0010\u0002\u0012\u0010\n\fRECOMMEND_V3\u0010\u0003B,\n\u001acom.tencent.maas.analyticsB\u000eMJAnalyticsS12"}, new C24025t.C24038h[0]);
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJAnalyticsAsset_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJAnalyticsAsset_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJAnalyticsEvent_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJAnalyticsEvent_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJAnalyticsMovieSession_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJAnalyticsMovieSession_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJAnalyticsPreviewMusicAction_descriptor;
    /* access modifiers changed from: private */
    public static final C23872m0.C23880f internal_static_MJAnalyticsPreviewMusicAction_fieldAccessorTable;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJAnalyticsPreviewTemplateAction_descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_MJAnalyticsPreviewTemplateAction_fieldAccessorTable */
    public static final C23872m0.C23880f f69253xf8a5f24e;
    /* access modifiers changed from: private */
    public static final C24025t.C24027b internal_static_MJAnalyticsTemplateRecommendation_descriptor;
    /* access modifiers changed from: private */

    /* renamed from: internal_static_MJAnalyticsTemplateRecommendation_fieldAccessorTable */
    public static final C23872m0.C23880f f69254x8059c61f;

    public static final class MJAnalyticsAsset extends C23872m0 implements MJAnalyticsAssetOrBuilder {
        public static final int AI_TAGS_FIELD_NUMBER = 4;
        public static final int ASPECT_RATIO_FIELD_NUMBER = 3;
        private static final MJAnalyticsAsset DEFAULT_INSTANCE = new MJAnalyticsAsset();
        public static final int DURATION_MS_FIELD_NUMBER = 2;
        public static final int IMAGE_CLASS_EXCEEDS_FIELD_NUMBER = 9;
        public static final int IMAGE_CLASS_LABELS_FIELD_NUMBER = 8;
        public static final int IS_OVER_THRESHOLD_FIELD_NUMBER = 6;
        public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
        public static final int ORIGIN_ID_FIELD_NUMBER = 5;
        @Deprecated
        public static final C24062w1<MJAnalyticsAsset> PARSER = new C23813c<MJAnalyticsAsset>() {
            public MJAnalyticsAsset parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new MJAnalyticsAsset(lVar, a0Var);
            }
        };
        public static final int VIDEO_CLASS_AUDIO_LABELS_FIELD_NUMBER = 7;
        public static final int VIDEO_CLASS_VISUAL_EXCEEDS_FIELD_NUMBER = 11;
        public static final int VIDEO_CLASS_VISUAL_LABELS_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object aiTags_;
        /* access modifiers changed from: private */
        public volatile Object aspectRatio_;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public long durationMs_;
        /* access modifiers changed from: private */
        public C23908o0.C23915g imageClassExceeds_;
        /* access modifiers changed from: private */
        public C23908o0.C23915g imageClassLabels_;
        /* access modifiers changed from: private */
        public boolean isOverThreshold_;
        /* access modifiers changed from: private */
        public int mediaType_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object originId_;
        /* access modifiers changed from: private */
        public C23908o0.C23915g videoClassAudioLabels_;
        /* access modifiers changed from: private */
        public C23908o0.C23915g videoClassVisualExceeds_;
        /* access modifiers changed from: private */
        public C23908o0.C23915g videoClassVisualLabels_;

        public static MJAnalyticsAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJAnalyticsS12.internal_static_MJAnalyticsAsset_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MJAnalyticsAsset parseDelimitedFrom(InputStream inputStream) {
            return (MJAnalyticsAsset) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsAsset parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<MJAnalyticsAsset> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MJAnalyticsAsset)) {
                return super.equals(obj);
            }
            MJAnalyticsAsset mJAnalyticsAsset = (MJAnalyticsAsset) obj;
            if (hasMediaType() != mJAnalyticsAsset.hasMediaType()) {
                return false;
            }
            if ((hasMediaType() && this.mediaType_ != mJAnalyticsAsset.mediaType_) || hasDurationMs() != mJAnalyticsAsset.hasDurationMs()) {
                return false;
            }
            if ((hasDurationMs() && getDurationMs() != mJAnalyticsAsset.getDurationMs()) || hasAspectRatio() != mJAnalyticsAsset.hasAspectRatio()) {
                return false;
            }
            if ((hasAspectRatio() && !getAspectRatio().equals(mJAnalyticsAsset.getAspectRatio())) || hasAiTags() != mJAnalyticsAsset.hasAiTags()) {
                return false;
            }
            if ((hasAiTags() && !getAiTags().equals(mJAnalyticsAsset.getAiTags())) || hasOriginId() != mJAnalyticsAsset.hasOriginId()) {
                return false;
            }
            if ((!hasOriginId() || getOriginId().equals(mJAnalyticsAsset.getOriginId())) && hasIsOverThreshold() == mJAnalyticsAsset.hasIsOverThreshold()) {
                return (!hasIsOverThreshold() || getIsOverThreshold() == mJAnalyticsAsset.getIsOverThreshold()) && getVideoClassAudioLabelsList().equals(mJAnalyticsAsset.getVideoClassAudioLabelsList()) && getImageClassLabelsList().equals(mJAnalyticsAsset.getImageClassLabelsList()) && getImageClassExceedsList().equals(mJAnalyticsAsset.getImageClassExceedsList()) && getVideoClassVisualLabelsList().equals(mJAnalyticsAsset.getVideoClassVisualLabelsList()) && getVideoClassVisualExceedsList().equals(mJAnalyticsAsset.getVideoClassVisualExceedsList()) && this.unknownFields.equals(mJAnalyticsAsset.unknownFields);
            }
            return false;
        }

        public String getAiTags() {
            Object obj = this.aiTags_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.aiTags_ = u;
            }
            return u;
        }

        public C16994k getAiTagsBytes() {
            Object obj = this.aiTags_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.aiTags_ = k;
            return k;
        }

        public String getAspectRatio() {
            Object obj = this.aspectRatio_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.aspectRatio_ = u;
            }
            return u;
        }

        public C16994k getAspectRatioBytes() {
            Object obj = this.aspectRatio_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.aspectRatio_ = k;
            return k;
        }

        public long getDurationMs() {
            return this.durationMs_;
        }

        public int getImageClassExceeds(int i) {
            return ((C23901n0) this.imageClassExceeds_).mo37936k(i);
        }

        public int getImageClassExceedsCount() {
            return ((C23901n0) this.imageClassExceeds_).f68498f;
        }

        public List<Integer> getImageClassExceedsList() {
            return this.imageClassExceeds_;
        }

        public int getImageClassLabels(int i) {
            return ((C23901n0) this.imageClassLabels_).mo37936k(i);
        }

        public int getImageClassLabelsCount() {
            return ((C23901n0) this.imageClassLabels_).f68498f;
        }

        public List<Integer> getImageClassLabelsList() {
            return this.imageClassLabels_;
        }

        public boolean getIsOverThreshold() {
            return this.isOverThreshold_;
        }

        public MJAnalyticsMediaType getMediaType() {
            MJAnalyticsMediaType valueOf = MJAnalyticsMediaType.valueOf(this.mediaType_);
            return valueOf == null ? MJAnalyticsMediaType.IMAGE : valueOf;
        }

        public String getOriginId() {
            Object obj = this.originId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.originId_ = u;
            }
            return u;
        }

        public C16994k getOriginIdBytes() {
            Object obj = this.originId_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.originId_ = k;
            return k;
        }

        public C24062w1<MJAnalyticsAsset> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int f = (this.bitField0_ & 1) != 0 ? C23897n.m29261f(1, this.mediaType_) + 0 : 0;
            if ((this.bitField0_ & 2) != 0) {
                f += C23897n.m29280y(2, this.durationMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                f += C23872m0.computeStringSize(3, this.aspectRatio_);
            }
            if ((this.bitField0_ & 8) != 0) {
                f += C23872m0.computeStringSize(4, this.aiTags_);
            }
            if ((this.bitField0_ & 16) != 0) {
                f += C23872m0.computeStringSize(5, this.originId_);
            }
            if ((this.bitField0_ & 32) != 0) {
                f += C23897n.m29257b(6, this.isOverThreshold_);
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                C23908o0.C23915g gVar = this.videoClassAudioLabels_;
                if (i3 >= ((C23901n0) gVar).f68498f) {
                    break;
                }
                i4 += C23897n.m29267l(((C23901n0) gVar).mo37936k(i3));
                i3++;
            }
            int size = f + i4 + (getVideoClassAudioLabelsList().size() * 1);
            int i5 = 0;
            int i6 = 0;
            while (true) {
                C23908o0.C23915g gVar2 = this.imageClassLabels_;
                if (i5 >= ((C23901n0) gVar2).f68498f) {
                    break;
                }
                i6 += C23897n.m29267l(((C23901n0) gVar2).mo37936k(i5));
                i5++;
            }
            int size2 = size + i6 + (getImageClassLabelsList().size() * 1);
            int i7 = 0;
            int i8 = 0;
            while (true) {
                C23908o0.C23915g gVar3 = this.imageClassExceeds_;
                if (i7 >= ((C23901n0) gVar3).f68498f) {
                    break;
                }
                i8 += C23897n.m29267l(((C23901n0) gVar3).mo37936k(i7));
                i7++;
            }
            int size3 = size2 + i8 + (getImageClassExceedsList().size() * 1);
            int i9 = 0;
            int i15 = 0;
            while (true) {
                C23908o0.C23915g gVar4 = this.videoClassVisualLabels_;
                if (i9 >= ((C23901n0) gVar4).f68498f) {
                    break;
                }
                i15 += C23897n.m29267l(((C23901n0) gVar4).mo37936k(i9));
                i9++;
            }
            int size4 = size3 + i15 + (getVideoClassVisualLabelsList().size() * 1);
            int i16 = 0;
            while (true) {
                C23908o0.C23915g gVar5 = this.videoClassVisualExceeds_;
                if (i2 < ((C23901n0) gVar5).f68498f) {
                    i16 += C23897n.m29267l(((C23901n0) gVar5).mo37936k(i2));
                    i2++;
                } else {
                    int size5 = size4 + i16 + (getVideoClassVisualExceedsList().size() * 1) + this.unknownFields.getSerializedSize();
                    this.memoizedSize = size5;
                    return size5;
                }
            }
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public int getVideoClassAudioLabels(int i) {
            return ((C23901n0) this.videoClassAudioLabels_).mo37936k(i);
        }

        public int getVideoClassAudioLabelsCount() {
            return ((C23901n0) this.videoClassAudioLabels_).f68498f;
        }

        public List<Integer> getVideoClassAudioLabelsList() {
            return this.videoClassAudioLabels_;
        }

        public int getVideoClassVisualExceeds(int i) {
            return ((C23901n0) this.videoClassVisualExceeds_).mo37936k(i);
        }

        public int getVideoClassVisualExceedsCount() {
            return ((C23901n0) this.videoClassVisualExceeds_).f68498f;
        }

        public List<Integer> getVideoClassVisualExceedsList() {
            return this.videoClassVisualExceeds_;
        }

        public int getVideoClassVisualLabels(int i) {
            return ((C23901n0) this.videoClassVisualLabels_).mo37936k(i);
        }

        public int getVideoClassVisualLabelsCount() {
            return ((C23901n0) this.videoClassVisualLabels_).f68498f;
        }

        public List<Integer> getVideoClassVisualLabelsList() {
            return this.videoClassVisualLabels_;
        }

        public boolean hasAiTags() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasAspectRatio() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDurationMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIsOverThreshold() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasMediaType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOriginId() {
            return (this.bitField0_ & 16) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasMediaType()) {
                hashCode = (((hashCode * 37) + 1) * 53) + this.mediaType_;
            }
            if (hasDurationMs()) {
                hashCode = (((hashCode * 37) + 2) * 53) + C23908o0.m29424b(getDurationMs());
            }
            if (hasAspectRatio()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getAspectRatio().hashCode();
            }
            if (hasAiTags()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getAiTags().hashCode();
            }
            if (hasOriginId()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getOriginId().hashCode();
            }
            if (hasIsOverThreshold()) {
                hashCode = (((hashCode * 37) + 6) * 53) + C23908o0.m29423a(getIsOverThreshold());
            }
            if (getVideoClassAudioLabelsCount() > 0) {
                hashCode = (((hashCode * 37) + 7) * 53) + getVideoClassAudioLabelsList().hashCode();
            }
            if (getImageClassLabelsCount() > 0) {
                hashCode = (((hashCode * 37) + 8) * 53) + getImageClassLabelsList().hashCode();
            }
            if (getImageClassExceedsCount() > 0) {
                hashCode = (((hashCode * 37) + 9) * 53) + getImageClassExceedsList().hashCode();
            }
            if (getVideoClassVisualLabelsCount() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + getVideoClassVisualLabelsList().hashCode();
            }
            if (getVideoClassVisualExceedsCount() > 0) {
                hashCode = (((hashCode * 37) + 11) * 53) + getVideoClassVisualExceedsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$1700 = MJAnalyticsS12.internal_static_MJAnalyticsAsset_fieldAccessorTable;
            access$1700.mo37875c(MJAnalyticsAsset.class, Builder.class);
            return access$1700;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasMediaType()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasDurationMs()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasAspectRatio()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new MJAnalyticsAsset();
        }

        public void writeTo(C23897n nVar) {
            if ((this.bitField0_ & 1) != 0) {
                nVar.mo37907N(1, this.mediaType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                nVar.mo37919Z(2, this.durationMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                C23872m0.writeString(nVar, 3, this.aspectRatio_);
            }
            if ((this.bitField0_ & 8) != 0) {
                C23872m0.writeString(nVar, 4, this.aiTags_);
            }
            if ((this.bitField0_ & 16) != 0) {
                C23872m0.writeString(nVar, 5, this.originId_);
            }
            if ((this.bitField0_ & 32) != 0) {
                nVar.mo37897D(6, this.isOverThreshold_);
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                C23908o0.C23915g gVar = this.videoClassAudioLabels_;
                if (i2 >= ((C23901n0) gVar).f68498f) {
                    break;
                }
                nVar.mo37907N(7, ((C23901n0) gVar).mo37936k(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                C23908o0.C23915g gVar2 = this.imageClassLabels_;
                if (i3 >= ((C23901n0) gVar2).f68498f) {
                    break;
                }
                nVar.mo37907N(8, ((C23901n0) gVar2).mo37936k(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                C23908o0.C23915g gVar3 = this.imageClassExceeds_;
                if (i4 >= ((C23901n0) gVar3).f68498f) {
                    break;
                }
                nVar.mo37907N(9, ((C23901n0) gVar3).mo37936k(i4));
                i4++;
            }
            int i5 = 0;
            while (true) {
                C23908o0.C23915g gVar4 = this.videoClassVisualLabels_;
                if (i5 >= ((C23901n0) gVar4).f68498f) {
                    break;
                }
                nVar.mo37907N(10, ((C23901n0) gVar4).mo37936k(i5));
                i5++;
            }
            while (true) {
                C23908o0.C23915g gVar5 = this.videoClassVisualExceeds_;
                if (i < ((C23901n0) gVar5).f68498f) {
                    nVar.mo37907N(11, ((C23901n0) gVar5).mo37936k(i));
                    i++;
                } else {
                    this.unknownFields.writeTo(nVar);
                    return;
                }
            }
        }

        public static final class Builder extends C23872m0.C23874b<Builder> implements MJAnalyticsAssetOrBuilder {
            private Object aiTags_;
            private Object aspectRatio_;
            private int bitField0_;
            private long durationMs_;
            private C23908o0.C23915g imageClassExceeds_;
            private C23908o0.C23915g imageClassLabels_;
            private boolean isOverThreshold_;
            private int mediaType_;
            private Object originId_;
            private C23908o0.C23915g videoClassAudioLabels_;
            private C23908o0.C23915g videoClassVisualExceeds_;
            private C23908o0.C23915g videoClassVisualLabels_;

            private void ensureImageClassExceedsIsMutable() {
                if ((this.bitField0_ & 256) == 0) {
                    this.imageClassExceeds_ = C23872m0.mutableCopy(this.imageClassExceeds_);
                    this.bitField0_ |= 256;
                }
            }

            private void ensureImageClassLabelsIsMutable() {
                if ((this.bitField0_ & 128) == 0) {
                    this.imageClassLabels_ = C23872m0.mutableCopy(this.imageClassLabels_);
                    this.bitField0_ |= 128;
                }
            }

            private void ensureVideoClassAudioLabelsIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.videoClassAudioLabels_ = C23872m0.mutableCopy(this.videoClassAudioLabels_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureVideoClassVisualExceedsIsMutable() {
                if ((this.bitField0_ & 1024) == 0) {
                    this.videoClassVisualExceeds_ = C23872m0.mutableCopy(this.videoClassVisualExceeds_);
                    this.bitField0_ |= 1024;
                }
            }

            private void ensureVideoClassVisualLabelsIsMutable() {
                if ((this.bitField0_ & 512) == 0) {
                    this.videoClassVisualLabels_ = C23872m0.mutableCopy(this.videoClassVisualLabels_);
                    this.bitField0_ |= 512;
                }
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJAnalyticsS12.internal_static_MJAnalyticsAsset_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder addAllImageClassExceeds(Iterable<? extends Integer> iterable) {
                ensureImageClassExceedsIsMutable();
                C23810b.C23811a.addAll(iterable, this.imageClassExceeds_);
                onChanged();
                return this;
            }

            public Builder addAllImageClassLabels(Iterable<? extends Integer> iterable) {
                ensureImageClassLabelsIsMutable();
                C23810b.C23811a.addAll(iterable, this.imageClassLabels_);
                onChanged();
                return this;
            }

            public Builder addAllVideoClassAudioLabels(Iterable<? extends Integer> iterable) {
                ensureVideoClassAudioLabelsIsMutable();
                C23810b.C23811a.addAll(iterable, this.videoClassAudioLabels_);
                onChanged();
                return this;
            }

            public Builder addAllVideoClassVisualExceeds(Iterable<? extends Integer> iterable) {
                ensureVideoClassVisualExceedsIsMutable();
                C23810b.C23811a.addAll(iterable, this.videoClassVisualExceeds_);
                onChanged();
                return this;
            }

            public Builder addAllVideoClassVisualLabels(Iterable<? extends Integer> iterable) {
                ensureVideoClassVisualLabelsIsMutable();
                C23810b.C23811a.addAll(iterable, this.videoClassVisualLabels_);
                onChanged();
                return this;
            }

            public Builder addImageClassExceeds(int i) {
                ensureImageClassExceedsIsMutable();
                ((C23901n0) this.imageClassExceeds_).mo37933h(i);
                onChanged();
                return this;
            }

            public Builder addImageClassLabels(int i) {
                ensureImageClassLabelsIsMutable();
                ((C23901n0) this.imageClassLabels_).mo37933h(i);
                onChanged();
                return this;
            }

            public Builder addVideoClassAudioLabels(int i) {
                ensureVideoClassAudioLabelsIsMutable();
                ((C23901n0) this.videoClassAudioLabels_).mo37933h(i);
                onChanged();
                return this;
            }

            public Builder addVideoClassVisualExceeds(int i) {
                ensureVideoClassVisualExceedsIsMutable();
                ((C23901n0) this.videoClassVisualExceeds_).mo37933h(i);
                onChanged();
                return this;
            }

            public Builder addVideoClassVisualLabels(int i) {
                ensureVideoClassVisualLabelsIsMutable();
                ((C23901n0) this.videoClassVisualLabels_).mo37933h(i);
                onChanged();
                return this;
            }

            public Builder clearAiTags() {
                this.bitField0_ &= -9;
                this.aiTags_ = MJAnalyticsAsset.getDefaultInstance().getAiTags();
                onChanged();
                return this;
            }

            public Builder clearAspectRatio() {
                this.bitField0_ &= -5;
                this.aspectRatio_ = MJAnalyticsAsset.getDefaultInstance().getAspectRatio();
                onChanged();
                return this;
            }

            public Builder clearDurationMs() {
                this.bitField0_ &= -3;
                this.durationMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearImageClassExceeds() {
                this.imageClassExceeds_ = C23872m0.emptyIntList();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearImageClassLabels() {
                this.imageClassLabels_ = C23872m0.emptyIntList();
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            public Builder clearIsOverThreshold() {
                this.bitField0_ &= -33;
                this.isOverThreshold_ = false;
                onChanged();
                return this;
            }

            public Builder clearMediaType() {
                this.bitField0_ &= -2;
                this.mediaType_ = 1;
                onChanged();
                return this;
            }

            public Builder clearOriginId() {
                this.bitField0_ &= -17;
                this.originId_ = MJAnalyticsAsset.getDefaultInstance().getOriginId();
                onChanged();
                return this;
            }

            public Builder clearVideoClassAudioLabels() {
                this.videoClassAudioLabels_ = C23872m0.emptyIntList();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearVideoClassVisualExceeds() {
                this.videoClassVisualExceeds_ = C23872m0.emptyIntList();
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder clearVideoClassVisualLabels() {
                this.videoClassVisualLabels_ = C23872m0.emptyIntList();
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            public String getAiTags() {
                Object obj = this.aiTags_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.aiTags_ = u;
                }
                return u;
            }

            public C16994k getAiTagsBytes() {
                Object obj = this.aiTags_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.aiTags_ = k;
                return k;
            }

            public String getAspectRatio() {
                Object obj = this.aspectRatio_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.aspectRatio_ = u;
                }
                return u;
            }

            public C16994k getAspectRatioBytes() {
                Object obj = this.aspectRatio_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.aspectRatio_ = k;
                return k;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJAnalyticsS12.internal_static_MJAnalyticsAsset_descriptor;
            }

            public long getDurationMs() {
                return this.durationMs_;
            }

            public int getImageClassExceeds(int i) {
                return ((C23901n0) this.imageClassExceeds_).mo37936k(i);
            }

            public int getImageClassExceedsCount() {
                return ((C23901n0) this.imageClassExceeds_).f68498f;
            }

            public List<Integer> getImageClassExceedsList() {
                return (this.bitField0_ & 256) != 0 ? Collections.unmodifiableList(this.imageClassExceeds_) : this.imageClassExceeds_;
            }

            public int getImageClassLabels(int i) {
                return ((C23901n0) this.imageClassLabels_).mo37936k(i);
            }

            public int getImageClassLabelsCount() {
                return ((C23901n0) this.imageClassLabels_).f68498f;
            }

            public List<Integer> getImageClassLabelsList() {
                return (this.bitField0_ & 128) != 0 ? Collections.unmodifiableList(this.imageClassLabels_) : this.imageClassLabels_;
            }

            public boolean getIsOverThreshold() {
                return this.isOverThreshold_;
            }

            public MJAnalyticsMediaType getMediaType() {
                MJAnalyticsMediaType valueOf = MJAnalyticsMediaType.valueOf(this.mediaType_);
                return valueOf == null ? MJAnalyticsMediaType.IMAGE : valueOf;
            }

            public String getOriginId() {
                Object obj = this.originId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.originId_ = u;
                }
                return u;
            }

            public C16994k getOriginIdBytes() {
                Object obj = this.originId_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.originId_ = k;
                return k;
            }

            public int getVideoClassAudioLabels(int i) {
                return ((C23901n0) this.videoClassAudioLabels_).mo37936k(i);
            }

            public int getVideoClassAudioLabelsCount() {
                return ((C23901n0) this.videoClassAudioLabels_).f68498f;
            }

            public List<Integer> getVideoClassAudioLabelsList() {
                return (this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.videoClassAudioLabels_) : this.videoClassAudioLabels_;
            }

            public int getVideoClassVisualExceeds(int i) {
                return ((C23901n0) this.videoClassVisualExceeds_).mo37936k(i);
            }

            public int getVideoClassVisualExceedsCount() {
                return ((C23901n0) this.videoClassVisualExceeds_).f68498f;
            }

            public List<Integer> getVideoClassVisualExceedsList() {
                return (this.bitField0_ & 1024) != 0 ? Collections.unmodifiableList(this.videoClassVisualExceeds_) : this.videoClassVisualExceeds_;
            }

            public int getVideoClassVisualLabels(int i) {
                return ((C23901n0) this.videoClassVisualLabels_).mo37936k(i);
            }

            public int getVideoClassVisualLabelsCount() {
                return ((C23901n0) this.videoClassVisualLabels_).f68498f;
            }

            public List<Integer> getVideoClassVisualLabelsList() {
                return (this.bitField0_ & 512) != 0 ? Collections.unmodifiableList(this.videoClassVisualLabels_) : this.videoClassVisualLabels_;
            }

            public boolean hasAiTags() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasAspectRatio() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasDurationMs() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasIsOverThreshold() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasMediaType() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasOriginId() {
                return (this.bitField0_ & 16) != 0;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$1700 = MJAnalyticsS12.internal_static_MJAnalyticsAsset_fieldAccessorTable;
                access$1700.mo37875c(MJAnalyticsAsset.class, Builder.class);
                return access$1700;
            }

            public final boolean isInitialized() {
                return hasMediaType() && hasDurationMs() && hasAspectRatio();
            }

            public Builder setAiTags(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.aiTags_ = str;
                onChanged();
                return this;
            }

            public Builder setAiTagsBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 8;
                this.aiTags_ = kVar;
                onChanged();
                return this;
            }

            public Builder setAspectRatio(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.aspectRatio_ = str;
                onChanged();
                return this;
            }

            public Builder setAspectRatioBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 4;
                this.aspectRatio_ = kVar;
                onChanged();
                return this;
            }

            public Builder setDurationMs(long j) {
                this.bitField0_ |= 2;
                this.durationMs_ = j;
                onChanged();
                return this;
            }

            public Builder setImageClassExceeds(int i, int i2) {
                ensureImageClassExceedsIsMutable();
                ((C23901n0) this.imageClassExceeds_).mo37939n(i, i2);
                onChanged();
                return this;
            }

            public Builder setImageClassLabels(int i, int i2) {
                ensureImageClassLabelsIsMutable();
                ((C23901n0) this.imageClassLabels_).mo37939n(i, i2);
                onChanged();
                return this;
            }

            public Builder setIsOverThreshold(boolean z) {
                this.bitField0_ |= 32;
                this.isOverThreshold_ = z;
                onChanged();
                return this;
            }

            public Builder setMediaType(MJAnalyticsMediaType mJAnalyticsMediaType) {
                mJAnalyticsMediaType.getClass();
                this.bitField0_ |= 1;
                this.mediaType_ = mJAnalyticsMediaType.getNumber();
                onChanged();
                return this;
            }

            public Builder setOriginId(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.originId_ = str;
                onChanged();
                return this;
            }

            public Builder setOriginIdBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 16;
                this.originId_ = kVar;
                onChanged();
                return this;
            }

            public Builder setVideoClassAudioLabels(int i, int i2) {
                ensureVideoClassAudioLabelsIsMutable();
                ((C23901n0) this.videoClassAudioLabels_).mo37939n(i, i2);
                onChanged();
                return this;
            }

            public Builder setVideoClassVisualExceeds(int i, int i2) {
                ensureVideoClassVisualExceedsIsMutable();
                ((C23901n0) this.videoClassVisualExceeds_).mo37939n(i, i2);
                onChanged();
                return this;
            }

            public Builder setVideoClassVisualLabels(int i, int i2) {
                ensureVideoClassVisualLabelsIsMutable();
                ((C23901n0) this.videoClassVisualLabels_).mo37939n(i, i2);
                onChanged();
                return this;
            }

            private Builder() {
                this.mediaType_ = 1;
                this.aspectRatio_ = "";
                this.aiTags_ = "";
                this.originId_ = "";
                this.videoClassAudioLabels_ = C23872m0.emptyIntList();
                this.imageClassLabels_ = C23872m0.emptyIntList();
                this.imageClassExceeds_ = C23872m0.emptyIntList();
                this.videoClassVisualLabels_ = C23872m0.emptyIntList();
                this.videoClassVisualExceeds_ = C23872m0.emptyIntList();
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public MJAnalyticsAsset build() {
                MJAnalyticsAsset buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public MJAnalyticsAsset buildPartial() {
                MJAnalyticsAsset mJAnalyticsAsset = new MJAnalyticsAsset((C23872m0.C23874b) this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 0 ? 1 : 0;
                int unused = mJAnalyticsAsset.mediaType_ = this.mediaType_;
                if ((i & 2) != 0) {
                    long unused2 = mJAnalyticsAsset.durationMs_ = this.durationMs_;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                Object unused3 = mJAnalyticsAsset.aspectRatio_ = this.aspectRatio_;
                if ((i & 8) != 0) {
                    i2 |= 8;
                }
                Object unused4 = mJAnalyticsAsset.aiTags_ = this.aiTags_;
                if ((i & 16) != 0) {
                    i2 |= 16;
                }
                Object unused5 = mJAnalyticsAsset.originId_ = this.originId_;
                if ((i & 32) != 0) {
                    boolean unused6 = mJAnalyticsAsset.isOverThreshold_ = this.isOverThreshold_;
                    i2 |= 32;
                }
                int i3 = this.bitField0_;
                if ((i3 & 64) != 0) {
                    ((C23817d) this.videoClassAudioLabels_).f68221d = false;
                    this.bitField0_ = i3 & -65;
                }
                C23908o0.C23915g unused7 = mJAnalyticsAsset.videoClassAudioLabels_ = this.videoClassAudioLabels_;
                int i4 = this.bitField0_;
                if ((i4 & 128) != 0) {
                    ((C23817d) this.imageClassLabels_).f68221d = false;
                    this.bitField0_ = i4 & -129;
                }
                C23908o0.C23915g unused8 = mJAnalyticsAsset.imageClassLabels_ = this.imageClassLabels_;
                int i5 = this.bitField0_;
                if ((i5 & 256) != 0) {
                    ((C23817d) this.imageClassExceeds_).f68221d = false;
                    this.bitField0_ = i5 & -257;
                }
                C23908o0.C23915g unused9 = mJAnalyticsAsset.imageClassExceeds_ = this.imageClassExceeds_;
                int i6 = this.bitField0_;
                if ((i6 & 512) != 0) {
                    ((C23817d) this.videoClassVisualLabels_).f68221d = false;
                    this.bitField0_ = i6 & -513;
                }
                C23908o0.C23915g unused10 = mJAnalyticsAsset.videoClassVisualLabels_ = this.videoClassVisualLabels_;
                int i7 = this.bitField0_;
                if ((i7 & 1024) != 0) {
                    ((C23817d) this.videoClassVisualExceeds_).f68221d = false;
                    this.bitField0_ = i7 & -1025;
                }
                C23908o0.C23915g unused11 = mJAnalyticsAsset.videoClassVisualExceeds_ = this.videoClassVisualExceeds_;
                int unused12 = mJAnalyticsAsset.bitField0_ = i2;
                onBuilt();
                return mJAnalyticsAsset;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public MJAnalyticsAsset getDefaultInstanceForType() {
                return MJAnalyticsAsset.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.mediaType_ = 1;
                this.durationMs_ = 0;
                this.aspectRatio_ = "";
                this.aiTags_ = "";
                this.originId_ = "";
                this.isOverThreshold_ = false;
                this.bitField0_ = this.bitField0_ & -2 & -3 & -5 & -9 & -17 & -33;
                this.videoClassAudioLabels_ = C23872m0.emptyIntList();
                this.bitField0_ &= -65;
                this.imageClassLabels_ = C23872m0.emptyIntList();
                this.bitField0_ &= -129;
                this.imageClassExceeds_ = C23872m0.emptyIntList();
                this.bitField0_ &= -257;
                this.videoClassVisualLabels_ = C23872m0.emptyIntList();
                this.bitField0_ &= -513;
                this.videoClassVisualExceeds_ = C23872m0.emptyIntList();
                this.bitField0_ &= -1025;
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof MJAnalyticsAsset) {
                    return mergeFrom((MJAnalyticsAsset) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(MJAnalyticsAsset mJAnalyticsAsset) {
                if (mJAnalyticsAsset == MJAnalyticsAsset.getDefaultInstance()) {
                    return this;
                }
                if (mJAnalyticsAsset.hasMediaType()) {
                    setMediaType(mJAnalyticsAsset.getMediaType());
                }
                if (mJAnalyticsAsset.hasDurationMs()) {
                    setDurationMs(mJAnalyticsAsset.getDurationMs());
                }
                if (mJAnalyticsAsset.hasAspectRatio()) {
                    this.bitField0_ |= 4;
                    this.aspectRatio_ = mJAnalyticsAsset.aspectRatio_;
                    onChanged();
                }
                if (mJAnalyticsAsset.hasAiTags()) {
                    this.bitField0_ |= 8;
                    this.aiTags_ = mJAnalyticsAsset.aiTags_;
                    onChanged();
                }
                if (mJAnalyticsAsset.hasOriginId()) {
                    this.bitField0_ |= 16;
                    this.originId_ = mJAnalyticsAsset.originId_;
                    onChanged();
                }
                if (mJAnalyticsAsset.hasIsOverThreshold()) {
                    setIsOverThreshold(mJAnalyticsAsset.getIsOverThreshold());
                }
                if (!mJAnalyticsAsset.videoClassAudioLabels_.isEmpty()) {
                    if (this.videoClassAudioLabels_.isEmpty()) {
                        this.videoClassAudioLabels_ = mJAnalyticsAsset.videoClassAudioLabels_;
                        this.bitField0_ &= -65;
                    } else {
                        ensureVideoClassAudioLabelsIsMutable();
                        ((C23901n0) this.videoClassAudioLabels_).addAll(mJAnalyticsAsset.videoClassAudioLabels_);
                    }
                    onChanged();
                }
                if (!mJAnalyticsAsset.imageClassLabels_.isEmpty()) {
                    if (this.imageClassLabels_.isEmpty()) {
                        this.imageClassLabels_ = mJAnalyticsAsset.imageClassLabels_;
                        this.bitField0_ &= -129;
                    } else {
                        ensureImageClassLabelsIsMutable();
                        ((C23901n0) this.imageClassLabels_).addAll(mJAnalyticsAsset.imageClassLabels_);
                    }
                    onChanged();
                }
                if (!mJAnalyticsAsset.imageClassExceeds_.isEmpty()) {
                    if (this.imageClassExceeds_.isEmpty()) {
                        this.imageClassExceeds_ = mJAnalyticsAsset.imageClassExceeds_;
                        this.bitField0_ &= -257;
                    } else {
                        ensureImageClassExceedsIsMutable();
                        ((C23901n0) this.imageClassExceeds_).addAll(mJAnalyticsAsset.imageClassExceeds_);
                    }
                    onChanged();
                }
                if (!mJAnalyticsAsset.videoClassVisualLabels_.isEmpty()) {
                    if (this.videoClassVisualLabels_.isEmpty()) {
                        this.videoClassVisualLabels_ = mJAnalyticsAsset.videoClassVisualLabels_;
                        this.bitField0_ &= -513;
                    } else {
                        ensureVideoClassVisualLabelsIsMutable();
                        ((C23901n0) this.videoClassVisualLabels_).addAll(mJAnalyticsAsset.videoClassVisualLabels_);
                    }
                    onChanged();
                }
                if (!mJAnalyticsAsset.videoClassVisualExceeds_.isEmpty()) {
                    if (this.videoClassVisualExceeds_.isEmpty()) {
                        this.videoClassVisualExceeds_ = mJAnalyticsAsset.videoClassVisualExceeds_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureVideoClassVisualExceedsIsMutable();
                        ((C23901n0) this.videoClassVisualExceeds_).addAll(mJAnalyticsAsset.videoClassVisualExceeds_);
                    }
                    onChanged();
                }
                mergeUnknownFields(mJAnalyticsAsset.unknownFields);
                onChanged();
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.mediaType_ = 1;
                this.aspectRatio_ = "";
                this.aiTags_ = "";
                this.originId_ = "";
                this.videoClassAudioLabels_ = C23872m0.emptyIntList();
                this.imageClassLabels_ = C23872m0.emptyIntList();
                this.imageClassExceeds_ = C23872m0.emptyIntList();
                this.videoClassVisualLabels_ = C23872m0.emptyIntList();
                this.videoClassVisualExceeds_ = C23872m0.emptyIntList();
                maybeForceBuilderInitialization();
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x001f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsAsset.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1<com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsAsset> r1 = com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsAsset.PARSER     // Catch:{ p0 -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0011 }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsAsset r3 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsAsset) r3     // Catch:{ p0 -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsAsset) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001d
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x000f }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsAsset r4 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsAsset) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001b }
                    throw r3     // Catch:{ all -> 0x001b }
                L_0x001b:
                    r3 = move-exception
                    r0 = r4
                L_0x001d:
                    if (r0 == 0) goto L_0x0022
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsAsset) r0)
                L_0x0022:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsAsset.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsAsset$Builder");
            }
        }

        public static Builder newBuilder(MJAnalyticsAsset mJAnalyticsAsset) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mJAnalyticsAsset);
        }

        public static MJAnalyticsAsset parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private MJAnalyticsAsset(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static MJAnalyticsAsset parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsAsset) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsAsset parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public MJAnalyticsAsset getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MJAnalyticsAsset parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MJAnalyticsAsset() {
            this.memoizedIsInitialized = -1;
            this.mediaType_ = 1;
            this.aspectRatio_ = "";
            this.aiTags_ = "";
            this.originId_ = "";
            this.videoClassAudioLabels_ = C23872m0.emptyIntList();
            this.imageClassLabels_ = C23872m0.emptyIntList();
            this.imageClassExceeds_ = C23872m0.emptyIntList();
            this.videoClassVisualLabels_ = C23872m0.emptyIntList();
            this.videoClassVisualExceeds_ = C23872m0.emptyIntList();
        }

        public static MJAnalyticsAsset parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        public static MJAnalyticsAsset parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static MJAnalyticsAsset parseFrom(InputStream inputStream) {
            return (MJAnalyticsAsset) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsAsset parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsAsset) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsAsset parseFrom(C23856l lVar) {
            return (MJAnalyticsAsset) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static MJAnalyticsAsset parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MJAnalyticsAsset) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }

        private MJAnalyticsAsset(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    switch (F) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            int o = lVar.mo37770o();
                            if (MJAnalyticsMediaType.valueOf(o) != null) {
                                this.bitField0_ = 1 | this.bitField0_;
                                this.mediaType_ = o;
                                break;
                            } else {
                                b.mo38304g(1, o);
                                break;
                            }
                        case 16:
                            this.bitField0_ |= 2;
                            this.durationMs_ = lVar.mo37759H();
                            break;
                        case 26:
                            C16994k m = lVar.mo37768m();
                            this.bitField0_ |= 4;
                            this.aspectRatio_ = m;
                            break;
                        case 34:
                            C16994k m2 = lVar.mo37768m();
                            this.bitField0_ |= 8;
                            this.aiTags_ = m2;
                            break;
                        case 42:
                            C16994k m3 = lVar.mo37768m();
                            this.bitField0_ |= 16;
                            this.originId_ = m3;
                            break;
                        case 48:
                            this.bitField0_ |= 32;
                            this.isOverThreshold_ = lVar.mo37767l();
                            break;
                        case 56:
                            if (!z2 || !true) {
                                this.videoClassAudioLabels_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            ((C23901n0) this.videoClassAudioLabels_).mo37933h(lVar.mo37775t());
                            break;
                        case 58:
                            int k = lVar.mo37766k(lVar.mo37779x());
                            if ((!z2 || !true) && lVar.mo37762d() > 0) {
                                this.videoClassAudioLabels_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            while (lVar.mo37762d() > 0) {
                                ((C23901n0) this.videoClassAudioLabels_).mo37933h(lVar.mo37775t());
                            }
                            lVar.mo37765j(k);
                            break;
                        case 64:
                            if (!z2 || !true) {
                                this.imageClassLabels_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            ((C23901n0) this.imageClassLabels_).mo37933h(lVar.mo37775t());
                            break;
                        case 66:
                            int k2 = lVar.mo37766k(lVar.mo37779x());
                            if ((!z2 || !true) && lVar.mo37762d() > 0) {
                                this.imageClassLabels_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            while (lVar.mo37762d() > 0) {
                                ((C23901n0) this.imageClassLabels_).mo37933h(lVar.mo37775t());
                            }
                            lVar.mo37765j(k2);
                            break;
                        case 72:
                            if (!z2 || !true) {
                                this.imageClassExceeds_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            ((C23901n0) this.imageClassExceeds_).mo37933h(lVar.mo37775t());
                            break;
                        case 74:
                            int k3 = lVar.mo37766k(lVar.mo37779x());
                            if ((!z2 || !true) && lVar.mo37762d() > 0) {
                                this.imageClassExceeds_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            while (lVar.mo37762d() > 0) {
                                ((C23901n0) this.imageClassExceeds_).mo37933h(lVar.mo37775t());
                            }
                            lVar.mo37765j(k3);
                            break;
                        case 80:
                            if (!z2 || !true) {
                                this.videoClassVisualLabels_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            ((C23901n0) this.videoClassVisualLabels_).mo37933h(lVar.mo37775t());
                            break;
                        case 82:
                            int k4 = lVar.mo37766k(lVar.mo37779x());
                            if ((!z2 || !true) && lVar.mo37762d() > 0) {
                                this.videoClassVisualLabels_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            while (lVar.mo37762d() > 0) {
                                ((C23901n0) this.videoClassVisualLabels_).mo37933h(lVar.mo37775t());
                            }
                            lVar.mo37765j(k4);
                            break;
                        case 88:
                            if (!z2 || !true) {
                                this.videoClassVisualExceeds_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            ((C23901n0) this.videoClassVisualExceeds_).mo37933h(lVar.mo37775t());
                            break;
                        case 90:
                            int k5 = lVar.mo37766k(lVar.mo37779x());
                            if ((!z2 || !true) && lVar.mo37762d() > 0) {
                                this.videoClassVisualExceeds_ = C23872m0.newIntList();
                                z2 |= true;
                            }
                            while (lVar.mo37762d() > 0) {
                                ((C23901n0) this.videoClassVisualExceeds_).mo37933h(lVar.mo37775t());
                            }
                            lVar.mo37765j(k5);
                            break;
                        default:
                            if (parseUnknownField(lVar, b, a0Var, F)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    if (z2 && true) {
                        ((C23817d) this.videoClassAudioLabels_).f68221d = false;
                    }
                    if (z2 && true) {
                        ((C23817d) this.imageClassLabels_).f68221d = false;
                    }
                    if (z2 && true) {
                        ((C23817d) this.imageClassExceeds_).f68221d = false;
                    }
                    if (z2 && true) {
                        ((C23817d) this.videoClassVisualLabels_).f68221d = false;
                    }
                    if (z2 && true) {
                        ((C23817d) this.videoClassVisualExceeds_).f68221d = false;
                    }
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                ((C23817d) this.videoClassAudioLabels_).f68221d = false;
            }
            if (z2 && true) {
                ((C23817d) this.imageClassLabels_).f68221d = false;
            }
            if (z2 && true) {
                ((C23817d) this.imageClassExceeds_).f68221d = false;
            }
            if (z2 && true) {
                ((C23817d) this.videoClassVisualLabels_).f68221d = false;
            }
            if (z2 && true) {
                ((C23817d) this.videoClassVisualExceeds_).f68221d = false;
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }
    }

    public interface MJAnalyticsAssetOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        String getAiTags();

        C16994k getAiTagsBytes();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        String getAspectRatio();

        C16994k getAspectRatioBytes();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        long getDurationMs();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        int getImageClassExceeds(int i);

        int getImageClassExceedsCount();

        List<Integer> getImageClassExceedsList();

        int getImageClassLabels(int i);

        int getImageClassLabelsCount();

        List<Integer> getImageClassLabelsList();

        /* synthetic */ String getInitializationErrorString();

        boolean getIsOverThreshold();

        MJAnalyticsMediaType getMediaType();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        String getOriginId();

        C16994k getOriginIdBytes();

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        int getVideoClassAudioLabels(int i);

        int getVideoClassAudioLabelsCount();

        List<Integer> getVideoClassAudioLabelsList();

        int getVideoClassVisualExceeds(int i);

        int getVideoClassVisualExceedsCount();

        List<Integer> getVideoClassVisualExceedsList();

        int getVideoClassVisualLabels(int i);

        int getVideoClassVisualLabelsCount();

        List<Integer> getVideoClassVisualLabelsList();

        boolean hasAiTags();

        boolean hasAspectRatio();

        boolean hasDurationMs();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        boolean hasIsOverThreshold();

        boolean hasMediaType();

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasOriginId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MJAnalyticsEvent extends C23872m0 implements MJAnalyticsEventOrBuilder {
        private static final MJAnalyticsEvent DEFAULT_INSTANCE = new MJAnalyticsEvent();
        public static final int ERROR_CODE_FIELD_NUMBER = 2;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
        public static final int EXPANDS_FIELD_NUMBER = 6;
        public static final int KEYS_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        @Deprecated
        public static final C24062w1<MJAnalyticsEvent> PARSER = new C23813c<MJAnalyticsEvent>() {
            public MJAnalyticsEvent parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new MJAnalyticsEvent(lVar, a0Var);
            }
        };
        public static final int TIME_STAMP_FIELD_NUMBER = 7;
        public static final int VALUES_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public volatile Object errorCode_;
        /* access modifiers changed from: private */
        public volatile Object errorMessage_;
        /* access modifiers changed from: private */
        public C24048u0 expands_;
        /* access modifiers changed from: private */
        public C24048u0 keys_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object name_;
        /* access modifiers changed from: private */
        public long timeStamp_;
        /* access modifiers changed from: private */
        public C24048u0 values_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements MJAnalyticsEventOrBuilder {
            private int bitField0_;
            private Object errorCode_;
            private Object errorMessage_;
            private C24048u0 expands_;
            private C24048u0 keys_;
            private Object name_;
            private long timeStamp_;
            private C24048u0 values_;

            private void ensureExpandsIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.expands_ = new C24044t0(this.expands_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureKeysIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.keys_ = new C24044t0(this.keys_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureValuesIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.values_ = new C24044t0(this.values_);
                    this.bitField0_ |= 16;
                }
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJAnalyticsS12.internal_static_MJAnalyticsEvent_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder addAllExpands(Iterable<String> iterable) {
                ensureExpandsIsMutable();
                C23810b.C23811a.addAll(iterable, this.expands_);
                onChanged();
                return this;
            }

            public Builder addAllKeys(Iterable<String> iterable) {
                ensureKeysIsMutable();
                C23810b.C23811a.addAll(iterable, this.keys_);
                onChanged();
                return this;
            }

            public Builder addAllValues(Iterable<String> iterable) {
                ensureValuesIsMutable();
                C23810b.C23811a.addAll(iterable, this.values_);
                onChanged();
                return this;
            }

            public Builder addExpands(String str) {
                str.getClass();
                ensureExpandsIsMutable();
                this.expands_.add(str);
                onChanged();
                return this;
            }

            public Builder addExpandsBytes(C16994k kVar) {
                kVar.getClass();
                ensureExpandsIsMutable();
                this.expands_.mo38353g(kVar);
                onChanged();
                return this;
            }

            public Builder addKeys(String str) {
                str.getClass();
                ensureKeysIsMutable();
                this.keys_.add(str);
                onChanged();
                return this;
            }

            public Builder addKeysBytes(C16994k kVar) {
                kVar.getClass();
                ensureKeysIsMutable();
                this.keys_.mo38353g(kVar);
                onChanged();
                return this;
            }

            public Builder addValues(String str) {
                str.getClass();
                ensureValuesIsMutable();
                this.values_.add(str);
                onChanged();
                return this;
            }

            public Builder addValuesBytes(C16994k kVar) {
                kVar.getClass();
                ensureValuesIsMutable();
                this.values_.mo38353g(kVar);
                onChanged();
                return this;
            }

            public Builder clearErrorCode() {
                this.bitField0_ &= -3;
                this.errorCode_ = MJAnalyticsEvent.getDefaultInstance().getErrorCode();
                onChanged();
                return this;
            }

            public Builder clearErrorMessage() {
                this.bitField0_ &= -5;
                this.errorMessage_ = MJAnalyticsEvent.getDefaultInstance().getErrorMessage();
                onChanged();
                return this;
            }

            public Builder clearExpands() {
                this.expands_ = C24044t0.f69157f;
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearKeys() {
                this.keys_ = C24044t0.f69157f;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= -2;
                this.name_ = MJAnalyticsEvent.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearTimeStamp() {
                this.bitField0_ &= -65;
                this.timeStamp_ = 0;
                onChanged();
                return this;
            }

            public Builder clearValues() {
                this.values_ = C24044t0.f69157f;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJAnalyticsS12.internal_static_MJAnalyticsEvent_descriptor;
            }

            public String getErrorCode() {
                Object obj = this.errorCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.errorCode_ = u;
                }
                return u;
            }

            public C16994k getErrorCodeBytes() {
                Object obj = this.errorCode_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.errorCode_ = k;
                return k;
            }

            public String getErrorMessage() {
                Object obj = this.errorMessage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.errorMessage_ = u;
                }
                return u;
            }

            public C16994k getErrorMessageBytes() {
                Object obj = this.errorMessage_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.errorMessage_ = k;
                return k;
            }

            public String getExpands(int i) {
                return (String) this.expands_.get(i);
            }

            public C16994k getExpandsBytes(int i) {
                return this.expands_.mo38352e(i);
            }

            public int getExpandsCount() {
                return this.expands_.size();
            }

            public String getKeys(int i) {
                return (String) this.keys_.get(i);
            }

            public C16994k getKeysBytes(int i) {
                return this.keys_.mo38352e(i);
            }

            public int getKeysCount() {
                return this.keys_.size();
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.name_ = u;
                }
                return u;
            }

            public C16994k getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.name_ = k;
                return k;
            }

            public long getTimeStamp() {
                return this.timeStamp_;
            }

            public String getValues(int i) {
                return (String) this.values_.get(i);
            }

            public C16994k getValuesBytes(int i) {
                return this.values_.mo38352e(i);
            }

            public int getValuesCount() {
                return this.values_.size();
            }

            public boolean hasErrorCode() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasErrorMessage() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasTimeStamp() {
                return (this.bitField0_ & 64) != 0;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$100 = MJAnalyticsS12.internal_static_MJAnalyticsEvent_fieldAccessorTable;
                access$100.mo37875c(MJAnalyticsEvent.class, Builder.class);
                return access$100;
            }

            public final boolean isInitialized() {
                return hasName() && hasTimeStamp();
            }

            public Builder setErrorCode(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.errorCode_ = str;
                onChanged();
                return this;
            }

            public Builder setErrorCodeBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 2;
                this.errorCode_ = kVar;
                onChanged();
                return this;
            }

            public Builder setErrorMessage(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.errorMessage_ = str;
                onChanged();
                return this;
            }

            public Builder setErrorMessageBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 4;
                this.errorMessage_ = kVar;
                onChanged();
                return this;
            }

            public Builder setExpands(int i, String str) {
                str.getClass();
                ensureExpandsIsMutable();
                this.expands_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setKeys(int i, String str) {
                str.getClass();
                ensureKeysIsMutable();
                this.keys_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 1;
                this.name_ = kVar;
                onChanged();
                return this;
            }

            public Builder setTimeStamp(long j) {
                this.bitField0_ |= 64;
                this.timeStamp_ = j;
                onChanged();
                return this;
            }

            public Builder setValues(int i, String str) {
                str.getClass();
                ensureValuesIsMutable();
                this.values_.set(i, str);
                onChanged();
                return this;
            }

            public C55062b2 getExpandsList() {
                return this.expands_.mo38349a();
            }

            public C55062b2 getKeysList() {
                return this.keys_.mo38349a();
            }

            public C55062b2 getValuesList() {
                return this.values_.mo38349a();
            }

            private Builder() {
                this.name_ = "";
                this.errorCode_ = "";
                this.errorMessage_ = "";
                C24048u0 u0Var = C24044t0.f69157f;
                this.keys_ = u0Var;
                this.values_ = u0Var;
                this.expands_ = u0Var;
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public MJAnalyticsEvent build() {
                MJAnalyticsEvent buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public MJAnalyticsEvent buildPartial() {
                MJAnalyticsEvent mJAnalyticsEvent = new MJAnalyticsEvent((C23872m0.C23874b) this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 0 ? 1 : 0;
                Object unused = mJAnalyticsEvent.name_ = this.name_;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                Object unused2 = mJAnalyticsEvent.errorCode_ = this.errorCode_;
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                Object unused3 = mJAnalyticsEvent.errorMessage_ = this.errorMessage_;
                if ((this.bitField0_ & 8) != 0) {
                    this.keys_ = this.keys_.mo38349a();
                    this.bitField0_ &= -9;
                }
                C24048u0 unused4 = mJAnalyticsEvent.keys_ = this.keys_;
                if ((this.bitField0_ & 16) != 0) {
                    this.values_ = this.values_.mo38349a();
                    this.bitField0_ &= -17;
                }
                C24048u0 unused5 = mJAnalyticsEvent.values_ = this.values_;
                if ((this.bitField0_ & 32) != 0) {
                    this.expands_ = this.expands_.mo38349a();
                    this.bitField0_ &= -33;
                }
                C24048u0 unused6 = mJAnalyticsEvent.expands_ = this.expands_;
                if ((i & 64) != 0) {
                    long unused7 = mJAnalyticsEvent.timeStamp_ = this.timeStamp_;
                    i2 |= 8;
                }
                int unused8 = mJAnalyticsEvent.bitField0_ = i2;
                onBuilt();
                return mJAnalyticsEvent;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public MJAnalyticsEvent getDefaultInstanceForType() {
                return MJAnalyticsEvent.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.errorCode_ = "";
                this.errorMessage_ = "";
                int i = this.bitField0_ & -2 & -3 & -5;
                this.bitField0_ = i;
                C24048u0 u0Var = C24044t0.f69157f;
                this.keys_ = u0Var;
                this.values_ = u0Var;
                this.expands_ = u0Var;
                this.timeStamp_ = 0;
                this.bitField0_ = i & -9 & -17 & -33 & -65;
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof MJAnalyticsEvent) {
                    return mergeFrom((MJAnalyticsEvent) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder mergeFrom(MJAnalyticsEvent mJAnalyticsEvent) {
                if (mJAnalyticsEvent == MJAnalyticsEvent.getDefaultInstance()) {
                    return this;
                }
                if (mJAnalyticsEvent.hasName()) {
                    this.bitField0_ |= 1;
                    this.name_ = mJAnalyticsEvent.name_;
                    onChanged();
                }
                if (mJAnalyticsEvent.hasErrorCode()) {
                    this.bitField0_ |= 2;
                    this.errorCode_ = mJAnalyticsEvent.errorCode_;
                    onChanged();
                }
                if (mJAnalyticsEvent.hasErrorMessage()) {
                    this.bitField0_ |= 4;
                    this.errorMessage_ = mJAnalyticsEvent.errorMessage_;
                    onChanged();
                }
                if (!mJAnalyticsEvent.keys_.isEmpty()) {
                    if (this.keys_.isEmpty()) {
                        this.keys_ = mJAnalyticsEvent.keys_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureKeysIsMutable();
                        this.keys_.addAll(mJAnalyticsEvent.keys_);
                    }
                    onChanged();
                }
                if (!mJAnalyticsEvent.values_.isEmpty()) {
                    if (this.values_.isEmpty()) {
                        this.values_ = mJAnalyticsEvent.values_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureValuesIsMutable();
                        this.values_.addAll(mJAnalyticsEvent.values_);
                    }
                    onChanged();
                }
                if (!mJAnalyticsEvent.expands_.isEmpty()) {
                    if (this.expands_.isEmpty()) {
                        this.expands_ = mJAnalyticsEvent.expands_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureExpandsIsMutable();
                        this.expands_.addAll(mJAnalyticsEvent.expands_);
                    }
                    onChanged();
                }
                if (mJAnalyticsEvent.hasTimeStamp()) {
                    setTimeStamp(mJAnalyticsEvent.getTimeStamp());
                }
                mergeUnknownFields(mJAnalyticsEvent.unknownFields);
                onChanged();
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.name_ = "";
                this.errorCode_ = "";
                this.errorMessage_ = "";
                C24048u0 u0Var = C24044t0.f69157f;
                this.keys_ = u0Var;
                this.values_ = u0Var;
                this.expands_ = u0Var;
                maybeForceBuilderInitialization();
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x001f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsEvent.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1<com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsEvent> r1 = com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsEvent.PARSER     // Catch:{ p0 -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0011 }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsEvent r3 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsEvent) r3     // Catch:{ p0 -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsEvent) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001d
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x000f }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsEvent r4 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsEvent) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001b }
                    throw r3     // Catch:{ all -> 0x001b }
                L_0x001b:
                    r3 = move-exception
                    r0 = r4
                L_0x001d:
                    if (r0 == 0) goto L_0x0022
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsEvent) r0)
                L_0x0022:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsEvent.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsEvent$Builder");
            }
        }

        public static MJAnalyticsEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJAnalyticsS12.internal_static_MJAnalyticsEvent_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MJAnalyticsEvent parseDelimitedFrom(InputStream inputStream) {
            return (MJAnalyticsEvent) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsEvent parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<MJAnalyticsEvent> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MJAnalyticsEvent)) {
                return super.equals(obj);
            }
            MJAnalyticsEvent mJAnalyticsEvent = (MJAnalyticsEvent) obj;
            if (hasName() != mJAnalyticsEvent.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(mJAnalyticsEvent.getName())) || hasErrorCode() != mJAnalyticsEvent.hasErrorCode()) {
                return false;
            }
            if ((hasErrorCode() && !getErrorCode().equals(mJAnalyticsEvent.getErrorCode())) || hasErrorMessage() != mJAnalyticsEvent.hasErrorMessage()) {
                return false;
            }
            if ((!hasErrorMessage() || getErrorMessage().equals(mJAnalyticsEvent.getErrorMessage())) && getKeysList().equals(mJAnalyticsEvent.getKeysList()) && getValuesList().equals(mJAnalyticsEvent.getValuesList()) && getExpandsList().equals(mJAnalyticsEvent.getExpandsList()) && hasTimeStamp() == mJAnalyticsEvent.hasTimeStamp()) {
                return (!hasTimeStamp() || getTimeStamp() == mJAnalyticsEvent.getTimeStamp()) && this.unknownFields.equals(mJAnalyticsEvent.unknownFields);
            }
            return false;
        }

        public String getErrorCode() {
            Object obj = this.errorCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.errorCode_ = u;
            }
            return u;
        }

        public C16994k getErrorCodeBytes() {
            Object obj = this.errorCode_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.errorCode_ = k;
            return k;
        }

        public String getErrorMessage() {
            Object obj = this.errorMessage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.errorMessage_ = u;
            }
            return u;
        }

        public C16994k getErrorMessageBytes() {
            Object obj = this.errorMessage_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.errorMessage_ = k;
            return k;
        }

        public String getExpands(int i) {
            return (String) this.expands_.get(i);
        }

        public C16994k getExpandsBytes(int i) {
            return this.expands_.mo38352e(i);
        }

        public int getExpandsCount() {
            return this.expands_.size();
        }

        public String getKeys(int i) {
            return (String) this.keys_.get(i);
        }

        public C16994k getKeysBytes(int i) {
            return this.keys_.mo38352e(i);
        }

        public int getKeysCount() {
            return this.keys_.size();
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.name_ = u;
            }
            return u;
        }

        public C16994k getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.name_ = k;
            return k;
        }

        public C24062w1<MJAnalyticsEvent> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? C23872m0.computeStringSize(1, this.name_) + 0 : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += C23872m0.computeStringSize(2, this.errorCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeStringSize += C23872m0.computeStringSize(3, this.errorMessage_);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.keys_.size(); i3++) {
                i2 += C23872m0.computeStringSizeNoTag(this.keys_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getKeysList().size() * 1);
            int i4 = 0;
            for (int i5 = 0; i5 < this.values_.size(); i5++) {
                i4 += C23872m0.computeStringSizeNoTag(this.values_.getRaw(i5));
            }
            int size2 = size + i4 + (getValuesList().size() * 1);
            int i6 = 0;
            for (int i7 = 0; i7 < this.expands_.size(); i7++) {
                i6 += C23872m0.computeStringSizeNoTag(this.expands_.getRaw(i7));
            }
            int size3 = size2 + i6 + (getExpandsList().size() * 1);
            if ((this.bitField0_ & 8) != 0) {
                size3 += C23897n.m29268m(7, this.timeStamp_);
            }
            int serializedSize = size3 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getTimeStamp() {
            return this.timeStamp_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public String getValues(int i) {
            return (String) this.values_.get(i);
        }

        public C16994k getValuesBytes(int i) {
            return this.values_.mo38352e(i);
        }

        public int getValuesCount() {
            return this.values_.size();
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasErrorMessage() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTimeStamp() {
            return (this.bitField0_ & 8) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasName()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
            }
            if (hasErrorCode()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getErrorCode().hashCode();
            }
            if (hasErrorMessage()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getErrorMessage().hashCode();
            }
            if (getKeysCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getKeysList().hashCode();
            }
            if (getValuesCount() > 0) {
                hashCode = (((hashCode * 37) + 5) * 53) + getValuesList().hashCode();
            }
            if (getExpandsCount() > 0) {
                hashCode = (((hashCode * 37) + 6) * 53) + getExpandsList().hashCode();
            }
            if (hasTimeStamp()) {
                hashCode = (((hashCode * 37) + 7) * 53) + C23908o0.m29424b(getTimeStamp());
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$100 = MJAnalyticsS12.internal_static_MJAnalyticsEvent_fieldAccessorTable;
            access$100.mo37875c(MJAnalyticsEvent.class, Builder.class);
            return access$100;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasTimeStamp()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new MJAnalyticsEvent();
        }

        public void writeTo(C23897n nVar) {
            if ((this.bitField0_ & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                C23872m0.writeString(nVar, 2, this.errorCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                C23872m0.writeString(nVar, 3, this.errorMessage_);
            }
            for (int i = 0; i < this.keys_.size(); i++) {
                C23872m0.writeString(nVar, 4, this.keys_.getRaw(i));
            }
            for (int i2 = 0; i2 < this.values_.size(); i2++) {
                C23872m0.writeString(nVar, 5, this.values_.getRaw(i2));
            }
            for (int i3 = 0; i3 < this.expands_.size(); i3++) {
                C23872m0.writeString(nVar, 6, this.expands_.getRaw(i3));
            }
            if ((this.bitField0_ & 8) != 0) {
                nVar.mo37919Z(7, this.timeStamp_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(MJAnalyticsEvent mJAnalyticsEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mJAnalyticsEvent);
        }

        public static MJAnalyticsEvent parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        public C55062b2 getExpandsList() {
            return this.expands_;
        }

        public C55062b2 getKeysList() {
            return this.keys_;
        }

        public C55062b2 getValuesList() {
            return this.values_;
        }

        private MJAnalyticsEvent(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static MJAnalyticsEvent parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsEvent) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsEvent parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public MJAnalyticsEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MJAnalyticsEvent parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MJAnalyticsEvent() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.errorCode_ = "";
            this.errorMessage_ = "";
            C24048u0 u0Var = C24044t0.f69157f;
            this.keys_ = u0Var;
            this.values_ = u0Var;
            this.expands_ = u0Var;
        }

        public static MJAnalyticsEvent parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        public static MJAnalyticsEvent parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static MJAnalyticsEvent parseFrom(InputStream inputStream) {
            return (MJAnalyticsEvent) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsEvent parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsEvent) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsEvent parseFrom(C23856l lVar) {
            return (MJAnalyticsEvent) C23872m0.parseWithIOException(PARSER, lVar);
        }

        private MJAnalyticsEvent(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            C16994k m = lVar.mo37768m();
                            this.bitField0_ = 1 | this.bitField0_;
                            this.name_ = m;
                        } else if (F == 18) {
                            C16994k m2 = lVar.mo37768m();
                            this.bitField0_ |= 2;
                            this.errorCode_ = m2;
                        } else if (F == 26) {
                            C16994k m3 = lVar.mo37768m();
                            this.bitField0_ |= 4;
                            this.errorMessage_ = m3;
                        } else if (F == 34) {
                            C16994k m4 = lVar.mo37768m();
                            if (!z2 || !true) {
                                this.keys_ = new C24044t0();
                                z2 |= true;
                            }
                            this.keys_.mo38353g(m4);
                        } else if (F == 42) {
                            C16994k m5 = lVar.mo37768m();
                            if (!z2 || !true) {
                                this.values_ = new C24044t0();
                                z2 |= true;
                            }
                            this.values_.mo38353g(m5);
                        } else if (F == 50) {
                            C16994k m6 = lVar.mo37768m();
                            if (!z2 || !true) {
                                this.expands_ = new C24044t0();
                                z2 |= true;
                            }
                            this.expands_.mo38353g(m6);
                        } else if (F == 56) {
                            this.bitField0_ |= 8;
                            this.timeStamp_ = lVar.mo37776u();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.keys_ = this.keys_.mo38349a();
                    }
                    if (z2 && true) {
                        this.values_ = this.values_.mo38349a();
                    }
                    if (z2 && true) {
                        this.expands_ = this.expands_.mo38349a();
                    }
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.keys_ = this.keys_.mo38349a();
            }
            if (z2 && true) {
                this.values_ = this.values_.mo38349a();
            }
            if (z2 && true) {
                this.expands_ = this.expands_.mo38349a();
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static MJAnalyticsEvent parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MJAnalyticsEvent) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface MJAnalyticsEventOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        String getErrorCode();

        C16994k getErrorCodeBytes();

        String getErrorMessage();

        C16994k getErrorMessageBytes();

        String getExpands(int i);

        C16994k getExpandsBytes(int i);

        int getExpandsCount();

        List<String> getExpandsList();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        String getKeys(int i);

        C16994k getKeysBytes(int i);

        int getKeysCount();

        List<String> getKeysList();

        String getName();

        C16994k getNameBytes();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        long getTimeStamp();

        /* synthetic */ C24020s2 getUnknownFields();

        String getValues(int i);

        C16994k getValuesBytes(int i);

        int getValuesCount();

        List<String> getValuesList();

        boolean hasErrorCode();

        boolean hasErrorMessage();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        boolean hasName();

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasTimeStamp();

        /* synthetic */ boolean isInitialized();
    }

    public enum MJAnalyticsMediaType implements C23908o0.C23911c {
        IMAGE(1),
        VIDEO(2);
        
        public static final int IMAGE_VALUE = 1;
        private static final MJAnalyticsMediaType[] VALUES = null;
        public static final int VIDEO_VALUE = 2;
        private static final C23908o0.C23912d<MJAnalyticsMediaType> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<MJAnalyticsMediaType>() {
                public MJAnalyticsMediaType findValueByNumber(int i) {
                    return MJAnalyticsMediaType.forNumber(i);
                }
            };
            VALUES = values();
        }

        private MJAnalyticsMediaType(int i) {
            this.value = i;
        }

        public static MJAnalyticsMediaType forNumber(int i) {
            if (i == 1) {
                return IMAGE;
            }
            if (i != 2) {
                return null;
            }
            return VIDEO;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJAnalyticsS12.getDescriptor().mo38346f().get(0);
        }

        public static C23908o0.C23912d<MJAnalyticsMediaType> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            return this.value;
        }

        public final C24025t.C24034f getValueDescriptor() {
            return getDescriptor().mo38334h().get(ordinal());
        }

        @Deprecated
        public static MJAnalyticsMediaType valueOf(int i) {
            return forNumber(i);
        }

        public static MJAnalyticsMediaType valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                return VALUES[fVar.f69097d];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class MJAnalyticsMovieSession extends C23872m0 implements MJAnalyticsMovieSessionOrBuilder {
        public static final int ASSETS_FIELD_NUMBER = 1;
        private static final MJAnalyticsMovieSession DEFAULT_INSTANCE = new MJAnalyticsMovieSession();
        public static final int EXPORT_DURATION_MS_FIELD_NUMBER = 4;
        public static final int EXPORT_MUSIC_ID_FIELD_NUMBER = 6;
        public static final int EXPORT_MUSIC_SONG_NAME_FIELD_NUMBER = 8;
        public static final int EXPORT_MUSIC_SOURCE_TYPE_FIELD_NUMBER = 9;
        public static final int EXPORT_TEMPLATE_ID_FIELD_NUMBER = 5;
        public static final int EXPORT_TEMPLATE_SOURCE_TYPE_FIELD_NUMBER = 10;
        public static final int FIXED_TEMPLATE_IDS_FIELD_NUMBER = 11;
        @Deprecated
        public static final C24062w1<MJAnalyticsMovieSession> PARSER = new C23813c<MJAnalyticsMovieSession>() {
            public MJAnalyticsMovieSession parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new MJAnalyticsMovieSession(lVar, a0Var);
            }
        };
        public static final int TEMPLATE_ACTIONS_FIELD_NUMBER = 2;
        public static final int TEMPLATE_RECOMMENDATION_FIELD_NUMBER = 7;
        public static final int TOTAL_PREVIEW_DURATION_MS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public List<MJAnalyticsAsset> assets_;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public long exportDurationMs_;
        /* access modifiers changed from: private */
        public volatile Object exportMusicId_;
        /* access modifiers changed from: private */
        public volatile Object exportMusicSongName_;
        /* access modifiers changed from: private */
        public int exportMusicSourceType_;
        /* access modifiers changed from: private */
        public volatile Object exportTemplateId_;
        /* access modifiers changed from: private */
        public int exportTemplateSourceType_;
        /* access modifiers changed from: private */
        public C24048u0 fixedTemplateIds_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public List<MJAnalyticsPreviewTemplateAction> templateActions_;
        /* access modifiers changed from: private */
        public MJAnalyticsTemplateRecommendation templateRecommendation_;
        /* access modifiers changed from: private */
        public long totalPreviewDurationMs_;

        public static final class Builder extends C23872m0.C23874b<Builder> implements MJAnalyticsMovieSessionOrBuilder {
            private C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> assetsBuilder_;
            private List<MJAnalyticsAsset> assets_;
            private int bitField0_;
            private long exportDurationMs_;
            private Object exportMusicId_;
            private Object exportMusicSongName_;
            private int exportMusicSourceType_;
            private Object exportTemplateId_;
            private int exportTemplateSourceType_;
            private C24048u0 fixedTemplateIds_;
            private C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> templateActionsBuilder_;
            private List<MJAnalyticsPreviewTemplateAction> templateActions_;
            private C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> templateRecommendationBuilder_;
            private MJAnalyticsTemplateRecommendation templateRecommendation_;
            private long totalPreviewDurationMs_;

            private void ensureAssetsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.assets_ = new ArrayList(this.assets_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureFixedTemplateIdsIsMutable() {
                if ((this.bitField0_ & 1024) == 0) {
                    this.fixedTemplateIds_ = new C24044t0(this.fixedTemplateIds_);
                    this.bitField0_ |= 1024;
                }
            }

            private void ensureTemplateActionsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.templateActions_ = new ArrayList(this.templateActions_);
                    this.bitField0_ |= 2;
                }
            }

            private C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> getAssetsFieldBuilder() {
                if (this.assetsBuilder_ == null) {
                    List<MJAnalyticsAsset> list = this.assets_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.assetsBuilder_ = new C23821e2<>(list, z, getParentForChildren(), isClean());
                    this.assets_ = null;
                }
                return this.assetsBuilder_;
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJAnalyticsS12.internal_static_MJAnalyticsMovieSession_descriptor;
            }

            private C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> getTemplateActionsFieldBuilder() {
                if (this.templateActionsBuilder_ == null) {
                    this.templateActionsBuilder_ = new C23821e2<>(this.templateActions_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.templateActions_ = null;
                }
                return this.templateActionsBuilder_;
            }

            private C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> getTemplateRecommendationFieldBuilder() {
                if (this.templateRecommendationBuilder_ == null) {
                    this.templateRecommendationBuilder_ = new C23844i2<>(getTemplateRecommendation(), getParentForChildren(), isClean());
                    this.templateRecommendation_ = null;
                }
                return this.templateRecommendationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (C23872m0.alwaysUseFieldBuilders) {
                    getAssetsFieldBuilder();
                    getTemplateActionsFieldBuilder();
                    getTemplateRecommendationFieldBuilder();
                }
            }

            public Builder addAllAssets(Iterable<? extends MJAnalyticsAsset> iterable) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    ensureAssetsIsMutable();
                    C23810b.C23811a.addAll(iterable, this.assets_);
                    onChanged();
                } else {
                    e2Var.mo37578b(iterable);
                }
                return this;
            }

            public Builder addAllFixedTemplateIds(Iterable<String> iterable) {
                ensureFixedTemplateIdsIsMutable();
                C23810b.C23811a.addAll(iterable, this.fixedTemplateIds_);
                onChanged();
                return this;
            }

            public Builder addAllTemplateActions(Iterable<? extends MJAnalyticsPreviewTemplateAction> iterable) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    ensureTemplateActionsIsMutable();
                    C23810b.C23811a.addAll(iterable, this.templateActions_);
                    onChanged();
                } else {
                    e2Var.mo37578b(iterable);
                }
                return this;
            }

            public Builder addAssets(MJAnalyticsAsset mJAnalyticsAsset) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsAsset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.add(mJAnalyticsAsset);
                    onChanged();
                } else {
                    e2Var.mo37582f(mJAnalyticsAsset);
                }
                return this;
            }

            public MJAnalyticsAsset.Builder addAssetsBuilder() {
                return getAssetsFieldBuilder().mo37580d(MJAnalyticsAsset.getDefaultInstance());
            }

            public Builder addFixedTemplateIds(String str) {
                str.getClass();
                ensureFixedTemplateIdsIsMutable();
                this.fixedTemplateIds_.add(str);
                onChanged();
                return this;
            }

            public Builder addFixedTemplateIdsBytes(C16994k kVar) {
                kVar.getClass();
                ensureFixedTemplateIdsIsMutable();
                this.fixedTemplateIds_.mo38353g(kVar);
                onChanged();
                return this;
            }

            public Builder addTemplateActions(MJAnalyticsPreviewTemplateAction mJAnalyticsPreviewTemplateAction) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsPreviewTemplateAction.getClass();
                    ensureTemplateActionsIsMutable();
                    this.templateActions_.add(mJAnalyticsPreviewTemplateAction);
                    onChanged();
                } else {
                    e2Var.mo37582f(mJAnalyticsPreviewTemplateAction);
                }
                return this;
            }

            public MJAnalyticsPreviewTemplateAction.Builder addTemplateActionsBuilder() {
                return getTemplateActionsFieldBuilder().mo37580d(MJAnalyticsPreviewTemplateAction.getDefaultInstance());
            }

            public Builder clearAssets() {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    this.assets_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder clearExportDurationMs() {
                this.bitField0_ &= -9;
                this.exportDurationMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExportMusicId() {
                this.bitField0_ &= -33;
                this.exportMusicId_ = MJAnalyticsMovieSession.getDefaultInstance().getExportMusicId();
                onChanged();
                return this;
            }

            public Builder clearExportMusicSongName() {
                this.bitField0_ &= -129;
                this.exportMusicSongName_ = MJAnalyticsMovieSession.getDefaultInstance().getExportMusicSongName();
                onChanged();
                return this;
            }

            public Builder clearExportMusicSourceType() {
                this.bitField0_ &= -257;
                this.exportMusicSourceType_ = 1;
                onChanged();
                return this;
            }

            public Builder clearExportTemplateId() {
                this.bitField0_ &= -17;
                this.exportTemplateId_ = MJAnalyticsMovieSession.getDefaultInstance().getExportTemplateId();
                onChanged();
                return this;
            }

            public Builder clearExportTemplateSourceType() {
                this.bitField0_ &= -513;
                this.exportTemplateSourceType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFixedTemplateIds() {
                this.fixedTemplateIds_ = C24044t0.f69157f;
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder clearTemplateActions() {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    this.templateActions_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder clearTemplateRecommendation() {
                C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> i2Var = this.templateRecommendationBuilder_;
                if (i2Var == null) {
                    this.templateRecommendation_ = null;
                    onChanged();
                } else {
                    i2Var.mo37704c();
                }
                this.bitField0_ &= -65;
                return this;
            }

            public Builder clearTotalPreviewDurationMs() {
                this.bitField0_ &= -5;
                this.totalPreviewDurationMs_ = 0;
                onChanged();
                return this;
            }

            public MJAnalyticsAsset getAssets(int i) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                return e2Var == null ? this.assets_.get(i) : e2Var.mo37590n(i, false);
            }

            public MJAnalyticsAsset.Builder getAssetsBuilder(int i) {
                return getAssetsFieldBuilder().mo37587k(i);
            }

            public List<MJAnalyticsAsset.Builder> getAssetsBuilderList() {
                return getAssetsFieldBuilder().mo37588l();
            }

            public int getAssetsCount() {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                return e2Var == null ? this.assets_.size() : e2Var.mo37589m();
            }

            public List<MJAnalyticsAsset> getAssetsList() {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                return e2Var == null ? Collections.unmodifiableList(this.assets_) : e2Var.mo37591o();
            }

            public MJAnalyticsAssetOrBuilder getAssetsOrBuilder(int i) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                return e2Var == null ? this.assets_.get(i) : e2Var.mo37592p(i);
            }

            public List<? extends MJAnalyticsAssetOrBuilder> getAssetsOrBuilderList() {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                return e2Var != null ? e2Var.mo37593q() : Collections.unmodifiableList(this.assets_);
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJAnalyticsS12.internal_static_MJAnalyticsMovieSession_descriptor;
            }

            public long getExportDurationMs() {
                return this.exportDurationMs_;
            }

            public String getExportMusicId() {
                Object obj = this.exportMusicId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.exportMusicId_ = u;
                }
                return u;
            }

            public C16994k getExportMusicIdBytes() {
                Object obj = this.exportMusicId_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.exportMusicId_ = k;
                return k;
            }

            public String getExportMusicSongName() {
                Object obj = this.exportMusicSongName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.exportMusicSongName_ = u;
                }
                return u;
            }

            public C16994k getExportMusicSongNameBytes() {
                Object obj = this.exportMusicSongName_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.exportMusicSongName_ = k;
                return k;
            }

            public MJAnalyticsMusicSourceType getExportMusicSourceType() {
                MJAnalyticsMusicSourceType valueOf = MJAnalyticsMusicSourceType.valueOf(this.exportMusicSourceType_);
                return valueOf == null ? MJAnalyticsMusicSourceType.RECOMMEND : valueOf;
            }

            public String getExportTemplateId() {
                Object obj = this.exportTemplateId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.exportTemplateId_ = u;
                }
                return u;
            }

            public C16994k getExportTemplateIdBytes() {
                Object obj = this.exportTemplateId_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.exportTemplateId_ = k;
                return k;
            }

            public MJAnalyticsTemplateSourceType getExportTemplateSourceType() {
                MJAnalyticsTemplateSourceType valueOf = MJAnalyticsTemplateSourceType.valueOf(this.exportTemplateSourceType_);
                return valueOf == null ? MJAnalyticsTemplateSourceType.UNKNOWN : valueOf;
            }

            public String getFixedTemplateIds(int i) {
                return (String) this.fixedTemplateIds_.get(i);
            }

            public C16994k getFixedTemplateIdsBytes(int i) {
                return this.fixedTemplateIds_.mo38352e(i);
            }

            public int getFixedTemplateIdsCount() {
                return this.fixedTemplateIds_.size();
            }

            public MJAnalyticsPreviewTemplateAction getTemplateActions(int i) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                return e2Var == null ? this.templateActions_.get(i) : e2Var.mo37590n(i, false);
            }

            public MJAnalyticsPreviewTemplateAction.Builder getTemplateActionsBuilder(int i) {
                return getTemplateActionsFieldBuilder().mo37587k(i);
            }

            public List<MJAnalyticsPreviewTemplateAction.Builder> getTemplateActionsBuilderList() {
                return getTemplateActionsFieldBuilder().mo37588l();
            }

            public int getTemplateActionsCount() {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                return e2Var == null ? this.templateActions_.size() : e2Var.mo37589m();
            }

            public List<MJAnalyticsPreviewTemplateAction> getTemplateActionsList() {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                return e2Var == null ? Collections.unmodifiableList(this.templateActions_) : e2Var.mo37591o();
            }

            public MJAnalyticsPreviewTemplateActionOrBuilder getTemplateActionsOrBuilder(int i) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                return e2Var == null ? this.templateActions_.get(i) : e2Var.mo37592p(i);
            }

            public List<? extends MJAnalyticsPreviewTemplateActionOrBuilder> getTemplateActionsOrBuilderList() {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                return e2Var != null ? e2Var.mo37593q() : Collections.unmodifiableList(this.templateActions_);
            }

            public MJAnalyticsTemplateRecommendation getTemplateRecommendation() {
                C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> i2Var = this.templateRecommendationBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37706e();
                }
                MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation = this.templateRecommendation_;
                return mJAnalyticsTemplateRecommendation == null ? MJAnalyticsTemplateRecommendation.getDefaultInstance() : mJAnalyticsTemplateRecommendation;
            }

            public MJAnalyticsTemplateRecommendation.Builder getTemplateRecommendationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return getTemplateRecommendationFieldBuilder().mo37705d();
            }

            public MJAnalyticsTemplateRecommendationOrBuilder getTemplateRecommendationOrBuilder() {
                C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> i2Var = this.templateRecommendationBuilder_;
                if (i2Var != null) {
                    return i2Var.mo37707f();
                }
                MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation = this.templateRecommendation_;
                return mJAnalyticsTemplateRecommendation == null ? MJAnalyticsTemplateRecommendation.getDefaultInstance() : mJAnalyticsTemplateRecommendation;
            }

            public long getTotalPreviewDurationMs() {
                return this.totalPreviewDurationMs_;
            }

            public boolean hasExportDurationMs() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasExportMusicId() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasExportMusicSongName() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasExportMusicSourceType() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasExportTemplateId() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasExportTemplateSourceType() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasTemplateRecommendation() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasTotalPreviewDurationMs() {
                return (this.bitField0_ & 4) != 0;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$9900 = MJAnalyticsS12.internal_static_MJAnalyticsMovieSession_fieldAccessorTable;
                access$9900.mo37875c(MJAnalyticsMovieSession.class, Builder.class);
                return access$9900;
            }

            public final boolean isInitialized() {
                for (int i = 0; i < getAssetsCount(); i++) {
                    if (!getAssets(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeTemplateRecommendation(MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation) {
                MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation2;
                C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> i2Var = this.templateRecommendationBuilder_;
                if (i2Var == null) {
                    if ((this.bitField0_ & 64) == 0 || (mJAnalyticsTemplateRecommendation2 = this.templateRecommendation_) == null || mJAnalyticsTemplateRecommendation2 == MJAnalyticsTemplateRecommendation.getDefaultInstance()) {
                        this.templateRecommendation_ = mJAnalyticsTemplateRecommendation;
                    } else {
                        this.templateRecommendation_ = MJAnalyticsTemplateRecommendation.newBuilder(this.templateRecommendation_).mergeFrom(mJAnalyticsTemplateRecommendation).buildPartial();
                    }
                    onChanged();
                } else {
                    i2Var.mo37708g(mJAnalyticsTemplateRecommendation);
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder removeAssets(int i) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    ensureAssetsIsMutable();
                    this.assets_.remove(i);
                    onChanged();
                } else {
                    e2Var.mo37597u(i);
                }
                return this;
            }

            public Builder removeTemplateActions(int i) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    ensureTemplateActionsIsMutable();
                    this.templateActions_.remove(i);
                    onChanged();
                } else {
                    e2Var.mo37597u(i);
                }
                return this;
            }

            public Builder setAssets(int i, MJAnalyticsAsset mJAnalyticsAsset) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsAsset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.set(i, mJAnalyticsAsset);
                    onChanged();
                } else {
                    e2Var.mo37598v(i, mJAnalyticsAsset);
                }
                return this;
            }

            public Builder setExportDurationMs(long j) {
                this.bitField0_ |= 8;
                this.exportDurationMs_ = j;
                onChanged();
                return this;
            }

            public Builder setExportMusicId(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.exportMusicId_ = str;
                onChanged();
                return this;
            }

            public Builder setExportMusicIdBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 32;
                this.exportMusicId_ = kVar;
                onChanged();
                return this;
            }

            public Builder setExportMusicSongName(String str) {
                str.getClass();
                this.bitField0_ |= 128;
                this.exportMusicSongName_ = str;
                onChanged();
                return this;
            }

            public Builder setExportMusicSongNameBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 128;
                this.exportMusicSongName_ = kVar;
                onChanged();
                return this;
            }

            public Builder setExportMusicSourceType(MJAnalyticsMusicSourceType mJAnalyticsMusicSourceType) {
                mJAnalyticsMusicSourceType.getClass();
                this.bitField0_ |= 256;
                this.exportMusicSourceType_ = mJAnalyticsMusicSourceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setExportTemplateId(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.exportTemplateId_ = str;
                onChanged();
                return this;
            }

            public Builder setExportTemplateIdBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 16;
                this.exportTemplateId_ = kVar;
                onChanged();
                return this;
            }

            public Builder setExportTemplateSourceType(MJAnalyticsTemplateSourceType mJAnalyticsTemplateSourceType) {
                mJAnalyticsTemplateSourceType.getClass();
                this.bitField0_ |= 512;
                this.exportTemplateSourceType_ = mJAnalyticsTemplateSourceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setFixedTemplateIds(int i, String str) {
                str.getClass();
                ensureFixedTemplateIdsIsMutable();
                this.fixedTemplateIds_.set(i, str);
                onChanged();
                return this;
            }

            public Builder setTemplateActions(int i, MJAnalyticsPreviewTemplateAction mJAnalyticsPreviewTemplateAction) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsPreviewTemplateAction.getClass();
                    ensureTemplateActionsIsMutable();
                    this.templateActions_.set(i, mJAnalyticsPreviewTemplateAction);
                    onChanged();
                } else {
                    e2Var.mo37598v(i, mJAnalyticsPreviewTemplateAction);
                }
                return this;
            }

            public Builder setTemplateRecommendation(MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation) {
                C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> i2Var = this.templateRecommendationBuilder_;
                if (i2Var == null) {
                    mJAnalyticsTemplateRecommendation.getClass();
                    this.templateRecommendation_ = mJAnalyticsTemplateRecommendation;
                    onChanged();
                } else {
                    i2Var.mo37710i(mJAnalyticsTemplateRecommendation);
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder setTotalPreviewDurationMs(long j) {
                this.bitField0_ |= 4;
                this.totalPreviewDurationMs_ = j;
                onChanged();
                return this;
            }

            public C55062b2 getFixedTemplateIdsList() {
                return this.fixedTemplateIds_.mo38349a();
            }

            private Builder() {
                this.assets_ = Collections.emptyList();
                this.templateActions_ = Collections.emptyList();
                this.exportTemplateId_ = "";
                this.exportMusicId_ = "";
                this.exportMusicSongName_ = "";
                this.exportMusicSourceType_ = 1;
                this.exportTemplateSourceType_ = 0;
                this.fixedTemplateIds_ = C24044t0.f69157f;
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public MJAnalyticsMovieSession build() {
                MJAnalyticsMovieSession buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public MJAnalyticsMovieSession buildPartial() {
                int i;
                MJAnalyticsMovieSession mJAnalyticsMovieSession = new MJAnalyticsMovieSession((C23872m0.C23874b) this);
                int i2 = this.bitField0_;
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    if ((i2 & 1) != 0) {
                        this.assets_ = Collections.unmodifiableList(this.assets_);
                        this.bitField0_ &= -2;
                    }
                    List unused = mJAnalyticsMovieSession.assets_ = this.assets_;
                } else {
                    List unused2 = mJAnalyticsMovieSession.assets_ = e2Var.mo37583g();
                }
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var2 = this.templateActionsBuilder_;
                if (e2Var2 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.templateActions_ = Collections.unmodifiableList(this.templateActions_);
                        this.bitField0_ &= -3;
                    }
                    List unused3 = mJAnalyticsMovieSession.templateActions_ = this.templateActions_;
                } else {
                    List unused4 = mJAnalyticsMovieSession.templateActions_ = e2Var2.mo37583g();
                }
                if ((i2 & 4) != 0) {
                    long unused5 = mJAnalyticsMovieSession.totalPreviewDurationMs_ = this.totalPreviewDurationMs_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 8) != 0) {
                    long unused6 = mJAnalyticsMovieSession.exportDurationMs_ = this.exportDurationMs_;
                    i |= 2;
                }
                if ((i2 & 16) != 0) {
                    i |= 4;
                }
                Object unused7 = mJAnalyticsMovieSession.exportTemplateId_ = this.exportTemplateId_;
                if ((i2 & 32) != 0) {
                    i |= 8;
                }
                Object unused8 = mJAnalyticsMovieSession.exportMusicId_ = this.exportMusicId_;
                if ((i2 & 64) != 0) {
                    C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> i2Var = this.templateRecommendationBuilder_;
                    if (i2Var == null) {
                        MJAnalyticsTemplateRecommendation unused9 = mJAnalyticsMovieSession.templateRecommendation_ = this.templateRecommendation_;
                    } else {
                        MJAnalyticsTemplateRecommendation unused10 = mJAnalyticsMovieSession.templateRecommendation_ = i2Var.mo37703b();
                    }
                    i |= 16;
                }
                if ((i2 & 128) != 0) {
                    i |= 32;
                }
                Object unused11 = mJAnalyticsMovieSession.exportMusicSongName_ = this.exportMusicSongName_;
                if ((i2 & 256) != 0) {
                    i |= 64;
                }
                int unused12 = mJAnalyticsMovieSession.exportMusicSourceType_ = this.exportMusicSourceType_;
                if ((i2 & 512) != 0) {
                    i |= 128;
                }
                int unused13 = mJAnalyticsMovieSession.exportTemplateSourceType_ = this.exportTemplateSourceType_;
                if ((this.bitField0_ & 1024) != 0) {
                    this.fixedTemplateIds_ = this.fixedTemplateIds_.mo38349a();
                    this.bitField0_ &= -1025;
                }
                C24048u0 unused14 = mJAnalyticsMovieSession.fixedTemplateIds_ = this.fixedTemplateIds_;
                int unused15 = mJAnalyticsMovieSession.bitField0_ = i;
                onBuilt();
                return mJAnalyticsMovieSession;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public MJAnalyticsMovieSession getDefaultInstanceForType() {
                return MJAnalyticsMovieSession.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public MJAnalyticsAsset.Builder addAssetsBuilder(int i) {
                return getAssetsFieldBuilder().mo37579c(i, MJAnalyticsAsset.getDefaultInstance());
            }

            public MJAnalyticsPreviewTemplateAction.Builder addTemplateActionsBuilder(int i) {
                return getTemplateActionsFieldBuilder().mo37579c(i, MJAnalyticsPreviewTemplateAction.getDefaultInstance());
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    this.assets_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    e2Var.mo37584h();
                }
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var2 = this.templateActionsBuilder_;
                if (e2Var2 == null) {
                    this.templateActions_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    e2Var2.mo37584h();
                }
                this.totalPreviewDurationMs_ = 0;
                this.exportDurationMs_ = 0;
                this.exportTemplateId_ = "";
                this.exportMusicId_ = "";
                this.bitField0_ = this.bitField0_ & -5 & -9 & -17 & -33;
                C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> i2Var = this.templateRecommendationBuilder_;
                if (i2Var == null) {
                    this.templateRecommendation_ = null;
                } else {
                    i2Var.mo37704c();
                }
                this.exportMusicSongName_ = "";
                this.exportMusicSourceType_ = 1;
                this.exportTemplateSourceType_ = 0;
                int i = this.bitField0_ & -65 & -129 & -257 & -513;
                this.bitField0_ = i;
                this.fixedTemplateIds_ = C24044t0.f69157f;
                this.bitField0_ = i & -1025;
                return this;
            }

            public Builder addAssets(int i, MJAnalyticsAsset mJAnalyticsAsset) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsAsset.getClass();
                    ensureAssetsIsMutable();
                    this.assets_.add(i, mJAnalyticsAsset);
                    onChanged();
                } else {
                    e2Var.mo37581e(i, mJAnalyticsAsset);
                }
                return this;
            }

            public Builder addTemplateActions(int i, MJAnalyticsPreviewTemplateAction mJAnalyticsPreviewTemplateAction) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsPreviewTemplateAction.getClass();
                    ensureTemplateActionsIsMutable();
                    this.templateActions_.add(i, mJAnalyticsPreviewTemplateAction);
                    onChanged();
                } else {
                    e2Var.mo37581e(i, mJAnalyticsPreviewTemplateAction);
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof MJAnalyticsMovieSession) {
                    return mergeFrom((MJAnalyticsMovieSession) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder setAssets(int i, MJAnalyticsAsset.Builder builder) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    ensureAssetsIsMutable();
                    this.assets_.set(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37598v(i, builder.build());
                }
                return this;
            }

            public Builder setTemplateActions(int i, MJAnalyticsPreviewTemplateAction.Builder builder) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    ensureTemplateActionsIsMutable();
                    this.templateActions_.set(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37598v(i, builder.build());
                }
                return this;
            }

            public Builder setTemplateRecommendation(MJAnalyticsTemplateRecommendation.Builder builder) {
                C23844i2<MJAnalyticsTemplateRecommendation, MJAnalyticsTemplateRecommendation.Builder, MJAnalyticsTemplateRecommendationOrBuilder> i2Var = this.templateRecommendationBuilder_;
                if (i2Var == null) {
                    this.templateRecommendation_ = builder.build();
                    onChanged();
                } else {
                    i2Var.mo37710i(builder.build());
                }
                this.bitField0_ |= 64;
                return this;
            }

            public Builder mergeFrom(MJAnalyticsMovieSession mJAnalyticsMovieSession) {
                if (mJAnalyticsMovieSession == MJAnalyticsMovieSession.getDefaultInstance()) {
                    return this;
                }
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = null;
                if (this.assetsBuilder_ == null) {
                    if (!mJAnalyticsMovieSession.assets_.isEmpty()) {
                        if (this.assets_.isEmpty()) {
                            this.assets_ = mJAnalyticsMovieSession.assets_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAssetsIsMutable();
                            this.assets_.addAll(mJAnalyticsMovieSession.assets_);
                        }
                        onChanged();
                    }
                } else if (!mJAnalyticsMovieSession.assets_.isEmpty()) {
                    if (this.assetsBuilder_.mo37595s()) {
                        this.assetsBuilder_.f68224a = null;
                        this.assetsBuilder_ = null;
                        this.assets_ = mJAnalyticsMovieSession.assets_;
                        this.bitField0_ &= -2;
                        this.assetsBuilder_ = C23872m0.alwaysUseFieldBuilders ? getAssetsFieldBuilder() : null;
                    } else {
                        this.assetsBuilder_.mo37578b(mJAnalyticsMovieSession.assets_);
                    }
                }
                if (this.templateActionsBuilder_ == null) {
                    if (!mJAnalyticsMovieSession.templateActions_.isEmpty()) {
                        if (this.templateActions_.isEmpty()) {
                            this.templateActions_ = mJAnalyticsMovieSession.templateActions_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureTemplateActionsIsMutable();
                            this.templateActions_.addAll(mJAnalyticsMovieSession.templateActions_);
                        }
                        onChanged();
                    }
                } else if (!mJAnalyticsMovieSession.templateActions_.isEmpty()) {
                    if (this.templateActionsBuilder_.mo37595s()) {
                        this.templateActionsBuilder_.f68224a = null;
                        this.templateActionsBuilder_ = null;
                        this.templateActions_ = mJAnalyticsMovieSession.templateActions_;
                        this.bitField0_ &= -3;
                        if (C23872m0.alwaysUseFieldBuilders) {
                            e2Var = getTemplateActionsFieldBuilder();
                        }
                        this.templateActionsBuilder_ = e2Var;
                    } else {
                        this.templateActionsBuilder_.mo37578b(mJAnalyticsMovieSession.templateActions_);
                    }
                }
                if (mJAnalyticsMovieSession.hasTotalPreviewDurationMs()) {
                    setTotalPreviewDurationMs(mJAnalyticsMovieSession.getTotalPreviewDurationMs());
                }
                if (mJAnalyticsMovieSession.hasExportDurationMs()) {
                    setExportDurationMs(mJAnalyticsMovieSession.getExportDurationMs());
                }
                if (mJAnalyticsMovieSession.hasExportTemplateId()) {
                    this.bitField0_ |= 16;
                    this.exportTemplateId_ = mJAnalyticsMovieSession.exportTemplateId_;
                    onChanged();
                }
                if (mJAnalyticsMovieSession.hasExportMusicId()) {
                    this.bitField0_ |= 32;
                    this.exportMusicId_ = mJAnalyticsMovieSession.exportMusicId_;
                    onChanged();
                }
                if (mJAnalyticsMovieSession.hasTemplateRecommendation()) {
                    mergeTemplateRecommendation(mJAnalyticsMovieSession.getTemplateRecommendation());
                }
                if (mJAnalyticsMovieSession.hasExportMusicSongName()) {
                    this.bitField0_ |= 128;
                    this.exportMusicSongName_ = mJAnalyticsMovieSession.exportMusicSongName_;
                    onChanged();
                }
                if (mJAnalyticsMovieSession.hasExportMusicSourceType()) {
                    setExportMusicSourceType(mJAnalyticsMovieSession.getExportMusicSourceType());
                }
                if (mJAnalyticsMovieSession.hasExportTemplateSourceType()) {
                    setExportTemplateSourceType(mJAnalyticsMovieSession.getExportTemplateSourceType());
                }
                if (!mJAnalyticsMovieSession.fixedTemplateIds_.isEmpty()) {
                    if (this.fixedTemplateIds_.isEmpty()) {
                        this.fixedTemplateIds_ = mJAnalyticsMovieSession.fixedTemplateIds_;
                        this.bitField0_ &= -1025;
                    } else {
                        ensureFixedTemplateIdsIsMutable();
                        this.fixedTemplateIds_.addAll(mJAnalyticsMovieSession.fixedTemplateIds_);
                    }
                    onChanged();
                }
                mergeUnknownFields(mJAnalyticsMovieSession.unknownFields);
                onChanged();
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.assets_ = Collections.emptyList();
                this.templateActions_ = Collections.emptyList();
                this.exportTemplateId_ = "";
                this.exportMusicId_ = "";
                this.exportMusicSongName_ = "";
                this.exportMusicSourceType_ = 1;
                this.exportTemplateSourceType_ = 0;
                this.fixedTemplateIds_ = C24044t0.f69157f;
                maybeForceBuilderInitialization();
            }

            public Builder addAssets(MJAnalyticsAsset.Builder builder) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    ensureAssetsIsMutable();
                    this.assets_.add(builder.build());
                    onChanged();
                } else {
                    e2Var.mo37582f(builder.build());
                }
                return this;
            }

            public Builder addTemplateActions(MJAnalyticsPreviewTemplateAction.Builder builder) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    ensureTemplateActionsIsMutable();
                    this.templateActions_.add(builder.build());
                    onChanged();
                } else {
                    e2Var.mo37582f(builder.build());
                }
                return this;
            }

            public Builder addAssets(int i, MJAnalyticsAsset.Builder builder) {
                C23821e2<MJAnalyticsAsset, MJAnalyticsAsset.Builder, MJAnalyticsAssetOrBuilder> e2Var = this.assetsBuilder_;
                if (e2Var == null) {
                    ensureAssetsIsMutable();
                    this.assets_.add(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37581e(i, builder.build());
                }
                return this;
            }

            public Builder addTemplateActions(int i, MJAnalyticsPreviewTemplateAction.Builder builder) {
                C23821e2<MJAnalyticsPreviewTemplateAction, MJAnalyticsPreviewTemplateAction.Builder, MJAnalyticsPreviewTemplateActionOrBuilder> e2Var = this.templateActionsBuilder_;
                if (e2Var == null) {
                    ensureTemplateActionsIsMutable();
                    this.templateActions_.add(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37581e(i, builder.build());
                }
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x001f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMovieSession.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1<com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMovieSession> r1 = com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMovieSession.PARSER     // Catch:{ p0 -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0011 }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMovieSession r3 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMovieSession) r3     // Catch:{ p0 -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMovieSession) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001d
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x000f }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMovieSession r4 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMovieSession) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001b }
                    throw r3     // Catch:{ all -> 0x001b }
                L_0x001b:
                    r3 = move-exception
                    r0 = r4
                L_0x001d:
                    if (r0 == 0) goto L_0x0022
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMovieSession) r0)
                L_0x0022:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMovieSession.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMovieSession$Builder");
            }
        }

        public static MJAnalyticsMovieSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJAnalyticsS12.internal_static_MJAnalyticsMovieSession_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MJAnalyticsMovieSession parseDelimitedFrom(InputStream inputStream) {
            return (MJAnalyticsMovieSession) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsMovieSession parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<MJAnalyticsMovieSession> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MJAnalyticsMovieSession)) {
                return super.equals(obj);
            }
            MJAnalyticsMovieSession mJAnalyticsMovieSession = (MJAnalyticsMovieSession) obj;
            if (!getAssetsList().equals(mJAnalyticsMovieSession.getAssetsList()) || !getTemplateActionsList().equals(mJAnalyticsMovieSession.getTemplateActionsList()) || hasTotalPreviewDurationMs() != mJAnalyticsMovieSession.hasTotalPreviewDurationMs()) {
                return false;
            }
            if ((hasTotalPreviewDurationMs() && getTotalPreviewDurationMs() != mJAnalyticsMovieSession.getTotalPreviewDurationMs()) || hasExportDurationMs() != mJAnalyticsMovieSession.hasExportDurationMs()) {
                return false;
            }
            if ((hasExportDurationMs() && getExportDurationMs() != mJAnalyticsMovieSession.getExportDurationMs()) || hasExportTemplateId() != mJAnalyticsMovieSession.hasExportTemplateId()) {
                return false;
            }
            if ((hasExportTemplateId() && !getExportTemplateId().equals(mJAnalyticsMovieSession.getExportTemplateId())) || hasExportMusicId() != mJAnalyticsMovieSession.hasExportMusicId()) {
                return false;
            }
            if ((hasExportMusicId() && !getExportMusicId().equals(mJAnalyticsMovieSession.getExportMusicId())) || hasTemplateRecommendation() != mJAnalyticsMovieSession.hasTemplateRecommendation()) {
                return false;
            }
            if ((hasTemplateRecommendation() && !getTemplateRecommendation().equals(mJAnalyticsMovieSession.getTemplateRecommendation())) || hasExportMusicSongName() != mJAnalyticsMovieSession.hasExportMusicSongName()) {
                return false;
            }
            if ((hasExportMusicSongName() && !getExportMusicSongName().equals(mJAnalyticsMovieSession.getExportMusicSongName())) || hasExportMusicSourceType() != mJAnalyticsMovieSession.hasExportMusicSourceType()) {
                return false;
            }
            if ((!hasExportMusicSourceType() || this.exportMusicSourceType_ == mJAnalyticsMovieSession.exportMusicSourceType_) && hasExportTemplateSourceType() == mJAnalyticsMovieSession.hasExportTemplateSourceType()) {
                return (!hasExportTemplateSourceType() || this.exportTemplateSourceType_ == mJAnalyticsMovieSession.exportTemplateSourceType_) && getFixedTemplateIdsList().equals(mJAnalyticsMovieSession.getFixedTemplateIdsList()) && this.unknownFields.equals(mJAnalyticsMovieSession.unknownFields);
            }
            return false;
        }

        public MJAnalyticsAsset getAssets(int i) {
            return this.assets_.get(i);
        }

        public int getAssetsCount() {
            return this.assets_.size();
        }

        public List<MJAnalyticsAsset> getAssetsList() {
            return this.assets_;
        }

        public MJAnalyticsAssetOrBuilder getAssetsOrBuilder(int i) {
            return this.assets_.get(i);
        }

        public List<? extends MJAnalyticsAssetOrBuilder> getAssetsOrBuilderList() {
            return this.assets_;
        }

        public long getExportDurationMs() {
            return this.exportDurationMs_;
        }

        public String getExportMusicId() {
            Object obj = this.exportMusicId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.exportMusicId_ = u;
            }
            return u;
        }

        public C16994k getExportMusicIdBytes() {
            Object obj = this.exportMusicId_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.exportMusicId_ = k;
            return k;
        }

        public String getExportMusicSongName() {
            Object obj = this.exportMusicSongName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.exportMusicSongName_ = u;
            }
            return u;
        }

        public C16994k getExportMusicSongNameBytes() {
            Object obj = this.exportMusicSongName_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.exportMusicSongName_ = k;
            return k;
        }

        public MJAnalyticsMusicSourceType getExportMusicSourceType() {
            MJAnalyticsMusicSourceType valueOf = MJAnalyticsMusicSourceType.valueOf(this.exportMusicSourceType_);
            return valueOf == null ? MJAnalyticsMusicSourceType.RECOMMEND : valueOf;
        }

        public String getExportTemplateId() {
            Object obj = this.exportTemplateId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.exportTemplateId_ = u;
            }
            return u;
        }

        public C16994k getExportTemplateIdBytes() {
            Object obj = this.exportTemplateId_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.exportTemplateId_ = k;
            return k;
        }

        public MJAnalyticsTemplateSourceType getExportTemplateSourceType() {
            MJAnalyticsTemplateSourceType valueOf = MJAnalyticsTemplateSourceType.valueOf(this.exportTemplateSourceType_);
            return valueOf == null ? MJAnalyticsTemplateSourceType.UNKNOWN : valueOf;
        }

        public String getFixedTemplateIds(int i) {
            return (String) this.fixedTemplateIds_.get(i);
        }

        public C16994k getFixedTemplateIdsBytes(int i) {
            return this.fixedTemplateIds_.mo38352e(i);
        }

        public int getFixedTemplateIdsCount() {
            return this.fixedTemplateIds_.size();
        }

        public C24062w1<MJAnalyticsMovieSession> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.assets_.size(); i3++) {
                i2 += C23897n.m29270o(1, this.assets_.get(i3));
            }
            for (int i4 = 0; i4 < this.templateActions_.size(); i4++) {
                i2 += C23897n.m29270o(2, this.templateActions_.get(i4));
            }
            if ((this.bitField0_ & 1) != 0) {
                i2 += C23897n.m29280y(3, this.totalPreviewDurationMs_);
            }
            if ((this.bitField0_ & 2) != 0) {
                i2 += C23897n.m29280y(4, this.exportDurationMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                i2 += C23872m0.computeStringSize(5, this.exportTemplateId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                i2 += C23872m0.computeStringSize(6, this.exportMusicId_);
            }
            if ((this.bitField0_ & 16) != 0) {
                i2 += C23897n.m29270o(7, getTemplateRecommendation());
            }
            if ((this.bitField0_ & 32) != 0) {
                i2 += C23872m0.computeStringSize(8, this.exportMusicSongName_);
            }
            if ((this.bitField0_ & 64) != 0) {
                i2 += C23897n.m29261f(9, this.exportMusicSourceType_);
            }
            if ((this.bitField0_ & 128) != 0) {
                i2 += C23897n.m29261f(10, this.exportTemplateSourceType_);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.fixedTemplateIds_.size(); i6++) {
                i5 += C23872m0.computeStringSizeNoTag(this.fixedTemplateIds_.getRaw(i6));
            }
            int size = i2 + i5 + (getFixedTemplateIdsList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
        }

        public MJAnalyticsPreviewTemplateAction getTemplateActions(int i) {
            return this.templateActions_.get(i);
        }

        public int getTemplateActionsCount() {
            return this.templateActions_.size();
        }

        public List<MJAnalyticsPreviewTemplateAction> getTemplateActionsList() {
            return this.templateActions_;
        }

        public MJAnalyticsPreviewTemplateActionOrBuilder getTemplateActionsOrBuilder(int i) {
            return this.templateActions_.get(i);
        }

        public List<? extends MJAnalyticsPreviewTemplateActionOrBuilder> getTemplateActionsOrBuilderList() {
            return this.templateActions_;
        }

        public MJAnalyticsTemplateRecommendation getTemplateRecommendation() {
            MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation = this.templateRecommendation_;
            return mJAnalyticsTemplateRecommendation == null ? MJAnalyticsTemplateRecommendation.getDefaultInstance() : mJAnalyticsTemplateRecommendation;
        }

        public MJAnalyticsTemplateRecommendationOrBuilder getTemplateRecommendationOrBuilder() {
            MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation = this.templateRecommendation_;
            return mJAnalyticsTemplateRecommendation == null ? MJAnalyticsTemplateRecommendation.getDefaultInstance() : mJAnalyticsTemplateRecommendation;
        }

        public long getTotalPreviewDurationMs() {
            return this.totalPreviewDurationMs_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasExportDurationMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasExportMusicId() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasExportMusicSongName() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasExportMusicSourceType() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasExportTemplateId() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasExportTemplateSourceType() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasTemplateRecommendation() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasTotalPreviewDurationMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (getAssetsCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getAssetsList().hashCode();
            }
            if (getTemplateActionsCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getTemplateActionsList().hashCode();
            }
            if (hasTotalPreviewDurationMs()) {
                hashCode = (((hashCode * 37) + 3) * 53) + C23908o0.m29424b(getTotalPreviewDurationMs());
            }
            if (hasExportDurationMs()) {
                hashCode = (((hashCode * 37) + 4) * 53) + C23908o0.m29424b(getExportDurationMs());
            }
            if (hasExportTemplateId()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getExportTemplateId().hashCode();
            }
            if (hasExportMusicId()) {
                hashCode = (((hashCode * 37) + 6) * 53) + getExportMusicId().hashCode();
            }
            if (hasTemplateRecommendation()) {
                hashCode = (((hashCode * 37) + 7) * 53) + getTemplateRecommendation().hashCode();
            }
            if (hasExportMusicSongName()) {
                hashCode = (((hashCode * 37) + 8) * 53) + getExportMusicSongName().hashCode();
            }
            if (hasExportMusicSourceType()) {
                hashCode = (((hashCode * 37) + 9) * 53) + this.exportMusicSourceType_;
            }
            if (hasExportTemplateSourceType()) {
                hashCode = (((hashCode * 37) + 10) * 53) + this.exportTemplateSourceType_;
            }
            if (getFixedTemplateIdsCount() > 0) {
                hashCode = (((hashCode * 37) + 11) * 53) + getFixedTemplateIdsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$9900 = MJAnalyticsS12.internal_static_MJAnalyticsMovieSession_fieldAccessorTable;
            access$9900.mo37875c(MJAnalyticsMovieSession.class, Builder.class);
            return access$9900;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < getAssetsCount(); i++) {
                if (!getAssets(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new MJAnalyticsMovieSession();
        }

        public void writeTo(C23897n nVar) {
            for (int i = 0; i < this.assets_.size(); i++) {
                nVar.mo37909P(1, this.assets_.get(i));
            }
            for (int i2 = 0; i2 < this.templateActions_.size(); i2++) {
                nVar.mo37909P(2, this.templateActions_.get(i2));
            }
            if ((this.bitField0_ & 1) != 0) {
                nVar.mo37919Z(3, this.totalPreviewDurationMs_);
            }
            if ((this.bitField0_ & 2) != 0) {
                nVar.mo37919Z(4, this.exportDurationMs_);
            }
            if ((this.bitField0_ & 4) != 0) {
                C23872m0.writeString(nVar, 5, this.exportTemplateId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                C23872m0.writeString(nVar, 6, this.exportMusicId_);
            }
            if ((this.bitField0_ & 16) != 0) {
                nVar.mo37909P(7, getTemplateRecommendation());
            }
            if ((this.bitField0_ & 32) != 0) {
                C23872m0.writeString(nVar, 8, this.exportMusicSongName_);
            }
            if ((this.bitField0_ & 64) != 0) {
                nVar.mo37907N(9, this.exportMusicSourceType_);
            }
            if ((this.bitField0_ & 128) != 0) {
                nVar.mo37907N(10, this.exportTemplateSourceType_);
            }
            for (int i3 = 0; i3 < this.fixedTemplateIds_.size(); i3++) {
                C23872m0.writeString(nVar, 11, this.fixedTemplateIds_.getRaw(i3));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static Builder newBuilder(MJAnalyticsMovieSession mJAnalyticsMovieSession) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mJAnalyticsMovieSession);
        }

        public static MJAnalyticsMovieSession parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        public C55062b2 getFixedTemplateIdsList() {
            return this.fixedTemplateIds_;
        }

        private MJAnalyticsMovieSession(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static MJAnalyticsMovieSession parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsMovieSession) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsMovieSession parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public MJAnalyticsMovieSession getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MJAnalyticsMovieSession parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MJAnalyticsMovieSession() {
            this.memoizedIsInitialized = -1;
            this.assets_ = Collections.emptyList();
            this.templateActions_ = Collections.emptyList();
            this.exportTemplateId_ = "";
            this.exportMusicId_ = "";
            this.exportMusicSongName_ = "";
            this.exportMusicSourceType_ = 1;
            this.exportTemplateSourceType_ = 0;
            this.fixedTemplateIds_ = C24044t0.f69157f;
        }

        public static MJAnalyticsMovieSession parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        public static MJAnalyticsMovieSession parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static MJAnalyticsMovieSession parseFrom(InputStream inputStream) {
            return (MJAnalyticsMovieSession) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsMovieSession parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsMovieSession) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsMovieSession parseFrom(C23856l lVar) {
            return (MJAnalyticsMovieSession) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static MJAnalyticsMovieSession parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MJAnalyticsMovieSession) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }

        private MJAnalyticsMovieSession(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    switch (F) {
                        case 0:
                            z = true;
                            break;
                        case 10:
                            if (!z2 || !true) {
                                this.assets_ = new ArrayList();
                                z2 |= true;
                            }
                            this.assets_.add((MJAnalyticsAsset) lVar.mo37777v(MJAnalyticsAsset.PARSER, a0Var));
                            break;
                        case 18:
                            if (!z2 || !true) {
                                this.templateActions_ = new ArrayList();
                                z2 |= true;
                            }
                            this.templateActions_.add((MJAnalyticsPreviewTemplateAction) lVar.mo37777v(MJAnalyticsPreviewTemplateAction.PARSER, a0Var));
                            break;
                        case 24:
                            this.bitField0_ |= 1;
                            this.totalPreviewDurationMs_ = lVar.mo37759H();
                            break;
                        case 32:
                            this.bitField0_ |= 2;
                            this.exportDurationMs_ = lVar.mo37759H();
                            break;
                        case 42:
                            C16994k m = lVar.mo37768m();
                            this.bitField0_ |= 4;
                            this.exportTemplateId_ = m;
                            break;
                        case 50:
                            C16994k m2 = lVar.mo37768m();
                            this.bitField0_ |= 8;
                            this.exportMusicId_ = m2;
                            break;
                        case 58:
                            MJAnalyticsTemplateRecommendation.Builder builder = (this.bitField0_ & 16) != 0 ? this.templateRecommendation_.toBuilder() : null;
                            MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation = (MJAnalyticsTemplateRecommendation) lVar.mo37777v(MJAnalyticsTemplateRecommendation.PARSER, a0Var);
                            this.templateRecommendation_ = mJAnalyticsTemplateRecommendation;
                            if (builder != null) {
                                builder.mergeFrom(mJAnalyticsTemplateRecommendation);
                                this.templateRecommendation_ = builder.buildPartial();
                            }
                            this.bitField0_ |= 16;
                            break;
                        case 66:
                            C16994k m3 = lVar.mo37768m();
                            this.bitField0_ |= 32;
                            this.exportMusicSongName_ = m3;
                            break;
                        case 72:
                            int o = lVar.mo37770o();
                            if (MJAnalyticsMusicSourceType.valueOf(o) != null) {
                                this.bitField0_ |= 64;
                                this.exportMusicSourceType_ = o;
                                break;
                            } else {
                                b.mo38304g(9, o);
                                break;
                            }
                        case 80:
                            int o2 = lVar.mo37770o();
                            if (MJAnalyticsTemplateSourceType.valueOf(o2) != null) {
                                this.bitField0_ |= 128;
                                this.exportTemplateSourceType_ = o2;
                                break;
                            } else {
                                b.mo38304g(10, o2);
                                break;
                            }
                        case 90:
                            C16994k m4 = lVar.mo37768m();
                            if (!z2 || !true) {
                                this.fixedTemplateIds_ = new C24044t0();
                                z2 |= true;
                            }
                            this.fixedTemplateIds_.mo38353g(m4);
                            break;
                        default:
                            if (parseUnknownField(lVar, b, a0Var, F)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.assets_ = Collections.unmodifiableList(this.assets_);
                    }
                    if (z2 && true) {
                        this.templateActions_ = Collections.unmodifiableList(this.templateActions_);
                    }
                    if (z2 && true) {
                        this.fixedTemplateIds_ = this.fixedTemplateIds_.mo38349a();
                    }
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.assets_ = Collections.unmodifiableList(this.assets_);
            }
            if (z2 && true) {
                this.templateActions_ = Collections.unmodifiableList(this.templateActions_);
            }
            if (z2 && true) {
                this.fixedTemplateIds_ = this.fixedTemplateIds_.mo38349a();
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }
    }

    public interface MJAnalyticsMovieSessionOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        MJAnalyticsAsset getAssets(int i);

        int getAssetsCount();

        List<MJAnalyticsAsset> getAssetsList();

        MJAnalyticsAssetOrBuilder getAssetsOrBuilder(int i);

        List<? extends MJAnalyticsAssetOrBuilder> getAssetsOrBuilderList();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        long getExportDurationMs();

        String getExportMusicId();

        C16994k getExportMusicIdBytes();

        String getExportMusicSongName();

        C16994k getExportMusicSongNameBytes();

        MJAnalyticsMusicSourceType getExportMusicSourceType();

        String getExportTemplateId();

        C16994k getExportTemplateIdBytes();

        MJAnalyticsTemplateSourceType getExportTemplateSourceType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        String getFixedTemplateIds(int i);

        C16994k getFixedTemplateIdsBytes(int i);

        int getFixedTemplateIdsCount();

        List<String> getFixedTemplateIdsList();

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        MJAnalyticsPreviewTemplateAction getTemplateActions(int i);

        int getTemplateActionsCount();

        List<MJAnalyticsPreviewTemplateAction> getTemplateActionsList();

        MJAnalyticsPreviewTemplateActionOrBuilder getTemplateActionsOrBuilder(int i);

        List<? extends MJAnalyticsPreviewTemplateActionOrBuilder> getTemplateActionsOrBuilderList();

        MJAnalyticsTemplateRecommendation getTemplateRecommendation();

        MJAnalyticsTemplateRecommendationOrBuilder getTemplateRecommendationOrBuilder();

        long getTotalPreviewDurationMs();

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasExportDurationMs();

        boolean hasExportMusicId();

        boolean hasExportMusicSongName();

        boolean hasExportMusicSourceType();

        boolean hasExportTemplateId();

        boolean hasExportTemplateSourceType();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasTemplateRecommendation();

        boolean hasTotalPreviewDurationMs();

        /* synthetic */ boolean isInitialized();
    }

    public enum MJAnalyticsMusicSourceType implements C23908o0.C23911c {
        RECOMMEND(1),
        TEMPLATE(2),
        NOT_FOUND(3),
        OTHERS(100);
        
        public static final int NOT_FOUND_VALUE = 3;
        public static final int OTHERS_VALUE = 100;
        public static final int RECOMMEND_VALUE = 1;
        public static final int TEMPLATE_VALUE = 2;
        private static final MJAnalyticsMusicSourceType[] VALUES = null;
        private static final C23908o0.C23912d<MJAnalyticsMusicSourceType> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<MJAnalyticsMusicSourceType>() {
                public MJAnalyticsMusicSourceType findValueByNumber(int i) {
                    return MJAnalyticsMusicSourceType.forNumber(i);
                }
            };
            VALUES = values();
        }

        private MJAnalyticsMusicSourceType(int i) {
            this.value = i;
        }

        public static MJAnalyticsMusicSourceType forNumber(int i) {
            if (i == 1) {
                return RECOMMEND;
            }
            if (i == 2) {
                return TEMPLATE;
            }
            if (i == 3) {
                return NOT_FOUND;
            }
            if (i != 100) {
                return null;
            }
            return OTHERS;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJAnalyticsS12.getDescriptor().mo38346f().get(1);
        }

        public static C23908o0.C23912d<MJAnalyticsMusicSourceType> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            return this.value;
        }

        public final C24025t.C24034f getValueDescriptor() {
            return getDescriptor().mo38334h().get(ordinal());
        }

        @Deprecated
        public static MJAnalyticsMusicSourceType valueOf(int i) {
            return forNumber(i);
        }

        public static MJAnalyticsMusicSourceType valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                return VALUES[fVar.f69097d];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class MJAnalyticsPreviewMusicAction extends C23872m0 implements MJAnalyticsPreviewMusicActionOrBuilder {
        private static final MJAnalyticsPreviewMusicAction DEFAULT_INSTANCE = new MJAnalyticsPreviewMusicAction();
        @Deprecated
        public static final C24062w1<MJAnalyticsPreviewMusicAction> PARSER = new C23813c<MJAnalyticsPreviewMusicAction>() {
            public MJAnalyticsPreviewMusicAction parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new MJAnalyticsPreviewMusicAction(lVar, a0Var);
            }
        };
        public static final int PREVIEW_DURATION_MS_FIELD_NUMBER = 4;
        public static final int PREVIEW_MUSIC_ID_FIELD_NUMBER = 1;
        public static final int PREVIEW_MUSIC_SONG_NAME_FIELD_NUMBER = 3;
        public static final int PREVIEW_MUSIC_SOURCE_TYPE_FIELD_NUMBER = 2;
        public static final int TIMELINE_DURATION_MS_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public long previewDurationMs_;
        /* access modifiers changed from: private */
        public volatile Object previewMusicId_;
        /* access modifiers changed from: private */
        public volatile Object previewMusicSongName_;
        /* access modifiers changed from: private */
        public int previewMusicSourceType_;
        /* access modifiers changed from: private */
        public long timelineDurationMs_;

        public static MJAnalyticsPreviewMusicAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJAnalyticsS12.internal_static_MJAnalyticsPreviewMusicAction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MJAnalyticsPreviewMusicAction parseDelimitedFrom(InputStream inputStream) {
            return (MJAnalyticsPreviewMusicAction) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<MJAnalyticsPreviewMusicAction> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MJAnalyticsPreviewMusicAction)) {
                return super.equals(obj);
            }
            MJAnalyticsPreviewMusicAction mJAnalyticsPreviewMusicAction = (MJAnalyticsPreviewMusicAction) obj;
            if (hasPreviewMusicId() != mJAnalyticsPreviewMusicAction.hasPreviewMusicId()) {
                return false;
            }
            if ((hasPreviewMusicId() && !getPreviewMusicId().equals(mJAnalyticsPreviewMusicAction.getPreviewMusicId())) || hasPreviewMusicSourceType() != mJAnalyticsPreviewMusicAction.hasPreviewMusicSourceType()) {
                return false;
            }
            if ((hasPreviewMusicSourceType() && this.previewMusicSourceType_ != mJAnalyticsPreviewMusicAction.previewMusicSourceType_) || hasPreviewMusicSongName() != mJAnalyticsPreviewMusicAction.hasPreviewMusicSongName()) {
                return false;
            }
            if ((hasPreviewMusicSongName() && !getPreviewMusicSongName().equals(mJAnalyticsPreviewMusicAction.getPreviewMusicSongName())) || hasPreviewDurationMs() != mJAnalyticsPreviewMusicAction.hasPreviewDurationMs()) {
                return false;
            }
            if ((!hasPreviewDurationMs() || getPreviewDurationMs() == mJAnalyticsPreviewMusicAction.getPreviewDurationMs()) && hasTimelineDurationMs() == mJAnalyticsPreviewMusicAction.hasTimelineDurationMs()) {
                return (!hasTimelineDurationMs() || getTimelineDurationMs() == mJAnalyticsPreviewMusicAction.getTimelineDurationMs()) && this.unknownFields.equals(mJAnalyticsPreviewMusicAction.unknownFields);
            }
            return false;
        }

        public C24062w1<MJAnalyticsPreviewMusicAction> getParserForType() {
            return PARSER;
        }

        public long getPreviewDurationMs() {
            return this.previewDurationMs_;
        }

        public String getPreviewMusicId() {
            Object obj = this.previewMusicId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.previewMusicId_ = u;
            }
            return u;
        }

        public C16994k getPreviewMusicIdBytes() {
            Object obj = this.previewMusicId_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.previewMusicId_ = k;
            return k;
        }

        public String getPreviewMusicSongName() {
            Object obj = this.previewMusicSongName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.previewMusicSongName_ = u;
            }
            return u;
        }

        public C16994k getPreviewMusicSongNameBytes() {
            Object obj = this.previewMusicSongName_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.previewMusicSongName_ = k;
            return k;
        }

        public MJAnalyticsMusicSourceType getPreviewMusicSourceType() {
            MJAnalyticsMusicSourceType valueOf = MJAnalyticsMusicSourceType.valueOf(this.previewMusicSourceType_);
            return valueOf == null ? MJAnalyticsMusicSourceType.RECOMMEND : valueOf;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) != 0) {
                i2 = 0 + C23872m0.computeStringSize(1, this.previewMusicId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                i2 += C23897n.m29261f(2, this.previewMusicSourceType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                i2 += C23872m0.computeStringSize(3, this.previewMusicSongName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                i2 += C23897n.m29280y(4, this.previewDurationMs_);
            }
            if ((this.bitField0_ & 16) != 0) {
                i2 += C23897n.m29280y(5, this.timelineDurationMs_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public long getTimelineDurationMs() {
            return this.timelineDurationMs_;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasPreviewDurationMs() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPreviewMusicId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPreviewMusicSongName() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPreviewMusicSourceType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTimelineDurationMs() {
            return (this.bitField0_ & 16) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasPreviewMusicId()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getPreviewMusicId().hashCode();
            }
            if (hasPreviewMusicSourceType()) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.previewMusicSourceType_;
            }
            if (hasPreviewMusicSongName()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getPreviewMusicSongName().hashCode();
            }
            if (hasPreviewDurationMs()) {
                hashCode = (((hashCode * 37) + 4) * 53) + C23908o0.m29424b(getPreviewDurationMs());
            }
            if (hasTimelineDurationMs()) {
                hashCode = (((hashCode * 37) + 5) * 53) + C23908o0.m29424b(getTimelineDurationMs());
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$5700 = MJAnalyticsS12.internal_static_MJAnalyticsPreviewMusicAction_fieldAccessorTable;
            access$5700.mo37875c(MJAnalyticsPreviewMusicAction.class, Builder.class);
            return access$5700;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new MJAnalyticsPreviewMusicAction();
        }

        public void writeTo(C23897n nVar) {
            if ((this.bitField0_ & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.previewMusicId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                nVar.mo37907N(2, this.previewMusicSourceType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                C23872m0.writeString(nVar, 3, this.previewMusicSongName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                nVar.mo37919Z(4, this.previewDurationMs_);
            }
            if ((this.bitField0_ & 16) != 0) {
                nVar.mo37919Z(5, this.timelineDurationMs_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends C23872m0.C23874b<Builder> implements MJAnalyticsPreviewMusicActionOrBuilder {
            private int bitField0_;
            private long previewDurationMs_;
            private Object previewMusicId_;
            private Object previewMusicSongName_;
            private int previewMusicSourceType_;
            private long timelineDurationMs_;

            public static final C24025t.C24027b getDescriptor() {
                return MJAnalyticsS12.internal_static_MJAnalyticsPreviewMusicAction_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearPreviewDurationMs() {
                this.bitField0_ &= -9;
                this.previewDurationMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPreviewMusicId() {
                this.bitField0_ &= -2;
                this.previewMusicId_ = MJAnalyticsPreviewMusicAction.getDefaultInstance().getPreviewMusicId();
                onChanged();
                return this;
            }

            public Builder clearPreviewMusicSongName() {
                this.bitField0_ &= -5;
                this.previewMusicSongName_ = MJAnalyticsPreviewMusicAction.getDefaultInstance().getPreviewMusicSongName();
                onChanged();
                return this;
            }

            public Builder clearPreviewMusicSourceType() {
                this.bitField0_ &= -3;
                this.previewMusicSourceType_ = 1;
                onChanged();
                return this;
            }

            public Builder clearTimelineDurationMs() {
                this.bitField0_ &= -17;
                this.timelineDurationMs_ = 0;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJAnalyticsS12.internal_static_MJAnalyticsPreviewMusicAction_descriptor;
            }

            public long getPreviewDurationMs() {
                return this.previewDurationMs_;
            }

            public String getPreviewMusicId() {
                Object obj = this.previewMusicId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.previewMusicId_ = u;
                }
                return u;
            }

            public C16994k getPreviewMusicIdBytes() {
                Object obj = this.previewMusicId_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.previewMusicId_ = k;
                return k;
            }

            public String getPreviewMusicSongName() {
                Object obj = this.previewMusicSongName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.previewMusicSongName_ = u;
                }
                return u;
            }

            public C16994k getPreviewMusicSongNameBytes() {
                Object obj = this.previewMusicSongName_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.previewMusicSongName_ = k;
                return k;
            }

            public MJAnalyticsMusicSourceType getPreviewMusicSourceType() {
                MJAnalyticsMusicSourceType valueOf = MJAnalyticsMusicSourceType.valueOf(this.previewMusicSourceType_);
                return valueOf == null ? MJAnalyticsMusicSourceType.RECOMMEND : valueOf;
            }

            public long getTimelineDurationMs() {
                return this.timelineDurationMs_;
            }

            public boolean hasPreviewDurationMs() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasPreviewMusicId() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPreviewMusicSongName() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasPreviewMusicSourceType() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasTimelineDurationMs() {
                return (this.bitField0_ & 16) != 0;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$5700 = MJAnalyticsS12.internal_static_MJAnalyticsPreviewMusicAction_fieldAccessorTable;
                access$5700.mo37875c(MJAnalyticsPreviewMusicAction.class, Builder.class);
                return access$5700;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setPreviewDurationMs(long j) {
                this.bitField0_ |= 8;
                this.previewDurationMs_ = j;
                onChanged();
                return this;
            }

            public Builder setPreviewMusicId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.previewMusicId_ = str;
                onChanged();
                return this;
            }

            public Builder setPreviewMusicIdBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 1;
                this.previewMusicId_ = kVar;
                onChanged();
                return this;
            }

            public Builder setPreviewMusicSongName(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.previewMusicSongName_ = str;
                onChanged();
                return this;
            }

            public Builder setPreviewMusicSongNameBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 4;
                this.previewMusicSongName_ = kVar;
                onChanged();
                return this;
            }

            public Builder setPreviewMusicSourceType(MJAnalyticsMusicSourceType mJAnalyticsMusicSourceType) {
                mJAnalyticsMusicSourceType.getClass();
                this.bitField0_ |= 2;
                this.previewMusicSourceType_ = mJAnalyticsMusicSourceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTimelineDurationMs(long j) {
                this.bitField0_ |= 16;
                this.timelineDurationMs_ = j;
                onChanged();
                return this;
            }

            private Builder() {
                this.previewMusicId_ = "";
                this.previewMusicSourceType_ = 1;
                this.previewMusicSongName_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public MJAnalyticsPreviewMusicAction build() {
                MJAnalyticsPreviewMusicAction buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public MJAnalyticsPreviewMusicAction buildPartial() {
                MJAnalyticsPreviewMusicAction mJAnalyticsPreviewMusicAction = new MJAnalyticsPreviewMusicAction((C23872m0.C23874b) this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 0 ? 1 : 0;
                Object unused = mJAnalyticsPreviewMusicAction.previewMusicId_ = this.previewMusicId_;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                int unused2 = mJAnalyticsPreviewMusicAction.previewMusicSourceType_ = this.previewMusicSourceType_;
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                Object unused3 = mJAnalyticsPreviewMusicAction.previewMusicSongName_ = this.previewMusicSongName_;
                if ((i & 8) != 0) {
                    long unused4 = mJAnalyticsPreviewMusicAction.previewDurationMs_ = this.previewDurationMs_;
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    long unused5 = mJAnalyticsPreviewMusicAction.timelineDurationMs_ = this.timelineDurationMs_;
                    i2 |= 16;
                }
                int unused6 = mJAnalyticsPreviewMusicAction.bitField0_ = i2;
                onBuilt();
                return mJAnalyticsPreviewMusicAction;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public MJAnalyticsPreviewMusicAction getDefaultInstanceForType() {
                return MJAnalyticsPreviewMusicAction.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.previewMusicId_ = "";
                this.previewMusicSourceType_ = 1;
                this.previewMusicSongName_ = "";
                this.previewDurationMs_ = 0;
                this.timelineDurationMs_ = 0;
                this.bitField0_ = this.bitField0_ & -2 & -3 & -5 & -9 & -17;
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof MJAnalyticsPreviewMusicAction) {
                    return mergeFrom((MJAnalyticsPreviewMusicAction) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.previewMusicId_ = "";
                this.previewMusicSourceType_ = 1;
                this.previewMusicSongName_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(MJAnalyticsPreviewMusicAction mJAnalyticsPreviewMusicAction) {
                if (mJAnalyticsPreviewMusicAction == MJAnalyticsPreviewMusicAction.getDefaultInstance()) {
                    return this;
                }
                if (mJAnalyticsPreviewMusicAction.hasPreviewMusicId()) {
                    this.bitField0_ |= 1;
                    this.previewMusicId_ = mJAnalyticsPreviewMusicAction.previewMusicId_;
                    onChanged();
                }
                if (mJAnalyticsPreviewMusicAction.hasPreviewMusicSourceType()) {
                    setPreviewMusicSourceType(mJAnalyticsPreviewMusicAction.getPreviewMusicSourceType());
                }
                if (mJAnalyticsPreviewMusicAction.hasPreviewMusicSongName()) {
                    this.bitField0_ |= 4;
                    this.previewMusicSongName_ = mJAnalyticsPreviewMusicAction.previewMusicSongName_;
                    onChanged();
                }
                if (mJAnalyticsPreviewMusicAction.hasPreviewDurationMs()) {
                    setPreviewDurationMs(mJAnalyticsPreviewMusicAction.getPreviewDurationMs());
                }
                if (mJAnalyticsPreviewMusicAction.hasTimelineDurationMs()) {
                    setTimelineDurationMs(mJAnalyticsPreviewMusicAction.getTimelineDurationMs());
                }
                mergeUnknownFields(mJAnalyticsPreviewMusicAction.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x001f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewMusicAction.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1<com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewMusicAction> r1 = com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewMusicAction.PARSER     // Catch:{ p0 -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0011 }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewMusicAction r3 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewMusicAction) r3     // Catch:{ p0 -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewMusicAction) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001d
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x000f }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewMusicAction r4 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewMusicAction) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001b }
                    throw r3     // Catch:{ all -> 0x001b }
                L_0x001b:
                    r3 = move-exception
                    r0 = r4
                L_0x001d:
                    if (r0 == 0) goto L_0x0022
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewMusicAction) r0)
                L_0x0022:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewMusicAction.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewMusicAction$Builder");
            }
        }

        public static Builder newBuilder(MJAnalyticsPreviewMusicAction mJAnalyticsPreviewMusicAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mJAnalyticsPreviewMusicAction);
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private MJAnalyticsPreviewMusicAction(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static MJAnalyticsPreviewMusicAction parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsPreviewMusicAction) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public MJAnalyticsPreviewMusicAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MJAnalyticsPreviewMusicAction() {
            this.memoizedIsInitialized = -1;
            this.previewMusicId_ = "";
            this.previewMusicSourceType_ = 1;
            this.previewMusicSongName_ = "";
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(InputStream inputStream) {
            return (MJAnalyticsPreviewMusicAction) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsPreviewMusicAction) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        private MJAnalyticsPreviewMusicAction(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            C16994k m = lVar.mo37768m();
                            this.bitField0_ = 1 | this.bitField0_;
                            this.previewMusicId_ = m;
                        } else if (F == 16) {
                            int o = lVar.mo37770o();
                            if (MJAnalyticsMusicSourceType.valueOf(o) == null) {
                                b.mo38304g(2, o);
                            } else {
                                this.bitField0_ |= 2;
                                this.previewMusicSourceType_ = o;
                            }
                        } else if (F == 26) {
                            C16994k m2 = lVar.mo37768m();
                            this.bitField0_ |= 4;
                            this.previewMusicSongName_ = m2;
                        } else if (F == 32) {
                            this.bitField0_ |= 8;
                            this.previewDurationMs_ = lVar.mo37759H();
                        } else if (F == 40) {
                            this.bitField0_ |= 16;
                            this.timelineDurationMs_ = lVar.mo37759H();
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(C23856l lVar) {
            return (MJAnalyticsPreviewMusicAction) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static MJAnalyticsPreviewMusicAction parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MJAnalyticsPreviewMusicAction) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface MJAnalyticsPreviewMusicActionOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        long getPreviewDurationMs();

        String getPreviewMusicId();

        C16994k getPreviewMusicIdBytes();

        String getPreviewMusicSongName();

        C16994k getPreviewMusicSongNameBytes();

        MJAnalyticsMusicSourceType getPreviewMusicSourceType();

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        long getTimelineDurationMs();

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasPreviewDurationMs();

        boolean hasPreviewMusicId();

        boolean hasPreviewMusicSongName();

        boolean hasPreviewMusicSourceType();

        boolean hasTimelineDurationMs();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MJAnalyticsPreviewTemplateAction extends C23872m0 implements MJAnalyticsPreviewTemplateActionOrBuilder {
        private static final MJAnalyticsPreviewTemplateAction DEFAULT_INSTANCE = new MJAnalyticsPreviewTemplateAction();
        public static final int MUSIC_ACTIONS_FIELD_NUMBER = 4;
        @Deprecated
        public static final C24062w1<MJAnalyticsPreviewTemplateAction> PARSER = new C23813c<MJAnalyticsPreviewTemplateAction>() {
            public MJAnalyticsPreviewTemplateAction parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new MJAnalyticsPreviewTemplateAction(lVar, a0Var);
            }
        };
        public static final int PREVIEW_DURATION_MS_FIELD_NUMBER = 3;
        public static final int PREVIEW_TEMPLATE_ID_FIELD_NUMBER = 1;
        public static final int PREVIEW_TEMPLATE_SOURCE_TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public List<MJAnalyticsPreviewMusicAction> musicActions_;
        /* access modifiers changed from: private */
        public long previewDurationMs_;
        /* access modifiers changed from: private */
        public volatile Object previewTemplateId_;
        /* access modifiers changed from: private */
        public int previewTemplateSourceType_;

        public static MJAnalyticsPreviewTemplateAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJAnalyticsS12.internal_static_MJAnalyticsPreviewTemplateAction_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MJAnalyticsPreviewTemplateAction parseDelimitedFrom(InputStream inputStream) {
            return (MJAnalyticsPreviewTemplateAction) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<MJAnalyticsPreviewTemplateAction> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MJAnalyticsPreviewTemplateAction)) {
                return super.equals(obj);
            }
            MJAnalyticsPreviewTemplateAction mJAnalyticsPreviewTemplateAction = (MJAnalyticsPreviewTemplateAction) obj;
            if (hasPreviewTemplateId() != mJAnalyticsPreviewTemplateAction.hasPreviewTemplateId()) {
                return false;
            }
            if ((hasPreviewTemplateId() && !getPreviewTemplateId().equals(mJAnalyticsPreviewTemplateAction.getPreviewTemplateId())) || hasPreviewTemplateSourceType() != mJAnalyticsPreviewTemplateAction.hasPreviewTemplateSourceType()) {
                return false;
            }
            if ((!hasPreviewTemplateSourceType() || this.previewTemplateSourceType_ == mJAnalyticsPreviewTemplateAction.previewTemplateSourceType_) && hasPreviewDurationMs() == mJAnalyticsPreviewTemplateAction.hasPreviewDurationMs()) {
                return (!hasPreviewDurationMs() || getPreviewDurationMs() == mJAnalyticsPreviewTemplateAction.getPreviewDurationMs()) && getMusicActionsList().equals(mJAnalyticsPreviewTemplateAction.getMusicActionsList()) && this.unknownFields.equals(mJAnalyticsPreviewTemplateAction.unknownFields);
            }
            return false;
        }

        public MJAnalyticsPreviewMusicAction getMusicActions(int i) {
            return this.musicActions_.get(i);
        }

        public int getMusicActionsCount() {
            return this.musicActions_.size();
        }

        public List<MJAnalyticsPreviewMusicAction> getMusicActionsList() {
            return this.musicActions_;
        }

        public MJAnalyticsPreviewMusicActionOrBuilder getMusicActionsOrBuilder(int i) {
            return this.musicActions_.get(i);
        }

        public List<? extends MJAnalyticsPreviewMusicActionOrBuilder> getMusicActionsOrBuilderList() {
            return this.musicActions_;
        }

        public C24062w1<MJAnalyticsPreviewTemplateAction> getParserForType() {
            return PARSER;
        }

        public long getPreviewDurationMs() {
            return this.previewDurationMs_;
        }

        public String getPreviewTemplateId() {
            Object obj = this.previewTemplateId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.previewTemplateId_ = u;
            }
            return u;
        }

        public C16994k getPreviewTemplateIdBytes() {
            Object obj = this.previewTemplateId_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.previewTemplateId_ = k;
            return k;
        }

        public MJAnalyticsTemplateSourceType getPreviewTemplateSourceType() {
            MJAnalyticsTemplateSourceType valueOf = MJAnalyticsTemplateSourceType.valueOf(this.previewTemplateSourceType_);
            return valueOf == null ? MJAnalyticsTemplateSourceType.UNKNOWN : valueOf;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (this.bitField0_ & 1) != 0 ? C23872m0.computeStringSize(1, this.previewTemplateId_) + 0 : 0;
            if ((this.bitField0_ & 2) != 0) {
                computeStringSize += C23897n.m29261f(2, this.previewTemplateSourceType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeStringSize += C23897n.m29280y(3, this.previewDurationMs_);
            }
            for (int i2 = 0; i2 < this.musicActions_.size(); i2++) {
                computeStringSize += C23897n.m29270o(4, this.musicActions_.get(i2));
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasPreviewDurationMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPreviewTemplateId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPreviewTemplateSourceType() {
            return (this.bitField0_ & 2) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasPreviewTemplateId()) {
                hashCode = (((hashCode * 37) + 1) * 53) + getPreviewTemplateId().hashCode();
            }
            if (hasPreviewTemplateSourceType()) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.previewTemplateSourceType_;
            }
            if (hasPreviewDurationMs()) {
                hashCode = (((hashCode * 37) + 3) * 53) + C23908o0.m29424b(getPreviewDurationMs());
            }
            if (getMusicActionsCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getMusicActionsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$7100 = MJAnalyticsS12.f69253xf8a5f24e;
            access$7100.mo37875c(MJAnalyticsPreviewTemplateAction.class, Builder.class);
            return access$7100;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new MJAnalyticsPreviewTemplateAction();
        }

        public void writeTo(C23897n nVar) {
            if ((this.bitField0_ & 1) != 0) {
                C23872m0.writeString(nVar, 1, this.previewTemplateId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                nVar.mo37907N(2, this.previewTemplateSourceType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                nVar.mo37919Z(3, this.previewDurationMs_);
            }
            for (int i = 0; i < this.musicActions_.size(); i++) {
                nVar.mo37909P(4, this.musicActions_.get(i));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends C23872m0.C23874b<Builder> implements MJAnalyticsPreviewTemplateActionOrBuilder {
            private int bitField0_;
            private C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> musicActionsBuilder_;
            private List<MJAnalyticsPreviewMusicAction> musicActions_;
            private long previewDurationMs_;
            private Object previewTemplateId_;
            private int previewTemplateSourceType_;

            private void ensureMusicActionsIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.musicActions_ = new ArrayList(this.musicActions_);
                    this.bitField0_ |= 8;
                }
            }

            public static final C24025t.C24027b getDescriptor() {
                return MJAnalyticsS12.internal_static_MJAnalyticsPreviewTemplateAction_descriptor;
            }

            private C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> getMusicActionsFieldBuilder() {
                if (this.musicActionsBuilder_ == null) {
                    this.musicActionsBuilder_ = new C23821e2<>(this.musicActions_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.musicActions_ = null;
                }
                return this.musicActionsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (C23872m0.alwaysUseFieldBuilders) {
                    getMusicActionsFieldBuilder();
                }
            }

            public Builder addAllMusicActions(Iterable<? extends MJAnalyticsPreviewMusicAction> iterable) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    ensureMusicActionsIsMutable();
                    C23810b.C23811a.addAll(iterable, this.musicActions_);
                    onChanged();
                } else {
                    e2Var.mo37578b(iterable);
                }
                return this;
            }

            public Builder addMusicActions(MJAnalyticsPreviewMusicAction mJAnalyticsPreviewMusicAction) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsPreviewMusicAction.getClass();
                    ensureMusicActionsIsMutable();
                    this.musicActions_.add(mJAnalyticsPreviewMusicAction);
                    onChanged();
                } else {
                    e2Var.mo37582f(mJAnalyticsPreviewMusicAction);
                }
                return this;
            }

            public MJAnalyticsPreviewMusicAction.Builder addMusicActionsBuilder() {
                return getMusicActionsFieldBuilder().mo37580d(MJAnalyticsPreviewMusicAction.getDefaultInstance());
            }

            public Builder clearMusicActions() {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    this.musicActions_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder clearPreviewDurationMs() {
                this.bitField0_ &= -5;
                this.previewDurationMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPreviewTemplateId() {
                this.bitField0_ &= -2;
                this.previewTemplateId_ = MJAnalyticsPreviewTemplateAction.getDefaultInstance().getPreviewTemplateId();
                onChanged();
                return this;
            }

            public Builder clearPreviewTemplateSourceType() {
                this.bitField0_ &= -3;
                this.previewTemplateSourceType_ = 0;
                onChanged();
                return this;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJAnalyticsS12.internal_static_MJAnalyticsPreviewTemplateAction_descriptor;
            }

            public MJAnalyticsPreviewMusicAction getMusicActions(int i) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                return e2Var == null ? this.musicActions_.get(i) : e2Var.mo37590n(i, false);
            }

            public MJAnalyticsPreviewMusicAction.Builder getMusicActionsBuilder(int i) {
                return getMusicActionsFieldBuilder().mo37587k(i);
            }

            public List<MJAnalyticsPreviewMusicAction.Builder> getMusicActionsBuilderList() {
                return getMusicActionsFieldBuilder().mo37588l();
            }

            public int getMusicActionsCount() {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                return e2Var == null ? this.musicActions_.size() : e2Var.mo37589m();
            }

            public List<MJAnalyticsPreviewMusicAction> getMusicActionsList() {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                return e2Var == null ? Collections.unmodifiableList(this.musicActions_) : e2Var.mo37591o();
            }

            public MJAnalyticsPreviewMusicActionOrBuilder getMusicActionsOrBuilder(int i) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                return e2Var == null ? this.musicActions_.get(i) : e2Var.mo37592p(i);
            }

            public List<? extends MJAnalyticsPreviewMusicActionOrBuilder> getMusicActionsOrBuilderList() {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                return e2Var != null ? e2Var.mo37593q() : Collections.unmodifiableList(this.musicActions_);
            }

            public long getPreviewDurationMs() {
                return this.previewDurationMs_;
            }

            public String getPreviewTemplateId() {
                Object obj = this.previewTemplateId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.previewTemplateId_ = u;
                }
                return u;
            }

            public C16994k getPreviewTemplateIdBytes() {
                Object obj = this.previewTemplateId_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.previewTemplateId_ = k;
                return k;
            }

            public MJAnalyticsTemplateSourceType getPreviewTemplateSourceType() {
                MJAnalyticsTemplateSourceType valueOf = MJAnalyticsTemplateSourceType.valueOf(this.previewTemplateSourceType_);
                return valueOf == null ? MJAnalyticsTemplateSourceType.UNKNOWN : valueOf;
            }

            public boolean hasPreviewDurationMs() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasPreviewTemplateId() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPreviewTemplateSourceType() {
                return (this.bitField0_ & 2) != 0;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$7100 = MJAnalyticsS12.f69253xf8a5f24e;
                access$7100.mo37875c(MJAnalyticsPreviewTemplateAction.class, Builder.class);
                return access$7100;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder removeMusicActions(int i) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    ensureMusicActionsIsMutable();
                    this.musicActions_.remove(i);
                    onChanged();
                } else {
                    e2Var.mo37597u(i);
                }
                return this;
            }

            public Builder setMusicActions(int i, MJAnalyticsPreviewMusicAction mJAnalyticsPreviewMusicAction) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsPreviewMusicAction.getClass();
                    ensureMusicActionsIsMutable();
                    this.musicActions_.set(i, mJAnalyticsPreviewMusicAction);
                    onChanged();
                } else {
                    e2Var.mo37598v(i, mJAnalyticsPreviewMusicAction);
                }
                return this;
            }

            public Builder setPreviewDurationMs(long j) {
                this.bitField0_ |= 4;
                this.previewDurationMs_ = j;
                onChanged();
                return this;
            }

            public Builder setPreviewTemplateId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.previewTemplateId_ = str;
                onChanged();
                return this;
            }

            public Builder setPreviewTemplateIdBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 1;
                this.previewTemplateId_ = kVar;
                onChanged();
                return this;
            }

            public Builder setPreviewTemplateSourceType(MJAnalyticsTemplateSourceType mJAnalyticsTemplateSourceType) {
                mJAnalyticsTemplateSourceType.getClass();
                this.bitField0_ |= 2;
                this.previewTemplateSourceType_ = mJAnalyticsTemplateSourceType.getNumber();
                onChanged();
                return this;
            }

            private Builder() {
                this.previewTemplateId_ = "";
                this.previewTemplateSourceType_ = 0;
                this.musicActions_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public MJAnalyticsPreviewTemplateAction build() {
                MJAnalyticsPreviewTemplateAction buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public MJAnalyticsPreviewTemplateAction buildPartial() {
                MJAnalyticsPreviewTemplateAction mJAnalyticsPreviewTemplateAction = new MJAnalyticsPreviewTemplateAction((C23872m0.C23874b) this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 0 ? 1 : 0;
                Object unused = mJAnalyticsPreviewTemplateAction.previewTemplateId_ = this.previewTemplateId_;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                int unused2 = mJAnalyticsPreviewTemplateAction.previewTemplateSourceType_ = this.previewTemplateSourceType_;
                if ((i & 4) != 0) {
                    long unused3 = mJAnalyticsPreviewTemplateAction.previewDurationMs_ = this.previewDurationMs_;
                    i2 |= 4;
                }
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.musicActions_ = Collections.unmodifiableList(this.musicActions_);
                        this.bitField0_ &= -9;
                    }
                    List unused4 = mJAnalyticsPreviewTemplateAction.musicActions_ = this.musicActions_;
                } else {
                    List unused5 = mJAnalyticsPreviewTemplateAction.musicActions_ = e2Var.mo37583g();
                }
                int unused6 = mJAnalyticsPreviewTemplateAction.bitField0_ = i2;
                onBuilt();
                return mJAnalyticsPreviewTemplateAction;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public MJAnalyticsPreviewTemplateAction getDefaultInstanceForType() {
                return MJAnalyticsPreviewTemplateAction.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public MJAnalyticsPreviewMusicAction.Builder addMusicActionsBuilder(int i) {
                return getMusicActionsFieldBuilder().mo37579c(i, MJAnalyticsPreviewMusicAction.getDefaultInstance());
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.previewTemplateId_ = "";
                this.previewTemplateSourceType_ = 0;
                this.previewDurationMs_ = 0;
                this.bitField0_ = this.bitField0_ & -2 & -3 & -5;
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    this.musicActions_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    e2Var.mo37584h();
                }
                return this;
            }

            public Builder addMusicActions(int i, MJAnalyticsPreviewMusicAction mJAnalyticsPreviewMusicAction) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    mJAnalyticsPreviewMusicAction.getClass();
                    ensureMusicActionsIsMutable();
                    this.musicActions_.add(i, mJAnalyticsPreviewMusicAction);
                    onChanged();
                } else {
                    e2Var.mo37581e(i, mJAnalyticsPreviewMusicAction);
                }
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof MJAnalyticsPreviewTemplateAction) {
                    return mergeFrom((MJAnalyticsPreviewTemplateAction) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            public Builder setMusicActions(int i, MJAnalyticsPreviewMusicAction.Builder builder) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    ensureMusicActionsIsMutable();
                    this.musicActions_.set(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37598v(i, builder.build());
                }
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.previewTemplateId_ = "";
                this.previewTemplateSourceType_ = 0;
                this.musicActions_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(MJAnalyticsPreviewTemplateAction mJAnalyticsPreviewTemplateAction) {
                if (mJAnalyticsPreviewTemplateAction == MJAnalyticsPreviewTemplateAction.getDefaultInstance()) {
                    return this;
                }
                if (mJAnalyticsPreviewTemplateAction.hasPreviewTemplateId()) {
                    this.bitField0_ |= 1;
                    this.previewTemplateId_ = mJAnalyticsPreviewTemplateAction.previewTemplateId_;
                    onChanged();
                }
                if (mJAnalyticsPreviewTemplateAction.hasPreviewTemplateSourceType()) {
                    setPreviewTemplateSourceType(mJAnalyticsPreviewTemplateAction.getPreviewTemplateSourceType());
                }
                if (mJAnalyticsPreviewTemplateAction.hasPreviewDurationMs()) {
                    setPreviewDurationMs(mJAnalyticsPreviewTemplateAction.getPreviewDurationMs());
                }
                if (this.musicActionsBuilder_ == null) {
                    if (!mJAnalyticsPreviewTemplateAction.musicActions_.isEmpty()) {
                        if (this.musicActions_.isEmpty()) {
                            this.musicActions_ = mJAnalyticsPreviewTemplateAction.musicActions_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureMusicActionsIsMutable();
                            this.musicActions_.addAll(mJAnalyticsPreviewTemplateAction.musicActions_);
                        }
                        onChanged();
                    }
                } else if (!mJAnalyticsPreviewTemplateAction.musicActions_.isEmpty()) {
                    if (this.musicActionsBuilder_.mo37595s()) {
                        C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = null;
                        this.musicActionsBuilder_.f68224a = null;
                        this.musicActionsBuilder_ = null;
                        this.musicActions_ = mJAnalyticsPreviewTemplateAction.musicActions_;
                        this.bitField0_ &= -9;
                        if (C23872m0.alwaysUseFieldBuilders) {
                            e2Var = getMusicActionsFieldBuilder();
                        }
                        this.musicActionsBuilder_ = e2Var;
                    } else {
                        this.musicActionsBuilder_.mo37578b(mJAnalyticsPreviewTemplateAction.musicActions_);
                    }
                }
                mergeUnknownFields(mJAnalyticsPreviewTemplateAction.unknownFields);
                onChanged();
                return this;
            }

            public Builder addMusicActions(MJAnalyticsPreviewMusicAction.Builder builder) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    ensureMusicActionsIsMutable();
                    this.musicActions_.add(builder.build());
                    onChanged();
                } else {
                    e2Var.mo37582f(builder.build());
                }
                return this;
            }

            public Builder addMusicActions(int i, MJAnalyticsPreviewMusicAction.Builder builder) {
                C23821e2<MJAnalyticsPreviewMusicAction, MJAnalyticsPreviewMusicAction.Builder, MJAnalyticsPreviewMusicActionOrBuilder> e2Var = this.musicActionsBuilder_;
                if (e2Var == null) {
                    ensureMusicActionsIsMutable();
                    this.musicActions_.add(i, builder.build());
                    onChanged();
                } else {
                    e2Var.mo37581e(i, builder.build());
                }
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x001f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewTemplateAction.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1<com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewTemplateAction> r1 = com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewTemplateAction.PARSER     // Catch:{ p0 -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0011 }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewTemplateAction r3 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewTemplateAction) r3     // Catch:{ p0 -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewTemplateAction) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001d
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x000f }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewTemplateAction r4 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewTemplateAction) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001b }
                    throw r3     // Catch:{ all -> 0x001b }
                L_0x001b:
                    r3 = move-exception
                    r0 = r4
                L_0x001d:
                    if (r0 == 0) goto L_0x0022
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewTemplateAction) r0)
                L_0x0022:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewTemplateAction.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewTemplateAction$Builder");
            }
        }

        public static Builder newBuilder(MJAnalyticsPreviewTemplateAction mJAnalyticsPreviewTemplateAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mJAnalyticsPreviewTemplateAction);
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private MJAnalyticsPreviewTemplateAction(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static MJAnalyticsPreviewTemplateAction parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsPreviewTemplateAction) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public MJAnalyticsPreviewTemplateAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MJAnalyticsPreviewTemplateAction() {
            this.memoizedIsInitialized = -1;
            this.previewTemplateId_ = "";
            this.previewTemplateSourceType_ = 0;
            this.musicActions_ = Collections.emptyList();
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(InputStream inputStream) {
            return (MJAnalyticsPreviewTemplateAction) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsPreviewTemplateAction) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        private MJAnalyticsPreviewTemplateAction(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 10) {
                            C16994k m = lVar.mo37768m();
                            this.bitField0_ = 1 | this.bitField0_;
                            this.previewTemplateId_ = m;
                        } else if (F == 16) {
                            int o = lVar.mo37770o();
                            if (MJAnalyticsTemplateSourceType.valueOf(o) == null) {
                                b.mo38304g(2, o);
                            } else {
                                this.bitField0_ |= 2;
                                this.previewTemplateSourceType_ = o;
                            }
                        } else if (F == 24) {
                            this.bitField0_ |= 4;
                            this.previewDurationMs_ = lVar.mo37759H();
                        } else if (F == 34) {
                            if (!z2 || !true) {
                                this.musicActions_ = new ArrayList();
                                z2 |= true;
                            }
                            this.musicActions_.add((MJAnalyticsPreviewMusicAction) lVar.mo37777v(MJAnalyticsPreviewMusicAction.PARSER, a0Var));
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.musicActions_ = Collections.unmodifiableList(this.musicActions_);
                    }
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.musicActions_ = Collections.unmodifiableList(this.musicActions_);
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(C23856l lVar) {
            return (MJAnalyticsPreviewTemplateAction) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static MJAnalyticsPreviewTemplateAction parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MJAnalyticsPreviewTemplateAction) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface MJAnalyticsPreviewTemplateActionOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        MJAnalyticsPreviewMusicAction getMusicActions(int i);

        int getMusicActionsCount();

        List<MJAnalyticsPreviewMusicAction> getMusicActionsList();

        MJAnalyticsPreviewMusicActionOrBuilder getMusicActionsOrBuilder(int i);

        List<? extends MJAnalyticsPreviewMusicActionOrBuilder> getMusicActionsOrBuilderList();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        long getPreviewDurationMs();

        String getPreviewTemplateId();

        C16994k getPreviewTemplateIdBytes();

        MJAnalyticsTemplateSourceType getPreviewTemplateSourceType();

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        /* synthetic */ C24020s2 getUnknownFields();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasPreviewDurationMs();

        boolean hasPreviewTemplateId();

        boolean hasPreviewTemplateSourceType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MJAnalyticsTemplateRecommendation extends C23872m0 implements MJAnalyticsTemplateRecommendationOrBuilder {
        public static final int ATTACHMENTS_JSON_FIELD_NUMBER = 5;
        public static final int CREATION_ID_FIELD_NUMBER = 2;
        private static final MJAnalyticsTemplateRecommendation DEFAULT_INSTANCE = new MJAnalyticsTemplateRecommendation();
        @Deprecated
        public static final C24062w1<MJAnalyticsTemplateRecommendation> PARSER = new C23813c<MJAnalyticsTemplateRecommendation>() {
            public MJAnalyticsTemplateRecommendation parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
                return new MJAnalyticsTemplateRecommendation(lVar, a0Var);
            }
        };
        public static final int PROJECT_CLASSIFICATION_FIELD_NUMBER = 4;
        public static final int REQUEST_ID_FIELD_NUMBER = 1;
        public static final int SCENE_TAG_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object attachmentsJson_;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public volatile Object creationId_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object projectClassification_;
        /* access modifiers changed from: private */
        public long requestId_;
        /* access modifiers changed from: private */
        public volatile Object sceneTag_;

        public static MJAnalyticsTemplateRecommendation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C24025t.C24027b getDescriptor() {
            return MJAnalyticsS12.internal_static_MJAnalyticsTemplateRecommendation_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MJAnalyticsTemplateRecommendation parseDelimitedFrom(InputStream inputStream) {
            return (MJAnalyticsTemplateRecommendation) C23872m0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static C24062w1<MJAnalyticsTemplateRecommendation> parser() {
            return PARSER;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MJAnalyticsTemplateRecommendation)) {
                return super.equals(obj);
            }
            MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation = (MJAnalyticsTemplateRecommendation) obj;
            if (hasRequestId() != mJAnalyticsTemplateRecommendation.hasRequestId()) {
                return false;
            }
            if ((hasRequestId() && getRequestId() != mJAnalyticsTemplateRecommendation.getRequestId()) || hasCreationId() != mJAnalyticsTemplateRecommendation.hasCreationId()) {
                return false;
            }
            if ((hasCreationId() && !getCreationId().equals(mJAnalyticsTemplateRecommendation.getCreationId())) || hasSceneTag() != mJAnalyticsTemplateRecommendation.hasSceneTag()) {
                return false;
            }
            if ((hasSceneTag() && !getSceneTag().equals(mJAnalyticsTemplateRecommendation.getSceneTag())) || hasProjectClassification() != mJAnalyticsTemplateRecommendation.hasProjectClassification()) {
                return false;
            }
            if ((!hasProjectClassification() || getProjectClassification().equals(mJAnalyticsTemplateRecommendation.getProjectClassification())) && hasAttachmentsJson() == mJAnalyticsTemplateRecommendation.hasAttachmentsJson()) {
                return (!hasAttachmentsJson() || getAttachmentsJson().equals(mJAnalyticsTemplateRecommendation.getAttachmentsJson())) && this.unknownFields.equals(mJAnalyticsTemplateRecommendation.unknownFields);
            }
            return false;
        }

        public String getAttachmentsJson() {
            Object obj = this.attachmentsJson_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.attachmentsJson_ = u;
            }
            return u;
        }

        public C16994k getAttachmentsJsonBytes() {
            Object obj = this.attachmentsJson_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.attachmentsJson_ = k;
            return k;
        }

        public String getCreationId() {
            Object obj = this.creationId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.creationId_ = u;
            }
            return u;
        }

        public C16994k getCreationIdBytes() {
            Object obj = this.creationId_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.creationId_ = k;
            return k;
        }

        public C24062w1<MJAnalyticsTemplateRecommendation> getParserForType() {
            return PARSER;
        }

        public String getProjectClassification() {
            Object obj = this.projectClassification_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.projectClassification_ = u;
            }
            return u;
        }

        public C16994k getProjectClassificationBytes() {
            Object obj = this.projectClassification_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.projectClassification_ = k;
            return k;
        }

        public long getRequestId() {
            return this.requestId_;
        }

        public String getSceneTag() {
            Object obj = this.sceneTag_;
            if (obj instanceof String) {
                return (String) obj;
            }
            C16994k kVar = (C16994k) obj;
            String u = kVar.mo18752u();
            if (kVar.mo18744n()) {
                this.sceneTag_ = u;
            }
            return u;
        }

        public C16994k getSceneTagBytes() {
            Object obj = this.sceneTag_;
            if (!(obj instanceof String)) {
                return (C16994k) obj;
            }
            C16994k k = C16994k.m16791k((String) obj);
            this.sceneTag_ = k;
            return k;
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) != 0) {
                i2 = 0 + C23897n.m29280y(1, this.requestId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                i2 += C23872m0.computeStringSize(2, this.creationId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                i2 += C23872m0.computeStringSize(3, this.sceneTag_);
            }
            if ((this.bitField0_ & 8) != 0) {
                i2 += C23872m0.computeStringSize(4, this.projectClassification_);
            }
            if ((this.bitField0_ & 16) != 0) {
                i2 += C23872m0.computeStringSize(5, this.attachmentsJson_);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public final C24020s2 getUnknownFields() {
            return this.unknownFields;
        }

        public boolean hasAttachmentsJson() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasCreationId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasProjectClassification() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRequestId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSceneTag() {
            return (this.bitField0_ & 4) != 0;
        }

        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = C82986r.CTRL_INDEX + getDescriptor().hashCode();
            if (hasRequestId()) {
                hashCode = (((hashCode * 37) + 1) * 53) + C23908o0.m29424b(getRequestId());
            }
            if (hasCreationId()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getCreationId().hashCode();
            }
            if (hasSceneTag()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getSceneTag().hashCode();
            }
            if (hasProjectClassification()) {
                hashCode = (((hashCode * 37) + 4) * 53) + getProjectClassification().hashCode();
            }
            if (hasAttachmentsJson()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getAttachmentsJson().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public C23872m0.C23880f internalGetFieldAccessorTable() {
            C23872m0.C23880f access$8500 = MJAnalyticsS12.f69254x8059c61f;
            access$8500.mo37875c(MJAnalyticsTemplateRecommendation.class, Builder.class);
            return access$8500;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public Object newInstance(C23872m0.C23895g gVar) {
            return new MJAnalyticsTemplateRecommendation();
        }

        public void writeTo(C23897n nVar) {
            if ((this.bitField0_ & 1) != 0) {
                nVar.mo37919Z(1, this.requestId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                C23872m0.writeString(nVar, 2, this.creationId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                C23872m0.writeString(nVar, 3, this.sceneTag_);
            }
            if ((this.bitField0_ & 8) != 0) {
                C23872m0.writeString(nVar, 4, this.projectClassification_);
            }
            if ((this.bitField0_ & 16) != 0) {
                C23872m0.writeString(nVar, 5, this.attachmentsJson_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends C23872m0.C23874b<Builder> implements MJAnalyticsTemplateRecommendationOrBuilder {
            private Object attachmentsJson_;
            private int bitField0_;
            private Object creationId_;
            private Object projectClassification_;
            private long requestId_;
            private Object sceneTag_;

            public static final C24025t.C24027b getDescriptor() {
                return MJAnalyticsS12.internal_static_MJAnalyticsTemplateRecommendation_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = C23872m0.alwaysUseFieldBuilders;
            }

            public Builder clearAttachmentsJson() {
                this.bitField0_ &= -17;
                this.attachmentsJson_ = MJAnalyticsTemplateRecommendation.getDefaultInstance().getAttachmentsJson();
                onChanged();
                return this;
            }

            public Builder clearCreationId() {
                this.bitField0_ &= -3;
                this.creationId_ = MJAnalyticsTemplateRecommendation.getDefaultInstance().getCreationId();
                onChanged();
                return this;
            }

            public Builder clearProjectClassification() {
                this.bitField0_ &= -9;
                this.projectClassification_ = MJAnalyticsTemplateRecommendation.getDefaultInstance().getProjectClassification();
                onChanged();
                return this;
            }

            public Builder clearRequestId() {
                this.bitField0_ &= -2;
                this.requestId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSceneTag() {
                this.bitField0_ &= -5;
                this.sceneTag_ = MJAnalyticsTemplateRecommendation.getDefaultInstance().getSceneTag();
                onChanged();
                return this;
            }

            public String getAttachmentsJson() {
                Object obj = this.attachmentsJson_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.attachmentsJson_ = u;
                }
                return u;
            }

            public C16994k getAttachmentsJsonBytes() {
                Object obj = this.attachmentsJson_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.attachmentsJson_ = k;
                return k;
            }

            public String getCreationId() {
                Object obj = this.creationId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.creationId_ = u;
                }
                return u;
            }

            public C16994k getCreationIdBytes() {
                Object obj = this.creationId_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.creationId_ = k;
                return k;
            }

            public C24025t.C24027b getDescriptorForType() {
                return MJAnalyticsS12.internal_static_MJAnalyticsTemplateRecommendation_descriptor;
            }

            public String getProjectClassification() {
                Object obj = this.projectClassification_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.projectClassification_ = u;
                }
                return u;
            }

            public C16994k getProjectClassificationBytes() {
                Object obj = this.projectClassification_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.projectClassification_ = k;
                return k;
            }

            public long getRequestId() {
                return this.requestId_;
            }

            public String getSceneTag() {
                Object obj = this.sceneTag_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C16994k kVar = (C16994k) obj;
                String u = kVar.mo18752u();
                if (kVar.mo18744n()) {
                    this.sceneTag_ = u;
                }
                return u;
            }

            public C16994k getSceneTagBytes() {
                Object obj = this.sceneTag_;
                if (!(obj instanceof String)) {
                    return (C16994k) obj;
                }
                C16994k k = C16994k.m16791k((String) obj);
                this.sceneTag_ = k;
                return k;
            }

            public boolean hasAttachmentsJson() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasCreationId() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasProjectClassification() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasRequestId() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasSceneTag() {
                return (this.bitField0_ & 4) != 0;
            }

            public C23872m0.C23880f internalGetFieldAccessorTable() {
                C23872m0.C23880f access$8500 = MJAnalyticsS12.f69254x8059c61f;
                access$8500.mo37875c(MJAnalyticsTemplateRecommendation.class, Builder.class);
                return access$8500;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder setAttachmentsJson(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.attachmentsJson_ = str;
                onChanged();
                return this;
            }

            public Builder setAttachmentsJsonBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 16;
                this.attachmentsJson_ = kVar;
                onChanged();
                return this;
            }

            public Builder setCreationId(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.creationId_ = str;
                onChanged();
                return this;
            }

            public Builder setCreationIdBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 2;
                this.creationId_ = kVar;
                onChanged();
                return this;
            }

            public Builder setProjectClassification(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.projectClassification_ = str;
                onChanged();
                return this;
            }

            public Builder setProjectClassificationBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 8;
                this.projectClassification_ = kVar;
                onChanged();
                return this;
            }

            public Builder setRequestId(long j) {
                this.bitField0_ |= 1;
                this.requestId_ = j;
                onChanged();
                return this;
            }

            public Builder setSceneTag(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.sceneTag_ = str;
                onChanged();
                return this;
            }

            public Builder setSceneTagBytes(C16994k kVar) {
                kVar.getClass();
                this.bitField0_ |= 4;
                this.sceneTag_ = kVar;
                onChanged();
                return this;
            }

            private Builder() {
                this.creationId_ = "";
                this.sceneTag_ = "";
                this.projectClassification_ = "";
                this.attachmentsJson_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addRepeatedField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            public MJAnalyticsTemplateRecommendation build() {
                MJAnalyticsTemplateRecommendation buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw C23803a.C23804a.newUninitializedMessageException(buildPartial);
            }

            public MJAnalyticsTemplateRecommendation buildPartial() {
                int i;
                MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation = new MJAnalyticsTemplateRecommendation((C23872m0.C23874b) this);
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    long unused = mJAnalyticsTemplateRecommendation.requestId_ = this.requestId_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    i |= 2;
                }
                Object unused2 = mJAnalyticsTemplateRecommendation.creationId_ = this.creationId_;
                if ((i2 & 4) != 0) {
                    i |= 4;
                }
                Object unused3 = mJAnalyticsTemplateRecommendation.sceneTag_ = this.sceneTag_;
                if ((i2 & 8) != 0) {
                    i |= 8;
                }
                Object unused4 = mJAnalyticsTemplateRecommendation.projectClassification_ = this.projectClassification_;
                if ((i2 & 16) != 0) {
                    i |= 16;
                }
                Object unused5 = mJAnalyticsTemplateRecommendation.attachmentsJson_ = this.attachmentsJson_;
                int unused6 = mJAnalyticsTemplateRecommendation.bitField0_ = i;
                onBuilt();
                return mJAnalyticsTemplateRecommendation;
            }

            public Builder clearField(C24025t.C24035g gVar) {
                return (Builder) super.clearField(gVar);
            }

            public MJAnalyticsTemplateRecommendation getDefaultInstanceForType() {
                return MJAnalyticsTemplateRecommendation.getDefaultInstance();
            }

            public Builder setField(C24025t.C24035g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            public Builder setRepeatedField(C24025t.C24035g gVar, int i, Object obj) {
                return (Builder) super.setRepeatedField(gVar, i, obj);
            }

            public final Builder setUnknownFields(C24020s2 s2Var) {
                return (Builder) super.setUnknownFields(s2Var);
            }

            public Builder clearOneof(C24025t.C24042k kVar) {
                return (Builder) super.clearOneof(kVar);
            }

            public final Builder mergeUnknownFields(C24020s2 s2Var) {
                return (Builder) super.mergeUnknownFields(s2Var);
            }

            public Builder clear() {
                super.clear();
                this.requestId_ = 0;
                this.creationId_ = "";
                this.sceneTag_ = "";
                this.projectClassification_ = "";
                this.attachmentsJson_ = "";
                this.bitField0_ = this.bitField0_ & -2 & -3 & -5 & -9 & -17;
                return this;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder mergeFrom(C23836g1 g1Var) {
                if (g1Var instanceof MJAnalyticsTemplateRecommendation) {
                    return mergeFrom((MJAnalyticsTemplateRecommendation) g1Var);
                }
                super.mergeFrom(g1Var);
                return this;
            }

            private Builder(C23872m0.C23876c cVar) {
                super(cVar);
                this.creationId_ = "";
                this.sceneTag_ = "";
                this.projectClassification_ = "";
                this.attachmentsJson_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation) {
                if (mJAnalyticsTemplateRecommendation == MJAnalyticsTemplateRecommendation.getDefaultInstance()) {
                    return this;
                }
                if (mJAnalyticsTemplateRecommendation.hasRequestId()) {
                    setRequestId(mJAnalyticsTemplateRecommendation.getRequestId());
                }
                if (mJAnalyticsTemplateRecommendation.hasCreationId()) {
                    this.bitField0_ |= 2;
                    this.creationId_ = mJAnalyticsTemplateRecommendation.creationId_;
                    onChanged();
                }
                if (mJAnalyticsTemplateRecommendation.hasSceneTag()) {
                    this.bitField0_ |= 4;
                    this.sceneTag_ = mJAnalyticsTemplateRecommendation.sceneTag_;
                    onChanged();
                }
                if (mJAnalyticsTemplateRecommendation.hasProjectClassification()) {
                    this.bitField0_ |= 8;
                    this.projectClassification_ = mJAnalyticsTemplateRecommendation.projectClassification_;
                    onChanged();
                }
                if (mJAnalyticsTemplateRecommendation.hasAttachmentsJson()) {
                    this.bitField0_ |= 16;
                    this.attachmentsJson_ = mJAnalyticsTemplateRecommendation.attachmentsJson_;
                    onChanged();
                }
                mergeUnknownFields(mJAnalyticsTemplateRecommendation.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x001f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsTemplateRecommendation.Builder mergeFrom(com.google.protobuf.C23856l r3, com.google.protobuf.C23806a0 r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.w1<com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation> r1 = com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsTemplateRecommendation.PARSER     // Catch:{ p0 -> 0x0011 }
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch:{ p0 -> 0x0011 }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation r3 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsTemplateRecommendation) r3     // Catch:{ p0 -> 0x0011 }
                    if (r3 == 0) goto L_0x000e
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsTemplateRecommendation) r3)
                L_0x000e:
                    return r2
                L_0x000f:
                    r3 = move-exception
                    goto L_0x001d
                L_0x0011:
                    r3 = move-exception
                    com.google.protobuf.j1 r4 = r3.f68530d     // Catch:{ all -> 0x000f }
                    com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation r4 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsTemplateRecommendation) r4     // Catch:{ all -> 0x000f }
                    java.io.IOException r3 = r3.mo38013j()     // Catch:{ all -> 0x001b }
                    throw r3     // Catch:{ all -> 0x001b }
                L_0x001b:
                    r3 = move-exception
                    r0 = r4
                L_0x001d:
                    if (r0 == 0) goto L_0x0022
                    r2.mergeFrom((com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsTemplateRecommendation) r0)
                L_0x0022:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsTemplateRecommendation.Builder.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation$Builder");
            }
        }

        public static Builder newBuilder(MJAnalyticsTemplateRecommendation mJAnalyticsTemplateRecommendation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mJAnalyticsTemplateRecommendation);
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return PARSER.parseFrom(byteBuffer, a0Var);
        }

        private MJAnalyticsTemplateRecommendation(C23872m0.C23874b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
        }

        public static MJAnalyticsTemplateRecommendation parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsTemplateRecommendation) C23872m0.parseDelimitedWithIOException(PARSER, inputStream, a0Var);
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(C16994k kVar) {
            return PARSER.parseFrom(kVar);
        }

        public MJAnalyticsTemplateRecommendation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(C16994k kVar, C23806a0 a0Var) {
            return PARSER.parseFrom(kVar, a0Var);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        private MJAnalyticsTemplateRecommendation() {
            this.memoizedIsInitialized = -1;
            this.creationId_ = "";
            this.sceneTag_ = "";
            this.projectClassification_ = "";
            this.attachmentsJson_ = "";
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public Builder newBuilderForType(C23872m0.C23876c cVar) {
            return new Builder(cVar);
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(byte[] bArr, C23806a0 a0Var) {
            return PARSER.parseFrom(bArr, a0Var);
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(InputStream inputStream) {
            return (MJAnalyticsTemplateRecommendation) C23872m0.parseWithIOException(PARSER, inputStream);
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MJAnalyticsTemplateRecommendation) C23872m0.parseWithIOException(PARSER, inputStream, a0Var);
        }

        private MJAnalyticsTemplateRecommendation(C23856l lVar, C23806a0 a0Var) {
            this();
            a0Var.getClass();
            C24020s2.C24021a b = C24020s2.m29807b();
            boolean z = false;
            while (!z) {
                try {
                    int F = lVar.mo37757F();
                    if (F != 0) {
                        if (F == 8) {
                            this.bitField0_ |= 1;
                            this.requestId_ = lVar.mo37759H();
                        } else if (F == 18) {
                            C16994k m = lVar.mo37768m();
                            this.bitField0_ |= 2;
                            this.creationId_ = m;
                        } else if (F == 26) {
                            C16994k m2 = lVar.mo37768m();
                            this.bitField0_ |= 4;
                            this.sceneTag_ = m2;
                        } else if (F == 34) {
                            C16994k m3 = lVar.mo37768m();
                            this.bitField0_ |= 8;
                            this.projectClassification_ = m3;
                        } else if (F == 42) {
                            C16994k m4 = lVar.mo37768m();
                            this.bitField0_ |= 16;
                            this.attachmentsJson_ = m4;
                        } else if (!parseUnknownField(lVar, b, a0Var, F)) {
                        }
                    }
                    z = true;
                } catch (C23922p0 e) {
                    e.f68530d = this;
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = this;
                    throw p0Var;
                } catch (Throwable th) {
                    this.unknownFields = b.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = b.build();
            makeExtensionsImmutable();
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(C23856l lVar) {
            return (MJAnalyticsTemplateRecommendation) C23872m0.parseWithIOException(PARSER, lVar);
        }

        public static MJAnalyticsTemplateRecommendation parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MJAnalyticsTemplateRecommendation) C23872m0.parseWithIOException(PARSER, lVar, a0Var);
        }
    }

    public interface MJAnalyticsTemplateRecommendationOrBuilder extends C23896m1 {
        /* synthetic */ List<String> findInitializationErrors();

        /* synthetic */ Map<C24025t.C24035g, Object> getAllFields();

        String getAttachmentsJson();

        C16994k getAttachmentsJsonBytes();

        String getCreationId();

        C16994k getCreationIdBytes();

        /* synthetic */ C23836g1 getDefaultInstanceForType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ C24025t.C24027b getDescriptorForType();

        /* synthetic */ Object getField(C24025t.C24035g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar);

        String getProjectClassification();

        C16994k getProjectClassificationBytes();

        /* synthetic */ Object getRepeatedField(C24025t.C24035g gVar, int i);

        /* synthetic */ int getRepeatedFieldCount(C24025t.C24035g gVar);

        long getRequestId();

        String getSceneTag();

        C16994k getSceneTagBytes();

        /* synthetic */ C24020s2 getUnknownFields();

        boolean hasAttachmentsJson();

        boolean hasCreationId();

        /* synthetic */ boolean hasField(C24025t.C24035g gVar);

        /* synthetic */ boolean hasOneof(C24025t.C24042k kVar);

        boolean hasProjectClassification();

        boolean hasRequestId();

        boolean hasSceneTag();

        /* synthetic */ boolean isInitialized();
    }

    public enum MJAnalyticsTemplateSourceType implements C23908o0.C23911c {
        UNKNOWN(0),
        FIXED(1),
        RECOMMEND_V2(2),
        RECOMMEND_V3(3);
        
        public static final int FIXED_VALUE = 1;
        public static final int RECOMMEND_V2_VALUE = 2;
        public static final int RECOMMEND_V3_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        private static final MJAnalyticsTemplateSourceType[] VALUES = null;
        private static final C23908o0.C23912d<MJAnalyticsTemplateSourceType> internalValueMap = null;
        private final int value;

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<MJAnalyticsTemplateSourceType>() {
                public MJAnalyticsTemplateSourceType findValueByNumber(int i) {
                    return MJAnalyticsTemplateSourceType.forNumber(i);
                }
            };
            VALUES = values();
        }

        private MJAnalyticsTemplateSourceType(int i) {
            this.value = i;
        }

        public static MJAnalyticsTemplateSourceType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FIXED;
            }
            if (i == 2) {
                return RECOMMEND_V2;
            }
            if (i != 3) {
                return null;
            }
            return RECOMMEND_V3;
        }

        public static final C24025t.C24033e getDescriptor() {
            return MJAnalyticsS12.getDescriptor().mo38346f().get(2);
        }

        public static C23908o0.C23912d<MJAnalyticsTemplateSourceType> internalGetValueMap() {
            return internalValueMap;
        }

        public final C24025t.C24033e getDescriptorForType() {
            return getDescriptor();
        }

        public final int getNumber() {
            return this.value;
        }

        public final C24025t.C24034f getValueDescriptor() {
            return getDescriptor().mo38334h().get(ordinal());
        }

        @Deprecated
        public static MJAnalyticsTemplateSourceType valueOf(int i) {
            return forNumber(i);
        }

        public static MJAnalyticsTemplateSourceType valueOf(C24025t.C24034f fVar) {
            if (fVar.f69101h == getDescriptor()) {
                return VALUES[fVar.f69097d];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        C24025t.C24027b bVar = getDescriptor().mo38347g().get(0);
        internal_static_MJAnalyticsEvent_descriptor = bVar;
        internal_static_MJAnalyticsEvent_fieldAccessorTable = new C23872m0.C23880f(bVar, new String[]{"Name", "ErrorCode", "ErrorMessage", "Keys", "Values", "Expands", "TimeStamp"});
        C24025t.C24027b bVar2 = getDescriptor().mo38347g().get(1);
        internal_static_MJAnalyticsAsset_descriptor = bVar2;
        internal_static_MJAnalyticsAsset_fieldAccessorTable = new C23872m0.C23880f(bVar2, new String[]{"MediaType", "DurationMs", "AspectRatio", "AiTags", "OriginId", "IsOverThreshold", "VideoClassAudioLabels", "ImageClassLabels", "ImageClassExceeds", "VideoClassVisualLabels", "VideoClassVisualExceeds"});
        C24025t.C24027b bVar3 = getDescriptor().mo38347g().get(2);
        internal_static_MJAnalyticsPreviewMusicAction_descriptor = bVar3;
        internal_static_MJAnalyticsPreviewMusicAction_fieldAccessorTable = new C23872m0.C23880f(bVar3, new String[]{"PreviewMusicId", "PreviewMusicSourceType", "PreviewMusicSongName", "PreviewDurationMs", "TimelineDurationMs"});
        C24025t.C24027b bVar4 = getDescriptor().mo38347g().get(3);
        internal_static_MJAnalyticsPreviewTemplateAction_descriptor = bVar4;
        f69253xf8a5f24e = new C23872m0.C23880f(bVar4, new String[]{"PreviewTemplateId", "PreviewTemplateSourceType", "PreviewDurationMs", "MusicActions"});
        C24025t.C24027b bVar5 = getDescriptor().mo38347g().get(4);
        internal_static_MJAnalyticsTemplateRecommendation_descriptor = bVar5;
        f69254x8059c61f = new C23872m0.C23880f(bVar5, new String[]{"RequestId", "CreationId", "SceneTag", "ProjectClassification", "AttachmentsJson"});
        C24025t.C24027b bVar6 = getDescriptor().mo38347g().get(5);
        internal_static_MJAnalyticsMovieSession_descriptor = bVar6;
        internal_static_MJAnalyticsMovieSession_fieldAccessorTable = new C23872m0.C23880f(bVar6, new String[]{"Assets", "TemplateActions", "TotalPreviewDurationMs", "ExportDurationMs", "ExportTemplateId", "ExportMusicId", "TemplateRecommendation", "ExportMusicSongName", "ExportMusicSourceType", "ExportTemplateSourceType", "FixedTemplateIds"});
    }

    private MJAnalyticsS12() {
    }

    public static C24025t.C24038h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }

    public static void registerAllExtensions(C24071y yVar) {
        registerAllExtensions((C23806a0) yVar);
    }
}
