package eb0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p206nj.C100115c;
import p206nj.C100118d;

/* renamed from: eb0.e */
public class C97621e {

    /* renamed from: a */
    public C100115c f286390a;

    /* renamed from: b */
    public Context f286391b = MMApplicationContext.getContext();

    /* renamed from: c */
    public C100115c.C100116a f286392c;

    /* renamed from: d */
    public C97622a f286393d;

    /* renamed from: e */
    public boolean f286394e = false;

    /* renamed from: eb0.e$a */
    public interface C97622a {
        /* renamed from: I2 */
        void mo23179I2();

        /* renamed from: N3 */
        void mo23180N3();

        /* renamed from: R0 */
        void mo23181R0();

        /* renamed from: f2 */
        void mo23185f2();
    }

    /* renamed from: eb0.e$b */
    public class C97623b implements C100115c.C100116a {
        public C97623b(C97620d dVar) {
        }

        public void onChange(int i) {
            if (i == -3) {
                Log.m105926v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
                C97622a aVar = C97621e.this.f286393d;
                if (aVar != null) {
                    aVar.mo23181R0();
                }
            } else if (i == -2) {
                Log.m105926v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS_TRANSIENT");
                C97622a aVar2 = C97621e.this.f286393d;
                if (aVar2 != null) {
                    aVar2.mo23180N3();
                }
            } else if (i == -1) {
                Log.m105926v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_LOSS");
                C97622a aVar3 = C97621e.this.f286393d;
                if (aVar3 != null) {
                    aVar3.mo23185f2();
                }
            } else if (i != 1) {
                Log.m105926v("MicroMsg.AudioHelperTool", "jacks UNKNOW_AUDIOFOCUS_LOSS DEFAULT");
            } else {
                Log.m105926v("MicroMsg.AudioHelperTool", "jacks AUDIOFOCUS_GAIN");
                C97622a aVar4 = C97621e.this.f286393d;
                if (aVar4 != null) {
                    aVar4.mo23179I2();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo136889a() {
        return mo136890b(false);
    }

    /* renamed from: b */
    public boolean mo136890b(boolean z) {
        C100115c cVar = this.f286390a;
        boolean a = cVar != null ? cVar.mo139414a() : false;
        this.f286394e = false;
        if (z) {
            this.f286390a = null;
            this.f286392c = null;
            this.f286393d = null;
        }
        return a;
    }

    /* renamed from: c */
    public boolean mo136891c(C97622a aVar) {
        this.f286393d = aVar;
        return mo136892d((C100115c.C100116a) null);
    }

    /* renamed from: d */
    public boolean mo136892d(C100115c.C100116a aVar) {
        if (aVar == null) {
            aVar = new C97623b((C97620d) null);
        }
        if (this.f286390a == null) {
            this.f286390a = new C100115c(this.f286391b);
        }
        if (this.f286392c != aVar) {
            this.f286392c = aVar;
        }
        C100115c cVar = this.f286390a;
        C100115c.C100116a aVar2 = this.f286392c;
        C100115c.C100117b bVar = cVar.f293268b;
        if (bVar != null) {
            ((C100118d) bVar).f293271c = aVar2;
        }
        if (cVar == null || this.f286394e) {
            return false;
        }
        cVar.mo139415b();
        this.f286394e = true;
        return true;
    }
}
