package com.tencent.maas.instamovie;

import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.model.time.MJTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MJMovieOptions {
    private float blankTemplatePreviewOffsetPercent;
    private List<String> defaultTemplateIDs;
    private boolean isAIAnalysisEnabled;
    private boolean isBGMMuted;
    private boolean isLyricEnabled;
    private boolean isOSTMuted;
    private boolean isVideoTranscodingOptimEnabled;
    private MJTime maxDuration;
    private float preprocTimeoutLimitSeconds;
    private MJTime retainOriginalMediaDurationThreshold;
    private boolean shouldAdjustBlankTemplatePreviewOffset;
    private boolean shouldAutoRecommendBGM;
    private boolean shouldRecommendBGMForRecommendedTemplates;
    private boolean shouldRetainOriginalMediaDuration;
    private DimensionLevel videoTranscodingOptimDimensionLevel;

    public MJMovieOptions(boolean z, boolean z2, boolean z3) {
        this.shouldRecommendBGMForRecommendedTemplates = false;
        this.shouldAutoRecommendBGM = false;
        this.shouldRetainOriginalMediaDuration = false;
        MJTime mJTime = MJTime.PositiveInfinityTime;
        this.retainOriginalMediaDurationThreshold = mJTime;
        this.defaultTemplateIDs = Collections.emptyList();
        this.isLyricEnabled = z;
        this.isOSTMuted = z2;
        this.isBGMMuted = z3;
        this.shouldAdjustBlankTemplatePreviewOffset = false;
        this.blankTemplatePreviewOffsetPercent = 0.0f;
        this.isVideoTranscodingOptimEnabled = true;
        this.videoTranscodingOptimDimensionLevel = null;
        this.isAIAnalysisEnabled = true;
        this.preprocTimeoutLimitSeconds = Float.POSITIVE_INFINITY;
        this.maxDuration = mJTime;
    }

    private boolean hasVideoTranscodingOptimDimensionLevel() {
        return this.videoTranscodingOptimDimensionLevel != null;
    }

    private int videoTranscodingOptimDimensionLevel() {
        DimensionLevel dimensionLevel = this.videoTranscodingOptimDimensionLevel;
        if (dimensionLevel == null) {
            return -1;
        }
        return dimensionLevel.getId();
    }

    public float blankTemplatePreviewOffsetPercent() {
        return this.blankTemplatePreviewOffsetPercent;
    }

    public List<String> getDefaultTemplateIDs() {
        return this.defaultTemplateIDs;
    }

    public MJTime getMaxDuration() {
        return this.maxDuration;
    }

    public MJTime getRetainOriginalMediaDurationThreshold() {
        return this.retainOriginalMediaDurationThreshold;
    }

    public boolean isAIAnalysisEnabled() {
        return this.isAIAnalysisEnabled;
    }

    public boolean isBGMMuted() {
        return this.isBGMMuted;
    }

    public boolean isLyricEnabled() {
        return this.isLyricEnabled;
    }

    public boolean isOSTMuted() {
        return this.isOSTMuted;
    }

    public boolean isVideoTranscodingOptimEnabled() {
        return this.isVideoTranscodingOptimEnabled;
    }

    public float preprocTimeoutLimitSeconds() {
        return this.preprocTimeoutLimitSeconds;
    }

    public void setDefaultTemplateIDs(List<String> list) {
        this.defaultTemplateIDs = list;
    }

    public void setMaxDuration(MJTime mJTime) {
        this.maxDuration = mJTime;
    }

    public void setRetainOriginalMediaDurationThreshold(MJTime mJTime) {
        this.retainOriginalMediaDurationThreshold = mJTime;
    }

    public void setShouldAutoRecommendBGM(boolean z) {
        this.shouldAutoRecommendBGM = z;
    }

    public void setShouldRecommendBGMForRecommendedTemplates(boolean z) {
        this.shouldRecommendBGMForRecommendedTemplates = z;
    }

    public void setShouldRetainOriginalMediaDuration(boolean z) {
        this.shouldRetainOriginalMediaDuration = z;
    }

    public boolean shouldAdjustBlankTemplatePreviewOffset() {
        return this.shouldAdjustBlankTemplatePreviewOffset;
    }

    public boolean shouldAutoRecommendBGM() {
        return this.shouldAutoRecommendBGM;
    }

    public boolean shouldRecommendBGMForRecommendedTemplates() {
        return this.shouldRecommendBGMForRecommendedTemplates;
    }

    public boolean shouldRetainOriginalMediaDuration() {
        return this.shouldRetainOriginalMediaDuration;
    }

    public MJMovieOptions(boolean z, boolean z2, boolean z3, boolean z4, float f) {
        this.shouldRecommendBGMForRecommendedTemplates = false;
        this.shouldAutoRecommendBGM = false;
        this.shouldRetainOriginalMediaDuration = false;
        MJTime mJTime = MJTime.PositiveInfinityTime;
        this.retainOriginalMediaDurationThreshold = mJTime;
        this.defaultTemplateIDs = Collections.emptyList();
        this.isLyricEnabled = z;
        this.isOSTMuted = z2;
        this.isBGMMuted = z3;
        this.shouldAdjustBlankTemplatePreviewOffset = z4;
        this.blankTemplatePreviewOffsetPercent = f;
        this.isVideoTranscodingOptimEnabled = true;
        this.videoTranscodingOptimDimensionLevel = null;
        this.isAIAnalysisEnabled = true;
        this.preprocTimeoutLimitSeconds = Float.POSITIVE_INFINITY;
        this.maxDuration = mJTime;
    }

    public MJMovieOptions(boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, DimensionLevel dimensionLevel, boolean z6, float f2) {
        this.shouldRecommendBGMForRecommendedTemplates = false;
        this.shouldAutoRecommendBGM = false;
        this.shouldRetainOriginalMediaDuration = false;
        MJTime mJTime = MJTime.PositiveInfinityTime;
        this.retainOriginalMediaDurationThreshold = mJTime;
        this.defaultTemplateIDs = Collections.emptyList();
        this.isLyricEnabled = z;
        this.isOSTMuted = z2;
        this.isBGMMuted = z3;
        this.shouldAdjustBlankTemplatePreviewOffset = z4;
        this.blankTemplatePreviewOffsetPercent = f;
        this.isVideoTranscodingOptimEnabled = z5;
        this.videoTranscodingOptimDimensionLevel = dimensionLevel;
        this.isAIAnalysisEnabled = z6;
        this.preprocTimeoutLimitSeconds = f2;
        this.maxDuration = mJTime;
    }

    private MJMovieOptions(boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, int i, boolean z6, float f2) {
        DimensionLevel dimensionLevel;
        this.shouldRecommendBGMForRecommendedTemplates = false;
        this.shouldAutoRecommendBGM = false;
        this.shouldRetainOriginalMediaDuration = false;
        MJTime mJTime = MJTime.PositiveInfinityTime;
        this.retainOriginalMediaDurationThreshold = mJTime;
        this.defaultTemplateIDs = Collections.emptyList();
        this.isLyricEnabled = z;
        this.isOSTMuted = z2;
        this.isBGMMuted = z3;
        this.shouldAdjustBlankTemplatePreviewOffset = z4;
        this.blankTemplatePreviewOffsetPercent = f;
        this.isVideoTranscodingOptimEnabled = z5;
        if (i == -1) {
            dimensionLevel = null;
        } else {
            dimensionLevel = DimensionLevel.valueOf(i);
        }
        this.videoTranscodingOptimDimensionLevel = dimensionLevel;
        this.isAIAnalysisEnabled = z6;
        this.preprocTimeoutLimitSeconds = f2;
        this.maxDuration = mJTime;
    }

    private MJMovieOptions(boolean z, boolean z2, boolean z3, boolean z4, float f, boolean z5, int i, boolean z6, float f2, MJTime mJTime, boolean z7, boolean z8, boolean z9, MJTime mJTime2, String[] strArr) {
        DimensionLevel dimensionLevel;
        String[] strArr2 = strArr;
        this.shouldRecommendBGMForRecommendedTemplates = false;
        this.shouldAutoRecommendBGM = false;
        this.shouldRetainOriginalMediaDuration = false;
        this.retainOriginalMediaDurationThreshold = MJTime.PositiveInfinityTime;
        this.defaultTemplateIDs = Collections.emptyList();
        this.isLyricEnabled = z;
        this.isOSTMuted = z2;
        this.isBGMMuted = z3;
        this.shouldAdjustBlankTemplatePreviewOffset = z4;
        this.blankTemplatePreviewOffsetPercent = f;
        this.isVideoTranscodingOptimEnabled = z5;
        if (i == -1) {
            dimensionLevel = null;
        } else {
            dimensionLevel = DimensionLevel.valueOf(i);
        }
        this.videoTranscodingOptimDimensionLevel = dimensionLevel;
        this.isAIAnalysisEnabled = z6;
        this.preprocTimeoutLimitSeconds = f2;
        this.maxDuration = mJTime;
        this.shouldRecommendBGMForRecommendedTemplates = z7;
        this.shouldAutoRecommendBGM = z8;
        this.shouldRetainOriginalMediaDuration = z9;
        this.retainOriginalMediaDurationThreshold = mJTime2;
        ArrayList arrayList = new ArrayList(strArr2.length);
        Collections.addAll(arrayList, strArr2);
        this.defaultTemplateIDs = arrayList;
    }
}
