package t51;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import i61.C98603i;
import ic0.C98661k;
import uc0.C111156r;

/* renamed from: t51.k */
public final class C110920k implements C98661k {

    /* renamed from: a */
    public final /* synthetic */ SpringLuckyEggActivity f331736a;

    /* renamed from: t51.k$a */
    public static final class C110921a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SpringLuckyEggActivity f331737d;

        /* renamed from: e */
        public final /* synthetic */ String f331738e;

        public C110921a(SpringLuckyEggActivity springLuckyEggActivity, String str) {
            this.f331737d = springLuckyEggActivity;
            this.f331738e = str;
        }

        public final void run() {
            C110928q qVar = this.f331737d.f312423f;
            if (qVar != null) {
                qVar.f331761q.setImageFilePath(this.f331738e);
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        }
    }

    public C110920k(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331736a = springLuckyEggActivity;
    }

    /* renamed from: a */
    public final void mo6935a(String str, View view, Bitmap bitmap, Object[] objArr) {
        if (bitmap == null) {
            SpringLuckyEggActivity springLuckyEggActivity = this.f331736a;
            int i = SpringLuckyEggActivity.f312420n;
            C111156r value = springLuckyEggActivity.mo149514M7().f331794r.getValue();
            if (value != null) {
                String str2 = value.f332914w;
                if (!(str2 == null || str2.length() == 0)) {
                    String str3 = (C98603i.m128192c() + "/egg/") + XVFSFile.SEPARATOR_CHAR + value.f332914w;
                    if (C86013q1.m106450k(str3)) {
                        SpringLuckyEggActivity springLuckyEggActivity2 = this.f331736a;
                        C110928q qVar = springLuckyEggActivity2.f312423f;
                        if (qVar != null) {
                            qVar.f331761q.post(new C110921a(springLuckyEggActivity2, str3));
                        } else {
                            C87412m.m108603p("viewBinding");
                            throw null;
                        }
                    }
                }
            }
        }
    }
}
