package com.tencent.maas.instamovie;

public class MJTemplateSettings {
    private final boolean shouldAutoRecommendBGM;

    public MJTemplateSettings(boolean z) {
        this.shouldAutoRecommendBGM = z;
    }

    public boolean shouldAutoRecommendBGM() {
        return this.shouldAutoRecommendBGM;
    }
}
