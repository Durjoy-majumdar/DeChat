package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import ab3.C91983a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kd0.C99125s;
import nj3.C76912y0;
import p182kk.C61104a;
import p206nj.C100115c;
import p206nj.C88955f;
import p375qh.C101196q;
import p447aw.C103918d;
import pb1.C11881t1;
import te3.C101834rc0;
import wa3.C102364c;
import wa3.C102365e;
import wa3.C102368h;
import wa3.C102377o;
import wa3.C102378p;
import xa3.C102596l;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.x */
public class C96752x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91983a f283431d;

    /* renamed from: e */
    public final /* synthetic */ Context f283432e;

    /* renamed from: f */
    public final /* synthetic */ C96728e0 f283433f;

    public C96752x(C96728e0 e0Var, C91983a aVar, Context context) {
        this.f283433f = e0Var;
        this.f283431d = aVar;
        this.f283432e = context;
    }

    public void onClick(View view) {
        long j;
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C96728e0 e0Var = this.f283433f;
        View view2 = e0Var.f283353a;
        char c = 0;
        if (((view2 == null || view2.getVisibility() == 8) ? 0 : e0Var.f283355c.getVisibility() == 0 ? (char) 3 : 1) == 3) {
            ((NoteEditorUI) this.f283431d).mo134937e8(true, 50);
            ((NoteEditorUI) this.f283431d).mo134936d8(1, 0);
        }
        ((NoteEditorUI) this.f283433f.f283371s).f283238X0.mo126184D(-1, false, true);
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) this.f283432e, "android.permission.RECORD_AUDIO", 80, (String) null, (String) null);
        Log.m105925i("MicroMsg.WNNoteFootPannel", "summerper checkPermission checkMicrophone[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
        if (!z1) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!this.f283433f.f283365m) {
            if (!C88955f.m111058b()) {
                C76912y0.m92771j(this.f283432e, (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (C61104a.m71669y(this.f283432e) || C61104a.m71665u(this.f283432e) || C61104a.m71649e(this.f283432e)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        C96728e0 e0Var2 = this.f283433f;
        if (!e0Var2.f283365m) {
            C102365e Rd = C102364c.vx0().mo137946Rd();
            if (Rd != null) {
                String a = Rd.f301472i.mo141954a(Rd.mo141945g());
                boolean f = Rd.mo141944f();
                String str2 = Rd.f301472i.f301479a;
                FavoriteNoteClickReportStruct favoriteNoteClickReportStruct = new FavoriteNoteClickReportStruct();
                favoriteNoteClickReportStruct.f265562d = (long) 3;
                favoriteNoteClickReportStruct.f265564f = favoriteNoteClickReportStruct.mo86045b("noteid", a, true);
                favoriteNoteClickReportStruct.f265565g = f ? 1 : 0;
                favoriteNoteClickReportStruct.f265563e = favoriteNoteClickReportStruct.mo86045b("sessionID", str2, true);
                favoriteNoteClickReportStruct.mo86054n();
                if (Log.getLogLevel() <= 1) {
                    String q = favoriteNoteClickReportStruct.mo1006q();
                    C87412m.m108593f(q, "struct.toShowString()");
                    Log.m105925i("MicroMsg.WNNoteReporter", "report%s %s", 14547, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                }
            }
            if (((NoteEditorUI) this.f283433f.f283371s).f283238X0.mo126195e(0, 1)) {
                ((NoteEditorUI) this.f283431d).mo134932a8();
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f283433f.f283359g.setImageResource(C0966R.raw.fav_note_voiceplayer_record_icon);
            if (((NoteEditorUI) this.f283433f.f283371s).f283242Z0.mo135022e()) {
                ((NoteEditorUI) this.f283433f.f283371s).f283242Z0.mo135024g();
            }
            this.f283433f.f283365m = true;
            C102596l lVar = new C102596l();
            lVar.f302099p = 4;
            lVar.f302100q = false;
            lVar.f302088y = Boolean.TRUE;
            this.f283432e.getString(C0966R.string.csg);
            C96728e0 e0Var3 = this.f283433f;
            e0Var3.f283366n = "speex";
            lVar.f302134w = 1;
            lVar.f302098o = ((NoteEditorUI) e0Var3.f283371s).f283238X0.mo126200j();
            lVar.f302130s = this.f283433f.f283366n;
            lVar.f302070a = C102368h.m135071b(lVar.toString(), 18);
            C101834rc0 rc02 = new C101834rc0();
            rc02.mo141257m(lVar.f302070a);
            rc02.mo141261q(lVar.f302130s);
            C96679b bVar = C96679b.f283182r;
            if (bVar != null) {
                ((NoteEditorUI) this.f283433f.f283371s).f283238X0.mo126209s(lVar, bVar.mo134905c(), true, true, false, false, false);
            } else {
                ((NoteEditorUI) this.f283433f.f283371s).f283238X0.mo126209s(lVar, (WXRTEditText) null, true, true, false, false, false);
            }
            C102378p a2 = C102378p.m135106a();
            C96728e0 e0Var4 = this.f283433f;
            String c2 = C102368h.m135072c(rc02);
            a2.f301533m = lVar;
            Util.getInt(lVar.f302098o.substring(7), 0);
            String str3 = lVar.f302130s;
            if (!a2.f301521a) {
                a2.f301521a = true;
                a2.f301532l = e0Var4;
                a2.f301530j = str3;
                a2.f301531k = c2;
                C100115c cVar = a2.f301527g;
                if (cVar != null) {
                    cVar.mo139415b();
                }
                a2.f301524d = false;
                if (Util.isNullOrNil(a2.f301531k)) {
                    C86009m1 m1Var = new C86009m1(C11881t1.m11563a(true), "wenote/voice/data");
                    if (!m1Var.mo119967g()) {
                        m1Var.mo119987x();
                    }
                    String i = m1Var.mo119971i();
                    Uri n = C116299g2.m163858n(i);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0 f0Var = C116281f0.C116289i.f348994a;
                    C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                        if (l2.mo177810a()) {
                            l2.f348991a.mo119937g(l2.f348992b);
                        }
                    }
                    do {
                        str = i + "/" + System.currentTimeMillis();
                        Uri n2 = C116299g2.m163858n(str);
                        String path2 = n2.getPath();
                        if (path2 != null) {
                            String k2 = C116299g2.m163855k(path2, false, false);
                            if (!n2.getPath().equals(k2)) {
                                n2 = n2.buildUpon().path(k2).build();
                            }
                        }
                        C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                        if (!l3.mo177810a()) {
                            z = false;
                            continue;
                        } else {
                            z = l3.f348991a.mo119948x(l3.f348992b);
                            continue;
                        }
                    } while (z);
                    a2.f301531k = str;
                }
                if ((Util.isNullOrNil(str3) ? "amr" : str3).equals("speex")) {
                    a2.f301529i = new C99125s();
                } else {
                    C101196q qVar = new C101196q();
                    a2.f301528h = qVar;
                    qVar.f296208d = new C102377o(a2);
                }
                a2.f301525e = -1;
                if ((str3.equals("speex") ? Boolean.valueOf(a2.f301529i.startRecord(a2.f301531k)) : Boolean.valueOf(a2.f301528h.mo140641a(a2.f301531k, 3600010))).booleanValue()) {
                    a2.f301522b = Util.currentTicks();
                    a2.f301536p.startTimer(200);
                    j = 0;
                } else {
                    j = 0;
                    a2.f301522b = 0;
                }
                if (a2.f301522b == j) {
                    c = 65535;
                } else {
                    a2.f301535o.sendEmptyMessage(4096);
                }
            }
            if (c < 0) {
                ((NoteEditorUI) this.f283431d).mo134929X7();
                this.f283433f.mo134989c(this.f283431d);
            }
        } else {
            e0Var2.mo134989c(this.f283431d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
