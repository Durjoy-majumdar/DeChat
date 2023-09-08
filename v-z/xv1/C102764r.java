package xv1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import kv1.C99251g;
import kv1.C99254i;
import lv1.C99667f;
import lv1.C99672i;
import pv1.C22019b;

/* renamed from: xv1.r */
public class C102764r extends C23128k {

    /* renamed from: u */
    public int f303451u;

    /* renamed from: v */
    public C102766b f303452v = new C102766b();

    /* renamed from: w */
    public C102765a f303453w = new C102765a(this);

    /* renamed from: xv1.r$a */
    public class C102765a extends C22019b.C22020a {

        /* renamed from: a */
        public TextView f303454a;

        /* renamed from: b */
        public TextView f303455b;

        public C102765a(C102764r rVar) {
            super(rVar);
        }
    }

    /* renamed from: xv1.r$b */
    public class C102766b extends C22019b.C22021b {

        /* renamed from: xv1.r$b$a */
        public class C102767a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ Context f303457d;

            public C102767a(Context context) {
                this.f303457d = context;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifySenderHeaderDataItem$FTSServiceNotifySenderHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Intent intent = new Intent();
                intent.putExtra("Search_Scene", 4);
                intent.putExtra("Search_Str", C102764r.this.f62327e.f292120a);
                C99251g.m129295p(this.f303457d, ".ui.FTSServiceNotifyUI", intent);
                C115669n.INSTANCE.mo160131h(23903, 5, Long.valueOf(Util.nowSecond()), null, 0);
                C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifySenderHeaderDataItem$FTSServiceNotifySenderHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C102766b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C102765a aVar2 = (C102765a) aVar;
            String string = context.getString(C0966R.string.ihy, new Object[]{C102764r.this.f62327e.f292120a});
            TextView textView = aVar2.f303454a;
            C99672i iVar = C102764r.this.f62327e;
            C99667f fVar = new C99667f();
            fVar.f292088a = string;
            fVar.f292089b = iVar;
            fVar.f292090c = false;
            fVar.f292091d = false;
            fVar.f292095h = textView.getPaint();
            C93938f0.m118693a(C99254i.m129308e(fVar).f292107a, aVar2.f303454a);
            if (((C102764r) bVar).f303451u > 3) {
                aVar2.f303455b.setVisibility(0);
                aVar2.f303455b.setOnClickListener(new C102767a(context));
                return;
            }
            aVar2.f303455b.setVisibility(8);
            aVar2.f303455b.setOnClickListener((View.OnClickListener) null);
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.atq, viewGroup, false);
            C102765a aVar = C102764r.this.f303453w;
            aVar.f303454a = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f303455b = (TextView) inflate.findViewById(C0966R.C0970id.h06);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return false;
        }
    }

    public C102764r(int i) {
        super(i);
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f303452v;
    }

    /* renamed from: l */
    public C22019b.C22020a mo36518l() {
        return this.f303453w;
    }
}
