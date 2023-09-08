package com.davemorrissey.labs.subscaleview.model;

import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;

public interface ITileLoaderFactory {
    ILoadable newInstance(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, Tile tile);
}
