package com.tencent.qqmusic.mediaplayer.upstream;

import android.text.TextUtils;

public class DefaultFileDataSourceFactory implements IDataSourceFactory {
    private final String filePath;

    public DefaultFileDataSourceFactory(String str) {
        this.filePath = str;
    }

    public IDataSource createDataSource() {
        if (!TextUtils.isEmpty(this.filePath)) {
            return new FileDataSource(this.filePath);
        }
        throw new DataSourceException(-5, "filePath is empty!", (Throwable) null);
    }

    public INativeDataSource createNativeDataSource() {
        return NativeDataSourceFactory.fileDataSource(this.filePath, 0);
    }
}
