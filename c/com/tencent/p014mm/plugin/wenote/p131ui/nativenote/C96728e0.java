package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import ab3.C91983a;
import ab3.C91985c;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import qd0.C101121a;
import wa3.C102378p;
import xa3.C102587c;
import xa3.C102593i;
import xa3.C102596l;
import ya3.C102830a;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.e0 */
public class C96728e0 implements C102830a, C91985c {

    /* renamed from: a */
    public View f283353a;

    /* renamed from: b */
    public ImageButton f283354b;

    /* renamed from: c */
    public LinearLayout f283355c;

    /* renamed from: d */
    public ImageButton f283356d;

    /* renamed from: e */
    public ImageButton f283357e;

    /* renamed from: f */
    public ImageButton f283358f;

    /* renamed from: g */
    public ImageButton f283359g;

    /* renamed from: h */
    public LinearLayout f283360h;

    /* renamed from: i */
    public LinearLayout f283361i;

    /* renamed from: j */
    public LinearLayout f283362j;

    /* renamed from: k */
    public LinearLayout f283363k;

    /* renamed from: l */
    public LinearLayout f283364l;

    /* renamed from: m */
    public boolean f283365m = false;

    /* renamed from: n */
    public String f283366n = "";

    /* renamed from: o */
    public boolean f283367o = false;

    /* renamed from: p */
    public boolean f283368p = false;

    /* renamed from: q */
    public boolean f283369q = false;

    /* renamed from: r */
    public boolean f283370r = false;

    /* renamed from: s */
    public C96738o f283371s;

    public C96728e0(C96738o oVar) {
        this.f283371s = oVar;
    }

    /* renamed from: a */
    public static void m124169a(C96728e0 e0Var, View view, boolean z) {
        e0Var.getClass();
        view.postDelayed(new C96744u(e0Var, view, z), 100);
    }

    /* renamed from: b */
    public static void m124170b(C96728e0 e0Var, C91983a aVar) {
        e0Var.getClass();
        NoteEditorUI noteEditorUI = (NoteEditorUI) aVar;
        noteEditorUI.mo134937e8(true, 50);
        noteEditorUI.mo134936d8(1, 0);
    }

    /* renamed from: c */
    public void mo134989c(C91983a aVar) {
        int i;
        this.f283359g.setImageResource(C0966R.C0969drawable.b3m);
        if (this.f283365m) {
            this.f283365m = false;
            C102378p a = C102378p.m135106a();
            if (a.f301521a && !a.f301524d) {
                a.mo141967b();
            }
            C102378p a2 = C102378p.m135106a();
            String str = C86013q1.m106450k(a2.f301531k) ? a2.f301531k : "";
            int i2 = (int) C102378p.m135106a().f301523c;
            int a3 = (int) C101121a.m132521a((long) i2);
            C92221d dVar = ((NoteEditorUI) this.f283371s).f283238X0;
            synchronized (dVar) {
                if (dVar.f263945a != null) {
                    i = 0;
                    while (true) {
                        if (i < dVar.f263945a.size()) {
                            if (dVar.f263945a.get(i).mo142212c() == 4 && ((C102596l) dVar.f263945a.get(i)).f302088y.booleanValue()) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                i = -1;
            }
            C102587c k = ((NoteEditorUI) this.f283371s).f283238X0.mo126201k(i);
            if (!C86013q1.m106450k(str)) {
                Log.m105920e("MicroMsg.WNNoteFootPannel", "voicePath not exist, remove data from datalist and ui");
                ((NoteEditorUI) this.f283371s).f283238X0.mo126215y(i, false);
                if (aVar != null) {
                    ((NoteEditorUI) aVar).mo134935d5(i);
                }
                C102593i iVar = new C102593i();
                iVar.f302126s = "";
                iVar.f302071b = true;
                iVar.f302077h = false;
                ((NoteEditorUI) this.f283371s).f283238X0.mo126191a(i, iVar, true);
                ((NoteEditorUI) this.f283371s).f283238X0.mo126194d(i - 1, i + 1, true);
            } else if (i != -1 && k != null && k.mo142212c() == 4) {
                C102596l lVar = (C102596l) k;
                lVar.f302088y = Boolean.FALSE;
                lVar.f302099p = 4;
                lVar.f302100q = true;
                lVar.f302132u = a3;
                lVar.f302133v = ((String) C101121a.m132522b(MMApplicationContext.getContext(), a3)).toString();
                lVar.f302101r = str;
                lVar.f302135x = i2;
                C91983a aVar2 = ((NoteEditorUI) this.f283371s).f283238X0.f263946b;
                if (aVar2 != null) {
                    ((NoteEditorUI) aVar2).mo134940h2(i, 0);
                }
            }
        }
    }
}
