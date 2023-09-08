package com.tencent.p014mm.plugin.transvoice.p324ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j13.C76381b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import lc3.C10485b;
import md0.C99847f;

/* renamed from: com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout */
public class LanguageChoiceLayout extends RelativeLayout {

    /* renamed from: d */
    public Button f207388d = null;

    /* renamed from: e */
    public Button f207389e = null;

    /* renamed from: f */
    public View f207390f = null;

    /* renamed from: g */
    public ViewGroup f207391g = null;

    /* renamed from: h */
    public RecyclerView f207392h = null;

    /* renamed from: i */
    public C76381b f207393i = null;

    /* renamed from: j */
    public C71568e f207394j = null;

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout$a */
    public class C71564a implements View.OnClickListener {
        public C71564a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/LanguageChoiceLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LanguageChoiceLayout.this.mo98692a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout$b */
    public class C71565b implements View.OnClickListener {
        public C71565b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/LanguageChoiceLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LanguageChoiceLayout.this.mo98692a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout$c */
    public class C71566c implements View.OnClickListener {
        public C71566c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/LanguageChoiceLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LanguageChoiceLayout languageChoiceLayout = LanguageChoiceLayout.this;
            C71568e eVar = languageChoiceLayout.f207394j;
            if (eVar != null) {
                int i = languageChoiceLayout.f207393i.f223663e;
                ChatFooter$$n chatFooter$$n = (ChatFooter$$n) eVar;
                ChatFooter chatFooter = chatFooter$$n.f212022a;
                chatFooter.f211738A4 = i;
                if (Util.isNullOrNil((String) ((HashMap) chatFooter.f211925q4).get(Integer.valueOf(i)))) {
                    long nanoTime = System.nanoTime() | Util.MAX_32BIT_VALUE;
                    if (nanoTime < 0) {
                        nanoTime = Math.abs(nanoTime);
                    }
                    C99847f fVar = new C99847f(String.valueOf(nanoTime));
                    chatFooter$$n.f212022a.f211741B2.mo139201a(fVar);
                    SharedPreferences.Editor edit = chatFooter$$n.f212022a.getContext().getSharedPreferences("voice2txt_sp", 0).edit();
                    ChatFooter chatFooter2 = chatFooter$$n.f212022a;
                    edit.putInt(chatFooter2.f211858d, chatFooter2.f211738A4).apply();
                    ChatFooter chatFooter3 = chatFooter$$n.f212022a;
                    chatFooter3.mo100382W0(chatFooter3.f211738A4, false, fVar, true);
                } else {
                    ChatFooter.m85249c(chatFooter$$n.f212022a);
                }
                chatFooter$$n.f212022a.f211750D2.f207376k = System.currentTimeMillis();
                C71562c cVar = chatFooter$$n.f212022a.f211750D2;
                cVar.f207379n = 0;
                cVar.f207380o = 0;
                cVar.f207381p = 0;
                cVar.f207384s = 0;
                cVar.f207385t = 0;
                cVar.f207386u = 0;
            }
            LanguageChoiceLayout.this.mo98692a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout$d */
    public class C71567d extends AnimatorListenerAdapter {
        public C71567d() {
        }

        public void onAnimationEnd(Animator animator) {
            LanguageChoiceLayout.this.setVisibility(8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.transvoice.ui.LanguageChoiceLayout$e */
    public interface C71568e {
    }

    public LanguageChoiceLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo98693b();
    }

    /* renamed from: a */
    public void mo98692a() {
        this.f207391g.animate().translationY((float) C75044y4.m89990b(getContext()).y).setDuration(200).setListener(new C71567d()).start();
    }

    /* renamed from: b */
    public final void mo98693b() {
        View.inflate(getContext(), C0966R.C0971layout.f359913bl0, this);
        this.f207391g = (ViewGroup) findViewById(C0966R.C0970id.hem);
        this.f207388d = (Button) findViewById(C0966R.C0970id.hel);
        this.f207389e = (Button) findViewById(C0966R.C0970id.hep);
        this.f207390f = findViewById(C0966R.C0970id.hek);
        this.f207392h = (RecyclerView) findViewById(C0966R.C0970id.heo);
        this.f207393i = new C76381b();
        this.f207392h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f207392h.setAdapter(this.f207393i);
        ArrayList arrayList = new ArrayList();
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("VoiceInputLanguageSupportType", 1);
        if (LocaleUtil.isChineseAppLang()) {
            arrayList.add(new C76381b.C76382a(getContext().getString(C0966R.string.f360932g30), 1));
            if ((b & 2) != 0) {
                arrayList.add(new C76381b.C76382a(getContext().getString(C0966R.string.g2y), 2));
            }
            if ((b & 4) != 0) {
                arrayList.add(new C76381b.C76382a(getContext().getString(C0966R.string.g2z), 4));
            }
            if ((b & 8) != 0) {
                arrayList.add(new C76381b.C76382a(getContext().getString(C0966R.string.f360933g31), 8));
            }
        } else if (LocaleUtil.getApplicationLanguage().equals("en")) {
            arrayList.add(new C76381b.C76382a(getContext().getString(C0966R.string.g2z), 4));
            arrayList.add(new C76381b.C76382a(getContext().getString(C0966R.string.f360932g30), 1));
            if ((b & 2) != 0) {
                arrayList.add(new C76381b.C76382a(getContext().getString(C0966R.string.g2y), 2));
            }
        }
        C76381b bVar = this.f207393i;
        ((ArrayList) bVar.f223662d).clear();
        ((ArrayList) bVar.f223662d).addAll(arrayList);
        this.f207393i.notifyDataSetChanged();
        this.f207391g.setTranslationY((float) C75044y4.m89990b(getContext()).y);
        this.f207390f.setOnClickListener(new C71564a());
        this.f207388d.setOnClickListener(new C71565b());
        this.f207389e.setOnClickListener(new C71566c());
    }

    public void setSelectLanguageListener(C71568e eVar) {
        this.f207394j = eVar;
    }

    public void setSelectedLang(int i) {
        C76381b bVar = this.f207393i;
        if (bVar != null) {
            bVar.f223663e = i;
            bVar.notifyDataSetChanged();
        }
    }

    public LanguageChoiceLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo98693b();
    }
}
