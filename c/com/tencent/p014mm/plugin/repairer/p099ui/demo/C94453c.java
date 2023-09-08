package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.database.Cursor;
import android.widget.Toast;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import jj2.C33585b;
import jj2.C98944a;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.c */
public final class C94453c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerBackupDemoUI f273103d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C60690y0<Long>> f273104e;

    /* renamed from: f */
    public final /* synthetic */ MMComposeView f273105f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94453c(RepairerBackupDemoUI repairerBackupDemoUI, C8479f0<C60690y0<Long>> f0Var, MMComposeView mMComposeView) {
        super(0);
        this.f273103d = repairerBackupDemoUI;
        this.f273104e = f0Var;
        this.f273105f = mMComposeView;
    }

    public Object invoke() {
        LinkedList<String> linkedList;
        long currentTimeMillis = System.currentTimeMillis();
        RepairerBackupDemoUI repairerBackupDemoUI = this.f273103d;
        C33585b bVar = repairerBackupDemoUI.f315717g;
        bVar.getClass();
        Class cls = C75700k0.class;
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
        if (bVar.f90911a.size() > 0) {
            linkedList = bVar.f90911a;
        } else {
            String[] strArr = C45628s0.f123409o;
            C87412m.m108593f(strArr, "HELPER");
            for (String add : strArr) {
                bVar.f90911a.add(add);
            }
            bVar.f90911a.add("weixin");
            bVar.f90911a.add("weibo");
            bVar.f90911a.add("qqmail");
            bVar.f90911a.add("fmessage");
            bVar.f90911a.add("tmessage");
            bVar.f90911a.add("qmessage");
            bVar.f90911a.add("qqsync");
            bVar.f90911a.add("floatbottle");
            bVar.f90911a.add("lbsapp");
            bVar.f90911a.add("shakeapp");
            bVar.f90911a.add("medianote");
            bVar.f90911a.add("qqfriend");
            bVar.f90911a.add("readerapp");
            bVar.f90911a.add("newsapp");
            bVar.f90911a.add("blogapp");
            bVar.f90911a.add("facebookapp");
            bVar.f90911a.add("masssendapp");
            bVar.f90911a.add("meishiapp");
            bVar.f90911a.add("feedsapp");
            bVar.f90911a.add("voipapp");
            bVar.f90911a.add("officialaccounts");
            bVar.f90911a.add("helper_entry");
            bVar.f90911a.add("pc_share");
            bVar.f90911a.add("cardpackage");
            bVar.f90911a.add("voicevoipapp");
            bVar.f90911a.add("voiceinputapp");
            bVar.f90911a.add("linkedinplugin");
            bVar.f90911a.add("appbrandcustomerservicemsg");
            linkedList = bVar.f90911a;
        }
        Cursor I = ((C44660i2) Ku).mo69738I(1, linkedList, "*", -1);
        I.moveToFirst();
        ArrayList<C98944a> arrayList = new ArrayList<>();
        do {
            C72976h2 h2Var = new C72976h2();
            h2Var.convertFrom(I);
            if (!Util.isNullOrNil(h2Var.getUsername())) {
                C98944a aVar = new C98944a((String) null, 0, 0, 0, 15, (C8480h) null);
                int Vx0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Vx0(h2Var.getUsername());
                aVar.f290043d = Vx0;
                if (Vx0 <= 0) {
                    Log.m105925i("DBTest", "calculateChooseConversation empty conversation:%s", h2Var.getUsername());
                } else {
                    String username = h2Var.getUsername();
                    C87412m.m108593f(username, "conv.username");
                    aVar.f290040a = username;
                    if (!C72996z1.m85810M4(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(h2Var.getUsername()).mo73953E2())) {
                        aVar.f290041b = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yu0(h2Var.getUsername());
                        aVar.f290042c = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Dx0(h2Var.getUsername());
                    }
                    arrayList.add(aVar);
                }
            }
        } while (I.moveToNext());
        repairerBackupDemoUI.f315716f = arrayList;
        ((C60690y0) this.f273104e.f27484d).setValue(Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        Toast.makeText(this.f273105f.getContext(), "会话读取耗时(ms):" + this.f273104e.f27484d, 0).show();
        ArrayList<C98944a> arrayList2 = this.f273103d.f315716f;
        C87412m.m108591d(arrayList2);
        RepairerBackupDemoUI repairerBackupDemoUI2 = this.f273103d;
        for (C98944a aVar2 : arrayList2) {
            Log.m105925i(repairerBackupDemoUI2.f315714d, "msgListSize:%d", Integer.valueOf(C33585b.m40131a(repairerBackupDemoUI2.f315717g, aVar2.f290040a, aVar2.f290041b, aVar2.f290042c, repairerBackupDemoUI2.f315715e, false, 16, (Object) null).size()));
        }
        return C13598b0.f38549a;
    }
}
