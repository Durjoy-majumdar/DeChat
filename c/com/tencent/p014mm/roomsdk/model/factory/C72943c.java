package com.tencent.p014mm.roomsdk.model.factory;

import com.tencent.p014mm.autogen.events.OplogServiceResultEvent;
import com.tencent.p014mm.roomsdk.model.factory.RoomOpLogCallbackFactory;
import pg3.C77084b;
import pg3.C77086f;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.roomsdk.model.factory.c */
public class C72943c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OplogServiceResultEvent f212620d;

    /* renamed from: e */
    public final /* synthetic */ RoomOpLogCallbackFactory.C729381 f212621e;

    public C72943c(RoomOpLogCallbackFactory.C729381 r1, OplogServiceResultEvent oplogServiceResultEvent) {
        this.f212621e = r1;
        this.f212620d = oplogServiceResultEvent;
    }

    public void run() {
        RoomOpLogCallbackFactory roomOpLogCallbackFactory = RoomOpLogCallbackFactory.this;
        if (!roomOpLogCallbackFactory.f212607g) {
            roomOpLogCallbackFactory.f212607g = true;
            OplogServiceResultEvent.C40152a aVar = this.f212620d.f107687d;
            String str = aVar.f107689b;
            String str2 = aVar.f107690c;
            int i = aVar.f107688a;
            C77084b bVar = roomOpLogCallbackFactory.f212615d;
            if (bVar != null) {
                if (bVar instanceof C77086f) {
                    C77086f fVar = (C77086f) bVar;
                    fVar.f225172b = str;
                    fVar.f225171a = i;
                    fVar.f225173c = str2;
                    bVar.mo10150a(0, i, "", bVar);
                } else {
                    bVar.mo10150a(0, i, "", bVar);
                }
            }
            C89779i0 i0Var = RoomOpLogCallbackFactory.this.f212616e;
            if (i0Var != null) {
                i0Var.dismiss();
            }
        }
    }
}
