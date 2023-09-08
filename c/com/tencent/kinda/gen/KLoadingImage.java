package com.tencent.kinda.gen;

public interface KLoadingImage extends KView {
    LoadingImageStyle getStyle();

    void setStyle(LoadingImageStyle loadingImageStyle);

    void startAnimating();

    void stopAnimating();
}
