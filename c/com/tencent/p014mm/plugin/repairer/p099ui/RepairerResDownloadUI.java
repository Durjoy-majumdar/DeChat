package com.tencent.p014mm.plugin.repairer.p099ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import p1054vg.C102190i;
import p523fp.C32147e;
import qb0.C77306a;
import qb0.C77307c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI */
public final class RepairerResDownloadUI extends BaseRepairerUI {

    /* renamed from: d */
    public StringBuffer f273079d = new StringBuffer();

    /* renamed from: e */
    public final RepairerResDownloadUI$resUpdateListener$1 f273080e = new RepairerResDownloadUI$resUpdateListener$1(this, C40008f.f107254d);

    /* renamed from: f */
    public final C94443c f273081f = new C94443c(this);

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI$a */
    public static final class C94441a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerResDownloadUI f273082d;

        public C94441a(RepairerResDownloadUI repairerResDownloadUI) {
            this.f273082d = repairerResDownloadUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f273082d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI$b */
    public static final class C94442b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerResDownloadUI f273083d;

        public C94442b(RepairerResDownloadUI repairerResDownloadUI) {
            this.f273083d = repairerResDownloadUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int a = C102190i.m134653a(((MMEditText) this.f273083d.findViewById(C0966R.C0970id.kzb)).getText().toString(), 0);
            if (a != 0) {
                ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(a);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/RepairerResDownloadUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerResDownloadUI$c */
    public static final class C94443c implements C77306a {

        /* renamed from: d */
        public final /* synthetic */ RepairerResDownloadUI f273084d;

        public C94443c(RepairerResDownloadUI repairerResDownloadUI) {
            this.f273084d = repairerResDownloadUI;
        }

        public void onChanged(Object obj) {
            C77307c cVar = (C77307c) obj;
            C87412m.m108594g(cVar, "event");
            this.f273084d.f273079d.append("========================\n");
            StringBuffer stringBuffer = this.f273084d.f273079d;
            stringBuffer.append("netSceneAction:" + cVar.f225433a + " errType:" + cVar.f225434b + " errCode:" + cVar.f225435c + 10);
            C61926c.m72668M(new C94444a(this.f273084d));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsz;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C94441a(this));
        View findViewById = findViewById(C0966R.C0970id.hll);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C94442b(this));
        }
        this.f273080e.alive();
        C86709a0.m107524d().mo123468n(721, this, this.f273081f);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f273080e.dead();
    }
}
