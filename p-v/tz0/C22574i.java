package tz0;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.VipCardListUI;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C9556a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import qo3.C77407n;
import sx3.C64197v;
import te3.C22517nn;
import te3.C51997xn;
import wz0.C53246b;

/* renamed from: tz0.i */
public final class C22574i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ VipCardListUI f64906d;

    /* renamed from: e */
    public final /* synthetic */ List<C22517nn> f64907e;

    /* renamed from: f */
    public final /* synthetic */ List<C22517nn> f64908f;

    /* renamed from: tz0.i$a */
    public static final class C22575a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ List<C22517nn> f64909d;

        /* renamed from: e */
        public final /* synthetic */ VipCardListUI f64910e;

        public C22575a(List<? extends C22517nn> list, VipCardListUI vipCardListUI) {
            this.f64909d = list;
            this.f64910e = vipCardListUI;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            List<C22517nn> list = this.f64909d;
            VipCardListUI vipCardListUI = this.f64910e;
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C22517nn nnVar = (C22517nn) next;
                    e0Var.add(0, i, 1, (CharSequence) nnVar.f64329d);
                    String str = vipCardListUI.f52201i;
                    Log.m105924i(str, "Icon menu content, index: " + i + ", wording: " + nnVar.f64329d + ", jumpType:" + nnVar.f64330e + ' ');
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* renamed from: tz0.i$b */
    public static final class C22576b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ VipCardListUI f64911d;

        /* renamed from: e */
        public final /* synthetic */ List<C22517nn> f64912e;

        public C22576b(VipCardListUI vipCardListUI, List<? extends C22517nn> list) {
            this.f64911d = vipCardListUI;
            this.f64912e = list;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            VipCardListUI vipCardListUI = this.f64911d;
            C22517nn nnVar = this.f64912e.get(i);
            int i2 = VipCardListUI.f52184R;
            vipCardListUI.getClass();
            if (nnVar != null) {
                int i3 = nnVar.f64330e;
                if (i3 == 1) {
                    String str2 = nnVar.f64331f;
                    if (str2 != null) {
                        C53246b.m59678j(vipCardListUI, str2, 0);
                    }
                } else if (i3 == 2) {
                    C51997xn xnVar = nnVar.f64332g;
                    if (xnVar != null) {
                        C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                    }
                } else if (i3 == 3 && (str = nnVar.f64333h) != null && C87412m.m108589b(str, "weixin://mktcard/membercardhistory")) {
                    C115669n.INSTANCE.mo160131h(19747, 1, 2);
                    String str3 = nnVar.f64329d;
                    Log.m105924i(vipCardListUI.f52201i, "go to vip history card list");
                    Intent intent = new Intent(vipCardListUI.getContext(), HistoryCardListUI.class);
                    intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
                    intent.putExtra("card_type", 3);
                    AppCompatActivity context = vipCardListUI.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    AppCompatActivity appCompatActivity = context;
                    C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoVipHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoVipHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        }
    }

    public C22574i(VipCardListUI vipCardListUI, List<? extends C22517nn> list, List<? extends C22517nn> list2) {
        this.f64906d = vipCardListUI;
        this.f64907e = list;
        this.f64908f = list2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C77407n nVar = new C77407n((Context) this.f64906d.getContext(), 1, false);
        List<C22517nn> list = this.f64907e;
        VipCardListUI vipCardListUI = this.f64906d;
        nVar.f225771i = new C22575a(list, vipCardListUI);
        nVar.f225782p = new C22576b(vipCardListUI, this.f64908f);
        nVar.mo107573q();
        C115669n.INSTANCE.mo160131h(19747, 1, 1);
        return false;
    }
}
