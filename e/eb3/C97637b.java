package eb3;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d92.C107028a;
import gy3.C87412m;
import k92.C108976d;
import nj3.C88990b;
import te3.C64357f43;
import te3.C64459j13;

/* renamed from: eb3.b */
public final class C97637b extends C108976d {

    /* renamed from: u */
    public final NoteEditorUI f286418u;

    /* renamed from: v */
    public int f286419v;

    /* renamed from: w */
    public String f286420w = "";

    /* renamed from: x */
    public String f286421x = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97637b(NoteEditorUI noteEditorUI, C107028a aVar) {
        super(aVar);
        C87412m.m108594g(noteEditorUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(aVar, "pageAdapter");
        this.f286418u = noteEditorUI;
        Log.m105925i("MicroMsg.NoteMultiTaskHelper", "create, NoteEditorUI:%s", Integer.valueOf(noteEditorUI.hashCode()));
    }

    /* renamed from: A */
    public boolean mo67893A() {
        return true;
    }

    /* renamed from: B */
    public boolean mo67894B() {
        return true;
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return true;
    }

    /* renamed from: D */
    public void mo35809D(int i, String str) {
        Activity activity;
        Activity activity2;
        Window window;
        View decorView;
        super.mo35809D(i, str);
        if (mo160082g()) {
            C107028a aVar = this.f326423e;
            if (!(aVar == null || (activity2 = aVar.getActivity()) == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                decorView.setBackgroundColor(0);
            }
            C107028a aVar2 = this.f326423e;
            if (!(aVar2 == null || (activity = aVar2.getActivity()) == null)) {
                activity.overridePendingTransition(C0966R.C0968anim.f2393bw, 0);
            }
            C107028a aVar3 = this.f326423e;
            C88990b.m111194c(aVar3 != null ? aVar3.getActivity() : null, (C88990b.C61771c) null);
        }
    }

    /* renamed from: P */
    public void mo136900P(C108976d.C108977a aVar) {
        NoteEditorUI noteEditorUI;
        if (mo160082g() && (noteEditorUI = this.f286418u) != null) {
            noteEditorUI.hideVKB();
        }
        super.mo136900P(aVar);
    }

    /* renamed from: d */
    public void mo67897d() {
        if (this.f286419v != 0) {
            try {
                C64357f43 f432 = new C64357f43();
                f432.f183078d = this.f286419v;
                f432.f183079e = this.f286420w;
                MultiTaskInfo multiTaskInfo = this.f326418a;
                C64459j13 m2 = multiTaskInfo != null ? multiTaskInfo.mo80305m2() : null;
                if (m2 != null) {
                    m2.f183752e = this.f286421x;
                }
                MultiTaskInfo multiTaskInfo2 = this.f326418a;
                if (multiTaskInfo2 != null) {
                    multiTaskInfo2.field_data = f432.toByteArray();
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.NoteMultiTaskHelper", "onMenuMultiTaskSelected error, ex = " + e.getMessage());
            }
        }
    }

    /* renamed from: w */
    public void mo74197w(Bitmap bitmap, boolean z) {
        if (z) {
            Log.m105924i("MicroMsg.NoteMultiTaskHelper", "ended, remove historyTaskInfo");
            mo160072I();
            return;
        }
        Log.m105924i("MicroMsg.NoteMultiTaskHelper", "not ended update historyTaskInfo");
        mo74195s(bitmap);
    }
}
