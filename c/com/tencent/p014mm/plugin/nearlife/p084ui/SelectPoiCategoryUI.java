package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PoiCategoriesUpdateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97625j3;
import j20.C117292a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import uc0.C52522u;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI */
public class SelectPoiCategoryUI extends MMActivity {

    /* renamed from: j */
    public static final String f20079j = (C72994y1.f212832a + "poi_categories");

    /* renamed from: d */
    public EventListener f20080d;

    /* renamed from: e */
    public ListView f20081e;

    /* renamed from: f */
    public ArrayAdapter<String> f20082f;

    /* renamed from: g */
    public List<String> f20083g;

    /* renamed from: h */
    public AdapterView.OnItemClickListener f20084h = new C4925a();

    /* renamed from: i */
    public MenuItem.OnMenuItemClickListener f20085i = new C4926b();

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI$EventListener */
    public class EventListener extends IListener<PoiCategoriesUpdateEvent> {

        /* renamed from: d */
        public SelectPoiCategoryUI f20086d;

        public EventListener(SelectPoiCategoryUI selectPoiCategoryUI, int i) {
            super(C40008f.f107254d, i);
            this.__eventId = -459979365;
        }

        public boolean callback(IEvent iEvent) {
            PoiCategoriesUpdateEvent poiCategoriesUpdateEvent = (PoiCategoriesUpdateEvent) iEvent;
            if (poiCategoriesUpdateEvent instanceof PoiCategoriesUpdateEvent) {
                SelectPoiCategoryUI selectPoiCategoryUI = this.f20086d;
                byte[] bArr = poiCategoriesUpdateEvent.f9399d.f9400a;
                selectPoiCategoryUI.getClass();
                String str = SelectPoiCategoryUI.f20079j;
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0 f0Var = C116281f0.C116289i.f348994a;
                C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
                try {
                    String str2 = str + "/" + "lastest_poi_categories.dat";
                    C86009m1 m1Var = new C86009m1(str2);
                    if (!m1Var.mo119967g()) {
                        m1Var.mo119964e();
                    }
                    C86013q1.m106438T(str2, bArr, 0, bArr.length);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.SelectPoiCategoryUI", "write file failed: " + e.getMessage());
                }
                String[] split = new String(bArr).split("\n");
                ((ArrayList) selectPoiCategoryUI.f20083g).clear();
                for (String trim : split) {
                    ((ArrayList) selectPoiCategoryUI.f20083g).add(trim.trim());
                }
                selectPoiCategoryUI.mo5877H7();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI$a */
    public class C4925a implements AdapterView.OnItemClickListener {
        public C4925a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            Log.m105919d("MicroMsg.SelectPoiCategoryUI", "item click on pos:%d, len:%d", Integer.valueOf(i), Integer.valueOf(((ArrayList) SelectPoiCategoryUI.this.f20083g).size()));
            Intent intent = new Intent();
            intent.putExtra("poi_category", (String) ((ArrayList) SelectPoiCategoryUI.this.f20083g).get(i));
            SelectPoiCategoryUI.this.setResult(-1, intent);
            SelectPoiCategoryUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/SelectPoiCategoryUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.SelectPoiCategoryUI$b */
    public class C4926b implements MenuItem.OnMenuItemClickListener {
        public C4926b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectPoiCategoryUI.this.setResult(0, (Intent) null);
            SelectPoiCategoryUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo5877H7() {
        this.f20082f.clear();
        for (int i = 0; i < this.f20083g.size(); i++) {
            this.f20082f.add(this.f20083g.get(i));
        }
        this.f20082f.notifyDataSetChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[SYNTHETIC, Splitter:B:23:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e A[SYNTHETIC, Splitter:B:30:0x007e] */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5878I7(java.io.InputStream r8) {
        /*
            r7 = this;
            java.lang.String r0 = "close file failed: "
            java.lang.String r1 = "MicroMsg.SelectPoiCategoryUI"
            if (r8 != 0) goto L_0x0008
            r8 = 0
            return r8
        L_0x0008:
            r2 = 0
            java.util.List<java.lang.String> r3 = r7.f20083g
            r3.clear()
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004c, all -> 0x0047 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004c, all -> 0x0047 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r8, r5)     // Catch:{ IOException -> 0x004c, all -> 0x0047 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x004c, all -> 0x0047 }
        L_0x001a:
            java.lang.String r2 = r3.readLine()     // Catch:{ IOException -> 0x0045 }
            if (r2 == 0) goto L_0x0026
            java.util.List<java.lang.String> r4 = r7.f20083g     // Catch:{ IOException -> 0x0045 }
            r4.add(r2)     // Catch:{ IOException -> 0x0045 }
            goto L_0x001a
        L_0x0026:
            r3.close()     // Catch:{ Exception -> 0x002d }
            r8.close()     // Catch:{ Exception -> 0x002d }
            goto L_0x0079
        L_0x002d:
            r8 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x0033:
            r2.append(r0)
            java.lang.String r8 = r8.getMessage()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r8)
            goto L_0x0079
        L_0x0045:
            r2 = move-exception
            goto L_0x0050
        L_0x0047:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x007c
        L_0x004c:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
        L_0x0050:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r4.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r5 = "read file failed: "
            r4.append(r5)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x007b }
            r4.append(r2)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x007b }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ all -> 0x007b }
            if (r3 == 0) goto L_0x006e
            r3.close()     // Catch:{ Exception -> 0x0072 }
        L_0x006e:
            r8.close()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0079
        L_0x0072:
            r8 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x0033
        L_0x0079:
            r8 = 1
            return r8
        L_0x007b:
            r2 = move-exception
        L_0x007c:
            if (r3 == 0) goto L_0x0081
            r3.close()     // Catch:{ Exception -> 0x0085 }
        L_0x0081:
            r8.close()     // Catch:{ Exception -> 0x0085 }
            goto L_0x009c
        L_0x0085:
            r8 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r8 = r8.getMessage()
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r8)
        L_0x009c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.nearlife.p084ui.SelectPoiCategoryUI.mo5878I7(java.io.InputStream):boolean");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bw_;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.h9m);
        setBackBtn(this.f20085i);
        this.f20082f = new ArrayAdapter<>(this, C0966R.C0971layout.bn8);
        ListView listView = (ListView) findViewById(C0966R.C0970id.ay7);
        this.f20081e = listView;
        listView.setAdapter(this.f20082f);
        this.f20081e.setOnItemClickListener(this.f20084h);
        String str = f20079j + "/" + "lastest_poi_categories.dat";
        boolean z = false;
        if (!Util.isNullOrNil(str)) {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                try {
                    z = mo5878I7(C86013q1.m106421C(n, f0Var.mo177799l(n, l)));
                } catch (FileNotFoundException e) {
                    Log.m105919d("MicroMsg.SelectPoiCategoryUI", "update poi categories failed, path:%s, msg:%s", str, e.getMessage());
                }
            }
        }
        if (!z) {
            try {
                mo5878I7(getAssets().open("default_poi_categories.dat"));
            } catch (IOException e2) {
                Log.m105918d("MicroMsg.SelectPoiCategoryUI", "open file from assets failed: " + e2.getMessage());
            }
        }
        mo5877H7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20083g = new ArrayList();
        initView();
        EventListener eventListener = new EventListener(this, 0);
        this.f20080d = eventListener;
        eventListener.alive();
        this.f20080d.f20086d = this;
        C97625j3.m125815e().mo123460f(new C52522u(17));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f20080d.dead();
    }
}
