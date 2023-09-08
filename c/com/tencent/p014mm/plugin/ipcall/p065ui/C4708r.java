package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76875f0;
import qo3.C77407n;
import s12.C13614k;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.r */
public class C4708r implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C4725w f19697d;

    public C4708r(C4725w wVar) {
        this.f19697d = wVar;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C4709r0 r0Var = this.f19697d.f19732b;
        if (r0Var.f19701q == null) {
            r0Var.mo5617s();
        }
        ListView listView = (ListView) adapterView;
        C13614k kVar = this.f19697d.f19732b.f19701q.get(i - listView.getHeaderViewsCount());
        C4725w wVar = this.f19697d;
        int headerViewsCount = i - listView.getHeaderViewsCount();
        if (kVar == null) {
            wVar.getClass();
        } else {
            IPCallAddressUI iPCallAddressUI = wVar.f19734d;
            LayoutInflater.from(iPCallAddressUI);
            boolean z = false;
            C77407n nVar = new C77407n((Context) iPCallAddressUI, 1, false);
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            C4720u uVar = new C4720u(wVar);
            C4722v vVar = new C4722v(wVar, kVar, headerViewsCount);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                f0Var.f224728w = null;
                f0Var.f224729x = null;
            }
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            C76875f0 f0Var2 = new C76875f0(iPCallAddressUI, 0, 0);
            f0Var2.f224723r = C0966R.string.f7944x1;
            arrayList2.add(f0Var2);
            if (arrayList2.size() == 0) {
                z = true;
            }
            if (z) {
                Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                nVar.f225771i = uVar;
                nVar.f225782p = vVar;
                nVar.f225761d = null;
                nVar.f225725D = null;
                nVar.mo107573q();
            }
        }
        return true;
    }
}
