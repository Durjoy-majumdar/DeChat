package com.google.android.gms.common.images.internal;

import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.Objects;
import p1042u.C111058g;

public final class PostProcessedResourceCache extends C111058g<PostProcessedResource, Drawable> {

    public static final class PostProcessedResource {
        public final int postProcessingFlags;
        public final int resId;

        public PostProcessedResource(int i, int i2) {
            this.resId = i;
            this.postProcessingFlags = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PostProcessedResource)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            PostProcessedResource postProcessedResource = (PostProcessedResource) obj;
            return postProcessedResource.resId == this.resId && postProcessedResource.postProcessingFlags == this.postProcessingFlags;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.resId), Integer.valueOf(this.postProcessingFlags));
        }
    }

    public PostProcessedResourceCache() {
        super(10);
    }
}
