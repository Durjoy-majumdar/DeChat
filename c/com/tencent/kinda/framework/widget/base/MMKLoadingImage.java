package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.kinda.gen.KLoadingImage;
import com.tencent.kinda.gen.LoadingImageStyle;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

public class MMKLoadingImage extends MMKView<LinearLayout> implements KLoadingImage {
    private Context context;
    private LoadingImageStyle loadingImageStype;
    private ProgressBar progressBar;

    public LoadingImageStyle getStyle() {
        return this.loadingImageStype;
    }

    public void setStyle(LoadingImageStyle loadingImageStyle) {
        Context context2 = this.context;
        if (context2 != null) {
            this.loadingImageStype = loadingImageStyle;
            if (loadingImageStyle == LoadingImageStyle.WHITE) {
                this.progressBar.setIndeterminateDrawable(C76577a.m92158i(context2, C0966R.C0969drawable.an6));
            } else if (loadingImageStyle == LoadingImageStyle.WHITELARGE) {
                this.progressBar.setIndeterminateDrawable(C76577a.m92158i(context2, C0966R.C0969drawable.an6));
            } else if (loadingImageStyle == LoadingImageStyle.GRAY) {
                this.progressBar.setIndeterminateDrawable(C76577a.m92158i(context2, C0966R.C0969drawable.amz));
            }
        }
    }

    public void startAnimating() {
        this.progressBar.setVisibility(0);
    }

    public void stopAnimating() {
        this.progressBar.setVisibility(8);
    }

    public LinearLayout createView(Context context2) {
        this.context = context2;
        LinearLayout linearLayout = new LinearLayout(context2);
        ProgressBar progressBar2 = new ProgressBar(context2);
        this.progressBar = progressBar2;
        progressBar2.setIndeterminateDrawable(C76577a.m92158i(context2, C0966R.C0969drawable.amz));
        this.progressBar.setVisibility(8);
        linearLayout.addView(this.progressBar, new LinearLayout.LayoutParams(-1, -1));
        return linearLayout;
    }
}
