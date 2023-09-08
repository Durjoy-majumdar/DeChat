package j72;

import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j72.C108607f;
import java.lang.ref.WeakReference;

/* renamed from: j72.z */
public class C108650z {

    /* renamed from: a */
    public C108607f.C108610c f325384a = C108607f.C108610c.Stop;

    /* renamed from: b */
    public SparseArray<WeakReference<C108607f.C108609b>> f325385b = new SparseArray<>();

    /* renamed from: c */
    public MMHandler f325386c = new C108651a(Looper.getMainLooper());

    /* renamed from: j72.z$a */
    public class C108651a extends MMHandler {
        public C108651a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C108607f.C108609b bVar;
            int i = message.what;
            if (257 == i) {
                C108607f.C108610c cVar = (C108607f.C108610c) message.obj;
                for (int i2 = 0; i2 < C108650z.this.f325385b.size(); i2++) {
                    C108607f.C108609b bVar2 = (C108607f.C108609b) C108650z.this.f325385b.valueAt(i2).get();
                    if (bVar2 != null) {
                        int ordinal = cVar.ordinal();
                        if (ordinal == 1) {
                            bVar2.onStart();
                        } else if (ordinal == 4) {
                            bVar2.onStop();
                        } else if (ordinal == 6) {
                            bVar2.mo159634b();
                        } else if (ordinal == 7) {
                            bVar2.mo159633a();
                        }
                    }
                }
            } else if (258 == i) {
                C108607f.C108609b bVar3 = (C108607f.C108609b) message.obj;
                if (bVar3 != null) {
                    C108650z.this.f325385b.put(bVar3.hashCode(), new WeakReference(bVar3));
                }
            } else if (259 == i && (bVar = (C108607f.C108609b) message.obj) != null) {
                C108650z.this.f325385b.remove(bVar.hashCode());
            }
        }
    }

    /* renamed from: a */
    public void mo159676a(C108607f.C108610c cVar) {
        Log.m105925i("MicroMsg.SightMediaStatusHandler", "status change to %s", cVar.toString());
        this.f325384a = cVar;
        MMHandler mMHandler = this.f325386c;
        mMHandler.sendMessage(mMHandler.obtainMessage(257, cVar));
    }
}
