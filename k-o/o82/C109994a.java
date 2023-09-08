package o82;

import ac3.C103355g1;
import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import e43.C107225c;
import e43.C107226d;
import h82.C108174c;
import org.json.JSONArray;
import p80.C110194c;
import p82.C110201e;
import q00.C110264g;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: o82.a */
public final class C109994a implements C108174c<C109995b, C109996c> {

    /* renamed from: a */
    public C109997d f329166a;

    /* renamed from: a */
    public Object mo158580a(C15601d<? super C13598b0> dVar) {
        C109997d dVar2 = this.f329166a;
        if (dVar2 != null) {
            synchronized (dVar2) {
                C107226d dVar3 = dVar2.f329172a;
                if (dVar3 != null) {
                    dVar3.mo157686a();
                }
                dVar2.f329172a = null;
                GLES20.glDeleteProgram(dVar2.f329173b);
                C107225c cVar = C107225c.f320827a;
                C107225c.f320828b = null;
                C107225c.f320829c = false;
            }
        }
        this.f329166a = null;
        return C13598b0.f38549a;
    }

    /* renamed from: b */
    public Object mo158581b(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* renamed from: d */
    public Object mo158582c(C109995b bVar, C15601d<? super C109996c> dVar) {
        if (this.f329166a == null) {
            C107225c.f320827a.mo157685b(C110264g.C110266c.SEGMENT_GLASS);
            C109997d dVar2 = new C109997d();
            this.f329166a = dVar2;
            C107226d dVar3 = dVar2.f329172a;
            if (dVar3 != null && dVar3.f320836f) {
                dVar3.f320836f = false;
                C103355g1 g1Var = dVar3.f320835e;
                if (g1Var != null) {
                    g1Var.mo143229I(false);
                }
            }
        }
        C110201e eVar = bVar.f329167a;
        C110194c cVar = bVar.f329168b;
        int i = eVar.f329678a;
        int i2 = eVar.f329679b;
        cVar.f329657j = i;
        cVar.f329658n = i2;
        C110194c cVar2 = bVar.f329169c;
        cVar2.f329657j = i;
        cVar2.f329658n = i2;
        C109997d dVar4 = this.f329166a;
        if (dVar4 != null) {
            int i3 = eVar.f329680c;
            boolean z = eVar.f329681d;
            int i4 = cVar.f329652e;
            C107225c cVar3 = C107225c.f320827a;
            if (!C107225c.f320829c) {
                Log.m105924i("MicroMsg.VirtualBackgroundFilter", "initRenderProc");
                C107225c.f320829c = true;
                C107225c.f320830d = new JSONArray();
            }
            if (i4 != -1) {
                if (dVar4.f329172a == null) {
                    dVar4.f329172a = new C107226d();
                    C107226d dVar5 = dVar4.f329172a;
                    if (dVar5 != null) {
                        dVar5.mo157688c(i4, cVar2, true);
                    }
                }
                C107226d dVar6 = dVar4.f329172a;
                if (dVar6 != null && dVar6.f320836f) {
                    dVar6.f320836f = false;
                    C103355g1 g1Var2 = dVar6.f320835e;
                    if (g1Var2 != null) {
                        g1Var2.mo143229I(false);
                    }
                }
                C107226d dVar7 = dVar4.f329172a;
                if (dVar7 != null) {
                    dVar7.mo157690e(i, i2);
                    dVar7.f320831a = i4;
                    dVar7.f320832b = cVar2;
                    dVar7.mo157687b(i3, 0, z);
                }
                GLES20.glFinish();
            }
        }
        return new C109996c(bVar.f329167a, bVar.f329169c.f329652e);
    }
}
