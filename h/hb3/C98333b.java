package hb3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bb3.C92221d;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview.C96750a;
import com.tencent.p014mm.sdk.platformtools.Log;
import ib3.C98628a;
import ib3.C98629b;
import ib3.C98630c;
import ib3.C98633d;
import ib3.C98635e;
import ib3.C98636f;
import ib3.C98637g;
import ib3.C98638h;
import ib3.C98639i;
import ib3.C98640j;
import ib3.C98649p;
import ib3.C98651q;
import ib3.C98656r;
import ib3.C98657s;
import ib3.C98658t;
import xa3.C102587c;

/* renamed from: hb3.b */
public class C98333b extends RecyclerView.C16613e<C98628a> {

    /* renamed from: d */
    public C96679b f288227d;

    /* renamed from: e */
    public C92221d f288228e;

    /* renamed from: f */
    public C96750a f288229f;

    /* renamed from: g */
    public C98638h f288230g;

    /* renamed from: h */
    public boolean f288231h = false;

    public C98333b(C96679b bVar, C92221d dVar, C96750a aVar) {
        this.f288227d = bVar;
        this.f288228e = dVar;
        this.f288229f = aVar;
        this.f288230g = new C98638h();
    }

    public int getItemCount() {
        return this.f288231h ? this.f288228e.mo126186F() + 1 : this.f288228e.mo126186F();
    }

    public int getItemViewType(int i) {
        C102587c k = this.f288228e.mo126201k(i);
        if (k != null) {
            return k.mo142212c();
        }
        if (this.f288231h && i == this.f288228e.mo126186F()) {
            return 30;
        }
        Log.m105921e("MicroMsg.Note.NoteRecyclerViewAdapter", "getItemViewType, item is null, position is %d", Integer.valueOf(i));
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C98628a aVar = (C98628a) zVar;
        synchronized (this) {
            C102587c k = this.f288228e.mo126201k(i);
            if (k == null || k.mo142212c() != aVar.mo138058y()) {
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(k == null);
                objArr[1] = Integer.valueOf(i);
                Log.m105921e("MicroMsg.Note.NoteRecyclerViewAdapter", "onBindViewHolder, item is null %b, position is %d", objArr);
            } else {
                aVar.mo138059z(k, i, k.mo142212c());
            }
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log.m105924i("MicroMsg.Note.NoteRecyclerViewAdapter", "onCreateViewHolder viewType = " + i);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f288230g.f289208a.get(i).intValue(), viewGroup, false);
        C98638h hVar = this.f288230g;
        C96679b bVar = this.f288227d;
        C92221d dVar = this.f288228e;
        C96750a aVar = this.f288229f;
        hVar.getClass();
        if (i == 20) {
            return new C98630c(inflate, bVar, dVar, aVar);
        }
        if (i == 30) {
            return new C98633d(inflate, bVar, dVar);
        }
        switch (i) {
            case -3:
                return new C98636f(inflate, bVar, dVar);
            case -2:
                return new C98629b(inflate, bVar, dVar);
            case -1:
                return new C98649p(inflate, bVar, dVar);
            case 0:
                return new C98656r(inflate, bVar, dVar);
            case 1:
                return new C98651q(inflate, bVar, dVar);
            case 2:
                return new C98637g(inflate, bVar, dVar);
            case 3:
                return new C98639i(inflate, bVar, dVar);
            case 4:
                return new C98658t(inflate, bVar, dVar, aVar);
            case 5:
                return new C98635e(inflate, bVar, dVar);
            case 6:
                return new C98657s(inflate, bVar, dVar);
            case 7:
                return new C98640j(inflate, bVar, dVar);
            default:
                return null;
        }
    }
}
