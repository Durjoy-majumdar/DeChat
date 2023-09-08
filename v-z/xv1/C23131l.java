package xv1;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C56782d;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kv1.C99254i;
import pv1.C22019b;

/* renamed from: xv1.l */
public class C23131l extends C22019b {

    /* renamed from: p */
    public CharSequence f66443p;

    /* renamed from: q */
    public C22019b.C22021b f66444q = new C23133b();

    /* renamed from: r */
    public C22019b.C22020a f66445r = new C23132a(this);

    /* renamed from: xv1.l$a */
    public class C23132a extends C22019b.C22020a {

        /* renamed from: a */
        public TextView f66446a;

        /* renamed from: b */
        public View f66447b;

        public C23132a(C23131l lVar) {
            super(lVar);
        }
    }

    /* renamed from: xv1.l$b */
    public class C23133b extends C22019b.C22021b {
        public C23133b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            C23132a aVar2 = (C23132a) aVar;
            C93938f0.m118693a(C23131l.this.f66443p, aVar2.f66446a);
            if (C23131l.this.f62324b == 0) {
                View view = aVar2.f66447b;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSInfoDataItem$FTSInfoViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/item/FTSInfoDataItem$FTSInfoViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = aVar2.f66447b;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/fts/ui/item/FTSInfoDataItem$FTSInfoViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/fts/ui/item/FTSInfoDataItem$FTSInfoViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cqx, viewGroup, false);
            C23132a aVar = (C23132a) C23131l.this.f66445r;
            aVar.f66446a = (TextView) inflate.findViewById(C0966R.C0970id.f358456f71);
            aVar.f66447b = inflate.findViewById(C0966R.C0970id.hqn);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            return false;
        }
    }

    public C23131l(int i) {
        super(11, i);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        this.f66443p = C99254i.m129316m(context.getString(C0966R.string.igo), context.getString(C0966R.string.ign), TextUtils.ellipsize(mo35139k(), C56782d.f162741e, 400.0f, TextUtils.TruncateAt.MIDDLE).toString());
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return this.f66444q;
    }
}
