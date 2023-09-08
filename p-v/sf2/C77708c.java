package sf2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import eb0.C97625j3;
import java.io.IOException;
import p755xs.C102720b;
import rb0.C47966e0;
import sf0.C101592a0;

/* renamed from: sf2.c */
public class C77708c extends BitmapDrawable implements C102720b.C78973a {

    /* renamed from: d */
    public String f226488d;

    /* renamed from: sf2.c$a */
    public class C77709a implements C101592a0 {
        public C77709a() {
        }

        /* renamed from: a */
        public String mo94817a() {
            return C77708c.this.f226488d;
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
                    Log.printErrStackTrace("MicroMsg.UrlDrawable", e, "", new Object[0]);
                    Log.m105928w("MicroMsg.UrlDrawable", "save bitmap fail");
                }
            }
            Log.m105919d("MicroMsg.UrlDrawable", "get bitmap, from %s", aVar.toString());
            return bitmap;
        }

        /* renamed from: d */
        public String mo94820d() {
            return C77708c.this.f226488d;
        }

        /* renamed from: e */
        public Bitmap mo94821e() {
            return null;
        }

        /* renamed from: f */
        public void mo94822f() {
        }

        /* renamed from: g */
        public String mo94823g() {
            return C77708c.this.f226488d;
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
            StringBuilder sb = new StringBuilder();
            C97625j3.m125812b().getClass();
            sb.append(((C47966e0) C86312j.m106911c(C47966e0.class)).mo72738M3());
            sb.append(MD5Util.getMD5String(C77708c.this.f226488d));
            return sb.toString();
        }

        /* renamed from: l */
        public boolean mo94828l() {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77708c(Resources resources, String str) {
        super(resources, (Bitmap) null);
        Log.m105925i("MicroMsg.UrlDrawable", "verify bmp is null ? %B", Boolean.TRUE);
        this.f226488d = str;
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
    }

    public void draw(Canvas canvas) {
        Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C77709a());
        if (N6 == null || N6.isRecycled()) {
            N6 = null;
        }
        Rect bounds = getBounds();
        if (N6 != null) {
            canvas.drawBitmap(N6, (Rect) null, bounds, (Paint) null);
        }
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (this.f226488d.equals(str)) {
            invalidateSelf();
        }
    }
}
