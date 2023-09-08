package r12;

import com.tencent.p014mm.plugin.ipcall.model.IPCallSvrNotifyListener;
import k12.C108828c;
import k12.C60939a;
import ob0.C117747y;

/* renamed from: r12.e */
public class C63355e extends C60939a implements IPCallSvrNotifyListener.C56825a {

    /* renamed from: f */
    public IPCallSvrNotifyListener f179724f = null;

    /* renamed from: d */
    public int[] mo85897d() {
        return new int[0];
    }

    /* renamed from: e */
    public int mo85898e() {
        return 8;
    }

    /* renamed from: g */
    public void mo85900g() {
        this.f179724f.dead();
    }

    /* renamed from: h */
    public void mo85901h() {
        IPCallSvrNotifyListener iPCallSvrNotifyListener = new IPCallSvrNotifyListener();
        this.f179724f = iPCallSvrNotifyListener;
        iPCallSvrNotifyListener.f162850d = this;
        iPCallSvrNotifyListener.alive();
    }

    /* renamed from: i */
    public void mo85902i(C108828c cVar) {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}
