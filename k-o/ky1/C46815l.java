package ky1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import p828wa.C53099d;
import p828wa.C53101f;

/* renamed from: ky1.l */
public class C46815l {

    /* renamed from: a */
    public C53101f f125950a;

    /* renamed from: b */
    public boolean f125951b;

    /* renamed from: c */
    public boolean f125952c;

    /* renamed from: d */
    public LinkedList<C53099d> f125953d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C46816m> f125954e = new LinkedList<>();

    public C46815l(C53101f fVar) {
        this.f125950a = fVar;
    }

    /* renamed from: a */
    public void mo72031a(C53099d dVar) {
        Log.m105925i("MicroMsg.Page2JsCoreMsgDispatch", "dispatchEvent, hasDestroyed = %b, hasReady = %b", Boolean.valueOf(this.f125952c), Boolean.valueOf(this.f125951b));
        if (!this.f125952c) {
            if (!this.f125951b) {
                this.f125953d.add(dVar);
            } else {
                this.f125950a.mo73815b(dVar);
            }
        }
    }
}
