package p375qh;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import kd0.C76539f;
import kd0.C76540g;
import kd0.C76551y;
import kd0.C76552z;
import ob0.C117747y;
import p206nj.C76861g;

/* renamed from: qh.o$$b */
public class o$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117747y f225536d;

    /* renamed from: e */
    public final /* synthetic */ int f225537e;

    /* renamed from: f */
    public final /* synthetic */ int f225538f;

    /* renamed from: g */
    public final /* synthetic */ C77347o f225539g;

    /* renamed from: qh.o$$b$a */
    public class C77348a implements Runnable {
        public C77348a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try run");
            o$$b.this.f225539g.mo107480e();
        }
    }

    public o$$b(C77347o oVar, C117747y yVar, int i, int i2) {
        this.f225539g = oVar;
        this.f225536d = yVar;
        this.f225537e = i;
        this.f225538f = i2;
    }

    public void run() {
        String str;
        int i;
        if (this.f225536d.getType() == 128) {
            this.f225539g.f225528j = false;
            C76539f fVar = (C76539f) this.f225536d;
            str = fVar.f223996f;
            i = fVar.f223999i;
        } else if (this.f225536d.getType() == 127) {
            this.f225539g.f225529n = false;
            C76540g gVar = (C76540g) this.f225536d;
            str = gVar.f224013f;
            i = gVar.f224017j;
        } else {
            Log.m105920e("MicroMsg.SceneVoiceService", "onSceneEnd Error SceneType:" + this.f225536d.getType());
            return;
        }
        C76551y o = C76552z.m92077o(str);
        if (this.f225536d.getType() == 128 && o != null) {
            if (((o.f224071v & 1) != 0) && o.f224058i != 98) {
                C76552z.m92084v(str);
                Log.m105928w("MicroMsg.SceneVoiceService", "re-download set error");
            }
        }
        long j = 0;
        if (!(str == null || ((HashMap) this.f225539g.f225527i).get(str) == null)) {
            j = ((C76861g.C47263a) ((HashMap) this.f225539g.f225527i).get(str)).mo72288a();
            ((HashMap) this.f225539g.f225527i).remove(str);
        }
        Log.m105924i("MicroMsg.SceneVoiceService", "onSceneEnd SceneType:" + this.f225536d.getType() + " errtype:" + this.f225537e + " errCode:" + this.f225538f + " retCode:" + i + " file:" + str + " time:" + j);
        int i2 = this.f225537e;
        if (i2 == 3 && i != 0) {
            C77347o oVar = this.f225539g;
            oVar.f225531p--;
        } else if (i2 != 0) {
            this.f225539g.f225531p = 0;
        }
        Log.m105924i("MicroMsg.SceneVoiceService", "onSceneEnd stop:" + this.f225539g.f225531p + " running:" + this.f225539g.f225530o + " recving:" + this.f225539g.f225528j + " sending:" + this.f225539g.f225529n);
        C77347o oVar2 = this.f225539g;
        if (oVar2.f225531p > 0) {
            C77347o.m93242b(oVar2);
        } else if (!oVar2.f225529n && !oVar2.f225528j) {
            oVar2.mo107478c();
            Log.m105925i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try next delay 3s [%d, %d] [%b]", Integer.valueOf(this.f225537e), Integer.valueOf(i), Boolean.valueOf(C77347o.f225520t));
            if (C77347o.f225520t && this.f225537e == 4) {
                this.f225539g.mo107479d().postDelayed(new C77348a(), 10000);
            }
        }
    }

    public String toString() {
        return super.toString() + "|onSceneEnd";
    }
}
