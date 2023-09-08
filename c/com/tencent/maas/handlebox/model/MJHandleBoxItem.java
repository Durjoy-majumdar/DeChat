package com.tencent.maas.handlebox.model;

import android.graphics.Bitmap;
import com.tencent.maas.base.Vec2;

public class MJHandleBoxItem {
    private final MJHandleBoxActionType actionType;
    private final Bitmap image;
    private final Vec2 imageSize;
    private final MJRectCorner rectCorner;

    public enum MJHandleBoxActionType {
        MJHandleBoxActionTypeNone(0),
        MJHandleBoxActionTypeDelete(1),
        MJHandleBoxActionTypeFlip(2),
        MJHandleBoxActionTypeTransform(3);
        
        private final int value;

        private MJHandleBoxActionType(int i) {
            this.value = i;
        }

        public static MJHandleBoxActionType fromInt(int i) {
            if (i == 0) {
                return MJHandleBoxActionTypeNone;
            }
            if (i == 1) {
                return MJHandleBoxActionTypeDelete;
            }
            if (i == 2) {
                return MJHandleBoxActionTypeFlip;
            }
            if (i == 3) {
                return MJHandleBoxActionTypeTransform;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum MJRectCorner {
        MJRectCornerTopLeft(0),
        MJRectCornerBottomLeft(1),
        MJRectCornerTopRight(2),
        MJRectCornerBottomRight(3),
        MJRectCornerAllCorners(4);
        
        private final int value;

        private MJRectCorner(int i) {
            this.value = i;
        }

        public static MJRectCorner fromInt(int i) {
            if (i == 0) {
                return MJRectCornerTopLeft;
            }
            if (i == 1) {
                return MJRectCornerTopRight;
            }
            if (i == 2) {
                return MJRectCornerBottomLeft;
            }
            if (i == 3) {
                return MJRectCornerBottomRight;
            }
            if (i == 4) {
                return MJRectCornerAllCorners;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i);
        }

        public int getValue() {
            return this.value;
        }
    }

    public MJHandleBoxItem(Bitmap bitmap, Vec2 vec2, MJRectCorner mJRectCorner, MJHandleBoxActionType mJHandleBoxActionType) {
        this.image = bitmap;
        this.imageSize = vec2;
        this.rectCorner = mJRectCorner;
        this.actionType = mJHandleBoxActionType;
    }

    public int getActionType() {
        return this.actionType.getValue();
    }

    public Bitmap getImage() {
        return this.image;
    }

    public Vec2 getImageSize() {
        return this.imageSize;
    }

    public int getRectCorner() {
        return this.rectCorner.getValue();
    }

    public MJHandleBoxItem(Bitmap bitmap, Vec2 vec2, int i, int i2) {
        this.image = bitmap;
        this.imageSize = vec2;
        this.rectCorner = MJRectCorner.fromInt(i);
        this.actionType = MJHandleBoxActionType.fromInt(i2);
    }
}
