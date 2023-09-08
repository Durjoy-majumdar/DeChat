package com.tencent.p014mm.p136ui.contact;

import ai3.C67047d;
import ai3.C67048e;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44655f;
import com.tencent.p014mm.storage.C44668u3;
import di3.C86312j;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.LinkedList;
import xv2.C102775d;

/* renamed from: com.tencent.mm.ui.contact.b */
public class C74464b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f218966d;

    /* renamed from: e */
    public final /* synthetic */ C74452a f218967e;

    public C74464b(C74452a aVar, LinkedList linkedList) {
        this.f218967e = aVar;
        this.f218966d = linkedList;
    }

    public void run() {
        C44668u3 v = C97625j3.m125812b().mo105907v();
        C74452a aVar = this.f218967e;
        Cursor D3 = v.mo69651D3(aVar.f218912w, aVar.f218913x, aVar.f218914y, this.f218966d, aVar.mo103500B(), this.f218967e.f218903K);
        if (D3 != null) {
            try {
                if (D3 instanceof C67048e) {
                    ArrayList arrayList = new ArrayList();
                    C67047d dVar = ((C67048e) D3).f192596f[0];
                    int position = dVar.getPosition();
                    while (dVar.moveToNext()) {
                        C44655f fVar = new C44655f();
                        fVar.mo69638a(dVar);
                        arrayList.add(fVar.mo69642d());
                        Log.m105919d("MicroMsg.AddressAdapter", "mStarUserList add %s %s", fVar.mo69642d(), fVar.field_conRemark);
                    }
                    dVar.moveToPosition(position);
                    ((C102775d) C86312j.m106911c(C102775d.class)).mo134166TA().mo105642b(arrayList);
                }
            } catch (Throwable th) {
                D3.close();
                throw th;
            }
        }
        if (D3 != null) {
            D3.close();
        }
    }
}
