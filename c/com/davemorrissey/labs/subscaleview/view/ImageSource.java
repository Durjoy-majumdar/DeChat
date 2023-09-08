package com.davemorrissey.labs.subscaleview.view;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.tencent.p014mm.vfs.C86009m1;

public final class ImageSource {
    public static final String ASSET_SCHEME = "assets:///";
    public static final String FILE_SCHEME = "file:///";
    private final Bitmap bitmap;
    private boolean cached;
    private final C86009m1 file;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;

    private ImageSource(Bitmap bitmap2, boolean z) {
        this.bitmap = bitmap2;
        this.file = null;
        this.resource = null;
        this.tile = false;
        this.sWidth = bitmap2.getWidth();
        this.sHeight = bitmap2.getHeight();
        this.cached = z;
    }

    public static ImageSource asset(String str) {
        if (str != null) {
            return uri(ASSET_SCHEME + str);
        }
        throw new NullPointerException("Asset name must not be null");
    }

    public static ImageSource bitmap(Bitmap bitmap2) {
        if (bitmap2 != null) {
            return new ImageSource(bitmap2, false);
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static ImageSource cachedBitmap(Bitmap bitmap2) {
        if (bitmap2 != null) {
            return new ImageSource(bitmap2, true);
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static ImageSource resource(int i) {
        return new ImageSource(i);
    }

    private void setInvariants() {
        Rect rect = this.sRegion;
        if (rect != null) {
            this.tile = true;
            this.sWidth = rect.width();
            this.sHeight = this.sRegion.height();
        }
    }

    public static ImageSource uri(String str) {
        if (str != null) {
            return new ImageSource(new C86009m1(str));
        }
        throw new NullPointerException("Uri must not be null");
    }

    public ImageSource dimensions(int i, int i2) {
        if (this.bitmap == null) {
            this.sWidth = i;
            this.sHeight = i2;
        }
        setInvariants();
        return this;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Integer getResource() {
        return this.resource;
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final Rect getSRegion() {
        return this.sRegion;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final boolean getTile() {
        return this.tile;
    }

    public final Uri getUri() {
        C86009m1 m1Var = this.file;
        if (m1Var == null) {
            return null;
        }
        return m1Var.f250486d;
    }

    public final boolean isCached() {
        return this.cached;
    }

    public ImageSource region(Rect rect) {
        this.sRegion = rect;
        setInvariants();
        return this;
    }

    public ImageSource tiling(boolean z) {
        this.tile = z;
        return this;
    }

    public ImageSource tilingDisabled() {
        return tiling(false);
    }

    public ImageSource tilingEnabled() {
        return tiling(true);
    }

    public static ImageSource uri(Uri uri) {
        if (uri != null) {
            return new ImageSource(new C86009m1(uri));
        }
        throw new NullPointerException("Uri must not be null");
    }

    private ImageSource(C86009m1 m1Var) {
        this.bitmap = null;
        this.file = m1Var;
        this.resource = null;
        this.tile = true;
    }

    private ImageSource(int i) {
        this.bitmap = null;
        this.file = null;
        this.resource = Integer.valueOf(i);
        this.tile = true;
    }
}
