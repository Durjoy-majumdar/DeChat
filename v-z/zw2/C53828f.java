package zw2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p763ym.C79138l;

/* renamed from: zw2.f */
public class C53828f extends BaseAdapter implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public Context f151049d;

    /* renamed from: e */
    public boolean f151050e = false;

    /* renamed from: f */
    public List<C44561j> f151051f;

    public C53828f(Context context, List<C44561j> list) {
        this.f151049d = context;
        this.f151051f = list;
    }

    /* renamed from: a */
    public boolean mo74446a(int i) {
        int size = this.f151051f.size();
        return i >= size && i < size + ((4 - (this.f151051f.size() % 4)) % 4);
    }

    public int getCount() {
        return this.f151051f.size() + ((4 - (this.f151051f.size() % 4)) % 4);
    }

    public Object getItem(int i) {
        if (mo74446a(i)) {
            return null;
        }
        return this.f151051f.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C53831i iVar;
        Class cls = C79138l.class;
        if (view == null) {
            iVar = new C53831i();
            view2 = View.inflate(this.f151049d, C0966R.C0971layout.f6497gf, (ViewGroup) null);
            iVar.f151054a = (ImageView) view2.findViewById(C0966R.C0970id.f6109xj);
            iVar.f151055b = (TextView) view2.findViewById(C0966R.C0970id.f6108xi);
            iVar.f151056c = (TextView) view2.findViewById(C0966R.C0970id.f6110xk);
            iVar.f151057d = view2.findViewById(C0966R.C0970id.f6111xl);
            view2.setTag(iVar);
        } else {
            iVar = (C53831i) view.getTag();
            view2 = view;
        }
        View view3 = iVar.f151057d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (mo74446a(i)) {
            iVar.f151054a.setVisibility(4);
            iVar.f151055b.setVisibility(4);
            iVar.f151056c.setVisibility(4);
            return view2;
        }
        C44561j jVar = (C44561j) getItem(i);
        iVar.f151054a.setVisibility(0);
        Bitmap ub = ((C79138l) C86312j.m106911c(cls)).mo74018ub(jVar.field_appId, 5, C76577a.m92156g(this.f151049d));
        if (ub == null) {
            iVar.f151054a.setBackgroundResource(C0966R.C0969drawable.bdj);
        } else {
            iVar.f151054a.setBackgroundDrawable(new BitmapDrawable(ub));
        }
        iVar.f151056c.setVisibility(0);
        iVar.f151056c.setText(((C79138l) C86312j.m106911c(cls)).mo74011hv(this.f151049d, jVar));
        if (this.f151050e) {
            iVar.f151055b.setVisibility(0);
        } else {
            iVar.f151055b.setVisibility(8);
        }
        return view2;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        notifyDataSetChanged();
    }
}
