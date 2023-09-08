package j72;

import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import j72.C108604d;
import j72.C108647y;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: j72.b */
public class C108600b {

    /* renamed from: i */
    public static int f325149i = 4;

    /* renamed from: a */
    public MMHandler[] f325150a;

    /* renamed from: b */
    public int f325151b = 0;

    /* renamed from: c */
    public int f325152c = 0;

    /* renamed from: d */
    public LinkedList<C108604d> f325153d = new LinkedList<>();

    /* renamed from: e */
    public MMHandler f325154e;

    /* renamed from: f */
    public C108602b f325155f;

    /* renamed from: g */
    public boolean f325156g = false;

    /* renamed from: h */
    public C108604d.C108605a f325157h = new C108601a();

    /* renamed from: j72.b$a */
    public class C108601a implements C108604d.C108605a {
        public C108601a() {
        }
    }

    /* renamed from: j72.b$b */
    public interface C108602b {
    }

    public C108600b(C108602b bVar) {
        this.f325155f = bVar;
        f325149i = -1;
        if (CaptureMMProxy.getInstance() != null) {
            f325149i = CaptureMMProxy.getInstance().getInt(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_THREADCOUNT_INT_SYNC, -1);
        }
        int i = f325149i;
        if (i == -1) {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            f325149i = availableProcessors;
            int min = Math.min(4, availableProcessors);
            f325149i = min;
            Log.m105925i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from runtime %d, availableProcessors: %s", Integer.valueOf(min), Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        } else {
            Log.m105925i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from config %d", Integer.valueOf(i));
        }
        int i2 = f325149i;
        this.f325150a = new MMHandler[i2];
        SightVideoJNI.initScaleAndRoateBuffer(i2);
        int i3 = 0;
        while (true) {
            MMHandler[] mMHandlerArr = this.f325150a;
            if (i3 < mMHandlerArr.length) {
                mMHandlerArr[i3] = new MMHandler("BigSightMediaCodecMP4MuxRecorder_FrameBufProcessMgr_" + i3);
                i3++;
            } else {
                this.f325156g = false;
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo159596a() {
        boolean z;
        Log.m105925i("MicroMsg.ForwardMgr", "processBufList %d %d", Integer.valueOf(this.f325153d.size()), Integer.valueOf(this.f325152c));
        while (this.f325153d.size() != 0) {
            Log.m105925i("MicroMsg.ForwardMgr", "loop processBufList %d %d", Integer.valueOf(this.f325153d.size()), Integer.valueOf(this.f325152c));
            Iterator<C108604d> it = this.f325153d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    continue;
                    break;
                }
                C108604d next = it.next();
                int i = this.f325152c;
                if (i == next.f325163c) {
                    this.f325152c = i + 1;
                    ((C108647y.C108648a) this.f325155f).mo159674a(next.f325162b);
                    this.f325153d.remove(next);
                    z = true;
                    continue;
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo159597b() {
        int i = 0;
        Log.m105925i("MicroMsg.ForwardMgr", "stop FrameBufProcessMgr %s", Util.getStack().toString());
        while (true) {
            MMHandler[] mMHandlerArr = this.f325150a;
            if (i < mMHandlerArr.length) {
                MMHandler mMHandler = mMHandlerArr[i];
                if (mMHandler != null) {
                    mMHandler.getSerial().f328238b.mo182313f();
                    this.f325150a[i] = null;
                }
                i++;
            } else {
                SightVideoJNI.releaseScaleAndRoateBuffer(f325149i);
                this.f325156g = true;
                return;
            }
        }
    }

    public void finalize() {
        try {
            mo159597b();
        } catch (Throwable unused) {
        }
        super.finalize();
    }
}
