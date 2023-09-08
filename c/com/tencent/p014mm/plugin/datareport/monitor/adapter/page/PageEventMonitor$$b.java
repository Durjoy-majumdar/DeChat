package com.tencent.p014mm.plugin.datareport.monitor.adapter.page;

import a41.C112756b;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.file.XVFSFile;
import k31.C117373a;
import k41.C117389a;
import m41.C117534a;
import op3.C117877b;
import op3.C117878c;
import s31.C118264c;
import u31.C118568a;

/* renamed from: com.tencent.mm.plugin.datareport.monitor.adapter.page.PageEventMonitor$$b */
public final /* synthetic */ class PageEventMonitor$$b implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ PageEventMonitor f345806d;

    public /* synthetic */ PageEventMonitor$$b(PageEventMonitor pageEventMonitor) {
        this.f345806d = pageEventMonitor;
    }

    public final boolean handleMessage(Message message) {
        PageEventMonitor pageEventMonitor = this.f345806d;
        pageEventMonitor.getClass();
        long j = 0;
        switch (message.what) {
            case 1001:
                try {
                    Object obj = message.obj;
                    if (obj != null) {
                        j = ((Long) obj).longValue();
                    }
                    pageEventMonitor.mo175191N(j);
                    break;
                } catch (Exception e) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.PageEventMonitor", "[handleMessage] MSG_APP_IN throw Exception : " + e.getMessage() + ", stackTrace : " + C117534a.m165782e(e.getStackTrace()));
                        StringBuilder sb = new StringBuilder();
                        sb.append(e.getMessage());
                        sb.append(XVFSFile.PATH_SEPARATOR);
                        sb.append(C117534a.m165782e(e.getStackTrace()));
                        C117389a.m165528b(sb.toString());
                        break;
                    } else {
                        throw e;
                    }
                }
            case 1002:
                try {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        j = ((Long) obj2).longValue();
                    }
                    pageEventMonitor.mo175192O(j);
                    break;
                } catch (Exception e2) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.PageEventMonitor", "[handleMessage] MSG_APP_OUT throw Exception : " + e2.getMessage() + ", stackTrace : " + C117534a.m165782e(e2.getStackTrace()));
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(e2.getMessage());
                        sb4.append(XVFSFile.PATH_SEPARATOR);
                        sb4.append(C117534a.m165782e(e2.getStackTrace()));
                        C117389a.m165528b(sb4.toString());
                        break;
                    } else {
                        throw e2;
                    }
                }
            case 1003:
                try {
                    Object obj3 = message.obj;
                    if (obj3 != null) {
                        C117877b bVar = (C117877b) obj3;
                        pageEventMonitor.mo175199V((C112756b) bVar.mo182596a(0), ((Long) bVar.mo182596a(1)).longValue());
                        break;
                    }
                } catch (Exception e3) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.PageEventMonitor", "[handleMessage] MSG_PAGE_RESUME throw Exception : " + e3.getMessage() + ", stackTrace : " + C117534a.m165782e(e3.getStackTrace()));
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(e3.getMessage());
                        sb5.append(XVFSFile.PATH_SEPARATOR);
                        sb5.append(C117534a.m165782e(e3.getStackTrace()));
                        C117389a.m165528b(sb5.toString());
                        break;
                    } else {
                        throw e3;
                    }
                }
                break;
            case 1004:
                try {
                    Object obj4 = message.obj;
                    if (obj4 != null) {
                        C117877b bVar2 = (C117877b) obj4;
                        pageEventMonitor.mo175198U((C112756b) bVar2.mo182596a(0), ((Long) bVar2.mo182596a(1)).longValue());
                        break;
                    }
                } catch (Exception e4) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.PageEventMonitor", "[handleMessage] MSG_PAGE_DESTORY throw Exception : " + e4.getMessage() + ", stackTrace : " + C117534a.m165782e(e4.getStackTrace()));
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(e4.getMessage());
                        sb6.append(XVFSFile.PATH_SEPARATOR);
                        sb6.append(C117534a.m165782e(e4.getStackTrace()));
                        C117389a.m165528b(sb6.toString());
                        break;
                    } else {
                        throw e4;
                    }
                }
                break;
            case 1005:
                try {
                    Object obj5 = message.obj;
                    if (obj5 != null) {
                        C117878c cVar = (C117878c) obj5;
                        pageEventMonitor.mo175197T(((Integer) cVar.mo182596a(1)).intValue(), (C112756b) cVar.mo182596a(0), ((Long) cVar.mo182596a(2)).longValue());
                        break;
                    }
                } catch (Exception e5) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.PageEventMonitor", "[handleMessage] MSG_FRAGMENT_EVENT throw Exception : " + e5.getMessage() + ", stackTrace : " + C117534a.m165782e(e5.getStackTrace()));
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(e5.getMessage());
                        sb7.append(XVFSFile.PATH_SEPARATOR);
                        sb7.append(C117534a.m165782e(e5.getStackTrace()));
                        C117389a.m165528b(sb7.toString());
                        break;
                    } else {
                        throw e5;
                    }
                }
                break;
            case 1006:
                try {
                    Object obj6 = message.obj;
                    if (obj6 != null) {
                        C112756b bVar3 = (C112756b) obj6;
                        C118568a.m167234a(bVar3);
                        C118264c cVar2 = C117373a.xx0().f351384j;
                        if (cVar2 != null) {
                            cVar2.mo183045a(bVar3);
                            break;
                        }
                    }
                } catch (Exception e6) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.PageEventMonitor", "[handleMessage] MSG_CLEAR_PAGE_DATA_STORAGE throw Exception : " + e6.getMessage() + ", stackTrace : " + C117534a.m165782e(e6.getStackTrace()));
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(e6.getMessage());
                        sb8.append(XVFSFile.PATH_SEPARATOR);
                        sb8.append(C117534a.m165782e(e6.getStackTrace()));
                        C117389a.m165528b(sb8.toString());
                        break;
                    } else {
                        throw e6;
                    }
                }
                break;
        }
        return false;
    }
}
