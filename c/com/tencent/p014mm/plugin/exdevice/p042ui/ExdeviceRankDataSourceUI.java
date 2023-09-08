package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.exdevice.model.C41177z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d81.C45288e;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import te3.C49252e92;
import te3.ip4;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI */
public class ExdeviceRankDataSourceUI extends MMActivity implements C11385n {

    /* renamed from: f */
    public static final /* synthetic */ int f111204f = 0;

    /* renamed from: d */
    public ListView f111205d;

    /* renamed from: e */
    public C41291e f111206e;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI$a */
    public class C41287a implements MenuItem.OnMenuItemClickListener {
        public C41287a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceRankDataSourceUI exdeviceRankDataSourceUI = ExdeviceRankDataSourceUI.this;
            int i = ExdeviceRankDataSourceUI.f111204f;
            exdeviceRankDataSourceUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI$b */
    public class C41288b implements View.OnClickListener {
        public C41288b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceRankDataSourceUI.this.startActivityForResult(new Intent(ExdeviceRankDataSourceUI.this.getContext(), ExdeviceAddDataSourceUI.class), 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankDataSourceUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI$c */
    public class C41289c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f111209d;

        public C41289c(List list) {
            this.f111209d = list;
        }

        public void run() {
            C41291e eVar = ExdeviceRankDataSourceUI.this.f111206e;
            List<ip4> list = this.f111209d;
            ((LinkedList) eVar.f111213d).clear();
            if (!(list == null || list.size() == 0)) {
                for (ip4 ip4 : list) {
                    if (ip4 != null) {
                        List<C41290d> list2 = eVar.f111213d;
                        int i = ExdeviceRankDataSourceUI.f111204f;
                        C41290d dVar = new C41290d();
                        dVar.f111212b = null;
                        dVar.f111211a = ip4;
                        ((LinkedList) list2).add(dVar);
                    }
                }
            }
            ExdeviceRankDataSourceUI.this.f111206e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI$d */
    public static class C41290d {

        /* renamed from: a */
        public ip4 f111211a;

        /* renamed from: b */
        public C53753b f111212b;
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI$e */
    public static final class C41291e extends BaseAdapter {

        /* renamed from: d */
        public List<C41290d> f111213d = new LinkedList();

        /* renamed from: e */
        public C20937c f111214e;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI$e$a */
        public static class C41292a {

            /* renamed from: a */
            public TextView f111215a;

            /* renamed from: b */
            public ImageView f111216b;
        }

        public C41291e() {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.C0969drawable.f357145c00;
            this.f111214e = bVar.mo32666a();
        }

        public int getCount() {
            return ((LinkedList) this.f111213d).size();
        }

        public Object getItem(int i) {
            return (C41290d) ((LinkedList) this.f111213d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C41292a aVar;
            ip4 ip4;
            String str;
            C41290d dVar = (C41290d) ((LinkedList) this.f111213d).get(i);
            if (view == null) {
                aVar = new C41292a();
                view2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.a4t, (ViewGroup) null);
                aVar.f111215a = (TextView) view2.findViewById(C0966R.C0970id.h_3);
                aVar.f111216b = (ImageView) view2.findViewById(C0966R.C0970id.f1b);
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (C41292a) view.getTag();
            }
            int i2 = ExdeviceRankDataSourceUI.f111204f;
            String str2 = "";
            if (!(dVar == null || (ip4 = dVar.f111211a) == null)) {
                if (!Util.isNullOrNil(ip4.f135577h)) {
                    str2 = dVar.f111211a.f135577h;
                } else {
                    C53753b bVar = dVar.f111212b;
                    if (bVar != null) {
                        if (!Util.isNullOrNil(bVar.f150113y)) {
                            str = bVar.f150113y;
                        } else if (!Util.isNullOrNil(bVar.f150085B)) {
                            str = bVar.f150085B;
                        } else {
                            long j = bVar.field_mac;
                            str = j != 0 ? C45288e.m50135f(j) : !Util.isNullOrNil(bVar.field_deviceID) ? bVar.field_deviceID : null;
                        }
                        str2 = Util.nullAsNil(str);
                    }
                }
            }
            dVar.getClass();
            Log.m105919d("MicroMsg.ExdeviceRankDataSourceUI", "position(%s), name(%s), mac(%s).", Integer.valueOf(i), str2, null);
            aVar.f111215a.setText(str2);
            C20828a.m22825b().mo32519h(dVar.f111211a.f135578i, aVar.f111216b, this.f111214e);
            return view2;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a4u;
    }

    public void initView() {
        this.f111205d = (ListView) findViewById(C0966R.C0970id.fph);
        View inflate = View.inflate(this, C0966R.C0971layout.a4w, (ViewGroup) null);
        View inflate2 = View.inflate(this, C0966R.C0971layout.a4v, (ViewGroup) null);
        this.f111205d.addHeaderView(inflate, (Object) null, false);
        this.f111205d.addFooterView(inflate2, (Object) null, false);
        C41291e eVar = new C41291e();
        this.f111206e = eVar;
        this.f111205d.setAdapter(eVar);
        ((ScrollView) findViewById(C0966R.C0970id.j4b)).scrollTo(0, 0);
        inflate2.setOnClickListener(new C41288b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C41290d dVar;
        C41290d dVar2;
        Log.m105919d("MicroMsg.ExdeviceRankDataSourceUI", "onActivityResult, reqCode(%s), resultCode(%s)", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1 && i2 == -1 && intent != null) {
            long longExtra = intent.getLongExtra("device_mac", 0);
            intent.getIntExtra(TPReportKeys.Common.COMMON_STEP, 0);
            if (longExtra == 0) {
                Log.m105920e("MicroMsg.ExdeviceRankDataSourceUI", "onActivityResult, mac is nil.");
                return;
            }
            String f = C45288e.m50135f(longExtra);
            if (f == null) {
                Log.m105921e("MicroMsg.ExdeviceRankDataSourceUI", "invalid mac(%s).", f);
                return;
            }
            C41291e eVar = this.f111206e;
            synchronized (eVar) {
                dVar = null;
                if (!Util.isNullOrNil(f)) {
                    Iterator<C41290d> it = eVar.f111213d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        dVar2 = it.next();
                        dVar2.getClass();
                        if (f.equals((Object) null)) {
                            break;
                        }
                    }
                }
                dVar2 = null;
            }
            if (dVar2 != null) {
                Log.m105924i("MicroMsg.ExdeviceRankDataSourceUI", "The device has been added, now switch it to be the main device.");
                return;
            }
            C53753b kD = C41166r1.Bx0().mo74337kD(longExtra);
            if (kD == null) {
                Log.m105929w("MicroMsg.ExdeviceRankDataSourceUI", "hard device info is null.(mac : %s)", Long.valueOf(longExtra));
                return;
            }
            C41291e eVar2 = this.f111206e;
            String str = kD.field_deviceID;
            String str2 = kD.field_deviceType;
            synchronized (eVar2) {
                Iterator<C41290d> it4 = eVar2.f111213d.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    C41290d next = it4.next();
                    if (next != null) {
                        ip4 ip4 = next.f111211a;
                        if ((ip4 == null || str == null || str2 == null || !str.equals(ip4.f135573d) || !str2.equals(ip4.f135574e)) ? false : true) {
                            dVar = next;
                            break;
                        }
                    }
                }
            }
            if (dVar != null) {
                Log.m105924i("MicroMsg.ExdeviceRankDataSourceUI", "The device has been added, now switch it to be the main device.");
                return;
            }
            C86709a0.m107529k().f251779b.mo123455a(1267, this);
            C86709a0.m107529k().f251779b.mo123460f(new C41177z0());
        }
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C41287a());
        setMMTitle((int) C0966R.string.f360301bq1);
        C86709a0.m107529k().f251779b.mo123455a(1267, this);
        initView();
        C86709a0.m107529k().f251779b.mo123460f(new C41177z0());
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(1267, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar == null) {
            Log.m105920e("MicroMsg.ExdeviceRankDataSourceUI", "onSceneEnd, scene is null.");
        } else if (yVar instanceof C41177z0) {
            C86709a0.m107529k().f251779b.mo123470p(1267, this);
            if (i == 0 && i2 == 0) {
                C49252e92 e922 = (C49252e92) ((C41177z0) yVar).f110937e.f127056b.f127083a;
                Object[] objArr = new Object[1];
                LinkedList<ip4> linkedList = e922.f132816d;
                objArr[0] = Integer.valueOf(linkedList != null ? linkedList.size() : 0);
                Log.m105919d("MicroMsg.ExdeviceRankDataSourceUI", "onSceneEnd, get sport device list succ.(size : %d)", objArr);
                runOnUiThread(new C41289c(e922.f132816d));
            }
        }
    }
}
