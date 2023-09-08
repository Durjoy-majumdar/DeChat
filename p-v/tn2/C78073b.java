package tn2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.IOException;
import kg3.C76577a;
import p755xs.C102720b;
import p823sg.C90193h;
import sf0.C101592a0;
import sf0.C101594c0;
import sn2.C48447s;
import sn2.C64057o;
import un2.C78239b;

/* renamed from: tn2.b */
public class C78073b extends BitmapDrawable implements C101594c0.C101595a {

    /* renamed from: j */
    public static final Paint f228844j;

    /* renamed from: n */
    public static Bitmap f228845n;

    /* renamed from: d */
    public int f228846d;

    /* renamed from: e */
    public String f228847e;

    /* renamed from: f */
    public String f228848f;

    /* renamed from: g */
    public ImageView f228849g;

    /* renamed from: h */
    public C101592a0 f228850h;

    /* renamed from: i */
    public int f228851i;

    /* renamed from: tn2.b$a */
    public class C78074a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f228852d;

        public C78074a(Bitmap bitmap) {
            this.f228852d = bitmap;
        }

        public void run() {
            C78073b.this.f228849g.setImageBitmap(this.f228852d);
        }
    }

    /* renamed from: tn2.b$b */
    public static class C78075b implements C101592a0 {

        /* renamed from: a */
        public String f228854a;

        public C78075b(String str) {
            this.f228854a = str;
        }

        /* renamed from: a */
        public String mo94817a() {
            return this.f228854a;
        }

        /* renamed from: b */
        public C101592a0.C101593b mo94818b() {
            return null;
        }

        /* renamed from: c */
        public Bitmap mo94819c(Bitmap bitmap, C101592a0.C77686a aVar, String str) {
            if (C101592a0.C77686a.NET == aVar) {
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, mo94827k(), false);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", e, "", new Object[0]);
                    Log.m105928w("MicroMsg.ShakeAvatarDrawable", "save bitmap fail");
                }
            }
            Log.m105919d("MicroMsg.ShakeAvatarDrawable", "get bitmap, from %s", aVar.toString());
            return bitmap;
        }

        /* renamed from: d */
        public String mo94820d() {
            return this.f228854a;
        }

        /* renamed from: e */
        public Bitmap mo94821e() {
            return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
        }

        /* renamed from: f */
        public void mo94822f() {
        }

        /* renamed from: g */
        public String mo94823g() {
            return this.f228854a;
        }

        /* renamed from: h */
        public boolean mo94824h() {
            return false;
        }

        /* renamed from: i */
        public void mo94825i(C101592a0.C77686a aVar, String str) {
        }

        /* renamed from: j */
        public void mo94826j(String str, boolean z) {
        }

        /* renamed from: k */
        public String mo94827k() {
            return C78073b.m94203b(this.f228854a);
        }

        /* renamed from: l */
        public boolean mo94828l() {
            return true;
        }
    }

    static {
        Paint paint = new Paint();
        f228844j = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public C78073b(ImageView imageView, String str, int i) {
        super(imageView.getResources(), m94202a(imageView, i));
        this.f228849g = imageView;
        this.f228848f = str;
        this.f228851i = i;
        invalidateSelf();
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
    }

    /* renamed from: a */
    public static Bitmap m94202a(View view, int i) {
        if (view == null) {
            return f228845n;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Bitmap bitmap = f228845n;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            if (i > 0) {
                try {
                    f228845n = BitmapUtil.transformDrawableToBitmap(view.getResources().getDrawable(i));
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", e, "", new Object[0]);
                }
            } else {
                f228845n = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            }
            if (f228845n.getWidth() != measuredWidth && measuredWidth > 0 && measuredHeight > 0) {
                f228845n = Bitmap.createScaledBitmap(f228845n, measuredWidth, measuredHeight, true);
            }
        }
        return f228845n;
    }

    /* renamed from: b */
    public static String m94203b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.ShakeAvatarDrawable", "getStoragePath: but url is null");
            return null;
        }
        String c = C64057o.m75412c();
        if (Util.isNullOrNil(c)) {
            Log.m105928w("MicroMsg.ShakeAvatarDrawable", "getStoragePath, but save dir is null");
            return null;
        }
        return String.format("%s/%s", new Object[]{c, C90193h.m112878f(str.getBytes())});
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        Class cls = C102720b.class;
        Log.m105925i("MicroMsg.ShakeAvatarDrawable", "album username[%s], url[%s], type[%d], attr[%s]", this.f228848f, this.f228847e, Integer.valueOf(this.f228846d), toString());
        int i = this.f228846d;
        if (4 == i || (C48447s.m53802d(i) && 6 != this.f228846d)) {
            int i2 = this.f228846d;
            if (4 == i2) {
                this.f228850h = new C78075b(this.f228847e);
                bitmap = ((C102720b) C86312j.m106911c(cls)).mo142104N6(this.f228850h);
            } else if (!C48447s.m53802d(i2) || 6 == this.f228846d) {
                bitmap = null;
            } else {
                this.f228850h = new C78239b(this.f228847e);
                bitmap = ((C102720b) C86312j.m106911c(cls)).mo142104N6(this.f228850h);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.ShakeAvatarDrawable", "bm is null or recycled, album url[%s]", this.f228847e);
                bitmap = m94202a(this.f228849g, this.f228851i);
            }
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, getBounds(), f228844j);
            }
        }
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        Log.m105925i("MicroMsg.ShakeAvatarDrawable", "type[%d] notifyKey[%s] albumUrl[%s]", Integer.valueOf(this.f228846d), str, this.f228847e);
        C101592a0 a0Var = this.f228850h;
        if (a0Var != null && str.equals(a0Var.mo94820d())) {
            int i = this.f228846d;
            if (4 == i || (C48447s.m53802d(i) && 6 != this.f228846d)) {
                this.f228849g.post(new C78074a(bitmap));
            }
        }
    }
}
