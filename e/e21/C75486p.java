package e21;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import e63.C75556b;
import java.io.IOException;
import sf0.C101592a0;

/* renamed from: e21.p */
public class C75486p implements C101592a0 {

    /* renamed from: a */
    public String f221845a;

    /* renamed from: b */
    public C101592a0.C101593b f221846b = new C75487a(this);

    /* renamed from: e21.p$a */
    public class C75487a implements C101592a0.C101593b {
        public C75487a(C75486p pVar) {
        }

        /* renamed from: a */
        public Bitmap mo95233a(String str) {
            return BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
        }
    }

    public C75486p(String str) {
        this.f221845a = str;
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f221845a;
    }

    /* renamed from: b */
    public C101592a0.C101593b mo94818b() {
        return this.f221846b;
    }

    /* renamed from: c */
    public Bitmap mo94819c(Bitmap bitmap, C101592a0.C77686a aVar, String str) {
        if (C101592a0.C77686a.NET == aVar) {
            try {
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, mo94827k(), false);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.WalletGetPicStrategy", e, "", new Object[0]);
            }
        }
        return bitmap;
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f221845a;
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
        return this.f221845a;
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
        return C75556b.m90591a(this.f221845a);
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return true;
    }
}
