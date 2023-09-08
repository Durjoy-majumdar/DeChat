package xv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C18843b0;
import com.tencent.p014mm.plugin.fts.p059ui.C4409a0;
import com.tencent.p014mm.plugin.fts.p059ui.C4410e0;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import pv1.C22019b;
import zt3.C119157j;

/* renamed from: xv1.k */
public class C23128k extends C22019b {

    /* renamed from: p */
    public String f66433p;

    /* renamed from: q */
    public String f66434q;

    /* renamed from: r */
    public View.OnClickListener f66435r;

    /* renamed from: s */
    public C23130b f66436s = new C23130b();

    /* renamed from: t */
    public C23129a f66437t = new C23129a(this);

    /* renamed from: xv1.k$a */
    public class C23129a extends C22019b.C22020a {

        /* renamed from: a */
        public View f66438a;

        /* renamed from: b */
        public TextView f66439b;

        /* renamed from: c */
        public TextView f66440c;

        /* renamed from: d */
        public View f66441d;

        public C23129a(C23128k kVar) {
            super(kVar);
        }
    }

    /* renamed from: xv1.k$b */
    public class C23130b extends C22019b.C22021b {
        public C23130b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            View.OnClickListener onClickListener;
            C23129a aVar2 = (C23129a) aVar;
            C93938f0.m118694b(C23128k.this.f66433p, aVar2.f66439b);
            C93938f0.m118694b(C23128k.this.f66434q, aVar2.f66440c);
            TextView textView = aVar2.f66440c;
            if (!(textView == null || (onClickListener = C23128k.this.f66435r) == null)) {
                textView.setOnClickListener(onClickListener);
                String k = C23128k.this.mo35139k();
                int i = C18843b0.f52842a;
                ((C119157j) C119157j.f356862d).mo183878i(new C4409a0(1, k), 100);
            }
            if (C23128k.this.f62324b == 0) {
                View view = aVar2.f66441d;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = aVar2.f66441d;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = aVar2.f66438a;
            if (C23128k.this.f62326d) {
                view5.setBackgroundResource(C0966R.C0969drawable.bcr);
            } else {
                view5.setBackgroundResource(C0966R.C0969drawable.ags);
            }
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqw, viewGroup, false);
            C23129a aVar = (C23129a) C23128k.this.mo36518l();
            aVar.f66439b = (TextView) inflate.findViewById(C0966R.C0970id.evf);
            aVar.f66440c = (TextView) inflate.findViewById(C0966R.C0970id.m1y);
            aVar.f66441d = inflate.findViewById(C0966R.C0970id.hqn);
            aVar.f66438a = inflate.findViewById(C0966R.C0970id.f359139j63);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return false;
        }
    }

    public C23128k(int i) {
        super(0, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        this.f66433p = Util.nullAs(C93938f0.m118696d(this.f62329g), "");
        if (this.f62328f == 2) {
            int i = this.f62329g != -4 ? 0 : C0966R.string.a08;
            C4410e0 e0Var = null;
            this.f66434q = Util.nullAs(i == 0 ? null : MMApplicationContext.getContext().getString(i), "");
            int i2 = this.f62329g;
            String k = mo35139k();
            if (i2 == -4) {
                e0Var = new C4410e0(k);
            }
            this.f66435r = e0Var;
        }
        Log.m105925i("MicroMsg.FTS.FTSHeaderDataItem", "fillingDataItem: header=%s", this.f66433p);
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f66436s;
    }

    /* renamed from: l */
    public C22019b.C22020a mo36518l() {
        return this.f66437t;
    }
}
