package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p702ts.C78083b;
import x22.C102550b;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.a$$b */
public class a$$b implements C78083b.C78084a {

    /* renamed from: a */
    public final /* synthetic */ C94161a f271966a;

    public a$$b(C94161a aVar) {
        this.f271966a = aVar;
    }

    public void onLocationAddr(Addr addr) {
        Log.m105919d("MicroMsg.BaseMapUI", "onGetAddrss  %s", addr.toString());
        this.f271966a.getClass();
        String a = addr.mo174342a();
        C94161a aVar = this.f271966a;
        LocationInfo locationInfo = aVar.f271952h;
        Resources resources = aVar.f271948d.getResources();
        this.f271966a.getClass();
        locationInfo.f271935j = resources.getString(C0966R.string.gaw);
        Object obj = addr.f343972w;
        if (obj != null && obj.equals(this.f271966a.f271952h.f271929d)) {
            this.f271966a.f271952h.f271933h = a;
        } else if (!Util.isNullOrNil(addr.f343956d)) {
            this.f271966a.f271953i.f271967a.setVisibility(0);
        }
        Object obj2 = addr.f343972w;
        if (obj2 != null && this.f271966a.f271954j.containsKey(obj2)) {
            C102550b bVar = this.f271966a.f271954j.get(addr.f343972w);
            bVar.setText(bVar.getPreText() + a);
        }
    }
}
