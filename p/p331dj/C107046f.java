package p331dj;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.events.MediaLeakEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: dj.f */
public class C107046f {

    /* renamed from: a */
    public static int f320450a;

    /* renamed from: b */
    public static int f320451b;

    /* renamed from: c */
    public static HashMap<Integer, String> f320452c = new HashMap<>();

    /* renamed from: d */
    public static int f320453d = 0;

    /* renamed from: e */
    public static int f320454e = 0;

    /* renamed from: f */
    public static HashMap<Integer, String> f320455f = new HashMap<>();

    /* renamed from: g */
    public static int f320456g = 0;

    /* renamed from: h */
    public static int f320457h = 0;

    /* renamed from: i */
    public static HashMap<Integer, String> f320458i = new HashMap<>();

    /* renamed from: a */
    public static void m144906a() {
        MediaLeakEvent mediaLeakEvent = new MediaLeakEvent();
        if (f320450a - f320451b > 1) {
            MediaLeakEvent.C104594a aVar = mediaLeakEvent.f310003d;
            aVar.f310004a = true;
            aVar.f310005b = f320452c.size();
        }
        if (f320456g - f320457h > 1) {
            MediaLeakEvent.C104594a aVar2 = mediaLeakEvent.f310003d;
            aVar2.f310006c = true;
            aVar2.f310007d = f320458i.size();
        }
        if (f320453d - f320454e > 1) {
            MediaLeakEvent.C104594a aVar3 = mediaLeakEvent.f310003d;
            aVar3.f310008e = true;
            aVar3.f310009f = f320455f.size();
        }
        MediaLeakEvent.C104594a aVar4 = mediaLeakEvent.f310003d;
        if (aVar4.f310006c || aVar4.f310004a || aVar4.f310008e) {
            Log.m105921e("MicroMsg.MMAudioManager", "check media leak audio[%b %d] mediaplayer[%b %d] audioRecordLeak [%b %d]", Boolean.valueOf(aVar4.f310004a), Integer.valueOf(mediaLeakEvent.f310003d.f310005b), Boolean.valueOf(mediaLeakEvent.f310003d.f310006c), Integer.valueOf(mediaLeakEvent.f310003d.f310007d), Boolean.valueOf(mediaLeakEvent.f310003d.f310008e), Integer.valueOf(mediaLeakEvent.f310003d.f310009f));
            mediaLeakEvent.publish();
        }
    }

    /* renamed from: b */
    public static String m144907b() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("AudioTrack: ");
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("leak: ");
        stringBuffer.append(f320452c.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f320450a);
        stringBuffer.append("release: ");
        stringBuffer.append(f320451b);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("--------leak map-----------");
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        if (!f320452c.isEmpty()) {
            for (String append : f320452c.values()) {
                stringBuffer.append(append);
                stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
            }
        }
        stringBuffer.append("MediaPlayer: ");
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("leak: ");
        stringBuffer.append(f320458i.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f320456g);
        stringBuffer.append("release: ");
        stringBuffer.append(f320457h);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("--------leak map-----------");
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        if (!f320458i.isEmpty()) {
            for (String append2 : f320458i.values()) {
                stringBuffer.append(append2);
                stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
            }
        }
        stringBuffer.append("AudioRecord: ");
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("leak: ");
        stringBuffer.append(f320455f.size());
        stringBuffer.append("init: ");
        stringBuffer.append(f320453d);
        stringBuffer.append("release: ");
        stringBuffer.append(f320453d);
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        stringBuffer.append("--------leak map-----------");
        stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
        if (!f320455f.isEmpty()) {
            for (String append3 : f320455f.values()) {
                stringBuffer.append(append3);
                stringBuffer.append(APLogFileUtil.SEPARATOR_LINE);
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        Log.m105921e("MicroMsg.MMAudioManager", "leak? %s", stringBuffer2);
        return stringBuffer2;
    }
}
