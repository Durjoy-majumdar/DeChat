package l20;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p261wl.C38166b;
import p327ct.C20362d;

public class a$$c extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ C21388a f60505a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a$$c(C21388a aVar, Looper looper) {
        super(looper);
        this.f60505a = aVar;
    }

    public void handleMessage(Message message) {
        Class<C20362d.C20364b> cls = C20362d.C20364b.class;
        if (message.what == 0) {
            Object obj = message.obj;
            if (obj instanceof a$$d) {
                a$$d a__d = (a$$d) obj;
                C72994y1.C72995a aVar = a__d.f60507b;
                ArrayList arrayList = null;
                if (aVar != null) {
                    C21388a aVar2 = this.f60505a;
                    int i = a__d.f60508c;
                    String str = a__d.f60509d;
                    Iterator<WeakReference<C20362d.C20363a>> it = aVar2.f60496b.iterator();
                    while (it.hasNext()) {
                        WeakReference next = it.next();
                        if (next == null || next.get() == null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(next);
                        } else {
                            ((C20362d.C20363a) next.get()).mo31844v0(aVar, i, str);
                        }
                    }
                    C38166b.m41755b(cls, new a$$b(aVar, i, str));
                    if (arrayList != null) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            aVar2.f60496b.remove((WeakReference) it4.next());
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                }
                C21388a aVar3 = this.f60505a;
                int i2 = a__d.f60506a;
                int i3 = a__d.f60508c;
                String str2 = a__d.f60509d;
                Iterator<WeakReference<C20362d.C20363a>> it5 = aVar3.f60496b.iterator();
                while (it5.hasNext()) {
                    WeakReference next2 = it5.next();
                    if (next2 == null || next2.get() == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    } else {
                        ((C20362d.C20363a) next2.get()).mo31843P0(i2, i3, str2);
                    }
                }
                C38166b.m41755b(cls, new a$$a(i2, i3, str2));
                if (arrayList != null) {
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        aVar3.f60496b.remove((WeakReference) it6.next());
                    }
                    arrayList.clear();
                }
            }
        }
    }
}
