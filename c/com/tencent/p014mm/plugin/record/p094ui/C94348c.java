package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.autogen.events.FavImageServiceEvent;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.record.ui.c */
public class C94348c implements C94356i.C94359c {
    public C94348c(Context context) {
        FavImageServiceEvent favImageServiceEvent = new FavImageServiceEvent();
        FavImageServiceEvent.C92510a aVar = favImageServiceEvent.f264809d;
        aVar.f264811a = 3;
        aVar.f264819i = context;
        favImageServiceEvent.publish();
    }

    /* renamed from: a */
    public Bitmap mo129735a(C94356i.C94359c.C94361b bVar) {
        FavImageServiceEvent favImageServiceEvent = new FavImageServiceEvent();
        FavImageServiceEvent.C92510a aVar = favImageServiceEvent.f264809d;
        aVar.f264811a = 2;
        aVar.f264822l = false;
        boolean z = bVar.f272739d;
        if (z) {
            aVar.f264812b = bVar.f272736a;
            aVar.f264820j = z;
        } else {
            aVar.f264812b = bVar.f272736a;
            aVar.f264813c = bVar.f272737b;
            aVar.f264814d = bVar.f272738c;
            aVar.f264821k = false;
        }
        favImageServiceEvent.publish();
        Log.m105919d("MicroMsg.FavImageServiceProxy", "getSuitableBigImg favLocalId %s, dataId %s, retBmp %s, fromCache", Long.valueOf(bVar.f272737b), bVar.f272736a.f299280T, favImageServiceEvent.f264810e.f264823a, Boolean.valueOf(favImageServiceEvent.f264809d.f264820j));
        return favImageServiceEvent.f264810e.f264823a;
    }

    /* renamed from: b */
    public Bitmap mo129736b(C94356i.C94359c.C94362c cVar) {
        FavImageServiceEvent favImageServiceEvent = new FavImageServiceEvent();
        FavImageServiceEvent.C92510a aVar = favImageServiceEvent.f264809d;
        aVar.f264811a = 0;
        aVar.f264812b = cVar.f272740a;
        aVar.f264813c = cVar.f272741b;
        favImageServiceEvent.publish();
        Log.m105919d("MicroMsg.FavImageServiceProxy", "getThumb favLocalId %s, retBmp %s", Long.valueOf(cVar.f272741b), favImageServiceEvent.f264810e.f264823a);
        return favImageServiceEvent.f264810e.f264823a;
    }

    /* renamed from: c */
    public void mo129737c(C94356i.C94359c.C94360a aVar) {
        Log.m105919d("MicroMsg.FavImageServiceProxy", "attachThumb favLocalId %s", Long.valueOf(aVar.f272732c));
        FavImageServiceEvent favImageServiceEvent = new FavImageServiceEvent();
        FavImageServiceEvent.C92510a aVar2 = favImageServiceEvent.f264809d;
        aVar2.f264811a = 1;
        aVar2.f264815e = aVar.f272730a;
        aVar2.f264812b = aVar.f272731b;
        aVar2.f264813c = aVar.f272732c;
        aVar2.f264816f = aVar.f272733d;
        aVar2.f264817g = aVar.f272734e;
        aVar2.f264818h = aVar.f272735f;
        favImageServiceEvent.publish();
    }

    /* renamed from: d */
    public void mo129738d() {
        FavImageServiceEvent favImageServiceEvent = new FavImageServiceEvent();
        favImageServiceEvent.f264809d.f264811a = 4;
        favImageServiceEvent.publish();
    }
}
