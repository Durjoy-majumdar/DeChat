package un2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.IOException;
import nn2.C76942m;
import sf0.C101592a0;
import un2.C102057c;

/* renamed from: un2.b */
public class C78239b implements C101592a0 {

    /* renamed from: a */
    public C102057c.C102058a f229203a;

    /* renamed from: b */
    public String f229204b;

    public C78239b(C102057c.C102058a aVar) {
        this.f229204b = "";
        this.f229203a = aVar;
    }

    /* renamed from: a */
    public String mo94817a() {
        return mo94823g() + "_tv";
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
                Log.printErrStackTrace("MicroMsg.TVImgGetStrategy", e, "", new Object[0]);
            }
        }
        return bitmap;
    }

    /* renamed from: d */
    public String mo94820d() {
        return mo94823g() + "_tv";
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.field_thumburl;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo94823g() {
        /*
            r1 = this;
            un2.c$a r0 = r1.f229203a
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = r0.field_thumburl
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            java.lang.String r0 = r1.f229204b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: un2.C78239b.mo94823g():java.lang.String");
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
        String str;
        C102057c.C102058a aVar = this.f229203a;
        if (aVar != null && (str = aVar.field_thumburl) != null) {
            return C76942m.wx0(str, "@S");
        }
        String str2 = this.f229204b;
        return str2 != null ? C76942m.wx0(str2, "@S") : "";
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return false;
    }

    public C78239b(String str) {
        this.f229203a = null;
        this.f229204b = str;
    }
}
