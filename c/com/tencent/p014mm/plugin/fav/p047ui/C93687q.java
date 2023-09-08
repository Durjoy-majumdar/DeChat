package com.tencent.p014mm.plugin.fav.p047ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavUIPhotoInfoEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.fav.ui.q */
public class C93687q {

    /* renamed from: a */
    public MMActivity f270473a;

    /* renamed from: b */
    public MMGestureGallery f270474b;

    /* renamed from: c */
    public View f270475c = this.f270473a.findViewById(C0966R.C0970id.iwf);

    /* renamed from: d */
    public ImageView f270476d;

    /* renamed from: e */
    public C93688a f270477e;

    /* renamed from: f */
    public int f270478f;

    /* renamed from: g */
    public int f270479g;

    /* renamed from: h */
    public int f270480h;

    /* renamed from: i */
    public int f270481i;

    /* renamed from: j */
    public float f270482j;

    /* renamed from: k */
    public float f270483k;

    /* renamed from: l */
    public float f270484l;

    /* renamed from: m */
    public float f270485m;

    /* renamed from: n */
    public ValueAnimator f270486n;

    /* renamed from: com.tencent.mm.plugin.fav.ui.q$a */
    public interface C93688a {
        /* renamed from: g4 */
        MultiTouchImageView mo127461g4();

        /* renamed from: j7 */
        String mo127462j7();
    }

    public C93687q(MMGestureGallery mMGestureGallery, MMActivity mMActivity, C93688a aVar) {
        this.f270474b = mMGestureGallery;
        this.f270473a = mMActivity;
        this.f270477e = aVar;
        this.f270476d = (ImageView) mMActivity.findViewById(C0966R.C0970id.ehi);
        this.f270474b.setGalleryScaleListener(new C93677n(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f270486n = ofFloat;
        ofFloat.setDuration(200).setInterpolator(new DecelerateInterpolator(1.2f));
        this.f270486n.addUpdateListener(new C93680o(this));
        this.f270486n.addListener(new C93684p(this));
    }

    /* renamed from: a */
    public void mo128605a(boolean z) {
        MMGestureGallery mMGestureGallery = this.f270474b;
        if (mMGestureGallery == null) {
            Log.m105924i("MicroMsg.FavDragLogic", "goBack() gallery == null");
            return;
        }
        this.f270478f = 0;
        this.f270479g = 0;
        this.f270480h = mMGestureGallery.getWidth() / 2;
        this.f270481i = this.f270474b.getHeight() / 2;
        if (!z && this.f270477e != null) {
            FavUIPhotoInfoEvent favUIPhotoInfoEvent = new FavUIPhotoInfoEvent();
            favUIPhotoInfoEvent.f264826d.f264828a = this.f270477e.mo127462j7();
            favUIPhotoInfoEvent.publish();
            FavUIPhotoInfoEvent.C92514b bVar = favUIPhotoInfoEvent.f264827e;
            this.f270478f = bVar.f264831c;
            this.f270479g = bVar.f264832d;
            this.f270480h = bVar.f264829a;
            this.f270481i = bVar.f264830b;
        }
        if (this.f270480h == 0 && this.f270481i == 0) {
            this.f270480h = this.f270474b.getWidth() / 2;
            this.f270481i = this.f270474b.getHeight() / 2;
        }
        Log.m105925i("MicroMsg.FavDragLogic", "thumbLeft %d, thumbTop %d, thumbWidth %d, thumbHeight %d", Integer.valueOf(this.f270480h), Integer.valueOf(this.f270481i), Integer.valueOf(this.f270478f), Integer.valueOf(this.f270479g));
        this.f270486n.start();
    }
}
