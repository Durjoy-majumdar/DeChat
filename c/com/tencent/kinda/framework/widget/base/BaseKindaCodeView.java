package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.util.ArrayList;

public abstract class BaseKindaCodeView extends MMKView<ImageView> {
    private ArrayList<Bitmap> mCodeBitmaps;
    private String mCodeStringValue;
    public Context mContext;
    private ImageView mIvCodeView;

    private void recycleBmpList() {
        if (this.mCodeBitmaps.size() >= 2) {
            for (int size = this.mCodeBitmaps.size() - 1; size > 1; size--) {
                C75228t.m90239c0(this.mCodeBitmaps.remove(size));
            }
        }
    }

    public String getCode() {
        return this.mCodeStringValue;
    }

    public abstract Bitmap getNewBitmap(String str);

    public void setCode(String str) {
        this.mCodeStringValue = str;
        Bitmap newBitmap = getNewBitmap(str);
        this.mIvCodeView.setImageBitmap(newBitmap);
        recycleBmpList();
        this.mCodeBitmaps.add(newBitmap);
    }

    public ImageView createView(Context context) {
        this.mContext = context;
        ImageView imageView = new ImageView(context);
        this.mIvCodeView = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.mCodeBitmaps = new ArrayList<>();
        return this.mIvCodeView;
    }
}
