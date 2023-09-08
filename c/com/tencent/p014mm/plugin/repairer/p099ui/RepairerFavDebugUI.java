package com.tencent.p014mm.plugin.repairer.p099ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import p606mm.C47080g;
import pb1.C11880g1;
import z04.C119027c;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerFavDebugUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI */
public final class RepairerFavDebugUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI$a */
    public static final class C5072a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerFavDebugUI f20427d;

        public C5072a(RepairerFavDebugUI repairerFavDebugUI) {
            this.f20427d = repairerFavDebugUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20427d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerFavDebugUI$b */
    public static final class C5073b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f20428d;

        /* renamed from: e */
        public final /* synthetic */ long f20429e;

        /* renamed from: f */
        public final /* synthetic */ RepairerFavDebugUI f20430f;

        public C5073b(String str, long j, RepairerFavDebugUI repairerFavDebugUI) {
            this.f20428d = str;
            this.f20429e = j;
            this.f20430f = repairerFavDebugUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerFavDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(this.f20428d)) {
                String b = C66725r.m78728b(this.f20428d);
                String format = String.format("fav_info_%s.txt", Arrays.copyOf(new Object[]{Long.valueOf(this.f20429e)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                byte[] bytes = b.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                ((C47080g) C86312j.m106911c(C47080g.class)).Kt0(format, bytes, true);
            } else {
                Toast.makeText(this.f20430f.getContext(), "该收藏为空？？？", 1).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerFavDebugUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d8v;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("收藏调试页面");
        setBackBtn(new C5072a(this));
        long longExtra = getIntent().getLongExtra("key_detail_info_id", -1);
        String dY = ((C11880g1) C86312j.m106911c(C11880g1.class)).mo11757dY(longExtra);
        Button button = (Button) findViewById(C0966R.C0970id.btm);
        if (button != null) {
            button.setOnClickListener(new C5073b(dY, longExtra, this));
        }
    }
}
