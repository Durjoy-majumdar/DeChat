package com.tencent.maas.instamovie;

public class MJRecommendOptions {
    public static final String SCENE_FINDER = "TemplateRecommendv2";
    public static final String SCENE_MOMENT = "MomentsTemplateRecommendv2";
    private Mode mode;
    private String scene;

    public enum Mode {
        None(0),
        Foreground(1),
        Background(2);
        
        private final int value;

        private Mode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public MJRecommendOptions(Mode mode2, String str) {
        this.mode = mode2;
        this.scene = str;
    }

    public int getMode() {
        return this.mode.getValue();
    }

    public String getScene() {
        return this.scene;
    }
}
