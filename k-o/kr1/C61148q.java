package kr1;

import android.content.Intent;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hi2.C98453h;
import java.util.ArrayList;
import lh2.C109344g0;
import qh2.C101198e;
import sx3.C110818d0;
import zt3.C119157j;

/* renamed from: kr1.q */
public final class C61148q implements C109344g0 {

    /* renamed from: d */
    public ArrayList<String> f174085d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<Boolean> f174086e = new ArrayList<>();

    /* renamed from: kr1.q$a */
    public static final class C61149a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61148q f174087d;

        public C61149a(C61148q qVar) {
            this.f174087d = qVar;
        }

        public final void run() {
            for (String s : this.f174087d.f174085d) {
                C98453h.f288774a.mo137821s(s);
            }
            this.f174087d.f174085d.clear();
        }
    }

    public C61148q(C101198e eVar) {
        C87412m.m108594g(eVar, "status");
    }

    /* renamed from: a */
    public final void mo86088a(String str, boolean z) {
        C87412m.m108594g(str, "path");
        this.f174085d.add(str);
        this.f174086e.add(Boolean.valueOf(z));
        Log.m105924i("MicroMsg.FinderSubVideoFilePlugin", "current video size:" + this.f174085d.size() + " add path:" + str + ", " + z);
    }

    /* renamed from: b */
    public final void mo86089b() {
        if (!this.f174085d.isEmpty()) {
            ArrayList<String> arrayList = this.f174085d;
            arrayList.remove(arrayList.size() - 1);
            C98453h.f288774a.mo137810h((String) C110818d0.m150923U(this.f174085d));
        }
        if (!this.f174086e.isEmpty()) {
            ArrayList<Boolean> arrayList2 = this.f174086e;
            arrayList2.remove(arrayList2.size() - 1);
        }
        Log.m105924i("MicroMsg.FinderSubVideoFilePlugin", "current file list size:" + this.f174085d.size());
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C61148q.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
        Log.m105924i("MicroMsg.FinderSubVideoFilePlugin", "release");
        ((C119157j) C119157j.f356862d).mo183875f(new C61149a(this));
    }

    public void reset() {
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
