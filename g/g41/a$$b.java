package g41;

import a41.C112756b;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.file.XVFSFile;
import java.util.List;
import java.util.Map;
import k41.C117389a;
import m41.C117534a;
import op3.C117880e;

public final /* synthetic */ class a$$b implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C116920a f350357d;

    public /* synthetic */ a$$b(C116920a aVar) {
        this.f350357d = aVar;
    }

    public final boolean handleMessage(Message message) {
        C116920a aVar = this.f350357d;
        aVar.getClass();
        switch (message.what) {
            case 1007:
                try {
                    Object obj = message.obj;
                    if (obj != null) {
                        C117880e eVar = (C117880e) obj;
                        aVar.mo180890N((List) eVar.mo182596a(0), (C112756b) eVar.mo182596a(1), (Map) eVar.mo182596a(2), (List) eVar.mo182596a(3), ((Long) eVar.mo182596a(4)).longValue());
                        break;
                    }
                } catch (Exception e) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.ViewEventMonitor", "[handleMessage] MSG_VIEW_CLICK throw Exception : " + e.getMessage() + ", stackTrace : " + C117534a.m165782e(e.getStackTrace()));
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
                break;
            case 1008:
                try {
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        C117880e eVar2 = (C117880e) obj2;
                        aVar.mo180891O((List) eVar2.mo182596a(0), (C112756b) eVar2.mo182596a(1), (Map) eVar2.mo182596a(2), (List) eVar2.mo182596a(3), ((Long) eVar2.mo182596a(4)).longValue());
                        break;
                    }
                } catch (Exception e2) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.ViewEventMonitor", "[handleMessage] MSG_VIEW_EXP throw Exception : " + e2.getMessage() + ", stackTrace : " + C117534a.m165782e(e2.getStackTrace()));
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
                break;
            case 1009:
                try {
                    Object obj3 = message.obj;
                    if (obj3 != null) {
                        C117880e eVar3 = (C117880e) obj3;
                        aVar.mo180892P((List) eVar3.mo182596a(0), (C112756b) eVar3.mo182596a(1), (Map) eVar3.mo182596a(2), (List) eVar3.mo182596a(3), ((Long) eVar3.mo182596a(4)).longValue());
                        break;
                    }
                } catch (Exception e3) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("Amoeba.ViewEventMonitor", "[handleMessage] MSG_VIEW_UNEXP throw Exception : " + e3.getMessage() + ", stackTrace : " + C117534a.m165782e(e3.getStackTrace()));
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
        }
        return false;
    }
}
