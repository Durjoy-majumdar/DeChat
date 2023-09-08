package t02;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCheckPwdUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import java.io.IOException;
import java.util.Iterator;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;
import te3.C50744ow2;
import te3.C51879wu3;
import te3.eh4;

/* renamed from: t02.d */
public class C48529d implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f129790d;

    /* renamed from: e */
    public final /* synthetic */ C51879wu3 f129791e;

    /* renamed from: f */
    public final /* synthetic */ String f129792f;

    /* renamed from: g */
    public final /* synthetic */ eh4 f129793g;

    /* renamed from: h */
    public final /* synthetic */ int f129794h;

    /* renamed from: t02.d$a */
    public class C48530a implements C11182m0 {
        public C48530a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            Iterator<C50744ow2> it = C48529d.this.f129791e.f144294d.iterator();
            int i = 0;
            while (it.hasNext()) {
                C50744ow2 next = it.next();
                if (!Util.isNullOrNil(next.f139404d)) {
                    if (!Util.isNullOrNil(next.f139405e)) {
                        e0Var.mo107140d(i, C43423i0.m46931b(next.f139405e, true), next.f139404d);
                    } else {
                        e0Var.mo107142f(i, next.f139404d);
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: t02.d$b */
    public class C48531b implements C11184p0 {
        public C48531b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C50744ow2 ow22 = C48529d.this.f129791e.f144294d.get(i);
            if (Util.isNullOrNil(ow22.f139406f)) {
                return;
            }
            if (!ow22.f139406f.equals("weixin://wcpay/honeypay/unbind") || Util.isNullOrNil(C48529d.this.f129792f) || C48529d.this.f129793g == null) {
                C75228t.m90219L(C48529d.this.f129790d, ow22.f139406f, false);
                return;
            }
            Log.m105924i("MicroMsg.HoneyPayUtil", "go to unbind");
            Intent intent = new Intent(C48529d.this.f129790d, HoneyPayCheckPwdUI.class);
            intent.putExtra("key_scene", 3);
            intent.putExtra("key_card_no", C48529d.this.f129792f);
            try {
                intent.putExtra("key_toke_mess", C48529d.this.f129793g.toByteArray());
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.HoneyPayUtil", e, "", new Object[0]);
            }
            C48529d dVar = C48529d.this;
            dVar.f129790d.startActivityForResult(intent, dVar.f129794h);
        }
    }

    public C48529d(MMActivity mMActivity, C51879wu3 wu32, String str, eh4 eh4, int i) {
        this.f129790d = mMActivity;
        this.f129791e = wu32;
        this.f129792f = str;
        this.f129793g = eh4;
        this.f129794h = i;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f129790d, 1, false);
        nVar.f225771i = new C48530a();
        nVar.f225782p = new C48531b();
        nVar.mo107573q();
        return false;
    }
}
