package com.tencent.maas.model.composing;

public class MJComposingDefines {
    public static final String MJLayerStyleNameBackgroundColor = "LayerBackgroundColor";
    public static final String MJLayerStyleNameBorderColor = "LayerBorderColor";
    public static final String MJLayerStyleNameBorderWidth = "LayerBorderWidth";
    public static final String MJLayerStyleNameCornerRadius = "LayerCornerRadius";
    public static final String MJLayerStyleNameEdgeInsets = "LayerEdgeInsets";
    public static final String MJTextStyleNameFillColor = "TextFillColor";
    public static final String MJTextStyleNameFontFilePath = "FontFilePath";
    public static final String MJTextStyleNameFontName = "FontName";
    public static final String MJTextStyleNameFontSize = "FontSize";
    public static final String MJTextStyleNameShadowColor = "TextShadowColor";
    public static final String MJTextStyleNameShadowOffset = "TextShadowOffset";
    public static final String MJTextStyleNameShadowRadius = "TextShadowRadius";
    public static final String MJTextStyleNameStrokeColor = "TextStrokeColor";
    public static final String MJTextStyleNameStrokeWidth = "TextStrokeWidth";

    public enum MJCanvasOriginType {
        None(-1),
        TopLeft(0),
        BottomLeft(1);
        
        private final int value;

        private MJCanvasOriginType(int i) {
            this.value = i;
        }

        public static MJCanvasOriginType fromInt(int i) {
            for (MJCanvasOriginType mJCanvasOriginType : values()) {
                if (mJCanvasOriginType.getValue() == i) {
                    return mJCanvasOriginType;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MJContentFlipMode {
        None(0),
        Horizontal(1),
        Vertical(2),
        HorizontalAndVertical(3);
        
        private final int value;

        private MJContentFlipMode(int i) {
            this.value = i;
        }

        public static MJContentFlipMode fromInt(int i) {
            for (MJContentFlipMode mJContentFlipMode : values()) {
                if (mJContentFlipMode.getValue() == i) {
                    return mJContentFlipMode;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MJContentScaleMode {
        None(-1),
        Center(0),
        Fill(1),
        AspectFit(2),
        AspectFill(3);
        
        private final int value;

        private MJContentScaleMode(int i) {
            this.value = i;
        }

        public static MJContentScaleMode fromInt(int i) {
            for (MJContentScaleMode mJContentScaleMode : values()) {
                if (mJContentScaleMode.getValue() == i) {
                    return mJContentScaleMode;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MJRotationMode {
        None(0),
        CCW90(1),
        CW180(2),
        CW90(3);
        
        private final int value;

        private MJRotationMode(int i) {
            this.value = i;
        }

        public static MJRotationMode fromInt(int i) {
            for (MJRotationMode mJRotationMode : values()) {
                if (mJRotationMode.getValue() == i) {
                    return mJRotationMode;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MJStickerDecoderType {
        Platform(0),
        WxAM(1);
        
        private final int value;

        private MJStickerDecoderType(int i) {
            this.value = i;
        }

        public static MJStickerDecoderType fromInt(int i) {
            for (MJStickerDecoderType mJStickerDecoderType : values()) {
                if (mJStickerDecoderType.getValue() == i) {
                    return mJStickerDecoderType;
                }
            }
            return Platform;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MJTimingFillMode {
        None(0),
        Looping(1),
        LastFrame(2);
        
        private final int value;

        private MJTimingFillMode(int i) {
            this.value = i;
        }

        public static MJTimingFillMode fromInt(int i) {
            for (MJTimingFillMode mJTimingFillMode : values()) {
                if (mJTimingFillMode.getValue() == i) {
                    return mJTimingFillMode;
                }
            }
            return None;
        }

        public int getValue() {
            return this.value;
        }
    }
}
