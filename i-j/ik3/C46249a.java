package ik3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ba2.C39747a;
import ba2.C39748b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d92.C45293c;

/* renamed from: ik3.a */
public class C46249a extends C45293c {

    /* renamed from: g */
    public boolean f124669g = false;

    /* renamed from: h */
    public boolean f124670h = false;

    /* renamed from: i */
    public String f124671i;

    public C46249a(Activity activity) {
        super(activity);
    }

    public Bitmap getBitmap() {
        if (C39747a.f106638a.mo62383a(4)) {
            return null;
        }
        if (this.f124669g) {
            return C39748b.f106642a.mo62384a(MMApplicationContext.getContext().getExternalCacheDir().getAbsolutePath() + "//" + this.f124671i, (ImageView) null);
        } else if (this.f124670h) {
            return super.getBitmap();
        } else {
            return null;
        }
    }

    public View getContentView() {
        View contentView = super.getContentView();
        if (contentView != null) {
            return contentView;
        }
        ViewGroup b = mo67905b();
        View view = null;
        int i = 1;
        int i2 = 1;
        for (int i3 = 0; i3 < b.getChildCount(); i3++) {
            View childAt = b.getChildAt(i3);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i * i2) {
                int width = childAt.getWidth();
                i2 = childAt.getHeight();
                i = width;
                view = childAt;
            }
        }
        return view;
    }

    public View getMaskView() {
        ViewGroup b = mo67905b();
        int i = 1;
        View view = null;
        int i2 = 1;
        for (int i3 = 0; i3 < b.getChildCount(); i3++) {
            View childAt = b.getChildAt(i3);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i * i2) {
                i = childAt.getWidth();
                i2 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }
}
