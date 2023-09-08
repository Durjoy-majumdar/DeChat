package g13;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import g13.C98071g;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import te3.ak4;

/* renamed from: g13.h */
public class C98076h implements C11385n {

    /* renamed from: d */
    public SparseArray<C98071g.C98075d> f287538d = null;

    /* renamed from: e */
    public boolean f287539e = false;

    /* renamed from: f */
    public C45875c f287540f;

    /* renamed from: g */
    public C98070b f287541g;

    /* renamed from: h */
    public int f287542h;

    /* renamed from: i */
    public long f287543i;

    /* renamed from: j */
    public MTimerHandler f287544j = new MTimerHandler(new C98077a(), false);

    /* renamed from: g13.h$a */
    public class C98077a implements MTimerHandler.CallBack {
        public C98077a() {
        }

        public boolean onTimerExpired() {
            C98076h hVar = C98076h.this;
            if (hVar.f287539e) {
                Log.m105921e("MicroMsg.WorkingTranslate", "this work is time out, index: %s", Integer.valueOf(hVar.f287542h));
                C98076h hVar2 = C98076h.this;
                hVar2.f287540f = null;
                hVar2.f287539e = false;
                ((C98071g) hVar2.f287541g).mo137368b(hVar2.f287542h, 1, -1, (String) null, hVar2.f287538d, (LinkedList<ak4>) null);
            }
            return false;
        }
    }

    public C98076h(int i, C98070b bVar) {
        this.f287542h = i;
        this.f287541g = bVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (this.f287540f != yVar) {
            Log.m105920e("MicroMsg.WorkingTranslate", "not my translate work");
            return;
        }
        this.f287544j.stopTimer();
        Log.m105919d("MicroMsg.WorkingTranslate", "translate take time : %s", Long.valueOf(System.currentTimeMillis() - this.f287543i));
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = str;
        C45875c cVar = (C45875c) yVar;
        LinkedList<ak4> linkedList = cVar.f123831f;
        objArr[3] = Integer.valueOf(linkedList != null ? linkedList.size() : 0);
        Log.m105919d("MicroMsg.WorkingTranslate", "errType : %s, errCode : %s, errMsg : %s, translatedMsg.size() : %s", objArr);
        this.f287540f = null;
        this.f287539e = false;
        ((C98071g) this.f287541g).mo137368b(this.f287542h, i, i2, str, this.f287538d, cVar.f123831f);
    }
}
