package cb3;

import ab3.C91983a;
import android.view.View;
import bb3.C92221d;
import com.tencent.p014mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fb3.C97855a;
import j20.C117292a;
import java.util.ArrayList;
import wa3.C102364c;
import wa3.C102365e;

/* renamed from: cb3.i */
public class C92398i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264408d;

    public C92398i(C92400k kVar) {
        this.f264408d = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105919d("NoteSelectManager", "onClick() called with: %s", this.f264408d.f264446w);
        C102365e Rd = C102364c.vx0().mo137946Rd();
        if (Rd != null) {
            String a = Rd.f301472i.mo141954a(Rd.mo141945g());
            boolean f = Rd.mo141944f();
            String str = Rd.f301472i.f301479a;
            FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new FavoriteNoteClickReportStruct();
            favoriteNoteClickReportStruct.f265562d = (long) 15;
            favoriteNoteClickReportStruct.f265564f = favoriteNoteClickReportStruct.mo86045b("noteid", a, true);
            favoriteNoteClickReportStruct.f265565g = f ? 1 : 0;
            favoriteNoteClickReportStruct.f265563e = favoriteNoteClickReportStruct.mo86045b("sessionID", str, true);
            favoriteNoteClickReportStruct.mo86054n();
            C97855a.f287023a.mo137182b(favoriteNoteClickReportStruct);
        }
        C91983a aVar = this.f264408d.f264445v;
        if (aVar != null) {
            ((NoteEditorUI) aVar).mo134924S7();
        }
        C91983a aVar2 = this.f264408d.f264445v;
        C92221d dVar = aVar2 != null ? ((NoteEditorUI) aVar2).f283238X0 : null;
        if (dVar != null) {
            dVar.mo126188H();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
