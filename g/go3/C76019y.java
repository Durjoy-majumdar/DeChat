package go3;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: go3.y */
public class C76019y {

    /* renamed from: a */
    public static LinkedList<WeakReference<C76020a>> f222886a = new LinkedList<>();

    /* renamed from: go3.y$a */
    public interface C76020a {
        boolean forceRemoveNoMatchOnPath();

        void onSettle(boolean z, int i);

        void onSwipe(float f);
    }

    /* renamed from: a */
    public static void m91313a(boolean z, int i) {
        if (f222886a.size() <= 0) {
            Log.m105929w("MicroMsg.SwipeBackHelper", "notifySettle callback stack empty!, open:%B, speed:%d", Boolean.valueOf(z), Integer.valueOf(i));
            return;
        }
        C76020a aVar = (C76020a) f222886a.get(0).get();
        if (aVar == null) {
            Log.m105929w("MicroMsg.SwipeBackHelper", "notifySettle null, open:%B, speed:%d", Boolean.valueOf(z), Integer.valueOf(i));
            return;
        }
        aVar.onSettle(z, i);
        Log.m105927v("MicroMsg.SwipeBackHelper", "notifySettle, open:%B speed:%d callback:%s", Boolean.valueOf(z), Integer.valueOf(i), aVar);
    }

    /* renamed from: b */
    public static void m91314b(float f) {
        if (f222886a.size() <= 0) {
            Log.m105929w("MicroMsg.SwipeBackHelper", "notifySwipe callback stack empty!, scrollParent:%f", Float.valueOf(f));
            return;
        }
        C76020a aVar = (C76020a) f222886a.get(0).get();
        if (aVar == null) {
            Log.m105929w("MicroMsg.SwipeBackHelper", "notifySwipe null, scrollParent:%f", Float.valueOf(f));
            return;
        }
        aVar.onSwipe(f);
        Log.m105927v("MicroMsg.SwipeBackHelper", "notifySwipe scrollParent:%f, callback:%s ", Float.valueOf(f), aVar);
    }

    /* renamed from: c */
    public static boolean m91315c(C76020a aVar) {
        int size = f222886a.size();
        Log.m105919d("MicroMsg.SwipeBackHelper", "popCallback size %d, %s", Integer.valueOf(size), aVar);
        if (aVar == null) {
            return true;
        }
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (true) {
            if (i >= f222886a.size()) {
                break;
            } else if (aVar == f222886a.get(i).get()) {
                f222886a.remove(i);
                Log.m105919d("MicroMsg.SwipeBackHelper", "popCallback directly, index %d", Integer.valueOf(i));
                break;
            } else {
                linkedList.add(0, Integer.valueOf(i));
                i++;
            }
        }
        if (aVar.forceRemoveNoMatchOnPath() || linkedList.size() != size) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                WeakReference remove = f222886a.remove(((Integer) it.next()).intValue());
                Object[] objArr = new Object[1];
                objArr[0] = remove != null ? remove.get() : "NULL-CALLBACK";
                Log.m105919d("MicroMsg.SwipeBackHelper", "popCallback, popup %s", objArr);
            }
            return linkedList.isEmpty();
        }
        Log.m105918d("MicroMsg.SwipeBackHelper", "popCallback Fail! Maybe Top Activity");
        return false;
    }

    /* renamed from: d */
    public static void m91316d(C76020a aVar) {
        Log.m105919d("MicroMsg.SwipeBackHelper", "pushCallback size %d, %s", Integer.valueOf(f222886a.size()), aVar);
        f222886a.add(0, new WeakReference(aVar));
    }
}
