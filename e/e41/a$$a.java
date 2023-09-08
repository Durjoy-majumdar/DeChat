package e41;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.file.XVFSFile;
import j41.C117298c;
import java.util.List;
import java.util.Map;
import k31.C117373a;
import k41.C117389a;
import m41.C117534a;
import op3.C117877b;
import op3.C117879d;
import op3.C117881f;
import p31.C117921a;

public final /* synthetic */ class a$$a implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C116692a f349959d;

    public /* synthetic */ a$$a(C116692a aVar) {
        this.f349959d = aVar;
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        C116692a aVar = this.f349959d;
        aVar.getClass();
        switch (message2.what) {
            case 1010:
                try {
                    C117877b bVar = (C117877b) message2.obj;
                    long longValue = ((Long) bVar.mo182596a(0)).longValue();
                    String str = (String) bVar.mo182596a(1);
                    if (aVar.f349957d != null) {
                        C117373a xx02 = C117373a.xx0();
                        C117921a.C117923b a = C117921a.m166309a();
                        a.f352459b = "video_play";
                        xx02.Gx0(longValue, a.mo182704a());
                        C117298c.m165377a().mo181967b(longValue, "video_play", (Object) null, (Map<String, Object>) null);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("MultiEventMonitor", "[handleMessage] MSG_VIDEO_PLAY throw Exception : " + e.getMessage() + ", stackTrace : " + C117534a.m165782e(e.getStackTrace()));
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
            case 1011:
                try {
                    C117877b bVar2 = (C117877b) message2.obj;
                    long longValue2 = ((Long) bVar2.mo182596a(0)).longValue();
                    String str2 = (String) bVar2.mo182596a(1);
                    if (aVar.f349957d != null) {
                        C117373a xx03 = C117373a.xx0();
                        C117921a.C117923b a2 = C117921a.m166309a();
                        a2.f352459b = "video_pause";
                        xx03.Gx0(longValue2, a2.mo182704a());
                        C117298c.m165377a().mo181967b(longValue2, "video_pause", (Object) null, (Map<String, Object>) null);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e2) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("MultiEventMonitor", "[handleMessage] MSG_VIDEO_PAUSE throw Exception : " + e2.getMessage() + ", stackTrace : " + C117534a.m165782e(e2.getStackTrace()));
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
            case 1012:
                try {
                    C117877b bVar3 = (C117877b) message2.obj;
                    long longValue3 = ((Long) bVar3.mo182596a(0)).longValue();
                    String str3 = (String) bVar3.mo182596a(1);
                    if (aVar.f349957d != null) {
                        C117373a xx04 = C117373a.xx0();
                        C117921a.C117923b a3 = C117921a.m166309a();
                        a3.f352459b = "video_stop";
                        xx04.Gx0(longValue3, a3.mo182704a());
                        C117298c.m165377a().mo181967b(longValue3, "video_stop", (Object) null, (Map<String, Object>) null);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e3) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("MultiEventMonitor", "[handleMessage] MSG_VIDEO_STOP throw Exception : " + e3.getMessage() + ", stackTrace : " + C117534a.m165782e(e3.getStackTrace()));
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
            case 1013:
                try {
                    C117879d dVar = (C117879d) message2.obj;
                    aVar.mo180703a((String) dVar.mo182596a(0), (Map) dVar.mo182596a(1), (List) dVar.mo182596a(2), ((Long) dVar.mo182596a(3)).longValue());
                    break;
                } catch (Exception e4) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("MultiEventMonitor", "[handleMessage] MSG_CGI_REQ throw Exception : " + e4.getMessage() + ", stackTrace : " + C117534a.m165782e(e4.getStackTrace()));
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
            case 1014:
                try {
                    C117881f fVar = (C117881f) message2.obj;
                    aVar.mo180704b((String) fVar.mo182596a(0), ((Integer) fVar.mo182596a(1)).intValue(), (String) fVar.mo182596a(2), (Map) fVar.mo182596a(3), (List) fVar.mo182596a(4), ((Long) fVar.mo182596a(5)).longValue());
                    break;
                } catch (Exception e5) {
                    if (!C117534a.m165786i()) {
                        Log.m105920e("MultiEventMonitor", "[handleMessage] MSG_CGI_RESP throw Exception : " + e5.getMessage() + ", stackTrace : " + C117534a.m165782e(e5.getStackTrace()));
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
        }
        return false;
    }
}
