package zg2;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Set;
import zt3.C119157j;

/* renamed from: zg2.a */
public final class C53784a {

    /* renamed from: a */
    public static final C53784a f150949a = new C53784a();

    /* renamed from: b */
    public static final SparseArray<Set<C53789d>> f150950b = new SparseArray<>();

    /* renamed from: zg2.a$a */
    public static final class C53785a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f150951d;

        /* renamed from: e */
        public final /* synthetic */ String f150952e;

        /* renamed from: f */
        public final /* synthetic */ boolean f150953f;

        /* renamed from: g */
        public final /* synthetic */ CaptureDataManager.CaptureVideoNormalModel f150954g;

        public C53785a(int i, String str, boolean z, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
            this.f150951d = i;
            this.f150952e = str;
            this.f150953f = z;
            this.f150954g = captureVideoNormalModel;
        }

        public final void run() {
            C53784a aVar = C53784a.f150949a;
            Set<C53789d> set = C53784a.f150950b.get(this.f150951d);
            if (set != null) {
                String str = this.f150952e;
                boolean z = this.f150953f;
                CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = this.f150954g;
                for (C53789d d : set) {
                    d.mo74361d(str, z, captureVideoNormalModel);
                }
            }
        }
    }

    /* renamed from: zg2.a$b */
    public static final class C53786b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f150955d;

        /* renamed from: e */
        public final /* synthetic */ String f150956e;

        public C53786b(int i, String str) {
            this.f150955d = i;
            this.f150956e = str;
        }

        public final void run() {
            C53784a aVar = C53784a.f150949a;
            Set<C53789d> set = C53784a.f150950b.get(this.f150955d);
            if (set != null) {
                String str = this.f150956e;
                for (C53789d a : set) {
                    a.mo74358a(str);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo74351a(int i, String str, boolean z, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        C87412m.m108594g(str, "taskId");
        Log.m105924i("MicroMsg.mix_background.BgMixManager", "notifyFinish, taskId:" + str + ", success:" + z + ", model:" + captureVideoNormalModel);
        ((C119157j) C119157j.f356862d).mo183876g(new C53785a(i, str, z, captureVideoNormalModel), "BgMixManager_notifyFinish");
    }

    /* renamed from: b */
    public final void mo74352b(int i, String str) {
        C87412m.m108594g(str, "taskId");
        Log.m105924i("MicroMsg.mix_background.BgMixManager", "notifyInit, taskId:" + str);
        ((C119157j) C119157j.f356862d).mo183876g(new C53786b(i, str), "BgMixManager_notifyInit");
    }

    /* renamed from: c */
    public final void mo74353c(int i, C53789d dVar) {
        C87412m.m108594g(dVar, "callback");
        SparseArray<Set<C53789d>> sparseArray = f150950b;
        Set set = sparseArray.get(i);
        if (set != null) {
            set.remove(dVar);
        }
        boolean z = true;
        if (set == null || !set.isEmpty()) {
            z = false;
        }
        if (z) {
            sparseArray.remove(i);
        }
    }
}
