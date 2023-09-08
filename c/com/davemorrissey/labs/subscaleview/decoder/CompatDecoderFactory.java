package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;

public class CompatDecoderFactory<T> implements DecoderFactory<T> {
    private Bitmap.Config bitmapConfig;
    private Class<? extends T> clazz;

    public CompatDecoderFactory(Class<? extends T> cls) {
        this(cls, (Bitmap.Config) null);
    }

    public T make() {
        if (this.bitmapConfig == null) {
            return this.clazz.newInstance();
        }
        return this.clazz.getConstructor(new Class[]{Bitmap.Config.class}).newInstance(new Object[]{this.bitmapConfig});
    }

    public CompatDecoderFactory(Class<? extends T> cls, Bitmap.Config config) {
        this.clazz = cls;
        this.bitmapConfig = config;
    }
}
