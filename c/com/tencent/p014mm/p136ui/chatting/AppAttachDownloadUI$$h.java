package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import bp3.C79758p;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gq0.C107879e0;
import gq0.C107885g0;
import gq0.C45944i0;
import iq0.C98783b;
import java.util.ArrayList;
import k92.C108976d;
import ke3.C88144b;
import kr0.C109033l0;
import p763ym.C79138l;
import qo3.C77407n;
import tf3.C110978f;
import wc3.C102428i;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI$$h */
public class AppAttachDownloadUI$$h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachDownloadUI f55959d;

    public AppAttachDownloadUI$$h(AppAttachDownloadUI appAttachDownloadUI) {
        this.f55959d = appAttachDownloadUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        AppAttachDownloadUI appAttachDownloadUI = this.f55959d;
        boolean z = appAttachDownloadUI.f55912K;
        appAttachDownloadUI.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = appAttachDownloadUI.f55945t;
            exDeviceHaveBindNetworkDeviceEvent.publish();
            int i = appAttachDownloadUI.f55931d;
            if (i == 0) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.i48));
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.f360349c14));
                arrayList2.add(0);
                arrayList2.add(3);
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    arrayList.add(appAttachDownloadUI.getString(C0966R.string.c1e));
                    arrayList2.add(4);
                }
            } else if (i != 6) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.i48));
                arrayList2.add(0);
            } else {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.i48));
                arrayList2.add(0);
                C108976d dVar = appAttachDownloadUI.f55925U;
                if (dVar != null && dVar.mo67893A()) {
                    arrayList.add(appAttachDownloadUI.getString(C0966R.string.cak));
                    arrayList2.add(9);
                }
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.f360349c14));
                arrayList2.add(3);
                Long a = C102428i.m135144a(appAttachDownloadUI.f55904C);
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a || (a != null && ((C79138l) C86312j.m106911c(C79138l.class)).Bl0(appAttachDownloadUI.getContext(), a.longValue()))) {
                    arrayList.add(appAttachDownloadUI.getString(C0966R.string.c1e));
                    arrayList2.add(4);
                }
                C88144b.m109788f("favorite");
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.f361137hk2));
                arrayList2.add(2);
                if (((C92331c) C86312j.m106911c(C92331c.class)).mo58357LH() && appAttachDownloadUI.f55923T != null && AbsHandOffFile.isSupportOpenFile(appAttachDownloadUI.f55904C)) {
                    arrayList.add(appAttachDownloadUI.getString(C0966R.string.cvp));
                    arrayList2.add(17);
                }
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.cgm));
                arrayList2.add(14);
            }
        } else {
            C88144b.m109788f("favorite");
            arrayList.add(appAttachDownloadUI.getString(C0966R.string.f361137hk2));
            arrayList2.add(2);
        }
        if (C79758p.f233760a.mo109883f(new C110978f()) == 1) {
            if (appAttachDownloadUI.f55902A.startsWith("fts_template") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0l));
                arrayList2.add(5);
            } else if (appAttachDownloadUI.f55902A.startsWith("was_template") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0w));
                arrayList2.add(6);
            }
            if (appAttachDownloadUI.f55902A.startsWith("fts_feature") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0k));
                arrayList2.add(7);
            }
            if (appAttachDownloadUI.f55902A.startsWith("wrd_template") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0j));
                arrayList2.add(8);
            }
            if (appAttachDownloadUI.f55902A.startsWith("pardus") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0s));
                arrayList2.add(12);
            }
            if (appAttachDownloadUI.f55902A.startsWith("box_template") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0h));
                arrayList2.add(10);
            }
            if (appAttachDownloadUI.f55902A.startsWith("box_flight_number") && appAttachDownloadUI.f55902A.endsWith(".txt")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0i));
                arrayList2.add(11);
            }
            if (appAttachDownloadUI.f55902A.startsWith("popup_scan") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0t));
                arrayList2.add(13);
            }
            if ((appAttachDownloadUI.f55902A.startsWith("fs_kw_main") && appAttachDownloadUI.f55902A.endsWith(".zip")) || appAttachDownloadUI.f55902A.startsWith("73.1.data")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0n));
                arrayList2.add(15);
            }
            if (appAttachDownloadUI.f55902A.startsWith("tsc") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0u));
                arrayList2.add(16);
            }
            if (appAttachDownloadUI.f55902A.startsWith("ocr") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0o));
                arrayList2.add(18);
            }
            if (appAttachDownloadUI.f55902A.startsWith("mv_default_video") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0p));
                arrayList2.add(19);
            }
            if (appAttachDownloadUI.f55902A.startsWith("mv_transition") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0r));
                arrayList2.add(21);
            }
            if (appAttachDownloadUI.f55902A.startsWith("mv_app_icon") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0q));
                arrayList2.add(22);
            }
            if (appAttachDownloadUI.f55902A.startsWith("TextState") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.c0v));
                arrayList2.add(20);
            }
            if (appAttachDownloadUI.f55902A.startsWith("select_text") && appAttachDownloadUI.f55902A.endsWith(".zip")) {
                arrayList.add(appAttachDownloadUI.getString(C0966R.string.n6j));
                arrayList2.add(23);
            }
        }
        C19748f fVar = new C19748f(appAttachDownloadUI);
        if (arrayList.size() == 0 && Util.isNullOrNil((String) null)) {
            return false;
        }
        C77407n nVar = new C77407n((Context) appAttachDownloadUI, 1, false);
        nVar.f225771i = new C73685g(appAttachDownloadUI, (String) null, arrayList, arrayList2, (String) null);
        nVar.f225782p = new C73715h(appAttachDownloadUI, fVar);
        nVar.f225761d = new C106689i(appAttachDownloadUI);
        if (arrayList2.contains(0)) {
            Log.m105918d("MicroMsg.AppAttachDownloadUI", "enhanceBottomSheet");
            if (appAttachDownloadUI.f55928X == null) {
                Log.m105918d("MicroMsg.AppAttachDownloadUI", "enhanceBottomSheet, openMaterialCollection is null");
            } else {
                C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
                if (l0Var == null) {
                    Log.m105928w("MicroMsg.AppAttachDownloadUI", "enhanceBottomSheet, openMaterialService is null");
                } else {
                    C98783b bVar = C98783b.ATTACH;
                    if (!l0Var.mo158321RB(bVar)) {
                        Log.m105924i("MicroMsg.AppAttachDownloadUI", "tryEnhanceBottomSheet, openMaterialService is not enabled");
                    } else if (!l0Var.mo158325ic(nVar, appAttachDownloadUI.f55928X)) {
                        Log.m105924i("MicroMsg.AppAttachDownloadUI", "tryEnhanceBottomSheet, not need enhance");
                    } else {
                        C107885g0 g0Var = appAttachDownloadUI.f55930Z;
                        if (g0Var != null) {
                            g0Var.dead();
                        }
                        appAttachDownloadUI.f55930Z = l0Var.mo158322RD(bVar, appAttachDownloadUI, nVar, appAttachDownloadUI.f55928X, (C107879e0) null, (C45944i0) null);
                    }
                }
            }
        }
        Log.m105918d("MicroMsg.AppAttachDownloadUI", "showAlert, set BottomSheet");
        appAttachDownloadUI.f55941p0 = nVar;
        nVar.mo107573q();
        return false;
    }
}
