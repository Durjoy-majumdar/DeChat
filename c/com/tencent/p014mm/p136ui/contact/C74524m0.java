package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C51712vn;
import xc0.C53320a;
import xc0.C78789e;

/* renamed from: com.tencent.mm.ui.contact.m0 */
public class C74524m0 implements C78789e.C78793b {

    /* renamed from: a */
    public final /* synthetic */ ContactRemarkInfoModUI f219092a;

    /* renamed from: com.tencent.mm.ui.contact.m0$a */
    public class C74525a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f219093d;

        public C74525a(LinkedList linkedList) {
            this.f219093d = linkedList;
        }

        public void run() {
            ArrayList<String> arrayList = C74524m0.this.f219092a.f218507K;
            if (!(arrayList == null || arrayList.size() == 0)) {
                Iterator it = this.f219093d.iterator();
                while (it.hasNext()) {
                    C74524m0.this.f219092a.f218501E.add((C51712vn) it.next());
                }
            }
            ContactRemarkInfoModUI contactRemarkInfoModUI = C74524m0.this.f219092a;
            C97625j3.m125815e().mo123460f(new C53320a(contactRemarkInfoModUI.f218568z, contactRemarkInfoModUI.f218501E));
        }
    }

    public C74524m0(ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f219092a = contactRemarkInfoModUI;
    }

    /* renamed from: a */
    public void mo103578a(boolean z, LinkedList<C51712vn> linkedList) {
        Log.m105925i("MiroMsg.ContactRemarkInfoModUI", "upload cdn finish, succeed:%s", Boolean.valueOf(z));
        this.f219092a.f218508L = false;
        MMHandlerThread.postToMainThread(new C74525a(linkedList));
    }
}
