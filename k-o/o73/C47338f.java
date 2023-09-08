package o73;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.plugin.wear.model.C43462g;
import com.tencent.p014mm.plugin.wear.model.C43465i;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import java.io.IOException;
import p196ln.C76708i;
import pe3.C89349b;
import te3.q05;
import te3.r05;

/* renamed from: o73.f */
public class C47338f extends C47335c {

    /* renamed from: d */
    public String f127026d;

    /* renamed from: e */
    public String f127027e;

    /* renamed from: f */
    public int f127028f;

    public C47338f(String str, String str2, int i) {
        this.f127026d = str;
        this.f127027e = str2;
        this.f127028f = i;
    }

    /* renamed from: b */
    public String mo67621b() {
        return "WearFriendCreateTask";
    }

    /* renamed from: c */
    public void mo67622c() {
        C43462g a = C43457b.yx0().mo67628a(this.f127026d);
        r05 r05 = new r05();
        if (this.f127028f == 1) {
            q05 q05 = new q05();
            q05.f140082d = a.f117477b;
            q05.f140083e = this.f127026d;
            q05.f140084f = this.f127027e;
            q05.f140085g = MMApplicationContext.getContext().getString(C0966R.string.hbn);
            Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f127026d);
            if (N50 != null) {
                q05.f140086h = new C89349b(C43465i.m46971a(N50));
            }
            r05.f140647d.add(q05);
        }
        try {
            C43457b.zx0().mo72270b(20006, r05.toByteArray(), true);
        } catch (IOException unused) {
        }
    }
}
