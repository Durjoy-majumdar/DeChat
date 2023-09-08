package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCardActionReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C97625j3;
import ht1.C60205t5;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import p206nj.C88955f;
import p652pu.C100910b;
import p823sg.C90193h;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import qg2.C101147j0;
import sg2.C101617b;
import te3.C101834rc0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C64719t23;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.OtherViewWrapper$$c */
public class OtherViewWrapper$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OtherViewWrapper f272804d;

    public OtherViewWrapper$$c(OtherViewWrapper otherViewWrapper) {
        this.f272804d = otherViewWrapper;
    }

    public void onClick(View view) {
        String str;
        C64719t23 t232;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C64719t23 t233 = null;
        if (!C88955f.m111058b()) {
            C76912y0.m92771j(view.getContext(), (View) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C101617b bVar = (C101617b) view.getTag();
        if (OtherViewWrapper.m119393u(bVar.f297464a)) {
            Log.m105924i("MicroMsg.OtherViewWrapper", "same song, do release");
            MvCardActionReportStruct mvCardActionReportStruct = new MvCardActionReportStruct();
            mvCardActionReportStruct.f156518j = 2;
            mvCardActionReportStruct.f156519k = 16;
            C60205t5.m70388b(mvCardActionReportStruct);
            C101093a.m132490l();
            OtherViewWrapper otherViewWrapper = this.f272804d;
            if (!otherViewWrapper.f272791d) {
                MMHandler mMHandler = otherViewWrapper.f272790c;
                mMHandler.sendMessageAtFrontOfQueue(mMHandler.obtainMessage(1));
            }
        } else {
            OtherViewWrapper otherViewWrapper2 = this.f272804d;
            otherViewWrapper2.f272791d = true;
            otherViewWrapper2.getClass();
            C101834rc0 rc02 = bVar.f297464a;
            C101846tc0 tc02 = rc02.f299296c1.f299405d;
            C86009m1 m1Var = new C86009m1(C101147j0.m132611D(rc02, bVar.f297466c, 1));
            if (!m1Var.mo119967g()) {
                if (bVar.f297464a.f299254G != null) {
                    C86009m1 m1Var2 = new C86009m1(C97625j3.m125812b().mo105892g() + "web/" + C90193h.m112878f(bVar.f297464a.f299254G.getBytes()));
                    if (m1Var2.mo119967g()) {
                        str = m1Var2.mo119971i();
                    }
                }
                str = "";
            } else {
                str = m1Var.mo119971i();
            }
            String str2 = str;
            C101834rc0 rc03 = bVar.f297464a;
            C101841sc0 sc02 = rc03.f299296c1;
            if (sc02 != null) {
                t233 = sc02.f299401C;
            }
            String str3 = rc03.f299297d;
            String str4 = rc03.f299301f;
            String str5 = rc03.f299242A;
            String str6 = rc03.f299250E;
            String str7 = rc03.f299246C;
            String str8 = rc03.f299280T;
            String str9 = str7;
            String str10 = str8;
            C101106m sL = ((C100910b) C86312j.m106911c(C100910b.class)).mo139948sL(6, (String) null, str3, str4, str5, str6, str9, str10, C97625j3.m125812b().mo105892g() + "web/", str2, "", tc02.f299533w, C62602o.m73561a(rc03.f299280T, t233));
            sL.f295976x = rc03.f299251E1;
            sL.f295969q = rc03.f299255G1;
            C101841sc0 sc03 = rc03.f299296c1;
            if (!(sc03 == null || (t232 = sc03.f299401C) == null || Util.isNullOrNil(t232.f185470r))) {
                sL.f295954P = rc03.f299296c1.f299401C.f185470r;
            }
            sL.f295949J = rc03.f299280T;
            C101093a.m132488j(sL);
            MvCardActionReportStruct mvCardActionReportStruct2 = new MvCardActionReportStruct();
            mvCardActionReportStruct2.f156518j = 1;
            mvCardActionReportStruct2.f156519k = 16;
            C60205t5.m70388b(mvCardActionReportStruct2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/OtherViewWrapper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
