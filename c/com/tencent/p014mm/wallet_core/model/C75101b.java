package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.wallet_core.model.C75097a;
import hp3.C87581a;
import java.util.ArrayList;
import ob0.C89132b;
import te3.C49335eu3;

/* renamed from: com.tencent.mm.wallet_core.model.b */
public class C75101b implements C87581a<Object, C89132b.C89134c<C49335eu3>> {

    /* renamed from: a */
    public final /* synthetic */ C75097a f221011a;

    public C75101b(C75097a aVar) {
        this.f221011a = aVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C75097a aVar = this.f221011a;
        aVar.f221003b = false;
        int size = ((ArrayList) aVar.f221002a).size();
        while (true) {
            size--;
            if (size >= 0) {
                C75097a.C75099b bVar = (C75097a.C75099b) ((ArrayList) aVar.f221002a).get(size);
                bVar.mo67543b(cVar.f256796d, cVar.f256794b, cVar.f256793a);
                ((ArrayList) aVar.f221002a).remove(bVar);
            } else {
                aVar.f221006e.setValue(cVar.f256796d);
                return null;
            }
        }
    }
}
