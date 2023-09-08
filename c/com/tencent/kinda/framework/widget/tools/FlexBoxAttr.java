package com.tencent.kinda.framework.widget.tools;

import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaNodeFactory;
import com.tencent.kinda.framework.widget.base.ViewStyleMapper;
import com.tencent.kinda.gen.Align;
import com.tencent.kinda.gen.FlexDirection;
import com.tencent.kinda.gen.Justify;
import com.tencent.kinda.gen.PositionType;
import com.tencent.kinda.gen.Wrap;

public class FlexBoxAttr {
    public static final String TAG = "MicroMsg.FlexBoxAttr";
    public static final float UNDEFINED = 1.0E21f;
    public Align alignContent;
    public Align alignItems;
    public Align alignSelf;
    public float aspectRatio;
    public float bottom;
    public float bottomPercent;
    public float flexBasis;
    public FlexDirection flexDirection;
    public float flexGrow;
    public float flexShrink;
    public Wrap flexWrap;
    public float height = 1.0E21f;
    public float heightPercent;
    private IFlexBoxChange iFlexBoxChange;
    public Justify justifyContent;
    public float left;
    public float leftPercent;
    public float marginBottom;
    public float marginBottomPercent;
    public float marginLeft;
    public float marginLeftPercent;
    public float marginRight;
    public float marginRightPercent;
    public float marginTop;
    public float marginTopPercent;
    public float maxHeight;
    public float maxWidth;
    public float minHeight;
    public float minWidth;
    public float paddingBottom;
    public float paddingBottomPercent;
    public float paddingLeft;
    public float paddingLeftPercent;
    public float paddingRight;
    public float paddingRightPercent;
    public float paddingTop;
    public float paddingTopPercent;
    public PositionType positionType;
    public float right;
    public float rightPercent;
    public String testId;
    public float top;
    public float topPercent;
    public int visibility;
    public float width = 1.0E21f;
    public float widthPercent;
    public YogaNode yogaNode = YogaNodeFactory.create();

    public interface IFlexBoxChange {
        void onChange();
    }

    public FlexBoxAttr() {
        applyNodeDefaultParam();
    }

    private void applyNodeDefaultParam() {
        YogaNode create = YogaNodeFactory.create();
        this.yogaNode = create;
        create.reset();
    }

    public static boolean isUndefined(float f) {
        return Float.compare(f, 1.0E9f) >= 0 || Float.compare(f, -1.0E9f) <= 0;
    }

    public void autoHeight() {
        node().setHeightAuto();
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void autoWidth() {
        node().setWidthAuto();
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public Align getAlignContent() {
        return this.alignContent;
    }

    public Align getAlignItems() {
        return this.alignItems;
    }

    public Align getAlignSelf() {
        return this.alignSelf;
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getBottomPercent() {
        return this.bottomPercent;
    }

    public float getFlexBasis() {
        return this.flexBasis;
    }

    public FlexDirection getFlexDirection() {
        return this.flexDirection;
    }

    public float getFlexGrow() {
        return this.flexGrow;
    }

    public float getFlexShrink() {
        return this.flexShrink;
    }

    public Wrap getFlexWrap() {
        return this.flexWrap;
    }

    public float getHeight() {
        return isUndefined(this.height) ? MMKViewUtil.pxToDp(KindaContext.get(), this.yogaNode.getLayoutHeight()) : this.height;
    }

    public float getHeightPercent() {
        return this.heightPercent;
    }

    public Justify getJustifyContent() {
        return this.justifyContent;
    }

    public float getLeft() {
        return this.left;
    }

    public float getLeftPercent() {
        return this.leftPercent;
    }

    public float getMarginBottom() {
        return this.marginBottom;
    }

    public float getMarginBottomPercent() {
        return this.marginBottomPercent;
    }

    public float getMarginLeft() {
        return this.marginLeft;
    }

    public float getMarginLeftPercent() {
        return this.marginLeftPercent;
    }

    public float getMarginRight() {
        return this.marginRight;
    }

    public float getMarginRightPercent() {
        return this.marginRightPercent;
    }

    public float getMarginTop() {
        return this.marginTop;
    }

    public float getMarginTopPercent() {
        return this.marginTopPercent;
    }

    public float getMaxHeight() {
        return this.maxHeight;
    }

    public float getMaxWidth() {
        return this.maxWidth;
    }

    public float getMinHeight() {
        return this.minHeight;
    }

    public float getMinWidth() {
        return this.minWidth;
    }

    public float getPaddingBottom() {
        return this.paddingBottom;
    }

    public float getPaddingBottomPercent() {
        return this.paddingBottomPercent;
    }

    public float getPaddingLeft() {
        return this.paddingLeft;
    }

    public float getPaddingLeftPercent() {
        return this.paddingLeftPercent;
    }

    public float getPaddingRight() {
        return this.paddingRight;
    }

    public float getPaddingRightPercent() {
        return this.paddingRightPercent;
    }

    public float getPaddingTop() {
        return this.paddingTop;
    }

    public float getPaddingTopPercent() {
        return this.paddingTopPercent;
    }

    public PositionType getPositionType() {
        return this.positionType;
    }

    public float getRight() {
        return this.right;
    }

    public float getRightPercent() {
        return this.rightPercent;
    }

    public String getTestId() {
        return this.testId;
    }

    public float getTop() {
        return this.top;
    }

    public float getTopPercent() {
        return this.topPercent;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public float getWidth() {
        return isUndefined(this.width) ? MMKViewUtil.pxToDp(KindaContext.get(), this.yogaNode.getLayoutWidth()) : this.width;
    }

    public float getWidthPercent() {
        return this.widthPercent;
    }

    public YogaNode node() {
        return this.yogaNode;
    }

    public void setAlignContent(Align align) {
        this.alignContent = align;
        node().setAlignContent(ViewStyleMapper.mapYGAlign(align));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setAlignItems(Align align) {
        this.alignItems = align;
        node().setAlignItems(ViewStyleMapper.mapYGAlign(align));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setAlignSelf(Align align) {
        this.alignSelf = align;
        node().setAlignSelf(ViewStyleMapper.mapYGAlign(align));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setAspectRatio(float f) {
        this.aspectRatio = f;
        if (f > 0.0f) {
            node().setAspectRatio(this.aspectRatio);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setBottom(float f) {
        this.bottom = f;
        node().setPosition(YogaEdge.BOTTOM, MMKViewUtil.dpToPx(KindaContext.get(), f));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setBottomPercent(float f) {
        this.bottomPercent = f;
        node().setPositionPercent(YogaEdge.BOTTOM, f);
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setFlexBasis(float f) {
        this.flexBasis = f;
        if (f > 0.0f) {
            node().setWidth(MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setFlexDirection(FlexDirection flexDirection2) {
        this.flexDirection = flexDirection2;
        node().setFlexDirection(ViewStyleMapper.mapFlexDirection(flexDirection2));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setFlexGrow(float f) {
        this.flexGrow = f;
        if (f >= 0.0f) {
            node().setFlexGrow(this.flexGrow);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setFlexShrink(float f) {
        this.flexShrink = f;
        if (f >= 0.0f) {
            node().setFlexShrink(this.flexShrink);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setFlexWrap(Wrap wrap) {
        this.flexWrap = wrap;
        node().setWrap(ViewStyleMapper.mapYGWrap(wrap));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setHeight(float f) {
        this.height = f;
        if (f > 0.0f) {
            node().setHeight(MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setHeightPercent(float f) {
        this.heightPercent = f;
        if (f > 0.0f) {
            node().setHeightPercent(f);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setJustifyContent(Justify justify) {
        this.justifyContent = justify;
        node().setJustifyContent(ViewStyleMapper.mapJustifyContent(justify));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setLeft(float f) {
        this.left = f;
        node().setPosition(YogaEdge.LEFT, MMKViewUtil.dpToPx(KindaContext.get(), f));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setLeftPercent(float f) {
        this.leftPercent = f;
        node().setPositionPercent(YogaEdge.LEFT, f);
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMarginBottom(float f) {
        this.marginBottom = f;
        node().setMargin(YogaEdge.BOTTOM, MMKViewUtil.dpToPx(KindaContext.get(), f));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMarginBottomPercent(float f) {
        this.marginBottomPercent = f;
        node().setMarginPercent(YogaEdge.BOTTOM, f);
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMarginLeft(float f) {
        this.marginLeft = f;
        node().setMargin(YogaEdge.LEFT, MMKViewUtil.dpToPx(KindaContext.get(), f));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMarginLeftPercent(float f) {
        this.marginLeftPercent = f;
        node().setMarginPercent(YogaEdge.LEFT, f);
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMarginRight(float f) {
        this.marginRight = f;
        node().setMargin(YogaEdge.RIGHT, MMKViewUtil.dpToPx(KindaContext.get(), f));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMarginRightPercent(float f) {
        this.marginRightPercent = f;
        node().setMarginPercent(YogaEdge.RIGHT, f);
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMarginTop(float f) {
        this.marginTop = f;
        node().setMargin(YogaEdge.TOP, MMKViewUtil.dpToPx(KindaContext.get(), f));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMarginTopPercent(float f) {
        this.marginTopPercent = f;
        node().setMarginPercent(YogaEdge.TOP, f);
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setMaxHeight(float f) {
        this.maxHeight = f;
        if (f > 0.0f) {
            node().setMaxHeight(MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setMaxWidth(float f) {
        this.maxWidth = f;
        if (f > 0.0f) {
            node().setMaxWidth(MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setMinHeight(float f) {
        this.minHeight = f;
        if (f > 0.0f) {
            node().setMinHeight(MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setMinWidth(float f) {
        this.minWidth = f;
        if (f > 0.0f) {
            node().setMinWidth(MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPaddingBottom(float f) {
        this.paddingBottom = f;
        if (f >= 0.0f) {
            node().setPadding(YogaEdge.BOTTOM, MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPaddingBottomPercent(float f) {
        this.paddingBottomPercent = f;
        if (this.paddingBottom > 0.0f) {
            node().setPadding(YogaEdge.BOTTOM, f);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPaddingLeft(float f) {
        this.paddingLeft = f;
        if (f >= 0.0f) {
            node().setPadding(YogaEdge.LEFT, MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPaddingLeftPercent(float f) {
        this.paddingLeftPercent = f;
        if (this.paddingLeft > 0.0f) {
            node().setPaddingPercent(YogaEdge.LEFT, f);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPaddingRight(float f) {
        this.paddingRight = f;
        if (f >= 0.0f) {
            node().setPadding(YogaEdge.RIGHT, MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPaddingRightPercent(float f) {
        this.paddingRightPercent = f;
        if (this.paddingRight > 0.0f) {
            node().setPadding(YogaEdge.RIGHT, f);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPaddingTop(float f) {
        this.paddingTop = f;
        if (f >= 0.0f) {
            node().setPadding(YogaEdge.TOP, MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPaddingTopPercent(float f) {
        this.paddingTopPercent = f;
        if (this.paddingTop > 0.0f) {
            node().setPaddingPercent(YogaEdge.TOP, f);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setPositionType(PositionType positionType2) {
        this.positionType = positionType2;
        node().setPositionType(ViewStyleMapper.mapPositionType(positionType2));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setRight(float f) {
        this.right = f;
        node().setPosition(YogaEdge.RIGHT, MMKViewUtil.dpToPx(KindaContext.get(), f));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setRightPercent(float f) {
        this.rightPercent = f;
        node().setPositionPercent(YogaEdge.RIGHT, f);
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setTestId(String str) {
        this.testId = str;
    }

    public void setTop(float f) {
        this.top = f;
        node().setPosition(YogaEdge.TOP, MMKViewUtil.dpToPx(KindaContext.get(), f));
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setTopPercent(float f) {
        this.topPercent = f;
        node().setPositionPercent(YogaEdge.TOP, f);
        IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
        if (iFlexBoxChange2 != null) {
            iFlexBoxChange2.onChange();
        }
    }

    public void setVisibility(int i) {
        this.visibility = i;
    }

    public void setWidth(float f) {
        this.width = f;
        if (f > 0.0f) {
            node().setWidth(MMKViewUtil.dpToPx(KindaContext.get(), f));
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setWidthPercent(float f) {
        this.widthPercent = f;
        if (f > 0.0f) {
            node().setWidthPercent(f);
            IFlexBoxChange iFlexBoxChange2 = this.iFlexBoxChange;
            if (iFlexBoxChange2 != null) {
                iFlexBoxChange2.onChange();
            }
        }
    }

    public void setYogaNode(YogaNode yogaNode2) {
        this.yogaNode = yogaNode2;
    }

    public FlexBoxAttr(IFlexBoxChange iFlexBoxChange2) {
        this.iFlexBoxChange = iFlexBoxChange2;
        applyNodeDefaultParam();
    }
}
