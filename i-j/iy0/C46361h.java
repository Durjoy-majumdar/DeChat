package iy0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pe3.C47465a;
import te3.k25;
import te3.l25;

/* renamed from: iy0.h */
public final class C46361h extends C87413o implements C32224a<HashMap<String, List<? extends String>>> {

    /* renamed from: d */
    public final /* synthetic */ C46353a f124950d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46361h(C46353a aVar) {
        super(0);
        this.f124950d = aVar;
    }

    public Object invoke() {
        byte[] decodeBytes;
        C46353a aVar = this.f124950d;
        MMKVSlotManager mMKVSlotManager = aVar.f124922d;
        String d = aVar.mo71762d();
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) mMKVSlotManager.findSlot(d);
        C47465a aVar2 = null;
        if (!(multiProcessMMKV == null || !multiProcessMMKV.containsKey(d) || (decodeBytes = multiProcessMMKV.decodeBytes(d)) == null)) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C47465a newInstance = l25.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar2 = newInstance;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        l25 l25 = (l25) aVar2;
        HashMap hashMap = new HashMap();
        if (l25 != null) {
            LinkedList<k25> linkedList = l25.f137140d;
            C87412m.m108593f(linkedList, "it.header");
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                if (((k25) next).f136526d != null) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                k25 k25 = (k25) it.next();
                hashMap.put(k25.f136526d, k25.f136527e);
            }
        }
        return hashMap;
    }
}
