package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.tools.MaskImageButton;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kg3.C76577a;
import p196ln.C76706g;
import p196ln.C76708i;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.j */
public final class C55552j {

    /* renamed from: a */
    public static final C55552j f158177a = new C55552j();

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.j$a */
    public static final class C55553a extends BitmapDrawable {

        /* renamed from: f */
        public static final Bitmap f158178f;

        /* renamed from: a */
        public final String f158179a = ("MicroMsg.AnyProcessAvatarAttacher.AvatarDrawable#" + hashCode());

        /* renamed from: b */
        public String f158180b = "";

        /* renamed from: c */
        public volatile Bitmap f158181c;

        /* renamed from: d */
        public boolean f158182d;

        /* renamed from: e */
        public final Paint f158183e;

        /* renamed from: com.tencent.mm.plugin.appbrand.utils.j$a$a */
        public static final class C55554a {
            public C55554a(C8480h hVar) {
            }
        }

        static {
            Bitmap bitmap = null;
            new C55554a((C8480h) null);
            Bitmap decodeStream = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            if (decodeStream != null) {
                bitmap = BitmapUtil.getRoundedCornerBitmap(decodeStream, true, ((float) decodeStream.getWidth()) * 0.1f);
            }
            f158178f = bitmap;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55553a(String str) {
            super(f158178f);
            C87412m.m108594g(str, "username");
            Paint paint = new Paint();
            this.f158183e = paint;
            paint.setColor(-16777216);
            paint.setAlpha(76);
            paint.setAntiAlias(true);
            mo77084a(str);
        }

        /* renamed from: a */
        public final void mo77084a(String str) {
            Bitmap Wd0;
            C87412m.m108594g(str, "value");
            String str2 = this.f158180b;
            String str3 = this.f158179a;
            Log.m105924i(str3, "username#set, oldUsername: " + str2 + ", newUsername: " + str);
            if (!C87412m.m108589b(str, str2)) {
                IPCString iPCString = (IPCString) C15618a.m14628d(new IPCString(str), C55558l.f158191a);
                Bitmap bitmap = null;
                String str4 = iPCString != null ? iPCString.f10315d : null;
                if (str4 == null) {
                    str4 = "";
                }
                if ((str4.length() > 0) && (Wd0 = ((C76708i) C86312j.m106911c(C76708i.class)).Wd0(str4, (String) null)) != null) {
                    bitmap = BitmapUtil.getRoundedCornerBitmap(Wd0, true, ((float) Wd0.getWidth()) * 0.1f);
                }
                this.f158181c = bitmap;
                invalidateSelf();
            }
            this.f158180b = str;
        }

        public void draw(Canvas canvas) {
            C87412m.m108594g(canvas, "canvas");
            Log.m105918d(this.f158179a, "draw");
            Bitmap bitmap = this.f158181c;
            if (bitmap == null) {
                bitmap = f158178f;
            }
            if (bitmap == null) {
                Log.m105924i(this.f158179a, "draw, bitmap2Draw is null");
                super.draw(canvas);
                return;
            }
            Rect bounds = getBounds();
            C87412m.m108593f(bounds, "bounds");
            canvas.drawBitmap(bitmap, (Rect) null, bounds, getPaint());
            if (this.f158182d) {
                canvas.drawRoundRect(new RectF(bounds), ((float) bounds.width()) * 0.1f, ((float) bounds.height()) * 0.1f, this.f158183e);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.j$b */
    public enum C55555b {
        DISPATCH_HD_AVATAR,
        DISPATCH_NOT_HD_AVATAR,
        DISPATCH_NOTHING
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.j$c */
    public static final class C55556c {

        /* renamed from: a */
        public String f158188a;

        public C55556c(String str, int i, C8480h hVar) {
            str = (i & 1) != 0 ? "" : str;
            C87412m.m108594g(str, "value");
            this.f158188a = str;
        }
    }

    /* renamed from: a */
    public final void mo77082a(ImageView imageView, String str) {
        C87412m.m108594g(imageView, "imageView");
        C87412m.m108594g(str, "username");
        Log.m105918d("MicroMsg.AnyProcessAvatarAttacher", "attachAvatar, imageView: " + imageView + ", username: " + str);
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof C55553a) {
            Log.m105924i("MicroMsg.AnyProcessAvatarAttacher", "attachAvatar, AvatarBitmapDrawable already set");
            ((C55553a) drawable).mo77084a(str);
            return;
        }
        C55553a aVar = new C55553a(str);
        if (!(imageView instanceof MaskImageButton) && (imageView.isClickable() || imageView.isLongClickable())) {
            try {
                imageView.setOnTouchListener(new C55557k(aVar, imageView));
            } catch (Exception e) {
                Log.printErrStackTrace(aVar.f158179a, e, "attachToView fail", new Object[0]);
            }
        }
        imageView.setImageDrawable(aVar);
    }

    /* renamed from: b */
    public final C55555b mo77083b(String str, C55556c cVar) {
        Class cls = C76706g.class;
        String str2 = "";
        if (((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93565n(str, true)) {
            String h = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93559h(str, true);
            if (h != null) {
                str2 = h;
            }
            cVar.getClass();
            cVar.f158188a = str2;
            return C55555b.DISPATCH_HD_AVATAR;
        } else if (!((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93565n(str, false)) {
            return C55555b.DISPATCH_NOTHING;
        } else {
            String h2 = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93559h(str, false);
            if (h2 != null) {
                str2 = h2;
            }
            cVar.getClass();
            cVar.f158188a = str2;
            return C55555b.DISPATCH_NOT_HD_AVATAR;
        }
    }
}
