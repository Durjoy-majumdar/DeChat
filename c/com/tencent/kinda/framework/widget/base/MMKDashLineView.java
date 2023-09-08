package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KDashLineView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;

public class MMKDashLineView extends MMKView<LinearLayout> implements KDashLineView {
    private LinearLayout contentView;
    private boolean isVertical = false;
    private DynamicColor mDashColor = new DynamicColor(-1, 0);
    private float mDashWidth = ((float) C74942w4.m89784a(this.mContext, 2));
    private View mLine;

    public DynamicColor getDashColor() {
        return this.mDashColor;
    }

    public float getDashWidth() {
        return this.mDashWidth;
    }

    public boolean getVertical() {
        return this.isVertical;
    }

    public void setDashColor(DynamicColor dynamicColor) {
        this.mDashColor = dynamicColor;
    }

    public void setDashWidth(float f) {
        this.mDashWidth = f;
    }

    public void setVertical(boolean z) {
        this.isVertical = z;
        if (z) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            this.contentView.setGravity(17);
            this.contentView.setLayoutParams(layoutParams);
            View findViewById = this.contentView.findViewById(C67448R.C67449id.f361855order_info_tinyapp_splitter_1);
            this.mLine = findViewById;
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            layoutParams2.width = C74942w4.m89784a(this.mContext, Math.round(getHeight()));
            layoutParams2.height = -1;
            Drawable drawable = this.mContext.getResources().getDrawable(C0966R.C0969drawable.f4508el);
            drawable.setTint((int) ColorUtil.getColorByModeNoCompat(this.mDashColor));
            this.mLine.setBackground(drawable);
            this.mLine.setLayoutParams(layoutParams2);
        }
    }

    public LinearLayout createView(Context context) {
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, C67448R.C67450layout.b3d, (ViewGroup) null);
        this.contentView = linearLayout;
        return linearLayout;
    }
}
