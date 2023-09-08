package vl2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.C71030z;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.IOException;
import sf0.C101592a0;

/* renamed from: vl2.a0 */
public final class C78431a0 implements C101592a0 {

    /* renamed from: a */
    public String f229801a;

    public C78431a0(String str) {
        this.f229801a = str;
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f229801a;
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
                Log.printErrStackTrace("MicroMsg.ScannerGetPicStrategy", e, "", new Object[0]);
            }
        }
        return bitmap;
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f229801a;
    }

    /* renamed from: e */
    public Bitmap mo94821e() {
        if (MMApplicationContext.getContext() == null) {
            return null;
        }
        return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
    }

    /* renamed from: f */
    public void mo94822f() {
    }

    /* renamed from: g */
    public String mo94823g() {
        return this.f229801a;
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
        return C71030z.vx0().xx0(this.f229801a, "@S");
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return false;
    }
}
