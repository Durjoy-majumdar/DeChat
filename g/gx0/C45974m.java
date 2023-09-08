package gx0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.BizSearchDetailPageUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import qj3.C47856a;

/* renamed from: gx0.m */
public class C45974m extends C47856a {

    /* renamed from: h */
    public static C47856a.C47858b f123989h;

    /* renamed from: d */
    public String f123990d;

    /* renamed from: e */
    public long f123991e;

    /* renamed from: f */
    public String f123992f;

    /* renamed from: g */
    public int f123993g;

    /* renamed from: gx0.m$a */
    public class C45975a extends C47856a.C47858b {
        public C45975a(C45974m mVar) {
        }

        /* renamed from: a */
        public void mo63542a(View view, C47856a.C47857a aVar) {
            if (view != null && aVar != null && (aVar instanceof C45976b)) {
                ((C45976b) aVar).f123994a = (TextView) view.findViewById(C0966R.C0970id.kmy);
            }
        }

        /* renamed from: b */
        public void mo63543b(Context context, C47856a.C47857a aVar, C47856a aVar2, Object... objArr) {
            if (context == null || aVar == null || aVar2 == null) {
                Log.m105920e("MicroMsg.ReadMoreBtnDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            } else if (!(aVar instanceof C45976b)) {
                Log.m105920e("MicroMsg.ReadMoreBtnDataItem", "The ViewHolder is not a instance of MoreBtnViewHolder.");
            } else if (!(aVar2 instanceof C45974m)) {
                Log.m105920e("MicroMsg.ReadMoreBtnDataItem", "The DataItem is not a instance of MoreBtnDataItem.");
            } else {
                ((C45976b) aVar).f123994a.setText(((C45974m) aVar2).f123990d);
            }
        }

        /* renamed from: c */
        public View mo63544c(Context context, ViewGroup viewGroup, View view) {
            return view == null ? View.inflate(context, C0966R.C0971layout.bvh, (ViewGroup) null) : view;
        }

        /* renamed from: d */
        public boolean mo63545d(Context context, View view, C47856a aVar, Object... objArr) {
            int i;
            if (!(context == null || aVar == null)) {
                if (objArr != null && objArr.length >= 2) {
                    Integer num = objArr[1];
                    if (num instanceof Integer) {
                        i = num.intValue();
                        C45974m mVar = (C45974m) aVar;
                        Intent intent = new Intent(context, BizSearchDetailPageUI.class);
                        intent.putExtra("keyword", mVar.f123992f);
                        intent.putExtra("businessType", mVar.f123991e);
                        intent.putExtra("offset", mVar.f123993g);
                        intent.putExtra("showEditText", true);
                        intent.putExtra("fromScene", i);
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent);
                        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/ReadMoreBtnDataItem$1", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/mm/plugin/brandservice/ui/ReadMoreBtnDataItem$1", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                i = 0;
                C45974m mVar2 = (C45974m) aVar;
                Intent intent2 = new Intent(context, BizSearchDetailPageUI.class);
                intent2.putExtra("keyword", mVar2.f123992f);
                intent2.putExtra("businessType", mVar2.f123991e);
                intent2.putExtra("offset", mVar2.f123993g);
                intent2.putExtra("showEditText", true);
                intent2.putExtra("fromScene", i);
                C9556a aVar22 = new C9556a();
                aVar22.mo10233c(intent2);
                C117292a.m165358d(context, aVar22.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/ReadMoreBtnDataItem$1", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar22.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/brandservice/ui/ReadMoreBtnDataItem$1", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            return true;
        }
    }

    /* renamed from: gx0.m$b */
    public static class C45976b implements C47856a.C47857a {

        /* renamed from: a */
        public TextView f123994a;
    }

    public C45974m(Object obj, long j, int i, String str) {
        super(2, obj);
        this.f123991e = j;
        this.f123992f = str;
        this.f123993g = i;
    }

    /* renamed from: a */
    public void mo63539a(Context context, C47856a.C47857a aVar, Object... objArr) {
        this.f123990d = "";
    }

    /* renamed from: b */
    public C47856a.C47857a mo63540b() {
        return new C45976b();
    }

    /* renamed from: c */
    public C47856a.C47858b mo63541c() {
        if (f123989h == null) {
            f123989h = new C45975a(this);
        }
        return f123989h;
    }
}
