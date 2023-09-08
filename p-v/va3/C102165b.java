package va3;

import android.app.Activity;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import java.util.Objects;
import uv0.C22663i;

/* renamed from: va3.b */
public class C102165b extends C22663i {

    /* renamed from: b */
    public NoteEditorUI f300831b;

    public C102165b(NoteEditorUI noteEditorUI) {
        super(noteEditorUI);
        this.f300831b = noteEditorUI;
    }

    /* renamed from: d */
    public void mo23513d(boolean z) {
        NoteEditorUI noteEditorUI = this.f300831b;
        if (noteEditorUI != null) {
            noteEditorUI.mo134923R7(1);
            super.mo23513d(z);
        }
    }

    /* renamed from: g */
    public boolean mo23516g() {
        return super.mo23516g();
    }

    public Activity getActivity() {
        Activity activity = super.getActivity();
        Objects.requireNonNull(activity);
        return activity;
    }
}
