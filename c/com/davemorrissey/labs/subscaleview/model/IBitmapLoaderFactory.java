package com.davemorrissey.labs.subscaleview.model;

import android.content.Context;
import android.net.Uri;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;

public interface IBitmapLoaderFactory {
    ILoadable newInstance(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, Uri uri, boolean z);
}
