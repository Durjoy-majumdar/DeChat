package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19569p0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.QBFileMenuBottomSheetHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import k92.C108976d;
import ke3.C88144b;
import p262wm.C22921c;
import p407zo.C23546f;
import p407zo.C23547h;
import p763ym.C79138l;
import p823sg.C90193h;
import qo3.C77407n;
import wc3.C102428i;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$t */
public class AppAttachNewDownloadUI$$t implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppAttachNewDownloadUI f56062d;

    public AppAttachNewDownloadUI$$t(AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f56062d = appAttachNewDownloadUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        String num = Integer.toString(hashCode());
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f56062d;
        ((C23547h) C86312j.m106911c(C23547h.class)).mo36799xH(num, appAttachNewDownloadUI.f55987C, MD5Util.getMD5String(appAttachNewDownloadUI.f55985A), 301, this.f56062d.mo26126S7(), this.f56062d.mo25335P6());
        AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f56062d;
        boolean z = appAttachNewDownloadUI2.f55995K;
        if (z) {
            if (appAttachNewDownloadUI2.f56043x0 == null) {
                C108976d dVar = appAttachNewDownloadUI2.f56016Y;
                AbsHandOffFile absHandOffFile = appAttachNewDownloadUI2.f56014X;
                String str = appAttachNewDownloadUI2.f55987C;
                String str2 = appAttachNewDownloadUI2.f56046z;
                appAttachNewDownloadUI2.f56043x0 = ((C23546f) C86312j.m106911c(C23546f.class)).mo36797oP(appAttachNewDownloadUI2, new C19569p0.C19570a(dVar, absHandOffFile, str, str2, appAttachNewDownloadUI2.f55985A, C90193h.m112876d(str2), ((C22921c) C86312j.m106911c(C22921c.class)).mo35892nR(appAttachNewDownloadUI2.f55987C), 0, false, appAttachNewDownloadUI2.f56037s), appAttachNewDownloadUI2);
            }
            C19569p0 p0Var = appAttachNewDownloadUI2.f56043x0;
            AppAttachNewDownloadUI$$a appAttachNewDownloadUI$$a = new AppAttachNewDownloadUI$$a(appAttachNewDownloadUI2);
            QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper = (QBFileMenuBottomSheetHelper) p0Var;
            qBFileMenuBottomSheetHelper.getClass();
            qBFileMenuBottomSheetHelper.f55285d = appAttachNewDownloadUI$$a;
            ((QBFileMenuBottomSheetHelper) appAttachNewDownloadUI2.f56043x0).mo25344b();
            appAttachNewDownloadUI2.mo26122N7(((QBFileMenuBottomSheetHelper) appAttachNewDownloadUI2.f56043x0).f55286e);
            C19569p0 p0Var2 = appAttachNewDownloadUI2.f56043x0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            appAttachNewDownloadUI2.mo26116H7(arrayList, arrayList2);
            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                AppAttachNewDownloadUI$$e appAttachNewDownloadUI$$e = new AppAttachNewDownloadUI$$e(arrayList2, arrayList);
                QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper2 = (QBFileMenuBottomSheetHelper) p0Var2;
                qBFileMenuBottomSheetHelper2.getClass();
                qBFileMenuBottomSheetHelper2.f55288g = appAttachNewDownloadUI$$e;
                qBFileMenuBottomSheetHelper2.f55289h = new AppAttachNewDownloadUI$$f(appAttachNewDownloadUI2);
            }
            C77407n nVar = ((QBFileMenuBottomSheetHelper) appAttachNewDownloadUI2.f56043x0).f55286e;
            if (nVar != null) {
                nVar.mo107573q();
            }
            ((QBFileMenuBottomSheetHelper) appAttachNewDownloadUI2.f56043x0).f55286e.f225799x = new C19759t(appAttachNewDownloadUI2);
            return false;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (z) {
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = appAttachNewDownloadUI2.f56037s;
            exDeviceHaveBindNetworkDeviceEvent.publish();
            int i = appAttachNewDownloadUI2.f56023d;
            if (i == 0) {
                arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.i48));
                arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.f360349c14));
                arrayList4.add(20);
                arrayList4.add(23);
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                    arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.c1e));
                    arrayList4.add(24);
                }
            } else if (i != 6) {
                arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.i48));
                arrayList4.add(20);
            } else {
                arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.i48));
                arrayList4.add(20);
                C108976d dVar2 = appAttachNewDownloadUI2.f56016Y;
                if (dVar2 != null && dVar2.mo67893A()) {
                    arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.cak));
                    arrayList4.add(29);
                }
                arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.f360349c14));
                arrayList4.add(23);
                Long a = C102428i.m135144a(appAttachNewDownloadUI2.f55987C);
                if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a || (a != null && ((C79138l) C86312j.m106911c(C79138l.class)).Bl0(appAttachNewDownloadUI2.getContext(), a.longValue()))) {
                    arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.c1e));
                    arrayList4.add(24);
                }
                C88144b.m109788f("favorite");
                arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.f361137hk2));
                arrayList4.add(22);
                if (((C92331c) C86312j.m106911c(C92331c.class)).mo58357LH() && appAttachNewDownloadUI2.f56014X != null && AbsHandOffFile.isSupportOpenFile(appAttachNewDownloadUI2.f55987C)) {
                    arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.cvp));
                    arrayList4.add(217);
                }
                arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.cgm));
                arrayList4.add(Integer.valueOf(JsApiCheckIsSupportFaceDetect.CTRL_INDEX));
            }
        } else {
            C88144b.m109788f("favorite");
            arrayList3.add(appAttachNewDownloadUI2.getString(C0966R.string.f361137hk2));
            arrayList4.add(22);
        }
        appAttachNewDownloadUI2.mo26116H7(arrayList3, arrayList4);
        C19760u uVar = new C19760u(appAttachNewDownloadUI2);
        if (arrayList3.size() == 0 && Util.isNullOrNil((String) null)) {
            return false;
        }
        C77407n nVar2 = new C77407n((Context) appAttachNewDownloadUI2, 1, false);
        nVar2.f225771i = new C73870v(appAttachNewDownloadUI2, (String) null, arrayList3, arrayList4, (String) null);
        nVar2.f225782p = new C74331w(appAttachNewDownloadUI2, uVar);
        nVar2.f225761d = new C106702x(appAttachNewDownloadUI2);
        if (arrayList4.contains(20)) {
            appAttachNewDownloadUI2.mo26122N7(nVar2);
        }
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "showAlert, set BottomSheet");
        appAttachNewDownloadUI2.f56013W0 = nVar2;
        nVar2.mo107573q();
        return false;
    }
}
