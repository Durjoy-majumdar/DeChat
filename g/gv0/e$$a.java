package gv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import zu0.s$$b;

public final /* synthetic */ class e$$a implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C20849e f58901d;

    /* renamed from: e */
    public final /* synthetic */ e$$d f58902e;

    public /* synthetic */ e$$a(C20849e eVar, e$$d e__d) {
        this.f58901d = eVar;
        this.f58902e = e__d;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C20849e eVar = this.f58901d;
        e$$d e__d = this.f58902e;
        eVar.getClass();
        C20849e eVar2 = (C20849e) yVar;
        e$$c e__c = eVar2.f58900z;
        if (!e__c.f58905a.contains(eVar2) && eVar2.f58895u.f295637e == 2) {
            Log.m105920e("MicroMsg.BackupDataPushScene.BackFileOp", "checkSceneAllFinish Error!! media scene not in sceneHashSet");
        }
        e__c.f58905a.remove(eVar2);
        boolean isEmpty = e__c.f58905a.isEmpty();
        String str2 = eVar2.f58895u.f295636d;
        byte[] bArr = eVar2.f58899y.value;
        ((s$$b) e__d).mo37064a(isEmpty, str2, bArr == null ? 0 : bArr.length, eVar.f58898x);
    }
}
