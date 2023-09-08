package zw2;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p763ym.C79138l;

/* renamed from: zw2.d */
public class C53826d extends BaseAdapter implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public Context f151044d;

    /* renamed from: e */
    public boolean f151045e = false;

    /* renamed from: f */
    public int f151046f;

    /* renamed from: g */
    public List<C44561j> f151047g;

    public C53826d(Context context, int i) {
        this.f151044d = context;
        this.f151046f = i;
        mo74440a();
    }

    /* renamed from: a */
    public final void mo74440a() {
        this.f151047g = new ArrayList();
        C44579p yx02 = C72709y1.yx0();
        int i = this.f151046f;
        yx02.getClass();
        Cursor rawQuery = yx02.rawQuery("select * from AppInfo where status = " + i + " and (appType is null or appType not like '," + 1 + ",')", new String[0]);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.AppInfoStorage", "getAppByStatusExcludeByType: curosr is null");
            rawQuery = null;
        }
        if (rawQuery != null) {
            int count = rawQuery.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                rawQuery.moveToPosition(i2);
                C44561j jVar = new C44561j();
                jVar.convertFrom(rawQuery);
                if (((C79138l) C86312j.m106911c(C79138l.class)).Tb0(this.f151044d, jVar.field_appId)) {
                    this.f151047g.add(jVar);
                }
            }
            rawQuery.close();
        }
    }

    /* renamed from: b */
    public boolean mo74441b(int i) {
        int size = ((ArrayList) this.f151047g).size();
        return i >= size && i < size + ((4 - (((ArrayList) this.f151047g).size() % 4)) % 4);
    }

    public int getCount() {
        return ((ArrayList) this.f151047g).size() + ((4 - (((ArrayList) this.f151047g).size() % 4)) % 4);
    }

    public Object getItem(int i) {
        if (mo74441b(i)) {
            return null;
        }
        return ((ArrayList) this.f151047g).get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C53832j jVar;
        Class cls = C79138l.class;
        if (view == null) {
            jVar = new C53832j();
            view2 = View.inflate(this.f151044d, C0966R.C0971layout.f6497gf, (ViewGroup) null);
            jVar.f151058a = (ImageView) view2.findViewById(C0966R.C0970id.f6109xj);
            jVar.f151059b = (TextView) view2.findViewById(C0966R.C0970id.f6108xi);
            jVar.f151060c = (TextView) view2.findViewById(C0966R.C0970id.f6110xk);
            jVar.f151061d = view2.findViewById(C0966R.C0970id.f6111xl);
            view2.setTag(jVar);
        } else {
            jVar = (C53832j) view.getTag();
            view2 = view;
        }
        View view3 = jVar.f151061d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/openapi/AppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/subapp/ui/openapi/AppAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (mo74441b(i)) {
            jVar.f151058a.setVisibility(4);
            jVar.f151059b.setVisibility(4);
            jVar.f151060c.setVisibility(4);
            return view2;
        }
        C44561j jVar2 = (C44561j) getItem(i);
        jVar.f151058a.setVisibility(0);
        Bitmap ub = ((C79138l) C86312j.m106911c(cls)).mo74018ub(jVar2.field_appId, 1, C76577a.m92156g(this.f151044d));
        if (ub == null) {
            jVar.f151058a.setBackgroundResource(C0966R.C0969drawable.bdj);
        } else {
            jVar.f151058a.setBackgroundDrawable(new BitmapDrawable(ub));
        }
        jVar.f151060c.setVisibility(0);
        jVar.f151060c.setText(((C79138l) C86312j.m106911c(cls)).mo74011hv(this.f151044d, jVar2));
        if (this.f151045e) {
            jVar.f151059b.setVisibility(0);
        } else {
            jVar.f151059b.setVisibility(8);
        }
        return view2;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        mo74440a();
        notifyDataSetChanged();
    }
}
