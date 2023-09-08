package mz2;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import jq3.C9493c;
import uz2.C52673c1;

/* renamed from: mz2.d */
public final class C47151d implements C9493c {

    /* renamed from: d */
    public String f126675d;

    /* renamed from: e */
    public String f126676e;

    /* renamed from: f */
    public List<C52673c1> f126677f = new LinkedList();

    /* renamed from: g */
    public ArrayList<C47150c> f126678g = new ArrayList<>();

    /* renamed from: h */
    public final HashMap<String, Integer> f126679h = new HashMap<>();

    /* renamed from: i */
    public final HashMap<String, Integer> f126680i = new HashMap<>();

    /* renamed from: a */
    public final ArrayList<C47150c> mo72237a(List<C47150c> list) {
        ArrayList<C47150c> arrayList = new ArrayList<>();
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        arrayList.add(list.get(0));
        if (list.size() == 1) {
            return arrayList;
        }
        int size = list.size();
        for (int i = 1; i < size; i++) {
            C47150c cVar = list.get(i);
            String str = cVar.f126671g;
            int parseInt = str != null ? Integer.parseInt(str) : 0;
            String str2 = list.get(i - 1).f126671g;
            for (int max = Math.max(((str2 != null ? Integer.parseInt(str2) : 0) - parseInt) - 1, 0); max > 0; max--) {
                C47150c cVar2 = new C47150c((List<C52673c1>) null);
                cVar2.f126671g = String.valueOf(parseInt + max);
                arrayList.add(cVar2);
            }
            arrayList.add(cVar);
        }
        Log.m105924i("MicroMsg.TextStatus.HistoryItem", "fillList: resultList.size:" + arrayList.size());
        return arrayList;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
