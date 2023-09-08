package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import lb0.C88394b;
import p646pn.C110234e;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/music/ui/FloatBallMusicView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "closeListener", "Lrx3/b0;", "setOnCloseListener", "clickListener", "setOnMusicIconClickListener", "", "coverPath", "setCoverPath", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-music_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicView */
public final class FloatBallMusicView extends RelativeLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f20016o = 0;

    /* renamed from: d */
    public MMAnimateView f20017d;

    /* renamed from: e */
    public ImageView f20018e;

    /* renamed from: f */
    public RelativeLayout f20019f;

    /* renamed from: g */
    public WeImageView f20020g;

    /* renamed from: h */
    public int f20021h;

    /* renamed from: i */
    public String f20022i;

    /* renamed from: j */
    public View.OnClickListener f20023j;

    /* renamed from: n */
    public View.OnClickListener f20024n;

    /* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicView$a */
    public static final class C4907a implements C88394b.C88408j {

        /* renamed from: d */
        public static final C4907a f20025d = new C4907a(0.16f);

        public C4907a(float f) {
        }

        /* renamed from: c */
        public Bitmap mo5830c(Bitmap bitmap) {
            Bitmap bitmap2;
            C87412m.m108594g(bitmap, "bitmap");
            if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                try {
                    if (bitmap.getWidth() == bitmap.getHeight()) {
                        bitmap2 = BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.16f);
                    } else {
                        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                        if (min <= 0) {
                            min = Math.max(bitmap.getWidth(), bitmap.getHeight());
                        }
                        Bitmap centerCropBitmap = BitmapUtil.getCenterCropBitmap(bitmap, min, min, true);
                        bitmap2 = centerCropBitmap != null ? BitmapUtil.getRoundedCornerBitmap(centerCropBitmap, false, ((float) centerCropBitmap.getWidth()) * 0.16f) : centerCropBitmap;
                    }
                    if (bitmap2 != null) {
                        return bitmap2;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FloatBallMusicView", e, "getRoundBitmap exception", new Object[0]);
                }
            }
            return bitmap;
        }

        public String key() {
            return "FloatBallMusicCover";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FloatBallMusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo5825a() {
        Log.m105920e("MicroMsg.FloatBallMusicView", "alvinluo loadMusicCover failed");
        RelativeLayout relativeLayout = this.f20019f;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(C0966R.C0969drawable.a6_);
        }
        ImageView imageView = this.f20018e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo5826b(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        RelativeLayout relativeLayout = this.f20019f;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (relativeLayout != null) {
            if (relativeLayout == null || (layoutParams2 = relativeLayout.getLayoutParams()) == null) {
                layoutParams2 = null;
            } else if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                if (z) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams2;
                    layoutParams4.removeRule(20);
                    layoutParams4.addRule(21);
                    layoutParams4.setMarginStart(0);
                    layoutParams4.setMarginEnd(this.f20021h);
                } else {
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams2;
                    layoutParams5.removeRule(21);
                    layoutParams5.addRule(20);
                    layoutParams5.setMarginStart(this.f20021h);
                    layoutParams5.setMarginEnd(0);
                }
            }
            relativeLayout.setLayoutParams(layoutParams2);
        }
        WeImageView weImageView = this.f20020g;
        if (weImageView != null) {
            if (!(weImageView == null || (layoutParams = weImageView.getLayoutParams()) == null)) {
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    if (z) {
                        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams6.removeRule(21);
                        layoutParams6.addRule(20);
                    } else {
                        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams7.removeRule(20);
                        layoutParams7.addRule(21);
                    }
                }
                layoutParams3 = layoutParams;
            }
            weImageView.setLayoutParams(layoutParams3);
        }
    }

    public final void setCoverPath(String str) {
        if (!C87412m.m108589b(this.f20022i, str)) {
            this.f20022i = str == null ? "" : str;
            if (str == null || str.length() == 0) {
                mo5825a();
                return;
            }
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = "";
            if (C112551y.m153819s(str, "http", false) || C112551y.m153819s(str, C113600ck.f339986i, false)) {
                f0Var.f27484d = str;
            } else {
                String i = C86013q1.m106448i(str, false);
                if (!C86013q1.m106450k(i)) {
                    Log.m105921e("MicroMsg.FloatBallMusicView", "alvinluo setCoverPath file not exist %s", i);
                    mo5825a();
                    return;
                }
                f0Var.f27484d = "file://" + i;
            }
            Log.m105926v("MicroMsg.FloatBallMusicView", "alvinluo loadMusicCover url: " + ((String) f0Var.f27484d));
            String str2 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122796o(new C4912f(this, f0Var), (String) f0Var.f27484d, C4907a.f20025d);
        }
    }

    public final void setOnCloseListener(View.OnClickListener onClickListener) {
        this.f20023j = onClickListener;
    }

    public final void setOnMusicIconClickListener(View.OnClickListener onClickListener) {
        this.f20024n = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatBallMusicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f20022i = "";
        C4909c cVar = new C4909c(this);
        Class cls = C110234e.class;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b48, this, true);
        this.f20021h = C74942w4.m89786c(context, C0966R.dimen.f3766df);
        this.f20017d = (MMAnimateView) inflate.findViewById(C0966R.C0970id.h6h);
        this.f20018e = (ImageView) inflate.findViewById(C0966R.C0970id.h5x);
        this.f20019f = (RelativeLayout) inflate.findViewById(C0966R.C0970id.h6j);
        this.f20020g = (WeImageView) inflate.findViewById(C0966R.C0970id.h5t);
        MMAnimateView mMAnimateView = this.f20017d;
        if (mMAnimateView != null) {
            mMAnimateView.setImageResource(C0966R.C0969drawable.f357210c34);
        }
        ImageView imageView = this.f20018e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.f20019f;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new C4910d(this));
        }
        WeImageView weImageView = this.f20020g;
        if (weImageView != null) {
            weImageView.setOnClickListener(new C4911e(this));
        }
        mo5826b(((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149145u());
        ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149116d0(cVar);
        WeImageView weImageView2 = this.f20020g;
        if (weImageView2 != null) {
            weImageView2.setContentDescription(getResources().getString(C0966R.string.jum));
        }
        RelativeLayout relativeLayout2 = this.f20019f;
        if (relativeLayout2 != null) {
            relativeLayout2.setImportantForAccessibility(4);
        }
    }
}
