package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import go3.C45940u;
import p227rn.C48053v;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.e */
public class C40662e implements AdapterView.OnItemLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseBizContactListView f109248d;

    public C40662e(EnterpriseBizContactListView enterpriseBizContactListView) {
        this.f109248d = enterpriseBizContactListView;
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        EnterpriseBizContactListView enterpriseBizContactListView = this.f109248d;
        if (enterpriseBizContactListView.f109097x == null) {
            enterpriseBizContactListView.f109097x = new EnterpriseBizContactListView.C40614e(enterpriseBizContactListView);
        }
        EnterpriseBizContactListView enterpriseBizContactListView2 = this.f109248d;
        EnterpriseBizContactListView.C40614e eVar = enterpriseBizContactListView2.f109097x;
        int i2 = enterpriseBizContactListView2.f109098y;
        int i3 = enterpriseBizContactListView2.f109099z;
        if (eVar.f109106e == null) {
            EnterpriseBizContactListView enterpriseBizContactListView3 = eVar.f109108g.get();
            if (enterpriseBizContactListView3 == null) {
                return false;
            }
            eVar.f109106e = new C45940u(enterpriseBizContactListView3.getContext());
        }
        Object tag = view.getTag();
        if (tag == null || !(tag instanceof EnterpriseBizContactListView.C40616g)) {
            return false;
        }
        String str = ((EnterpriseBizContactListView.C40616g) tag).f109109a;
        eVar.f109105d = str;
        if (Util.isNullOrNil(str) || ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(eVar.f109105d)) {
            return false;
        }
        C45940u uVar = eVar.f109106e;
        uVar.f229248q = view;
        int i4 = i;
        uVar.mo108272g(adapterView, i, j, new C40663f(eVar, i), new C40664g(eVar), i2, i3);
        return true;
    }
}
