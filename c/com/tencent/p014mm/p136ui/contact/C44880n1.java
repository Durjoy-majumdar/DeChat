package com.tencent.p014mm.p136ui.contact;

import android.os.Looper;
import com.tencent.p014mm.p136ui.contact.C74498h1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gl3.C75922b;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.n1 */
public class C44880n1 extends C74551q1 {

    /* renamed from: n */
    public List<String> f121743n;

    /* renamed from: o */
    public C74498h1.C44878a f121744o;

    public C44880n1(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z, String str) {
        super(mMBaseSelectContactUI, list, z, 0);
        new MMHandler(Looper.getMainLooper());
        this.f121743n = list;
        Log.m105924i("MicroMsg.MMSearchContactAdapter", "Create!");
        Log.m105924i("MicroMsg.MMSearchContactAdapter", "initData!");
        mo103564g();
    }

    /* renamed from: b */
    public void mo70171b(String str, boolean z) {
        C74498h1.C44878a aVar = this.f121744o;
        if (aVar != null) {
            aVar.mo62789t6(str, 0, z);
        }
    }

    public int getCount() {
        return 0;
    }

    /* renamed from: h */
    public C75922b mo7850h(int i) {
        if (i < 0) {
            Log.m105921e("MicroMsg.MMSearchContactAdapter", "create Data Item Error position=%d", Integer.valueOf(i));
            return null;
        }
        throw null;
    }

    /* renamed from: i */
    public void mo7851i() {
        super.mo7851i();
        Log.m105924i("MicroMsg.MMSearchContactAdapter", "finish!");
        Log.m105924i("MicroMsg.MMSearchContactAdapter", "initData!");
        mo103564g();
    }

    /* renamed from: n */
    public boolean mo70169n(C75922b bVar) {
        return true;
    }

    /* renamed from: t */
    public void mo70172t(C74498h1.C44878a aVar) {
        this.f121744o = aVar;
    }
}
