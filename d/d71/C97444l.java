package d71;

import android.view.View;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.TextEditorItemView;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: d71.l */
public final class C97444l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97434g f286021d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<TextEditorItemView> f286022e;

    public C97444l(C97434g gVar, C8479f0<TextEditorItemView> f0Var) {
        this.f286021d = gVar;
        this.f286022e = f0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emojicapture/presenter/EditorPresenter$updateTextWithoutCheck$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f286021d.f285989b.mo128097e(true, ((TextEditorItemView) this.f286022e.f27484d).getText(), ((TextEditorItemView) this.f286022e.f27484d).getTextColor());
        EmojiCaptureReporter emojiCaptureReporter = this.f286021d.f285992e;
        EmojiCaptureReporter.m117776b(13, emojiCaptureReporter.f269128d, 0, 0, 0, 0, 0, 0, 0, emojiCaptureReporter.f269127G);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/presenter/EditorPresenter$updateTextWithoutCheck$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
