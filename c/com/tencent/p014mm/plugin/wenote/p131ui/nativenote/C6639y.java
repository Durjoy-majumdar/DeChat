package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.tools.FileExplorerUI;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import p206nj.C88955f;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.y */
public class C6639y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f23922d;

    /* renamed from: e */
    public final /* synthetic */ C96728e0 f23923e;

    /* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.y$a */
    public class C6640a implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ Intent f23924a;

        public C6640a(Intent intent) {
            this.f23924a = intent;
        }

        public void onOp(Boolean bool) {
            if (bool.booleanValue()) {
                Intent intent = this.f23924a;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4099);
                aVar.mo10233c(intent);
                C117292a.m165364j((Activity) C6639y.this.f23922d, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$4$1", "onOp", "(Ljava/lang/Boolean;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
    }

    public C6639y(C96728e0 e0Var, Context context) {
        this.f23923e = e0Var;
        this.f23922d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((NoteEditorUI) this.f23923e.f283371s).f283238X0.mo126184D(-1, false, true);
        if (!C88955f.m111058b()) {
            C76912y0.m92771j(this.f23922d, (View) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent(this.f23922d, FileExplorerUI.class);
        intent.putExtra("key_title", this.f23922d.getString(C0966R.string.cpu));
        if (((C113177k) C86312j.m106911c(C113177k.class)).mo165704UG(C113177k.C113179b.STORAGE, new C6640a(intent))) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4099);
        aVar.mo10233c(intent);
        C117292a.m165364j((Activity) this.f23922d, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$4", "onClick", "(Landroid/view/View;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
