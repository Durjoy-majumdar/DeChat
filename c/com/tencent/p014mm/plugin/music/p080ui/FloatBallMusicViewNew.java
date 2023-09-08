package com.tencent.p014mm.plugin.music.p080ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import kotlin.Metadata;
import lb0.C88394b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/music/ui/FloatBallMusicViewNew;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "clickListener", "Lrx3/b0;", "setOnMusicCoverClickListener", "", "coverPath", "setCoverPath", "", "h", "Lrx3/g;", "getPadding20", "()I", "padding20", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-music_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew */
public final class FloatBallMusicViewNew extends RelativeLayout {

    /* renamed from: i */
    public static final /* synthetic */ int f20026i = 0;

    /* renamed from: d */
    public ImageView f20027d;

    /* renamed from: e */
    public View f20028e;

    /* renamed from: f */
    public String f20029f;

    /* renamed from: g */
    public View.OnClickListener f20030g;

    /* renamed from: h */
    public final C13601g f20031h;

    /* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew$a */
    public static final class C4908a implements C88394b.C88408j {

        /* renamed from: d */
        public static final C4908a f20032d = new C4908a();

        /* renamed from: c */
        public Bitmap mo5830c(Bitmap bitmap) {
            Bitmap bitmap2;
            C87412m.m108594g(bitmap, "bitmap");
            if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                try {
                    if (bitmap.getWidth() == bitmap.getHeight()) {
                        bitmap2 = bitmap;
                    } else {
                        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                        if (min <= 0) {
                            min = Math.max(bitmap.getWidth(), bitmap.getHeight());
                        }
                        bitmap2 = BitmapUtil.getCenterCropBitmap(bitmap, min, min, true);
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
            return "FloatBallMusicCoverNew";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FloatBallMusicViewNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final int getPadding20() {
        return ((Number) ((C36570n) this.f20031h).getValue()).intValue();
    }

    /* renamed from: a */
    public final void mo5831a() {
        Log.m105920e("MicroMsg.FloatBallMusicView", "loadMusicCover failed");
        ImageView imageView = this.f20027d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f20027d;
        if (imageView2 != null) {
            imageView2.setPadding(getPadding20(), getPadding20(), getPadding20(), getPadding20());
        }
        ImageView imageView3 = this.f20027d;
        if (imageView3 != null) {
            imageView3.setImageResource(C0966R.raw.icon_music_filled);
        }
    }

    public final void setCoverPath(String str) {
        if (!C87412m.m108589b(this.f20029f, str)) {
            this.f20029f = str == null ? "" : str;
            if (str == null || str.length() == 0) {
                mo5831a();
                return;
            }
            if (!C112551y.m153819s(str, "http", false) && !C112551y.m153819s(str, C113600ck.f339986i, false)) {
                String i = C86013q1.m106448i(str, false);
                if (!C86013q1.m106450k(i)) {
                    Log.m105921e("MicroMsg.FloatBallMusicView", "setCoverPath file not exist %s", i);
                    mo5831a();
                    return;
                }
                str = "file://" + i;
            }
            Log.m105926v("MicroMsg.FloatBallMusicView", "loadMusicCover url: " + str);
            String str2 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122796o(new C4914h(this, str), str, C4908a.f20032d);
        }
    }

    public final void setOnMusicCoverClickListener(View.OnClickListener onClickListener) {
        this.f20030g = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatBallMusicViewNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f20029f = "";
        this.f20031h = C36568h.m40985a(new C4915i(this));
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d56, this, true);
        this.f20027d = (ImageView) inflate.findViewById(C0966R.C0970id.h5x);
        this.f20028e = inflate.findViewById(C0966R.C0970id.o1u);
        ImageView imageView = this.f20027d;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        View view = this.f20028e;
        if (view != null) {
            view.setOnClickListener(new C4913g(this));
        }
        ImageView imageView2 = this.f20027d;
        if (imageView2 != null) {
            imageView2.setImportantForAccessibility(2);
        }
    }
}
