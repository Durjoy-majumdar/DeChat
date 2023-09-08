package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import android.widget.RadioGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputLayout;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.f2 */
public class C19491f2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputPanel f55116d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.f2$a */
    public class C19492a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C77426q f55117a;

        public C19492a(C77426q qVar) {
            this.f55117a = qVar;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            VoiceInputPanel voiceInputPanel = C19491f2.this.f55116d;
            voiceInputPanel.f55083R = i;
            voiceInputPanel.f55093h.setText(voiceInputPanel.f55084S.get(i));
            VoiceInputPanel voiceInputPanel2 = C19491f2.this.f55116d;
            VoiceInputLayout voiceInputLayout = voiceInputPanel2.f55089d;
            if (voiceInputLayout != null) {
                voiceInputLayout.setLangType(voiceInputPanel2.f55085T.get(voiceInputPanel2.f55083R).intValue());
            }
            C77398g gVar = this.f55117a.f225839c;
            if (gVar != null) {
                gVar.dismiss();
            }
            C19491f2.this.f55116d.mo25281k(2);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.f2$b */
    public class C19493b implements C47883u {
        public C19493b(C19491f2 f2Var) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    public C19491f2(VoiceInputPanel voiceInputPanel) {
        this.f55116d = voiceInputPanel;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77426q qVar = new C77426q(this.f55116d.getContext());
        C19492a aVar = new C19492a(qVar);
        qVar.mo107606r(this.f55116d.getContext().getString(C0966R.string.kcn));
        VoiceInputPanel voiceInputPanel = this.f55116d;
        qVar.mo107605q(voiceInputPanel.f55084S, aVar, voiceInputPanel.f55083R);
        qVar.mo107589a(true);
        qVar.mo107597i(new C19493b(this));
        qVar.mo107603o();
        this.f55116d.mo25281k(3);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
